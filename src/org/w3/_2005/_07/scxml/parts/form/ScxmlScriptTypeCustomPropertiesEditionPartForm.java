/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.w3._2005._07.scxml.parts.form;

import org.eclipse.core.resources.ResourcesPlugin;
// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;
import org.w3._2005._07.scxml.parts.forms.ScxmlScriptTypePropertiesEditionPartForm;

import com.google.common.base.Strings;

// End of user code

/**
 * 
 * 
 */
public class ScxmlScriptTypeCustomPropertiesEditionPartForm extends ScxmlScriptTypePropertiesEditionPartForm {

	private Button browseButton;
	private Button contentButton;
	private Button fileRadioButton;

	/**
	 * For {@link ISection} use only.
	 */
	public ScxmlScriptTypeCustomPropertiesEditionPartForm() {
		super();
	}

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScxmlScriptTypeCustomPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.w3._2005._07.scxml.parts.forms.ScxmlScriptTypePropertiesEditionPartForm#createSrcText(org.eclipse.ui.forms.widgets.FormToolkit,
	 *      org.eclipse.swt.widgets.Composite)
	 */
	protected Composite createSrcText(FormToolkit widgetFactory, Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		fileRadioButton = new Button(parent, SWT.RADIO);
		fileRadioButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		fileRadioButton.setText("From file");

		Composite fileComposite = new Composite(parent, SWT.NONE);
		fileComposite.setLayout(new GridLayout(2, false));
		fileComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		src = widgetFactory.createText(fileComposite, ""); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null, src.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, src.getText()));
				}
			}
		});
		EditingUtils.setID(src, ScxmlViewsRepository.ScxmlScriptType.Properties.src);
		EditingUtils.setEEFtype(src, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.src, ScxmlViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSrcText
		browseButton = new Button(fileComposite, SWT.NONE);
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell());
				dialog.setFilterExtensions(new String[] { "*.*" });
				dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				dialog.setText("Choose script file");
				String open = dialog.open();
				if (!Strings.isNullOrEmpty(open)) {
					src.setText(dialog.getFilterPath() + System.getProperty("file.separator") + dialog.getFileName());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.src, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null, src.getText()));
				}
			}
		});
		// End of user code
		return parent;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.w3._2005._07.scxml.parts.forms.ScxmlScriptTypePropertiesEditionPartForm#createContentTextarea(org.eclipse.ui.forms.widgets.FormToolkit,
	 *      org.eclipse.swt.widgets.Composite)
	 */
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		contentButton = new Button(parent, SWT.RADIO);
		contentButton.setText("Script content");
		content = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, ScxmlViewsRepository.ScxmlScriptType.Properties.content, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null, content.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScxmlScriptTypeCustomPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		EditingUtils.setID(content, ScxmlViewsRepository.ScxmlScriptType.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScxmlViewsRepository.ScxmlScriptType.Properties.content, ScxmlViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createContentTextArea
		fileRadioButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (fileRadioButton.getSelection()) {
					selectFileRadioButton();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		contentButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (contentButton.getSelection()) {
					selectContentRadiobutton();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		// End of user code
		return parent;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setSrc(String
	 *      newValue)
	 * 
	 */
	public void setSrc(String newValue) {
		super.setSrc(newValue);
		selectFileRadioButton();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.w3._2005._07.scxml.parts.ScxmlScriptTypePropertiesEditionPart#setContent(String
	 *      newValue)
	 * 
	 */
	public void setContent(String newValue) {
		super.setContent(newValue);
		selectContentRadiobutton();
	}

	protected void selectFileRadioButton() {
		if (fileRadioButton != null) {			
			fileRadioButton.setSelection(true);
		}
		if (content != null) {			
			content.setEnabled(false);
			content.setBackground(content.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		}
		if (src != null) {			
			src.setEnabled(true);
		}
		if (browseButton != null) {			
			browseButton.setEnabled(true);
		}
		if (contentButton != null) {			
			contentButton.setSelection(false);
		}
	}

	protected void selectContentRadiobutton() {
		if (contentButton != null) {			
			contentButton.setSelection(true);
		}
		if (content != null) {			
			content.setEnabled(true);
			content.setBackground(content.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		}
		if (src != null) {			
			src.setEnabled(false);
		}
		if (browseButton != null) {			
			browseButton.setEnabled(false);
		}
		if (fileRadioButton != null) {			
			fileRadioButton.setSelection(false);
		}
	}
}
