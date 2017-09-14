/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PropertyValuePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class PropertyValuePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, PropertyValuePropertiesEditionPart {

	protected Text value;
	protected EObjectFlatComboViewer property;



	/**
	 * For {@link ISection} use only.
	 */
	public PropertyValuePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertyValuePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence propertyValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = propertyValueStep.addStep(Part2ViewsRepository.PropertyValue.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.PropertyValue.Properties.value);
		propertiesStep.addStep(Part2ViewsRepository.PropertyValue.Properties.property);
		
		
		composer = new PartComposer(propertyValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.PropertyValue.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PropertyValue.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PropertyValue.Properties.property) {
					return createPropertyFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(Part2Messages.PropertyValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PropertyValue.Properties.value, Part2Messages.PropertyValuePropertiesEditionPart_ValueLabel);
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PropertyValuePropertiesEditionPartForm.this,
							Part2ViewsRepository.PropertyValue.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PropertyValuePropertiesEditionPartForm.this,
									Part2ViewsRepository.PropertyValue.Properties.value,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, value.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PropertyValuePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				// Start of user code for keyPressed
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyValuePropertiesEditionPartForm.this, Part2ViewsRepository.PropertyValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				// End of user code for keyPressed
			}
		});
		EditingUtils.setID(value, Part2ViewsRepository.PropertyValue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PropertyValue.Properties.value, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Part2ViewsRepository.PropertyValue.Properties.property, Part2Messages.PropertyValuePropertiesEditionPart_PropertyLabel);
		property = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Part2ViewsRepository.PropertyValue.Properties.property, Part2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(property);
		property.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData propertyData = new GridData(GridData.FILL_HORIZONTAL);
		property.setLayoutData(propertyData);
		property.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyValuePropertiesEditionPartForm.this, Part2ViewsRepository.PropertyValue.Properties.property, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProperty()));
			}

		});
		property.setID(Part2ViewsRepository.PropertyValue.Properties.property);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PropertyValue.Properties.property, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
