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
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
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
import org.polarsys.ng661designer.dsl.part2.parts.KeyboardInputPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class KeyboardInputPrimitivePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, KeyboardInputPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text enabled;



	/**
	 * For {@link ISection} use only.
	 */
	public KeyboardInputPrimitivePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public KeyboardInputPrimitivePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence keyboardInputPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = keyboardInputPrimitiveStep.addStep(Part2ViewsRepository.KeyboardInputPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.KeyboardInputPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled);
		
		
		composer = new PartComposer(keyboardInputPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.KeyboardInputPrimitive.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.KeyboardInputPrimitive.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled) {
					return createEnabledText(widgetFactory, parent);
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
		propertiesSection.setText(Part2Messages.KeyboardInputPrimitivePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.KeyboardInputPrimitive.Properties.id, Part2Messages.KeyboardInputPrimitivePropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							KeyboardInputPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.KeyboardInputPrimitive.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									KeyboardInputPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.KeyboardInputPrimitive.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
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
									KeyboardInputPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(KeyboardInputPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.KeyboardInputPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Part2ViewsRepository.KeyboardInputPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.KeyboardInputPrimitive.Properties.id, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createEnabledText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled, Part2Messages.KeyboardInputPrimitivePropertiesEditionPart_EnabledLabel);
		enabled = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		enabled.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData enabledData = new GridData(GridData.FILL_HORIZONTAL);
		enabled.setLayoutData(enabledData);
		enabled.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							KeyboardInputPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									KeyboardInputPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, enabled.getText()));
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
									KeyboardInputPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		enabled.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(KeyboardInputPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
				}
			}
		});
		EditingUtils.setID(enabled, Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled);
		EditingUtils.setEEFtype(enabled, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnabledText

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
	 * @see org.example.ng661.part2.parts.KeyboardInputPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.KeyboardInputPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.KeyboardInputPrimitive.Properties.id, newValue);
		if (eefElementEditorDefaultValueState) {
			id.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			id.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.KeyboardInputPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.KeyboardInputPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.KeyboardInputPrimitivePropertiesEditionPart#getEnabled()
	 * 
	 */
	public String getEnabled() {
		return enabled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.KeyboardInputPrimitivePropertiesEditionPart#setEnabled(String newValue)
	 * 
	 */
	public void setEnabled(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled, newValue);
		if (eefElementEditorDefaultValueState) {
			enabled.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			enabled.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			enabled.setText(newValue);
		} else {
			enabled.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.KeyboardInputPrimitive.Properties.enabled);
		if (eefElementEditorReadOnlyState && enabled.isEnabled()) {
			enabled.setEnabled(false);
			enabled.setToolTipText(Part2Messages.KeyboardInputPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enabled.isEnabled()) {
			enabled.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.KeyboardInputPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
