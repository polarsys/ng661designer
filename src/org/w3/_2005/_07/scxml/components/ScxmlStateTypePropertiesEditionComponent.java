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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.parts.ScxmlStateTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ScxmlStateTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScxmlStateTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlStateType, String editing_mode) {
		super(editingContext, scxmlStateType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScxmlViewsRepository.class;
		partKey = ScxmlViewsRepository.ScxmlStateType.class;
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
			
			final ScxmlStateType scxmlStateType = (ScxmlStateType)elt;
			final ScxmlStateTypePropertiesEditionPart basePart = (ScxmlStateTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScxmlViewsRepository.ScxmlStateType.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlStateType.getId()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlStateType.Properties.initial))
				basePart.setInitial(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlStateType.getInitial()));
			
			// init filters
			
			
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
		if (editorKey == ScxmlViewsRepository.ScxmlStateType.Properties.id) {
			return ScxmlPackage.eINSTANCE.getScxmlStateType_Id();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlStateType.Properties.initial) {
			return ScxmlPackage.eINSTANCE.getScxmlStateType_Initial();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlStateType scxmlStateType = (ScxmlStateType)semanticObject;
		if (ScxmlViewsRepository.ScxmlStateType.Properties.id == event.getAffectedEditor()) {
			scxmlStateType.setId((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_ID_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlStateType.Properties.initial == event.getAffectedEditor()) {
			scxmlStateType.setInitial((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_ID_TYPE, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlStateTypePropertiesEditionPart basePart = (ScxmlStateTypePropertiesEditionPart)editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlStateType_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlStateType.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlStateType_Initial().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlStateType.Properties.initial)) {
				if (msg.getNewValue() != null) {
					basePart.setInitial(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, msg.getNewValue()));
				} else {
					basePart.setInitial("");
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
			ScxmlPackage.eINSTANCE.getScxmlStateType_Id(),
			ScxmlPackage.eINSTANCE.getScxmlStateType_Initial()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScxmlViewsRepository.ScxmlStateType.Properties.id;
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
				if (ScxmlViewsRepository.ScxmlStateType.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlStateType_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlStateType_Id().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlStateType.Properties.initial == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlStateType_Initial().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlStateType_Initial().getEAttributeType(), newValue);
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
