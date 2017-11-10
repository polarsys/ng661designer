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
import org.w3._2005._07.scxml.ScxmlParamType;
import org.w3._2005._07.scxml.parts.ScxmlParamTypePropertiesEditionPart;
import org.w3._2005._07.scxml.parts.ScxmlViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ScxmlParamTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScxmlParamTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scxmlParamType, String editing_mode) {
		super(editingContext, scxmlParamType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScxmlViewsRepository.class;
		partKey = ScxmlViewsRepository.ScxmlParamType.class;
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
			
			final ScxmlParamType scxmlParamType = (ScxmlParamType)elt;
			final ScxmlParamTypePropertiesEditionPart basePart = (ScxmlParamTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScxmlViewsRepository.ScxmlParamType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, scxmlParamType.getName()));
			
			if (isAccessible(ScxmlViewsRepository.ScxmlParamType.Properties.expr))
				basePart.setExpr(EEFConverterUtil.convertToString(ScxmlPackage.Literals.SCXML_EXPR_TYPE, scxmlParamType.getExpr()));
			
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
		if (editorKey == ScxmlViewsRepository.ScxmlParamType.Properties.name) {
			return ScxmlPackage.eINSTANCE.getScxmlParamType_Name();
		}
		if (editorKey == ScxmlViewsRepository.ScxmlParamType.Properties.expr) {
			return ScxmlPackage.eINSTANCE.getScxmlParamType_Expr();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScxmlParamType scxmlParamType = (ScxmlParamType)semanticObject;
		if (ScxmlViewsRepository.ScxmlParamType.Properties.name == event.getAffectedEditor()) {
			scxmlParamType.setName((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, (String)event.getNewValue()));
		}
		if (ScxmlViewsRepository.ScxmlParamType.Properties.expr == event.getAffectedEditor()) {
			scxmlParamType.setExpr((java.lang.String)EEFConverterUtil.createFromString(ScxmlPackage.Literals.SCXML_EXPR_TYPE, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScxmlParamTypePropertiesEditionPart basePart = (ScxmlParamTypePropertiesEditionPart)editingPart;
			if (ScxmlPackage.eINSTANCE.getScxmlParamType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlParamType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ScxmlPackage.eINSTANCE.getScxmlParamType_Expr().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScxmlViewsRepository.ScxmlParamType.Properties.expr)) {
				if (msg.getNewValue() != null) {
					basePart.setExpr(EcoreUtil.convertToString(ScxmlPackage.Literals.SCXML_EXPR_TYPE, msg.getNewValue()));
				} else {
					basePart.setExpr("");
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
			ScxmlPackage.eINSTANCE.getScxmlParamType_Name(),
			ScxmlPackage.eINSTANCE.getScxmlParamType_Expr()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScxmlViewsRepository.ScxmlParamType.Properties.name || key == ScxmlViewsRepository.ScxmlParamType.Properties.expr;
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
				if (ScxmlViewsRepository.ScxmlParamType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlParamType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlParamType_Name().getEAttributeType(), newValue);
				}
				if (ScxmlViewsRepository.ScxmlParamType.Properties.expr == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScxmlPackage.eINSTANCE.getScxmlParamType_Expr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScxmlPackage.eINSTANCE.getScxmlParamType_Expr().getEAttributeType(), newValue);
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
