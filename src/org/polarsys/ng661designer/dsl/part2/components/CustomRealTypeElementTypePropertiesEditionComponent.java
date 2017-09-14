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
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.polarsys.ng661designer.dsl.part2.gen.CustomRealTypeElementType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.CustomRealTypeElementTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CustomRealTypeElementTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CustomRealTypeElementTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject customRealTypeElementType, String editing_mode) {
		super(editingContext, customRealTypeElementType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.CustomRealTypeElementType.class;
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
			
			final CustomRealTypeElementType customRealTypeElementType = (CustomRealTypeElementType)elt;
			final CustomRealTypeElementTypePropertiesEditionPart basePart = (CustomRealTypeElementTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), customRealTypeElementType.getName()));
			
			if (isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.max))
				basePart.setMax(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), customRealTypeElementType.getMax()));
			
			if (isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.min))
				basePart.setMin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), customRealTypeElementType.getMin()));
			
			if (isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution))
				basePart.setResolution(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), customRealTypeElementType.getResolution()));
			
			if (isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit))
				basePart.setUnit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), customRealTypeElementType.getUnit()));
			
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
		if (editorKey == Part2ViewsRepository.CustomRealTypeElementType.Properties.name) {
			return Part2Package.eINSTANCE.getCustomRealTypeElementType_Name();
		}
		if (editorKey == Part2ViewsRepository.CustomRealTypeElementType.Properties.max) {
			return Part2Package.eINSTANCE.getCustomRealTypeElementType_Max();
		}
		if (editorKey == Part2ViewsRepository.CustomRealTypeElementType.Properties.min) {
			return Part2Package.eINSTANCE.getCustomRealTypeElementType_Min();
		}
		if (editorKey == Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution) {
			return Part2Package.eINSTANCE.getCustomRealTypeElementType_Resolution();
		}
		if (editorKey == Part2ViewsRepository.CustomRealTypeElementType.Properties.unit) {
			return Part2Package.eINSTANCE.getCustomRealTypeElementType_Unit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CustomRealTypeElementType customRealTypeElementType = (CustomRealTypeElementType)semanticObject;
		if (Part2ViewsRepository.CustomRealTypeElementType.Properties.name == event.getAffectedEditor()) {
			customRealTypeElementType.setName((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomRealTypeElementType.Properties.max == event.getAffectedEditor()) {
			customRealTypeElementType.setMax((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomRealTypeElementType.Properties.min == event.getAffectedEditor()) {
			customRealTypeElementType.setMin((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution == event.getAffectedEditor()) {
			customRealTypeElementType.setResolution((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomRealTypeElementType.Properties.unit == event.getAffectedEditor()) {
			customRealTypeElementType.setUnit((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CustomRealTypeElementTypePropertiesEditionPart basePart = (CustomRealTypeElementTypePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getCustomRealTypeElementType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomRealTypeElementType_Max().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.max)) {
				if (msg.getNewValue() != null) {
					basePart.setMax(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setMax("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomRealTypeElementType_Min().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.min)) {
				if (msg.getNewValue() != null) {
					basePart.setMin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setMin("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomRealTypeElementType_Resolution().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution)) {
				if (msg.getNewValue() != null) {
					basePart.setResolution(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setResolution("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomRealTypeElementType_Unit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomRealTypeElementType.Properties.unit)) {
				if (msg.getNewValue() != null) {
					basePart.setUnit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setUnit("");
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
			Part2Package.eINSTANCE.getCustomRealTypeElementType_Name(),
			Part2Package.eINSTANCE.getCustomRealTypeElementType_Max(),
			Part2Package.eINSTANCE.getCustomRealTypeElementType_Min(),
			Part2Package.eINSTANCE.getCustomRealTypeElementType_Resolution(),
			Part2Package.eINSTANCE.getCustomRealTypeElementType_Unit()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.CustomRealTypeElementType.Properties.name;
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
				if (Part2ViewsRepository.CustomRealTypeElementType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomRealTypeElementType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomRealTypeElementType_Name().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomRealTypeElementType.Properties.max == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomRealTypeElementType_Max().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomRealTypeElementType_Max().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomRealTypeElementType.Properties.min == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomRealTypeElementType_Min().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomRealTypeElementType_Min().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomRealTypeElementType.Properties.resolution == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomRealTypeElementType_Resolution().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomRealTypeElementType_Resolution().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomRealTypeElementType.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomRealTypeElementType_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomRealTypeElementType_Unit().getEAttributeType(), newValue);
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
