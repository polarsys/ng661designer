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
import org.w3._2005._07.scxml.ScxmlScriptType;
import org.w3._2005._07.scxml.ScxmlSendType;
import org.w3._2005._07.scxml.ScxmlTransitionType;
import org.w3._2005._07.scxml.parts.ScxmlTransitionTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ScxmlTransitionTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for send ReferencesTable
	 */
	protected ReferencesTableSettings sendSettings;
	
	/**
	 * Settings for script ReferencesTable
	 */
	protected ReferencesTableSettings scriptSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScxmlTransitionTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlTransitionType, String editing_mode) {
		super(editingContext, scxmlTransitionType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScxmlViewsRepository.class;
		partKey = ScxmlViewsRepository.ScxmlTransitionType.class;
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
			
			final ScxmlTransitionType scxmlTransitionType = (ScxmlTransitionType)elt;
			final ScxmlTransitionTypePropertiesEditionPart basePart = (ScxmlTransitionTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.send)) {
				sendSettings = new ReferencesTableSettings(scxmlTransitionType, ScxmlPackage.eINSTANCE.getScxmlTransitionType_Send());
				basePart.initSend(sendSettings);
			}
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.script)) {
				scriptSettings = new ReferencesTableSettings(scxmlTransitionType, ScxmlPackage.eINSTANCE.getScxmlTransitionType_Script());
				basePart.initScript(scriptSettings);
			}
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond))
				basePart.setCond(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_TRANSITION_COND_TYPE, scxmlTransitionType.getCond()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.event))
				basePart.setEvent(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_TRANSITION_EVENT_TYPE, scxmlTransitionType.getEvent()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.target))
				basePart.setTarget(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlTransitionType.getTarget()));
			
			// init filters
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.send)) {
				basePart.addFilterToSend(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ScxmlSendType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for send
				// End of user code
			}
			if (isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.script)) {
				basePart.addFilterToScript(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ScxmlScriptType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for script
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
		if (editorKey == ScxmlViewsRepository.ScxmlTransitionType.Properties.send) {
			return ScxmlPackage.eINSTANCE.getScxmlTransitionType_Send();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlTransitionType.Properties.script) {
			return ScxmlPackage.eINSTANCE.getScxmlTransitionType_Script();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlTransitionType.Properties.cond) {
			return ScxmlPackage.eINSTANCE.getScxmlTransitionType_Cond();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlTransitionType.Properties.event) {
			return ScxmlPackage.eINSTANCE.getScxmlTransitionType_Event();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlTransitionType.Properties.target) {
			return ScxmlPackage.eINSTANCE.getScxmlTransitionType_Target();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlTransitionType scxmlTransitionType = (ScxmlTransitionType)semanticObject;
		if (ScxmlViewsRepository.ScxmlTransitionType.Properties.send == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sendSettings, editingContext.getAdapterFactory());
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
				sendSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sendSettings.move(event.getNewIndex(), (ScxmlSendType) event.getNewValue());
			}
		}
		if (ScxmlViewsRepository.ScxmlTransitionType.Properties.script == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, scriptSettings, editingContext.getAdapterFactory());
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
				scriptSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				scriptSettings.move(event.getNewIndex(), (ScxmlScriptType) event.getNewValue());
			}
		}
		if (ScxmlViewsRepository.ScxmlTransitionType.Properties.cond == event.getAffectedEditor()) {
			scxmlTransitionType.setCond((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_TRANSITION_COND_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlTransitionType.Properties.event == event.getAffectedEditor()) {
			scxmlTransitionType.setEvent((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_TRANSITION_EVENT_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlTransitionType.Properties.target == event.getAffectedEditor()) {
			scxmlTransitionType.setTarget((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_ID_TYPE, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlTransitionTypePropertiesEditionPart basePart = (ScxmlTransitionTypePropertiesEditionPart)editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlTransitionType_Send().equals(msg.getFeature()) && isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.send))
				basePart.updateSend();
			if (ScxmlPackage.eINSTANCE.getScxmlTransitionType_Script().equals(msg.getFeature()) && isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.script))
				basePart.updateScript();
			if (ScxmlPackage.eINSTANCE.getScxmlTransitionType_Cond().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.cond)) {
				if (msg.getNewValue() != null) {
					basePart.setCond(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_TRANSITION_COND_TYPE, msg.getNewValue()));
				} else {
					basePart.setCond("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlTransitionType_Event().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.event)) {
				if (msg.getNewValue() != null) {
					basePart.setEvent(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_TRANSITION_EVENT_TYPE, msg.getNewValue()));
				} else {
					basePart.setEvent("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlTransitionType_Target().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlTransitionType.Properties.target)) {
				if (msg.getNewValue() != null) {
					basePart.setTarget(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, msg.getNewValue()));
				} else {
					basePart.setTarget("");
				}
			}
			
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
			ScxmlPackage.eINSTANCE.getScxmlTransitionType_Send(),
			ScxmlPackage.eINSTANCE.getScxmlTransitionType_Script(),
			ScxmlPackage.eINSTANCE.getScxmlTransitionType_Cond(),
			ScxmlPackage.eINSTANCE.getScxmlTransitionType_Event(),
			ScxmlPackage.eINSTANCE.getScxmlTransitionType_Target()		);
		return new NotificationFilter[] {filter,};
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
				if (ScxmlViewsRepository.ScxmlTransitionType.Properties.cond == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Cond().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Cond().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlTransitionType.Properties.event == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Event().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Event().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlTransitionType.Properties.target == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Target().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlTransitionType_Target().getEAttributeType(), newValue);
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
