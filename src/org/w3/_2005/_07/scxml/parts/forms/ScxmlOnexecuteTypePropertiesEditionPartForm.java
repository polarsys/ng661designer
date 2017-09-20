/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.parts.forms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.providers.ScxmlMessages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScxmlOnexecuteTypePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, ScxmlOnexecuteTypePropertiesEditionPart {

	protected ReferencesTable send;
	protected List<ViewerFilter> sendBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sendFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable script;
	protected List<ViewerFilter> scriptBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> scriptFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ScxmlOnexecuteTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlOnexecuteTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scxmlOnexecuteTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scxmlOnexecuteTypeStep.addStep(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.class);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script);
		
		
		composer = new PartComposer(scxmlOnexecuteTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScxmlViewsRepository.ScxmlOnexecuteType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send) {
					return createSendTableComposition(widgetFactory, parent);
				}
				if (key == ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script) {
					return createScriptTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ScxmlMessages.ScxmlOnexecuteTypePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param container
	 * 
	 */
	protected Composite createSendTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.send = new ReferencesTable(getDescription(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, ScxmlMessages.ScxmlOnexecuteTypePropertiesEditionPart_SendLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				send.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				send.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				send.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				send.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sendFilters) {
			this.send.addFilter(filter);
		}
		this.send.setHelpText(propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, ScxmlViewsRepository.FORM_KIND));
		this.send.createControls(parent, widgetFactory);
		this.send.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sendData = new GridData(GridData.FILL_HORIZONTAL);
		sendData.horizontalSpan = 3;
		this.send.setLayoutData(sendData);
		this.send.setLowerBound(0);
		this.send.setUpperBound(-1);
		send.setID(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send);
		send.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSendTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createScriptTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.script = new ReferencesTable(getDescription(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, ScxmlMessages.ScxmlOnexecuteTypePropertiesEditionPart_ScriptLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				script.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				script.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				script.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				script.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.scriptFilters) {
			this.script.addFilter(filter);
		}
		this.script.setHelpText(propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, ScxmlViewsRepository.FORM_KIND));
		this.script.createControls(parent, widgetFactory);
		this.script.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlOnexecuteTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData scriptData = new GridData(GridData.FILL_HORIZONTAL);
		scriptData.horizontalSpan = 3;
		this.script.setLayoutData(scriptData);
		this.script.setLowerBound(0);
		this.script.setUpperBound(-1);
		script.setID(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script);
		script.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createScriptTableComposition

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
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#initSend(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSend(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		send.setContentProvider(contentProvider);
		send.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.send);
		if (eefElementEditorReadOnlyState && send.isEnabled()) {
			send.setEnabled(false);
			send.setToolTipText(ScxmlMessages.ScxmlOnexecuteType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !send.isEnabled()) {
			send.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#updateSend()
	 * 
	 */
	public void updateSend() {
	send.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#addFilterSend(ViewerFilter filter)
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
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#addBusinessFilterSend(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSend(ViewerFilter filter) {
		sendBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#isContainedInSendTable(EObject element)
	 * 
	 */
	public boolean isContainedInSendTable(EObject element) {
		return ((ReferencesTableSettings)send.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#initScript(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initScript(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		script.setContentProvider(contentProvider);
		script.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlOnexecuteType.Properties.script);
		if (eefElementEditorReadOnlyState && script.isEnabled()) {
			script.setEnabled(false);
			script.setToolTipText(ScxmlMessages.ScxmlOnexecuteType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !script.isEnabled()) {
			script.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#updateScript()
	 * 
	 */
	public void updateScript() {
	script.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#addFilterScript(ViewerFilter filter)
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
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#addBusinessFilterScript(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScript(ViewerFilter filter) {
		scriptBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlOnexecuteTypePropertiesEditionPart#isContainedInScriptTable(EObject element)
	 * 
	 */
	public boolean isContainedInScriptTable(EObject element) {
		return ((ReferencesTableSettings)script.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScxmlMessages.ScxmlOnexecuteType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
