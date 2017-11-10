/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.services;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.w3._2005._07.scxml.ScxmlPackage;

import org.polarsys.ng661designer.dsl.part2.util.FeatureServices;

/**
 * Services for representations.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class EcoreServices {

	private static final String NAME = "name";
	private static final String ID = "id";

	private FeatureServices featureServices;

	/**
	 * @return FeatureServices
	 */
	private FeatureServices getFeatureServices() {
		if (featureServices == null) {
			featureServices = new FeatureServices();
		}
		return featureServices;
	}

	/**
	 * Create an element and set the id
	 * 
	 * @param container
	 *            EObject
	 * @param className
	 * @param touch
	 *            is TouchArea
	 * @return the created element
	 */
	public EObject createIDElement(EObject element, String className, boolean touch) {
		String[] split = className.split("\\.");
		String name = split[split.length - 1];
		EClass eClass = null;
		if (className.contains("part2")) {
			eClass = (EClass) Part2Package.eINSTANCE.getEClassifier(name);
		} else if (className.contains("scxml")) {
			eClass = (EClass) ScxmlPackage.eINSTANCE.getEClassifier(name);
		}
		EObject representation = null;
		if (eClass != null) {
			representation = EcoreUtil.create(eClass);
			EStructuralFeature idFeature = representation.eClass().getEStructuralFeature(ID);
			if (idFeature != null) {
				representation.eSet(idFeature, name);
			}
			EStructuralFeature featureParent = getFeatureServices().getParentFeature(element, className, touch);
			if (featureParent != null) {
				getFeatureServices().addEObjectToReference(element, representation, featureParent);
			}
		}
		return representation;
	}

	public EObject createElement(EObject element, String className) {
		String[] split = className.split("\\.");
		String name = split[split.length - 1];
		EClass eClass = null;
		if (className.contains("part2")) {
			eClass = (EClass) Part2Package.eINSTANCE.getEClassifier(name);
		} else if (className.contains("scxml")) {
			eClass = (EClass) ScxmlPackage.eINSTANCE.getEClassifier(name);
		}
		EObject representation = null;
		if (eClass != null) {
			representation = EcoreUtil.create(eClass);
			EStructuralFeature featureParent = getFeatureServices().getParentFeature(element, className);
			if (featureParent != null) {
				getFeatureServices().addEObjectToReference(element, representation, featureParent);
			}
		}
		return representation;
	}
	
	public EObject createElement(EObject element, String className, String featureName) {
		String[] split = className.split("\\.");
		String name = split[split.length - 1];
		EClass eClass = null;
		if (className.contains("part2")) {
			eClass = (EClass) Part2Package.eINSTANCE.getEClassifier(name);
		} else if (className.contains("scxml")) {
			eClass = (EClass) ScxmlPackage.eINSTANCE.getEClassifier(name);
		}
		EObject representation = null;
		if (eClass != null) {
			representation = EcoreUtil.create(eClass);
			EStructuralFeature featureParent = element.eClass().getEStructuralFeature(featureName);
			if (featureParent != null) {
				getFeatureServices().addEObjectToReference(element, representation, featureParent);
			}
		}
		return representation;
	}

	/**
	 * Create an element and set the id
	 * 
	 * @param container
	 *            EObject
	 * @param className
	 * 
	 * @return the created element
	 */
	public EObject createIDElement(EObject element, String className) {
		return createIDElement(element, className, false);
	}

	/**
	 * Create an element and set the name
	 * 
	 * @param container
	 *            EObject
	 * @param className
	 * @return the created element
	 */
	public EObject createNameElement(EObject container, String className) {
		String[] split = className.split("\\.");
		String name = split[split.length - 1];
		EClass eClass = null;
		if (className.contains("part2")) {
			eClass = (EClass) Part2Package.eINSTANCE.getEClassifier(name);
		} else if (className.contains("scxml")) {
			eClass = (EClass) ScxmlPackage.eINSTANCE.getEClassifier(name);
		}
		EObject element = null;
		if (eClass != null) {
			element = EcoreUtil.create(eClass);
			EStructuralFeature nameFeature = element.eClass().getEStructuralFeature(NAME);
			if (nameFeature != null) {
				element.eSet(nameFeature, name);
			}
			EStructuralFeature featureParent = getFeatureServices().getParentFeature(container, className);
			if (featureParent != null) {
				getFeatureServices().addEObjectToReference(container, element, featureParent);
			}
		}
		return element;
	}

}
