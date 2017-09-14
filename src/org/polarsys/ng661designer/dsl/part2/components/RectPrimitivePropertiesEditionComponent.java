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
import org.polarsys.ng661designer.dsl.part2.gen.RectPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.RectPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RectPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public RectPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rectPrimitive, String editing_mode) {
		super(editingContext, rectPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.RectPrimitive.class;
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
			
			final RectPrimitive rectPrimitive = (RectPrimitive)elt;
			final RectPrimitivePropertiesEditionPart basePart = (RectPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), rectPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), rectPrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), rectPrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), rectPrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), rectPrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.height))
				basePart.setHeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getHeight()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.rx))
				basePart.setRx(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getRx()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.ry))
				basePart.setRy(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getRy()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), rectPrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), rectPrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), rectPrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), rectPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), rectPrimitive.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.width))
				basePart.setWidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), rectPrimitive.getWidth()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), rectPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.RectPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), rectPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getRectPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getRectPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getRectPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getRectPrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getRectPrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getRectPrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.height) {
			return Part2Package.eINSTANCE.getRectPrimitive_Height();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.rx) {
			return Part2Package.eINSTANCE.getRectPrimitive_Rx();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.ry) {
			return Part2Package.eINSTANCE.getRectPrimitive_Ry();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getRectPrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getRectPrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getRectPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getRectPrimitive_Visibility();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.width) {
			return Part2Package.eINSTANCE.getRectPrimitive_Width();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getRectPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.RectPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getRectPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RectPrimitive rectPrimitive = (RectPrimitive)semanticObject;
		if (Part2ViewsRepository.RectPrimitive.Properties.id == event.getAffectedEditor()) {
			rectPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			rectPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			rectPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			rectPrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.fill == event.getAffectedEditor()) {
			rectPrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			rectPrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.fillRule == event.getAffectedEditor()) {
			rectPrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.height == event.getAffectedEditor()) {
			rectPrimitive.setHeight((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.rx == event.getAffectedEditor()) {
			rectPrimitive.setRx((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.ry == event.getAffectedEditor()) {
			rectPrimitive.setRy((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.stroke == event.getAffectedEditor()) {
			rectPrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			rectPrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			rectPrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			rectPrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			rectPrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			rectPrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			rectPrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			rectPrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.transform == event.getAffectedEditor()) {
			rectPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.visibility == event.getAffectedEditor()) {
			rectPrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.width == event.getAffectedEditor()) {
			rectPrimitive.setWidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.x == event.getAffectedEditor()) {
			rectPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.RectPrimitive.Properties.y == event.getAffectedEditor()) {
			rectPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			RectPrimitivePropertiesEditionPart basePart = (RectPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getRectPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Height().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.height)) {
				if (msg.getNewValue() != null) {
					basePart.setHeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setHeight("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Rx().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.rx)) {
				if (msg.getNewValue() != null) {
					basePart.setRx(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setRx("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Ry().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.ry)) {
				if (msg.getNewValue() != null) {
					basePart.setRy(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setRy("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Width().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.width)) {
				if (msg.getNewValue() != null) {
					basePart.setWidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setWidth("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getRectPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.RectPrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getRectPrimitive_Id(),
			Part2Package.eINSTANCE.getRectPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getRectPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getRectPrimitive_Fill(),
			Part2Package.eINSTANCE.getRectPrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getRectPrimitive_FillRule(),
			Part2Package.eINSTANCE.getRectPrimitive_Height(),
			Part2Package.eINSTANCE.getRectPrimitive_Rx(),
			Part2Package.eINSTANCE.getRectPrimitive_Ry(),
			Part2Package.eINSTANCE.getRectPrimitive_Stroke(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getRectPrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getRectPrimitive_Transform(),
			Part2Package.eINSTANCE.getRectPrimitive_Visibility(),
			Part2Package.eINSTANCE.getRectPrimitive_Width(),
			Part2Package.eINSTANCE.getRectPrimitive_X(),
			Part2Package.eINSTANCE.getRectPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.RectPrimitive.Properties.id;
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
				if (Part2ViewsRepository.RectPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.height == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Height().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Height().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.rx == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Rx().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Rx().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.ry == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Ry().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Ry().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.width == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Width().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Width().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.RectPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRectPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getRectPrimitive_Y().getEAttributeType(), newValue);
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
