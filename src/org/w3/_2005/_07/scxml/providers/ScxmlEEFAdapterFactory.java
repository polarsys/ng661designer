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

import org.eclipse.emf.common.notify.Adapter;
import org.w3._2005._07.scxml.util.ScxmlAdapterFactory;

/**
 * 
 * 
 */
public class ScxmlEEFAdapterFactory extends ScxmlAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlOnexecuteTypeAdapter()
	 * 
	 */
	public Adapter createScxmlOnexecuteTypeAdapter() {
		return new ScxmlOnexecuteTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlParamTypeAdapter()
	 * 
	 */
	public Adapter createScxmlParamTypeAdapter() {
		return new ScxmlParamTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlScriptTypeAdapter()
	 * 
	 */
	public Adapter createScxmlScriptTypeAdapter() {
		return new ScxmlScriptTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlScxmlTypeAdapter()
	 * 
	 */
	public Adapter createScxmlScxmlTypeAdapter() {
		return new ScxmlScxmlTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlSendTypeAdapter()
	 * 
	 */
	public Adapter createScxmlSendTypeAdapter() {
		return new ScxmlSendTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlStateTypeAdapter()
	 * 
	 */
	public Adapter createScxmlStateTypeAdapter() {
		return new ScxmlStateTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.w3._2005._07.scxml.util.ScxmlAdapterFactory#createScxmlTransitionTypeAdapter()
	 * 
	 */
	public Adapter createScxmlTransitionTypeAdapter() {
		return new ScxmlTransitionTypePropertiesEditionProvider();
	}

}
