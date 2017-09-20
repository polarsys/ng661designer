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
import org.polarsys.ng661designer.dsl.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScrollWheelAreaPrimitivePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, ScrollWheelAreaPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text clipPath;
	protected Text clipRule;
	protected Text enabled;
	protected Text height;
	protected Text transform;
	protected Text width;
	protected Text x;
	protected Text y;



	/**
	 * For {@link ISection} use only.
	 */
	public ScrollWheelAreaPrimitivePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScrollWheelAreaPrimitivePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scrollWheelAreaPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scrollWheelAreaPrimitiveStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x);
		propertiesStep.addStep(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y);
		
		
		composer = new PartComposer(scrollWheelAreaPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath) {
					return createClipPathText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule) {
					return createClipRuleText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled) {
					return createEnabledText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height) {
					return createHeightText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform) {
					return createTransformText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width) {
					return createWidthText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x) {
					return createXText(widgetFactory, parent);
				}
				if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y) {
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
		propertiesSection.setText(Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_IdLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createClipPathText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_ClipPathLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
				}
			}
		});
		EditingUtils.setID(clipPath, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath);
		EditingUtils.setEEFtype(clipPath, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipPathText

		// End of user code
		return parent;
	}

	
	protected Composite createClipRuleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_ClipRuleLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
				}
			}
		});
		EditingUtils.setID(clipRule, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule);
		EditingUtils.setEEFtype(clipRule, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createEnabledText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_EnabledLabel);
		enabled = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		enabled.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData enabledData = new GridData(GridData.FILL_HORIZONTAL);
		enabled.setLayoutData(enabledData);
		enabled.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, enabled.getText()));
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		enabled.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
				}
			}
		});
		EditingUtils.setID(enabled, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled);
		EditingUtils.setEEFtype(enabled, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnabledText

		// End of user code
		return parent;
	}

	
	protected Composite createHeightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_HeightLabel);
		height = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		height.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData heightData = new GridData(GridData.FILL_HORIZONTAL);
		height.setLayoutData(heightData);
		height.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, height.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, height.getText()));
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		height.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, height.getText()));
				}
			}
		});
		EditingUtils.setID(height, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height);
		EditingUtils.setEEFtype(height, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createHeightText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_TransformLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}
		});
		EditingUtils.setID(transform, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_WidthLabel);
		width = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		width.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData widthData = new GridData(GridData.FILL_HORIZONTAL);
		width.setLayoutData(widthData);
		width.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, width.getText()));
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		width.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
				}
			}
		});
		EditingUtils.setID(width, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width);
		EditingUtils.setEEFtype(width, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWidthText

		// End of user code
		return parent;
	}

	
	protected Composite createXText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_XLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
				}
			}
		});
		EditingUtils.setID(x, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x);
		EditingUtils.setEEFtype(x, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createXText

		// End of user code
		return parent;
	}

	
	protected Composite createYText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y, Part2Messages.ScrollWheelAreaPrimitivePropertiesEditionPart_YLabel);
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
							ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
							Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
									Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y,
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
									ScrollWheelAreaPrimitivePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScrollWheelAreaPrimitivePropertiesEditionPartForm.this, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
				}
			}
		});
		EditingUtils.setID(y, Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y);
		EditingUtils.setEEFtype(y, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y, Part2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getClipPath()
	 * 
	 */
	public String getClipPath() {
		return clipPath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setClipPath(String newValue)
	 * 
	 */
	public void setClipPath(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath);
		if (eefElementEditorReadOnlyState && clipPath.isEnabled()) {
			clipPath.setEnabled(false);
			clipPath.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipPath.isEnabled()) {
			clipPath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getClipRule()
	 * 
	 */
	public String getClipRule() {
		return clipRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setClipRule(String newValue)
	 * 
	 */
	public void setClipRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule);
		if (eefElementEditorReadOnlyState && clipRule.isEnabled()) {
			clipRule.setEnabled(false);
			clipRule.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipRule.isEnabled()) {
			clipRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getEnabled()
	 * 
	 */
	public String getEnabled() {
		return enabled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setEnabled(String newValue)
	 * 
	 */
	public void setEnabled(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled, newValue);
		if (eefElementEditorDefaultValueState) {
			enabled.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			enabled.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			enabled.setText(newValue);
		} else {
			enabled.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled);
		if (eefElementEditorReadOnlyState && enabled.isEnabled()) {
			enabled.setEnabled(false);
			enabled.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enabled.isEnabled()) {
			enabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getHeight()
	 * 
	 */
	public String getHeight() {
		return height.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setHeight(String newValue)
	 * 
	 */
	public void setHeight(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height, newValue);
		if (eefElementEditorDefaultValueState) {
			height.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			height.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			height.setText(newValue);
		} else {
			height.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height);
		if (eefElementEditorReadOnlyState && height.isEnabled()) {
			height.setEnabled(false);
			height.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !height.isEnabled()) {
			height.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getWidth()
	 * 
	 */
	public String getWidth() {
		return width.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setWidth(String newValue)
	 * 
	 */
	public void setWidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width, newValue);
		if (eefElementEditorDefaultValueState) {
			width.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			width.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			width.setText(newValue);
		} else {
			width.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width);
		if (eefElementEditorReadOnlyState && width.isEnabled()) {
			width.setEnabled(false);
			width.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !width.isEnabled()) {
			width.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getX()
	 * 
	 */
	public String getX() {
		return x.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setX(String newValue)
	 * 
	 */
	public void setX(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x);
		if (eefElementEditorReadOnlyState && x.isEnabled()) {
			x.setEnabled(false);
			x.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x.isEnabled()) {
			x.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#getY()
	 * 
	 */
	public String getY() {
		return y.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart#setY(String newValue)
	 * 
	 */
	public void setY(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y);
		if (eefElementEditorReadOnlyState && y.isEnabled()) {
			y.setEnabled(false);
			y.setToolTipText(Part2Messages.ScrollWheelAreaPrimitive_ReadOnly);
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
		return Part2Messages.ScrollWheelAreaPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
