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
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.parts.ScxmlScxmlTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ScxmlScxmlTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScxmlScxmlTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlScxmlType, String editing_mode) {
		super(editingContext, scxmlScxmlType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScxmlViewsRepository.class;
		partKey = ScxmlViewsRepository.ScxmlScxmlType.class;
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
			
			final ScxmlScxmlType scxmlScxmlType = (ScxmlScxmlType)elt;
			final ScxmlScxmlTypePropertiesEditionPart basePart = (ScxmlScxmlTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlScxmlType.getId()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(XMLTypePackage.Literals.DECIMAL, scxmlScxmlType.getVersion()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial))
				basePart.setInitial(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlScxmlType.getInitial()));
			
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
		if (editorKey == ScxmlViewsRepository.ScxmlScxmlType.Properties.id) {
			return ScxmlPackage.eINSTANCE.getScxmlScxmlType_Id();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlScxmlType.Properties.version) {
			return ScxmlPackage.eINSTANCE.getScxmlScxmlType_Version();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlScxmlType.Properties.initial) {
			return ScxmlPackage.eINSTANCE.getScxmlScxmlType_Initial();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlScxmlType scxmlScxmlType = (ScxmlScxmlType)semanticObject;
		if (ScxmlViewsRepository.ScxmlScxmlType.Properties.id == event.getAffectedEditor()) {
			scxmlScxmlType.setId((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_ID_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlScxmlType.Properties.version == event.getAffectedEditor()) {
			scxmlScxmlType.setVersion((java.math.BigDecimal)EEFConverterUtil.createFromString(XMLTypePackage.Literals.DECIMAL, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlScxmlType.Properties.initial == event.getAffectedEditor()) {
			scxmlScxmlType.setInitial((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_ID_TYPE, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlScxmlTypePropertiesEditionPart basePart = (ScxmlScxmlTypePropertiesEditionPart)editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlScxmlType_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_ID_TYPE, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlScxmlType_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(XMLTypePackage.Literals.DECIMAL, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlScxmlType_Initial().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlScxmlType.Properties.initial)) {
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
			ScxmlPackage.eINSTANCE.getScxmlScxmlType_Id(),
			ScxmlPackage.eINSTANCE.getScxmlScxmlType_Version(),
			ScxmlPackage.eINSTANCE.getScxmlScxmlType_Initial()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScxmlViewsRepository.ScxmlScxmlType.Properties.version;
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
				if (ScxmlViewsRepository.ScxmlScxmlType.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Id().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlScxmlType.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Version().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlScxmlType.Properties.initial == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Initial().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlScxmlType_Initial().getEAttributeType(), newValue);
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
