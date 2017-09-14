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

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ScxmlEEFCustomAdapterFactory extends ScxmlEEFAdapterFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlScriptTypeAdapter()
	 * 
	 */
	public Adapter createScxmlScriptTypeAdapter() {
		return new ScxmlScriptTypeCustomPropertiesEditionProvider();
	}

}
