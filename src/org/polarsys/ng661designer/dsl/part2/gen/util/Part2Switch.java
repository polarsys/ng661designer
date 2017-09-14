/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.ng661designer.dsl.part2.gen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.ng661.part2.Part2Package
 * @generated
 */
public class Part2Switch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Part2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Switch() {
		if (modelPackage == null) {
			modelPackage = Part2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Part2Package.ARC_COMPONENT: {
				ArcComponent arcComponent = (ArcComponent)theEObject;
				T result = caseArcComponent(arcComponent);
				if (result == null) result = caseRepresentationTypes(arcComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.BEHAVIOR_TYPE: {
				BehaviorType behaviorType = (BehaviorType)theEObject;
				T result = caseBehaviorType(behaviorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CHILD_PRIMITIVE: {
				ChildPrimitive childPrimitive = (ChildPrimitive)theEObject;
				T result = caseChildPrimitive(childPrimitive);
				if (result == null) result = caseRepresentationTypes(childPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CIRCLE_PRIMITIVE: {
				CirclePrimitive circlePrimitive = (CirclePrimitive)theEObject;
				T result = caseCirclePrimitive(circlePrimitive);
				if (result == null) result = caseClipRepresentationTypes(circlePrimitive);
				if (result == null) result = caseRepresentationTypes(circlePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLIP_PATH_PRIMITIVE: {
				ClipPathPrimitive clipPathPrimitive = (ClipPathPrimitive)theEObject;
				T result = caseClipPathPrimitive(clipPathPrimitive);
				if (result == null) result = caseRepresentationTypes(clipPathPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLOCK_TYPE: {
				ClockType clockType = (ClockType)theEObject;
				T result = caseClockType(clockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.COMPONENT_DEFINITION_TYPE: {
				ComponentDefinitionType componentDefinitionType = (ComponentDefinitionType)theEObject;
				T result = caseComponentDefinitionType(componentDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CROWN_COMPONENT: {
				CrownComponent crownComponent = (CrownComponent)theEObject;
				T result = caseCrownComponent(crownComponent);
				if (result == null) result = caseRepresentationTypes(crownComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_INTEGER_TYPE_ELEMENT_TYPE: {
				CustomIntegerTypeElementType customIntegerTypeElementType = (CustomIntegerTypeElementType)theEObject;
				T result = caseCustomIntegerTypeElementType(customIntegerTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_REAL_TYPE_ELEMENT_TYPE: {
				CustomRealTypeElementType customRealTypeElementType = (CustomRealTypeElementType)theEObject;
				T result = caseCustomRealTypeElementType(customRealTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE: {
				CustomStringTypeElementType customStringTypeElementType = (CustomStringTypeElementType)theEObject;
				T result = caseCustomStringTypeElementType(customStringTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ELLIPSE_PRIMITIVE: {
				EllipsePrimitive ellipsePrimitive = (EllipsePrimitive)theEObject;
				T result = caseEllipsePrimitive(ellipsePrimitive);
				if (result == null) result = caseClipRepresentationTypes(ellipsePrimitive);
				if (result == null) result = caseRepresentationTypes(ellipsePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.GESTURE_AREA_PRIMITIVE: {
				GestureAreaPrimitive gestureAreaPrimitive = (GestureAreaPrimitive)theEObject;
				T result = caseGestureAreaPrimitive(gestureAreaPrimitive);
				if (result == null) result = caseRepresentationTypes(gestureAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.GROUP_PRIMITIVE: {
				GroupPrimitive groupPrimitive = (GroupPrimitive)theEObject;
				T result = caseGroupPrimitive(groupPrimitive);
				if (result == null) result = caseRepresentationTypes(groupPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.IMAGE_PRIMITIVE: {
				ImagePrimitive imagePrimitive = (ImagePrimitive)theEObject;
				T result = caseImagePrimitive(imagePrimitive);
				if (result == null) result = caseRepresentationTypes(imagePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.INTERFACE_TYPE: {
				InterfaceType interfaceType = (InterfaceType)theEObject;
				T result = caseInterfaceType(interfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE: {
				KeyboardInputPrimitive keyboardInputPrimitive = (KeyboardInputPrimitive)theEObject;
				T result = caseKeyboardInputPrimitive(keyboardInputPrimitive);
				if (result == null) result = caseRepresentationTypes(keyboardInputPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.LINE_PRIMITIVE: {
				LinePrimitive linePrimitive = (LinePrimitive)theEObject;
				T result = caseLinePrimitive(linePrimitive);
				if (result == null) result = caseClipRepresentationTypes(linePrimitive);
				if (result == null) result = caseRepresentationTypes(linePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PATH_PRIMITIVE: {
				PathPrimitive pathPrimitive = (PathPrimitive)theEObject;
				T result = casePathPrimitive(pathPrimitive);
				if (result == null) result = caseClipRepresentationTypes(pathPrimitive);
				if (result == null) result = caseRepresentationTypes(pathPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POINTER_AREA_PRIMITIVE: {
				PointerAreaPrimitive pointerAreaPrimitive = (PointerAreaPrimitive)theEObject;
				T result = casePointerAreaPrimitive(pointerAreaPrimitive);
				if (result == null) result = caseRepresentationTypes(pointerAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLAR_LINE_COMPONENT: {
				PolarLineComponent polarLineComponent = (PolarLineComponent)theEObject;
				T result = casePolarLineComponent(polarLineComponent);
				if (result == null) result = caseRepresentationTypes(polarLineComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLYGON_PRIMITIVE: {
				PolygonPrimitive polygonPrimitive = (PolygonPrimitive)theEObject;
				T result = casePolygonPrimitive(polygonPrimitive);
				if (result == null) result = caseRepresentationTypes(polygonPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLYLINE_PRIMITIVE: {
				PolylinePrimitive polylinePrimitive = (PolylinePrimitive)theEObject;
				T result = casePolylinePrimitive(polylinePrimitive);
				if (result == null) result = caseRepresentationTypes(polylinePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RECT_PRIMITIVE: {
				RectPrimitive rectPrimitive = (RectPrimitive)theEObject;
				T result = caseRectPrimitive(rectPrimitive);
				if (result == null) result = caseClipRepresentationTypes(rectPrimitive);
				if (result == null) result = caseRepresentationTypes(rectPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.REPRESENTATION_TYPE: {
				RepresentationType representationType = (RepresentationType)theEObject;
				T result = caseRepresentationType(representationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE: {
				ScrollWheelAreaPrimitive scrollWheelAreaPrimitive = (ScrollWheelAreaPrimitive)theEObject;
				T result = caseScrollWheelAreaPrimitive(scrollWheelAreaPrimitive);
				if (result == null) result = caseRepresentationTypes(scrollWheelAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TEXT_PRIMITIVE: {
				TextPrimitive textPrimitive = (TextPrimitive)theEObject;
				T result = caseTextPrimitive(textPrimitive);
				if (result == null) result = caseRepresentationTypes(textPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TOUCH_AREA_PRIMITIVE: {
				TouchAreaPrimitive touchAreaPrimitive = (TouchAreaPrimitive)theEObject;
				T result = caseTouchAreaPrimitive(touchAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.REPRESENTATION_TYPES: {
				RepresentationTypes representationTypes = (RepresentationTypes)theEObject;
				T result = caseRepresentationTypes(representationTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLIP_REPRESENTATION_TYPES: {
				ClipRepresentationTypes clipRepresentationTypes = (ClipRepresentationTypes)theEObject;
				T result = caseClipRepresentationTypes(clipRepresentationTypes);
				if (result == null) result = caseRepresentationTypes(clipRepresentationTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				T result = casePropertyValue(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.WIDGET_COMPOSITION: {
				WidgetComposition widgetComposition = (WidgetComposition)theEObject;
				T result = caseWidgetComposition(widgetComposition);
				if (result == null) result = caseRepresentationTypes(widgetComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcComponent(ArcComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorType(BehaviorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPrimitive(ChildPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCirclePrimitive(CirclePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipPathPrimitive(ClipPathPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockType(ClockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinitionType(ComponentDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crown Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crown Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrownComponent(CrownComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Integer Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Integer Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomIntegerTypeElementType(CustomIntegerTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Real Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Real Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRealTypeElementType(CustomRealTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom String Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom String Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomStringTypeElementType(CustomStringTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsePrimitive(EllipsePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesture Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesture Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestureAreaPrimitive(GestureAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupPrimitive(GroupPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagePrimitive(ImagePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceType(InterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyboard Input Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyboard Input Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyboardInputPrimitive(KeyboardInputPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePrimitive(LinePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathPrimitive(PathPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerAreaPrimitive(PointerAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polar Line Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polar Line Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolarLineComponent(PolarLineComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonPrimitive(PolygonPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylinePrimitive(PolylinePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectPrimitive(RectPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationType(RepresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Wheel Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Wheel Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollWheelAreaPrimitive(ScrollWheelAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPrimitive(TextPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchAreaPrimitive(TouchAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationTypes(RepresentationTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Representation Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Representation Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipRepresentationTypes(ClipRepresentationTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValue(PropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetComposition(WidgetComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Part2Switch
