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
import org.polarsys.ng661designer.dsl.part2.gen.CustomStringTypeElementType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.CustomStringTypeElementTypePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CustomStringTypeElementTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CustomStringTypeElementTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject customStringTypeElementType, String editing_mode) {
		super(editingContext, customStringTypeElementType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.CustomStringTypeElementType.class;
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
			
			final CustomStringTypeElementType customStringTypeElementType = (CustomStringTypeElementType)elt;
			final CustomStringTypeElementTypePropertiesEditionPart basePart = (CustomStringTypeElementTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), customStringTypeElementType.getName()));
			
			if (isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.maxLength))
				basePart.setMaxLength(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), customStringTypeElementType.getMaxLength()));
			
			if (isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.minLength))
				basePart.setMinLength(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), customStringTypeElementType.getMinLength()));
			
			if (isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.regex))
				basePart.setRegex(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), customStringTypeElementType.getRegex()));
			
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
		if (editorKey == Part2ViewsRepository.CustomStringTypeElementType.Properties.name) {
			return Part2Package.eINSTANCE.getCustomStringTypeElementType_Name();
		}
		if (editorKey == Part2ViewsRepository.CustomStringTypeElementType.Properties.maxLength) {
			return Part2Package.eINSTANCE.getCustomStringTypeElementType_MaxLength();
		}
		if (editorKey == Part2ViewsRepository.CustomStringTypeElementType.Properties.minLength) {
			return Part2Package.eINSTANCE.getCustomStringTypeElementType_MinLength();
		}
		if (editorKey == Part2ViewsRepository.CustomStringTypeElementType.Properties.regex) {
			return Part2Package.eINSTANCE.getCustomStringTypeElementType_Regex();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CustomStringTypeElementType customStringTypeElementType = (CustomStringTypeElementType)semanticObject;
		if (Part2ViewsRepository.CustomStringTypeElementType.Properties.name == event.getAffectedEditor()) {
			customStringTypeElementType.setName((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomStringTypeElementType.Properties.maxLength == event.getAffectedEditor()) {
			customStringTypeElementType.setMaxLength((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomStringTypeElementType.Properties.minLength == event.getAffectedEditor()) {
			customStringTypeElementType.setMinLength((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CustomStringTypeElementType.Properties.regex == event.getAffectedEditor()) {
			customStringTypeElementType.setRegex((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CustomStringTypeElementTypePropertiesEditionPart basePart = (CustomStringTypeElementTypePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getCustomStringTypeElementType_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomStringTypeElementType_MaxLength().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.maxLength)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxLength(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMaxLength("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomStringTypeElementType_MinLength().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.minLength)) {
				if (msg.getNewValue() != null) {
					basePart.setMinLength(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMinLength("");
				}
			}
			if (Part2Package.eINSTANCE.getCustomStringTypeElementType_Regex().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CustomStringTypeElementType.Properties.regex)) {
				if (msg.getNewValue() != null) {
					basePart.setRegex(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setRegex("");
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
			Part2Package.eINSTANCE.getCustomStringTypeElementType_Name(),
			Part2Package.eINSTANCE.getCustomStringTypeElementType_MaxLength(),
			Part2Package.eINSTANCE.getCustomStringTypeElementType_MinLength(),
			Part2Package.eINSTANCE.getCustomStringTypeElementType_Regex()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.CustomStringTypeElementType.Properties.name;
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
				if (Part2ViewsRepository.CustomStringTypeElementType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomStringTypeElementType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomStringTypeElementType_Name().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomStringTypeElementType.Properties.maxLength == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomStringTypeElementType_MaxLength().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomStringTypeElementType_MaxLength().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomStringTypeElementType.Properties.minLength == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomStringTypeElementType_MinLength().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomStringTypeElementType_MinLength().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CustomStringTypeElementType.Properties.regex == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCustomStringTypeElementType_Regex().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCustomStringTypeElementType_Regex().getEAttributeType(), newValue);
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
