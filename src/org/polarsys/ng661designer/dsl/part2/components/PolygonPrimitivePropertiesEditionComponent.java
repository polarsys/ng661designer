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
import org.polarsys.ng661designer.dsl.part2.gen.PolygonPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PolygonPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PolygonPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PolygonPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject polygonPrimitive, String editing_mode) {
		super(editingContext, polygonPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.PolygonPrimitive.class;
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
			
			final PolygonPrimitive polygonPrimitive = (PolygonPrimitive)elt;
			final PolygonPrimitivePropertiesEditionPart basePart = (PolygonPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), polygonPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.points))
				basePart.setPoints(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polygonPrimitive.getPoints()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), polygonPrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), polygonPrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), polygonPrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), polygonPrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), polygonPrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polygonPrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), polygonPrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polygonPrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polygonPrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), polygonPrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), polygonPrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), polygonPrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polygonPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), polygonPrimitive.getVisibility()));
			
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
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.points) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Points();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.PolygonPrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getPolygonPrimitive_Visibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PolygonPrimitive polygonPrimitive = (PolygonPrimitive)semanticObject;
		if (Part2ViewsRepository.PolygonPrimitive.Properties.id == event.getAffectedEditor()) {
			polygonPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.points == event.getAffectedEditor()) {
			polygonPrimitive.setPoints((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			polygonPrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.fill == event.getAffectedEditor()) {
			polygonPrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			polygonPrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.fillRule == event.getAffectedEditor()) {
			polygonPrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.stroke == event.getAffectedEditor()) {
			polygonPrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			polygonPrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			polygonPrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.transform == event.getAffectedEditor()) {
			polygonPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolygonPrimitive.Properties.visibility == event.getAffectedEditor()) {
			polygonPrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PolygonPrimitivePropertiesEditionPart basePart = (PolygonPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Points().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.points)) {
				if (msg.getNewValue() != null) {
					basePart.setPoints(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setPoints("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getPolygonPrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolygonPrimitive.Properties.visibility)) {
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
			Part2Package.eINSTANCE.getPolygonPrimitive_Id(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Points(),
			Part2Package.eINSTANCE.getPolygonPrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Fill(),
			Part2Package.eINSTANCE.getPolygonPrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getPolygonPrimitive_FillRule(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Stroke(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getPolygonPrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Transform(),
			Part2Package.eINSTANCE.getPolygonPrimitive_Visibility()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.PolygonPrimitive.Properties.id || key == Part2ViewsRepository.PolygonPrimitive.Properties.points;
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
				if (Part2ViewsRepository.PolygonPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.points == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Points().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Points().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolygonPrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolygonPrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolygonPrimitive_Visibility().getEAttributeType(), newValue);
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
