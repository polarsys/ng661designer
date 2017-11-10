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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.codegen.core.initializer.ViewTransformer;
import org.eclipse.emf.eef.views.Container;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsFactory;

/**
 * Inherit and copy from EEF ViewTransformer to compute component model views
 * repository: do not generate containment references.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NGDesignerViewTransformer extends ViewTransformer {

	/**
	 * Constructor.
	 * 
	 * @param toolkits
	 *            Toolkits
	 */
	public NGDesignerViewTransformer(Map<String, EObject> toolkits) {
		super(toolkits);
	}

	/**
	 * Call EEF code but do not generate containment references. (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.eef.codegen.core.initializer.ViewTransformer#genClass2Views(org.eclipse.emf.codegen.ecore.genmodel.GenClass)
	 */
	public List<View> genClass2Views(GenClass genClass) {
		List<View> result = new ArrayList<View>();
		View view = ViewsFactory.eINSTANCE.createView();
		view.setExplicit(true);
		View additionalView = genClass2AdditionalView(genClass);
		view.setName(genClass.getName());
		Map<String, List<EStructuralFeature>> groups = genClassGroups(genClass);
		for (String name : groups.keySet()) {
			if (!name.equals("view")) {
				Container container = ViewsFactory.eINSTANCE.createContainer();
				container.setName(name);
				container.setRepresentation(getWidget("Group"));
				List<EStructuralFeature> features = InitializerUtil.sortEStructuralFeatures(groups.get(name));
				for (EStructuralFeature structuralFeature : features) {
					if (!structuralFeature.isDerived() && InitializerUtil.isInitialized(structuralFeature) /*&& !isUnmanagedReference(structuralFeature)*/) {
						ElementEditor editor = eStructuralFeature2ViewElement(structuralFeature);
						if (editor != null)
							container.getElements().add(editor);
					}
				}
				view.getElements().add(container);
			}
		}
		if (groups.get("view") != null) {
			List<EStructuralFeature> features = InitializerUtil.sortEStructuralFeatures(groups.get("view"));
			for (EStructuralFeature structuralFeature : features) {
				if (!structuralFeature.isDerived() && InitializerUtil.isInitialized(structuralFeature)) {
					ElementEditor editor = eStructuralFeature2ViewElement(structuralFeature);
					if (editor != null)
						view.getElements().add(editor);
				}
			}
		}
		result.add(view);
		addElementToEObject(genClass.getEcoreClass(), view);
		if (additionalView != null) {
			result.add(additionalView);
			addElementToEObject(genClass.getEcoreClass(), additionalView);
		}
		return result;
	}

	/***
	 *
	 * Copy from EEF
	 */
	private Map<String, List<EStructuralFeature>> genClassGroups(GenClass genClass) {
		Map<String, List<EStructuralFeature>> result = new HashMap<String, List<EStructuralFeature>>();
		for (EStructuralFeature feature : genClass.getEcoreClass().getEAllStructuralFeatures()) {
			if (isSignificant(feature) && getViewName(feature) == null) {
				String groupConstraint = genConstraint(feature, "group");
				if (groupConstraint != null) {
					addToGroup(result, feature, groupConstraint);
				} else {
					// FIXME: HACK
					String docConstraint = genConstraint(feature, "documentation");
					if ("true".equals(docConstraint))
						addToGroup(result, feature, "view");
					else
						addToGroup(result, feature, "properties");
				}
			}
		}

		return result;
	}

	/***
	 *
	 * Copy from EEF
	 */
	private void addToGroup(Map<String, List<EStructuralFeature>> result, EStructuralFeature feature, String genConstraint) {
		if (result.get(genConstraint) != null)
			result.get(genConstraint).add(feature);
		else {
			List<EStructuralFeature> list = new ArrayList<EStructuralFeature>();
			list.add(feature);
			result.put(genConstraint, list);
		}
	}

}
