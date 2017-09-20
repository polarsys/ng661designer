/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.DocumentRoot;
import org.polarsys.ng661designer.dsl.part2.gen.ImportType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyType;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationType;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationTypes;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlStateType;

/**
 * Services on NG661Designer.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerUtil {

	public static final String CHILD_ELEMENTS_FEATURE = "childElements";
	public static final String COMPOSITIONS_FEATURE = "compositions";
	public static final String VALUES_FEATURE = "values";

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if the feature is a composition feature.
	 */
	public static boolean isWidgetCompositionCase(EStructuralFeature feature) {
		return COMPOSITIONS_FEATURE.equals(feature.getName());
	}

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if feature is a representation feature.
	 */
	public static boolean isRepresentationCase(EStructuralFeature feature) {
		return Part2Package.eINSTANCE.getRepresentationType_Group().equals(feature) || CHILD_ELEMENTS_FEATURE.equals(feature.getName());
	}

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if feature is a representation feature.
	 */
	public static boolean isRepresentationCase(EClass eClass) {
		return Part2Package.eINSTANCE.getRepresentationType().equals(eClass) || Part2Package.eINSTANCE.getRepresentationTypes().isSuperTypeOf(eClass);
	}

	/**
	 * @param component
	 *            ComponentDefinitionType
	 * @param name
	 *            Property name
	 * @return the property named "name" in component
	 */
	public static PropertyType getProperty(ComponentDefinitionType component, String name) {
		if (component != null && component.getInterface() != null) {
			for (PropertyType propertyType : component.getInterface().getProperty()) {
				if (name.equals(propertyType.getName())) {
					return propertyType;
				}
			}
		}
		return null;
	}

	/**
	 * @param object
	 *            EObject
	 * @param componentName
	 *            referenced component name
	 * @return the ComponentDefinitionType named "name" in component imports.
	 */
	public static ComponentDefinitionType getWidgetCompositionRepresentation(EObject object, String componentName) {
		// get ComponentDefinitionType, container of object
		ComponentDefinitionType component = getComponentDefinition(object);
		if (component != null) {
			// search component in imports.
			for (ImportType importType : component.getImport()) {
				DocumentRoot root = getDocumentRootImportResource(component, importType);
				if (root != null && root.getComponentDefinition() != null && componentName.equals(root.getComponentDefinition().getName())) {
					return root.getComponentDefinition();
				}
			}
		}
		return null;
	}

	/**
	 * @param eObject
	 *            EObject
	 * @param importType
	 *            ImportType
	 * @return DocumentRoot from import resource.
	 */
	public static DocumentRoot getDocumentRootImportResource(EObject eObject, ImportType importType) {
		// Load resource in resource set
		ResourceSet resourceSet = eObject.eResource().getResourceSet();
		URI newURI = getImportResourceURI(eObject, importType);
		Resource newResource = resourceSet.getResource(newURI, true);
		// return resource document root
		if (!newResource.getContents().isEmpty() && newResource.getContents().get(0) instanceof DocumentRoot) {
			return (DocumentRoot) newResource.getContents().get(0);
		}
		return null;
	}

	/**
	 * @param eObject
	 *            EObject
	 * @param importType
	 *            ImportType
	 * @return import resource URI
	 */
	public static URI getImportResourceURI(EObject eObject, ImportType importType) {
		URI uri = eObject.eResource().getURI();
		String newURI = uri.toPlatformString(true).replace(uri.lastSegment(), importType.getFile());
		return URI.createPlatformResourceURI(newURI, true);
	}

	/**
	 * @param object
	 *            EObject
	 * @return get ComponentDefinitionType from object eContainers
	 */
	public static ComponentDefinitionType getComponentDefinition(EObject object) {
		ComponentDefinitionType component = null;
		if (object instanceof RepresentationType && object.eContainer() instanceof ComponentDefinitionType) {
			component = (ComponentDefinitionType) object.eContainer();
		}
		if (object instanceof RepresentationTypes) {
			while (!(object.eContainer() instanceof ComponentDefinitionType)) {
				object = object.eContainer();
			}
			if (object.eContainer() instanceof ComponentDefinitionType) {
				component = (ComponentDefinitionType) object.eContainer();
			}
		}
		return component;
	}
	
	public static ScxmlScxmlType getScxmlScxmlTypeContainer(ScxmlStateType type) {
		EObject container = type.eContainer();
		while (container != null) {
			if (container instanceof ScxmlScxmlType) {
				return (ScxmlScxmlType) container;
			}
			container = container.eContainer();
		}
		return null;
	}
}
