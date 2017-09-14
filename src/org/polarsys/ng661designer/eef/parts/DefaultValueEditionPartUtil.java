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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

/**
 * @author <a href="mailto:axel.richard@obeo.fr">Axel Richard</a>
 *
 */
public class DefaultValueEditionPartUtil {

	public static boolean isDefault(Object editorKey, EObject context, String newValue, IPropertiesEditionComponent propertiesEditionComponent) {
		EObject eObject = context;
		if (eObject == null) {
			eObject = propertiesEditionComponent.getEditingContext().getEObject();
		}
		if (eObject != null) {
			EStructuralFeature associatedFeature = propertiesEditionComponent.associatedFeature(editorKey);
			String defaultValueLiteral = associatedFeature.getDefaultValueLiteral();
			if (defaultValueLiteral != null && defaultValueLiteral.equals(newValue)) {
				return true;
			}
		}
		return false;
	}
}
