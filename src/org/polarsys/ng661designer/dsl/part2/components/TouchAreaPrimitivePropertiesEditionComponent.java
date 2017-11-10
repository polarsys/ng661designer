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
import org.polarsys.ng661designer.dsl.part2.gen.TouchAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.TouchAreaPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TouchAreaPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TouchAreaPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject touchAreaPrimitive, String editing_mode) {
		super(editingContext, touchAreaPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.TouchAreaPrimitive.class;
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
			
			final TouchAreaPrimitive touchAreaPrimitive = (TouchAreaPrimitive)elt;
			final TouchAreaPrimitivePropertiesEditionPart basePart = (TouchAreaPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), touchAreaPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), touchAreaPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), touchAreaPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.enabled))
				basePart.setEnabled(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), touchAreaPrimitive.getEnabled()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), touchAreaPrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.maximumTouchPoints))
				basePart.setMaximumTouchPoints(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), touchAreaPrimitive.getMaximumTouchPoints()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.minimumTouchPoints))
				basePart.setMinimumTouchPoints(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), touchAreaPrimitive.getMinimumTouchPoints()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), touchAreaPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), touchAreaPrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), touchAreaPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), touchAreaPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.enabled) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Enabled();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.maximumTouchPoints) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.minimumTouchPoints) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.TouchAreaPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getTouchAreaPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TouchAreaPrimitive touchAreaPrimitive = (TouchAreaPrimitive)semanticObject;
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.id == event.getAffectedEditor()) {
			touchAreaPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			touchAreaPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			touchAreaPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
			touchAreaPrimitive.setEnabled((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getBooleanType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.height == event.getAffectedEditor()) {
			touchAreaPrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.maximumTouchPoints == event.getAffectedEditor()) {
			touchAreaPrimitive.setMaximumTouchPoints((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.minimumTouchPoints == event.getAffectedEditor()) {
			touchAreaPrimitive.setMinimumTouchPoints((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
			touchAreaPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.width == event.getAffectedEditor()) {
			touchAreaPrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.x == event.getAffectedEditor()) {
			touchAreaPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TouchAreaPrimitive.Properties.y == event.getAffectedEditor()) {
			touchAreaPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TouchAreaPrimitivePropertiesEditionPart basePart = (TouchAreaPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Enabled().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.enabled)) {
				if (msg.getNewValue() != null) {
					basePart.setEnabled(EcoreUtil.convertToString(Part2Package.eINSTANCE.getBooleanType(), msg.getNewValue()));
				} else {
					basePart.setEnabled("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.maximumTouchPoints)) {
				if (msg.getNewValue() != null) {
					basePart.setMaximumTouchPoints(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMaximumTouchPoints("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.minimumTouchPoints)) {
				if (msg.getNewValue() != null) {
					basePart.setMinimumTouchPoints(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMinimumTouchPoints("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getTouchAreaPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TouchAreaPrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Id(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Enabled(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Height(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Transform(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Width(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_X(),
			Part2Package.eINSTANCE.getTouchAreaPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.TouchAreaPrimitive.Properties.id;
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
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.enabled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Enabled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Enabled().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.maximumTouchPoints == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.minimumTouchPoints == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TouchAreaPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTouchAreaPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTouchAreaPrimitive_Y().getEAttributeType(), newValue);
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
