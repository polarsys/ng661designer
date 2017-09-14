/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.initializer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.collect.Lists;

/**
 * 
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class InitializerUtil {

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if reference is containment
	 */
	public static boolean isInitialized(EStructuralFeature feature) {
		return !isFeatureMapEntry(feature) && (isClass(feature) || !isReferenceContainment(feature));
	}

	/**
	 * @param name
	 * @return is class name is name
	 */
	public static boolean isClass(EStructuralFeature feature) {
		String name = ((ENamedElement) feature.eContainer()).getName();
		return ("send".equals(feature.getName()) || "script".equals(feature.getName()) || "param".equals(feature.getName()) || "event".equals(feature.getName())) && ("ScxmlOnexecuteType".equals(name) || "ScxmlSendType".equals(name) || "ScxmlTransitionType".equals(name));
	}

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if reference is containment
	 */
	public static boolean isReferenceContainment(EStructuralFeature feature) {
		return feature instanceof EReference && ((EReference) feature).isContainment();
	}

	/**
	 * @param feature
	 *            EStructuralFeature
	 * @return if reference is containment
	 */
	public static boolean isFeatureMapEntry(EStructuralFeature feature) {
		return feature.getEType().getName().contains("MapEntry");
	}

	/**
	 * @param initial
	 *            List<EStructuralFeature>
	 * @return initial list sorted: required first, id and name first.
	 */
	public static List<EStructuralFeature> sortEStructuralFeatures(List<EStructuralFeature> initial) {
		LinkedList<EStructuralFeature> features = Lists.newLinkedList();
		for (EStructuralFeature eStructuralFeature : initial) {
			if (eStructuralFeature.isRequired()) {
				features.add(eStructuralFeature);
			}
		}
		for (EStructuralFeature eStructuralFeature : initial) {
			if (!eStructuralFeature.isRequired()) {
				features.add(eStructuralFeature);
			}
		}
		EStructuralFeature name = getEStructuralFeature(features, "name");
		if (name != null) {
			Collections.swap(features, features.indexOf(name), 0);
		}
		EStructuralFeature id = getEStructuralFeature(features, "id");
		if (id != null) {
			Collections.swap(features, features.indexOf(id), 0);
		}
		return features;
	}

	/**
	 * @param features
	 *            List<EStructuralFeature>
	 * @param name
	 * @return feature named name
	 */
	public static EStructuralFeature getEStructuralFeature(List<EStructuralFeature> features, String name) {
		for (EStructuralFeature eStructuralFeature : features) {
			if (name.equalsIgnoreCase(eStructuralFeature.getName())) {
				return eStructuralFeature;
			}
		}
		return null;
	}
}
