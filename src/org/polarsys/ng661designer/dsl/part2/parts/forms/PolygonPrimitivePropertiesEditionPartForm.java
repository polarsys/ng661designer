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
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PolygonPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class PolygonPrimitivePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, PolygonPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text points;
	protected Text drawingPriority;
	protected Text fill;
	protected Text fillOpacity;
	protected Text fillRule;
	protected Text stroke;
	protected Text strokeDasharray;
	protected Text strokeDashoffset;
	protected Text strokeLinecap;
	protected Text strokeLinejoin;
	protected Text strokeMiterlimit;
	protected Text strokeOpacity;
	protected Text strokewidth;
	protected Text transform;
	protected Text visibility;



	/**
	 * For {@link ISection} use only.
	 */
	public PolygonPrimitivePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PolygonPrimitivePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence polygonPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = polygonPrimitiveStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.points);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.fill);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.stroke);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.PolygonPrimitive.Properties.visibility);
		
		
		composer = new PartComposer(polygonPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.points) {
					return createPointsText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority) {
					return createDrawingPriorityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.fill) {
					return createFillText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity) {
					return createFillOpacityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.fillRule) {
					return createFillRuleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.stroke) {
					return createStrokeText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray) {
					return createStrokeDasharrayText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset) {
					return createStrokeDashoffsetText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap) {
					return createStrokeLinecapText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin) {
					return createStrokeLinejoinText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit) {
					return createStrokeMiterlimitText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity) {
					return createStrokeOpacityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth) {
					return createStrokewidthText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.transform) {
					return createTransformText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.PolygonPrimitive.Properties.visibility) {
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
		propertiesSection.setText(Part2Messages.PolygonPrimitivePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.id, Part2Messages.PolygonPrimitivePropertiesEditionPart_IdLabel);
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
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.id,
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
									PolygonPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Part2ViewsRepository.PolygonPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.id, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createPointsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.points, Part2Messages.PolygonPrimitivePropertiesEditionPart_PointsLabel);
		points = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		points.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData pointsData = new GridData(GridData.FILL_HORIZONTAL);
		points.setLayoutData(pointsData);
		points.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.points,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, points.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.points,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, points.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		points.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.points, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, points.getText()));
				}
			}
		});
		EditingUtils.setID(points, Part2ViewsRepository.PolygonPrimitive.Properties.points);
		EditingUtils.setEEFtype(points, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.points, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPointsText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority, Part2Messages.PolygonPrimitivePropertiesEditionPart_DrawingPriorityLabel);
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
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority,
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
									PolygonPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}
		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.fill, Part2Messages.PolygonPrimitivePropertiesEditionPart_FillLabel);
		fill = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fill.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fillData = new GridData(GridData.FILL_HORIZONTAL);
		fill.setLayoutData(fillData);
		fill.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.fill,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.fill,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fill.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fill.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
				}
			}
		});
		EditingUtils.setID(fill, Part2ViewsRepository.PolygonPrimitive.Properties.fill);
		EditingUtils.setEEFtype(fill, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.fill, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillText

		// End of user code
		return parent;
	}

	
	protected Composite createFillOpacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity, Part2Messages.PolygonPrimitivePropertiesEditionPart_FillOpacityLabel);
		fillOpacity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fillOpacity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fillOpacityData = new GridData(GridData.FILL_HORIZONTAL);
		fillOpacity.setLayoutData(fillOpacityData);
		fillOpacity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fillOpacity.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fillOpacity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
				}
			}
		});
		EditingUtils.setID(fillOpacity, Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity);
		EditingUtils.setEEFtype(fillOpacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillRuleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.fillRule, Part2Messages.PolygonPrimitivePropertiesEditionPart_FillRuleLabel);
		fillRule = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fillRule.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fillRuleData = new GridData(GridData.FILL_HORIZONTAL);
		fillRule.setLayoutData(fillRuleData);
		fillRule.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.fillRule,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.fillRule,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fillRule.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fillRule.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
				}
			}
		});
		EditingUtils.setID(fillRule, Part2ViewsRepository.PolygonPrimitive.Properties.fillRule);
		EditingUtils.setEEFtype(fillRule, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.stroke, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeLabel);
		stroke = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		stroke.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeData = new GridData(GridData.FILL_HORIZONTAL);
		stroke.setLayoutData(strokeData);
		stroke.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.stroke,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.stroke,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, stroke.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		stroke.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
				}
			}
		});
		EditingUtils.setID(stroke, Part2ViewsRepository.PolygonPrimitive.Properties.stroke);
		EditingUtils.setEEFtype(stroke, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.stroke, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDasharrayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeDasharrayLabel);
		strokeDasharray = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeDasharray.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeDasharrayData = new GridData(GridData.FILL_HORIZONTAL);
		strokeDasharray.setLayoutData(strokeDasharrayData);
		strokeDasharray.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeDasharray.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeDasharray.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
				}
			}
		});
		EditingUtils.setID(strokeDasharray, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray);
		EditingUtils.setEEFtype(strokeDasharray, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDasharrayText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDashoffsetText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeDashoffsetLabel);
		strokeDashoffset = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeDashoffset.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeDashoffsetData = new GridData(GridData.FILL_HORIZONTAL);
		strokeDashoffset.setLayoutData(strokeDashoffsetData);
		strokeDashoffset.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeDashoffset.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeDashoffset.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
				}
			}
		});
		EditingUtils.setID(strokeDashoffset, Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset);
		EditingUtils.setEEFtype(strokeDashoffset, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDashoffsetText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinecapText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeLinecapLabel);
		strokeLinecap = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeLinecap.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeLinecapData = new GridData(GridData.FILL_HORIZONTAL);
		strokeLinecap.setLayoutData(strokeLinecapData);
		strokeLinecap.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeLinecap.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeLinecap.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
				}
			}
		});
		EditingUtils.setID(strokeLinecap, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap);
		EditingUtils.setEEFtype(strokeLinecap, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinecapText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinejoinText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeLinejoinLabel);
		strokeLinejoin = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeLinejoin.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeLinejoinData = new GridData(GridData.FILL_HORIZONTAL);
		strokeLinejoin.setLayoutData(strokeLinejoinData);
		strokeLinejoin.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeLinejoin.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeLinejoin.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
				}
			}
		});
		EditingUtils.setID(strokeLinejoin, Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin);
		EditingUtils.setEEFtype(strokeLinejoin, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinejoinText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeMiterlimitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeMiterlimitLabel);
		strokeMiterlimit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeMiterlimit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeMiterlimitData = new GridData(GridData.FILL_HORIZONTAL);
		strokeMiterlimit.setLayoutData(strokeMiterlimitData);
		strokeMiterlimit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeMiterlimit.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeMiterlimit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
				}
			}
		});
		EditingUtils.setID(strokeMiterlimit, Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit);
		EditingUtils.setEEFtype(strokeMiterlimit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeMiterlimitText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeOpacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokeOpacityLabel);
		strokeOpacity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokeOpacity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokeOpacityData = new GridData(GridData.FILL_HORIZONTAL);
		strokeOpacity.setLayoutData(strokeOpacityData);
		strokeOpacity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokeOpacity.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokeOpacity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
				}
			}
		});
		EditingUtils.setID(strokeOpacity, Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity);
		EditingUtils.setEEFtype(strokeOpacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokewidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth, Part2Messages.PolygonPrimitivePropertiesEditionPart_StrokewidthLabel);
		strokewidth = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		strokewidth.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData strokewidthData = new GridData(GridData.FILL_HORIZONTAL);
		strokewidth.setLayoutData(strokewidthData);
		strokewidth.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, strokewidth.getText()));
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
									PolygonPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		strokewidth.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
				}
			}
		});
		EditingUtils.setID(strokewidth, Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth);
		EditingUtils.setEEFtype(strokewidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokewidthText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.transform, Part2Messages.PolygonPrimitivePropertiesEditionPart_TransformLabel);
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
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.transform,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.transform,
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
									PolygonPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}
		});
		EditingUtils.setID(transform, Part2ViewsRepository.PolygonPrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.transform, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.PolygonPrimitive.Properties.visibility, Part2Messages.PolygonPrimitivePropertiesEditionPart_VisibilityLabel);
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
							PolygonPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.PolygonPrimitive.Properties.visibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PolygonPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.PolygonPrimitive.Properties.visibility,
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
									PolygonPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PolygonPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.PolygonPrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}
		});
		EditingUtils.setID(visibility, Part2ViewsRepository.PolygonPrimitive.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.PolygonPrimitive.Properties.visibility, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getPoints()
	 * 
	 */
	public String getPoints() {
		return points.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setPoints(String newValue)
	 * 
	 */
	public void setPoints(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.points, newValue);
		if (eefElementEditorDefaultValueState) {
			points.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			points.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			points.setText(newValue);
		} else {
			points.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.points);
		if (eefElementEditorReadOnlyState && points.isEnabled()) {
			points.setEnabled(false);
			points.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !points.isEnabled()) {
			points.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getFill()
	 * 
	 */
	public String getFill() {
		return fill.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setFill(String newValue)
	 * 
	 */
	public void setFill(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.fill, newValue);
		if (eefElementEditorDefaultValueState) {
			fill.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fill.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fill.setText(newValue);
		} else {
			fill.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.fill);
		if (eefElementEditorReadOnlyState && fill.isEnabled()) {
			fill.setEnabled(false);
			fill.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fill.isEnabled()) {
			fill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getFillOpacity()
	 * 
	 */
	public String getFillOpacity() {
		return fillOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setFillOpacity(String newValue)
	 * 
	 */
	public void setFillOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity, newValue);
		if (eefElementEditorDefaultValueState) {
			fillOpacity.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fillOpacity.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fillOpacity.setText(newValue);
		} else {
			fillOpacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity);
		if (eefElementEditorReadOnlyState && fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(false);
			fillOpacity.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getFillRule()
	 * 
	 */
	public String getFillRule() {
		return fillRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setFillRule(String newValue)
	 * 
	 */
	public void setFillRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule, newValue);
		if (eefElementEditorDefaultValueState) {
			fillRule.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fillRule.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fillRule.setText(newValue);
		} else {
			fillRule.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule);
		if (eefElementEditorReadOnlyState && fillRule.isEnabled()) {
			fillRule.setEnabled(false);
			fillRule.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillRule.isEnabled()) {
			fillRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStroke()
	 * 
	 */
	public String getStroke() {
		return stroke.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStroke(String newValue)
	 * 
	 */
	public void setStroke(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.stroke, newValue);
		if (eefElementEditorDefaultValueState) {
			stroke.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			stroke.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			stroke.setText(newValue);
		} else {
			stroke.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.stroke);
		if (eefElementEditorReadOnlyState && stroke.isEnabled()) {
			stroke.setEnabled(false);
			stroke.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stroke.isEnabled()) {
			stroke.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeDasharray()
	 * 
	 */
	public String getStrokeDasharray() {
		return strokeDasharray.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeDasharray(String newValue)
	 * 
	 */
	public void setStrokeDasharray(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeDasharray.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeDasharray.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeDasharray.setText(newValue);
		} else {
			strokeDasharray.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray);
		if (eefElementEditorReadOnlyState && strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(false);
			strokeDasharray.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeDashoffset()
	 * 
	 */
	public String getStrokeDashoffset() {
		return strokeDashoffset.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeDashoffset(String newValue)
	 * 
	 */
	public void setStrokeDashoffset(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeDashoffset.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeDashoffset.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeDashoffset.setText(newValue);
		} else {
			strokeDashoffset.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset);
		if (eefElementEditorReadOnlyState && strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(false);
			strokeDashoffset.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeLinecap()
	 * 
	 */
	public String getStrokeLinecap() {
		return strokeLinecap.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeLinecap(String newValue)
	 * 
	 */
	public void setStrokeLinecap(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeLinecap.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeLinecap.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeLinecap.setText(newValue);
		} else {
			strokeLinecap.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap);
		if (eefElementEditorReadOnlyState && strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(false);
			strokeLinecap.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeLinejoin()
	 * 
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeLinejoin(String newValue)
	 * 
	 */
	public void setStrokeLinejoin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeLinejoin.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeLinejoin.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeLinejoin.setText(newValue);
		} else {
			strokeLinejoin.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin);
		if (eefElementEditorReadOnlyState && strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(false);
			strokeLinejoin.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeMiterlimit()
	 * 
	 */
	public String getStrokeMiterlimit() {
		return strokeMiterlimit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeMiterlimit(String newValue)
	 * 
	 */
	public void setStrokeMiterlimit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeMiterlimit.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeMiterlimit.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeMiterlimit.setText(newValue);
		} else {
			strokeMiterlimit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit);
		if (eefElementEditorReadOnlyState && strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(false);
			strokeMiterlimit.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokeOpacity()
	 * 
	 */
	public String getStrokeOpacity() {
		return strokeOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokeOpacity(String newValue)
	 * 
	 */
	public void setStrokeOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity, newValue);
		if (eefElementEditorDefaultValueState) {
			strokeOpacity.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokeOpacity.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokeOpacity.setText(newValue);
		} else {
			strokeOpacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity);
		if (eefElementEditorReadOnlyState && strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(false);
			strokeOpacity.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getStrokewidth()
	 * 
	 */
	public String getStrokewidth() {
		return strokewidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setStrokewidth(String newValue)
	 * 
	 */
	public void setStrokewidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth, newValue);
		if (eefElementEditorDefaultValueState) {
			strokewidth.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			strokewidth.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			strokewidth.setText(newValue);
		} else {
			strokewidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth);
		if (eefElementEditorReadOnlyState && strokewidth.isEnabled()) {
			strokewidth.setEnabled(false);
			strokewidth.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokewidth.isEnabled()) {
			strokewidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.PolygonPrimitivePropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.PolygonPrimitive.Properties.visibility, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.PolygonPrimitive.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.PolygonPrimitive_ReadOnly);
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
		return Part2Messages.PolygonPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
