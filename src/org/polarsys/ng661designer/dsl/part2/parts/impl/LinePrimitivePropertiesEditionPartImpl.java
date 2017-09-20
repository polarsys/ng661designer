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
import org.polarsys.ng661designer.dsl.part2.parts.LinePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class LinePrimitivePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LinePrimitivePropertiesEditionPart {

	protected Text id;
	protected Text drawingPriority;
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
	protected Text x1;
	protected Text x2;
	protected Text y1;
	protected Text y2;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinePrimitivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence linePrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linePrimitiveStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.stroke);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.strokewidth);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.visibility);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.x1);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.x2);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.y1);
		propertiesStep.addStep(Part2ViewsRepository.LinePrimitive.Properties.y2);
		
		
		composer = new PartComposer(linePrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.LinePrimitive.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.id) {
					return createIdText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.drawingPriority) {
					return createDrawingPriorityText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.stroke) {
					return createStrokeText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray) {
					return createStrokeDasharrayText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset) {
					return createStrokeDashoffsetText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap) {
					return createStrokeLinecapText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin) {
					return createStrokeLinejoinText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit) {
					return createStrokeMiterlimitText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity) {
					return createStrokeOpacityText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.strokewidth) {
					return createStrokewidthText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.transform) {
					return createTransformText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.visibility) {
					return createVisibilityText(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.x1) {
					return createX1Text(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.x2) {
					return createX2Text(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.y1) {
					return createY1Text(parent);
				}
				if (key == Part2ViewsRepository.LinePrimitive.Properties.y2) {
					return createY2Text(parent);
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
		propertiesGroup.setText(Part2Messages.LinePrimitivePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.id, Part2Messages.LinePrimitivePropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Part2ViewsRepository.LinePrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.id, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDrawingPriorityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.drawingPriority, Part2Messages.LinePrimitivePropertiesEditionPart_DrawingPriorityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.drawingPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, drawingPriority.getText()));
				}
			}

		});
		EditingUtils.setID(drawingPriority, Part2ViewsRepository.LinePrimitive.Properties.drawingPriority);
		EditingUtils.setEEFtype(drawingPriority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDrawingPriorityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.stroke, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.stroke, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, stroke.getText()));
				}
			}

		});
		EditingUtils.setID(stroke, Part2ViewsRepository.LinePrimitive.Properties.stroke);
		EditingUtils.setEEFtype(stroke, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.stroke, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDasharrayText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeDasharrayLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDasharray.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDasharray, Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray);
		EditingUtils.setEEFtype(strokeDasharray, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDasharrayText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeDashoffsetText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeDashoffsetLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeDashoffset.getText()));
				}
			}

		});
		EditingUtils.setID(strokeDashoffset, Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset);
		EditingUtils.setEEFtype(strokeDashoffset, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeDashoffsetText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinecapText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeLinecapLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinecap.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinecap, Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap);
		EditingUtils.setEEFtype(strokeLinecap, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinecapText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeLinejoinText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeLinejoinLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeLinejoin.getText()));
				}
			}

		});
		EditingUtils.setID(strokeLinejoin, Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin);
		EditingUtils.setEEFtype(strokeLinejoin, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeLinejoinText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeMiterlimitText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeMiterlimitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeMiterlimit.getText()));
				}
			}

		});
		EditingUtils.setID(strokeMiterlimit, Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit);
		EditingUtils.setEEFtype(strokeMiterlimit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeMiterlimitText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokeOpacityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity, Part2Messages.LinePrimitivePropertiesEditionPart_StrokeOpacityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokeOpacity.getText()));
				}
			}

		});
		EditingUtils.setID(strokeOpacity, Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity);
		EditingUtils.setEEFtype(strokeOpacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokeOpacityText

		// End of user code
		return parent;
	}

	
	protected Composite createStrokewidthText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.strokewidth, Part2Messages.LinePrimitivePropertiesEditionPart_StrokewidthLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.strokewidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strokewidth.getText()));
				}
			}

		});
		EditingUtils.setID(strokewidth, Part2ViewsRepository.LinePrimitive.Properties.strokewidth);
		EditingUtils.setEEFtype(strokewidth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.strokewidth, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrokewidthText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.transform, Part2Messages.LinePrimitivePropertiesEditionPart_TransformLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}

		});
		EditingUtils.setID(transform, Part2ViewsRepository.LinePrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.transform, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.visibility, Part2Messages.LinePrimitivePropertiesEditionPart_VisibilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, visibility.getText()));
				}
			}

		});
		EditingUtils.setID(visibility, Part2ViewsRepository.LinePrimitive.Properties.visibility);
		EditingUtils.setEEFtype(visibility, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.visibility, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityText

		// End of user code
		return parent;
	}

	
	protected Composite createX1Text(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.x1, Part2Messages.LinePrimitivePropertiesEditionPart_X1Label);
		x1 = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData x1Data = new GridData(GridData.FILL_HORIZONTAL);
		x1.setLayoutData(x1Data);
		x1.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.x1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x1.getText()));
			}

		});
		x1.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.x1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x1.getText()));
				}
			}

		});
		EditingUtils.setID(x1, Part2ViewsRepository.LinePrimitive.Properties.x1);
		EditingUtils.setEEFtype(x1, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.x1, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createX1Text

		// End of user code
		return parent;
	}

	
	protected Composite createX2Text(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.x2, Part2Messages.LinePrimitivePropertiesEditionPart_X2Label);
		x2 = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData x2Data = new GridData(GridData.FILL_HORIZONTAL);
		x2.setLayoutData(x2Data);
		x2.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.x2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x2.getText()));
			}

		});
		x2.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.x2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x2.getText()));
				}
			}

		});
		EditingUtils.setID(x2, Part2ViewsRepository.LinePrimitive.Properties.x2);
		EditingUtils.setEEFtype(x2, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.x2, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createX2Text

		// End of user code
		return parent;
	}

	
	protected Composite createY1Text(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.y1, Part2Messages.LinePrimitivePropertiesEditionPart_Y1Label);
		y1 = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData y1Data = new GridData(GridData.FILL_HORIZONTAL);
		y1.setLayoutData(y1Data);
		y1.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.y1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y1.getText()));
			}

		});
		y1.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.y1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y1.getText()));
				}
			}

		});
		EditingUtils.setID(y1, Part2ViewsRepository.LinePrimitive.Properties.y1);
		EditingUtils.setEEFtype(y1, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.y1, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createY1Text

		// End of user code
		return parent;
	}

	
	protected Composite createY2Text(Composite parent) {
		createDescription(parent, Part2ViewsRepository.LinePrimitive.Properties.y2, Part2Messages.LinePrimitivePropertiesEditionPart_Y2Label);
		y2 = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData y2Data = new GridData(GridData.FILL_HORIZONTAL);
		y2.setLayoutData(y2Data);
		y2.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.y2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y2.getText()));
			}

		});
		y2.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinePrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.LinePrimitive.Properties.y2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y2.getText()));
				}
			}

		});
		EditingUtils.setID(y2, Part2ViewsRepository.LinePrimitive.Properties.y2);
		EditingUtils.setEEFtype(y2, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.LinePrimitive.Properties.y2, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createY2Text

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
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getDrawingPriority()
	 * 
	 */
	public String getDrawingPriority() {
		return drawingPriority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setDrawingPriority(String newValue)
	 * 
	 */
	public void setDrawingPriority(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority);
		if (eefElementEditorReadOnlyState && drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(false);
			drawingPriority.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drawingPriority.isEnabled()) {
			drawingPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStroke()
	 * 
	 */
	public String getStroke() {
		return stroke.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStroke(String newValue)
	 * 
	 */
	public void setStroke(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.stroke, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.stroke);
		if (eefElementEditorReadOnlyState && stroke.isEnabled()) {
			stroke.setEnabled(false);
			stroke.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stroke.isEnabled()) {
			stroke.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeDasharray()
	 * 
	 */
	public String getStrokeDasharray() {
		return strokeDasharray.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeDasharray(String newValue)
	 * 
	 */
	public void setStrokeDasharray(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray);
		if (eefElementEditorReadOnlyState && strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(false);
			strokeDasharray.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDasharray.isEnabled()) {
			strokeDasharray.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeDashoffset()
	 * 
	 */
	public String getStrokeDashoffset() {
		return strokeDashoffset.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeDashoffset(String newValue)
	 * 
	 */
	public void setStrokeDashoffset(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset);
		if (eefElementEditorReadOnlyState && strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(false);
			strokeDashoffset.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeDashoffset.isEnabled()) {
			strokeDashoffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeLinecap()
	 * 
	 */
	public String getStrokeLinecap() {
		return strokeLinecap.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeLinecap(String newValue)
	 * 
	 */
	public void setStrokeLinecap(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap);
		if (eefElementEditorReadOnlyState && strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(false);
			strokeLinecap.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinecap.isEnabled()) {
			strokeLinecap.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeLinejoin()
	 * 
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeLinejoin(String newValue)
	 * 
	 */
	public void setStrokeLinejoin(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin);
		if (eefElementEditorReadOnlyState && strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(false);
			strokeLinejoin.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeLinejoin.isEnabled()) {
			strokeLinejoin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeMiterlimit()
	 * 
	 */
	public String getStrokeMiterlimit() {
		return strokeMiterlimit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeMiterlimit(String newValue)
	 * 
	 */
	public void setStrokeMiterlimit(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit);
		if (eefElementEditorReadOnlyState && strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(false);
			strokeMiterlimit.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeMiterlimit.isEnabled()) {
			strokeMiterlimit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokeOpacity()
	 * 
	 */
	public String getStrokeOpacity() {
		return strokeOpacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokeOpacity(String newValue)
	 * 
	 */
	public void setStrokeOpacity(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity);
		if (eefElementEditorReadOnlyState && strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(false);
			strokeOpacity.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokeOpacity.isEnabled()) {
			strokeOpacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getStrokewidth()
	 * 
	 */
	public String getStrokewidth() {
		return strokewidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setStrokewidth(String newValue)
	 * 
	 */
	public void setStrokewidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.strokewidth, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.strokewidth);
		if (eefElementEditorReadOnlyState && strokewidth.isEnabled()) {
			strokewidth.setEnabled(false);
			strokewidth.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strokewidth.isEnabled()) {
			strokewidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getVisibility()
	 * 
	 */
	public String getVisibility() {
		return visibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setVisibility(String newValue)
	 * 
	 */
	public void setVisibility(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.visibility, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getX1()
	 * 
	 */
	public String getX1() {
		return x1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setX1(String newValue)
	 * 
	 */
	public void setX1(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.x1, newValue);
		if (eefElementEditorDefaultValueState) {
			x1.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			x1.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			x1.setText(newValue);
		} else {
			x1.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.x1);
		if (eefElementEditorReadOnlyState && x1.isEnabled()) {
			x1.setEnabled(false);
			x1.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x1.isEnabled()) {
			x1.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getX2()
	 * 
	 */
	public String getX2() {
		return x2.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setX2(String newValue)
	 * 
	 */
	public void setX2(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.x2, newValue);
		if (eefElementEditorDefaultValueState) {
			x2.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			x2.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			x2.setText(newValue);
		} else {
			x2.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.x2);
		if (eefElementEditorReadOnlyState && x2.isEnabled()) {
			x2.setEnabled(false);
			x2.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x2.isEnabled()) {
			x2.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getY1()
	 * 
	 */
	public String getY1() {
		return y1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setY1(String newValue)
	 * 
	 */
	public void setY1(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.y1, newValue);
		if (eefElementEditorDefaultValueState) {
			y1.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			y1.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			y1.setText(newValue);
		} else {
			y1.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.y1);
		if (eefElementEditorReadOnlyState && y1.isEnabled()) {
			y1.setEnabled(false);
			y1.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !y1.isEnabled()) {
			y1.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#getY2()
	 * 
	 */
	public String getY2() {
		return y2.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.LinePrimitivePropertiesEditionPart#setY2(String newValue)
	 * 
	 */
	public void setY2(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.LinePrimitive.Properties.y2, newValue);
		if (eefElementEditorDefaultValueState) {
			y2.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			y2.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			y2.setText(newValue);
		} else {
			y2.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.LinePrimitive.Properties.y2);
		if (eefElementEditorReadOnlyState && y2.isEnabled()) {
			y2.setEnabled(false);
			y2.setToolTipText(Part2Messages.LinePrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !y2.isEnabled()) {
			y2.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Part2Messages.LinePrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
