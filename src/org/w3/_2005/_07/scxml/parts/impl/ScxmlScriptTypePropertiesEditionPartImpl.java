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
import org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.providers.ScxmlMessages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScxmlScriptTypePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ScxmlScriptTypePropertiesEditionPart {

	protected Text src;
	protected Text content;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlScriptTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scxmlScriptTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scxmlScriptTypeStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.class);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		
		
		composer = new PartComposer(scxmlScriptTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.src) {
					return createSrcText(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.content) {
					return createContentText(parent);
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
		propertiesGroup.setText(ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSrcText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScriptType.Properties.src, ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_SrcLabel);
		src = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData srcData = new GridData(GridData.FILL_HORIZONTAL);
		src.setLayoutData(srcData);
		src.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
			}

		});
		src.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
				}
			}

		});
		EditingUtils.setID(src, ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		EditingUtils.setEEFtype(src, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.src, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSrcText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScriptType.Properties.content, ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_ContentLabel);
		content = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScriptType.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlScriptType.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.content, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

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
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#getSrc()
	 * 
	 */
	public String getSrc() {
		return src.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setSrc(String newValue)
	 * 
	 */
	public void setSrc(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScriptType.Properties.src, newValue);
		if (eefElementEditorDefaultValueState) {
			src.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			src.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			src.setText(newValue);
		} else {
			src.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		if (eefElementEditorReadOnlyState && src.isEnabled()) {
			src.setEnabled(false);
			src.setToolTipText(ScxmlMessages.ScxmlScriptType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !src.isEnabled()) {
			src.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScriptType.Properties.content, newValue);
		if (eefElementEditorDefaultValueState) {
			content.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			content.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ScxmlMessages.ScxmlScriptType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScxmlMessages.ScxmlScriptType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
