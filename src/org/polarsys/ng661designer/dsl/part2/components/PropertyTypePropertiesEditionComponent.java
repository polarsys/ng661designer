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
import org.polarsys.ng661designer.dsl.part2.gen.ModalityType1;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyType;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PropertyTypePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PropertyTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PropertyTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertyType, String editing_mode) {
		super(editingContext, propertyType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.PropertyType.class;
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
			
			final PropertyType propertyType = (PropertyType)elt;
			final PropertyTypePropertiesEditionPart basePart = (PropertyTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.PropertyType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), propertyType.getName()));
			
			if (isAccessible(Part2ViewsRepository.PropertyType.Properties.modality)) {
				basePart.initModality(EEFUtils.choiceOfValues(propertyType, Part2Package.eINSTANCE.getPropertyType_Modality()), propertyType.getModality());
			}
			if (isAccessible(Part2ViewsRepository.PropertyType.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getTypeType(), propertyType.getType()));
			
			if (isAccessible(Part2ViewsRepository.PropertyType.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(XMLTypePackage.Literals.STRING, propertyType.getValue()));
			
			if (isAccessible(Part2ViewsRepository.PropertyType.Properties.maxStringLength))
				basePart.setMaxStringLength(EEFConverterUtil.convertToString(XMLTypePackage.Literals.INTEGER, propertyType.getMaxStringLength()));
			
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
		if (editorKey == Part2ViewsRepository.PropertyType.Properties.name) {
			return Part2Package.eINSTANCE.getPropertyType_Name();
		}
		if (editorKey == Part2ViewsRepository.PropertyType.Properties.modality) {
			return Part2Package.eINSTANCE.getPropertyType_Modality();
		}
		if (editorKey == Part2ViewsRepository.PropertyType.Properties.type) {
			return Part2Package.eINSTANCE.getPropertyType_Type();
		}
		if (editorKey == Part2ViewsRepository.PropertyType.Properties.value) {
			return Part2Package.eINSTANCE.getPropertyType_Value();
		}
		if (editorKey == Part2ViewsRepository.PropertyType.Properties.maxStringLength) {
			return Part2Package.eINSTANCE.getPropertyType_MaxStringLength();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PropertyType propertyType = (PropertyType)semanticObject;
		if (Part2ViewsRepository.PropertyType.Properties.name == event.getAffectedEditor()) {
			propertyType.setName((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PropertyType.Properties.modality == event.getAffectedEditor()) {
			propertyType.setModality((ModalityType1)event.getNewValue());
		}
		if (Part2ViewsRepository.PropertyType.Properties.type == event.getAffectedEditor()) {
			propertyType.setType((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTypeType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PropertyType.Properties.value == event.getAffectedEditor()) {
			propertyType.setValue((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PropertyType.Properties.maxStringLength == event.getAffectedEditor()) {
			propertyType.setMaxStringLength((java.math.BigInteger)EEFConverterUtil.createFromString(XMLTypePackage.Literals.INTEGER, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PropertyTypePropertiesEditionPart basePart = (PropertyTypePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getPropertyType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PropertyType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Part2Package.eINSTANCE.getPropertyType_Modality().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(Part2ViewsRepository.PropertyType.Properties.modality))
				basePart.setModality((ModalityType1)msg.getNewValue());
			
			if (Part2Package.eINSTANCE.getPropertyType_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PropertyType.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(Part2Package.eINSTANCE.getTypeType(), msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (Part2Package.eINSTANCE.getPropertyType_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PropertyType.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(XMLTypePackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (Part2Package.eINSTANCE.getPropertyType_MaxStringLength().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PropertyType.Properties.maxStringLength)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxStringLength(EcoreUtil.convertToString(XMLTypePackage.Literals.INTEGER, msg.getNewValue()));
				} else {
					basePart.setMaxStringLength("");
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
			Part2Package.eINSTANCE.getPropertyType_Name(),
			Part2Package.eINSTANCE.getPropertyType_Modality(),
			Part2Package.eINSTANCE.getPropertyType_Type(),
			Part2Package.eINSTANCE.getPropertyType_Value(),
			Part2Package.eINSTANCE.getPropertyType_MaxStringLength()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.PropertyType.Properties.name || key == Part2ViewsRepository.PropertyType.Properties.modality || key == Part2ViewsRepository.PropertyType.Properties.type || key == Part2ViewsRepository.PropertyType.Properties.value;
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
				if (Part2ViewsRepository.PropertyType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPropertyType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPropertyType_Name().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PropertyType.Properties.modality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPropertyType_Modality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPropertyType_Modality().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PropertyType.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPropertyType_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPropertyType_Type().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PropertyType.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPropertyType_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPropertyType_Value().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PropertyType.Properties.maxStringLength == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPropertyType_MaxStringLength().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPropertyType_MaxStringLength().getEAttributeType(), newValue);
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
