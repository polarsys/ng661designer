/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Open points:
 * 	1. base component definition (with default 'id' attribute)
 * 	2. how this base definition works from an interface, representation and behavior point of view
 * 
 * 			This Schema defines the build-in types for ARINC 661 Part 2
 * 		
 * This schema defines the Interface sub-section of A661 Part 2 language.
 * This schema defines the Representation sub-section of A661 Part 2 language.
 * This schema defines the Behavior sub-section of A661 Part 2 language.
 * <!-- end-model-doc -->
 * @see org.example.ng661.part2.Part2Factory
 * @model kind="package"
 * @generated
 */
public interface Part2Package extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "part2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/NG661Part2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Part2Package eINSTANCE = org.polarsys.ng661designer.dsl.part2.gen.impl.Part2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.RepresentationTypesImpl <em>Representation Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.RepresentationTypesImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getRepresentationTypes()
	 * @generated
	 */
	int REPRESENTATION_TYPES = 34;

	/**
	 * The number of structural features of the '<em>Representation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Representation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ArcComponentImpl <em>Arc Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ArcComponentImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getArcComponent()
	 * @generated
	 */
	int ARC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__ANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inbound Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__INBOUND_ANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__RADIUS = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__X = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Arc Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Arc Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.BehaviorTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Behavior Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__BEHAVIOR_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Scxml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__SCXML = 1;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__CLOCK = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__ANY = 4;

	/**
	 * The number of structural features of the '<em>Behavior Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Behavior Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ChildPrimitiveImpl <em>Child Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ChildPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getChildPrimitive()
	 * @generated
	 */
	int CHILD_PRIMITIVE = 2;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Number Of Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__MAX_NUMBER_OF_CHILDREN = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Child Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Child Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ClipRepresentationTypesImpl <em>Clip Representation Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ClipRepresentationTypesImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getClipRepresentationTypes()
	 * @generated
	 */
	int CLIP_REPRESENTATION_TYPES = 35;

	/**
	 * The number of structural features of the '<em>Clip Representation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_REPRESENTATION_TYPES_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clip Representation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_REPRESENTATION_TYPES_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.CirclePrimitiveImpl <em>Circle Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.CirclePrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getCirclePrimitive()
	 * @generated
	 */
	int CIRCLE_PRIMITIVE = 3;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CHILD_ELEMENTS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__GROUP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CHILDREN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__RECTANGLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CIRCLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ELLIPSE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLYLINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLYGON = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__IMAGE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__TEXT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ARC = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CROWN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLAR_LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POINTER_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__TOUCH_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__GESTURE_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__SCROLL_WHEEL_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__KEYBOARD_INPUT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__COMPOSITIONS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CLIP_PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CLIP_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CX = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__DRAWING_PRIORITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ID = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__R = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_DASHARRAY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_LINECAP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_LINEJOIN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKEWIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__TRANSFORM = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__VISIBILITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Circle Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE_FEATURE_COUNT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 41;

	/**
	 * The number of operations of the '<em>Circle Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE_OPERATION_COUNT = CLIP_REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl <em>Clip Path Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ClipPathPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getClipPathPrimitive()
	 * @generated
	 */
	int CLIP_PATH_PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__GROUP = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__RECTANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__CIRCLE = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__ELLIPSE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clip Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Clip Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ClockTypeImpl <em>Clock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ClockTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ComponentDefinitionTypeImpl <em>Component Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ComponentDefinitionTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getComponentDefinitionType()
	 * @generated
	 */
	int COMPONENT_DEFINITION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Component Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.CrownComponentImpl <em>Crown Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.CrownComponentImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getCrownComponent()
	 * @generated
	 */
	int CROWN_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__INNER_RADIUS = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outer Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__OUTER_RADIUS = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__X = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Crown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Crown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.CustomIntegerTypeElementTypeImpl <em>Custom Integer Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.CustomIntegerTypeElementTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getCustomIntegerTypeElementType()
	 * @generated
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__RESOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Custom Integer Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Custom Integer Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.CustomRealTypeElementTypeImpl <em>Custom Real Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.CustomRealTypeElementTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getCustomRealTypeElementType()
	 * @generated
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__RESOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Custom Real Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Custom Real Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl <em>Custom String Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getCustomStringTypeElementType()
	 * @generated
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Custom String Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Custom String Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.DocumentRootImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_DEFINITION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.EllipsePrimitiveImpl <em>Ellipse Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.EllipsePrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getEllipsePrimitive()
	 * @generated
	 */
	int ELLIPSE_PRIMITIVE = 12;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CHILD_ELEMENTS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__GROUP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CHILDREN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RECTANGLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CIRCLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ELLIPSE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLYLINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLYGON = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__IMAGE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__TEXT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ARC = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CROWN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLAR_LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POINTER_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__TOUCH_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__GESTURE_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__SCROLL_WHEEL_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__KEYBOARD_INPUT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__COMPOSITIONS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CLIP_PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CLIP_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CX = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__DRAWING_PRIORITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ID = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RX = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_DASHARRAY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_LINECAP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_LINEJOIN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKEWIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__TRANSFORM = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__VISIBILITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 41;

	/**
	 * The number of structural features of the '<em>Ellipse Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE_FEATURE_COUNT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 42;

	/**
	 * The number of operations of the '<em>Ellipse Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE_OPERATION_COUNT = CLIP_REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.EventTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.FunctionTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.GestureAreaPrimitiveImpl <em>Gesture Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.GestureAreaPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getGestureAreaPrimitive()
	 * @generated
	 */
	int GESTURE_AREA_PRIMITIVE = 15;

	/**
	 * The feature id for the '<em><b>Accepted Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ACCEPTED_GESTURE = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ENABLED = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__HEIGHT = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__WIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__X = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.GroupPrimitiveImpl <em>Group Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.GroupPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getGroupPrimitive()
	 * @generated
	 */
	int GROUP_PRIMITIVE = 16;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CHILD_ELEMENTS = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__GROUP = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CHILDREN = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__RECTANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CIRCLE = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ELLIPSE = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLYLINE = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLYGON = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__IMAGE = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TEXT = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ARC = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CROWN = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLAR_LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POINTER_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TOUCH_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__GESTURE_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__SCROLL_WHEEL_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__KEYBOARD_INPUT = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__COMPOSITIONS = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ImagePrimitiveImpl <em>Image Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ImagePrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getImagePrimitive()
	 * @generated
	 */
	int IMAGE_PRIMITIVE = 17;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CHILD_ELEMENTS = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__GROUP = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CHILDREN = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__RECTANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CIRCLE = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ELLIPSE = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLYLINE = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLYGON = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__IMAGE = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__TEXT = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ARC = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CROWN = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLAR_LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POINTER_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__TOUCH_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__GESTURE_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__KEYBOARD_INPUT = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__COMPOSITIONS = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ALIGNMENT = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ASPECT_RATIO = REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__HEIGHT = REPRESENTATION_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SOURCE = REPRESENTATION_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__WIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__X = REPRESENTATION_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Image Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 34;

	/**
	 * The number of operations of the '<em>Image Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ImportTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__FILE = 0;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.InterfaceTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.KeyboardInputPrimitiveImpl <em>Keyboard Input Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.KeyboardInputPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getKeyboardInputPrimitive()
	 * @generated
	 */
	int KEYBOARD_INPUT_PRIMITIVE = 20;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__ENABLED = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Keyboard Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Keyboard Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.LinePrimitiveImpl <em>Line Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.LinePrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getLinePrimitive()
	 * @generated
	 */
	int LINE_PRIMITIVE = 21;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__DRAWING_PRIORITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__ID = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_DASHARRAY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_LINECAP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_LINEJOIN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKEWIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__TRANSFORM = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__VISIBILITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__X1 = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__X2 = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__Y1 = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__Y2 = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Line Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE_FEATURE_COUNT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Line Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE_OPERATION_COUNT = CLIP_REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ParamTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__MODALITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PathPrimitiveImpl <em>Path Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PathPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPathPrimitive()
	 * @generated
	 */
	int PATH_PRIMITIVE = 23;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__CLIP_PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__CLIP_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__D = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__DRAWING_PRIORITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__ID = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_DASHARRAY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_DASHOFFSET = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_LINECAP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_LINEJOIN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_MITERLIMIT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKEWIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__TRANSFORM = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__VISIBILITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE_FEATURE_COUNT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE_OPERATION_COUNT = CLIP_REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl <em>Pointer Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PointerAreaPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPointerAreaPrimitive()
	 * @generated
	 */
	int POINTER_AREA_PRIMITIVE = 24;

	/**
	 * The feature id for the '<em><b>Accepted Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ENABLED = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__HEIGHT = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pass Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__PASS_THROUGH = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Prevent Stealing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__PREVENT_STEALING = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__WIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__X = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Pointer Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Pointer Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PolarLineComponentImpl <em>Polar Line Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PolarLineComponentImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPolarLineComponent()
	 * @generated
	 */
	int POLAR_LINE_COMPONENT = 25;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__ANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__R = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__X1 = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__Y1 = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Polar Line Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Polar Line Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PolygonPrimitiveImpl <em>Polygon Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PolygonPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPolygonPrimitive()
	 * @generated
	 */
	int POLYGON_PRIMITIVE = 26;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__POINTS = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Polygon Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Polygon Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PolylinePrimitiveImpl <em>Polyline Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PolylinePrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPolylinePrimitive()
	 * @generated
	 */
	int POLYLINE_PRIMITIVE = 27;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__POINTS = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Polyline Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Polyline Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PropertyTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__MAX_STRING_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__MODALITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.RectPrimitiveImpl <em>Rect Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.RectPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getRectPrimitive()
	 * @generated
	 */
	int RECT_PRIMITIVE = 29;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CHILD_ELEMENTS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__GROUP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CHILDREN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RECTANGLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CIRCLE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ELLIPSE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLYLINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLYGON = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__IMAGE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__TEXT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ARC = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CROWN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLAR_LINE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POINTER_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__TOUCH_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__GESTURE_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__SCROLL_WHEEL_AREA = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__KEYBOARD_INPUT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__COMPOSITIONS = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CLIP_PATH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CLIP_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__DRAWING_PRIORITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL_RULE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__HEIGHT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ID = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RX = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_DASHARRAY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_DASHOFFSET = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_LINECAP = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_LINEJOIN = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_MITERLIMIT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_OPACITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKEWIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__TRANSFORM = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__VISIBILITY = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__WIDTH = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__X = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__Y = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 43;

	/**
	 * The number of structural features of the '<em>Rect Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE_FEATURE_COUNT = CLIP_REPRESENTATION_TYPES_FEATURE_COUNT + 44;

	/**
	 * The number of operations of the '<em>Rect Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE_OPERATION_COUNT = CLIP_REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.RepresentationTypeImpl <em>Representation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.RepresentationTypeImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getRepresentationType()
	 * @generated
	 */
	int REPRESENTATION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__GROUP1 = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__RECTANGLE = 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__CIRCLE = 4;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__ELLIPSE = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__LINE = 6;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__POLYLINE = 7;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__POLYGON = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__PATH = 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__TEXT = 11;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__ARC = 12;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__CROWN = 13;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__POLAR_LINE = 14;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__POINTER_AREA = 15;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__TOUCH_AREA = 16;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__GESTURE_AREA = 17;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__SCROLL_WHEEL_AREA = 18;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__KEYBOARD_INPUT = 19;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__CLIP_PATH = 20;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE__COMPOSITIONS = 21;

	/**
	 * The number of structural features of the '<em>Representation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Representation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl <em>Scroll Wheel Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getScrollWheelAreaPrimitive()
	 * @generated
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE = 31;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__X = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Scroll Wheel Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Scroll Wheel Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_AREA_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.TextPrimitiveImpl <em>Text Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.TextPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTextPrimitive()
	 * @generated
	 */
	int TEXT_PRIMITIVE = 32;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__DRAWING_PRIORITY = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FILL = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FILL_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FILL_RULE = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_FAMILY = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_SIZE = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_STRETCH = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_STYLE = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_VARIANT = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__FONT_WEIGHT = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__ID = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_DASHARRAY = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_DASHOFFSET = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_LINECAP = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_LINEJOIN = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_MITERLIMIT = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKE_OPACITY = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__STROKEWIDTH = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__TRANSFORM = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__VALUE = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__VISIBILITY = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__X = REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE__Y = REPRESENTATION_TYPES_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Text Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Text Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PRIMITIVE_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.TouchAreaPrimitiveImpl <em>Touch Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.TouchAreaPrimitiveImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTouchAreaPrimitive()
	 * @generated
	 */
	int TOUCH_AREA_PRIMITIVE = 33;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__CLIP_PATH = 0;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__CLIP_RULE = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__ID = 4;

	/**
	 * The feature id for the '<em><b>Maximum Touch Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS = 5;

	/**
	 * The feature id for the '<em><b>Minimum Touch Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS = 6;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__TRANSFORM = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__WIDTH = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__X = 9;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__Y = 10;

	/**
	 * The number of structural features of the '<em>Touch Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Touch Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.PropertyValueImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.impl.WidgetCompositionImpl <em>Widget Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.WidgetCompositionImpl
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getWidgetComposition()
	 * @generated
	 */
	int WIDGET_COMPOSITION = 37;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__REPRESENTATION = REPRESENTATION_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__VALUES = REPRESENTATION_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CHILD_ELEMENTS = REPRESENTATION_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__GROUP = REPRESENTATION_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CHILDREN = REPRESENTATION_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__RECTANGLE = REPRESENTATION_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CIRCLE = REPRESENTATION_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__ELLIPSE = REPRESENTATION_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLYLINE = REPRESENTATION_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLYGON = REPRESENTATION_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__PATH = REPRESENTATION_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__IMAGE = REPRESENTATION_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__TEXT = REPRESENTATION_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__ARC = REPRESENTATION_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CROWN = REPRESENTATION_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLAR_LINE = REPRESENTATION_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POINTER_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__TOUCH_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__GESTURE_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__SCROLL_WHEEL_AREA = REPRESENTATION_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__KEYBOARD_INPUT = REPRESENTATION_TYPES_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Widget Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION_FEATURE_COUNT = REPRESENTATION_TYPES_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Widget Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION_OPERATION_COUNT = REPRESENTATION_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.AlignementTypeVal <em>Alignement Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.AlignementTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAlignementTypeVal()
	 * @generated
	 */
	int ALIGNEMENT_TYPE_VAL = 38;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.AspectRatioTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAspectRatioTypeVal()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE_VAL = 39;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.BooleanTypeVal <em>Boolean Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.BooleanTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getBooleanTypeVal()
	 * @generated
	 */
	int BOOLEAN_TYPE_VAL = 40;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.ColorReferenceType <em>Color Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ColorReferenceType
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorReferenceType()
	 * @generated
	 */
	int COLOR_REFERENCE_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.FillRuleTypeVal <em>Fill Rule Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.FillRuleTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFillRuleTypeVal()
	 * @generated
	 */
	int FILL_RULE_TYPE_VAL = 42;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.ModalityType <em>Modality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ModalityType
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getModalityType()
	 * @generated
	 */
	int MODALITY_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.ModalityType1 <em>Modality Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ModalityType1
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getModalityType1()
	 * @generated
	 */
	int MODALITY_TYPE1 = 44;

	/**
	 * The meta object id for the '{@link org.example.ng661.part2.VisibilityTypeVal <em>Visibility Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.VisibilityTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getVisibilityTypeVal()
	 * @generated
	 */
	int VISIBILITY_TYPE_VAL = 45;

	/**
	 * The meta object id for the '<em>Alignement Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAlignementType()
	 * @generated
	 */
	int ALIGNEMENT_TYPE = 46;

	/**
	 * The meta object id for the '<em>Alignement Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.AlignementTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAlignementTypeValObject()
	 * @generated
	 */
	int ALIGNEMENT_TYPE_VAL_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Angle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAngleType()
	 * @generated
	 */
	int ANGLE_TYPE = 48;

	/**
	 * The meta object id for the '<em>Angle Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAngleTypeVal()
	 * @generated
	 */
	int ANGLE_TYPE_VAL = 49;

	/**
	 * The meta object id for the '<em>Angle Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAngleTypeValObject()
	 * @generated
	 */
	int ANGLE_TYPE_VAL_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Aspect Ratio Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAspectRatioType()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE = 51;

	/**
	 * The meta object id for the '<em>Aspect Ratio Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.AspectRatioTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getAspectRatioTypeValObject()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE_VAL_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Boolean Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 53;

	/**
	 * The meta object id for the '<em>Boolean Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.BooleanTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getBooleanTypeValObject()
	 * @generated
	 */
	int BOOLEAN_TYPE_VAL_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Color Reference Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ColorReferenceType
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorReferenceTypeObject()
	 * @generated
	 */
	int COLOR_REFERENCE_TYPE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Color RGBHEX Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorRGBHEXType()
	 * @generated
	 */
	int COLOR_RGBHEX_TYPE = 56;

	/**
	 * The meta object id for the '<em>Color RGB Rgb255 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorRGBRgb255Type()
	 * @generated
	 */
	int COLOR_RGB_RGB255_TYPE = 57;

	/**
	 * The meta object id for the '<em>Color RGB Rgb Percent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorRGBRgbPercentType()
	 * @generated
	 */
	int COLOR_RGB_RGB_PERCENT_TYPE = 58;

	/**
	 * The meta object id for the '<em>Color RGB Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorRGBType()
	 * @generated
	 */
	int COLOR_RGB_TYPE = 59;

	/**
	 * The meta object id for the '<em>Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 60;

	/**
	 * The meta object id for the '<em>Date Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 61;

	/**
	 * The meta object id for the '<em>Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 62;

	/**
	 * The meta object id for the '<em>Distance Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getDistanceType()
	 * @generated
	 */
	int DISTANCE_TYPE = 63;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 64;

	/**
	 * The meta object id for the '<em>Fill Rule Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFillRuleType()
	 * @generated
	 */
	int FILL_RULE_TYPE = 65;

	/**
	 * The meta object id for the '<em>Fill Rule Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.FillRuleTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFillRuleTypeValObject()
	 * @generated
	 */
	int FILL_RULE_TYPE_VAL_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Font Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFontType()
	 * @generated
	 */
	int FONT_TYPE = 67;

	/**
	 * The meta object id for the '<em>Format String Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFormatStringType()
	 * @generated
	 */
	int FORMAT_STRING_TYPE = 68;

	/**
	 * The meta object id for the '<em>Format String Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFormatStringTypeVal()
	 * @generated
	 */
	int FORMAT_STRING_TYPE_VAL = 69;

	/**
	 * The meta object id for the '<em>Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFrequencyType()
	 * @generated
	 */
	int FREQUENCY_TYPE = 70;

	/**
	 * The meta object id for the '<em>Frequency Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFrequencyTypeVal()
	 * @generated
	 */
	int FREQUENCY_TYPE_VAL = 71;

	/**
	 * The meta object id for the '<em>Frequency Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getFrequencyTypeValObject()
	 * @generated
	 */
	int FREQUENCY_TYPE_VAL_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Image Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 73;

	/**
	 * The meta object id for the '<em>Integer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 74;

	/**
	 * The meta object id for the '<em>Modality Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ModalityType
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getModalityTypeObject()
	 * @generated
	 */
	int MODALITY_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Modality Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.ModalityType1
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getModalityTypeObject1()
	 * @generated
	 */
	int MODALITY_TYPE_OBJECT1 = 76;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 77;

	/**
	 * The meta object id for the '<em>Opacity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getOpacityType()
	 * @generated
	 */
	int OPACITY_TYPE = 78;

	/**
	 * The meta object id for the '<em>Opacity Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getOpacityTypeVal()
	 * @generated
	 */
	int OPACITY_TYPE_VAL = 79;

	/**
	 * The meta object id for the '<em>Opacity Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getOpacityTypeValObject()
	 * @generated
	 */
	int OPACITY_TYPE_VAL_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Position Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 81;

	/**
	 * The meta object id for the '<em>Real Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 82;

	/**
	 * The meta object id for the '<em>Stipple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getStippleType()
	 * @generated
	 */
	int STIPPLE_TYPE = 83;

	/**
	 * The meta object id for the '<em>String Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 84;

	/**
	 * The meta object id for the '<em>Time Defaultmilliseconds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTimeDefaultmillisecondsType()
	 * @generated
	 */
	int TIME_DEFAULTMILLISECONDS_TYPE = 85;

	/**
	 * The meta object id for the '<em>Time Hours Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTimeHoursType()
	 * @generated
	 */
	int TIME_HOURS_TYPE = 86;

	/**
	 * The meta object id for the '<em>Time Minutes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTimeMinutesType()
	 * @generated
	 */
	int TIME_MINUTES_TYPE = 87;

	/**
	 * The meta object id for the '<em>Time Seconds Or Subseconds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTimeSecondsOrSubsecondsType()
	 * @generated
	 */
	int TIME_SECONDS_OR_SUBSECONDS_TYPE = 88;

	/**
	 * The meta object id for the '<em>Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 89;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 90;

	/**
	 * The meta object id for the '<em>Velocity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getVelocityType()
	 * @generated
	 */
	int VELOCITY_TYPE = 91;

	/**
	 * The meta object id for the '<em>Velocity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getVelocityTypeObject()
	 * @generated
	 */
	int VELOCITY_TYPE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Visibility Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 93;

	/**
	 * The meta object id for the '<em>Visibility Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.ng661.part2.VisibilityTypeVal
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getVisibilityTypeValObject()
	 * @generated
	 */
	int VISIBILITY_TYPE_VAL_OBJECT = 94;

	/**
	 * The meta object id for the '<em>ZIndex Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getZIndexType()
	 * @generated
	 */
	int ZINDEX_TYPE = 95;

	/**
	 * The meta object id for the '<em>ZIndex Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.example.ng661.part2.impl.Part2PackageImpl#getZIndexTypeVal()
	 * @generated
	 */
	int ZINDEX_TYPE_VAL = 96;


	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ArcComponent <em>Arc Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Component</em>'.
	 * @see org.example.ng661.part2.ArcComponent
	 * @generated
	 */
	EClass getArcComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getAngle()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getClipPath()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getClipRule()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getDrawingPriority()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getFill()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getFillOpacity()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getFillRule()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getId()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getInboundAngle <em>Inbound Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inbound Angle</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getInboundAngle()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_InboundAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getRadius()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStroke()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeDasharray()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeDashoffset()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeLinecap()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeLinejoin()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeMiterlimit()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokeOpacity()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getStrokewidth()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getTransform()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getVisibility()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getX()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ArcComponent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.ArcComponent#getY()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Type</em>'.
	 * @see org.example.ng661.part2.BehaviorType
	 * @generated
	 */
	EClass getBehaviorType();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.BehaviorType#getBehaviorGroup <em>Behavior Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Behavior Group</em>'.
	 * @see org.example.ng661.part2.BehaviorType#getBehaviorGroup()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EAttribute getBehaviorType_BehaviorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.BehaviorType#getScxml <em>Scxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scxml</em>'.
	 * @see org.example.ng661.part2.BehaviorType#getScxml()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Scxml();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.BehaviorType#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock</em>'.
	 * @see org.example.ng661.part2.BehaviorType#getClock()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Clock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.BehaviorType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see org.example.ng661.part2.BehaviorType#getFunction()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.BehaviorType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.example.ng661.part2.BehaviorType#getAny()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EAttribute getBehaviorType_Any();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ChildPrimitive <em>Child Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Primitive</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive
	 * @generated
	 */
	EClass getChildPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getDrawingPriority()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getId()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren <em>Max Number Of Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Children</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_MaxNumberOfChildren();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getPriority()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getTransform()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ChildPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.ChildPrimitive#getVisibility()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.CirclePrimitive <em>Circle Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle Primitive</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive
	 * @generated
	 */
	EClass getCirclePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.CirclePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getChildElements()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getGroup()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getChildren()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getRectangle()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getCircle()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getEllipse()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getLine()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getPolyline()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getPolygon()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getPath()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getImage()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getText()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getArc()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getCrown()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getPolarLine()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getPointerArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getTouchArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getGestureArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getScrollWheelArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getKeyboardInput()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.CirclePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getCompositions()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getClipPath()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getClipRule()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getCx()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getCy()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getDrawingPriority()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getFill()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getFillOpacity()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getFillRule()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getId()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getR()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_R();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStroke()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeDasharray()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeDashoffset()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeLinecap()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeLinejoin()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeMiterlimit()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokeOpacity()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getStrokewidth()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getTransform()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CirclePrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.CirclePrimitive#getVisibility()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ClipPathPrimitive <em>Clip Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path Primitive</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive
	 * @generated
	 */
	EClass getClipPathPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getGroup()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getRectangle()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getCircle()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getEllipse()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getLine()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ClipPathPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.ClipPathPrimitive#getPath()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Path();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type</em>'.
	 * @see org.example.ng661.part2.ClockType
	 * @generated
	 */
	EClass getClockType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ClockType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.ClockType#getId()
	 * @see #getClockType()
	 * @generated
	 */
	EAttribute getClockType_Id();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ComponentDefinitionType <em>Component Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Type</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType
	 * @generated
	 */
	EClass getComponentDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.ComponentDefinitionType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType#getImport()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.ng661.part2.ComponentDefinitionType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType#getInterface()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.ng661.part2.ComponentDefinitionType#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType#getRepresentation()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Representation();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.ng661.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType#getBehavior()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ComponentDefinitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.ComponentDefinitionType#getName()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EAttribute getComponentDefinitionType_Name();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.CrownComponent <em>Crown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crown Component</em>'.
	 * @see org.example.ng661.part2.CrownComponent
	 * @generated
	 */
	EClass getCrownComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getClipPath()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getClipRule()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getDrawingPriority()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getFill()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getFillOpacity()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getFillRule()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getId()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getInnerRadius <em>Inner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Radius</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getInnerRadius()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_InnerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getOuterRadius <em>Outer Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Radius</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getOuterRadius()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_OuterRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStroke()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeDasharray()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeDashoffset()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeLinecap()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeLinejoin()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeMiterlimit()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokeOpacity()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getStrokewidth()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getTransform()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getVisibility()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getX()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CrownComponent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.CrownComponent#getY()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.CustomIntegerTypeElementType <em>Custom Integer Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Integer Type Element Type</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType
	 * @generated
	 */
	EClass getCustomIntegerTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getAny()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getMax()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getMin()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getName()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getResolution()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getUnit()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomIntegerTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.example.ng661.part2.CustomIntegerTypeElementType#getAnyAttribute()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.CustomRealTypeElementType <em>Custom Real Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Real Type Element Type</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType
	 * @generated
	 */
	EClass getCustomRealTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomRealTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getAny()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomRealTypeElementType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getMax()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomRealTypeElementType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getMin()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomRealTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getName()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getResolution()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getUnit()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomRealTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.example.ng661.part2.CustomRealTypeElementType#getAnyAttribute()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.CustomStringTypeElementType <em>Custom String Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom String Type Element Type</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType
	 * @generated
	 */
	EClass getCustomStringTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomStringTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getAny()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getMaxLength()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getMinLength()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomStringTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getName()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getRegex()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Regex();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.CustomStringTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.example.ng661.part2.CustomStringTypeElementType#getAnyAttribute()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.example.ng661.part2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.ng661.part2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.example.ng661.part2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.example.ng661.part2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.example.ng661.part2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.example.ng661.part2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.example.ng661.part2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.ng661.part2.DocumentRoot#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Definition</em>'.
	 * @see org.example.ng661.part2.DocumentRoot#getComponentDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.EllipsePrimitive <em>Ellipse Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Primitive</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive
	 * @generated
	 */
	EClass getEllipsePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.EllipsePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getChildElements()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getGroup()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getChildren()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getRectangle()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getCircle()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getEllipse()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getLine()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getPolyline()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getPolygon()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getPath()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getImage()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getText()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getArc()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getCrown()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getPolarLine()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getPointerArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getTouchArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getGestureArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getScrollWheelArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getKeyboardInput()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.EllipsePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getCompositions()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getClipPath()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getClipRule()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getCx()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getCy()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getDrawingPriority()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getFill()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getFillOpacity()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getFillRule()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getId()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getRx()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getRy()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStroke()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeDasharray()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeDashoffset()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeLinecap()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeLinejoin()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeMiterlimit()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokeOpacity()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getStrokewidth()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getTransform()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EllipsePrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.EllipsePrimitive#getVisibility()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.example.ng661.part2.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.example.ng661.part2.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.FunctionType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.example.ng661.part2.FunctionType#getParam()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.FunctionType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.example.ng661.part2.FunctionType#getScript()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.FunctionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.FunctionType#getName()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Name();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.GestureAreaPrimitive <em>Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesture Area Primitive</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive
	 * @generated
	 */
	EClass getGestureAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Gesture</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getAcceptedGesture()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_AcceptedGesture();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getClipPath()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getClipRule()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getEnabled()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getHeight()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getId()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getTransform()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getWidth()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getX()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GestureAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.GestureAreaPrimitive#getY()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.GroupPrimitive <em>Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Primitive</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive
	 * @generated
	 */
	EClass getGroupPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.GroupPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getChildElements()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getGroup()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getChildren()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getRectangle()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getCircle()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getEllipse()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getLine()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getPolyline()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getPolygon()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getPath()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getImage()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getText()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getArc()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getCrown()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getPolarLine()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getPointerArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getTouchArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getGestureArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getScrollWheelArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getKeyboardInput()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.GroupPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getCompositions()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getDrawingPriority()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GroupPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getId()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GroupPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getTransform()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.GroupPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.GroupPrimitive#getVisibility()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ImagePrimitive <em>Image Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Primitive</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive
	 * @generated
	 */
	EClass getImagePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.ImagePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getChildElements()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getGroup()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getChildren()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getRectangle()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getCircle()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getEllipse()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getLine()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getPolyline()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getPolygon()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getPath()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getImage()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getText()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getArc()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getCrown()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getPolarLine()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getPointerArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getTouchArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getGestureArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getScrollWheelArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getKeyboardInput()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.ImagePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getCompositions()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getAlignment()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Ratio</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getAspectRatio()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_AspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getClipPath()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getClipRule()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getDrawingPriority()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getHeight()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getId()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getSource()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getTransform()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getVisibility()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getWidth()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getX()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImagePrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.ImagePrimitive#getY()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see org.example.ng661.part2.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ImportType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.example.ng661.part2.ImportType#getFile()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_File();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see org.example.ng661.part2.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.InterfaceType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.example.ng661.part2.InterfaceType#getProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.InterfaceType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see org.example.ng661.part2.InterfaceType#getEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Event();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.KeyboardInputPrimitive <em>Keyboard Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyboard Input Primitive</em>'.
	 * @see org.example.ng661.part2.KeyboardInputPrimitive
	 * @generated
	 */
	EClass getKeyboardInputPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.KeyboardInputPrimitive#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.example.ng661.part2.KeyboardInputPrimitive#getEnabled()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.KeyboardInputPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.KeyboardInputPrimitive#getId()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Id();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.LinePrimitive <em>Line Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Primitive</em>'.
	 * @see org.example.ng661.part2.LinePrimitive
	 * @generated
	 */
	EClass getLinePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getDrawingPriority()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getId()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStroke()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeDasharray()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeDashoffset()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeLinecap()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeLinejoin()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeMiterlimit()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokeOpacity()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getStrokewidth()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getTransform()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getVisibility()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getX1()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getX2()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getY1()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.LinePrimitive#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.example.ng661.part2.LinePrimitive#getY2()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Y2();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.example.ng661.part2.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ParamType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.example.ng661.part2.ParamType#getModality()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ParamType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.example.ng661.part2.ParamType#getType()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Type();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PathPrimitive <em>Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Primitive</em>'.
	 * @see org.example.ng661.part2.PathPrimitive
	 * @generated
	 */
	EClass getPathPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getClipPath()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getClipRule()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getD()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_D();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getDrawingPriority()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getFill()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getFillOpacity()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getFillRule()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getId()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStroke()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeDasharray()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeDashoffset()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeLinecap()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeLinejoin()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeMiterlimit()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokeOpacity()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getStrokewidth()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getTransform()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PathPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.PathPrimitive#getVisibility()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PointerAreaPrimitive <em>Pointer Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Area Primitive</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive
	 * @generated
	 */
	EClass getPointerAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Buttons</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_AcceptedButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getClipPath()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getClipRule()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getEnabled()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getHeight()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getId()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Through</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getPassThrough()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_PassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevent Stealing</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_PreventStealing();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getTransform()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getWidth()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getX()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PointerAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.PointerAreaPrimitive#getY()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PolarLineComponent <em>Polar Line Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Line Component</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent
	 * @generated
	 */
	EClass getPolarLineComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getAngle()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getClipPath()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getClipRule()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getDrawingPriority()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getId()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getR()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_R();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStroke()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeDasharray()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeLinecap()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokeOpacity()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getStrokewidth()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getTransform()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getVisibility()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getX1()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolarLineComponent#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.example.ng661.part2.PolarLineComponent#getY1()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Y1();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PolygonPrimitive <em>Polygon Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Primitive</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive
	 * @generated
	 */
	EClass getPolygonPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getDrawingPriority()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getFill()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getFillOpacity()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getFillRule()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getId()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getPoints()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStroke()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getStrokewidth()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getTransform()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolygonPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.PolygonPrimitive#getVisibility()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PolylinePrimitive <em>Polyline Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Primitive</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive
	 * @generated
	 */
	EClass getPolylinePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getDrawingPriority()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getId()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getPoints()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStroke()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeDasharray()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeDashoffset()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeLinecap()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeLinejoin()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeMiterlimit()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokeOpacity()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getStrokewidth()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getTransform()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PolylinePrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.PolylinePrimitive#getVisibility()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Visibility();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.example.ng661.part2.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.example.ng661.part2.PropertyType#getMaxStringLength()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.example.ng661.part2.PropertyType#getModality()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.ng661.part2.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.example.ng661.part2.PropertyType#getType()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.example.ng661.part2.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.RectPrimitive <em>Rect Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect Primitive</em>'.
	 * @see org.example.ng661.part2.RectPrimitive
	 * @generated
	 */
	EClass getRectPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.RectPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getChildElements()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getGroup()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getChildren()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getRectangle()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getCircle()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getEllipse()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getLine()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getPolyline()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getPolygon()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getPath()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getImage()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getText()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getArc()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getCrown()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getPolarLine()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getPointerArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getTouchArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getGestureArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getScrollWheelArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getKeyboardInput()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RectPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getCompositions()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getClipPath()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getClipRule()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getDrawingPriority()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getFill()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getFillOpacity()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getFillRule()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getHeight()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getId()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getRx()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getRy()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStroke()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeDasharray()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeDashoffset()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeLinecap()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeLinejoin()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeMiterlimit()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokeOpacity()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getStrokewidth()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getTransform()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getVisibility()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getWidth()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getX()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.RectPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.RectPrimitive#getY()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.RepresentationType <em>Representation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Type</em>'.
	 * @see org.example.ng661.part2.RepresentationType
	 * @generated
	 */
	EClass getRepresentationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.RepresentationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getGroup()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group1</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getGroup1()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Group1();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getChildren()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getRectangle()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getCircle()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getEllipse()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getLine()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getPolyline()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getPolygon()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getPath()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getImage()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getText()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getArc()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getCrown()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getPolarLine()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getPointerArea()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getTouchArea()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getGestureArea()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getScrollWheelArea()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getKeyboardInput()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getClipPath()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_ClipPath();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.RepresentationType#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.example.ng661.part2.RepresentationType#getCompositions()
	 * @see #getRepresentationType()
	 * @generated
	 */
	EReference getRepresentationType_Compositions();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive <em>Scroll Wheel Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Wheel Area Primitive</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive
	 * @generated
	 */
	EClass getScrollWheelAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getClipPath()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getClipRule()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getEnabled()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getHeight()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getId()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getTransform()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getWidth()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getX()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.ScrollWheelAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.ScrollWheelAreaPrimitive#getY()
	 * @see #getScrollWheelAreaPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.TextPrimitive <em>Text Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Primitive</em>'.
	 * @see org.example.ng661.part2.TextPrimitive
	 * @generated
	 */
	EClass getTextPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getDrawingPriority()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFill()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFillOpacity()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFillRule()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontFamily()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontSize()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontStretch <em>Font Stretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Stretch</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontStretch()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontStretch();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontStyle()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontVariant <em>Font Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Variant</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontVariant()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getFontWeight()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getId()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStroke()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeDasharray()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeDashoffset()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeLinecap()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeLinejoin()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeMiterlimit()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokeOpacity()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getStrokewidth()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getTransform()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getValue()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getVisibility()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getX()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TextPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.TextPrimitive#getY()
	 * @see #getTextPrimitive()
	 * @generated
	 */
	EAttribute getTextPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.TouchAreaPrimitive <em>Touch Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Area Primitive</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive
	 * @generated
	 */
	EClass getTouchAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getClipPath()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_ClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getClipRule()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_ClipRule();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getEnabled()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getHeight()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getId()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getMaximumTouchPoints <em>Maximum Touch Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Touch Points</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getMaximumTouchPoints()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_MaximumTouchPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getMinimumTouchPoints <em>Minimum Touch Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Touch Points</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getMinimumTouchPoints()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_MinimumTouchPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getTransform()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getWidth()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getX()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.TouchAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.example.ng661.part2.TouchAreaPrimitive#getY()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.RepresentationTypes <em>Representation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Types</em>'.
	 * @see org.example.ng661.part2.RepresentationTypes
	 * @generated
	 */
	EClass getRepresentationTypes();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.ClipRepresentationTypes <em>Clip Representation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Representation Types</em>'.
	 * @see org.example.ng661.part2.ClipRepresentationTypes
	 * @generated
	 */
	EClass getClipRepresentationTypes();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see org.example.ng661.part2.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.example.ng661.part2.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.example.ng661.part2.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.example.ng661.part2.PropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.example.ng661.part2.PropertyValue#getProperty()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EReference getPropertyValue_Property();

	/**
	 * Returns the meta object for class '{@link org.example.ng661.part2.WidgetComposition <em>Widget Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Composition</em>'.
	 * @see org.example.ng661.part2.WidgetComposition
	 * @generated
	 */
	EClass getWidgetComposition();

	/**
	 * Returns the meta object for the reference '{@link org.example.ng661.part2.WidgetComposition#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getRepresentation()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.WidgetComposition#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getValues()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.ng661.part2.WidgetComposition#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getChildElements()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getGroup()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getChildren()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getRectangle()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getCircle()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getEllipse()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getLine()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getPolyline()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getPolygon()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getPath()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getImage()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getText()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getArc()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getCrown()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getPolarLine()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getPointerArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getTouchArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getGestureArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getScrollWheelArea <em>Scroll Wheel Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Area</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getScrollWheelArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_ScrollWheelArea();

	/**
	 * Returns the meta object for the reference list '{@link org.example.ng661.part2.WidgetComposition#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.example.ng661.part2.WidgetComposition#getKeyboardInput()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_KeyboardInput();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.AlignementTypeVal <em>Alignement Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignement Type Val</em>'.
	 * @see org.example.ng661.part2.AlignementTypeVal
	 * @generated
	 */
	EEnum getAlignementTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Ratio Type Val</em>'.
	 * @see org.example.ng661.part2.AspectRatioTypeVal
	 * @generated
	 */
	EEnum getAspectRatioTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.BooleanTypeVal <em>Boolean Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Type Val</em>'.
	 * @see org.example.ng661.part2.BooleanTypeVal
	 * @generated
	 */
	EEnum getBooleanTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.ColorReferenceType <em>Color Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Reference Type</em>'.
	 * @see org.example.ng661.part2.ColorReferenceType
	 * @generated
	 */
	EEnum getColorReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.FillRuleTypeVal <em>Fill Rule Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Rule Type Val</em>'.
	 * @see org.example.ng661.part2.FillRuleTypeVal
	 * @generated
	 */
	EEnum getFillRuleTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.ModalityType <em>Modality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality Type</em>'.
	 * @see org.example.ng661.part2.ModalityType
	 * @generated
	 */
	EEnum getModalityType();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.ModalityType1 <em>Modality Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality Type1</em>'.
	 * @see org.example.ng661.part2.ModalityType1
	 * @generated
	 */
	EEnum getModalityType1();

	/**
	 * Returns the meta object for enum '{@link org.example.ng661.part2.VisibilityTypeVal <em>Visibility Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type Val</em>'.
	 * @see org.example.ng661.part2.VisibilityTypeVal
	 * @generated
	 */
	EEnum getVisibilityTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Alignement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignement Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AlignementType' memberTypes='AlignementTypeVal Expression'"
	 * @generated
	 */
	EDataType getAlignementType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.AlignementTypeVal <em>Alignement Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignement Type Val Object</em>'.
	 * @see org.example.ng661.part2.AlignementTypeVal
	 * @model instanceClass="org.example.ng661.part2.AlignementTypeVal"
	 *        extendedMetaData="name='AlignementTypeVal:Object' baseType='AlignementTypeVal'"
	 * @generated
	 */
	EDataType getAlignementTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AngleType' memberTypes='AngleTypeVal Expression'"
	 * @generated
	 */
	EDataType getAngleType();

	/**
	 * Returns the meta object for data type '<em>Angle Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='AngleTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-360.0' maxInclusive='360.0'"
	 * @generated
	 */
	EDataType getAngleTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='AngleTypeVal:Object' baseType='AngleTypeVal'"
	 * @generated
	 */
	EDataType getAngleTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Aspect Ratio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aspect Ratio Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AspectRatioType' memberTypes='AspectRatioTypeVal Expression'"
	 * @generated
	 */
	EDataType getAspectRatioType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aspect Ratio Type Val Object</em>'.
	 * @see org.example.ng661.part2.AspectRatioTypeVal
	 * @model instanceClass="org.example.ng661.part2.AspectRatioTypeVal"
	 *        extendedMetaData="name='AspectRatioTypeVal:Object' baseType='AspectRatioTypeVal'"
	 * @generated
	 */
	EDataType getAspectRatioTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='BooleanType' memberTypes='BooleanTypeVal Expression'"
	 * @generated
	 */
	EDataType getBooleanType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.BooleanTypeVal <em>Boolean Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type Val Object</em>'.
	 * @see org.example.ng661.part2.BooleanTypeVal
	 * @model instanceClass="org.example.ng661.part2.BooleanTypeVal"
	 *        extendedMetaData="name='BooleanTypeVal:Object' baseType='BooleanTypeVal'"
	 * @generated
	 */
	EDataType getBooleanTypeValObject();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.ColorReferenceType <em>Color Reference Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Reference Type Object</em>'.
	 * @see org.example.ng661.part2.ColorReferenceType
	 * @model instanceClass="org.example.ng661.part2.ColorReferenceType"
	 *        extendedMetaData="name='ColorReferenceType:Object' baseType='ColorReferenceType'"
	 * @generated
	 */
	EDataType getColorReferenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGBHEX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGBHEX Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_HEX_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='#[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F])?'"
	 * @generated
	 */
	EDataType getColorRGBHEXType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Rgb255 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Rgb255 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_rgb255_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='rgb\\(\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*\\)'"
	 * @generated
	 */
	EDataType getColorRGBRgb255Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Rgb Percent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Rgb Percent Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_rgbPercent_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='rgb\\(\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*\\)'"
	 * @generated
	 */
	EDataType getColorRGBRgbPercentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGBType' memberTypes='ColorRGB_rgbPercent_Type ColorRGB_rgb255_Type ColorRGB_HEX_Type'"
	 * @generated
	 */
	EDataType getColorRGBType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ColorType' memberTypes='ColorRGBType ColorReferenceType'"
	 * @generated
	 */
	EDataType getColorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DateTimeType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#dateTime Expression'"
	 * @generated
	 */
	EDataType getDateTimeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DateType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#date Expression'"
	 * @generated
	 */
	EDataType getDateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Distance Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DistanceType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getDistanceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Expression' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\{.*\\}'"
	 * @generated
	 */
	EDataType getExpression();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Fill Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FillRuleType' memberTypes='FillRuleTypeVal Expression'"
	 * @generated
	 */
	EDataType getFillRuleType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.FillRuleTypeVal <em>Fill Rule Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type Val Object</em>'.
	 * @see org.example.ng661.part2.FillRuleTypeVal
	 * @model instanceClass="org.example.ng661.part2.FillRuleTypeVal"
	 *        extendedMetaData="name='FillRuleTypeVal:Object' baseType='FillRuleTypeVal'"
	 * @generated
	 */
	EDataType getFillRuleTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FontType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI Expression'"
	 * @generated
	 */
	EDataType getFontType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Format String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format String Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FormatStringType' memberTypes='FormatStringTypeVal Expression'"
	 * @generated
	 */
	EDataType getFormatStringType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Format String Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format String Type Val</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FormatStringTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^_\\.\\+#\u23e8]*\\+?[^\\.\\+#\u23e8]*[^_\\.\\+\u23e8]*\\.?[^_\\.\\+\u23e8]*[^\\.\\+#\u23e8]*(\u23e8\\+?[_]*[#]+)?[^_\\.\\+#\u23e8]*'"
	 * @generated
	 */
	EDataType getFormatStringTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FrequencyType' memberTypes='FrequencyTypeVal Expression'"
	 * @generated
	 */
	EDataType getFrequencyType();

	/**
	 * Returns the meta object for data type '<em>Frequency Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='FrequencyTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='1000.0'"
	 * @generated
	 */
	EDataType getFrequencyTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Frequency Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='FrequencyTypeVal:Object' baseType='FrequencyTypeVal'"
	 * @generated
	 */
	EDataType getFrequencyTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ImageType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI Expression'"
	 * @generated
	 */
	EDataType getImageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='IntegerType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#long Expression'"
	 * @generated
	 */
	EDataType getIntegerType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.ModalityType <em>Modality Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modality Type Object</em>'.
	 * @see org.example.ng661.part2.ModalityType
	 * @model instanceClass="org.example.ng661.part2.ModalityType"
	 *        extendedMetaData="name='modality_._type:Object' baseType='modality_._type'"
	 * @generated
	 */
	EDataType getModalityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.ModalityType1 <em>Modality Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modality Type Object1</em>'.
	 * @see org.example.ng661.part2.ModalityType1
	 * @model instanceClass="org.example.ng661.part2.ModalityType1"
	 *        extendedMetaData="name='modality_._1_._type:Object' baseType='modality_._1_._type'"
	 * @generated
	 */
	EDataType getModalityTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Opacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='OpacityType' memberTypes='OpacityTypeVal Expression'"
	 * @generated
	 */
	EDataType getOpacityType();

	/**
	 * Returns the meta object for data type '<em>Opacity Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='OpacityTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='1.0'"
	 * @generated
	 */
	EDataType getOpacityTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Opacity Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='OpacityTypeVal:Object' baseType='OpacityTypeVal'"
	 * @generated
	 */
	EDataType getOpacityTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='PositionType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getPositionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RealType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getRealType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stipple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stipple Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StippleType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStippleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StringType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStringType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Defaultmilliseconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Defaultmilliseconds Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_defaultmilliseconds_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?'"
	 * @generated
	 */
	EDataType getTimeDefaultmillisecondsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Hours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Hours Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_hours_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[hH]'"
	 * @generated
	 */
	EDataType getTimeHoursType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Minutes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Minutes Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_minutes_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM][nN]'"
	 * @generated
	 */
	EDataType getTimeMinutesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Seconds Or Subseconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Seconds Or Subseconds Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_seconds_or_subseconds_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM\265]?[sS]'"
	 * @generated
	 */
	EDataType getTimeSecondsOrSubsecondsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TimeType' memberTypes='Time_hours_Type Time_minutes_Type Time_seconds_or_subseconds_Type Time_defaultmilliseconds_Type'"
	 * @generated
	 */
	EDataType getTimeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*Type'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '<em>Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Velocity Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='VelocityType' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='3E11'"
	 * @generated
	 */
	EDataType getVelocityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Velocity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Velocity Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='VelocityType:Object' baseType='VelocityType'"
	 * @generated
	 */
	EDataType getVelocityTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='VisibilityType' memberTypes='VisibilityTypeVal Expression'"
	 * @generated
	 */
	EDataType getVisibilityType();

	/**
	 * Returns the meta object for data type '{@link org.example.ng661.part2.VisibilityTypeVal <em>Visibility Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Type Val Object</em>'.
	 * @see org.example.ng661.part2.VisibilityTypeVal
	 * @model instanceClass="org.example.ng661.part2.VisibilityTypeVal"
	 *        extendedMetaData="name='VisibilityTypeVal:Object' baseType='VisibilityTypeVal'"
	 * @generated
	 */
	EDataType getVisibilityTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>ZIndex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ZIndex Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ZIndexType' memberTypes='ZIndexTypeVal Expression'"
	 * @generated
	 */
	EDataType getZIndexType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>ZIndex Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ZIndex Type Val</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ZIndexTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='-32768' maxInclusive='32767'"
	 * @generated
	 */
	EDataType getZIndexTypeVal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Part2Factory getPart2Factory();

} //Part2Package
