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

import java.util.ArrayList;
import java.util.List;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableColumn;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyValue;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.WidgetCompositionPropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class WidgetCompositionPropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, WidgetCompositionPropertiesEditionPart {

	protected EObjectFlatComboViewer representation;
	protected TableViewer values;
	protected List<ViewerFilter> valuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> valuesFilters = new ArrayList<ViewerFilter>();
	protected Button addValues;
	protected Button removeValues;
	protected Button editValues;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WidgetCompositionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence widgetCompositionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = widgetCompositionStep.addStep(Part2ViewsRepository.WidgetComposition.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.WidgetComposition.Properties.representation);
		propertiesStep.addStep(Part2ViewsRepository.WidgetComposition.Properties.values);
		
		
		composer = new PartComposer(widgetCompositionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.WidgetComposition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.WidgetComposition.Properties.representation) {
					return createRepresentationFlatComboViewer(parent);
				}
				if (key == Part2ViewsRepository.WidgetComposition.Properties.values) {
					return createValuesTableComposition(parent);
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
		propertiesGroup.setText(Part2Messages.WidgetCompositionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRepresentationFlatComboViewer(Composite parent) {
		createDescription(parent, Part2ViewsRepository.WidgetComposition.Properties.representation, Part2Messages.WidgetCompositionPropertiesEditionPart_RepresentationLabel);
		representation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Part2ViewsRepository.WidgetComposition.Properties.representation, Part2ViewsRepository.SWT_KIND));
		representation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WidgetCompositionPropertiesEditionPartImpl.this, Part2ViewsRepository.WidgetComposition.Properties.representation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentation()));
			}

		});
		GridData representationData = new GridData(GridData.FILL_HORIZONTAL);
		representation.setLayoutData(representationData);
		representation.setID(Part2ViewsRepository.WidgetComposition.Properties.representation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.WidgetComposition.Properties.representation, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRepresentationFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createValuesTableComposition(Composite container) {
		Composite tableContainer = new Composite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableValues = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
		tableValues.setHeaderVisible(true);
		GridData gdValues = new GridData();
		gdValues.grabExcessHorizontalSpace = true;
		gdValues.horizontalAlignment = GridData.FILL;
		gdValues.grabExcessVerticalSpace = true;
		gdValues.verticalAlignment = GridData.FILL;
		tableValues.setLayoutData(gdValues);
		tableValues.setLinesVisible(true);

		// Start of user code for columns definition for Values
		TableColumn name = new TableColumn(tableValues, SWT.NONE);
		name.setWidth(180);
		name.setText("Property"); //$NON-NLS-1$
		TableColumn myValue = new TableColumn(tableValues, SWT.NONE);
		myValue.setWidth(180);
		myValue.setText("Value"); //$NON-NLS-1$
		// End of user code

		values = new TableViewer(tableValues);
		values.setContentProvider(new ArrayContentProvider());
		values.setLabelProvider(new ITableLabelProvider() {
		//Start of user code for label provider definition for Values
		public String getColumnText(Object object, int columnIndex) {
			if (object instanceof PropertyValue) {
				switch (columnIndex) {
				case 0:
					if (((PropertyValue) object).getProperty() != null) {								
						return ((PropertyValue)object).getProperty().getName();
					}
				case 1:
					if (((PropertyValue) object).getValue() != null) {	
						return ((PropertyValue)object).getValue();
					}
				}
			}
			return ""; //$NON-NLS-1$
		}

		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		//End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		values.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (values.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) values.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WidgetCompositionPropertiesEditionPartImpl.this, Part2ViewsRepository.WidgetComposition.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						values.refresh();
					}
				}
			}

		});
		GridData valuesData = new GridData(GridData.FILL_HORIZONTAL);
		valuesData.minimumHeight = 120;
		valuesData.heightHint = 120;
		values.getTable().setLayoutData(valuesData);
		for (ViewerFilter filter : this.valuesFilters) {
			values.addFilter(filter);
		}
		EditingUtils.setID(values.getTable(), Part2ViewsRepository.WidgetComposition.Properties.values);
		EditingUtils.setEEFtype(values.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createValuesPanel(tableContainer);
		// Start of user code for createValuesTableComposition

		// End of user code
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createValuesPanel(Composite container) {
		Composite valuesPanel = new Composite(container, SWT.NONE);
		GridLayout valuesPanelLayout = new GridLayout();
		valuesPanelLayout.numColumns = 1;
		valuesPanel.setLayout(valuesPanelLayout);
		addValues = new Button(valuesPanel, SWT.NONE);
		addValues.setText(Part2Messages.PropertiesEditionPart_AddTableViewerLabel);
		GridData addValuesData = new GridData(GridData.FILL_HORIZONTAL);
		addValues.setLayoutData(addValuesData);
		addValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WidgetCompositionPropertiesEditionPartImpl.this, Part2ViewsRepository.WidgetComposition.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				values.refresh();
			}
		});
		EditingUtils.setID(addValues, Part2ViewsRepository.WidgetComposition.Properties.values);
		EditingUtils.setEEFtype(addValues, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		removeValues = new Button(valuesPanel, SWT.NONE);
		removeValues.setText(Part2Messages.PropertiesEditionPart_RemoveTableViewerLabel);
		GridData removeValuesData = new GridData(GridData.FILL_HORIZONTAL);
		removeValues.setLayoutData(removeValuesData);
		removeValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (values.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) values.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WidgetCompositionPropertiesEditionPartImpl.this, Part2ViewsRepository.WidgetComposition.Properties.values, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						values.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeValues, Part2ViewsRepository.WidgetComposition.Properties.values);
		EditingUtils.setEEFtype(removeValues, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		editValues = new Button(valuesPanel, SWT.NONE);
		editValues.setText(Part2Messages.PropertiesEditionPart_EditTableViewerLabel);
		GridData editValuesData = new GridData(GridData.FILL_HORIZONTAL);
		editValues.setLayoutData(editValuesData);
		editValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (values.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) values.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WidgetCompositionPropertiesEditionPartImpl.this, Part2ViewsRepository.WidgetComposition.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						values.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editValues, Part2ViewsRepository.WidgetComposition.Properties.values);
		EditingUtils.setEEFtype(editValues, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		// Start of user code for createValuesPanel

		// End of user code
		return valuesPanel;
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
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#getRepresentation()
	 * 
	 */
	public EObject getRepresentation() {
		if (representation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#initRepresentation(EObjectFlatComboSettings)
	 */
	public void initRepresentation(EObjectFlatComboSettings settings) {
		representation.setInput(settings);
		if (current != null) {
			representation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.WidgetComposition.Properties.representation);
		if (eefElementEditorReadOnlyState && representation.isEnabled()) {
			representation.setEnabled(false);
			representation.setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !representation.isEnabled()) {
			representation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#setRepresentation(EObject newValue)
	 * 
	 */
	public void setRepresentation(EObject newValue) {
		if (newValue != null) {
			representation.setSelection(new StructuredSelection(newValue));
		} else {
			representation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.WidgetComposition.Properties.representation);
		if (eefElementEditorReadOnlyState && representation.isEnabled()) {
			representation.setEnabled(false);
			representation.setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !representation.isEnabled()) {
			representation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#setRepresentationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentationButtonMode(ButtonsModeEnum newValue) {
		representation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#addFilterRepresentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentation(ViewerFilter filter) {
		representation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#addBusinessFilterRepresentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentation(ViewerFilter filter) {
		representation.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#initValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		values.setContentProvider(contentProvider);
		values.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.WidgetComposition.Properties.values);
		if (eefElementEditorReadOnlyState && values.getTable().isEnabled()) {
			values.getTable().setEnabled(false);
			values.getTable().setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
			addValues.setEnabled(false);
			addValues.setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
			removeValues.setEnabled(false);
			removeValues.setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
			editValues.setEnabled(false);
			editValues.setToolTipText(Part2Messages.WidgetComposition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !values.getTable().isEnabled()) {
			values.getTable().setEnabled(true);
			addValues.setEnabled(true);
			removeValues.setEnabled(true);
			editValues.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#updateValues()
	 * 
	 */
	public void updateValues() {
	values.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#addFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValues(ViewerFilter filter) {
		valuesFilters.add(filter);
		if (this.values != null) {
			this.values.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#addBusinessFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValues(ViewerFilter filter) {
		valuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.WidgetCompositionPropertiesEditionPart#isContainedInValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInValuesTable(EObject element) {
		return ((ReferencesTableSettings)values.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.WidgetComposition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
