/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.parts.forms.DocumentRootPropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlOnexecuteTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlParamTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlScriptTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlScxmlTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlSendTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlStateTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.forms.ScxmlTransitionTypePropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.impl.DocumentRootPropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlOnexecuteTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlParamTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlScriptTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlScxmlTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlSendTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlStateTypePropertiesEditionPartImpl;
import org.w3._2005._07.scxml.parts.impl.ScxmlTransitionTypePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class ScxmlPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ScxmlViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ScxmlViewsRepository.ScxmlOnexecuteType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlOnexecuteTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlOnexecuteTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlParamType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlParamTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlParamTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlScriptType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlScriptTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlScriptTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlScxmlType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlScxmlTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlScxmlTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlSendType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlSendTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlSendTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlStateType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlStateTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlStateTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.ScxmlTransitionType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlTransitionTypePropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlTransitionTypePropertiesEditionPartForm(component);
		}
		if (key == ScxmlViewsRepository.DocumentRoot.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new DocumentRootPropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new DocumentRootPropertiesEditionPartForm(component);
		}
		return null;
	}

}
