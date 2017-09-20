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
import org.polarsys.ng661designer.dsl.part2.gen.EllipsePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.EllipsePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EllipsePrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EllipsePrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ellipsePrimitive, String editing_mode) {
		super(editingContext, ellipsePrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.EllipsePrimitive.class;
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
			
			final EllipsePrimitive ellipsePrimitive = (EllipsePrimitive)elt;
			final EllipsePrimitivePropertiesEditionPart basePart = (EllipsePrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), ellipsePrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.cx))
				basePart.setCx(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), ellipsePrimitive.getCx()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.cy))
				basePart.setCy(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), ellipsePrimitive.getCy()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), ellipsePrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), ellipsePrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), ellipsePrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), ellipsePrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.rx))
				basePart.setRx(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), ellipsePrimitive.getRx()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.ry))
				basePart.setRy(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), ellipsePrimitive.getRy()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), ellipsePrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), ellipsePrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), ellipsePrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), ellipsePrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), ellipsePrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), ellipsePrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), ellipsePrimitive.getVisibility()));
			
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
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.cx) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Cx();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.cy) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Cy();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.rx) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Rx();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.ry) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Ry();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.EllipsePrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getEllipsePrimitive_Visibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EllipsePrimitive ellipsePrimitive = (EllipsePrimitive)semanticObject;
		if (Part2ViewsRepository.EllipsePrimitive.Properties.id == event.getAffectedEditor()) {
			ellipsePrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.clipPath == event.getAffectedEditor()) {
			ellipsePrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.clipRule == event.getAffectedEditor()) {
			ellipsePrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.cx == event.getAffectedEditor()) {
			ellipsePrimitive.setCx((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.cy == event.getAffectedEditor()) {
			ellipsePrimitive.setCy((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			ellipsePrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.fill == event.getAffectedEditor()) {
			ellipsePrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			ellipsePrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.fillRule == event.getAffectedEditor()) {
			ellipsePrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.rx == event.getAffectedEditor()) {
			ellipsePrimitive.setRx((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.ry == event.getAffectedEditor()) {
			ellipsePrimitive.setRy((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.stroke == event.getAffectedEditor()) {
			ellipsePrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			ellipsePrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.transform == event.getAffectedEditor()) {
			ellipsePrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.EllipsePrimitive.Properties.visibility == event.getAffectedEditor()) {
			ellipsePrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			EllipsePrimitivePropertiesEditionPart basePart = (EllipsePrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Cx().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.cx)) {
				if (msg.getNewValue() != null) {
					basePart.setCx(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setCx("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Cy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.cy)) {
				if (msg.getNewValue() != null) {
					basePart.setCy(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setCy("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Rx().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.rx)) {
				if (msg.getNewValue() != null) {
					basePart.setRx(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setRx("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Ry().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.ry)) {
				if (msg.getNewValue() != null) {
					basePart.setRy(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setRy("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getEllipsePrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.EllipsePrimitive.Properties.visibility)) {
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
			Part2Package.eINSTANCE.getEllipsePrimitive_Id(),
			Part2Package.eINSTANCE.getEllipsePrimitive_ClipPath(),
			Part2Package.eINSTANCE.getEllipsePrimitive_ClipRule(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Cx(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Cy(),
			Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Fill(),
			Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getEllipsePrimitive_FillRule(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Rx(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Ry(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Stroke(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Transform(),
			Part2Package.eINSTANCE.getEllipsePrimitive_Visibility()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.EllipsePrimitive.Properties.id;
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
				if (Part2ViewsRepository.EllipsePrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.cx == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Cx().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Cx().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.cy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Cy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Cy().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.rx == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Rx().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Rx().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.ry == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Ry().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Ry().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.EllipsePrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getEllipsePrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getEllipsePrimitive_Visibility().getEAttributeType(), newValue);
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
