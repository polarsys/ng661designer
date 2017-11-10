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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.ng661designer.dsl.part2.gen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.ng661.part2.Part2Package
 * @generated
 */
public class Part2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Part2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Part2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Part2Switch<Adapter> modelSwitch =
		new Part2Switch<Adapter>() {
			@Override
			public Adapter caseArcComponent(ArcComponent object) {
				return createArcComponentAdapter();
			}
			@Override
			public Adapter caseBehaviorType(BehaviorType object) {
				return createBehaviorTypeAdapter();
			}
			@Override
			public Adapter caseChildPrimitive(ChildPrimitive object) {
				return createChildPrimitiveAdapter();
			}
			@Override
			public Adapter caseCirclePrimitive(CirclePrimitive object) {
				return createCirclePrimitiveAdapter();
			}
			@Override
			public Adapter caseClipPathPrimitive(ClipPathPrimitive object) {
				return createClipPathPrimitiveAdapter();
			}
			@Override
			public Adapter caseClockType(ClockType object) {
				return createClockTypeAdapter();
			}
			@Override
			public Adapter caseComponentDefinitionType(ComponentDefinitionType object) {
				return createComponentDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseCrownComponent(CrownComponent object) {
				return createCrownComponentAdapter();
			}
			@Override
			public Adapter caseCustomIntegerTypeElementType(CustomIntegerTypeElementType object) {
				return createCustomIntegerTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseCustomRealTypeElementType(CustomRealTypeElementType object) {
				return createCustomRealTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseCustomStringTypeElementType(CustomStringTypeElementType object) {
				return createCustomStringTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEllipsePrimitive(EllipsePrimitive object) {
				return createEllipsePrimitiveAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGestureAreaPrimitive(GestureAreaPrimitive object) {
				return createGestureAreaPrimitiveAdapter();
			}
			@Override
			public Adapter caseGroupPrimitive(GroupPrimitive object) {
				return createGroupPrimitiveAdapter();
			}
			@Override
			public Adapter caseImagePrimitive(ImagePrimitive object) {
				return createImagePrimitiveAdapter();
			}
			@Override
			public Adapter caseImportType(ImportType object) {
				return createImportTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseKeyboardInputPrimitive(KeyboardInputPrimitive object) {
				return createKeyboardInputPrimitiveAdapter();
			}
			@Override
			public Adapter caseLinePrimitive(LinePrimitive object) {
				return createLinePrimitiveAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePathPrimitive(PathPrimitive object) {
				return createPathPrimitiveAdapter();
			}
			@Override
			public Adapter casePointerAreaPrimitive(PointerAreaPrimitive object) {
				return createPointerAreaPrimitiveAdapter();
			}
			@Override
			public Adapter casePolarLineComponent(PolarLineComponent object) {
				return createPolarLineComponentAdapter();
			}
			@Override
			public Adapter casePolygonPrimitive(PolygonPrimitive object) {
				return createPolygonPrimitiveAdapter();
			}
			@Override
			public Adapter casePolylinePrimitive(PolylinePrimitive object) {
				return createPolylinePrimitiveAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRectPrimitive(RectPrimitive object) {
				return createRectPrimitiveAdapter();
			}
			@Override
			public Adapter caseRepresentationType(RepresentationType object) {
				return createRepresentationTypeAdapter();
			}
			@Override
			public Adapter caseScrollWheelAreaPrimitive(ScrollWheelAreaPrimitive object) {
				return createScrollWheelAreaPrimitiveAdapter();
			}
			@Override
			public Adapter caseTextPrimitive(TextPrimitive object) {
				return createTextPrimitiveAdapter();
			}
			@Override
			public Adapter caseTouchAreaPrimitive(TouchAreaPrimitive object) {
				return createTouchAreaPrimitiveAdapter();
			}
			@Override
			public Adapter caseRepresentationTypes(RepresentationTypes object) {
				return createRepresentationTypesAdapter();
			}
			@Override
			public Adapter caseClipRepresentationTypes(ClipRepresentationTypes object) {
				return createClipRepresentationTypesAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseWidgetComposition(WidgetComposition object) {
				return createWidgetCompositionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ArcComponent <em>Arc Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ArcComponent
	 * @generated
	 */
	public Adapter createArcComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.BehaviorType
	 * @generated
	 */
	public Adapter createBehaviorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ChildPrimitive <em>Child Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ChildPrimitive
	 * @generated
	 */
	public Adapter createChildPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.CirclePrimitive <em>Circle Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.CirclePrimitive
	 * @generated
	 */
	public Adapter createCirclePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ClipPathPrimitive <em>Clip Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ClipPathPrimitive
	 * @generated
	 */
	public Adapter createClipPathPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ClockType
	 * @generated
	 */
	public Adapter createClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ComponentDefinitionType <em>Component Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ComponentDefinitionType
	 * @generated
	 */
	public Adapter createComponentDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.CrownComponent <em>Crown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.CrownComponent
	 * @generated
	 */
	public Adapter createCrownComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.CustomIntegerTypeElementType <em>Custom Integer Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType
	 * @generated
	 */
	public Adapter createCustomIntegerTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.CustomRealTypeElementType <em>Custom Real Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.CustomRealTypeElementType
	 * @generated
	 */
	public Adapter createCustomRealTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.CustomStringTypeElementType <em>Custom String Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.CustomStringTypeElementType
	 * @generated
	 */
	public Adapter createCustomStringTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.EllipsePrimitive <em>Ellipse Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.EllipsePrimitive
	 * @generated
	 */
	public Adapter createEllipsePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.GestureAreaPrimitive <em>Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.GestureAreaPrimitive
	 * @generated
	 */
	public Adapter createGestureAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.GroupPrimitive <em>Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.GroupPrimitive
	 * @generated
	 */
	public Adapter createGroupPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ImagePrimitive <em>Image Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ImagePrimitive
	 * @generated
	 */
	public Adapter createImagePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ImportType
	 * @generated
	 */
	public Adapter createImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.KeyboardInputPrimitive <em>Keyboard Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.KeyboardInputPrimitive
	 * @generated
	 */
	public Adapter createKeyboardInputPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.LinePrimitive <em>Line Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.LinePrimitive
	 * @generated
	 */
	public Adapter createLinePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PathPrimitive <em>Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PathPrimitive
	 * @generated
	 */
	public Adapter createPathPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PointerAreaPrimitive <em>Pointer Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PointerAreaPrimitive
	 * @generated
	 */
	public Adapter createPointerAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PolarLineComponent <em>Polar Line Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PolarLineComponent
	 * @generated
	 */
	public Adapter createPolarLineComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PolygonPrimitive <em>Polygon Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PolygonPrimitive
	 * @generated
	 */
	public Adapter createPolygonPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PolylinePrimitive <em>Polyline Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PolylinePrimitive
	 * @generated
	 */
	public Adapter createPolylinePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.RectPrimitive <em>Rect Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.RectPrimitive
	 * @generated
	 */
	public Adapter createRectPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.RepresentationType <em>Representation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.RepresentationType
	 * @generated
	 */
	public Adapter createRepresentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive <em>Scroll Wheel Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive
	 * @generated
	 */
	public Adapter createScrollWheelAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.TextPrimitive <em>Text Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.TextPrimitive
	 * @generated
	 */
	public Adapter createTextPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.TouchAreaPrimitive <em>Touch Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.TouchAreaPrimitive
	 * @generated
	 */
	public Adapter createTouchAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.RepresentationTypes <em>Representation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.RepresentationTypes
	 * @generated
	 */
	public Adapter createRepresentationTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.ClipRepresentationTypes <em>Clip Representation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.ClipRepresentationTypes
	 * @generated
	 */
	public Adapter createClipRepresentationTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.ng661.part2.WidgetComposition <em>Widget Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.ng661.part2.WidgetComposition
	 * @generated
	 */
	public Adapter createWidgetCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Part2AdapterFactory
