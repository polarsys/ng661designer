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
import org.polarsys.ng661designer.dsl.part2.gen.PolarLineComponent;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.PolarLineComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PolarLineComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PolarLineComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject polarLineComponent, String editing_mode) {
		super(editingContext, polarLineComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.PolarLineComponent.class;
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
			
			final PolarLineComponent polarLineComponent = (PolarLineComponent)elt;
			final PolarLineComponentPropertiesEditionPart basePart = (PolarLineComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), polarLineComponent.getId()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.angle))
				basePart.setAngle(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), polarLineComponent.getAngle()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.clipPath))
				basePart.setClipPath(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getClipPath()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.clipRule))
				basePart.setClipRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getClipRule()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), polarLineComponent.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.r))
				basePart.setR(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), polarLineComponent.getR()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), polarLineComponent.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), polarLineComponent.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), polarLineComponent.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), polarLineComponent.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), polarLineComponent.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), polarLineComponent.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), polarLineComponent.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.x1))
				basePart.setX1(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), polarLineComponent.getX1()));
			
			if (isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.y1))
				basePart.setY1(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), polarLineComponent.getY1()));
			
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
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.id) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Id();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.angle) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Angle();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.clipPath) {
			return Part2Package.eINSTANCE.getPolarLineComponent_ClipPath();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.clipRule) {
			return Part2Package.eINSTANCE.getPolarLineComponent_ClipRule();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.r) {
			return Part2Package.eINSTANCE.getPolarLineComponent_R();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.stroke) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Stroke();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.transform) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Transform();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.visibility) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Visibility();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.x1) {
			return Part2Package.eINSTANCE.getPolarLineComponent_X1();
		}
		if (editorKey == Part2ViewsRepository.PolarLineComponent.Properties.y1) {
			return Part2Package.eINSTANCE.getPolarLineComponent_Y1();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PolarLineComponent polarLineComponent = (PolarLineComponent)semanticObject;
		if (Part2ViewsRepository.PolarLineComponent.Properties.id == event.getAffectedEditor()) {
			polarLineComponent.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.angle == event.getAffectedEditor()) {
			polarLineComponent.setAngle((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getAngleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.clipPath == event.getAffectedEditor()) {
			polarLineComponent.setClipPath((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.clipRule == event.getAffectedEditor()) {
			polarLineComponent.setClipRule((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.drawingPriority == event.getAffectedEditor()) {
			polarLineComponent.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.r == event.getAffectedEditor()) {
			polarLineComponent.setR((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.stroke == event.getAffectedEditor()) {
			polarLineComponent.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
			polarLineComponent.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
			polarLineComponent.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
			polarLineComponent.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
			polarLineComponent.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			polarLineComponent.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
			polarLineComponent.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.strokewidth == event.getAffectedEditor()) {
			polarLineComponent.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.transform == event.getAffectedEditor()) {
			polarLineComponent.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.visibility == event.getAffectedEditor()) {
			polarLineComponent.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.x1 == event.getAffectedEditor()) {
			polarLineComponent.setX1((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.PolarLineComponent.Properties.y1 == event.getAffectedEditor()) {
			polarLineComponent.setY1((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PolarLineComponentPropertiesEditionPart basePart = (PolarLineComponentPropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getPolarLineComponent_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Angle().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.angle)) {
				if (msg.getNewValue() != null) {
					basePart.setAngle(EcoreUtil.convertToString(Part2Package.eINSTANCE.getAngleType(), msg.getNewValue()));
				} else {
					basePart.setAngle("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_ClipPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.clipPath)) {
				if (msg.getNewValue() != null) {
					basePart.setClipPath(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipPath("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_ClipRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.clipRule)) {
				if (msg.getNewValue() != null) {
					basePart.setClipRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setClipRule("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_R().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.r)) {
				if (msg.getNewValue() != null) {
					basePart.setR(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setR("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_X1().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.x1)) {
				if (msg.getNewValue() != null) {
					basePart.setX1(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX1("");
				}
			}
			if (Part2Package.eINSTANCE.getPolarLineComponent_Y1().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.PolarLineComponent.Properties.y1)) {
				if (msg.getNewValue() != null) {
					basePart.setY1(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setY1("");
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
			Part2Package.eINSTANCE.getPolarLineComponent_Id(),
			Part2Package.eINSTANCE.getPolarLineComponent_Angle(),
			Part2Package.eINSTANCE.getPolarLineComponent_ClipPath(),
			Part2Package.eINSTANCE.getPolarLineComponent_ClipRule(),
			Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority(),
			Part2Package.eINSTANCE.getPolarLineComponent_R(),
			Part2Package.eINSTANCE.getPolarLineComponent_Stroke(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity(),
			Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth(),
			Part2Package.eINSTANCE.getPolarLineComponent_Transform(),
			Part2Package.eINSTANCE.getPolarLineComponent_Visibility(),
			Part2Package.eINSTANCE.getPolarLineComponent_X1(),
			Part2Package.eINSTANCE.getPolarLineComponent_Y1()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.PolarLineComponent.Properties.id;
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
				if (Part2ViewsRepository.PolarLineComponent.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.angle == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Angle().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Angle().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.clipPath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_ClipPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_ClipPath().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.clipRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_ClipRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_ClipRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.r == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_R().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_R().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.x1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_X1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_X1().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.PolarLineComponent.Properties.y1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPolarLineComponent_Y1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getPolarLineComponent_Y1().getEAttributeType(), newValue);
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
