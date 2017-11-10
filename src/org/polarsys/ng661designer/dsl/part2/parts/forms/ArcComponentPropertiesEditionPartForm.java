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
import org.polarsys.ng661designer.dsl.part2.parts.ArcComponentPropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ArcComponentPropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, ArcComponentPropertiesEditionPart {

	protected Text id;
	protected Text angle;
	protected Text clipPath;
	protected Text clipRule;
	protected Text drawingPriority;
	protected Text fill;
	protected Text fillOpacity;
	protected Text fillRule;
	protected Text inboundAngle;
	protected Text radius;
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
	protected Text x;
	protected Text y;



	/**
	 * For {@link ISection} use only.
	 */
	public ArcComponentPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArcComponentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence arcComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = arcComponentStep.addStep(Part2ViewsRepository.ArcComponent.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.angle);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.clipPath);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.clipRule);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.fill);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.fillOpacity);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.fillRule);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.inboundAngle);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.radius);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.stroke);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.strokewidth);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.visibility);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.x);
		propertiesStep.addStep(Part2ViewsRepository.ArcComponent.Properties.y);
		
		
		composer = new PartComposer(arcComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.ArcComponent.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.angle) {
					return createAngleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.clipPath) {
					return createClipPathText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.clipRule) {
					return createClipRuleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.drawingPriority) {
					return createDrawingPriorityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.fill) {
					return createFillText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.fillOpacity) {
					return createFillOpacityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.fillRule) {
					return createFillRuleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.inboundAngle) {
					return createInboundAngleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.radius) {
					return createRadiusText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.stroke) {
					return createStrokeText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeDasharray) {
					return createStrokeDasharrayText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset) {
					return createStrokeDashoffsetText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeLinecap) {
					return createStrokeLinecapText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin) {
					return createStrokeLinejoinText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit) {
					return createStrokeMiterlimitText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokeOpacity) {
					return createStrokeOpacityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.strokewidth) {
					return createStrokewidthText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.transform) {
					return createTransformText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.visibility) {
					return createVisibilityText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.x) {
					return createXText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ArcComponent.Properties.y) {
					return createYText(widgetFactory, parent);
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
		propertiesSection.setText(Part2Messages.ArcComponentPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.id, Part2Messages.ArcComponentPropertiesEditionPart_IdLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.id,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Part2ViewsRepository.ArcComponent.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.id, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createAngleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.angle, Part2Messages.ArcComponentPropertiesEditionPart_AngleLabel);
		angle = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		angle.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData angleData = new GridData(GridData.FILL_HORIZONTAL);
		angle.setLayoutData(angleData);
		angle.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.angle,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, angle.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.angle,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, angle.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		angle.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.angle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, angle.getText()));
				}
			}
		});
		EditingUtils.setID(angle, Part2ViewsRepository.ArcComponent.Properties.angle);
		EditingUtils.setEEFtype(angle, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.angle, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAngleText

		// End of user code
		return parent;
	}

	
	protected Composite createClipPathText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.clipPath, Part2Messages.ArcComponentPropertiesEditionPart_ClipPathLabel);
		clipPath = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		clipPath.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData clipPathData = new GridData(GridData.FILL_HORIZONTAL);
		clipPath.setLayoutData(clipPathData);
		clipPath.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.clipPath,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.clipPath,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, clipPath.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		clipPath.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
				}
			}
		});
		EditingUtils.setID(clipPath, Part2ViewsRepository.ArcComponent.Properties.clipPath);
		EditingUtils.setEEFtype(clipPath, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.clipPath, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipPathText

		// End of user code
		return parent;
	}

	
	protected Composite createClipRuleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.clipRule, Part2Messages.ArcComponentPropertiesEditionPart_ClipRuleLabel);
		clipRule = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		clipRule.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData clipRuleData = new GridData(GridData.FILL_HORIZONTAL);
		clipRule.setLayoutData(clipRuleData);
		clipRule.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.clipRule,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.clipRule,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, clipRule.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		clipRule.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
				}
			}
		});
		EditingUtils.setID(clipRule, Part2ViewsRepository.ArcComponent.Properties.clipRule);
		EditingUtils.setEEFtype(clipRule, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.clipRule, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.drawingPriority, Part2Messages.ArcComponentPropertiesEditionPart_DrawingPriorityLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.drawingPriority,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.drawingPriority,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}
		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.ArcComponent.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.drawingPriority, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.fill, Part2Messages.ArcComponentPropertiesEditionPart_FillLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.fill,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.fill,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
				}
			}
		});
		EditingUtils.setID(fill, Part2ViewsRepository.ArcComponent.Properties.fill);
		EditingUtils.setEEFtype(fill, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.fill, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillText

		// End of user code
		return parent;
	}

	
	protected Composite createFillOpacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.fillOpacity, Part2Messages.ArcComponentPropertiesEditionPart_FillOpacityLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.fillOpacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.fillOpacity,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
				}
			}
		});
		EditingUtils.setID(fillOpacity, Part2ViewsRepository.ArcComponent.Properties.fillOpacity);
		EditingUtils.setEEFtype(fillOpacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.fillOpacity, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillRuleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.fillRule, Part2Messages.ArcComponentPropertiesEditionPart_FillRuleLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.fillRule,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.fillRule,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
				}
			}
		});
		EditingUtils.setID(fillRule, Part2ViewsRepository.ArcComponent.Properties.fillRule);
		EditingUtils.setEEFtype(fillRule, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.fillRule, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundAngleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.inboundAngle, Part2Messages.ArcComponentPropertiesEditionPart_InboundAngleLabel);
		inboundAngle = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundAngle.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundAngleData = new GridData(GridData.FILL_HORIZONTAL);
		inboundAngle.setLayoutData(inboundAngleData);
		inboundAngle.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.inboundAngle,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundAngle.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.inboundAngle,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundAngle.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundAngle.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.inboundAngle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundAngle.getText()));
				}
			}
		});
		EditingUtils.setID(inboundAngle, Part2ViewsRepository.ArcComponent.Properties.inboundAngle);
		EditingUtils.setEEFtype(inboundAngle, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.inboundAngle, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundAngleText

		// End of user code
		return parent;
	}

	
	protected Composite createRadiusText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.radius, Part2Messages.ArcComponentPropertiesEditionPart_RadiusLabel);
		radius = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		radius.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData radiusData = new GridData(GridData.FILL_HORIZONTAL);
		radius.setLayoutData(radiusData);
		radius.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.radius,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, radius.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.radius,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, radius.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		radius.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.radius, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, radius.getText()));
				}
			}
		});
		EditingUtils.setID(radius, Part2ViewsRepository.ArcComponent.Properties.radius);
		EditingUtils.setEEFtype(radius, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.radius, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRadiusText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.stroke, Part2Messages.ArcComponentPropertiesEditionPart_StrokeLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.stroke,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.stroke,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
				}
			}
		});
		EditingUtils.setID(stroke, Part2ViewsRepository.ArcComponent.Properties.stroke);
		EditingUtils.setEEFtype(stroke, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.stroke, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDasharrayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeDasharray, Part2Messages.ArcComponentPropertiesEditionPart_StrokeDasharrayLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeDasharray,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeDasharray,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
				}
			}
		});
		EditingUtils.setID(strokeDasharray, Part2ViewsRepository.ArcComponent.Properties.strokeDasharray);
		EditingUtils.setEEFtype(strokeDasharray, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDasharrayText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDashoffsetText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset, Part2Messages.ArcComponentPropertiesEditionPart_StrokeDashoffsetLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
				}
			}
		});
		EditingUtils.setID(strokeDashoffset, Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset);
		EditingUtils.setEEFtype(strokeDashoffset, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDashoffsetText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinecapText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeLinecap, Part2Messages.ArcComponentPropertiesEditionPart_StrokeLinecapLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeLinecap,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeLinecap,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
				}
			}
		});
		EditingUtils.setID(strokeLinecap, Part2ViewsRepository.ArcComponent.Properties.strokeLinecap);
		EditingUtils.setEEFtype(strokeLinecap, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinecapText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinejoinText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin, Part2Messages.ArcComponentPropertiesEditionPart_StrokeLinejoinLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
				}
			}
		});
		EditingUtils.setID(strokeLinejoin, Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin);
		EditingUtils.setEEFtype(strokeLinejoin, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinejoinText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeMiterlimitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit, Part2Messages.ArcComponentPropertiesEditionPart_StrokeMiterlimitLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
				}
			}
		});
		EditingUtils.setID(strokeMiterlimit, Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit);
		EditingUtils.setEEFtype(strokeMiterlimit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeMiterlimitText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeOpacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokeOpacity, Part2Messages.ArcComponentPropertiesEditionPart_StrokeOpacityLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokeOpacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokeOpacity,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
				}
			}
		});
		EditingUtils.setID(strokeOpacity, Part2ViewsRepository.ArcComponent.Properties.strokeOpacity);
		EditingUtils.setEEFtype(strokeOpacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokewidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.strokewidth, Part2Messages.ArcComponentPropertiesEditionPart_StrokewidthLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.strokewidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.strokewidth,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
				}
			}
		});
		EditingUtils.setID(strokewidth, Part2ViewsRepository.ArcComponent.Properties.strokewidth);
		EditingUtils.setEEFtype(strokewidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.strokewidth, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokewidthText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.transform, Part2Messages.ArcComponentPropertiesEditionPart_TransformLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.transform,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.transform,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}
		});
		EditingUtils.setID(transform, Part2ViewsRepository.ArcComponent.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.transform, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.visibility, Part2Messages.ArcComponentPropertiesEditionPart_VisibilityLabel);
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
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.visibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.visibility,
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
									ArcComponentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}
		});
		EditingUtils.setID(visibility, Part2ViewsRepository.ArcComponent.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.visibility, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityText

		// End of user code
		return parent;
	}

	
	protected Composite createXText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.x, Part2Messages.ArcComponentPropertiesEditionPart_XLabel);
		x = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		x.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData xData = new GridData(GridData.FILL_HORIZONTAL);
		x.setLayoutData(xData);
		x.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.x,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.x,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, x.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		x.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
				}
			}
		});
		EditingUtils.setID(x, Part2ViewsRepository.ArcComponent.Properties.x);
		EditingUtils.setEEFtype(x, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.x, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createXText

		// End of user code
		return parent;
	}

	
	protected Composite createYText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ArcComponent.Properties.y, Part2Messages.ArcComponentPropertiesEditionPart_YLabel);
		y = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		y.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData yData = new GridData(GridData.FILL_HORIZONTAL);
		y.setLayoutData(yData);
		y.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArcComponentPropertiesEditionPartForm.this,
							Part2ViewsRepository.ArcComponent.Properties.y,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArcComponentPropertiesEditionPartForm.this,
									Part2ViewsRepository.ArcComponent.Properties.y,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, y.getText()));
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
									ArcComponentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		y.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArcComponentPropertiesEditionPartForm.this, Part2ViewsRepository.ArcComponent.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
				}
			}
		});
		EditingUtils.setID(y, Part2ViewsRepository.ArcComponent.Properties.y);
		EditingUtils.setEEFtype(y, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ArcComponent.Properties.y, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createYText

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
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getAngle()
	 * 
	 */
	public String getAngle() {
		return angle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setAngle(String newValue)
	 * 
	 */
	public void setAngle(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.angle, newValue);
		if (eefElementEditorDefaultValueState) {
			angle.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			angle.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			angle.setText(newValue);
		} else {
			angle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.angle);
		if (eefElementEditorReadOnlyState && angle.isEnabled()) {
			angle.setEnabled(false);
			angle.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !angle.isEnabled()) {
			angle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getClipPath()
	 * 
	 */
	public String getClipPath() {
		return clipPath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setClipPath(String newValue)
	 * 
	 */
	public void setClipPath(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.clipPath, newValue);
		if (eefElementEditorDefaultValueState) {
			clipPath.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			clipPath.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			clipPath.setText(newValue);
		} else {
			clipPath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.clipPath);
		if (eefElementEditorReadOnlyState && clipPath.isEnabled()) {
			clipPath.setEnabled(false);
			clipPath.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipPath.isEnabled()) {
			clipPath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getClipRule()
	 * 
	 */
	public String getClipRule() {
		return clipRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setClipRule(String newValue)
	 * 
	 */
	public void setClipRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.clipRule, newValue);
		if (eefElementEditorDefaultValueState) {
			clipRule.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			clipRule.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			clipRule.setText(newValue);
		} else {
			clipRule.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.clipRule);
		if (eefElementEditorReadOnlyState && clipRule.isEnabled()) {
			clipRule.setEnabled(false);
			clipRule.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipRule.isEnabled()) {
			clipRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.drawingPriority, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getFill()
	 * 
	 */
	public String getFill() {
		return fill.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setFill(String newValue)
	 * 
	 */
	public void setFill(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.fill, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.fill);
		if (eefElementEditorReadOnlyState && fill.isEnabled()) {
			fill.setEnabled(false);
			fill.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fill.isEnabled()) {
			fill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getFillOpacity()
	 * 
	 */
	public String getFillOpacity() {
		return fillOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setFillOpacity(String newValue)
	 * 
	 */
	public void setFillOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.fillOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.fillOpacity);
		if (eefElementEditorReadOnlyState && fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(false);
			fillOpacity.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getFillRule()
	 * 
	 */
	public String getFillRule() {
		return fillRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setFillRule(String newValue)
	 * 
	 */
	public void setFillRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.fillRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.fillRule);
		if (eefElementEditorReadOnlyState && fillRule.isEnabled()) {
			fillRule.setEnabled(false);
			fillRule.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillRule.isEnabled()) {
			fillRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getInboundAngle()
	 * 
	 */
	public String getInboundAngle() {
		return inboundAngle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setInboundAngle(String newValue)
	 * 
	 */
	public void setInboundAngle(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.inboundAngle, newValue);
		if (eefElementEditorDefaultValueState) {
			inboundAngle.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			inboundAngle.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			inboundAngle.setText(newValue);
		} else {
			inboundAngle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.inboundAngle);
		if (eefElementEditorReadOnlyState && inboundAngle.isEnabled()) {
			inboundAngle.setEnabled(false);
			inboundAngle.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundAngle.isEnabled()) {
			inboundAngle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getRadius()
	 * 
	 */
	public String getRadius() {
		return radius.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setRadius(String newValue)
	 * 
	 */
	public void setRadius(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.radius, newValue);
		if (eefElementEditorDefaultValueState) {
			radius.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			radius.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			radius.setText(newValue);
		} else {
			radius.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.radius);
		if (eefElementEditorReadOnlyState && radius.isEnabled()) {
			radius.setEnabled(false);
			radius.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !radius.isEnabled()) {
			radius.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStroke()
	 * 
	 */
	public String getStroke() {
		return stroke.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStroke(String newValue)
	 * 
	 */
	public void setStroke(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.stroke, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.stroke);
		if (eefElementEditorReadOnlyState && stroke.isEnabled()) {
			stroke.setEnabled(false);
			stroke.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stroke.isEnabled()) {
			stroke.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeDasharray()
	 * 
	 */
	public String getStrokeDasharray() {
		return strokeDasharray.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeDasharray(String newValue)
	 * 
	 */
	public void setStrokeDasharray(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray);
		if (eefElementEditorReadOnlyState && strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(false);
			strokeDasharray.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeDashoffset()
	 * 
	 */
	public String getStrokeDashoffset() {
		return strokeDashoffset.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeDashoffset(String newValue)
	 * 
	 */
	public void setStrokeDashoffset(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset);
		if (eefElementEditorReadOnlyState && strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(false);
			strokeDashoffset.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeLinecap()
	 * 
	 */
	public String getStrokeLinecap() {
		return strokeLinecap.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeLinecap(String newValue)
	 * 
	 */
	public void setStrokeLinecap(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap);
		if (eefElementEditorReadOnlyState && strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(false);
			strokeLinecap.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeLinejoin()
	 * 
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeLinejoin(String newValue)
	 * 
	 */
	public void setStrokeLinejoin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin);
		if (eefElementEditorReadOnlyState && strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(false);
			strokeLinejoin.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeMiterlimit()
	 * 
	 */
	public String getStrokeMiterlimit() {
		return strokeMiterlimit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeMiterlimit(String newValue)
	 * 
	 */
	public void setStrokeMiterlimit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit);
		if (eefElementEditorReadOnlyState && strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(false);
			strokeMiterlimit.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokeOpacity()
	 * 
	 */
	public String getStrokeOpacity() {
		return strokeOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokeOpacity(String newValue)
	 * 
	 */
	public void setStrokeOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity);
		if (eefElementEditorReadOnlyState && strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(false);
			strokeOpacity.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getStrokewidth()
	 * 
	 */
	public String getStrokewidth() {
		return strokewidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setStrokewidth(String newValue)
	 * 
	 */
	public void setStrokewidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.strokewidth, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.strokewidth);
		if (eefElementEditorReadOnlyState && strokewidth.isEnabled()) {
			strokewidth.setEnabled(false);
			strokewidth.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokewidth.isEnabled()) {
			strokewidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.visibility, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getX()
	 * 
	 */
	public String getX() {
		return x.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setX(String newValue)
	 * 
	 */
	public void setX(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.x, newValue);
		if (eefElementEditorDefaultValueState) {
			x.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			x.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			x.setText(newValue);
		} else {
			x.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.x);
		if (eefElementEditorReadOnlyState && x.isEnabled()) {
			x.setEnabled(false);
			x.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x.isEnabled()) {
			x.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#getY()
	 * 
	 */
	public String getY() {
		return y.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ArcComponentPropertiesEditionPart#setY(String newValue)
	 * 
	 */
	public void setY(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ArcComponent.Properties.y, newValue);
		if (eefElementEditorDefaultValueState) {
			y.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			y.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			y.setText(newValue);
		} else {
			y.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ArcComponent.Properties.y);
		if (eefElementEditorReadOnlyState && y.isEnabled()) {
			y.setEnabled(false);
			y.setToolTipText(Part2Messages.ArcComponent_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !y.isEnabled()) {
			y.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.ArcComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
