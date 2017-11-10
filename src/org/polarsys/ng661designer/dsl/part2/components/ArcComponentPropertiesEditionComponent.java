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
import org.polarsys.ng661designer.dsl.part2.gen.ArcComponent;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.ArcComponentPropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ArcComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArcComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject arcComponent, String editing_mode) {
		super(editingContext, arcComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.ArcComponent.class;
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
			
			final ArcComponent arcComponent = (ArcComponent)elt;
			final ArcComponentPropertiesEditionPart basePart = (ArcComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), arcComponent.getId()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.angle))
				basePart.setAngle(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), arcComponent.getAngle()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), arcComponent.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), arcComponent.getFill()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), arcComponent.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), arcComponent.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.inboundAngle))
				basePart.setInboundAngle(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), arcComponent.getInboundAngle()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.radius))
				basePart.setRadius(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), arcComponent.getRadius()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), arcComponent.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), arcComponent.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), arcComponent.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), arcComponent.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), arcComponent.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), arcComponent.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), arcComponent.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), arcComponent.getX()));
			
			if (isAccessible(Part2ViewsRepository.ArcComponent.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), arcComponent.getY()));
			
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
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.id) {
			return Part2Package.eINSTANCE.getArcComponent_Id();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.angle) {
			return Part2Package.eINSTANCE.getArcComponent_Angle();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.clipPath) {
			return Part2Package.eINSTANCE.getArcComponent_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.clipRule) {
			return Part2Package.eINSTANCE.getArcComponent_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getArcComponent_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.fill) {
			return Part2Package.eINSTANCE.getArcComponent_Fill();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getArcComponent_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.fillRule) {
			return Part2Package.eINSTANCE.getArcComponent_FillRule();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.inboundAngle) {
			return Part2Package.eINSTANCE.getArcComponent_InboundAngle();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.radius) {
			return Part2Package.eINSTANCE.getArcComponent_Radius();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.stroke) {
			return Part2Package.eINSTANCE.getArcComponent_Stroke();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getArcComponent_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getArcComponent_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.transform) {
			return Part2Package.eINSTANCE.getArcComponent_Transform();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.visibility) {
			return Part2Package.eINSTANCE.getArcComponent_Visibility();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.x) {
			return Part2Package.eINSTANCE.getArcComponent_X();
		}
		if (editorKey == Part2ViewsRepository.ArcComponent.Properties.y) {
			return Part2Package.eINSTANCE.getArcComponent_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArcComponent arcComponent = (ArcComponent)semanticObject;
		if (Part2ViewsRepository.ArcComponent.Properties.id == event.getAffectedEditor()) {
			arcComponent.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.angle == event.getAffectedEditor()) {
			arcComponent.setAngle((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getAngleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.clipPath == event.getAffectedEditor()) {
			arcComponent.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.clipRule == event.getAffectedEditor()) {
			arcComponent.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.drawingPriority == event.getAffectedEditor()) {
			arcComponent.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.fill == event.getAffectedEditor()) {
			arcComponent.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.fillOpacity == event.getAffectedEditor()) {
			arcComponent.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.fillRule == event.getAffectedEditor()) {
			arcComponent.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.inboundAngle == event.getAffectedEditor()) {
			arcComponent.setInboundAngle((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getAngleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.radius == event.getAffectedEditor()) {
			arcComponent.setRadius((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.stroke == event.getAffectedEditor()) {
			arcComponent.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
			arcComponent.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
			arcComponent.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
			arcComponent.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
			arcComponent.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			arcComponent.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
			arcComponent.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.strokewidth == event.getAffectedEditor()) {
			arcComponent.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.transform == event.getAffectedEditor()) {
			arcComponent.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.visibility == event.getAffectedEditor()) {
			arcComponent.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.x == event.getAffectedEditor()) {
			arcComponent.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ArcComponent.Properties.y == event.getAffectedEditor()) {
			arcComponent.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ArcComponentPropertiesEditionPart basePart = (ArcComponentPropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getArcComponent_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Angle().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.angle)) {
				if (msg.getNewValue() != null) {
					basePart.setAngle(EcoreUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), msg.getNewValue()));
				} else {
					basePart.setAngle("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_InboundAngle().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.inboundAngle)) {
				if (msg.getNewValue() != null) {
					basePart.setInboundAngle(EcoreUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), msg.getNewValue()));
				} else {
					basePart.setInboundAngle("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Radius().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.radius)) {
				if (msg.getNewValue() != null) {
					basePart.setRadius(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setRadius("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getArcComponent_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ArcComponent.Properties.y)) {
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
			Part2Package.eINSTANCE.getArcComponent_Id(),
			Part2Package.eINSTANCE.getArcComponent_Angle(),
			Part2Package.eINSTANCE.getArcComponent_ClipPath(),
			Part2Package.eINSTANCE.getArcComponent_ClipRule(),
			Part2Package.eINSTANCE.getArcComponent_DrawingPriority(),
			Part2Package.eINSTANCE.getArcComponent_Fill(),
			Part2Package.eINSTANCE.getArcComponent_FillOpacity(),
			Part2Package.eINSTANCE.getArcComponent_FillRule(),
			Part2Package.eINSTANCE.getArcComponent_InboundAngle(),
			Part2Package.eINSTANCE.getArcComponent_Radius(),
			Part2Package.eINSTANCE.getArcComponent_Stroke(),
			Part2Package.eINSTANCE.getArcComponent_StrokeDasharray(),
			Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset(),
			Part2Package.eINSTANCE.getArcComponent_StrokeLinecap(),
			Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin(),
			Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getArcComponent_StrokeOpacity(),
			Part2Package.eINSTANCE.getArcComponent_Strokewidth(),
			Part2Package.eINSTANCE.getArcComponent_Transform(),
			Part2Package.eINSTANCE.getArcComponent_Visibility(),
			Part2Package.eINSTANCE.getArcComponent_X(),
			Part2Package.eINSTANCE.getArcComponent_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.ArcComponent.Properties.id;
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
				if (Part2ViewsRepository.ArcComponent.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.angle == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Angle().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Angle().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.inboundAngle == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_InboundAngle().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_InboundAngle().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.radius == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Radius().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Radius().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ArcComponent.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getArcComponent_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getArcComponent_Y().getEAttributeType(), newValue);
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
