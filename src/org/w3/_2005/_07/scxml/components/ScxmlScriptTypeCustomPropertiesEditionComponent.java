/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.w3._2005._07.scxml.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScriptType;
import org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;

import com.google.common.base.Strings;

// End of user code

/**
 * 
 * 
 */
public class ScxmlScriptTypeCustomPropertiesEditionComponent extends ScxmlScriptTypePropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	/**
	 * Default constructor
	 * 
	 */
	public ScxmlScriptTypeCustomPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlScriptType, String editing_mode) {
		super(editingContext, scxmlScriptType, editing_mode);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);

			final ScxmlScriptType scxmlScriptType = (ScxmlScriptType) elt;
			final ScxmlScriptTypePropertiesEditionPart basePart = (ScxmlScriptTypePropertiesEditionPart) editingPart;
			// init values
			if ((Strings.isNullOrEmpty(scxmlScriptType.getSrc()) && Strings.isNullOrEmpty(scxmlScriptType.getContent())) || !Strings.isNullOrEmpty(scxmlScriptType.getSrc())) {
				if (isAccessible(ScxmlViewsRepository.ScxmlScriptType.Properties.src))
					basePart.setSrc(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_SCRIPT_SOURCE_TYPE, scxmlScriptType.getSrc()));
			} else if (!Strings.isNullOrEmpty(scxmlScriptType.getContent())) {
				if (isAccessible(ScxmlViewsRepository.ScxmlScriptType.Properties.content))
					basePart.setContent(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, scxmlScriptType.getContent()));
			}

			// init filters

			// init values for referenced views

			// init filters for referenced views

		}
		setInitializing(false);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlScriptType scxmlScriptType = (ScxmlScriptType) semanticObject;
		if (ScxmlViewsRepository.ScxmlScriptType.Properties.src == event.getAffectedEditor()) {
			scxmlScriptType.setSrc((java.lang.String) EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_SCRIPT_SOURCE_TYPE, (String) event.getNewValue()));
			scxmlScriptType.setContent("");
		}
		if (ScxmlViewsRepository.ScxmlScriptType.Properties.content == event.getAffectedEditor()) {
			scxmlScriptType.setContent((java.lang.String) EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String) event.getNewValue()));
			scxmlScriptType.setSrc("");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlScriptTypePropertiesEditionPart basePart = (ScxmlScriptTypePropertiesEditionPart) editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlScriptType_Src().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlScriptType.Properties.src)) {
				if (msg.getNewValue() != null) {
					basePart.setSrc(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_SCRIPT_SOURCE_TYPE, msg.getNewValue()));
				} else {
					basePart.setSrc("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlScriptType_Content().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlScriptType.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}

		}
	}

}
