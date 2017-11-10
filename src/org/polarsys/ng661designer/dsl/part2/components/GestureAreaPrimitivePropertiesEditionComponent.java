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
import org.polarsys.ng661designer.dsl.part2.gen.GestureAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.GestureAreaPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class GestureAreaPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GestureAreaPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject gestureAreaPrimitive, String editing_mode) {
		super(editingContext, gestureAreaPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.GestureAreaPrimitive.class;
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
			
			final GestureAreaPrimitive gestureAreaPrimitive = (GestureAreaPrimitive)elt;
			final GestureAreaPrimitivePropertiesEditionPart basePart = (GestureAreaPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), gestureAreaPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture))
				basePart.setAcceptedGesture(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), gestureAreaPrimitive.getAcceptedGesture()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), gestureAreaPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), gestureAreaPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled))
				basePart.setEnabled(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), gestureAreaPrimitive.getEnabled()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), gestureAreaPrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), gestureAreaPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), gestureAreaPrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), gestureAreaPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), gestureAreaPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Enabled();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.GestureAreaPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getGestureAreaPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GestureAreaPrimitive gestureAreaPrimitive = (GestureAreaPrimitive)semanticObject;
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.id == event.getAffectedEditor()) {
			gestureAreaPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture == event.getAffectedEditor()) {
			gestureAreaPrimitive.setAcceptedGesture((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			gestureAreaPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			gestureAreaPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
			gestureAreaPrimitive.setEnabled((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.height == event.getAffectedEditor()) {
			gestureAreaPrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
			gestureAreaPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.width == event.getAffectedEditor()) {
			gestureAreaPrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.x == event.getAffectedEditor()) {
			gestureAreaPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.GestureAreaPrimitive.Properties.y == event.getAffectedEditor()) {
			gestureAreaPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			GestureAreaPrimitivePropertiesEditionPart basePart = (GestureAreaPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture)) {
				if (msg.getNewValue() != null) {
					basePart.setAcceptedGesture(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setAcceptedGesture("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Enabled().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled)) {
				if (msg.getNewValue() != null) {
					basePart.setEnabled(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setEnabled("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getGestureAreaPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.GestureAreaPrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Id(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Enabled(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Height(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Transform(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Width(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_X(),
			Part2Package.eINSTANCE.getGestureAreaPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.GestureAreaPrimitive.Properties.id;
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
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.acceptedGesture == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Enabled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Enabled().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.GestureAreaPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getGestureAreaPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getGestureAreaPrimitive_Y().getEAttributeType(), newValue);
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
