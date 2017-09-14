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
import org.polarsys.ng661designer.dsl.part2.parts.CustomRealTypeElementTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class CustomRealTypeElementTypePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, CustomRealTypeElementTypePropertiesEditionPart {

	protected Text name;
	protected Text max;
	protected Text min;
	protected Text resolution;
	protected Text unit;



	/**
	 * For {@link ISection} use only.
	 */
	public CustomRealTypeElementTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CustomRealTypeElementTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence customRealTypeElementTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = customRealTypeElementTypeStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.name);
		propertiesStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.max);
		propertiesStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.min);
		propertiesStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution);
		propertiesStep.addStep(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit);
		
		
		composer = new PartComposer(customRealTypeElementTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.max) {
					return createMaxText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.min) {
					return createMinText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution) {
					return createResolutionText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.CustomRealTypeElementType.Properties.unit) {
					return createUnitText(widgetFactory, parent);
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
		propertiesSection.setText(Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomRealTypeElementType.Properties.name, Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CustomRealTypeElementTypePropertiesEditionPartForm.this,
							Part2ViewsRepository.CustomRealTypeElementType.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									Part2ViewsRepository.CustomRealTypeElementType.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomRealTypeElementTypePropertiesEditionPartForm.this, Part2ViewsRepository.CustomRealTypeElementType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Part2ViewsRepository.CustomRealTypeElementType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomRealTypeElementType.Properties.name, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomRealTypeElementType.Properties.max, Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_MaxLabel);
		max = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		max.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxData = new GridData(GridData.FILL_HORIZONTAL);
		max.setLayoutData(maxData);
		max.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CustomRealTypeElementTypePropertiesEditionPartForm.this,
							Part2ViewsRepository.CustomRealTypeElementType.Properties.max,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									Part2ViewsRepository.CustomRealTypeElementType.Properties.max,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, max.getText()));
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
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		max.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomRealTypeElementTypePropertiesEditionPartForm.this, Part2ViewsRepository.CustomRealTypeElementType.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
				}
			}
		});
		EditingUtils.setID(max, Part2ViewsRepository.CustomRealTypeElementType.Properties.max);
		EditingUtils.setEEFtype(max, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomRealTypeElementType.Properties.max, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxText

		// End of user code
		return parent;
	}

	
	protected Composite createMinText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomRealTypeElementType.Properties.min, Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_MinLabel);
		min = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		min.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minData = new GridData(GridData.FILL_HORIZONTAL);
		min.setLayoutData(minData);
		min.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CustomRealTypeElementTypePropertiesEditionPartForm.this,
							Part2ViewsRepository.CustomRealTypeElementType.Properties.min,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									Part2ViewsRepository.CustomRealTypeElementType.Properties.min,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, min.getText()));
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
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		min.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomRealTypeElementTypePropertiesEditionPartForm.this, Part2ViewsRepository.CustomRealTypeElementType.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
				}
			}
		});
		EditingUtils.setID(min, Part2ViewsRepository.CustomRealTypeElementType.Properties.min);
		EditingUtils.setEEFtype(min, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomRealTypeElementType.Properties.min, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinText

		// End of user code
		return parent;
	}

	
	protected Composite createResolutionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution, Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_ResolutionLabel);
		resolution = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		resolution.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData resolutionData = new GridData(GridData.FILL_HORIZONTAL);
		resolution.setLayoutData(resolutionData);
		resolution.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CustomRealTypeElementTypePropertiesEditionPartForm.this,
							Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resolution.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, resolution.getText()));
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
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		resolution.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomRealTypeElementTypePropertiesEditionPartForm.this, Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resolution.getText()));
				}
			}
		});
		EditingUtils.setID(resolution, Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution);
		EditingUtils.setEEFtype(resolution, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createResolutionText

		// End of user code
		return parent;
	}

	
	protected Composite createUnitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomRealTypeElementType.Properties.unit, Part2Messages.CustomRealTypeElementTypePropertiesEditionPart_UnitLabel);
		unit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		unit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.setLayoutData(unitData);
		unit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CustomRealTypeElementTypePropertiesEditionPartForm.this,
							Part2ViewsRepository.CustomRealTypeElementType.Properties.unit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									Part2ViewsRepository.CustomRealTypeElementType.Properties.unit,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, unit.getText()));
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
									CustomRealTypeElementTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		unit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomRealTypeElementTypePropertiesEditionPartForm.this, Part2ViewsRepository.CustomRealTypeElementType.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
				}
			}
		});
		EditingUtils.setID(unit, Part2ViewsRepository.CustomRealTypeElementType.Properties.unit);
		EditingUtils.setEEFtype(unit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUnitText

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
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomRealTypeElementType.Properties.name, newValue);
		if (eefElementEditorDefaultValueState) {
			name.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			name.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomRealTypeElementType.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(Part2Messages.CustomRealTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#getMax()
	 * 
	 */
	public String getMax() {
		return max.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#setMax(String newValue)
	 * 
	 */
	public void setMax(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomRealTypeElementType.Properties.max, newValue);
		if (eefElementEditorDefaultValueState) {
			max.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			max.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			max.setText(newValue);
		} else {
			max.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomRealTypeElementType.Properties.max);
		if (eefElementEditorReadOnlyState && max.isEnabled()) {
			max.setEnabled(false);
			max.setToolTipText(Part2Messages.CustomRealTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !max.isEnabled()) {
			max.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#getMin()
	 * 
	 */
	public String getMin() {
		return min.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#setMin(String newValue)
	 * 
	 */
	public void setMin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomRealTypeElementType.Properties.min, newValue);
		if (eefElementEditorDefaultValueState) {
			min.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			min.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			min.setText(newValue);
		} else {
			min.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomRealTypeElementType.Properties.min);
		if (eefElementEditorReadOnlyState && min.isEnabled()) {
			min.setEnabled(false);
			min.setToolTipText(Part2Messages.CustomRealTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !min.isEnabled()) {
			min.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#getResolution()
	 * 
	 */
	public String getResolution() {
		return resolution.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#setResolution(String newValue)
	 * 
	 */
	public void setResolution(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution, newValue);
		if (eefElementEditorDefaultValueState) {
			resolution.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			resolution.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			resolution.setText(newValue);
		} else {
			resolution.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution);
		if (eefElementEditorReadOnlyState && resolution.isEnabled()) {
			resolution.setEnabled(false);
			resolution.setToolTipText(Part2Messages.CustomRealTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resolution.isEnabled()) {
			resolution.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#getUnit()
	 * 
	 */
	public String getUnit() {
		return unit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomRealTypeElementTypePropertiesEditionPart#setUnit(String newValue)
	 * 
	 */
	public void setUnit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit, newValue);
		if (eefElementEditorDefaultValueState) {
			unit.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			unit.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			unit.setText(newValue);
		} else {
			unit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit);
		if (eefElementEditorReadOnlyState && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(Part2Messages.CustomRealTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.CustomRealTypeElementType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
