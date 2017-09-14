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
import org.polarsys.ng661designer.dsl.part2.gen.ImagePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.ImagePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ImagePrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ImagePrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject imagePrimitive, String editing_mode) {
		super(editingContext, imagePrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.ImagePrimitive.class;
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
			
			final ImagePrimitive imagePrimitive = (ImagePrimitive)elt;
			final ImagePrimitivePropertiesEditionPart basePart = (ImagePrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), imagePrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.alignment))
				basePart.setAlignment(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getAlignementType(), imagePrimitive.getAlignment()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.aspectRatio))
				basePart.setAspectRatio(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getAspectRatioType(), imagePrimitive.getAspectRatio()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), imagePrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), imagePrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), imagePrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), imagePrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.source))
				basePart.setSource(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getImageType(), imagePrimitive.getSource()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), imagePrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), imagePrimitive.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), imagePrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), imagePrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), imagePrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getImagePrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.alignment) {
			return Part2Package.eINSTANCE.getImagePrimitive_Alignment();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.aspectRatio) {
			return Part2Package.eINSTANCE.getImagePrimitive_AspectRatio();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getImagePrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getImagePrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getImagePrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getImagePrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.source) {
			return Part2Package.eINSTANCE.getImagePrimitive_Source();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getImagePrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getImagePrimitive_Visibility();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getImagePrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getImagePrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.ImagePrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getImagePrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ImagePrimitive imagePrimitive = (ImagePrimitive)semanticObject;
		if (Part2ViewsRepository.ImagePrimitive.Properties.id == event.getAffectedEditor()) {
			imagePrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.alignment == event.getAffectedEditor()) {
			imagePrimitive.setAlignment((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getAlignementType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.aspectRatio == event.getAffectedEditor()) {
			imagePrimitive.setAspectRatio((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getAspectRatioType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.clipPath == event.getAffectedEditor()) {
			imagePrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.clipRule == event.getAffectedEditor()) {
			imagePrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			imagePrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.height == event.getAffectedEditor()) {
			imagePrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.source == event.getAffectedEditor()) {
			imagePrimitive.setSource((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImageType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.transform == event.getAffectedEditor()) {
			imagePrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.visibility == event.getAffectedEditor()) {
			imagePrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.width == event.getAffectedEditor()) {
			imagePrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.x == event.getAffectedEditor()) {
			imagePrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ImagePrimitive.Properties.y == event.getAffectedEditor()) {
			imagePrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ImagePrimitivePropertiesEditionPart basePart = (ImagePrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getImagePrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Alignment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.alignment)) {
				if (msg.getNewValue() != null) {
					basePart.setAlignment(EcoreUtil.convertToString(Part2Package.eINSTANCE.getAlignementType(), msg.getNewValue()));
				} else {
					basePart.setAlignment("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_AspectRatio().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.aspectRatio)) {
				if (msg.getNewValue() != null) {
					basePart.setAspectRatio(EcoreUtil.convertToString(Part2Package.eINSTANCE.getAspectRatioType(), msg.getNewValue()));
				} else {
					basePart.setAspectRatio("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Source().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(Part2Package.eINSTANCE.getImageType(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getImagePrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ImagePrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getImagePrimitive_Id(),
			Part2Package.eINSTANCE.getImagePrimitive_Alignment(),
			Part2Package.eINSTANCE.getImagePrimitive_AspectRatio(),
			Part2Package.eINSTANCE.getImagePrimitive_ClipPath(),
			Part2Package.eINSTANCE.getImagePrimitive_ClipRule(),
			Part2Package.eINSTANCE.getImagePrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getImagePrimitive_Height(),
			Part2Package.eINSTANCE.getImagePrimitive_Source(),
			Part2Package.eINSTANCE.getImagePrimitive_Transform(),
			Part2Package.eINSTANCE.getImagePrimitive_Visibility(),
			Part2Package.eINSTANCE.getImagePrimitive_Width(),
			Part2Package.eINSTANCE.getImagePrimitive_X(),
			Part2Package.eINSTANCE.getImagePrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.ImagePrimitive.Properties.id;
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
				if (Part2ViewsRepository.ImagePrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.alignment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Alignment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Alignment().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.aspectRatio == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_AspectRatio().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_AspectRatio().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Source().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Source().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ImagePrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getImagePrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getImagePrimitive_Y().getEAttributeType(), newValue);
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
