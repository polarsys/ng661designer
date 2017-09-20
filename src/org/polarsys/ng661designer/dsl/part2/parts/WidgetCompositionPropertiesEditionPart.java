/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface WidgetCompositionPropertiesEditionPart {

	/**
	 * @return the representation
	 * 
	 */
	public EObject getRepresentation();

	/**
	 * Init the representation
	 * @param settings the combo setting
	 */
	public void initRepresentation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new representation
	 * @param newValue the new representation to set
	 * 
	 */
	public void setRepresentation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRepresentationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the representation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRepresentation(ViewerFilter filter);

	/**
	 * Adds the given filter to the representation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRepresentation(ViewerFilter filter);




	/**
	 * Init the values
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initValues(ReferencesTableSettings settings);

	/**
	 * Update the values
	 * @param newValue the values to update
	 * 
	 */
	public void updateValues();

	/**
	 * Adds the given filter to the values edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValues(ViewerFilter filter);

	/**
	 * Adds the given filter to the values edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValues(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the values table
	 * 
	 */
	public boolean isContainedInValuesTable(EObject element);





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
