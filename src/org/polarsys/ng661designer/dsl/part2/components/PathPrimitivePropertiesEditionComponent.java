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
import org.polarsys.ng661designer.dsl.part2.gen.PathPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PathPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PathPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PathPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject pathPrimitive, String editing_mode) {
		super(editingContext, pathPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.PathPrimitive.class;
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
			
			final PathPrimitive pathPrimitive = (PathPrimitive)elt;
			final PathPrimitivePropertiesEditionPart basePart = (PathPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), pathPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.d))
				basePart.setD(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getD()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), pathPrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), pathPrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), pathPrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), pathPrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), pathPrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), pathPrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), pathPrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), pathPrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), pathPrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), pathPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.PathPrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), pathPrimitive.getVisibility()));
			
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
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getPathPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.d) {
			return Part2Package.eINSTANCE.getPathPrimitive_D();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.clipPath) {
			return Part2Package.eINSTANCE.getPathPrimitive_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.clipRule) {
			return Part2Package.eINSTANCE.getPathPrimitive_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getPathPrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getPathPrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getPathPrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getPathPrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getPathPrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getPathPrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getPathPrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getPathPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.PathPrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getPathPrimitive_Visibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PathPrimitive pathPrimitive = (PathPrimitive)semanticObject;
		if (Part2ViewsRepository.PathPrimitive.Properties.id == event.getAffectedEditor()) {
			pathPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.d == event.getAffectedEditor()) {
			pathPrimitive.setD((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.clipPath == event.getAffectedEditor()) {
			pathPrimitive.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.clipRule == event.getAffectedEditor()) {
			pathPrimitive.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			pathPrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.fill == event.getAffectedEditor()) {
			pathPrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			pathPrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.fillRule == event.getAffectedEditor()) {
			pathPrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.stroke == event.getAffectedEditor()) {
			pathPrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			pathPrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			pathPrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			pathPrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			pathPrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			pathPrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			pathPrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			pathPrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.transform == event.getAffectedEditor()) {
			pathPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PathPrimitive.Properties.visibility == event.getAffectedEditor()) {
			pathPrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PathPrimitivePropertiesEditionPart basePart = (PathPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getPathPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_D().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.d)) {
				if (msg.getNewValue() != null) {
					basePart.setD(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setD("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getPathPrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PathPrimitive.Properties.visibility)) {
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
			Part2Package.eINSTANCE.getPathPrimitive_Id(),
			Part2Package.eINSTANCE.getPathPrimitive_D(),
			Part2Package.eINSTANCE.getPathPrimitive_ClipPath(),
			Part2Package.eINSTANCE.getPathPrimitive_ClipRule(),
			Part2Package.eINSTANCE.getPathPrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getPathPrimitive_Fill(),
			Part2Package.eINSTANCE.getPathPrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getPathPrimitive_FillRule(),
			Part2Package.eINSTANCE.getPathPrimitive_Stroke(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getPathPrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getPathPrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getPathPrimitive_Transform(),
			Part2Package.eINSTANCE.getPathPrimitive_Visibility()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.PathPrimitive.Properties.id || key == Part2ViewsRepository.PathPrimitive.Properties.d;
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
				if (Part2ViewsRepository.PathPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.d == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_D().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_D().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PathPrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPathPrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPathPrimitive_Visibility().getEAttributeType(), newValue);
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
