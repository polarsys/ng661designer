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
import org.polarsys.ng661designer.dsl.part2.parts.GestureAreaPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.providers.Part2Messages;

import org.polarsys.ng661designer.eef.parts.DefaultValueCompositePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class GestureAreaPrimitivePropertiesEditionPartImpl extends DefaultValueCompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GestureAreaPrimitivePropertiesEditionPart {

	protected Text id;
	protected Text acceptedGesture;
	protected Text clipPath;
	protected Text clipRule;
	protected Text enabled;
	protected Text height;
	protected Text transform;
	protected Text width;
	protected Text x;
	protected Text y;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GestureAreaPrimitivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence gestureAreaPrimitiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = gestureAreaPrimitiveStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.class);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.id);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.height);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.width);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.x);
		propertiesStep.addStep(Part2ViewsRepository.GestureAreaPrimitive.Properties.y);
		
		
		composer = new PartComposer(gestureAreaPrimitiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.id) {
					return createIdText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture) {
					return createAcceptedGestureText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath) {
					return createClipPathText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule) {
					return createClipRuleText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled) {
					return createEnabledText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.height) {
					return createHeightText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.transform) {
					return createTransformText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.width) {
					return createWidthText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.x) {
					return createXText(parent);
				}
				if (key == Part2ViewsRepository.GestureAreaPrimitive.Properties.y) {
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
		propertiesGroup.setText(Part2Messages.GestureAreaPrimitivePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.id, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Part2ViewsRepository.GestureAreaPrimitive.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.id, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createAcceptedGestureText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_AcceptedGestureLabel);
		acceptedGesture = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData acceptedGestureData = new GridData(GridData.FILL_HORIZONTAL);
		acceptedGesture.setLayoutData(acceptedGestureData);
		acceptedGesture.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, acceptedGesture.getText()));
			}

		});
		acceptedGesture.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, acceptedGesture.getText()));
				}
			}

		});
		EditingUtils.setID(acceptedGesture, Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture);
		EditingUtils.setEEFtype(acceptedGesture, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAcceptedGestureText

		// End of user code
		return parent;
	}

	
	protected Composite createClipPathText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_ClipPathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipPath.getText()));
				}
			}

		});
		EditingUtils.setID(clipPath, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath);
		EditingUtils.setEEFtype(clipPath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipPathText

		// End of user code
		return parent;
	}

	
	protected Composite createClipRuleText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_ClipRuleLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clipRule.getText()));
				}
			}

		});
		EditingUtils.setID(clipRule, Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule);
		EditingUtils.setEEFtype(clipRule, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClipRuleText

		// End of user code
		return parent;
	}

	
	protected Composite createEnabledText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_EnabledLabel);
		enabled = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData enabledData = new GridData(GridData.FILL_HORIZONTAL);
		enabled.setLayoutData(enabledData);
		enabled.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
			}

		});
		enabled.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, enabled.getText()));
				}
			}

		});
		EditingUtils.setID(enabled, Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled);
		EditingUtils.setEEFtype(enabled, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnabledText

		// End of user code
		return parent;
	}

	
	protected Composite createHeightText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.height, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_HeightLabel);
		height = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData heightData = new GridData(GridData.FILL_HORIZONTAL);
		height.setLayoutData(heightData);
		height.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.height, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, height.getText()));
			}

		});
		height.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.height, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, height.getText()));
				}
			}

		});
		EditingUtils.setID(height, Part2ViewsRepository.GestureAreaPrimitive.Properties.height);
		EditingUtils.setEEFtype(height, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.height, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createHeightText

		// End of user code
		return parent;
	}

	
	protected Composite createTransformText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.transform, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_TransformLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.transform, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transform.getText()));
				}
			}

		});
		EditingUtils.setID(transform, Part2ViewsRepository.GestureAreaPrimitive.Properties.transform);
		EditingUtils.setEEFtype(transform, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformText

		// End of user code
		return parent;
	}

	
	protected Composite createWidthText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.width, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_WidthLabel);
		width = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData widthData = new GridData(GridData.FILL_HORIZONTAL);
		width.setLayoutData(widthData);
		width.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.width, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
			}

		});
		width.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.width, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
				}
			}

		});
		EditingUtils.setID(width, Part2ViewsRepository.GestureAreaPrimitive.Properties.width);
		EditingUtils.setEEFtype(width, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.width, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWidthText

		// End of user code
		return parent;
	}

	
	protected Composite createXText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.x, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_XLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.x, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, x.getText()));
				}
			}

		});
		EditingUtils.setID(x, Part2ViewsRepository.GestureAreaPrimitive.Properties.x);
		EditingUtils.setEEFtype(x, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.x, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createXText

		// End of user code
		return parent;
	}

	
	protected Composite createYText(Composite parent) {
		createDescription(parent, Part2ViewsRepository.GestureAreaPrimitive.Properties.y, Part2Messages.GestureAreaPrimitivePropertiesEditionPart_YLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GestureAreaPrimitivePropertiesEditionPartImpl.this, Part2ViewsRepository.GestureAreaPrimitive.Properties.y, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, y.getText()));
				}
			}

		});
		EditingUtils.setID(y, Part2ViewsRepository.GestureAreaPrimitive.Properties.y);
		EditingUtils.setEEFtype(y, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Part2ViewsRepository.GestureAreaPrimitive.Properties.y, Part2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.id, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getAcceptedGesture()
	 * 
	 */
	public String getAcceptedGesture() {
		return acceptedGesture.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setAcceptedGesture(String newValue)
	 * 
	 */
	public void setAcceptedGesture(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture, newValue);
		if (eefElementEditorDefaultValueState) {
			acceptedGesture.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			acceptedGesture.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			acceptedGesture.setText(newValue);
		} else {
			acceptedGesture.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture);
		if (eefElementEditorReadOnlyState && acceptedGesture.isEnabled()) {
			acceptedGesture.setEnabled(false);
			acceptedGesture.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !acceptedGesture.isEnabled()) {
			acceptedGesture.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getClipPath()
	 * 
	 */
	public String getClipPath() {
		return clipPath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setClipPath(String newValue)
	 * 
	 */
	public void setClipPath(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath);
		if (eefElementEditorReadOnlyState && clipPath.isEnabled()) {
			clipPath.setEnabled(false);
			clipPath.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipPath.isEnabled()) {
			clipPath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getClipRule()
	 * 
	 */
	public String getClipRule() {
		return clipRule.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setClipRule(String newValue)
	 * 
	 */
	public void setClipRule(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule);
		if (eefElementEditorReadOnlyState && clipRule.isEnabled()) {
			clipRule.setEnabled(false);
			clipRule.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clipRule.isEnabled()) {
			clipRule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getEnabled()
	 * 
	 */
	public String getEnabled() {
		return enabled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setEnabled(String newValue)
	 * 
	 */
	public void setEnabled(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled);
		if (eefElementEditorReadOnlyState && enabled.isEnabled()) {
			enabled.setEnabled(false);
			enabled.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enabled.isEnabled()) {
			enabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getHeight()
	 * 
	 */
	public String getHeight() {
		return height.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setHeight(String newValue)
	 * 
	 */
	public void setHeight(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.height, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.height);
		if (eefElementEditorReadOnlyState && height.isEnabled()) {
			height.setEnabled(false);
			height.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !height.isEnabled()) {
			height.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getTransform()
	 * 
	 */
	public String getTransform() {
		return transform.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setTransform(String newValue)
	 * 
	 */
	public void setTransform(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform);
		if (eefElementEditorReadOnlyState && transform.isEnabled()) {
			transform.setEnabled(false);
			transform.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transform.isEnabled()) {
			transform.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getWidth()
	 * 
	 */
	public String getWidth() {
		return width.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setWidth(String newValue)
	 * 
	 */
	public void setWidth(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.width, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.width);
		if (eefElementEditorReadOnlyState && width.isEnabled()) {
			width.setEnabled(false);
			width.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !width.isEnabled()) {
			width.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getX()
	 * 
	 */
	public String getX() {
		return x.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setX(String newValue)
	 * 
	 */
	public void setX(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.x, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.x);
		if (eefElementEditorReadOnlyState && x.isEnabled()) {
			x.setEnabled(false);
			x.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !x.isEnabled()) {
			x.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#getY()
	 * 
	 */
	public String getY() {
		return y.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.example.ng661.part2.parts.GestureAreaPrimitivePropertiesEditionPart#setY(String newValue)
	 * 
	 */
	public void setY(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(Part2ViewsRepository.GestureAreaPrimitive.Properties.y, newValue);
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
		boolean eefElementEditorReadOnlyState = isReadOnly(Part2ViewsRepository.GestureAreaPrimitive.Properties.y);
		if (eefElementEditorReadOnlyState && y.isEnabled()) {
			y.setEnabled(false);
			y.setToolTipText(Part2Messages.GestureAreaPrimitive_ReadOnly);
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
		return Part2Messages.GestureAreaPrimitive_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
