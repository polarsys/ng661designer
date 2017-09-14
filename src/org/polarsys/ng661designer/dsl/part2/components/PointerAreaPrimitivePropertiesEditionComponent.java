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
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PointerAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PointerAreaPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PointerAreaPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PointerAreaPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject pointerAreaPrimitive, String editing_mode) {
		super(editingContext, pointerAreaPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.PointerAreaPrimitive.class;
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
			
			final PointerAreaPrimitive pointerAreaPrimitive = (PointerAreaPrimitive)elt;
			final PointerAreaPrimitivePropertiesEditionPart basePart = (PointerAreaPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), pointerAreaPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.acceptedButtons))
				basePart.setAcceptedButtons(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pointerAreaPrimitive.getAcceptedButtons()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pointerAreaPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pointerAreaPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.enabled))
				basePart.setEnabled(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), pointerAreaPrimitive.getEnabled()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), pointerAreaPrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.passThrough))
				basePart.setPassThrough(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), pointerAreaPrimitive.getPassThrough()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.preventStealing))
				basePart.setPreventStealing(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), pointerAreaPrimitive.getPreventStealing()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pointerAreaPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), pointerAreaPrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), pointerAreaPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), pointerAreaPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.acceptedButtons) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_AcceptedButtons();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.enabled) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Enabled();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.passThrough) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_PassThrough();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.preventStealing) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_PreventStealing();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.PointerAreaPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getPointerAreaPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PointerAreaPrimitive pointerAreaPrimitive = (PointerAreaPrimitive)semanticObject;
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.id == event.getAffectedEditor()) {
			pointerAreaPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.acceptedButtons == event.getAffectedEditor()) {
			pointerAreaPrimitive.setAcceptedButtons((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			pointerAreaPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			pointerAreaPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
			pointerAreaPrimitive.setEnabled((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.height == event.getAffectedEditor()) {
			pointerAreaPrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.passThrough == event.getAffectedEditor()) {
			pointerAreaPrimitive.setPassThrough((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.preventStealing == event.getAffectedEditor()) {
			pointerAreaPrimitive.setPreventStealing((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
			pointerAreaPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.width == event.getAffectedEditor()) {
			pointerAreaPrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.x == event.getAffectedEditor()) {
			pointerAreaPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PointerAreaPrimitive.Properties.y == event.getAffectedEditor()) {
			pointerAreaPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PointerAreaPrimitivePropertiesEditionPart basePart = (PointerAreaPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_AcceptedButtons().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.acceptedButtons)) {
				if (msg.getNewValue() != null) {
					basePart.setAcceptedButtons(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setAcceptedButtons("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Enabled().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.enabled)) {
				if (msg.getNewValue() != null) {
					basePart.setEnabled(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setEnabled("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_PassThrough().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.passThrough)) {
				if (msg.getNewValue() != null) {
					basePart.setPassThrough(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setPassThrough("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_PreventStealing().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.preventStealing)) {
				if (msg.getNewValue() != null) {
					basePart.setPreventStealing(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setPreventStealing("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getPointerAreaPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PointerAreaPrimitive.Properties.y)) {
				if (msg.getNewValue() != null) {
					basePart.setY(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setY("");
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
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Id(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_AcceptedButtons(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Enabled(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Height(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_PassThrough(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_PreventStealing(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Transform(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Width(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_X(),
			Part2Package.eINSTANCE.getPointerAreaPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.PointerAreaPrimitive.Properties.id;
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
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.acceptedButtons == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_AcceptedButtons().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_AcceptedButtons().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Enabled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Enabled().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.passThrough == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_PassThrough().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_PassThrough().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.preventStealing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_PreventStealing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_PreventStealing().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PointerAreaPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPointerAreaPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPointerAreaPrimitive_Y().getEAttributeType(), newValue);
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
