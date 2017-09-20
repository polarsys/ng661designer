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
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.TextPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class TextPrimitivePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text fontFamily;
	protected Text value;
	protected Text drawingPriority;
	protected Text fill;
	protected Text fillOpacity;
	protected Text fillRule;
	protected Text fontSize;
	protected Text fontStretch;
	protected Text fontStyle;
	protected Text fontVariant;
	protected Text fontWeight;
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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextPrimitivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence textPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textPrimitiveStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontFamily);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.value);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fill);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fillRule);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontSize);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontStretch);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontStyle);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontVariant);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.fontWeight);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.stroke);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.strokewidth);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.visibility);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.x);
		propertiesStep.addStep(Part2ViewsRepository.TextPrimitive.Properties.y);
		
		
		composer = new PartComposer(textPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.TextPrimitive.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.id) {
					return createIdText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontFamily) {
					return createFontFamilyText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.value) {
					return createValueText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.drawingPriority) {
					return createDrawingPriorityText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fill) {
					return createFillText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fillOpacity) {
					return createFillOpacityText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fillRule) {
					return createFillRuleText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontSize) {
					return createFontSizeText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontStretch) {
					return createFontStretchText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontStyle) {
					return createFontStyleText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontVariant) {
					return createFontVariantText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.fontWeight) {
					return createFontWeightText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.stroke) {
					return createStrokeText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray) {
					return createStrokeDasharrayText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset) {
					return createStrokeDashoffsetText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap) {
					return createStrokeLinecapText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin) {
					return createStrokeLinejoinText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit) {
					return createStrokeMiterlimitText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity) {
					return createStrokeOpacityText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.strokewidth) {
					return createStrokewidthText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.transform) {
					return createTransformText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.visibility) {
					return createVisibilityText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.x) {
					return createXText(parent);
				}
				if (key == Part2ViewsRepository.TextPrimitive.Properties.y) {
					return createYText(parent);
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
		propertiesGroup.setText(Part2Messages.TextPrimitivePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.id, Part2Messages.TextPrimitivePropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Part2ViewsRepository.TextPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.id, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createFontFamilyText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontFamily, Part2Messages.TextPrimitivePropertiesEditionPart_FontFamilyLabel);
		fontFamily = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontFamilyData = new GridData(GridData.FILL_HORIZONTAL);
		fontFamily.setLayoutData(fontFamilyData);
		fontFamily.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontFamily, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontFamily.getText()));
			}

		});
		fontFamily.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontFamily, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontFamily.getText()));
				}
			}

		});
		EditingUtils.setID(fontFamily, Part2ViewsRepository.TextPrimitive.Properties.fontFamily);
		EditingUtils.setEEFtype(fontFamily, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontFamily, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontFamilyText

		// End of user code
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.value, Part2Messages.TextPrimitivePropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, Part2ViewsRepository.TextPrimitive.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.value, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.drawingPriority, Part2Messages.TextPrimitivePropertiesEditionPart_DrawingPriorityLabel);
		drawingPriority = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData drawingPriorityData = new GridData(GridData.FILL_HORIZONTAL);
		drawingPriority.setLayoutData(drawingPriorityData);
		drawingPriority.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
			}

		});
		drawingPriority.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}

		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.TextPrimitive.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fill, Part2Messages.TextPrimitivePropertiesEditionPart_FillLabel);
		fill = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fillData = new GridData(GridData.FILL_HORIZONTAL);
		fill.setLayoutData(fillData);
		fill.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
			}

		});
		fill.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
				}
			}

		});
		EditingUtils.setID(fill, Part2ViewsRepository.TextPrimitive.Properties.fill);
		EditingUtils.setEEFtype(fill, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fill, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillText

		// End of user code
		return parent;
	}

	
	protected Composite createFillOpacityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fillOpacity, Part2Messages.TextPrimitivePropertiesEditionPart_FillOpacityLabel);
		fillOpacity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fillOpacityData = new GridData(GridData.FILL_HORIZONTAL);
		fillOpacity.setLayoutData(fillOpacityData);
		fillOpacity.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
			}

		});
		fillOpacity.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
				}
			}

		});
		EditingUtils.setID(fillOpacity, Part2ViewsRepository.TextPrimitive.Properties.fillOpacity);
		EditingUtils.setEEFtype(fillOpacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillRuleText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fillRule, Part2Messages.TextPrimitivePropertiesEditionPart_FillRuleLabel);
		fillRule = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fillRuleData = new GridData(GridData.FILL_HORIZONTAL);
		fillRule.setLayoutData(fillRuleData);
		fillRule.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
			}

		});
		fillRule.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
				}
			}

		});
		EditingUtils.setID(fillRule, Part2ViewsRepository.TextPrimitive.Properties.fillRule);
		EditingUtils.setEEFtype(fillRule, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fillRule, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createFontSizeText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontSize, Part2Messages.TextPrimitivePropertiesEditionPart_FontSizeLabel);
		fontSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontSizeData = new GridData(GridData.FILL_HORIZONTAL);
		fontSize.setLayoutData(fontSizeData);
		fontSize.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontSize.getText()));
			}

		});
		fontSize.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontSize.getText()));
				}
			}

		});
		EditingUtils.setID(fontSize, Part2ViewsRepository.TextPrimitive.Properties.fontSize);
		EditingUtils.setEEFtype(fontSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontSize, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontSizeText

		// End of user code
		return parent;
	}

	
	protected Composite createFontStretchText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontStretch, Part2Messages.TextPrimitivePropertiesEditionPart_FontStretchLabel);
		fontStretch = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontStretchData = new GridData(GridData.FILL_HORIZONTAL);
		fontStretch.setLayoutData(fontStretchData);
		fontStretch.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontStretch, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontStretch.getText()));
			}

		});
		fontStretch.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontStretch, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontStretch.getText()));
				}
			}

		});
		EditingUtils.setID(fontStretch, Part2ViewsRepository.TextPrimitive.Properties.fontStretch);
		EditingUtils.setEEFtype(fontStretch, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontStretch, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontStretchText

		// End of user code
		return parent;
	}

	
	protected Composite createFontStyleText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontStyle, Part2Messages.TextPrimitivePropertiesEditionPart_FontStyleLabel);
		fontStyle = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontStyleData = new GridData(GridData.FILL_HORIZONTAL);
		fontStyle.setLayoutData(fontStyleData);
		fontStyle.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontStyle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontStyle.getText()));
			}

		});
		fontStyle.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontStyle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontStyle.getText()));
				}
			}

		});
		EditingUtils.setID(fontStyle, Part2ViewsRepository.TextPrimitive.Properties.fontStyle);
		EditingUtils.setEEFtype(fontStyle, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontStyle, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontStyleText

		// End of user code
		return parent;
	}

	
	protected Composite createFontVariantText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontVariant, Part2Messages.TextPrimitivePropertiesEditionPart_FontVariantLabel);
		fontVariant = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontVariantData = new GridData(GridData.FILL_HORIZONTAL);
		fontVariant.setLayoutData(fontVariantData);
		fontVariant.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontVariant, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontVariant.getText()));
			}

		});
		fontVariant.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontVariant, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontVariant.getText()));
				}
			}

		});
		EditingUtils.setID(fontVariant, Part2ViewsRepository.TextPrimitive.Properties.fontVariant);
		EditingUtils.setEEFtype(fontVariant, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontVariant, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontVariantText

		// End of user code
		return parent;
	}

	
	protected Composite createFontWeightText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.fontWeight, Part2Messages.TextPrimitivePropertiesEditionPart_FontWeightLabel);
		fontWeight = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fontWeightData = new GridData(GridData.FILL_HORIZONTAL);
		fontWeight.setLayoutData(fontWeightData);
		fontWeight.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontWeight.getText()));
			}

		});
		fontWeight.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.fontWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fontWeight.getText()));
				}
			}

		});
		EditingUtils.setID(fontWeight, Part2ViewsRepository.TextPrimitive.Properties.fontWeight);
		EditingUtils.setEEFtype(fontWeight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.fontWeight, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFontWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.stroke, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeLabel);
		stroke = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeData = new GridData(GridData.FILL_HORIZONTAL);
		stroke.setLayoutData(strokeData);
		stroke.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
			}

		});
		stroke.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
				}
			}

		});
		EditingUtils.setID(stroke, Part2ViewsRepository.TextPrimitive.Properties.stroke);
		EditingUtils.setEEFtype(stroke, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.stroke, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDasharrayText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeDasharrayLabel);
		strokeDasharray = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeDasharrayData = new GridData(GridData.FILL_HORIZONTAL);
		strokeDasharray.setLayoutData(strokeDasharrayData);
		strokeDasharray.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
			}

		});
		strokeDasharray.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDasharray, Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray);
		EditingUtils.setEEFtype(strokeDasharray, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDasharrayText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDashoffsetText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeDashoffsetLabel);
		strokeDashoffset = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeDashoffsetData = new GridData(GridData.FILL_HORIZONTAL);
		strokeDashoffset.setLayoutData(strokeDashoffsetData);
		strokeDashoffset.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
			}

		});
		strokeDashoffset.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDashoffset, Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset);
		EditingUtils.setEEFtype(strokeDashoffset, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDashoffsetText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinecapText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeLinecapLabel);
		strokeLinecap = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeLinecapData = new GridData(GridData.FILL_HORIZONTAL);
		strokeLinecap.setLayoutData(strokeLinecapData);
		strokeLinecap.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
			}

		});
		strokeLinecap.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinecap, Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap);
		EditingUtils.setEEFtype(strokeLinecap, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinecapText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinejoinText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeLinejoinLabel);
		strokeLinejoin = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeLinejoinData = new GridData(GridData.FILL_HORIZONTAL);
		strokeLinejoin.setLayoutData(strokeLinejoinData);
		strokeLinejoin.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
			}

		});
		strokeLinejoin.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinejoin, Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin);
		EditingUtils.setEEFtype(strokeLinejoin, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinejoinText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeMiterlimitText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeMiterlimitLabel);
		strokeMiterlimit = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeMiterlimitData = new GridData(GridData.FILL_HORIZONTAL);
		strokeMiterlimit.setLayoutData(strokeMiterlimitData);
		strokeMiterlimit.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
			}

		});
		strokeMiterlimit.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
				}
			}

		});
		EditingUtils.setID(strokeMiterlimit, Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit);
		EditingUtils.setEEFtype(strokeMiterlimit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeMiterlimitText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeOpacityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity, Part2Messages.TextPrimitivePropertiesEditionPart_StrokeOpacityLabel);
		strokeOpacity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokeOpacityData = new GridData(GridData.FILL_HORIZONTAL);
		strokeOpacity.setLayoutData(strokeOpacityData);
		strokeOpacity.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
			}

		});
		strokeOpacity.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
				}
			}

		});
		EditingUtils.setID(strokeOpacity, Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity);
		EditingUtils.setEEFtype(strokeOpacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokewidthText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.strokewidth, Part2Messages.TextPrimitivePropertiesEditionPart_StrokewidthLabel);
		strokewidth = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strokewidthData = new GridData(GridData.FILL_HORIZONTAL);
		strokewidth.setLayoutData(strokewidthData);
		strokewidth.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
			}

		});
		strokewidth.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
				}
			}

		});
		EditingUtils.setID(strokewidth, Part2ViewsRepository.TextPrimitive.Properties.strokewidth);
		EditingUtils.setEEFtype(strokewidth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.strokewidth, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokewidthText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.transform, Part2Messages.TextPrimitivePropertiesEditionPart_TransformLabel);
		transform = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transformData = new GridData(GridData.FILL_HORIZONTAL);
		transform.setLayoutData(transformData);
		transform.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
			}

		});
		transform.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}

		});
		EditingUtils.setID(transform, Part2ViewsRepository.TextPrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.transform, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.visibility, Part2Messages.TextPrimitivePropertiesEditionPart_VisibilityLabel);
		visibility = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.setLayoutData(visibilityData);
		visibility.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
			}

		});
		visibility.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}

		});
		EditingUtils.setID(visibility, Part2ViewsRepository.TextPrimitive.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.visibility, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityText

		// End of user code
		return parent;
	}

	
	protected Composite createXText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.x, Part2Messages.TextPrimitivePropertiesEditionPart_XLabel);
		x = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData xData = new GridData(GridData.FILL_HORIZONTAL);
		x.setLayoutData(xData);
		x.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
			}

		});
		x.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
				}
			}

		});
		EditingUtils.setID(x, Part2ViewsRepository.TextPrimitive.Properties.x);
		EditingUtils.setEEFtype(x, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.x, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createXText

		// End of user code
		return parent;
	}

	
	protected Composite createYText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.TextPrimitive.Properties.y, Part2Messages.TextPrimitivePropertiesEditionPart_YLabel);
		y = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData yData = new GridData(GridData.FILL_HORIZONTAL);
		y.setLayoutData(yData);
		y.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
			}

		});
		y.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.TextPrimitive.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
				}
			}

		});
		EditingUtils.setID(y, Part2ViewsRepository.TextPrimitive.Properties.y);
		EditingUtils.setEEFtype(y, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.TextPrimitive.Properties.y, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontFamily()
	 * 
	 */
	public String getFontFamily() {
		return fontFamily.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontFamily(String newValue)
	 * 
	 */
	public void setFontFamily(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontFamily, newValue);
		if (eefElementEditorDefaultValueState) {
			fontFamily.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontFamily.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontFamily.setText(newValue);
		} else {
			fontFamily.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontFamily);
		if (eefElementEditorReadOnlyState && fontFamily.isEnabled()) {
			fontFamily.setEnabled(false);
			fontFamily.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontFamily.isEnabled()) {
			fontFamily.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.value, newValue);
		if (eefElementEditorDefaultValueState) {
			value.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			value.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFill()
	 * 
	 */
	public String getFill() {
		return fill.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFill(String newValue)
	 * 
	 */
	public void setFill(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fill, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fill);
		if (eefElementEditorReadOnlyState && fill.isEnabled()) {
			fill.setEnabled(false);
			fill.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fill.isEnabled()) {
			fill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFillOpacity()
	 * 
	 */
	public String getFillOpacity() {
		return fillOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFillOpacity(String newValue)
	 * 
	 */
	public void setFillOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity);
		if (eefElementEditorReadOnlyState && fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(false);
			fillOpacity.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFillRule()
	 * 
	 */
	public String getFillRule() {
		return fillRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFillRule(String newValue)
	 * 
	 */
	public void setFillRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fillRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fillRule);
		if (eefElementEditorReadOnlyState && fillRule.isEnabled()) {
			fillRule.setEnabled(false);
			fillRule.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillRule.isEnabled()) {
			fillRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontSize()
	 * 
	 */
	public String getFontSize() {
		return fontSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontSize(String newValue)
	 * 
	 */
	public void setFontSize(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontSize, newValue);
		if (eefElementEditorDefaultValueState) {
			fontSize.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontSize.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontSize.setText(newValue);
		} else {
			fontSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontSize);
		if (eefElementEditorReadOnlyState && fontSize.isEnabled()) {
			fontSize.setEnabled(false);
			fontSize.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontSize.isEnabled()) {
			fontSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontStretch()
	 * 
	 */
	public String getFontStretch() {
		return fontStretch.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontStretch(String newValue)
	 * 
	 */
	public void setFontStretch(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontStretch, newValue);
		if (eefElementEditorDefaultValueState) {
			fontStretch.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontStretch.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontStretch.setText(newValue);
		} else {
			fontStretch.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontStretch);
		if (eefElementEditorReadOnlyState && fontStretch.isEnabled()) {
			fontStretch.setEnabled(false);
			fontStretch.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontStretch.isEnabled()) {
			fontStretch.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontStyle()
	 * 
	 */
	public String getFontStyle() {
		return fontStyle.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontStyle(String newValue)
	 * 
	 */
	public void setFontStyle(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontStyle, newValue);
		if (eefElementEditorDefaultValueState) {
			fontStyle.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontStyle.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontStyle.setText(newValue);
		} else {
			fontStyle.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontStyle);
		if (eefElementEditorReadOnlyState && fontStyle.isEnabled()) {
			fontStyle.setEnabled(false);
			fontStyle.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontStyle.isEnabled()) {
			fontStyle.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontVariant()
	 * 
	 */
	public String getFontVariant() {
		return fontVariant.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontVariant(String newValue)
	 * 
	 */
	public void setFontVariant(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontVariant, newValue);
		if (eefElementEditorDefaultValueState) {
			fontVariant.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontVariant.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontVariant.setText(newValue);
		} else {
			fontVariant.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontVariant);
		if (eefElementEditorReadOnlyState && fontVariant.isEnabled()) {
			fontVariant.setEnabled(false);
			fontVariant.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontVariant.isEnabled()) {
			fontVariant.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getFontWeight()
	 * 
	 */
	public String getFontWeight() {
		return fontWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setFontWeight(String newValue)
	 * 
	 */
	public void setFontWeight(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.fontWeight, newValue);
		if (eefElementEditorDefaultValueState) {
			fontWeight.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			fontWeight.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			fontWeight.setText(newValue);
		} else {
			fontWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.fontWeight);
		if (eefElementEditorReadOnlyState && fontWeight.isEnabled()) {
			fontWeight.setEnabled(false);
			fontWeight.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fontWeight.isEnabled()) {
			fontWeight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStroke()
	 * 
	 */
	public String getStroke() {
		return stroke.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStroke(String newValue)
	 * 
	 */
	public void setStroke(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.stroke, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.stroke);
		if (eefElementEditorReadOnlyState && stroke.isEnabled()) {
			stroke.setEnabled(false);
			stroke.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stroke.isEnabled()) {
			stroke.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeDasharray()
	 * 
	 */
	public String getStrokeDasharray() {
		return strokeDasharray.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeDasharray(String newValue)
	 * 
	 */
	public void setStrokeDasharray(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray);
		if (eefElementEditorReadOnlyState && strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(false);
			strokeDasharray.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeDashoffset()
	 * 
	 */
	public String getStrokeDashoffset() {
		return strokeDashoffset.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeDashoffset(String newValue)
	 * 
	 */
	public void setStrokeDashoffset(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset);
		if (eefElementEditorReadOnlyState && strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(false);
			strokeDashoffset.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeLinecap()
	 * 
	 */
	public String getStrokeLinecap() {
		return strokeLinecap.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeLinecap(String newValue)
	 * 
	 */
	public void setStrokeLinecap(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap);
		if (eefElementEditorReadOnlyState && strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(false);
			strokeLinecap.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeLinejoin()
	 * 
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeLinejoin(String newValue)
	 * 
	 */
	public void setStrokeLinejoin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin);
		if (eefElementEditorReadOnlyState && strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(false);
			strokeLinejoin.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeMiterlimit()
	 * 
	 */
	public String getStrokeMiterlimit() {
		return strokeMiterlimit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeMiterlimit(String newValue)
	 * 
	 */
	public void setStrokeMiterlimit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit);
		if (eefElementEditorReadOnlyState && strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(false);
			strokeMiterlimit.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokeOpacity()
	 * 
	 */
	public String getStrokeOpacity() {
		return strokeOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokeOpacity(String newValue)
	 * 
	 */
	public void setStrokeOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity);
		if (eefElementEditorReadOnlyState && strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(false);
			strokeOpacity.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getStrokewidth()
	 * 
	 */
	public String getStrokewidth() {
		return strokewidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setStrokewidth(String newValue)
	 * 
	 */
	public void setStrokewidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.strokewidth, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.strokewidth);
		if (eefElementEditorReadOnlyState && strokewidth.isEnabled()) {
			strokewidth.setEnabled(false);
			strokewidth.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokewidth.isEnabled()) {
			strokewidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.visibility, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getX()
	 * 
	 */
	public String getX() {
		return x.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setX(String newValue)
	 * 
	 */
	public void setX(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.x, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.x);
		if (eefElementEditorReadOnlyState && x.isEnabled()) {
			x.setEnabled(false);
			x.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x.isEnabled()) {
			x.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#getY()
	 * 
	 */
	public String getY() {
		return y.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.TextPrimitivePropertiesEditionPart#setY(String newValue)
	 * 
	 */
	public void setY(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.TextPrimitive.Properties.y, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.TextPrimitive.Properties.y);
		if (eefElementEditorReadOnlyState && y.isEnabled()) {
			y.setEnabled(false);
			y.setToolTipText(Part2Messages.TextPrimitive_ReadOnly);
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
		return Part2Messages.TextPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
