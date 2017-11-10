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
import org.polarsys.ng661designer.dsl.part2.gen.CirclePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.CirclePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CirclePrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CirclePrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject circlePrimitive, String editing_mode) {
		super(editingContext, circlePrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.CirclePrimitive.class;
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
			
			final CirclePrimitive circlePrimitive = (CirclePrimitive)elt;
			final CirclePrimitivePropertiesEditionPart basePart = (CirclePrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), circlePrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.cx))
				basePart.setCx(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), circlePrimitive.getCx()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.cy))
				basePart.setCy(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), circlePrimitive.getCy()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), circlePrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), circlePrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), circlePrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), circlePrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.r))
				basePart.setR(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), circlePrimitive.getR()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), circlePrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), circlePrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), circlePrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), circlePrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), circlePrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), circlePrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), circlePrimitive.getVisibility()));
			
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
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getCirclePrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getCirclePrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.cx) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Cx();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.cy) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Cy();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getCirclePrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getCirclePrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getCirclePrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.r) {
			return Part2Package.eINSTANCE.getCirclePrimitive_R();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getCirclePrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.CirclePrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getCirclePrimitive_Visibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CirclePrimitive circlePrimitive = (CirclePrimitive)semanticObject;
		if (Part2ViewsRepository.CirclePrimitive.Properties.id == event.getAffectedEditor()) {
			circlePrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.clipPath == event.getAffectedEditor()) {
			circlePrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.clipRule == event.getAffectedEditor()) {
			circlePrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.cx == event.getAffectedEditor()) {
			circlePrimitive.setCx((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.cy == event.getAffectedEditor()) {
			circlePrimitive.setCy((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			circlePrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.fill == event.getAffectedEditor()) {
			circlePrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			circlePrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.fillRule == event.getAffectedEditor()) {
			circlePrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.r == event.getAffectedEditor()) {
			circlePrimitive.setR((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.stroke == event.getAffectedEditor()) {
			circlePrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			circlePrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			circlePrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			circlePrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			circlePrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			circlePrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			circlePrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			circlePrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.transform == event.getAffectedEditor()) {
			circlePrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CirclePrimitive.Properties.visibility == event.getAffectedEditor()) {
			circlePrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CirclePrimitivePropertiesEditionPart basePart = (CirclePrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getCirclePrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Cx().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.cx)) {
				if (msg.getNewValue() != null) {
					basePart.setCx(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setCx("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Cy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.cy)) {
				if (msg.getNewValue() != null) {
					basePart.setCy(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setCy("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_R().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.r)) {
				if (msg.getNewValue() != null) {
					basePart.setR(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setR("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getCirclePrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CirclePrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
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
			Part2Package.eINSTANCE.getCirclePrimitive_Id(),
			Part2Package.eINSTANCE.getCirclePrimitive_ClipPath(),
			Part2Package.eINSTANCE.getCirclePrimitive_ClipRule(),
			Part2Package.eINSTANCE.getCirclePrimitive_Cx(),
			Part2Package.eINSTANCE.getCirclePrimitive_Cy(),
			Part2Package.eINSTANCE.getCirclePrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getCirclePrimitive_Fill(),
			Part2Package.eINSTANCE.getCirclePrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getCirclePrimitive_FillRule(),
			Part2Package.eINSTANCE.getCirclePrimitive_R(),
			Part2Package.eINSTANCE.getCirclePrimitive_Stroke(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getCirclePrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getCirclePrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getCirclePrimitive_Transform(),
			Part2Package.eINSTANCE.getCirclePrimitive_Visibility()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.CirclePrimitive.Properties.id;
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
				if (Part2ViewsRepository.CirclePrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.cx == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Cx().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Cx().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.cy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Cy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Cy().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.r == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_R().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_R().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CirclePrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCirclePrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCirclePrimitive_Visibility().getEAttributeType(), newValue);
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
