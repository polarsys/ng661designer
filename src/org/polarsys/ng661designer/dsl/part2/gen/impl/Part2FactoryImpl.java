/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.polarsys.ng661designer.dsl.part2.gen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Part2FactoryImpl extends EFactoryImpl implements Part2Factory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Part2Factory init() {
		try {
			Part2Factory thePart2Factory = (Part2Factory)EPackage.Registry.INSTANCE.getEFactory(Part2Package.eNS_URI);
			if (thePart2Factory != null) {
				return thePart2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Part2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Part2Package.ARC_COMPONENT: return createArcComponent();
			case Part2Package.BEHAVIOR_TYPE: return createBehaviorType();
			case Part2Package.CHILD_PRIMITIVE: return createChildPrimitive();
			case Part2Package.CIRCLE_PRIMITIVE: return createCirclePrimitive();
			case Part2Package.CLIP_PATH_PRIMITIVE: return createClipPathPrimitive();
			case Part2Package.CLOCK_TYPE: return createClockType();
			case Part2Package.COMPONENT_DEFINITION_TYPE: return createComponentDefinitionType();
			case Part2Package.CROWN_COMPONENT: return createCrownComponent();
			case Part2Package.CUSTOM_INTEGER_TYPE_ELEMENT_TYPE: return createCustomIntegerTypeElementType();
			case Part2Package.CUSTOM_REAL_TYPE_ELEMENT_TYPE: return createCustomRealTypeElementType();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE: return createCustomStringTypeElementType();
			case Part2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Part2Package.ELLIPSE_PRIMITIVE: return createEllipsePrimitive();
			case Part2Package.EVENT_TYPE: return createEventType();
			case Part2Package.FUNCTION_TYPE: return createFunctionType();
			case Part2Package.GESTURE_AREA_PRIMITIVE: return createGestureAreaPrimitive();
			case Part2Package.GROUP_PRIMITIVE: return createGroupPrimitive();
			case Part2Package.IMAGE_PRIMITIVE: return createImagePrimitive();
			case Part2Package.IMPORT_TYPE: return createImportType();
			case Part2Package.INTERFACE_TYPE: return createInterfaceType();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE: return createKeyboardInputPrimitive();
			case Part2Package.LINE_PRIMITIVE: return createLinePrimitive();
			case Part2Package.PARAM_TYPE: return createParamType();
			case Part2Package.PATH_PRIMITIVE: return createPathPrimitive();
			case Part2Package.POINTER_AREA_PRIMITIVE: return createPointerAreaPrimitive();
			case Part2Package.POLAR_LINE_COMPONENT: return createPolarLineComponent();
			case Part2Package.POLYGON_PRIMITIVE: return createPolygonPrimitive();
			case Part2Package.POLYLINE_PRIMITIVE: return createPolylinePrimitive();
			case Part2Package.PROPERTY_TYPE: return createPropertyType();
			case Part2Package.RECT_PRIMITIVE: return createRectPrimitive();
			case Part2Package.REPRESENTATION_TYPE: return createRepresentationType();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE: return createScrollWheelAreaPrimitive();
			case Part2Package.TEXT_PRIMITIVE: return createTextPrimitive();
			case Part2Package.TOUCH_AREA_PRIMITIVE: return createTouchAreaPrimitive();
			case Part2Package.PROPERTY_VALUE: return createPropertyValue();
			case Part2Package.WIDGET_COMPOSITION: return createWidgetComposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Part2Package.ALIGNEMENT_TYPE_VAL:
				return createAlignementTypeValFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL:
				return createAspectRatioTypeValFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE_VAL:
				return createBooleanTypeValFromString(eDataType, initialValue);
			case Part2Package.COLOR_REFERENCE_TYPE:
				return createColorReferenceTypeFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE_VAL:
				return createFillRuleTypeValFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE:
				return createModalityTypeFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE1:
				return createModalityType1FromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE_VAL:
				return createVisibilityTypeValFromString(eDataType, initialValue);
			case Part2Package.ALIGNEMENT_TYPE:
				return createAlignementTypeFromString(eDataType, initialValue);
			case Part2Package.ALIGNEMENT_TYPE_VAL_OBJECT:
				return createAlignementTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE:
				return createAngleTypeFromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE_VAL:
				return createAngleTypeValFromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE_VAL_OBJECT:
				return createAngleTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE:
				return createAspectRatioTypeFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL_OBJECT:
				return createAspectRatioTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE:
				return createBooleanTypeFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE_VAL_OBJECT:
				return createBooleanTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.COLOR_REFERENCE_TYPE_OBJECT:
				return createColorReferenceTypeObjectFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGBHEX_TYPE:
				return createColorRGBHEXTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_RGB255_TYPE:
				return createColorRGBRgb255TypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_RGB_PERCENT_TYPE:
				return createColorRGBRgbPercentTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_TYPE:
				return createColorRGBTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_TYPE:
				return createColorTypeFromString(eDataType, initialValue);
			case Part2Package.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case Part2Package.DATE_TYPE:
				return createDateTypeFromString(eDataType, initialValue);
			case Part2Package.DISTANCE_TYPE:
				return createDistanceTypeFromString(eDataType, initialValue);
			case Part2Package.EXPRESSION:
				return createExpressionFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE:
				return createFillRuleTypeFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE_VAL_OBJECT:
				return createFillRuleTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.FONT_TYPE:
				return createFontTypeFromString(eDataType, initialValue);
			case Part2Package.FORMAT_STRING_TYPE:
				return createFormatStringTypeFromString(eDataType, initialValue);
			case Part2Package.FORMAT_STRING_TYPE_VAL:
				return createFormatStringTypeValFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE:
				return createFrequencyTypeFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE_VAL:
				return createFrequencyTypeValFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE_VAL_OBJECT:
				return createFrequencyTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.IMAGE_TYPE:
				return createImageTypeFromString(eDataType, initialValue);
			case Part2Package.INTEGER_TYPE:
				return createIntegerTypeFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE_OBJECT:
				return createModalityTypeObjectFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE_OBJECT1:
				return createModalityTypeObject1FromString(eDataType, initialValue);
			case Part2Package.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE:
				return createOpacityTypeFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE_VAL:
				return createOpacityTypeValFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE_VAL_OBJECT:
				return createOpacityTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case Part2Package.REAL_TYPE:
				return createRealTypeFromString(eDataType, initialValue);
			case Part2Package.STIPPLE_TYPE:
				return createStippleTypeFromString(eDataType, initialValue);
			case Part2Package.STRING_TYPE:
				return createStringTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_DEFAULTMILLISECONDS_TYPE:
				return createTimeDefaultmillisecondsTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_HOURS_TYPE:
				return createTimeHoursTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_MINUTES_TYPE:
				return createTimeMinutesTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_SECONDS_OR_SUBSECONDS_TYPE:
				return createTimeSecondsOrSubsecondsTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case Part2Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case Part2Package.VELOCITY_TYPE:
				return createVelocityTypeFromString(eDataType, initialValue);
			case Part2Package.VELOCITY_TYPE_OBJECT:
				return createVelocityTypeObjectFromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE_VAL_OBJECT:
				return createVisibilityTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ZINDEX_TYPE:
				return createZIndexTypeFromString(eDataType, initialValue);
			case Part2Package.ZINDEX_TYPE_VAL:
				return createZIndexTypeValFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Part2Package.ALIGNEMENT_TYPE_VAL:
				return convertAlignementTypeValToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL:
				return convertAspectRatioTypeValToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE_VAL:
				return convertBooleanTypeValToString(eDataType, instanceValue);
			case Part2Package.COLOR_REFERENCE_TYPE:
				return convertColorReferenceTypeToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE_VAL:
				return convertFillRuleTypeValToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE:
				return convertModalityTypeToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE1:
				return convertModalityType1ToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE_VAL:
				return convertVisibilityTypeValToString(eDataType, instanceValue);
			case Part2Package.ALIGNEMENT_TYPE:
				return convertAlignementTypeToString(eDataType, instanceValue);
			case Part2Package.ALIGNEMENT_TYPE_VAL_OBJECT:
				return convertAlignementTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE:
				return convertAngleTypeToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE_VAL:
				return convertAngleTypeValToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE_VAL_OBJECT:
				return convertAngleTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE:
				return convertAspectRatioTypeToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL_OBJECT:
				return convertAspectRatioTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE:
				return convertBooleanTypeToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE_VAL_OBJECT:
				return convertBooleanTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.COLOR_REFERENCE_TYPE_OBJECT:
				return convertColorReferenceTypeObjectToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGBHEX_TYPE:
				return convertColorRGBHEXTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_RGB255_TYPE:
				return convertColorRGBRgb255TypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_RGB_PERCENT_TYPE:
				return convertColorRGBRgbPercentTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_TYPE:
				return convertColorRGBTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_TYPE:
				return convertColorTypeToString(eDataType, instanceValue);
			case Part2Package.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case Part2Package.DATE_TYPE:
				return convertDateTypeToString(eDataType, instanceValue);
			case Part2Package.DISTANCE_TYPE:
				return convertDistanceTypeToString(eDataType, instanceValue);
			case Part2Package.EXPRESSION:
				return convertExpressionToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE:
				return convertFillRuleTypeToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE_VAL_OBJECT:
				return convertFillRuleTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.FONT_TYPE:
				return convertFontTypeToString(eDataType, instanceValue);
			case Part2Package.FORMAT_STRING_TYPE:
				return convertFormatStringTypeToString(eDataType, instanceValue);
			case Part2Package.FORMAT_STRING_TYPE_VAL:
				return convertFormatStringTypeValToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE:
				return convertFrequencyTypeToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE_VAL:
				return convertFrequencyTypeValToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE_VAL_OBJECT:
				return convertFrequencyTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.IMAGE_TYPE:
				return convertImageTypeToString(eDataType, instanceValue);
			case Part2Package.INTEGER_TYPE:
				return convertIntegerTypeToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE_OBJECT:
				return convertModalityTypeObjectToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE_OBJECT1:
				return convertModalityTypeObject1ToString(eDataType, instanceValue);
			case Part2Package.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE:
				return convertOpacityTypeToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE_VAL:
				return convertOpacityTypeValToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE_VAL_OBJECT:
				return convertOpacityTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case Part2Package.REAL_TYPE:
				return convertRealTypeToString(eDataType, instanceValue);
			case Part2Package.STIPPLE_TYPE:
				return convertStippleTypeToString(eDataType, instanceValue);
			case Part2Package.STRING_TYPE:
				return convertStringTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_DEFAULTMILLISECONDS_TYPE:
				return convertTimeDefaultmillisecondsTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_HOURS_TYPE:
				return convertTimeHoursTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_MINUTES_TYPE:
				return convertTimeMinutesTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_SECONDS_OR_SUBSECONDS_TYPE:
				return convertTimeSecondsOrSubsecondsTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case Part2Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case Part2Package.VELOCITY_TYPE:
				return convertVelocityTypeToString(eDataType, instanceValue);
			case Part2Package.VELOCITY_TYPE_OBJECT:
				return convertVelocityTypeObjectToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE_VAL_OBJECT:
				return convertVisibilityTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ZINDEX_TYPE:
				return convertZIndexTypeToString(eDataType, instanceValue);
			case Part2Package.ZINDEX_TYPE_VAL:
				return convertZIndexTypeValToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcComponent createArcComponent() {
		ArcComponentImpl arcComponent = new ArcComponentImpl();
		return arcComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorType() {
		BehaviorTypeImpl behaviorType = new BehaviorTypeImpl();
		return behaviorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPrimitive createChildPrimitive() {
		ChildPrimitiveImpl childPrimitive = new ChildPrimitiveImpl();
		return childPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CirclePrimitive createCirclePrimitive() {
		CirclePrimitiveImpl circlePrimitive = new CirclePrimitiveImpl();
		return circlePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipPathPrimitive createClipPathPrimitive() {
		ClipPathPrimitiveImpl clipPathPrimitive = new ClipPathPrimitiveImpl();
		return clipPathPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType createClockType() {
		ClockTypeImpl clockType = new ClockTypeImpl();
		return clockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType createComponentDefinitionType() {
		ComponentDefinitionTypeImpl componentDefinitionType = new ComponentDefinitionTypeImpl();
		return componentDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrownComponent createCrownComponent() {
		CrownComponentImpl crownComponent = new CrownComponentImpl();
		return crownComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomIntegerTypeElementType createCustomIntegerTypeElementType() {
		CustomIntegerTypeElementTypeImpl customIntegerTypeElementType = new CustomIntegerTypeElementTypeImpl();
		return customIntegerTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRealTypeElementType createCustomRealTypeElementType() {
		CustomRealTypeElementTypeImpl customRealTypeElementType = new CustomRealTypeElementTypeImpl();
		return customRealTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStringTypeElementType createCustomStringTypeElementType() {
		CustomStringTypeElementTypeImpl customStringTypeElementType = new CustomStringTypeElementTypeImpl();
		return customStringTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsePrimitive createEllipsePrimitive() {
		EllipsePrimitiveImpl ellipsePrimitive = new EllipsePrimitiveImpl();
		return ellipsePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestureAreaPrimitive createGestureAreaPrimitive() {
		GestureAreaPrimitiveImpl gestureAreaPrimitive = new GestureAreaPrimitiveImpl();
		return gestureAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupPrimitive createGroupPrimitive() {
		GroupPrimitiveImpl groupPrimitive = new GroupPrimitiveImpl();
		return groupPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePrimitive createImagePrimitive() {
		ImagePrimitiveImpl imagePrimitive = new ImagePrimitiveImpl();
		return imagePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType() {
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyboardInputPrimitive createKeyboardInputPrimitive() {
		KeyboardInputPrimitiveImpl keyboardInputPrimitive = new KeyboardInputPrimitiveImpl();
		return keyboardInputPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinePrimitive createLinePrimitive() {
		LinePrimitiveImpl linePrimitive = new LinePrimitiveImpl();
		return linePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPrimitive createPathPrimitive() {
		PathPrimitiveImpl pathPrimitive = new PathPrimitiveImpl();
		return pathPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerAreaPrimitive createPointerAreaPrimitive() {
		PointerAreaPrimitiveImpl pointerAreaPrimitive = new PointerAreaPrimitiveImpl();
		return pointerAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarLineComponent createPolarLineComponent() {
		PolarLineComponentImpl polarLineComponent = new PolarLineComponentImpl();
		return polarLineComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPrimitive createPolygonPrimitive() {
		PolygonPrimitiveImpl polygonPrimitive = new PolygonPrimitiveImpl();
		return polygonPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylinePrimitive createPolylinePrimitive() {
		PolylinePrimitiveImpl polylinePrimitive = new PolylinePrimitiveImpl();
		return polylinePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectPrimitive createRectPrimitive() {
		RectPrimitiveImpl rectPrimitive = new RectPrimitiveImpl();
		return rectPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationType createRepresentationType() {
		RepresentationTypeImpl representationType = new RepresentationTypeImpl();
		return representationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollWheelAreaPrimitive createScrollWheelAreaPrimitive() {
		ScrollWheelAreaPrimitiveImpl scrollWheelAreaPrimitive = new ScrollWheelAreaPrimitiveImpl();
		return scrollWheelAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPrimitive createTextPrimitive() {
		TextPrimitiveImpl textPrimitive = new TextPrimitiveImpl();
		return textPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchAreaPrimitive createTouchAreaPrimitive() {
		TouchAreaPrimitiveImpl touchAreaPrimitive = new TouchAreaPrimitiveImpl();
		return touchAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetComposition createWidgetComposition() {
		WidgetCompositionImpl widgetComposition = new WidgetCompositionImpl();
		return widgetComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignementTypeVal createAlignementTypeValFromString(EDataType eDataType, String initialValue) {
		AlignementTypeVal result = AlignementTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioTypeVal createAspectRatioTypeValFromString(EDataType eDataType, String initialValue) {
		AspectRatioTypeVal result = AspectRatioTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeVal createBooleanTypeValFromString(EDataType eDataType, String initialValue) {
		BooleanTypeVal result = BooleanTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorReferenceType createColorReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ColorReferenceType result = ColorReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleTypeVal createFillRuleTypeValFromString(EDataType eDataType, String initialValue) {
		FillRuleTypeVal result = FillRuleTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType createModalityTypeFromString(EDataType eDataType, String initialValue) {
		ModalityType result = ModalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType1 createModalityType1FromString(EDataType eDataType, String initialValue) {
		ModalityType1 result = ModalityType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityTypeVal createVisibilityTypeValFromString(EDataType eDataType, String initialValue) {
		VisibilityTypeVal result = VisibilityTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAlignementTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAlignementTypeValFromString(Part2Package.eINSTANCE.getAlignementTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAlignementTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAlignementTypeValToString(Part2Package.eINSTANCE.getAlignementTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignementTypeVal createAlignementTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignementTypeValFromString(Part2Package.eINSTANCE.getAlignementTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignementTypeValToString(Part2Package.eINSTANCE.getAlignementTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAngleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAngleTypeValFromString(Part2Package.eINSTANCE.getAngleTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAngleTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAngleTypeValToString(Part2Package.eINSTANCE.getAngleTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAngleTypeValFromString(Part2Package.eINSTANCE.getAngleTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngleTypeValToString(Part2Package.eINSTANCE.getAngleTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAspectRatioTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAspectRatioTypeValFromString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAspectRatioTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAspectRatioTypeValToString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioTypeVal createAspectRatioTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAspectRatioTypeValFromString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAspectRatioTypeValToString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBooleanTypeValFromString(Part2Package.eINSTANCE.getBooleanTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getBooleanTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertBooleanTypeValToString(Part2Package.eINSTANCE.getBooleanTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeVal createBooleanTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanTypeValFromString(Part2Package.eINSTANCE.getBooleanTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanTypeValToString(Part2Package.eINSTANCE.getBooleanTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorReferenceType createColorReferenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorReferenceTypeFromString(Part2Package.eINSTANCE.getColorReferenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorReferenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorReferenceTypeToString(Part2Package.eINSTANCE.getColorReferenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBHEXTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBHEXTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBRgb255TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBRgb255TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBRgbPercentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBRgbPercentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createColorRGBRgbPercentTypeFromString(Part2Package.eINSTANCE.getColorRGBRgbPercentType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorRGBRgb255TypeFromString(Part2Package.eINSTANCE.getColorRGBRgb255Type(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorRGBHEXTypeFromString(Part2Package.eINSTANCE.getColorRGBHEXType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getColorRGBRgbPercentType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBRgbPercentTypeToString(Part2Package.eINSTANCE.getColorRGBRgbPercentType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorRGBRgb255Type().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBRgb255TypeToString(Part2Package.eINSTANCE.getColorRGBRgb255Type(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorRGBHEXType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBHEXTypeToString(Part2Package.eINSTANCE.getColorRGBHEXType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createColorRGBTypeFromString(Part2Package.eINSTANCE.getColorRGBType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorReferenceTypeFromString(Part2Package.eINSTANCE.getColorReferenceType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getColorRGBType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBTypeToString(Part2Package.eINSTANCE.getColorRGBType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorReferenceType().isInstance(instanceValue)) {
			try {
				String value = convertColorReferenceTypeToString(Part2Package.eINSTANCE.getColorReferenceType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDistanceTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFillRuleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFillRuleTypeValFromString(Part2Package.eINSTANCE.getFillRuleTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFillRuleTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFillRuleTypeValToString(Part2Package.eINSTANCE.getFillRuleTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleTypeVal createFillRuleTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createFillRuleTypeValFromString(Part2Package.eINSTANCE.getFillRuleTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillRuleTypeValToString(Part2Package.eINSTANCE.getFillRuleTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFontTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormatStringTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createFormatStringTypeValFromString(Part2Package.eINSTANCE.getFormatStringTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatStringTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFormatStringTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFormatStringTypeValToString(Part2Package.eINSTANCE.getFormatStringTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormatStringTypeValFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatStringTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFrequencyTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFrequencyTypeValFromString(Part2Package.eINSTANCE.getFrequencyTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFrequencyTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFrequencyTypeValToString(Part2Package.eINSTANCE.getFrequencyTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFrequencyTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFrequencyTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createFrequencyTypeValFromString(Part2Package.eINSTANCE.getFrequencyTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrequencyTypeValToString(Part2Package.eINSTANCE.getFrequencyTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImageTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.LONG.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType createModalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModalityTypeFromString(Part2Package.eINSTANCE.getModalityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModalityTypeToString(Part2Package.eINSTANCE.getModalityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType1 createModalityTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createModalityType1FromString(Part2Package.eINSTANCE.getModalityType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertModalityType1ToString(Part2Package.eINSTANCE.getModalityType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOpacityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createOpacityTypeValFromString(Part2Package.eINSTANCE.getOpacityTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getOpacityTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertOpacityTypeValToString(Part2Package.eINSTANCE.getOpacityTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createOpacityTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createOpacityTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createOpacityTypeValFromString(Part2Package.eINSTANCE.getOpacityTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOpacityTypeValToString(Part2Package.eINSTANCE.getOpacityTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPositionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRealTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRealTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStippleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStippleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeDefaultmillisecondsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDefaultmillisecondsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeHoursTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeHoursTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeMinutesTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeMinutesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeSecondsOrSubsecondsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeSecondsOrSubsecondsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createTimeHoursTypeFromString(Part2Package.eINSTANCE.getTimeHoursType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeMinutesTypeFromString(Part2Package.eINSTANCE.getTimeMinutesType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeSecondsOrSubsecondsTypeFromString(Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeDefaultmillisecondsTypeFromString(Part2Package.eINSTANCE.getTimeDefaultmillisecondsType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getTimeHoursType().isInstance(instanceValue)) {
			try {
				String value = convertTimeHoursTypeToString(Part2Package.eINSTANCE.getTimeHoursType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeMinutesType().isInstance(instanceValue)) {
			try {
				String value = convertTimeMinutesTypeToString(Part2Package.eINSTANCE.getTimeMinutesType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType().isInstance(instanceValue)) {
			try {
				String value = convertTimeSecondsOrSubsecondsTypeToString(Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeDefaultmillisecondsType().isInstance(instanceValue)) {
			try {
				String value = convertTimeDefaultmillisecondsTypeToString(Part2Package.eINSTANCE.getTimeDefaultmillisecondsType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVelocityTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVelocityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVelocityTypeFromString(Part2Package.eINSTANCE.getVelocityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVelocityTypeToString(Part2Package.eINSTANCE.getVelocityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVisibilityTypeValFromString(Part2Package.eINSTANCE.getVisibilityTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getVisibilityTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertVisibilityTypeValToString(Part2Package.eINSTANCE.getVisibilityTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityTypeVal createVisibilityTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityTypeValFromString(Part2Package.eINSTANCE.getVisibilityTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityTypeValToString(Part2Package.eINSTANCE.getVisibilityTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createZIndexTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createZIndexTypeValFromString(Part2Package.eINSTANCE.getZIndexTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZIndexTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getZIndexTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertZIndexTypeValToString(Part2Package.eINSTANCE.getZIndexTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZIndexTypeValFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZIndexTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Package getPart2Package() {
		return (Part2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Part2Package getPackage() {
		return Part2Package.eINSTANCE;
	}

} //Part2FactoryImpl
