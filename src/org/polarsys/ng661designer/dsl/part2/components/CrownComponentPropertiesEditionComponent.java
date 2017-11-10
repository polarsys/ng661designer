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
import org.polarsys.ng661designer.dsl.part2.gen.CrownComponent;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.CrownComponentPropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CrownComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CrownComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject crownComponent, String editing_mode) {
		super(editingContext, crownComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.CrownComponent.class;
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
			
			final CrownComponent crownComponent = (CrownComponent)elt;
			final CrownComponentPropertiesEditionPart basePart = (CrownComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), crownComponent.getId()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), crownComponent.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), crownComponent.getFill()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), crownComponent.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), crownComponent.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.innerRadius))
				basePart.setInnerRadius(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), crownComponent.getInnerRadius()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.outerRadius))
				basePart.setOuterRadius(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), crownComponent.getOuterRadius()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), crownComponent.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), crownComponent.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), crownComponent.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), crownComponent.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), crownComponent.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), crownComponent.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), crownComponent.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), crownComponent.getX()));
			
			if (isAccessible(Part2ViewsRepository.CrownComponent.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), crownComponent.getY()));
			
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
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.id) {
			return Part2Package.eINSTANCE.getCrownComponent_Id();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.clipPath) {
			return Part2Package.eINSTANCE.getCrownComponent_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.clipRule) {
			return Part2Package.eINSTANCE.getCrownComponent_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getCrownComponent_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.fill) {
			return Part2Package.eINSTANCE.getCrownComponent_Fill();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getCrownComponent_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.fillRule) {
			return Part2Package.eINSTANCE.getCrownComponent_FillRule();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.innerRadius) {
			return Part2Package.eINSTANCE.getCrownComponent_InnerRadius();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.outerRadius) {
			return Part2Package.eINSTANCE.getCrownComponent_OuterRadius();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.stroke) {
			return Part2Package.eINSTANCE.getCrownComponent_Stroke();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getCrownComponent_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getCrownComponent_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.transform) {
			return Part2Package.eINSTANCE.getCrownComponent_Transform();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.visibility) {
			return Part2Package.eINSTANCE.getCrownComponent_Visibility();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.x) {
			return Part2Package.eINSTANCE.getCrownComponent_X();
		}
		if (editorKey == Part2ViewsRepository.CrownComponent.Properties.y) {
			return Part2Package.eINSTANCE.getCrownComponent_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CrownComponent crownComponent = (CrownComponent)semanticObject;
		if (Part2ViewsRepository.CrownComponent.Properties.id == event.getAffectedEditor()) {
			crownComponent.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.clipPath == event.getAffectedEditor()) {
			crownComponent.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.clipRule == event.getAffectedEditor()) {
			crownComponent.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.drawingPriority == event.getAffectedEditor()) {
			crownComponent.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.fill == event.getAffectedEditor()) {
			crownComponent.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.fillOpacity == event.getAffectedEditor()) {
			crownComponent.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.fillRule == event.getAffectedEditor()) {
			crownComponent.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.innerRadius == event.getAffectedEditor()) {
			crownComponent.setInnerRadius((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.outerRadius == event.getAffectedEditor()) {
			crownComponent.setOuterRadius((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.stroke == event.getAffectedEditor()) {
			crownComponent.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
			crownComponent.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
			crownComponent.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
			crownComponent.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
			crownComponent.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			crownComponent.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
			crownComponent.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.strokewidth == event.getAffectedEditor()) {
			crownComponent.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.transform == event.getAffectedEditor()) {
			crownComponent.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.visibility == event.getAffectedEditor()) {
			crownComponent.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.x == event.getAffectedEditor()) {
			crownComponent.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.CrownComponent.Properties.y == event.getAffectedEditor()) {
			crownComponent.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CrownComponentPropertiesEditionPart basePart = (CrownComponentPropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getCrownComponent_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_InnerRadius().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.innerRadius)) {
				if (msg.getNewValue() != null) {
					basePart.setInnerRadius(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setInnerRadius("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_OuterRadius().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.outerRadius)) {
				if (msg.getNewValue() != null) {
					basePart.setOuterRadius(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setOuterRadius("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getCrownComponent_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.CrownComponent.Properties.y)) {
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
			Part2Package.eINSTANCE.getCrownComponent_Id(),
			Part2Package.eINSTANCE.getCrownComponent_ClipPath(),
			Part2Package.eINSTANCE.getCrownComponent_ClipRule(),
			Part2Package.eINSTANCE.getCrownComponent_DrawingPriority(),
			Part2Package.eINSTANCE.getCrownComponent_Fill(),
			Part2Package.eINSTANCE.getCrownComponent_FillOpacity(),
			Part2Package.eINSTANCE.getCrownComponent_FillRule(),
			Part2Package.eINSTANCE.getCrownComponent_InnerRadius(),
			Part2Package.eINSTANCE.getCrownComponent_OuterRadius(),
			Part2Package.eINSTANCE.getCrownComponent_Stroke(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeDasharray(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeDashoffset(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeLinecap(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeLinejoin(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getCrownComponent_StrokeOpacity(),
			Part2Package.eINSTANCE.getCrownComponent_Strokewidth(),
			Part2Package.eINSTANCE.getCrownComponent_Transform(),
			Part2Package.eINSTANCE.getCrownComponent_Visibility(),
			Part2Package.eINSTANCE.getCrownComponent_X(),
			Part2Package.eINSTANCE.getCrownComponent_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.CrownComponent.Properties.id;
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
				if (Part2ViewsRepository.CrownComponent.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.innerRadius == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_InnerRadius().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_InnerRadius().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.outerRadius == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_OuterRadius().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_OuterRadius().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.CrownComponent.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getCrownComponent_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getCrownComponent_Y().getEAttributeType(), newValue);
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
