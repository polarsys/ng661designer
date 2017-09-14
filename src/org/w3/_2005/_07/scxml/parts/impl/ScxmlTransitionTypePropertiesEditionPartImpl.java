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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.providers.ScxmlMessages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScxmlTransitionTypePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ScxmlTransitionTypePropertiesEditionPart {

	protected ReferencesTable send;
	protected List<ViewerFilter> sendBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sendFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable script;
	protected List<ViewerFilter> scriptBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> scriptFilters = new ArrayList<ViewerFilter>();
	protected Text cond;
	protected Text event;
	protected Text target;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlTransitionTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scxmlTransitionTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scxmlTransitionTypeStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.class);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.send);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.script);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.event);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlTransitionType.Properties.target);
		
		
		composer = new PartComposer(scxmlTransitionTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.send) {
					return createSendAdvancedTableComposition(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.script) {
					return createScriptAdvancedTableComposition(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.cond) {
					return createCondText(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.event) {
					return createEventText(parent);
				}
				if (key == ScxmlViewsRepository.ScxmlTransitionType.Properties.target) {
					return createTargetText(parent);
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
		propertiesGroup.setText(ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSendAdvancedTableComposition(Composite parent) {
		this.send = new ReferencesTable(getDescription(ScxmlViewsRepository.ScxmlTransitionType.Properties.send, ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_SendLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				send.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				send.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				send.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				send.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sendFilters) {
			this.send.addFilter(filter);
		}
		this.send.setHelpText(propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlTransitionType.Properties.send, ScxmlViewsRepository.SWT_KIND));
		this.send.createControls(parent);
		this.send.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.send, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sendData = new GridData(GridData.FILL_HORIZONTAL);
		sendData.horizontalSpan = 3;
		this.send.setLayoutData(sendData);
		this.send.setLowerBound(0);
		this.send.setUpperBound(-1);
		send.setID(ScxmlViewsRepository.ScxmlTransitionType.Properties.send);
		send.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSendAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createScriptAdvancedTableComposition(Composite parent) {
		this.script = new ReferencesTable(getDescription(ScxmlViewsRepository.ScxmlTransitionType.Properties.script, ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_ScriptLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				script.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				script.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				script.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				script.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.scriptFilters) {
			this.script.addFilter(filter);
		}
		this.script.setHelpText(propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlTransitionType.Properties.script, ScxmlViewsRepository.SWT_KIND));
		this.script.createControls(parent);
		this.script.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.script, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData scriptData = new GridData(GridData.FILL_HORIZONTAL);
		scriptData.horizontalSpan = 3;
		this.script.setLayoutData(scriptData);
		this.script.setLowerBound(0);
		this.script.setUpperBound(-1);
		script.setID(ScxmlViewsRepository.ScxmlTransitionType.Properties.script);
		script.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createScriptAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCondText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlTransitionType.Properties.cond, ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_CondLabel);
		cond = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData condData = new GridData(GridData.FILL_HORIZONTAL);
		cond.setLayoutData(condData);
		cond.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.cond, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cond.getText()));
			}

		});
		cond.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.cond, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cond.getText()));
				}
			}

		});
		EditingUtils.setID(cond, ScxmlViewsRepository.ScxmlTransitionType.Properties.cond);
		EditingUtils.setEEFtype(cond, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCondText

		// End of user code
		return parent;
	}

	
	protected Composite createEventText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlTransitionType.Properties.event, ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_EventLabel);
		event = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		event.setLayoutData(eventData);
		event.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
			}

		});
		event.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
				}
			}

		});
		EditingUtils.setID(event, ScxmlViewsRepository.ScxmlTransitionType.Properties.event);
		EditingUtils.setEEFtype(event, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlTransitionType.Properties.event, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEventText

		// End of user code
		return parent;
	}

	
	protected Composite createTargetText(Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlTransitionType.Properties.target, ScxmlMessages.ScxmlTransitionTypePropertiesEditionPart_TargetLabel);
		target = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
			}

		});
		target.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlTransitionTypePropertiesEditionPartImpl.this, ScxmlViewsRepository.ScxmlTransitionType.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}

		});
		EditingUtils.setID(target, ScxmlViewsRepository.ScxmlTransitionType.Properties.target);
		EditingUtils.setEEFtype(target, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlTransitionType.Properties.target, ScxmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTargetText

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
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#initSend(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSend(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		send.setContentProvider(contentProvider);
		send.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlTransitionType.Properties.send);
		if (eefElementEditorReadOnlyState && send.isEnabled()) {
			send.setEnabled(false);
			send.setToolTipText(ScxmlMessages.ScxmlTransitionType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !send.isEnabled()) {
			send.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#updateSend()
	 * 
	 */
	public void updateSend() {
	send.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#addFilterSend(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSend(ViewerFilter filter) {
		sendFilters.add(filter);
		if (this.send != null) {
			this.send.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#addBusinessFilterSend(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSend(ViewerFilter filter) {
		sendBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#isContainedInSendTable(EObject element)
	 * 
	 */
	public boolean isContainedInSendTable(EObject element) {
		return ((ReferencesTableSettings)send.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#initScript(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initScript(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		script.setContentProvider(contentProvider);
		script.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlTransitionType.Properties.script);
		if (eefElementEditorReadOnlyState && script.isEnabled()) {
			script.setEnabled(false);
			script.setToolTipText(ScxmlMessages.ScxmlTransitionType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !script.isEnabled()) {
			script.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#updateScript()
	 * 
	 */
	public void updateScript() {
	script.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#addFilterScript(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScript(ViewerFilter filter) {
		scriptFilters.add(filter);
		if (this.script != null) {
			this.script.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#addBusinessFilterScript(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScript(ViewerFilter filter) {
		scriptBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#isContainedInScriptTable(EObject element)
	 * 
	 */
	public boolean isContainedInScriptTable(EObject element) {
		return ((ReferencesTableSettings)script.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#getCond()
	 * 
	 */
	public String getCond() {
		return cond.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#setCond(String newValue)
	 * 
	 */
	public void setCond(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond, newValue);
		if (eefElementEditorDefaultValueState) {
			cond.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			cond.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			cond.setText(newValue);
		} else {
			cond.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond);
		if (eefElementEditorReadOnlyState && cond.isEnabled()) {
			cond.setEnabled(false);
			cond.setToolTipText(ScxmlMessages.ScxmlTransitionType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cond.isEnabled()) {
			cond.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#getEvent()
	 * 
	 */
	public String getEvent() {
		return event.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#setEvent(String newValue)
	 * 
	 */
	public void setEvent(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlTransitionType.Properties.event, newValue);
		if (eefElementEditorDefaultValueState) {
			event.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			event.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			event.setText(newValue);
		} else {
			event.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlTransitionType.Properties.event);
		if (eefElementEditorReadOnlyState && event.isEnabled()) {
			event.setEnabled(false);
			event.setToolTipText(ScxmlMessages.ScxmlTransitionType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !event.isEnabled()) {
			event.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#getTarget()
	 * 
	 */
	public String getTarget() {
		return target.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart#setTarget(String newValue)
	 * 
	 */
	public void setTarget(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlTransitionType.Properties.target, newValue);
		if (eefElementEditorDefaultValueState) {
			target.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			target.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			target.setText(newValue);
		} else {
			target.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlTransitionType.Properties.target);
		if (eefElementEditorReadOnlyState && target.isEnabled()) {
			target.setEnabled(false);
			target.setToolTipText(ScxmlMessages.ScxmlTransitionType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !target.isEnabled()) {
			target.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScxmlMessages.ScxmlTransitionType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
