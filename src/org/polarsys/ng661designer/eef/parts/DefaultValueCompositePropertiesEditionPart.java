/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.eef.parts;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

/**
 * @author <a href="mailto:axel.richard@obeo.fr">Axel Richard</a>
 *
 */
public abstract class DefaultValueCompositePropertiesEditionPart extends CompositePropertiesEditionPart {

	public DefaultValueCompositePropertiesEditionPart() {
	}

	public DefaultValueCompositePropertiesEditionPart(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	public boolean isDefault(Object editorKey, String newValue) {
		return DefaultValueEditionPartUtil.isDefault(editorKey, null, newValue, propertiesEditionComponent);
	}
}
