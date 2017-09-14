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
import org.polarsys.ng661designer.dsl.part2.gen.CustomIntegerTypeElementType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.CustomIntegerTypeElementTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CustomIntegerTypeElementTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CustomIntegerTypeElementTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject customIntegerTypeElementType, String editing_mode) {
		super(editingContext, customIntegerTypeElementType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.CustomIntegerTypeElementType.class;
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
			
			final CustomIntegerTypeElementType customIntegerTypeElementType = (CustomIntegerTypeElementType)elt;
			final CustomIntegerTypeElementTypePropertiesEditionPart basePart = (CustomIntegerTypeElementTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), customIntegerTypeElementType.getName()));
			
			if (isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max))
				basePart.setMax(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), customIntegerTypeElementType.getMax()));
			
			if (isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min))
				basePart.setMin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), customIntegerTypeElementType.getMin()));
			
			if (isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution))
				basePart.setResolution(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), customIntegerTypeElementType.getResolution()));
			
			if (isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit))
				basePart.setUnit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), customIntegerTypeElementType.getUnit()));
			
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
		if (editorKey == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name) {
			return Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Name();
		}
		if (editorKey == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max) {
			return Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Max();
		}
		if (editorKey == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min) {
			return Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Min();
		}
		if (editorKey == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution) {
			return Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Resolution();
		}
		if (editorKey == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit) {
			return Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Unit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CustomIntegerTypeElementType customIntegerTypeElementType = (CustomIntegerTypeElementType)semanticObject;
		if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name == event.getAffectedEditor()) {
			customIntegerTypeElementType.setName((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max == event.getAffectedEditor()) {
			customIntegerTypeElementType.setMax((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min == event.getAffectedEditor()) {
			customIntegerTypeElementType.setMin((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution == event.getAffectedEditor()) {
			customIntegerTypeElementType.setResolution((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit == event.getAffectedEditor()) {
			customIntegerTypeElementType.setUnit((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CustomIntegerTypeElementTypePropertiesEditionPart basePart = (CustomIntegerTypeElementTypePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Max().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max)) {
				if (msg.getNewValue() != null) {
					basePart.setMax(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMax("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Min().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min)) {
				if (msg.getNewValue() != null) {
					basePart.setMin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMin("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Resolution().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution)) {
				if (msg.getNewValue() != null) {
					basePart.setResolution(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setResolution("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Unit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit)) {
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
			Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Name(),
			Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Max(),
			Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Min(),
			Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Resolution(),
			Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Unit()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name;
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
				if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Name().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.max == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Max().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Max().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.min == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Min().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Min().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.resolution == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Resolution().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Resolution().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomIntegerTypeElementType.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomIntegerTypeElementType_Unit().getEAttributeType(), newValue);
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
