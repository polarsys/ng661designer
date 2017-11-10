/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;

// Start of user code for imports



// End of user code

/**
 * 
 * 
 */
public interface ScxmlOnexecuteTypePropertiesEditionPart {



	/**
	 * Init the send
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSend(ReferencesTableSettings settings);

	/**
	 * Update the send
	 * @param newValue the send to update
	 * 
	 */
	public void updateSend();

	/**
	 * Adds the given filter to the send edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSend(ViewerFilter filter);

	/**
	 * Adds the given filter to the send edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSend(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the send table
	 * 
	 */
	public boolean isContainedInSendTable(EObject element);




	/**
	 * Init the script
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initScript(ReferencesTableSettings settings);

	/**
	 * Update the script
	 * @param newValue the script to update
	 * 
	 */
	public void updateScript();

	/**
	 * Adds the given filter to the script edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScript(ViewerFilter filter);

	/**
	 * Adds the given filter to the script edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScript(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the script table
	 * 
	 */
	public boolean isContainedInScriptTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
