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
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.resource.JFaceResources;
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
import org.polarsys.ng661designer.dsl.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class CustomIntegerTypeElementTypePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CustomIntegerTypeElementTypePropertiesEditionPart {

	protected Text name;
	protected Text max;
	protected Text min;
	protected Text resolution;
	protected Text unit;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CustomIntegerTypeElementTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence customIntegerTypeElementTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = customIntegerTypeElementTypeStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name);
		propertiesStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max);
		propertiesStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min);
		propertiesStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution);
		propertiesStep.addStep(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit);
		
		
		composer = new PartComposer(customIntegerTypeElementTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name) {
					return createNameText(parent);
				}
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max) {
					return createMaxText(parent);
				}
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min) {
					return createMinText(parent);
				}
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution) {
					return createResolutionText(parent);
				}
				if (key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit) {
					return createUnitText(parent);
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
		propertiesGroup.setText(Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name, Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max, Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_MaxLabel);
		max = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxData = new GridData(GridData.FILL_HORIZONTAL);
		max.setLayoutData(maxData);
		max.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
			}

		});
		max.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
				}
			}

		});
		EditingUtils.setID(max, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max);
		EditingUtils.setEEFtype(max, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxText

		// End of user code
		return parent;
	}

	
	protected Composite createMinText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min, Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_MinLabel);
		min = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData minData = new GridData(GridData.FILL_HORIZONTAL);
		min.setLayoutData(minData);
		min.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
			}

		});
		min.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
				}
			}

		});
		EditingUtils.setID(min, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min);
		EditingUtils.setEEFtype(min, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinText

		// End of user code
		return parent;
	}

	
	protected Composite createResolutionText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution, Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_ResolutionLabel);
		resolution = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData resolutionData = new GridData(GridData.FILL_HORIZONTAL);
		resolution.setLayoutData(resolutionData);
		resolution.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resolution.getText()));
			}

		});
		resolution.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resolution.getText()));
				}
			}

		});
		EditingUtils.setID(resolution, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution);
		EditingUtils.setEEFtype(resolution, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createResolutionText

		// End of user code
		return parent;
	}

	
	protected Composite createUnitText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit, Part2Messages.CustomIntegerTypeElementTypePropertiesEditionPart_UnitLabel);
		unit = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.setLayoutData(unitData);
		unit.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
			}

		});
		unit.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CustomIntegerTypeElementTypePropertiesEditionPartImpl.this, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
				}
			}

		});
		EditingUtils.setID(unit, Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit);
		EditingUtils.setEEFtype(unit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(Part2Messages.CustomIntegerTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#getMax()
	 * 
	 */
	public String getMax() {
		return max.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#setMax(String newValue)
	 * 
	 */
	public void setMax(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max);
		if (eefElementEditorReadOnlyState && max.isEnabled()) {
			max.setEnabled(false);
			max.setToolTipText(Part2Messages.CustomIntegerTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !max.isEnabled()) {
			max.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#getMin()
	 * 
	 */
	public String getMin() {
		return min.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#setMin(String newValue)
	 * 
	 */
	public void setMin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min);
		if (eefElementEditorReadOnlyState && min.isEnabled()) {
			min.setEnabled(false);
			min.setToolTipText(Part2Messages.CustomIntegerTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !min.isEnabled()) {
			min.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#getResolution()
	 * 
	 */
	public String getResolution() {
		return resolution.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#setResolution(String newValue)
	 * 
	 */
	public void setResolution(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution);
		if (eefElementEditorReadOnlyState && resolution.isEnabled()) {
			resolution.setEnabled(false);
			resolution.setToolTipText(Part2Messages.CustomIntegerTypeElementType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resolution.isEnabled()) {
			resolution.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#getUnit()
	 * 
	 */
	public String getUnit() {
		return unit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart#setUnit(String newValue)
	 * 
	 */
	public void setUnit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit);
		if (eefElementEditorReadOnlyState && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(Part2Messages.CustomIntegerTypeElementType_ReadOnly);
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
		return Part2Messages.CustomIntegerTypeElementType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
