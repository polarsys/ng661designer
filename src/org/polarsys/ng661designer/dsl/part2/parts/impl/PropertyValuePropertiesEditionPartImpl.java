/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PropertyValuePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class PropertyValuePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PropertyValuePropertiesEditionPart {

	protected Text value;
	protected EObjectFlatComboViewer property;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertyValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence propertyValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = propertyValueStep.addStep(Part2ViewsRepository.PropertyValue.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.PropertyValue.Properties.value);
		propertiesStep.addStep(Part2ViewsRepository.PropertyValue.Properties.property);
		
		
		composer = new PartComposer(propertyValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.PropertyValue.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.PropertyValue.Properties.value) {
					return createValueText(parent);
				}
				if (key == Part2ViewsRepository.PropertyValue.Properties.property) {
					return createPropertyFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(Part2Messages.PropertyValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.PropertyValue.Properties.value, Part2Messages.PropertyValuePropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyValuePropertiesEditionPartImpl.this, Part2ViewsRepository.PropertyValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				// Start of user code for keyPressed
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyValuePropertiesEditionPartImpl.this, Part2ViewsRepository.PropertyValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				// End of user code for keyPressed
			}

		});
		EditingUtils.setID(value, Part2ViewsRepository.PropertyValue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PropertyValue.Properties.value, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPropertyFlatComboViewer(Composite parent) {
		createDescription(parent, Part2ViewsRepository.PropertyValue.Properties.property, Part2Messages.PropertyValuePropertiesEditionPart_PropertyLabel);
		property = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Part2ViewsRepository.PropertyValue.Properties.property, Part2ViewsRepository.SWT_KIND));
		property.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		property.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyValuePropertiesEditionPartImpl.this, Part2ViewsRepository.PropertyValue.Properties.property, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getProperty()));
			}

		});
		GridData propertyData = new GridData(GridData.FILL_HORIZONTAL);
		property.setLayoutData(propertyData);
		property.setID(Part2ViewsRepository.PropertyValue.Properties.property);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PropertyValue.Properties.property, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPropertyFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PropertyValue.Properties.value, newValue);
		if (eefElementEditorDefaultValueState) {
			value.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			value.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PropertyValue.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(Part2Messages.PropertyValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#getProperty()
	 * 
	 */
	public EObject getProperty() {
		if (property.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) property.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#initProperty(EObjectFlatComboSettings)
	 */
	public void initProperty(EObjectFlatComboSettings settings) {
		property.setInput(settings);
		if (current != null) {
			property.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PropertyValue.Properties.property);
		if (eefElementEditorReadOnlyState && property.isEnabled()) {
			property.setEnabled(false);
			property.setToolTipText(Part2Messages.PropertyValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !property.isEnabled()) {
			property.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#setProperty(EObject newValue)
	 * 
	 */
	public void setProperty(EObject newValue) {
		if (newValue != null) {
			property.setSelection(new StructuredSelection(newValue));
		} else {
			property.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PropertyValue.Properties.property);
		if (eefElementEditorReadOnlyState && property.isEnabled()) {
			property.setEnabled(false);
			property.setToolTipText(Part2Messages.PropertyValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !property.isEnabled()) {
			property.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#setPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPropertyButtonMode(ButtonsModeEnum newValue) {
		property.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#addFilterProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperty(ViewerFilter filter) {
		property.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PropertyValuePropertiesEditionPart#addBusinessFilterProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperty(ViewerFilter filter) {
		property.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.PropertyValue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
