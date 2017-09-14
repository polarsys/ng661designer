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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import org.polarsys.ng661designer.convert.Activator;

/**
 * Utils class for builders.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class BuilderUtil {

	/**
	 * EFeature Map Entry constants
	 */
	public static final String EXTENDED_META_DATA_KEY = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
	public static final String EFEATURE_MAP_ENTRY = "EFeatureMapEntry";
	public static final String ESTRING_TO_STRING_MAP_ENTRY_ECLASS = "EStringToStringMapEntry";
	public static final String ANY_FEATURE = "any";
	public static final String KIND_KEY = "kind";
	public static final String GROUP_KEY = "group";
	public static final String NAME_KEY = "name";
	public static final String ATTRIBUTE_KEY = "attribute";
	public static final String MIXED_VALUE = "mixed";
	public static final String ELEMENT_WILDCARD_VALUE = "elementWildcard";
	public static final String DOCUMENT_ROOT = "DocumentRoot";

	/**
	 * Update reference as composition.
	 * 
	 * @param reference
	 *            EReference
	 */
	public static void updateReferenceAsComposition(EReference reference) {
		reference.setChangeable(true);
		reference.setContainment(true);
		reference.setDerived(false);
		reference.setOrdered(true);
		reference.setResolveProxies(true);
		reference.setTransient(false);
		reference.setUnique(true);
		reference.setUnsettable(false);
		reference.setVolatile(false);
		reference.getEAnnotations().clear();
	}

	/**
	 * Update reference as derived reference.
	 * 
	 * @param reference
	 *            EReference
	 */
	public static void updateReferenceAsDerived(EReference reference) {
		reference.setChangeable(true);
		reference.setContainment(false);
		reference.setDerived(true);
		reference.setOrdered(true);
		reference.setResolveProxies(true);
		reference.setTransient(true);
		reference.setUnique(true);
		reference.setUnsettable(true);
		reference.setVolatile(false);
		reference.getEAnnotations().clear();
	}

	/**
	 * @param eClass
	 *            EClass
	 * @return all feature map entry attributes except any.
	 */
	public static List<EAttribute> getFeatureMapEntryAttribute(EClass eClass) {
		List<EAttribute> result = new ArrayList<>();
		for (EAttribute attribute : eClass.getEAttributes()) {
			if (attribute.getEType() instanceof EDataType && ((EDataType) attribute.getEType()).getName().equals(EFEATURE_MAP_ENTRY) && !attribute.getName().contains(ANY_FEATURE)) {
				result.add(attribute);
			}
		}
		return result;
	}

	/**
	 * @param eClass
	 *            EClass
	 * @return all feature map entry attributes named *any*.
	 */
	public static List<EAttribute> getFeatureMapEntryAnyAttribute(EClass eClass) {
		List<EAttribute> result = new ArrayList<>();
		for (EAttribute attribute : eClass.getEAttributes()) {
			if (attribute.getEType() instanceof EDataType && ((EDataType) attribute.getEType()).getName().equals(EFEATURE_MAP_ENTRY) && attribute.getName().contains(ANY_FEATURE)) {
				result.add(attribute);
			}
		}
		return result;
	}

	/**
	 * @param attribute
	 *            EAttribute
	 * @return kind detail value.
	 */
	public static String getFeatureMapEntryKindAttribute(EStructuralFeature attribute) {
		if (attribute.getEAnnotation(EXTENDED_META_DATA_KEY) != null) {
			return attribute.getEAnnotation(EXTENDED_META_DATA_KEY).getDetails().get(KIND_KEY);
		}
		return "";
	}

	/**
	 * @param attribute
	 *            EAttribute
	 * @return name detail value.
	 */
	public static String getFeatureMapEntryNameAttribute(EStructuralFeature attribute) {
		if (attribute.getEAnnotation(EXTENDED_META_DATA_KEY) != null) {
			return attribute.getEAnnotation(EXTENDED_META_DATA_KEY).getDetails().get(NAME_KEY);
		}
		return "";
	}

	/**
	 * @param attribute
	 *            EAttribute
	 * @return group detail value.
	 */
	public static String getFeatureMapEntryGroupAttribute(EStructuralFeature attribute) {
		if (attribute.getEAnnotation(EXTENDED_META_DATA_KEY) != null) {
			return attribute.getEAnnotation(EXTENDED_META_DATA_KEY).getDetails().get(GROUP_KEY);
		}
		return "";
	}

	/**
	 * @param name
	 * @param reference
	 *            {@link EReference}
	 * @return if the reference has an annotation key nameAttribute
	 */
	public static boolean hasEAnnotationNameAttribute(String name, EReference reference) {
		return reference.getEAnnotation(BuilderUtil.EXTENDED_META_DATA_KEY) != null && reference.getEAnnotation(BuilderUtil.EXTENDED_META_DATA_KEY).getDetails() != null && reference.getEAnnotation(BuilderUtil.EXTENDED_META_DATA_KEY).getDetails().get(name) != null || BuilderUtil.DOCUMENT_ROOT.equals(((EClass) reference.eContainer()).getName());
	}

	/**
	 * Save the resource
	 * 
	 * @param resource
	 *            Resource
	 */
	public static void saveResource(Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error during resource saving: " + resource.toString(), e));
		}
	}
}
