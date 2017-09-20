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
import org.polarsys.ng661designer.dsl.part2.gen.ScrollWheelAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.ScrollWheelAreaPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ScrollWheelAreaPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScrollWheelAreaPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scrollWheelAreaPrimitive, String editing_mode) {
		super(editingContext, scrollWheelAreaPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.ScrollWheelAreaPrimitive.class;
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
			
			final ScrollWheelAreaPrimitive scrollWheelAreaPrimitive = (ScrollWheelAreaPrimitive)elt;
			final ScrollWheelAreaPrimitivePropertiesEditionPart basePart = (ScrollWheelAreaPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), scrollWheelAreaPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), scrollWheelAreaPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), scrollWheelAreaPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled))
				basePart.setEnabled(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), scrollWheelAreaPrimitive.getEnabled()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), scrollWheelAreaPrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), scrollWheelAreaPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), scrollWheelAreaPrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), scrollWheelAreaPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), scrollWheelAreaPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Enabled();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ScrollWheelAreaPrimitive scrollWheelAreaPrimitive = (ScrollWheelAreaPrimitive)semanticObject;
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setEnabled((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y == event.getAffectedEditor()) {
			scrollWheelAreaPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScrollWheelAreaPrimitivePropertiesEditionPart basePart = (ScrollWheelAreaPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Enabled().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled)) {
				if (msg.getNewValue() != null) {
					basePart.setEnabled(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setEnabled("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Id(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Enabled(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Height(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Transform(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Width(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_X(),
			Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id;
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
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Enabled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Enabled().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ScrollWheelAreaPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getScrollWheelAreaPrimitive_Y().getEAttributeType(), newValue);
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
