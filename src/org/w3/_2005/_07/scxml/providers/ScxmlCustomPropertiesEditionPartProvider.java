/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.w3._2005._07.scxml.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.parts.form.ScxmlScriptTypeCustomPropertiesEditionPartForm;
import org.w3._2005._07.scxml.parts.impl.ScxmlScriptTypeCustomPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class ScxmlCustomPropertiesEditionPartProvider extends ScxmlPropertiesEditionPartProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object,
	 *      int,
	 *      org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ScxmlViewsRepository.ScxmlScriptType.class) {
			if (kind == ScxmlViewsRepository.SWT_KIND)
				return new ScxmlScriptTypeCustomPropertiesEditionPartImpl(component);
			if (kind == ScxmlViewsRepository.FORM_KIND)
				return new ScxmlScriptTypeCustomPropertiesEditionPartForm(component);
		}
		return super.getPropertiesEditionPart(key, kind, component);
	}

}
