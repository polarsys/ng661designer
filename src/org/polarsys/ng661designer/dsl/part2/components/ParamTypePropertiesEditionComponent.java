/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.polarsys.ng661designer.dsl.part2.gen.ModalityType;
import org.polarsys.ng661designer.dsl.part2.gen.ParamType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.ParamTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ParamTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParamTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject paramType, String editing_mode) {
		super(editingContext, paramType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.ParamType.class;
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
			
			final ParamType paramType = (ParamType)elt;
			final ParamTypePropertiesEditionPart basePart = (ParamTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.ParamType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(XMLTypePackage.Literals.STRING, paramType.getName()));
			
			if (isAccessible(Part2ViewsRepository.ParamType.Properties.modality)) {
				basePart.initModality(EEFUtils.choiceOfValues(paramType, Part2Package.eINSTANCE.getParamType_Modality()), paramType.getModality());
			}
			if (isAccessible(Part2ViewsRepository.ParamType.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(XMLTypePackage.Literals.STRING, paramType.getType()));
			
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
		if (editorKey == Part2ViewsRepository.ParamType.Properties.name) {
			return Part2Package.eINSTANCE.getParamType_Name();
		}
		if (editorKey == Part2ViewsRepository.ParamType.Properties.modality) {
			return Part2Package.eINSTANCE.getParamType_Modality();
		}
		if (editorKey == Part2ViewsRepository.ParamType.Properties.type) {
			return Part2Package.eINSTANCE.getParamType_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ParamType paramType = (ParamType)semanticObject;
		if (Part2ViewsRepository.ParamType.Properties.name == event.getAffectedEditor()) {
			paramType.setName((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ParamType.Properties.modality == event.getAffectedEditor()) {
			paramType.setModality((ModalityType)event.getNewValue());
		}
		if (Part2ViewsRepository.ParamType.Properties.type == event.getAffectedEditor()) {
			paramType.setType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.Literals.STRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ParamTypePropertiesEditionPart basePart = (ParamTypePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getParamType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ParamType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(XMLTypePackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Part2Package.eINSTANCE.getParamType_Modality().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(Part2ViewsRepository.ParamType.Properties.modality))
				basePart.setModality((ModalityType)msg.getNewValue());
			
			if (Part2Package.eINSTANCE.getParamType_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ParamType.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(XMLTypePackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setType("");
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
			Part2Package.eINSTANCE.getParamType_Name(),
			Part2Package.eINSTANCE.getParamType_Modality(),
			Part2Package.eINSTANCE.getParamType_Type()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.ParamType.Properties.name || key == Part2ViewsRepository.ParamType.Properties.modality || key == Part2ViewsRepository.ParamType.Properties.type;
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
				if (Part2ViewsRepository.ParamType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getParamType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getParamType_Name().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ParamType.Properties.modality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getParamType_Modality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getParamType_Modality().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ParamType.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getParamType_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getParamType_Type().getEAttributeType(), newValue);
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
