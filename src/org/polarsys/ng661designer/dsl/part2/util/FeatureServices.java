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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.ng661designer.dsl.part2.gen.ClipPathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationType;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationTypes;

/**
 * Services on EStructuralFeatures.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class FeatureServices {

	/**
	 * Add EObject in reference.
	 * 
	 * @param container
	 *            EObject
	 * @param element
	 *            EObject
	 * @param featureParent
	 *            EStructuralFeature
	 */
	@SuppressWarnings("unchecked")
	public void addEObjectToReference(EObject container, EObject element, EStructuralFeature featureParent) {
		Object eGet = container.eGet(featureParent);
		if (eGet instanceof List) {
			List<EObject> values = (List<EObject>) eGet;
			values.add(element);
		} else {
			container.eSet(featureParent, element);
		}
	}

	/**
	 * @param element
	 *            EObject
	 * @param name
	 * @param touch
	 * @return parent feature
	 */
	public EStructuralFeature getParentFeature(EObject element, String name, boolean touch) {
		EStructuralFeature parentFeature = getParentRepresentationFeatureName(element);
		if (parentFeature == null) {
			for (EReference reference : element.eClass().getEAllReferences()) {
				if (reference.getEType().getInstanceClassName().equals(name)) {
					if (touch) {
						touch = false;
						continue;
					}
					return reference;
				}
			}
		}
		return parentFeature;
	}

	public EStructuralFeature getParentRepresentationFeatureName(EObject element) {
		if (element instanceof RepresentationType) {
			return element.eClass().getEStructuralFeature("group");
		}
		if (element instanceof ClipPathPrimitive) {
			return element.eClass().getEStructuralFeature("group");
		}
		if (element instanceof RepresentationTypes) {
			return element.eClass().getEStructuralFeature("childElements");
		}
		return null;
	}

	/**
	 * @param element
	 *            EObject
	 * @param name
	 * @return parent feature.
	 */
	public EStructuralFeature getParentFeature(EObject element, String name) {
		for (EReference reference : element.eClass().getEAllReferences()) {
			if (reference.getEType().getInstanceClassName().equals(name)) {
				return reference;
			}
		}
		return null;
	}

	/**
	 * @param element
	 *            EObject
	 * @param name
	 * @return parent feature.
	 */
	public EStructuralFeature getParentFeature(EClass element, String name) {
		for (EReference reference : element.getEAllReferences()) {
			if (reference.getEType().getInstanceClassName().equals(name)) {
				return reference;
			}
		}
		return null;
	}

}
