/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.handler;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Redefine XML Handler used on loading.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NGDesignerXMLLoad extends XMLLoadImpl {

	/**
	 * @param helper XMLHelper
	 */
	public NGDesignerXMLLoad(XMLHelper helper) {
		super(helper);
	}

	/** (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl#makeDefaultHandler()
	 */
	@Override
	 protected DefaultHandler makeDefaultHandler() {
        return new NG661DesignerHandler(resource, helper, options);
    }

}
