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
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.LinePrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class LinePrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public LinePrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject linePrimitive, String editing_mode) {
		super(editingContext, linePrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.LinePrimitive.class;
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
			
			final LinePrimitive linePrimitive = (LinePrimitive)elt;
			final LinePrimitivePropertiesEditionPart basePart = (LinePrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), linePrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), linePrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), linePrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), linePrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), linePrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), linePrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), linePrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), linePrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), linePrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), linePrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), linePrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), linePrimitive.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.x1))
				basePart.setX1(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), linePrimitive.getX1()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.x2))
				basePart.setX2(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), linePrimitive.getX2()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.y1))
				basePart.setY1(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), linePrimitive.getY1()));
			
			if (isAccessible(Part2ViewsRepository.LinePrimitive.Properties.y2))
				basePart.setY2(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), linePrimitive.getY2()));
			
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
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getLinePrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getLinePrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getLinePrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getLinePrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getLinePrimitive_Visibility();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.x1) {
			return Part2Package.eINSTANCE.getLinePrimitive_X1();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.x2) {
			return Part2Package.eINSTANCE.getLinePrimitive_X2();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.y1) {
			return Part2Package.eINSTANCE.getLinePrimitive_Y1();
		}
		if (editorKey == Part2ViewsRepository.LinePrimitive.Properties.y2) {
			return Part2Package.eINSTANCE.getLinePrimitive_Y2();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LinePrimitive linePrimitive = (LinePrimitive)semanticObject;
		if (Part2ViewsRepository.LinePrimitive.Properties.id == event.getAffectedEditor()) {
			linePrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			linePrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.stroke == event.getAffectedEditor()) {
			linePrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			linePrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			linePrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			linePrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			linePrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			linePrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			linePrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			linePrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.transform == event.getAffectedEditor()) {
			linePrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.visibility == event.getAffectedEditor()) {
			linePrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.x1 == event.getAffectedEditor()) {
			linePrimitive.setX1((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.x2 == event.getAffectedEditor()) {
			linePrimitive.setX2((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.y1 == event.getAffectedEditor()) {
			linePrimitive.setY1((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.LinePrimitive.Properties.y2 == event.getAffectedEditor()) {
			linePrimitive.setY2((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			LinePrimitivePropertiesEditionPart basePart = (LinePrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getLinePrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_X1().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.x1)) {
				if (msg.getNewValue() != null) {
					basePart.setX1(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX1("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_X2().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.x2)) {
				if (msg.getNewValue() != null) {
					basePart.setX2(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX2("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Y1().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.y1)) {
				if (msg.getNewValue() != null) {
					basePart.setY1(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setY1("");
				}
			}
			if (Part2Package.eINSTANCE.getLinePrimitive_Y2().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.LinePrimitive.Properties.y2)) {
				if (msg.getNewValue() != null) {
					basePart.setY2(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setY2("");
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
			Part2Package.eINSTANCE.getLinePrimitive_Id(),
			Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getLinePrimitive_Stroke(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getLinePrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getLinePrimitive_Transform(),
			Part2Package.eINSTANCE.getLinePrimitive_Visibility(),
			Part2Package.eINSTANCE.getLinePrimitive_X1(),
			Part2Package.eINSTANCE.getLinePrimitive_X2(),
			Part2Package.eINSTANCE.getLinePrimitive_Y1(),
			Part2Package.eINSTANCE.getLinePrimitive_Y2()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.LinePrimitive.Properties.id;
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
				if (Part2ViewsRepository.LinePrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.x1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_X1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_X1().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.x2 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_X2().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_X2().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.y1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Y1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Y1().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.LinePrimitive.Properties.y2 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getLinePrimitive_Y2().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getLinePrimitive_Y2().getEAttributeType(), newValue);
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
