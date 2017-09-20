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
import org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.providers.ScxmlMessages;

import org.polarsys.ng661designer.eef.parts.DefaultValueSectionPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ScxmlScriptTypePropertiesEditionPartForm extends DefaultValueSectionPropertiesEditionPart implements IFormPropertiesEditionPart, ScxmlScriptTypePropertiesEditionPart {

	protected Text src;
	protected Text content;



	/**
	 * For {@link ISection} use only.
	 */
	public ScxmlScriptTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlScriptTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scxmlScriptTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scxmlScriptTypeStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.class);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		propertiesStep.addStep(ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		
		
		composer = new PartComposer(scxmlScriptTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.src) {
					return createSrcText(widgetFactory, parent);
				}
				if (key == ScxmlViewsRepository.ScxmlScriptType.Properties.content) {
					return createContentText(widgetFactory, parent);
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
		propertiesSection.setText(ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createSrcText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScriptType.Properties.src, ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_SrcLabel);
		src = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		src.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData srcData = new GridData(GridData.FILL_HORIZONTAL);
		src.setLayoutData(srcData);
		src.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScxmlScriptTypePropertiesEditionPartForm.this,
							ScxmlViewsRepository.ScxmlScriptType.Properties.src,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScxmlScriptTypePropertiesEditionPartForm.this,
									ScxmlViewsRepository.ScxmlScriptType.Properties.src,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, src.getText()));
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
									ScxmlScriptTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		src.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
				}
			}
		});
		EditingUtils.setID(src, ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		EditingUtils.setEEFtype(src, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.src, ScxmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSrcText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ScxmlViewsRepository.ScxmlScriptType.Properties.content, ScxmlMessages.ScxmlScriptTypePropertiesEditionPart_ContentLabel);
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScxmlScriptTypePropertiesEditionPartForm.this,
							ScxmlViewsRepository.ScxmlScriptType.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScxmlScriptTypePropertiesEditionPartForm.this,
									ScxmlViewsRepository.ScxmlScriptType.Properties.content,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, content.getText()));
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
									ScxmlScriptTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypePropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.content, ScxmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

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
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#getSrc()
	 * 
	 */
	public String getSrc() {
		return src.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setSrc(String newValue)
	 * 
	 */
	public void setSrc(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScriptType.Properties.src, newValue);
		if (eefElementEditorDefaultValueState) {
			src.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			src.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			src.setText(newValue);
		} else {
			src.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		if (eefElementEditorReadOnlyState && src.isEnabled()) {
			src.setEnabled(false);
			src.setToolTipText(ScxmlMessages.ScxmlScriptType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !src.isEnabled()) {
			src.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		boolean eefElementEditorDefaultValueState = isDefault(ScxmlViewsRepository.ScxmlScriptType.Properties.content, newValue);
		if (eefElementEditorDefaultValueState) {
			content.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
		} else {
			content.setFont(JFaceResources.getFontRegistry().defaultFont());
		}
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ScxmlMessages.ScxmlScriptType_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScxmlMessages.ScxmlScriptType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
