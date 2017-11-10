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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Builder for Scxml.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class ScxmlBuilder {

	/**
	 * Constants
	 */
	public static final String SCXML_PREFIX = "p";
	public static final String SCXML_URI = "http://www.w3.org/2005/07/scxml";
	public static final String DATAMODEL_ATTRIBUTE = "datamodel1";
	public static final String SCXML_SCXML_TYPE_ECLASS = "ScxmlScxmlType";
	public static final String SCXML_SCRIPT_TYPE_ECLASS = "ScxmlScriptType";

	/**
	 * EcoreBuilder
	 */
	@SuppressWarnings("unused")
	private EcoreBuilder ecoreBuilder;

	/**
	 * @param ecoreBuilder
	 */
	public ScxmlBuilder(EcoreBuilder ecoreBuilder) {
		super();
		this.ecoreBuilder = ecoreBuilder;
	}

	/**
	 * Update scxml package.
	 * 
	 * @param ePackage
	 *            EPackage
	 * @return scxml resource
	 */
	public Resource manageScxmlPackage(EPackage ePackage) {
		if (SCXML_URI.equals(ePackage.getNsURI())) {
			// update prefix
			ePackage.setNsPrefix(SCXML_PREFIX);
			// update scxml.datamodel default value
			EClass scxmlType = (EClass) ePackage.getEClassifier(SCXML_SCXML_TYPE_ECLASS);
			if (scxmlType != null) {
				EStructuralFeature feature = scxmlType.getEStructuralFeature(DATAMODEL_ATTRIBUTE);
				if (feature != null) {					
					feature.setDefaultValue("");
				}
			}
			// add script.content attribute
			EClass scriptType = (EClass) ePackage.getEClassifier(SCXML_SCRIPT_TYPE_ECLASS);
			if (scriptType != null) {
				EStructuralFeature feature = EcoreFactory.eINSTANCE.createEAttribute();
				feature.setName("content");
				feature.setEType(EcorePackage.eINSTANCE.getEString());
				scriptType.getEStructuralFeatures().add(feature);
			}
			return ePackage.eResource();
		}
		return null;
	}
}
