/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.parts.impl;

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
import org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.providers.ScxmlMessages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScxmlScxmlTypePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ScxmlScxmlTypePropertiesEditionPart {

	protected Text id;
	protected Text version;
	protected Text initial;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlScxmlTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scxmlScxmlTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scxmlScxmlTypeStep.addStep(ScxmlViewsRepository.ScxmlScxmlType.Properties.class);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScxmlType.Properties.id);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScxmlType.Properties.version);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial);
		
		
		composer = new PartComposer(scxmlScxmlTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScxmlViewsRepository.ScxmlScxmlType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScxmlType.Properties.id) {
					return createIdText(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScxmlType.Properties.version) {
					return createVersionText(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScxmlType.Properties.initial) {
					return createInitialText(parent);
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
		propertiesGroup.setText(ScxmlMessages.ScxmlScxmlTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScxmlType.Properties.id, ScxmlMessages.ScxmlScxmlTypePropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, ScxmlViewsRepository.ScxmlScxmlType.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScxmlType.Properties.id, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScxmlType.Properties.version, ScxmlMessages.ScxmlScxmlTypePropertiesEditionPart_VersionLabel);
		version = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, ScxmlViewsRepository.ScxmlScxmlType.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScxmlType.Properties.version, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createInitialText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScxmlType.Properties.initial, ScxmlMessages.ScxmlScxmlTypePropertiesEditionPart_InitialLabel);
		initial = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData initialData = new GridData(GridData.FILL_HORIZONTAL);
		initial.setLayoutData(initialData);
		initial.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.initial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, initial.getText()));
			}

		});
		initial.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScxmlTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScxmlType.Properties.initial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, initial.getText()));
				}
			}

		});
		EditingUtils.setID(initial, ScxmlViewsRepository.ScxmlScxmlType.Properties.initial);
		EditingUtils.setEEFtype(initial, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInitialText

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
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScxmlType.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScxmlType.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ScxmlMessages.ScxmlScxmlType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScxmlType.Properties.version, newValue);
		if (eefElementEditorDefaultValueState) {
			version.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			version.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScxmlType.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(ScxmlMessages.ScxmlScxmlType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#getInitial()
	 * 
	 */
	public String getInitial() {
		return initial.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart#setInitial(String newValue)
	 * 
	 */
	public void setInitial(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial, newValue);
		if (eefElementEditorDefaultValueState) {
			initial.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			initial.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			initial.setText(newValue);
		} else {
			initial.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial);
		if (eefElementEditorReadOnlyState && initial.isEnabled()) {
			initial.setEnabled(false);
			initial.setToolTipText(ScxmlMessages.ScxmlScxmlType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !initial.isEnabled()) {
			initial.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScxmlMessages.ScxmlScxmlType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
