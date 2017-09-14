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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.codegen.core.initializer.ComponentTransformer;
import org.eclipse.emf.eef.components.ComponentsFactory;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewElement;

/**
 * Inherit and copy from EEF ComponentTransformer to compute component model
 * properties editing component: do not generate containment references.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NGDesignerComponentTransformer extends ComponentTransformer {
	private Map<EObject, List<ViewElement>> workingResolvTemp;

	/**
	 * Constructor.
	 * 
	 * @param workingResolvTemp
	 */
	public NGDesignerComponentTransformer(Map<EObject, List<ViewElement>> workingResolvTemp) {
		super(workingResolvTemp);
		this.workingResolvTemp = workingResolvTemp;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * Copy from ComponentTransformer : update call to
	 * InitializerUtil.isEditable(genClass, structuralFeature)
	 * 
	 * @see org.eclipse.emf.eef.codegen.core.initializer.ComponentTransformer#genClass2Component(org.eclipse.emf.codegen.ecore.genmodel.GenClass,
	 *      org.eclipse.emf.codegen.ecore.genmodel.GenPackage)
	 */
	public PropertiesEditionComponent genClass2Component(GenClass genClass, GenPackage genPackage) {
		PropertiesEditionComponent component = ComponentsFactory.eINSTANCE.createPropertiesEditionComponent();
		component.setName(genClass.getEcoreClass().getName());
		component.setModel(genClass.getEcoreClass());
		List<ViewElement> list = workingResolvTemp.get(genClass.getEcoreClass());
		for (ViewElement viewElement : list) {
			component.getViews().add((View) viewElement);
		}
		for (EStructuralFeature feature : InitializerUtil.sortEStructuralFeatures(genClass.getEcoreClass().getEAllStructuralFeatures())) {
			if (isSignificant(feature) && InitializerUtil.isInitialized(feature) && !feature.isDerived() && !inheritedMember(feature, genClass.getEcoreClass()) /*&& !isUnmanagedReference(feature)*/) {
				PropertiesEditionElement structuralFeature2EditionElement = eStructuralFeature2EditionElement(list, feature);
				if (structuralFeature2EditionElement != null)
					component.getProperties().add(structuralFeature2EditionElement);
			}
		}
		return component;

	}

	// /***
	// *
	// * Copy from EEF
	// */
	// public PropertiesEditionElement
	// eStructuralFeature2EditionElement(List<ViewElement> concerningViews,
	// EStructuralFeature feature) {
	// PropertiesEditionElement element =
	// ComponentsFactory.eINSTANCE.createPropertiesEditionElement();
	// element.setName(feature.getName());
	// element.setModel(feature);
	// List<ViewElement> list = workingResolvTemp.get(feature);
	// if (list != null) {
	// for (ViewElement viewElement : list) {
	// if (inConcerningViews(concerningViews, viewElement))
	// element.getViews().add((ElementEditor) viewElement);
	// }
	// } else {
	// System.err.println("No view found for : " + feature.toString());
	// return null;
	// }
	// return element;
	//
	// }
	//
	// /* ===== Misc utilities ===== */
	// /***
	// *
	// * Copy from EEF
	// */
	// private boolean inConcerningViews(List<ViewElement> concerningViews,
	// ViewElement toCheck) {
	// for (ViewElement viewElement : concerningViews) {
	// if (viewElement instanceof View) {
	// if (inConcerningView((View) viewElement, toCheck))
	// return true;
	// }
	// }
	// return false;
	// }
	//
	// /***
	// *
	// * Copy from EEF
	// */
	// private boolean inConcerningView(View concerningView, ViewElement
	// toCheck) {
	// if (toCheck instanceof View && EcoreUtil.equals(concerningView, toCheck))
	// return true;
	// else {
	// Container next = toCheck.getContainer();
	// if (next != null)
	// return inConcerningView(concerningView, next);
	// else
	// return false;
	// }
	// }
}
