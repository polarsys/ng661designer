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
import org.polarsys.ng661designer.dsl.part2.parts.CirclePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class CirclePrimitivePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CirclePrimitivePropertiesEditionPart {

	protected Text id;
	protected Text clipPath;
	protected Text clipRule;
	protected Text cx;
	protected Text cy;
	protected Text drawingPriority;
	protected Text fill;
	protected Text fillOpacity;
	protected Text fillRule;
	protected Text r;
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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CirclePrimitivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence circlePrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = circlePrimitiveStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.clipPath);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.clipRule);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.cx);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.cy);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.fill);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.fillRule);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.r);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.stroke);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.CirclePrimitive.Properties.visibility);
		
		
		composer = new PartComposer(circlePrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.id) {
					return createIdText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.clipPath) {
					return createClipPathText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.clipRule) {
					return createClipRuleText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.cx) {
					return createCxText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.cy) {
					return createCyText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority) {
					return createDrawingPriorityText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.fill) {
					return createFillText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity) {
					return createFillOpacityText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.fillRule) {
					return createFillRuleText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.r) {
					return createRText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.stroke) {
					return createStrokeText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray) {
					return createStrokeDasharrayText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset) {
					return createStrokeDashoffsetText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap) {
					return createStrokeLinecapText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin) {
					return createStrokeLinejoinText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit) {
					return createStrokeMiterlimitText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity) {
					return createStrokeOpacityText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.strokewidth) {
					return createStrokewidthText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.transform) {
					return createTransformText(parent);
				}
				if (key == Part2ViewsRepository.CirclePrimitive.Properties.visibility) {
					return createVisibilityText(parent);
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
		propertiesGroup.setText(Part2Messages.CirclePrimitivePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.id, Part2Messages.CirclePrimitivePropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Part2ViewsRepository.CirclePrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.id, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createClipPathText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.clipPath, Part2Messages.CirclePrimitivePropertiesEditionPart_ClipPathLabel);
		clipPath = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData clipPathData = new GridData(GridData.FILL_HORIZONTAL);
		clipPath.setLayoutData(clipPathData);
		clipPath.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
			}

		});
		clipPath.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
				}
			}

		});
		EditingUtils.setID(clipPath, Part2ViewsRepository.CirclePrimitive.Properties.clipPath);
		EditingUtils.setEEFtype(clipPath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.clipPath, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipPathText

		// End of user code
		return parent;
	}

	
	protected Composite createClipRuleText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.clipRule, Part2Messages.CirclePrimitivePropertiesEditionPart_ClipRuleLabel);
		clipRule = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData clipRuleData = new GridData(GridData.FILL_HORIZONTAL);
		clipRule.setLayoutData(clipRuleData);
		clipRule.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
			}

		});
		clipRule.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
				}
			}

		});
		EditingUtils.setID(clipRule, Part2ViewsRepository.CirclePrimitive.Properties.clipRule);
		EditingUtils.setEEFtype(clipRule, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.clipRule, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createCxText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.cx, Part2Messages.CirclePrimitivePropertiesEditionPart_CxLabel);
		cx = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData cxData = new GridData(GridData.FILL_HORIZONTAL);
		cx.setLayoutData(cxData);
		cx.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.cx, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cx.getText()));
			}

		});
		cx.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.cx, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cx.getText()));
				}
			}

		});
		EditingUtils.setID(cx, Part2ViewsRepository.CirclePrimitive.Properties.cx);
		EditingUtils.setEEFtype(cx, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.cx, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCxText

		// End of user code
		return parent;
	}

	
	protected Composite createCyText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.cy, Part2Messages.CirclePrimitivePropertiesEditionPart_CyLabel);
		cy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData cyData = new GridData(GridData.FILL_HORIZONTAL);
		cy.setLayoutData(cyData);
		cy.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.cy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cy.getText()));
			}

		});
		cy.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.cy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cy.getText()));
				}
			}

		});
		EditingUtils.setID(cy, Part2ViewsRepository.CirclePrimitive.Properties.cy);
		EditingUtils.setEEFtype(cy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.cy, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCyText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority, Part2Messages.CirclePrimitivePropertiesEditionPart_DrawingPriorityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}

		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.fill, Part2Messages.CirclePrimitivePropertiesEditionPart_FillLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fill.getText()));
				}
			}

		});
		EditingUtils.setID(fill, Part2ViewsRepository.CirclePrimitive.Properties.fill);
		EditingUtils.setEEFtype(fill, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.fill, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillText

		// End of user code
		return parent;
	}

	
	protected Composite createFillOpacityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity, Part2Messages.CirclePrimitivePropertiesEditionPart_FillOpacityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillOpacity.getText()));
				}
			}

		});
		EditingUtils.setID(fillOpacity, Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity);
		EditingUtils.setEEFtype(fillOpacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createFillRuleText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.fillRule, Part2Messages.CirclePrimitivePropertiesEditionPart_FillRuleLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.fillRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fillRule.getText()));
				}
			}

		});
		EditingUtils.setID(fillRule, Part2ViewsRepository.CirclePrimitive.Properties.fillRule);
		EditingUtils.setEEFtype(fillRule, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.fillRule, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFillRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createRText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.r, Part2Messages.CirclePrimitivePropertiesEditionPart_RLabel);
		r = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData rData = new GridData(GridData.FILL_HORIZONTAL);
		r.setLayoutData(rData);
		r.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.r, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, r.getText()));
			}

		});
		r.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.r, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, r.getText()));
				}
			}

		});
		EditingUtils.setID(r, Part2ViewsRepository.CirclePrimitive.Properties.r);
		EditingUtils.setEEFtype(r, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.r, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.stroke, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
				}
			}

		});
		EditingUtils.setID(stroke, Part2ViewsRepository.CirclePrimitive.Properties.stroke);
		EditingUtils.setEEFtype(stroke, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.stroke, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDasharrayText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeDasharrayLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDasharray, Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray);
		EditingUtils.setEEFtype(strokeDasharray, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDasharrayText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDashoffsetText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeDashoffsetLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDashoffset, Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset);
		EditingUtils.setEEFtype(strokeDashoffset, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDashoffsetText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinecapText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeLinecapLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinecap, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap);
		EditingUtils.setEEFtype(strokeLinecap, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinecapText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinejoinText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeLinejoinLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinejoin, Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin);
		EditingUtils.setEEFtype(strokeLinejoin, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinejoinText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeMiterlimitText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeMiterlimitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
				}
			}

		});
		EditingUtils.setID(strokeMiterlimit, Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit);
		EditingUtils.setEEFtype(strokeMiterlimit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeMiterlimitText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeOpacityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokeOpacityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
				}
			}

		});
		EditingUtils.setID(strokeOpacity, Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity);
		EditingUtils.setEEFtype(strokeOpacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokewidthText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.strokewidth, Part2Messages.CirclePrimitivePropertiesEditionPart_StrokewidthLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
				}
			}

		});
		EditingUtils.setID(strokewidth, Part2ViewsRepository.CirclePrimitive.Properties.strokewidth);
		EditingUtils.setEEFtype(strokewidth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokewidthText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.transform, Part2Messages.CirclePrimitivePropertiesEditionPart_TransformLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}

		});
		EditingUtils.setID(transform, Part2ViewsRepository.CirclePrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.transform, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.CirclePrimitive.Properties.visibility, Part2Messages.CirclePrimitivePropertiesEditionPart_VisibilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CirclePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.CirclePrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}

		});
		EditingUtils.setID(visibility, Part2ViewsRepository.CirclePrimitive.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.CirclePrimitive.Properties.visibility, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getClipPath()
	 * 
	 */
	public String getClipPath() {
		return clipPath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setClipPath(String newValue)
	 * 
	 */
	public void setClipPath(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.clipPath, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.clipPath);
		if (eefElementEditorReadOnlyState && clipPath.isEnabled()) {
			clipPath.setEnabled(false);
			clipPath.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipPath.isEnabled()) {
			clipPath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getClipRule()
	 * 
	 */
	public String getClipRule() {
		return clipRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setClipRule(String newValue)
	 * 
	 */
	public void setClipRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.clipRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.clipRule);
		if (eefElementEditorReadOnlyState && clipRule.isEnabled()) {
			clipRule.setEnabled(false);
			clipRule.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipRule.isEnabled()) {
			clipRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getCx()
	 * 
	 */
	public String getCx() {
		return cx.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setCx(String newValue)
	 * 
	 */
	public void setCx(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.cx, newValue);
		if (eefElementEditorDefaultValueState) {
			cx.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			cx.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			cx.setText(newValue);
		} else {
			cx.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.cx);
		if (eefElementEditorReadOnlyState && cx.isEnabled()) {
			cx.setEnabled(false);
			cx.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cx.isEnabled()) {
			cx.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getCy()
	 * 
	 */
	public String getCy() {
		return cy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setCy(String newValue)
	 * 
	 */
	public void setCy(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.cy, newValue);
		if (eefElementEditorDefaultValueState) {
			cy.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			cy.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			cy.setText(newValue);
		} else {
			cy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.cy);
		if (eefElementEditorReadOnlyState && cy.isEnabled()) {
			cy.setEnabled(false);
			cy.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cy.isEnabled()) {
			cy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getFill()
	 * 
	 */
	public String getFill() {
		return fill.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setFill(String newValue)
	 * 
	 */
	public void setFill(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.fill, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.fill);
		if (eefElementEditorReadOnlyState && fill.isEnabled()) {
			fill.setEnabled(false);
			fill.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fill.isEnabled()) {
			fill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getFillOpacity()
	 * 
	 */
	public String getFillOpacity() {
		return fillOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setFillOpacity(String newValue)
	 * 
	 */
	public void setFillOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity);
		if (eefElementEditorReadOnlyState && fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(false);
			fillOpacity.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillOpacity.isEnabled()) {
			fillOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getFillRule()
	 * 
	 */
	public String getFillRule() {
		return fillRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setFillRule(String newValue)
	 * 
	 */
	public void setFillRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.fillRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.fillRule);
		if (eefElementEditorReadOnlyState && fillRule.isEnabled()) {
			fillRule.setEnabled(false);
			fillRule.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fillRule.isEnabled()) {
			fillRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getR()
	 * 
	 */
	public String getR() {
		return r.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setR(String newValue)
	 * 
	 */
	public void setR(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.r, newValue);
		if (eefElementEditorDefaultValueState) {
			r.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			r.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			r.setText(newValue);
		} else {
			r.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.r);
		if (eefElementEditorReadOnlyState && r.isEnabled()) {
			r.setEnabled(false);
			r.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !r.isEnabled()) {
			r.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStroke()
	 * 
	 */
	public String getStroke() {
		return stroke.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStroke(String newValue)
	 * 
	 */
	public void setStroke(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.stroke, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.stroke);
		if (eefElementEditorReadOnlyState && stroke.isEnabled()) {
			stroke.setEnabled(false);
			stroke.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stroke.isEnabled()) {
			stroke.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeDasharray()
	 * 
	 */
	public String getStrokeDasharray() {
		return strokeDasharray.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeDasharray(String newValue)
	 * 
	 */
	public void setStrokeDasharray(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray);
		if (eefElementEditorReadOnlyState && strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(false);
			strokeDasharray.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeDashoffset()
	 * 
	 */
	public String getStrokeDashoffset() {
		return strokeDashoffset.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeDashoffset(String newValue)
	 * 
	 */
	public void setStrokeDashoffset(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset);
		if (eefElementEditorReadOnlyState && strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(false);
			strokeDashoffset.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeLinecap()
	 * 
	 */
	public String getStrokeLinecap() {
		return strokeLinecap.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeLinecap(String newValue)
	 * 
	 */
	public void setStrokeLinecap(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap);
		if (eefElementEditorReadOnlyState && strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(false);
			strokeLinecap.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeLinejoin()
	 * 
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeLinejoin(String newValue)
	 * 
	 */
	public void setStrokeLinejoin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin);
		if (eefElementEditorReadOnlyState && strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(false);
			strokeLinejoin.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeMiterlimit()
	 * 
	 */
	public String getStrokeMiterlimit() {
		return strokeMiterlimit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeMiterlimit(String newValue)
	 * 
	 */
	public void setStrokeMiterlimit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit);
		if (eefElementEditorReadOnlyState && strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(false);
			strokeMiterlimit.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokeOpacity()
	 * 
	 */
	public String getStrokeOpacity() {
		return strokeOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokeOpacity(String newValue)
	 * 
	 */
	public void setStrokeOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity);
		if (eefElementEditorReadOnlyState && strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(false);
			strokeOpacity.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getStrokewidth()
	 * 
	 */
	public String getStrokewidth() {
		return strokewidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setStrokewidth(String newValue)
	 * 
	 */
	public void setStrokewidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth);
		if (eefElementEditorReadOnlyState && strokewidth.isEnabled()) {
			strokewidth.setEnabled(false);
			strokewidth.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokewidth.isEnabled()) {
			strokewidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.CirclePrimitivePropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.CirclePrimitive.Properties.visibility, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.CirclePrimitive.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.CirclePrimitive_ReadOnly);
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
		return Part2Messages.CirclePrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
