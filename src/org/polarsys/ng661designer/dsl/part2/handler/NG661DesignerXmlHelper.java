/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.handler;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

import org.polarsys.ng661designer.dsl.part2.util.NG661DesignerUtil;

/**
 * XML Handler.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerXmlHelper extends XMLHelperImpl {

	/**
	 * @param resource
	 *            XMLResource
	 */
	public NG661DesignerXmlHelper(XMLResource resource) {
		super(resource);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl#getQName(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	public String getQName(EStructuralFeature feature) {
		EPackage ePackage = feature.getEContainingClass().getEPackage();
		if (ePackage != null && feature instanceof EReference && (((EReference) feature).isContainment() || NG661DesignerUtil.isRepresentationCase(feature.getEContainingClass()))) {
			String name = feature.getName();
			// handle special case of reference group1 in RepresentationType.
			if (name.equalsIgnoreCase("group1")) {
				name = "group";
			}
			if (Part2Package.eINSTANCE.equals(ePackage)) {
				name = name.replaceFirst(".", (name.charAt(0) + "").toUpperCase());
			}
			return getQName(ePackage, name);
		}
		return super.getQName(feature);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl#getFeature(org.eclipse.emf.ecore.EClass,
	 *      java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public EStructuralFeature getFeature(EClass eClass, String namespaceURI, String name, boolean isElement) {
		String lowerCaseName = name.replaceFirst(".", (name.charAt(0) + "").toLowerCase());
		// handle special case of reference group1 in RepresentationType.
		if (lowerCaseName != null && lowerCaseName.equalsIgnoreCase("group") && eClass.getName().equalsIgnoreCase("RepresentationType")) {
			lowerCaseName = "group1";
		}
		if (eClass.getEStructuralFeature(lowerCaseName) != null) {
			return eClass.getEStructuralFeature(lowerCaseName);
		}
		return super.getFeature(eClass, namespaceURI, lowerCaseName, isElement);
	}

}
