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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
import org.polarsys.ng661designer.dsl.part2.parts.ParamTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ParamTypePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParamTypePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer modality;
	protected Text type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParamTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence paramTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = paramTypeStep.addStep(Part2ViewsRepository.ParamType.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.ParamType.Properties.name);
		propertiesStep.addStep(Part2ViewsRepository.ParamType.Properties.modality);
		propertiesStep.addStep(Part2ViewsRepository.ParamType.Properties.type);
		
		
		composer = new PartComposer(paramTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.ParamType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.ParamType.Properties.name) {
					return createNameText(parent);
				}
				if (key == Part2ViewsRepository.ParamType.Properties.modality) {
					return createModalityEMFComboViewer(parent);
				}
				if (key == Part2ViewsRepository.ParamType.Properties.type) {
					return createTypeText(parent);
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
		propertiesGroup.setText(Part2Messages.ParamTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.ParamType.Properties.name, Part2Messages.ParamTypePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParamTypePropertiesEditionPartImpl.this, Part2ViewsRepository.ParamType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParamTypePropertiesEditionPartImpl.this, Part2ViewsRepository.ParamType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Part2ViewsRepository.ParamType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ParamType.Properties.name, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createModalityEMFComboViewer(Composite parent) {
		createDescription(parent, Part2ViewsRepository.ParamType.Properties.modality, Part2Messages.ParamTypePropertiesEditionPart_ModalityLabel);
		modality = new EMFComboViewer(parent);
		modality.setContentProvider(new ArrayContentProvider());
		modality.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData modalityData = new GridData(GridData.FILL_HORIZONTAL);
		modality.getCombo().setLayoutData(modalityData);
		modality.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParamTypePropertiesEditionPartImpl.this, Part2ViewsRepository.ParamType.Properties.modality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getModality()));
			}

		});
		modality.setID(Part2ViewsRepository.ParamType.Properties.modality);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ParamType.Properties.modality, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createModalityEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.ParamType.Properties.type, Part2Messages.ParamTypePropertiesEditionPart_TypeLabel);
		type = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParamTypePropertiesEditionPartImpl.this, Part2ViewsRepository.ParamType.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParamTypePropertiesEditionPartImpl.this, Part2ViewsRepository.ParamType.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, Part2ViewsRepository.ParamType.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ParamType.Properties.type, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeText

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
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ParamType.Properties.name, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ParamType.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(Part2Messages.ParamType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#getModality()
	 * 
	 */
	public Enumerator getModality() {
		Enumerator selection = (Enumerator) ((StructuredSelection) modality.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#initModality(Object input, Enumerator current)
	 */
	public void initModality(Object input, Enumerator current) {
		modality.setInput(input);
		modality.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ParamType.Properties.modality);
		if (eefElementEditorReadOnlyState && modality.isEnabled()) {
			modality.setEnabled(false);
			modality.setToolTipText(Part2Messages.ParamType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modality.isEnabled()) {
			modality.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#setModality(Enumerator newValue)
	 * 
	 */
	public void setModality(Enumerator newValue) {
		modality.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ParamType.Properties.modality);
		if (eefElementEditorReadOnlyState && modality.isEnabled()) {
			modality.setEnabled(false);
			modality.setToolTipText(Part2Messages.ParamType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modality.isEnabled()) {
			modality.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ParamTypePropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ParamType.Properties.type, newValue);
		if (eefElementEditorDefaultValueState) {
			type.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			type.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ParamType.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(Part2Messages.ParamType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.ParamType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
