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
import org.polarsys.ng661designer.dsl.part2.parts.ChildPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ChildPrimitivePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, ChildPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text drawingPriority;
	protected Text maxNumberOfChildren;
	protected Text priority;
	protected Text transform;
	protected Text visibility;



	/**
	 * For {@link ISection} use only.
	 */
	public ChildPrimitivePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChildPrimitivePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence childPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = childPrimitiveStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.priority);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.ChildPrimitive.Properties.visibility);
		
		
		composer = new PartComposer(childPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority) {
					return createDrawingPriorityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren) {
					return createMaxNumberOfChildrenText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.priority) {
					return createPriorityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.transform) {
					return createTransformText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ChildPrimitive.Properties.visibility) {
					return createVisibilityText(widgetFactory, parent);
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
		propertiesSection.setText(Part2Messages.ChildPrimitivePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.id, Part2Messages.ChildPrimitivePropertiesEditionPart_IdLabel);
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
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.id,
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
									ChildPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Part2ViewsRepository.ChildPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.id, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority, Part2Messages.ChildPrimitivePropertiesEditionPart_DrawingPriorityLabel);
		drawingPriority = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		drawingPriority.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData drawingPriorityData = new GridData(GridData.FILL_HORIZONTAL);
		drawingPriority.setLayoutData(drawingPriorityData);
		drawingPriority.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, drawingPriority.getText()));
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
									ChildPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		drawingPriority.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}
		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxNumberOfChildrenText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren, Part2Messages.ChildPrimitivePropertiesEditionPart_MaxNumberOfChildrenLabel);
		maxNumberOfChildren = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxNumberOfChildren.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxNumberOfChildrenData = new GridData(GridData.FILL_HORIZONTAL);
		maxNumberOfChildren.setLayoutData(maxNumberOfChildrenData);
		maxNumberOfChildren.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxNumberOfChildren.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxNumberOfChildren.getText()));
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
									ChildPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxNumberOfChildren.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxNumberOfChildren.getText()));
				}
			}
		});
		EditingUtils.setID(maxNumberOfChildren, Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren);
		EditingUtils.setEEFtype(maxNumberOfChildren, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxNumberOfChildrenText

		// End of user code
		return parent;
	}

	
	protected Composite createPriorityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.priority, Part2Messages.ChildPrimitivePropertiesEditionPart_PriorityLabel);
		priority = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		priority.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData priorityData = new GridData(GridData.FILL_HORIZONTAL);
		priority.setLayoutData(priorityData);
		priority.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.priority,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.priority,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, priority.getText()));
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
									ChildPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		priority.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.priority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
				}
			}
		});
		EditingUtils.setID(priority, Part2ViewsRepository.ChildPrimitive.Properties.priority);
		EditingUtils.setEEFtype(priority, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.priority, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.transform, Part2Messages.ChildPrimitivePropertiesEditionPart_TransformLabel);
		transform = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transform.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transformData = new GridData(GridData.FILL_HORIZONTAL);
		transform.setLayoutData(transformData);
		transform.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.transform,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.transform,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transform.getText()));
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
									ChildPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transform.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}
		});
		EditingUtils.setID(transform, Part2ViewsRepository.ChildPrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.transform, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ChildPrimitive.Properties.visibility, Part2Messages.ChildPrimitivePropertiesEditionPart_VisibilityLabel);
		visibility = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		visibility.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.setLayoutData(visibilityData);
		visibility.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChildPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ChildPrimitive.Properties.visibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChildPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ChildPrimitive.Properties.visibility,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, visibility.getText()));
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
									ChildPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		visibility.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChildPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ChildPrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}
		});
		EditingUtils.setID(visibility, Part2ViewsRepository.ChildPrimitive.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ChildPrimitive.Properties.visibility, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityText

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
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority, newValue);
		if (eefElementEditorDefaultValueState) {
			drawingPriority.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			drawingPriority.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			drawingPriority.setText(newValue);
		} else {
			drawingPriority.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getMaxNumberOfChildren()
	 * 
	 */
	public String getMaxNumberOfChildren() {
		return maxNumberOfChildren.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setMaxNumberOfChildren(String newValue)
	 * 
	 */
	public void setMaxNumberOfChildren(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren, newValue);
		if (eefElementEditorDefaultValueState) {
			maxNumberOfChildren.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			maxNumberOfChildren.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			maxNumberOfChildren.setText(newValue);
		} else {
			maxNumberOfChildren.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren);
		if (eefElementEditorReadOnlyState && maxNumberOfChildren.isEnabled()) {
			maxNumberOfChildren.setEnabled(false);
			maxNumberOfChildren.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxNumberOfChildren.isEnabled()) {
			maxNumberOfChildren.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getPriority()
	 * 
	 */
	public String getPriority() {
		return priority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setPriority(String newValue)
	 * 
	 */
	public void setPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.priority, newValue);
		if (eefElementEditorDefaultValueState) {
			priority.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			priority.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			priority.setText(newValue);
		} else {
			priority.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.priority);
		if (eefElementEditorReadOnlyState && priority.isEnabled()) {
			priority.setEnabled(false);
			priority.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !priority.isEnabled()) {
			priority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.transform, newValue);
		if (eefElementEditorDefaultValueState) {
			transform.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			transform.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			transform.setText(newValue);
		} else {
			transform.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ChildPrimitivePropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ChildPrimitive.Properties.visibility, newValue);
		if (eefElementEditorDefaultValueState) {
			visibility.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			visibility.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			visibility.setText(newValue);
		} else {
			visibility.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ChildPrimitive.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.ChildPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.ChildPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
