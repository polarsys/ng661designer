/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlParamType;
import org.w3._2005._07.scxml.ScxmlSendType;
import org.w3._2005._07.scxml.parts.ScxmlSendTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ScxmlSendTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for param ReferencesTable
	 */
	protected ReferencesTableSettings paramSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScxmlSendTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlSendType, String editing_mode) {
		super(editingContext, scxmlSendType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScxmlViewsRepository.class;
		partKey = ScxmlViewsRepository.ScxmlSendType.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ScxmlSendType scxmlSendType = (ScxmlSendType)elt;
			final ScxmlSendTypePropertiesEditionPart basePart = (ScxmlSendTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScxmlViewsRepository.ScxmlSendType.Properties.event))
				basePart.setEvent(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_SEND_EVENT_TYPE, scxmlSendType.getEvent()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlSendType.Properties.param)) {
				paramSettings = new ReferencesTableSettings(scxmlSendType, ScxmlPackage.eINSTANCE.getScxmlSendType_Param());
				basePart.initParam(paramSettings);
			}
			// init filters
			
			if (isAccessible(ScxmlViewsRepository.ScxmlSendType.Properties.param)) {
				basePart.addFilterToParam(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ScxmlParamType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for param
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ScxmlViewsRepository.ScxmlSendType.Properties.event) {
			return ScxmlPackage.eINSTANCE.getScxmlSendType_Event();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlSendType.Properties.param) {
			return ScxmlPackage.eINSTANCE.getScxmlSendType_Param();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlSendType scxmlSendType = (ScxmlSendType)semanticObject;
		if (ScxmlViewsRepository.ScxmlSendType.Properties.event == event.getAffectedEditor()) {
			scxmlSendType.setEvent((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_SEND_EVENT_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlSendType.Properties.param == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, paramSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				paramSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				paramSettings.move(event.getNewIndex(), (ScxmlParamType) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlSendTypePropertiesEditionPart basePart = (ScxmlSendTypePropertiesEditionPart)editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlSendType_Event().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlSendType.Properties.event)) {
				if (msg.getNewValue() != null) {
					basePart.setEvent(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_SEND_EVENT_TYPE, msg.getNewValue()));
				} else {
					basePart.setEvent("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlSendType_Param().equals(msg.getFeature()) && isAccessible(ScxmlViewsRepository.ScxmlSendType.Properties.param))
				basePart.updateParam();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ScxmlPackage.eINSTANCE.getScxmlSendType_Event(),
			ScxmlPackage.eINSTANCE.getScxmlSendType_Param()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScxmlViewsRepository.ScxmlSendType.Properties.event;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ScxmlViewsRepository.ScxmlSendType.Properties.event == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlSendType_Event().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlSendType_Event().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
