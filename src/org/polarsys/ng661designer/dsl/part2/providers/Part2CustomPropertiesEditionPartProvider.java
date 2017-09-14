/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PropertyValuePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PropertyValueCustomPropertiesEditionPartImpl;

public class Part2CustomPropertiesEditionPartProvider extends Part2PropertiesEditionPartProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object,
	 *      int,
	 *      org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	@Override
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind,
			IPropertiesEditionComponent component) {
		if (key == Part2ViewsRepository.PropertyValue.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PropertyValueCustomPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PropertyValuePropertiesEditionPartForm(component);
		}
		return super.getPropertiesEditionPart(key, kind, component);
	}
}
