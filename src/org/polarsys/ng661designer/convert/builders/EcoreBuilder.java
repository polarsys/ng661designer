/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.convert.builders;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.ecore.importer.XSDImporter;

import com.google.common.collect.Lists;

import org.polarsys.ng661designer.convert.Activator;

/**
 * Builder for ecore resource.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class EcoreBuilder {

	/**
	 * Update ecore resource to replace feature map entries by simple composed
	 * references.
	 * 
	 * @param resource
	 *            Resource
	 */
	public void updateEcoreResource(Resource resource) {
		// iterate on all EClass to replace feature map entries
		List<EClass> allEclasses = Lists.newArrayList();
		// get all eclasses
		for (Iterator<EObject> iterator = resource.getAllContents(); iterator.hasNext();) {
			EObject type = iterator.next();
			if (type instanceof EClass && !allEclasses.contains(type)) {
				allEclasses.add((EClass) type);
			}
		}

		// update eClasses
		for (EClass eClass : allEclasses) {
			if (BuilderUtil.DOCUMENT_ROOT.equals(eClass.getName())) {
				updateDocumentRoot(eClass);
			} else {
				updateEClassWithFeatureMapEntry(eClass);
			}
		}
	}

	/**
	 * Manager Document Root.
	 * 
	 * @param eClass
	 *            EClass
	 */
	protected void updateDocumentRoot(EClass eClass) {
		for (EReference reference : eClass.getEReferences()) {
			if (reference.isContainment() && reference.isTransient() && !BuilderUtil.ESTRING_TO_STRING_MAP_ENTRY_ECLASS.equals(reference.getEType().getName())) {
				BuilderUtil.updateReferenceAsComposition(reference);
			}
		}
	}

	/**
	 * Update Eclass : replace feature maps entries.
	 * 
	 * @param eClass
	 *            EClass
	 */
	protected void updateEClassWithFeatureMapEntry(EClass eClass) {
		// get all feature map entries except any
		List<EAttribute> featureMapEntryAttributes = BuilderUtil.getFeatureMapEntryAttribute(eClass);
		for (EAttribute attribute : featureMapEntryAttributes) {
			updateAllReferences(eClass, attribute);
		}

		// manage any faeture maps
		List<EAttribute> featureMapEntryAnyAttributes = BuilderUtil.getFeatureMapEntryAnyAttribute(eClass);
		for (EAttribute eAttribute : featureMapEntryAnyAttributes) {
			removeUsedFeatureMapEntryGroup(eAttribute, featureMapEntryAttributes);
		}

		// remove feature map attributes
		eClass.getEStructuralFeatures().removeAll(featureMapEntryAttributes);
		// remove annotations in EClass
		eClass.getEAnnotations().removeIf(new Predicate<EAnnotation>() {

			@Override
			public boolean test(EAnnotation annotation) {
				return BuilderUtil.EXTENDED_META_DATA_KEY.equals(annotation.getSource()) && !BuilderUtil.MIXED_VALUE.equals(annotation.getDetails().get(BuilderUtil.KIND_KEY));
			}
		});
	}

	/**
	 * Check if feature map entry "any" is used: in this case, not remove it.
	 * 
	 * @param attribute
	 *            EAttribute
	 * @param featureMapEntryAttributes
	 *            List<EAttribute>
	 */
	public void removeUsedFeatureMapEntryGroup(EStructuralFeature attribute, List<EAttribute> featureMapEntryAttributes) {
		String groupValue = BuilderUtil.getFeatureMapEntryGroupAttribute(attribute);
		List<EAttribute> toRemove = Lists.newArrayList();
		if (groupValue != null) {
			for (EAttribute eAttribute : featureMapEntryAttributes) {
				String nameAttribute = BuilderUtil.getFeatureMapEntryNameAttribute(eAttribute);
				if (groupValue.contains(nameAttribute)) {
					toRemove.add(eAttribute);
				}
			}
		}
		for (EAttribute eAttribute : featureMapEntryAttributes) {
			String kindValue = BuilderUtil.getFeatureMapEntryKindAttribute(attribute);
			if (kindValue != null && BuilderUtil.ELEMENT_WILDCARD_VALUE.equals(kindValue)) {
				toRemove.add(eAttribute);
			}
		}
		featureMapEntryAttributes.removeAll(toRemove);
	}

	/**
	 * Update all references as derived.
	 * 
	 * @param eClass
	 *            {@link EClass}
	 * @param attribute
	 *            {@link EAttribute}
	 */
	protected void updateAllReferencesAsDerived(EClass eClass, EStructuralFeature attribute) {
		String nameAttribute = BuilderUtil.getFeatureMapEntryKindAttribute(attribute);
		if (nameAttribute != null) {
			// update all feature map references
			for (EReference reference : eClass.getEReferences()) {
				if (BuilderUtil.hasEAnnotationNameAttribute(nameAttribute, reference)) {
					// update reference into composition
					BuilderUtil.updateReferenceAsDerived(reference);
				}
			}
		}
	}

	/**
	 * Update feature map entries as composition.
	 * 
	 * @param eClass
	 *            {@link EClass}
	 * @param attribute
	 *            {@link EAttribute}
	 */
	protected void updateAllReferences(EClass eClass, EStructuralFeature attribute) {
		String nameAttribute = BuilderUtil.getFeatureMapEntryKindAttribute(attribute);
		if (nameAttribute != null) {
			// update all feature map references
			for (EReference reference : eClass.getEReferences()) {
				if (BuilderUtil.hasEAnnotationNameAttribute(nameAttribute, reference)) {
					// update reference into composition
					BuilderUtil.updateReferenceAsComposition(reference);
				}
			}
		}
	}

	/**
	 * Remove unnecessary attribute meta datas
	 * 
	 * @param ePackage
	 *            EPackage
	 */
	public void removeAttributeMetaData(EPackage ePackage) {
		List<EAnnotation> toRemove = Lists.newArrayList();
		for (Iterator<EObject> iterator = ePackage.eAllContents(); iterator.hasNext();) {
			EObject eObject = (EObject) iterator.next();
			if (eObject instanceof EAttribute) {
				EAttribute attribute = (EAttribute) eObject;
				String kindAttribute = BuilderUtil.getFeatureMapEntryKindAttribute(attribute);
				if (BuilderUtil.ATTRIBUTE_KEY.equals(kindAttribute)) {
					toRemove.add(attribute.getEAnnotation(BuilderUtil.EXTENDED_META_DATA_KEY));
				}
			}
		}
		for (EAnnotation eAnnotation : toRemove) {
			((EModelElement) eAnnotation.eContainer()).getEAnnotations().remove(eAnnotation);
		}

	}

	/**
	 * Convert xsdFile to ecore files.
	 * 
	 * @param destinationFolder
	 *            IResource
	 * @param xsdFile
	 *            IFile
	 * @return resource set with all ecore resources.
	 */
	public ResourceSet generateEcoreFiles(IResource destinationFolder, IFile xsdFile) {
		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			XSDImporter xsdImporter = new XSDImporter();
			BasicMonitor monitor = new BasicMonitor();
			xsdImporter.setModelFile(xsdFile);
			xsdImporter.setGenModelContainerPath(destinationFolder.getFullPath());
			xsdImporter.setGenModelFileName("default.genmodel");
			xsdImporter.computeEPackages(monitor);
			xsdImporter.adjustEPackages(monitor);
			for (EPackage ePackage : xsdImporter.getEPackages()) {
				xsdImporter.addToResource(ePackage, resourceSet);
			}
			for (Resource ecoreResource : resourceSet.getResources()) {
				BuilderUtil.saveResource(ecoreResource);
			}

		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error during xsd to ecore conversion", e));
		}
		return resourceSet;
	}

}
