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
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.TextPrimitivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TextPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TextPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textPrimitive, String editing_mode) {
		super(editingContext, textPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.TextPrimitive.class;
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
			
			final TextPrimitive textPrimitive = (TextPrimitive)elt;
			final TextPrimitivePropertiesEditionPart basePart = (TextPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), textPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontFamily))
				basePart.setFontFamily(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontFamily()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getValue()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), textPrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fill))
				basePart.setFill(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), textPrimitive.getFill()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity))
				basePart.setFillOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), textPrimitive.getFillOpacity()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fillRule))
				basePart.setFillRule(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), textPrimitive.getFillRule()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontSize))
				basePart.setFontSize(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontSize()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontStretch))
				basePart.setFontStretch(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontStretch()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontStyle))
				basePart.setFontStyle(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontStyle()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontVariant))
				basePart.setFontVariant(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontVariant()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontWeight))
				basePart.setFontWeight(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getFontWeight()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.stroke))
				basePart.setStroke(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getColorType(), textPrimitive.getStroke()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray))
				basePart.setStrokeDasharray(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getStrokeDasharray()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset))
				basePart.setStrokeDashoffset(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), textPrimitive.getStrokeDashoffset()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap))
				basePart.setStrokeLinecap(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getStrokeLinecap()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin))
				basePart.setStrokeLinejoin(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getStrokeLinejoin()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit))
				basePart.setStrokeMiterlimit(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getRealType(), textPrimitive.getStrokeMiterlimit()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity))
				basePart.setStrokeOpacity(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), textPrimitive.getStrokeOpacity()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokewidth))
				basePart.setStrokewidth(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), textPrimitive.getStrokewidth()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), textPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), textPrimitive.getVisibility()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.x))
				basePart.setX(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), textPrimitive.getX()));
			
			if (isAccessible(Part2ViewsRepository.TextPrimitive.Properties.y))
				basePart.setY(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), textPrimitive.getY()));
			
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
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getTextPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontFamily) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontFamily();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.value) {
			return Part2Package.eINSTANCE.getTextPrimitive_Value();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fill) {
			return Part2Package.eINSTANCE.getTextPrimitive_Fill();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fillOpacity) {
			return Part2Package.eINSTANCE.getTextPrimitive_FillOpacity();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fillRule) {
			return Part2Package.eINSTANCE.getTextPrimitive_FillRule();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontSize) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontSize();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontStretch) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontStretch();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontStyle) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontStyle();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontVariant) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontVariant();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.fontWeight) {
			return Part2Package.eINSTANCE.getTextPrimitive_FontWeight();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.stroke) {
			return Part2Package.eINSTANCE.getTextPrimitive_Stroke();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity) {
			return Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.strokewidth) {
			return Part2Package.eINSTANCE.getTextPrimitive_Strokewidth();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getTextPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getTextPrimitive_Visibility();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.x) {
			return Part2Package.eINSTANCE.getTextPrimitive_X();
		}
		if (editorKey == Part2ViewsRepository.TextPrimitive.Properties.y) {
			return Part2Package.eINSTANCE.getTextPrimitive_Y();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TextPrimitive textPrimitive = (TextPrimitive)semanticObject;
		if (Part2ViewsRepository.TextPrimitive.Properties.id == event.getAffectedEditor()) {
			textPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontFamily == event.getAffectedEditor()) {
			textPrimitive.setFontFamily((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.value == event.getAffectedEditor()) {
			textPrimitive.setValue((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			textPrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fill == event.getAffectedEditor()) {
			textPrimitive.setFill((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
			textPrimitive.setFillOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fillRule == event.getAffectedEditor()) {
			textPrimitive.setFillRule((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getFillRuleType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontSize == event.getAffectedEditor()) {
			textPrimitive.setFontSize((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontStretch == event.getAffectedEditor()) {
			textPrimitive.setFontStretch((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontStyle == event.getAffectedEditor()) {
			textPrimitive.setFontStyle((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontVariant == event.getAffectedEditor()) {
			textPrimitive.setFontVariant((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.fontWeight == event.getAffectedEditor()) {
			textPrimitive.setFontWeight((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.stroke == event.getAffectedEditor()) {
			textPrimitive.setStroke((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getColorType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
			textPrimitive.setStrokeDasharray((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
			textPrimitive.setStrokeDashoffset((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
			textPrimitive.setStrokeLinecap((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
			textPrimitive.setStrokeLinejoin((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
			textPrimitive.setStrokeMiterlimit((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getRealType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
			textPrimitive.setStrokeOpacity((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getOpacityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
			textPrimitive.setStrokewidth((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getDistanceType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.transform == event.getAffectedEditor()) {
			textPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.visibility == event.getAffectedEditor()) {
			textPrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.x == event.getAffectedEditor()) {
			textPrimitive.setX((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.TextPrimitive.Properties.y == event.getAffectedEditor()) {
			textPrimitive.setY((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getPositionType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TextPrimitivePropertiesEditionPart basePart = (TextPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getTextPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontFamily().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontFamily)) {
				if (msg.getNewValue() != null) {
					basePart.setFontFamily(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontFamily("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Fill().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fill)) {
				if (msg.getNewValue() != null) {
					basePart.setFill(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setFill("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FillOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fillOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setFillOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setFillOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FillRule().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fillRule)) {
				if (msg.getNewValue() != null) {
					basePart.setFillRule(EcoreUtil.convertToString(Part2Package.eINSTANCE.getFillRuleType(), msg.getNewValue()));
				} else {
					basePart.setFillRule("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontSize)) {
				if (msg.getNewValue() != null) {
					basePart.setFontSize(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontSize("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontStretch().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontStretch)) {
				if (msg.getNewValue() != null) {
					basePart.setFontStretch(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontStretch("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontStyle().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontStyle)) {
				if (msg.getNewValue() != null) {
					basePart.setFontStyle(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontStyle("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontVariant().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontVariant)) {
				if (msg.getNewValue() != null) {
					basePart.setFontVariant(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontVariant("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_FontWeight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.fontWeight)) {
				if (msg.getNewValue() != null) {
					basePart.setFontWeight(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setFontWeight("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Stroke().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.stroke)) {
				if (msg.getNewValue() != null) {
					basePart.setStroke(EcoreUtil.convertToString(Part2Package.eINSTANCE.getColorType(), msg.getNewValue()));
				} else {
					basePart.setStroke("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDasharray(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDasharray("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeDashoffset(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokeDashoffset("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinecap(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinecap("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeLinejoin(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setStrokeLinejoin("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeMiterlimit(EcoreUtil.convertToString(Part2Package.eINSTANCE.getRealType(), msg.getNewValue()));
				} else {
					basePart.setStrokeMiterlimit("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokeOpacity(EcoreUtil.convertToString(Part2Package.eINSTANCE.getOpacityType(), msg.getNewValue()));
				} else {
					basePart.setStrokeOpacity("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Strokewidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.strokewidth)) {
				if (msg.getNewValue() != null) {
					basePart.setStrokewidth(EcoreUtil.convertToString(Part2Package.eINSTANCE.getDistanceType(), msg.getNewValue()));
				} else {
					basePart.setStrokewidth("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_X().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.x)) {
				if (msg.getNewValue() != null) {
					basePart.setX(EcoreUtil.convertToString(Part2Package.eINSTANCE.getPositionType(), msg.getNewValue()));
				} else {
					basePart.setX("");
				}
			}
			if (Part2Package.eINSTANCE.getTextPrimitive_Y().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.TextPrimitive.Properties.y)) {
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
			Part2Package.eINSTANCE.getTextPrimitive_Id(),
			Part2Package.eINSTANCE.getTextPrimitive_FontFamily(),
			Part2Package.eINSTANCE.getTextPrimitive_Value(),
			Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getTextPrimitive_Fill(),
			Part2Package.eINSTANCE.getTextPrimitive_FillOpacity(),
			Part2Package.eINSTANCE.getTextPrimitive_FillRule(),
			Part2Package.eINSTANCE.getTextPrimitive_FontSize(),
			Part2Package.eINSTANCE.getTextPrimitive_FontStretch(),
			Part2Package.eINSTANCE.getTextPrimitive_FontStyle(),
			Part2Package.eINSTANCE.getTextPrimitive_FontVariant(),
			Part2Package.eINSTANCE.getTextPrimitive_FontWeight(),
			Part2Package.eINSTANCE.getTextPrimitive_Stroke(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit(),
			Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity(),
			Part2Package.eINSTANCE.getTextPrimitive_Strokewidth(),
			Part2Package.eINSTANCE.getTextPrimitive_Transform(),
			Part2Package.eINSTANCE.getTextPrimitive_Visibility(),
			Part2Package.eINSTANCE.getTextPrimitive_X(),
			Part2Package.eINSTANCE.getTextPrimitive_Y()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.TextPrimitive.Properties.id || key == Part2ViewsRepository.TextPrimitive.Properties.fontFamily || key == Part2ViewsRepository.TextPrimitive.Properties.value;
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
				if (Part2ViewsRepository.TextPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontFamily == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontFamily().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontFamily().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Value().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fill == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Fill().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Fill().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fillOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FillOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FillOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fillRule == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FillRule().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FillRule().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontSize().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontStretch == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontStretch().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontStretch().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontStyle == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontStyle().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontStyle().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontVariant == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontVariant().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontVariant().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.fontWeight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_FontWeight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_FontWeight().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.stroke == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Stroke().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Stroke().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeDasharray == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeDashoffset == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeLinecap == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeLinejoin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeMiterlimit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokeOpacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.strokewidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Strokewidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Strokewidth().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Visibility().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.x == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_X().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_X().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.TextPrimitive.Properties.y == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getTextPrimitive_Y().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getTextPrimitive_Y().getEAttributeType(), newValue);
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
