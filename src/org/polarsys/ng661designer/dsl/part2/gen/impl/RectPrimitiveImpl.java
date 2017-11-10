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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.dsl.part2.gen.ArcComponent;
import org.polarsys.ng661designer.dsl.part2.gen.ChildPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.CirclePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.CrownComponent;
import org.polarsys.ng661designer.dsl.part2.gen.EllipsePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.GestureAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.GroupPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ImagePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.KeyboardInputPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PointerAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolarLineComponent;
import org.polarsys.ng661designer.dsl.part2.gen.PolygonPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolylinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RectPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationTypes;
import org.polarsys.ng661designer.dsl.part2.gen.ScrollWheelAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.WidgetComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rect Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getRy <em>Ry</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.RectPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectPrimitiveImpl extends ClipRepresentationTypesImpl implements RectPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getChildElements() <em>Child Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationTypes> childElements;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupPrimitive> group;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildPrimitive> children;

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList<RectPrimitive> rectangle;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList<CirclePrimitive> circle;

	/**
	 * The cached value of the '{@link #getEllipse() <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipse()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipsePrimitive> ellipse;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePrimitive> line;

	/**
	 * The cached value of the '{@link #getPolyline() <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyline()
	 * @generated
	 * @ordered
	 */
	protected EList<PolylinePrimitive> polyline;

	/**
	 * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygon()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonPrimitive> polygon;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathPrimitive> path;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagePrimitive> image;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextPrimitive> text;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcComponent> arc;

	/**
	 * The cached value of the '{@link #getCrown() <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrown()
	 * @generated
	 * @ordered
	 */
	protected EList<CrownComponent> crown;

	/**
	 * The cached value of the '{@link #getPolarLine() <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarLine()
	 * @generated
	 * @ordered
	 */
	protected EList<PolarLineComponent> polarLine;

	/**
	 * The cached value of the '{@link #getPointerArea() <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerArea()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerAreaPrimitive> pointerArea;

	/**
	 * The cached value of the '{@link #getTouchArea() <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchArea()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerAreaPrimitive> touchArea;

	/**
	 * The cached value of the '{@link #getGestureArea() <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestureArea()
	 * @generated
	 * @ordered
	 */
	protected EList<GestureAreaPrimitive> gestureArea;

	/**
	 * The cached value of the '{@link #getScrollWheelArea() <em>Scroll Wheel Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollWheelArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ScrollWheelAreaPrimitive> scrollWheelArea;

	/**
	 * The cached value of the '{@link #getKeyboardInput() <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardInput()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyboardInputPrimitive> keyboardInput;

	/**
	 * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetComposition> compositions;

	/**
	 * The default value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected String clipPath = CLIP_PATH_EDEFAULT;

	/**
	 * This is true if the Clip Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipPathESet;

	/**
	 * The default value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_RULE_EDEFAULT = "nonzero";

	/**
	 * The cached value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected String clipRule = CLIP_RULE_EDEFAULT;

	/**
	 * This is true if the Clip Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipRuleESet;

	/**
	 * The default value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Object DRAWING_PRIORITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getZIndexType(), "0");

	/**
	 * The cached value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected Object drawingPriority = DRAWING_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Drawing Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawingPriorityESet;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "none");

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Object fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object fillOpacity = FILL_OPACITY_EDEFAULT;

	/**
	 * This is true if the Fill Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillOpacityESet;

	/**
	 * The default value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_RULE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getFillRuleType(), "nonzero");

	/**
	 * The cached value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected Object fillRule = FILL_RULE_EDEFAULT;

	/**
	 * This is true if the Fill Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillRuleESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected static final Object RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected Object rx = RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRy() <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected static final Object RY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRy() <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected Object ry = RY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Object stroke = STROKE_EDEFAULT;

	/**
	 * This is true if the Stroke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected String strokeDasharray = STROKE_DASHARRAY_EDEFAULT;

	/**
	 * This is true if the Stroke Dasharray attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDasharrayESet;

	/**
	 * The default value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_DASHOFFSET_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected Object strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;

	/**
	 * This is true if the Stroke Dashoffset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDashoffsetESet;

	/**
	 * The default value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINECAP_EDEFAULT = "butt";

	/**
	 * The cached value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinecap = STROKE_LINECAP_EDEFAULT;

	/**
	 * This is true if the Stroke Linecap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinecapESet;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINEJOIN_EDEFAULT = "miter";

	/**
	 * The cached value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Stroke Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinejoinESet;

	/**
	 * The default value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_MITERLIMIT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getRealType(), "4.0");

	/**
	 * The cached value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected Object strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;

	/**
	 * This is true if the Stroke Miterlimit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeMiterlimitESet;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stroke Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeOpacityESet;

	/**
	 * The default value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKEWIDTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected Object strokewidth = STROKEWIDTH_EDEFAULT;

	/**
	 * This is true if the Strokewidth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokewidthESet;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformESet;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBILITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getVisibilityType(), "visible");

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Object visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getRectPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationTypes> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentEList<RepresentationTypes>(RepresentationTypes.class, this, Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS);
		}
		return childElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupPrimitive> getGroup() {
		if (group == null) {
			group = new EObjectResolvingEList.Unsettable<GroupPrimitive>(GroupPrimitive.class, this, Part2Package.RECT_PRIMITIVE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroup() {
		if (group != null) ((InternalEList.Unsettable<?>)group).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroup() {
		return group != null && ((InternalEList.Unsettable<?>)group).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildPrimitive> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList.Unsettable<ChildPrimitive>(ChildPrimitive.class, this, Part2Package.RECT_PRIMITIVE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChildren() {
		if (children != null) ((InternalEList.Unsettable<?>)children).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChildren() {
		return children != null && ((InternalEList.Unsettable<?>)children).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectPrimitive> getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectResolvingEList.Unsettable<RectPrimitive>(RectPrimitive.class, this, Part2Package.RECT_PRIMITIVE__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRectangle() {
		if (rectangle != null) ((InternalEList.Unsettable<?>)rectangle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRectangle() {
		return rectangle != null && ((InternalEList.Unsettable<?>)rectangle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CirclePrimitive> getCircle() {
		if (circle == null) {
			circle = new EObjectResolvingEList.Unsettable<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.RECT_PRIMITIVE__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCircle() {
		if (circle != null) ((InternalEList.Unsettable<?>)circle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCircle() {
		return circle != null && ((InternalEList.Unsettable<?>)circle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipsePrimitive> getEllipse() {
		if (ellipse == null) {
			ellipse = new EObjectResolvingEList.Unsettable<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.RECT_PRIMITIVE__ELLIPSE);
		}
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEllipse() {
		if (ellipse != null) ((InternalEList.Unsettable<?>)ellipse).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEllipse() {
		return ellipse != null && ((InternalEList.Unsettable<?>)ellipse).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePrimitive> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList.Unsettable<LinePrimitive>(LinePrimitive.class, this, Part2Package.RECT_PRIMITIVE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLine() {
		if (line != null) ((InternalEList.Unsettable<?>)line).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLine() {
		return line != null && ((InternalEList.Unsettable<?>)line).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylinePrimitive> getPolyline() {
		if (polyline == null) {
			polyline = new EObjectResolvingEList.Unsettable<PolylinePrimitive>(PolylinePrimitive.class, this, Part2Package.RECT_PRIMITIVE__POLYLINE);
		}
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolyline() {
		if (polyline != null) ((InternalEList.Unsettable<?>)polyline).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolyline() {
		return polyline != null && ((InternalEList.Unsettable<?>)polyline).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonPrimitive> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectResolvingEList.Unsettable<PolygonPrimitive>(PolygonPrimitive.class, this, Part2Package.RECT_PRIMITIVE__POLYGON);
		}
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolygon() {
		if (polygon != null) ((InternalEList.Unsettable<?>)polygon).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolygon() {
		return polygon != null && ((InternalEList.Unsettable<?>)polygon).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathPrimitive> getPath() {
		if (path == null) {
			path = new EObjectResolvingEList.Unsettable<PathPrimitive>(PathPrimitive.class, this, Part2Package.RECT_PRIMITIVE__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPath() {
		if (path != null) ((InternalEList.Unsettable<?>)path).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPath() {
		return path != null && ((InternalEList.Unsettable<?>)path).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagePrimitive> getImage() {
		if (image == null) {
			image = new EObjectResolvingEList.Unsettable<ImagePrimitive>(ImagePrimitive.class, this, Part2Package.RECT_PRIMITIVE__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImage() {
		if (image != null) ((InternalEList.Unsettable<?>)image).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImage() {
		return image != null && ((InternalEList.Unsettable<?>)image).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextPrimitive> getText() {
		if (text == null) {
			text = new EObjectResolvingEList.Unsettable<TextPrimitive>(TextPrimitive.class, this, Part2Package.RECT_PRIMITIVE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetText() {
		if (text != null) ((InternalEList.Unsettable<?>)text).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetText() {
		return text != null && ((InternalEList.Unsettable<?>)text).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArcComponent> getArc() {
		if (arc == null) {
			arc = new EObjectResolvingEList.Unsettable<ArcComponent>(ArcComponent.class, this, Part2Package.RECT_PRIMITIVE__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArc() {
		if (arc != null) ((InternalEList.Unsettable<?>)arc).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArc() {
		return arc != null && ((InternalEList.Unsettable<?>)arc).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CrownComponent> getCrown() {
		if (crown == null) {
			crown = new EObjectResolvingEList.Unsettable<CrownComponent>(CrownComponent.class, this, Part2Package.RECT_PRIMITIVE__CROWN);
		}
		return crown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrown() {
		if (crown != null) ((InternalEList.Unsettable<?>)crown).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrown() {
		return crown != null && ((InternalEList.Unsettable<?>)crown).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolarLineComponent> getPolarLine() {
		if (polarLine == null) {
			polarLine = new EObjectResolvingEList.Unsettable<PolarLineComponent>(PolarLineComponent.class, this, Part2Package.RECT_PRIMITIVE__POLAR_LINE);
		}
		return polarLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolarLine() {
		if (polarLine != null) ((InternalEList.Unsettable<?>)polarLine).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolarLine() {
		return polarLine != null && ((InternalEList.Unsettable<?>)polarLine).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerAreaPrimitive> getPointerArea() {
		if (pointerArea == null) {
			pointerArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.RECT_PRIMITIVE__POINTER_AREA);
		}
		return pointerArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointerArea() {
		if (pointerArea != null) ((InternalEList.Unsettable<?>)pointerArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointerArea() {
		return pointerArea != null && ((InternalEList.Unsettable<?>)pointerArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerAreaPrimitive> getTouchArea() {
		if (touchArea == null) {
			touchArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.RECT_PRIMITIVE__TOUCH_AREA);
		}
		return touchArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTouchArea() {
		if (touchArea != null) ((InternalEList.Unsettable<?>)touchArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTouchArea() {
		return touchArea != null && ((InternalEList.Unsettable<?>)touchArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GestureAreaPrimitive> getGestureArea() {
		if (gestureArea == null) {
			gestureArea = new EObjectResolvingEList.Unsettable<GestureAreaPrimitive>(GestureAreaPrimitive.class, this, Part2Package.RECT_PRIMITIVE__GESTURE_AREA);
		}
		return gestureArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGestureArea() {
		if (gestureArea != null) ((InternalEList.Unsettable<?>)gestureArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGestureArea() {
		return gestureArea != null && ((InternalEList.Unsettable<?>)gestureArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScrollWheelAreaPrimitive> getScrollWheelArea() {
		if (scrollWheelArea == null) {
			scrollWheelArea = new EObjectResolvingEList.Unsettable<ScrollWheelAreaPrimitive>(ScrollWheelAreaPrimitive.class, this, Part2Package.RECT_PRIMITIVE__SCROLL_WHEEL_AREA);
		}
		return scrollWheelArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScrollWheelArea() {
		if (scrollWheelArea != null) ((InternalEList.Unsettable<?>)scrollWheelArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScrollWheelArea() {
		return scrollWheelArea != null && ((InternalEList.Unsettable<?>)scrollWheelArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyboardInputPrimitive> getKeyboardInput() {
		if (keyboardInput == null) {
			keyboardInput = new EObjectResolvingEList.Unsettable<KeyboardInputPrimitive>(KeyboardInputPrimitive.class, this, Part2Package.RECT_PRIMITIVE__KEYBOARD_INPUT);
		}
		return keyboardInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyboardInput() {
		if (keyboardInput != null) ((InternalEList.Unsettable<?>)keyboardInput).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyboardInput() {
		return keyboardInput != null && ((InternalEList.Unsettable<?>)keyboardInput).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetComposition> getCompositions() {
		if (compositions == null) {
			compositions = new EObjectResolvingEList.Unsettable<WidgetComposition>(WidgetComposition.class, this, Part2Package.RECT_PRIMITIVE__COMPOSITIONS);
		}
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositions() {
		if (compositions != null) ((InternalEList.Unsettable<?>)compositions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositions() {
		return compositions != null && ((InternalEList.Unsettable<?>)compositions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPath() {
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(String newClipPath) {
		String oldClipPath = clipPath;
		clipPath = newClipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__CLIP_PATH, oldClipPath, clipPath, !oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipPath() {
		String oldClipPath = clipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPath = CLIP_PATH_EDEFAULT;
		clipPathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__CLIP_PATH, oldClipPath, CLIP_PATH_EDEFAULT, oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipPath() {
		return clipPathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipRule() {
		return clipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipRule(String newClipRule) {
		String oldClipRule = clipRule;
		clipRule = newClipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipRule() {
		String oldClipRule = clipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRule = CLIP_RULE_EDEFAULT;
		clipRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipRule() {
		return clipRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDrawingPriority() {
		return drawingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPriority(Object newDrawingPriority) {
		Object oldDrawingPriority = drawingPriority;
		drawingPriority = newDrawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrawingPriority() {
		Object oldDrawingPriority = drawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriority = DRAWING_PRIORITY_EDEFAULT;
		drawingPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrawingPriority() {
		return drawingPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Object newFill) {
		Object oldFill = fill;
		fill = newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		Object oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(Object newFillOpacity) {
		Object oldFillOpacity = fillOpacity;
		fillOpacity = newFillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, fillOpacity, !oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillOpacity() {
		Object oldFillOpacity = fillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacity = FILL_OPACITY_EDEFAULT;
		fillOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, FILL_OPACITY_EDEFAULT, oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillOpacity() {
		return fillOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFillRule() {
		return fillRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillRule(Object newFillRule) {
		Object oldFillRule = fillRule;
		fillRule = newFillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__FILL_RULE, oldFillRule, fillRule, !oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillRule() {
		Object oldFillRule = fillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRule = FILL_RULE_EDEFAULT;
		fillRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__FILL_RULE, oldFillRule, FILL_RULE_EDEFAULT, oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillRule() {
		return fillRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRx() {
		return rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(Object newRx) {
		Object oldRx = rx;
		rx = newRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__RX, oldRx, rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRy() {
		return ry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRy(Object newRy) {
		Object oldRy = ry;
		ry = newRy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__RY, oldRy, ry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Object newStroke) {
		Object oldStroke = stroke;
		stroke = newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE, oldStroke, stroke, !oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		Object oldStroke = stroke;
		boolean oldStrokeESet = strokeESet;
		stroke = STROKE_EDEFAULT;
		strokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE, oldStroke, STROKE_EDEFAULT, oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return strokeDasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		String oldStrokeDasharray = strokeDasharray;
		strokeDasharray = newStrokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharrayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, strokeDasharray, !oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDasharray() {
		String oldStrokeDasharray = strokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharray = STROKE_DASHARRAY_EDEFAULT;
		strokeDasharrayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, STROKE_DASHARRAY_EDEFAULT, oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDasharray() {
		return strokeDasharrayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeDashoffset() {
		return strokeDashoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDashoffset(Object newStrokeDashoffset) {
		Object oldStrokeDashoffset = strokeDashoffset;
		strokeDashoffset = newStrokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, strokeDashoffset, !oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDashoffset() {
		Object oldStrokeDashoffset = strokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;
		strokeDashoffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, STROKE_DASHOFFSET_EDEFAULT, oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDashoffset() {
		return strokeDashoffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinecap() {
		return strokeLinecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(String newStrokeLinecap) {
		String oldStrokeLinecap = strokeLinecap;
		strokeLinecap = newStrokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, strokeLinecap, !oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinecap() {
		String oldStrokeLinecap = strokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecap = STROKE_LINECAP_EDEFAULT;
		strokeLinecapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, STROKE_LINECAP_EDEFAULT, oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinecap() {
		return strokeLinecapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(String newStrokeLinejoin) {
		String oldStrokeLinejoin = strokeLinejoin;
		strokeLinejoin = newStrokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, strokeLinejoin, !oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinejoin() {
		String oldStrokeLinejoin = strokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;
		strokeLinejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, STROKE_LINEJOIN_EDEFAULT, oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinejoin() {
		return strokeLinejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeMiterlimit() {
		return strokeMiterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeMiterlimit(Object newStrokeMiterlimit) {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		strokeMiterlimit = newStrokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, strokeMiterlimit, !oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeMiterlimit() {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;
		strokeMiterlimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, STROKE_MITERLIMIT_EDEFAULT, oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeMiterlimit() {
		return strokeMiterlimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(Object newStrokeOpacity) {
		Object oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity, !oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeOpacity() {
		Object oldStrokeOpacity = strokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacity = STROKE_OPACITY_EDEFAULT;
		strokeOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, STROKE_OPACITY_EDEFAULT, oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeOpacity() {
		return strokeOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokewidth() {
		return strokewidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokewidth(Object newStrokewidth) {
		Object oldStrokewidth = strokewidth;
		strokewidth = newStrokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__STROKEWIDTH, oldStrokewidth, strokewidth, !oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokewidth() {
		Object oldStrokewidth = strokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidth = STROKEWIDTH_EDEFAULT;
		strokewidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__STROKEWIDTH, oldStrokewidth, STROKEWIDTH_EDEFAULT, oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokewidth() {
		return strokewidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		boolean oldTransformESet = transformESet;
		transformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__TRANSFORM, oldTransform, transform, !oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransform() {
		String oldTransform = transform;
		boolean oldTransformESet = transformESet;
		transform = TRANSFORM_EDEFAULT;
		transformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransform() {
		return transformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Object newVisibility) {
		Object oldVisibility = visibility;
		visibility = newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		Object oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		Object oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.RECT_PRIMITIVE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		Object oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.RECT_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
				return ((InternalEList<?>)getChildElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
				return getChildElements();
			case Part2Package.RECT_PRIMITIVE__GROUP:
				return getGroup();
			case Part2Package.RECT_PRIMITIVE__CHILDREN:
				return getChildren();
			case Part2Package.RECT_PRIMITIVE__RECTANGLE:
				return getRectangle();
			case Part2Package.RECT_PRIMITIVE__CIRCLE:
				return getCircle();
			case Part2Package.RECT_PRIMITIVE__ELLIPSE:
				return getEllipse();
			case Part2Package.RECT_PRIMITIVE__LINE:
				return getLine();
			case Part2Package.RECT_PRIMITIVE__POLYLINE:
				return getPolyline();
			case Part2Package.RECT_PRIMITIVE__POLYGON:
				return getPolygon();
			case Part2Package.RECT_PRIMITIVE__PATH:
				return getPath();
			case Part2Package.RECT_PRIMITIVE__IMAGE:
				return getImage();
			case Part2Package.RECT_PRIMITIVE__TEXT:
				return getText();
			case Part2Package.RECT_PRIMITIVE__ARC:
				return getArc();
			case Part2Package.RECT_PRIMITIVE__CROWN:
				return getCrown();
			case Part2Package.RECT_PRIMITIVE__POLAR_LINE:
				return getPolarLine();
			case Part2Package.RECT_PRIMITIVE__POINTER_AREA:
				return getPointerArea();
			case Part2Package.RECT_PRIMITIVE__TOUCH_AREA:
				return getTouchArea();
			case Part2Package.RECT_PRIMITIVE__GESTURE_AREA:
				return getGestureArea();
			case Part2Package.RECT_PRIMITIVE__SCROLL_WHEEL_AREA:
				return getScrollWheelArea();
			case Part2Package.RECT_PRIMITIVE__KEYBOARD_INPUT:
				return getKeyboardInput();
			case Part2Package.RECT_PRIMITIVE__COMPOSITIONS:
				return getCompositions();
			case Part2Package.RECT_PRIMITIVE__CLIP_PATH:
				return getClipPath();
			case Part2Package.RECT_PRIMITIVE__CLIP_RULE:
				return getClipRule();
			case Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.RECT_PRIMITIVE__FILL:
				return getFill();
			case Part2Package.RECT_PRIMITIVE__FILL_OPACITY:
				return getFillOpacity();
			case Part2Package.RECT_PRIMITIVE__FILL_RULE:
				return getFillRule();
			case Part2Package.RECT_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.RECT_PRIMITIVE__ID:
				return getId();
			case Part2Package.RECT_PRIMITIVE__RX:
				return getRx();
			case Part2Package.RECT_PRIMITIVE__RY:
				return getRy();
			case Part2Package.RECT_PRIMITIVE__STROKE:
				return getStroke();
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET:
				return getStrokeDashoffset();
			case Part2Package.RECT_PRIMITIVE__STROKE_LINECAP:
				return getStrokeLinecap();
			case Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT:
				return getStrokeMiterlimit();
			case Part2Package.RECT_PRIMITIVE__STROKE_OPACITY:
				return getStrokeOpacity();
			case Part2Package.RECT_PRIMITIVE__STROKEWIDTH:
				return getStrokewidth();
			case Part2Package.RECT_PRIMITIVE__TRANSFORM:
				return getTransform();
			case Part2Package.RECT_PRIMITIVE__VISIBILITY:
				return getVisibility();
			case Part2Package.RECT_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.RECT_PRIMITIVE__X:
				return getX();
			case Part2Package.RECT_PRIMITIVE__Y:
				return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends RepresentationTypes>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends GroupPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ChildPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylinePrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImagePrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends ArcComponent>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__CROWN:
				getCrown().clear();
				getCrown().addAll((Collection<? extends CrownComponent>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__POLAR_LINE:
				getPolarLine().clear();
				getPolarLine().addAll((Collection<? extends PolarLineComponent>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__POINTER_AREA:
				getPointerArea().clear();
				getPointerArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__TOUCH_AREA:
				getTouchArea().clear();
				getTouchArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__GESTURE_AREA:
				getGestureArea().clear();
				getGestureArea().addAll((Collection<? extends GestureAreaPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__SCROLL_WHEEL_AREA:
				getScrollWheelArea().clear();
				getScrollWheelArea().addAll((Collection<? extends ScrollWheelAreaPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__KEYBOARD_INPUT:
				getKeyboardInput().clear();
				getKeyboardInput().addAll((Collection<? extends KeyboardInputPrimitive>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends WidgetComposition>)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__CLIP_RULE:
				setClipRule((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__FILL:
				setFill(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__FILL_OPACITY:
				setFillOpacity(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__FILL_RULE:
				setFillRule(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__RX:
				setRx(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__RY:
				setRy(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE:
				setStroke(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET:
				setStrokeDashoffset(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_LINECAP:
				setStrokeLinecap((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN:
				setStrokeLinejoin((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT:
				setStrokeMiterlimit(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_OPACITY:
				setStrokeOpacity(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKEWIDTH:
				setStrokewidth(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__VISIBILITY:
				setVisibility(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.RECT_PRIMITIVE__Y:
				setY(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case Part2Package.RECT_PRIMITIVE__GROUP:
				unsetGroup();
				return;
			case Part2Package.RECT_PRIMITIVE__CHILDREN:
				unsetChildren();
				return;
			case Part2Package.RECT_PRIMITIVE__RECTANGLE:
				unsetRectangle();
				return;
			case Part2Package.RECT_PRIMITIVE__CIRCLE:
				unsetCircle();
				return;
			case Part2Package.RECT_PRIMITIVE__ELLIPSE:
				unsetEllipse();
				return;
			case Part2Package.RECT_PRIMITIVE__LINE:
				unsetLine();
				return;
			case Part2Package.RECT_PRIMITIVE__POLYLINE:
				unsetPolyline();
				return;
			case Part2Package.RECT_PRIMITIVE__POLYGON:
				unsetPolygon();
				return;
			case Part2Package.RECT_PRIMITIVE__PATH:
				unsetPath();
				return;
			case Part2Package.RECT_PRIMITIVE__IMAGE:
				unsetImage();
				return;
			case Part2Package.RECT_PRIMITIVE__TEXT:
				unsetText();
				return;
			case Part2Package.RECT_PRIMITIVE__ARC:
				unsetArc();
				return;
			case Part2Package.RECT_PRIMITIVE__CROWN:
				unsetCrown();
				return;
			case Part2Package.RECT_PRIMITIVE__POLAR_LINE:
				unsetPolarLine();
				return;
			case Part2Package.RECT_PRIMITIVE__POINTER_AREA:
				unsetPointerArea();
				return;
			case Part2Package.RECT_PRIMITIVE__TOUCH_AREA:
				unsetTouchArea();
				return;
			case Part2Package.RECT_PRIMITIVE__GESTURE_AREA:
				unsetGestureArea();
				return;
			case Part2Package.RECT_PRIMITIVE__SCROLL_WHEEL_AREA:
				unsetScrollWheelArea();
				return;
			case Part2Package.RECT_PRIMITIVE__KEYBOARD_INPUT:
				unsetKeyboardInput();
				return;
			case Part2Package.RECT_PRIMITIVE__COMPOSITIONS:
				unsetCompositions();
				return;
			case Part2Package.RECT_PRIMITIVE__CLIP_PATH:
				unsetClipPath();
				return;
			case Part2Package.RECT_PRIMITIVE__CLIP_RULE:
				unsetClipRule();
				return;
			case Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.RECT_PRIMITIVE__FILL:
				unsetFill();
				return;
			case Part2Package.RECT_PRIMITIVE__FILL_OPACITY:
				unsetFillOpacity();
				return;
			case Part2Package.RECT_PRIMITIVE__FILL_RULE:
				unsetFillRule();
				return;
			case Part2Package.RECT_PRIMITIVE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Part2Package.RECT_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.RECT_PRIMITIVE__RX:
				setRx(RX_EDEFAULT);
				return;
			case Part2Package.RECT_PRIMITIVE__RY:
				setRy(RY_EDEFAULT);
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE:
				unsetStroke();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY:
				unsetStrokeDasharray();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET:
				unsetStrokeDashoffset();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_LINECAP:
				unsetStrokeLinecap();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN:
				unsetStrokeLinejoin();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT:
				unsetStrokeMiterlimit();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKE_OPACITY:
				unsetStrokeOpacity();
				return;
			case Part2Package.RECT_PRIMITIVE__STROKEWIDTH:
				unsetStrokewidth();
				return;
			case Part2Package.RECT_PRIMITIVE__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.RECT_PRIMITIVE__VISIBILITY:
				unsetVisibility();
				return;
			case Part2Package.RECT_PRIMITIVE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Part2Package.RECT_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.RECT_PRIMITIVE__Y:
				unsetY();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case Part2Package.RECT_PRIMITIVE__GROUP:
				return isSetGroup();
			case Part2Package.RECT_PRIMITIVE__CHILDREN:
				return isSetChildren();
			case Part2Package.RECT_PRIMITIVE__RECTANGLE:
				return isSetRectangle();
			case Part2Package.RECT_PRIMITIVE__CIRCLE:
				return isSetCircle();
			case Part2Package.RECT_PRIMITIVE__ELLIPSE:
				return isSetEllipse();
			case Part2Package.RECT_PRIMITIVE__LINE:
				return isSetLine();
			case Part2Package.RECT_PRIMITIVE__POLYLINE:
				return isSetPolyline();
			case Part2Package.RECT_PRIMITIVE__POLYGON:
				return isSetPolygon();
			case Part2Package.RECT_PRIMITIVE__PATH:
				return isSetPath();
			case Part2Package.RECT_PRIMITIVE__IMAGE:
				return isSetImage();
			case Part2Package.RECT_PRIMITIVE__TEXT:
				return isSetText();
			case Part2Package.RECT_PRIMITIVE__ARC:
				return isSetArc();
			case Part2Package.RECT_PRIMITIVE__CROWN:
				return isSetCrown();
			case Part2Package.RECT_PRIMITIVE__POLAR_LINE:
				return isSetPolarLine();
			case Part2Package.RECT_PRIMITIVE__POINTER_AREA:
				return isSetPointerArea();
			case Part2Package.RECT_PRIMITIVE__TOUCH_AREA:
				return isSetTouchArea();
			case Part2Package.RECT_PRIMITIVE__GESTURE_AREA:
				return isSetGestureArea();
			case Part2Package.RECT_PRIMITIVE__SCROLL_WHEEL_AREA:
				return isSetScrollWheelArea();
			case Part2Package.RECT_PRIMITIVE__KEYBOARD_INPUT:
				return isSetKeyboardInput();
			case Part2Package.RECT_PRIMITIVE__COMPOSITIONS:
				return isSetCompositions();
			case Part2Package.RECT_PRIMITIVE__CLIP_PATH:
				return isSetClipPath();
			case Part2Package.RECT_PRIMITIVE__CLIP_RULE:
				return isSetClipRule();
			case Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.RECT_PRIMITIVE__FILL:
				return isSetFill();
			case Part2Package.RECT_PRIMITIVE__FILL_OPACITY:
				return isSetFillOpacity();
			case Part2Package.RECT_PRIMITIVE__FILL_RULE:
				return isSetFillRule();
			case Part2Package.RECT_PRIMITIVE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Part2Package.RECT_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.RECT_PRIMITIVE__RX:
				return RX_EDEFAULT == null ? rx != null : !RX_EDEFAULT.equals(rx);
			case Part2Package.RECT_PRIMITIVE__RY:
				return RY_EDEFAULT == null ? ry != null : !RY_EDEFAULT.equals(ry);
			case Part2Package.RECT_PRIMITIVE__STROKE:
				return isSetStroke();
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY:
				return isSetStrokeDasharray();
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET:
				return isSetStrokeDashoffset();
			case Part2Package.RECT_PRIMITIVE__STROKE_LINECAP:
				return isSetStrokeLinecap();
			case Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN:
				return isSetStrokeLinejoin();
			case Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT:
				return isSetStrokeMiterlimit();
			case Part2Package.RECT_PRIMITIVE__STROKE_OPACITY:
				return isSetStrokeOpacity();
			case Part2Package.RECT_PRIMITIVE__STROKEWIDTH:
				return isSetStrokewidth();
			case Part2Package.RECT_PRIMITIVE__TRANSFORM:
				return isSetTransform();
			case Part2Package.RECT_PRIMITIVE__VISIBILITY:
				return isSetVisibility();
			case Part2Package.RECT_PRIMITIVE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Part2Package.RECT_PRIMITIVE__X:
				return isSetX();
			case Part2Package.RECT_PRIMITIVE__Y:
				return isSetY();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clipPath: ");
		if (clipPathESet) result.append(clipPath); else result.append("<unset>");
		result.append(", clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(", drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillOpacity: ");
		if (fillOpacityESet) result.append(fillOpacity); else result.append("<unset>");
		result.append(", fillRule: ");
		if (fillRuleESet) result.append(fillRule); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", rx: ");
		result.append(rx);
		result.append(", ry: ");
		result.append(ry);
		result.append(", stroke: ");
		if (strokeESet) result.append(stroke); else result.append("<unset>");
		result.append(", strokeDasharray: ");
		if (strokeDasharrayESet) result.append(strokeDasharray); else result.append("<unset>");
		result.append(", strokeDashoffset: ");
		if (strokeDashoffsetESet) result.append(strokeDashoffset); else result.append("<unset>");
		result.append(", strokeLinecap: ");
		if (strokeLinecapESet) result.append(strokeLinecap); else result.append("<unset>");
		result.append(", strokeLinejoin: ");
		if (strokeLinejoinESet) result.append(strokeLinejoin); else result.append("<unset>");
		result.append(", strokeMiterlimit: ");
		if (strokeMiterlimitESet) result.append(strokeMiterlimit); else result.append("<unset>");
		result.append(", strokeOpacity: ");
		if (strokeOpacityESet) result.append(strokeOpacity); else result.append("<unset>");
		result.append(", strokewidth: ");
		if (strokewidthESet) result.append(strokewidth); else result.append("<unset>");
		result.append(", transform: ");
		if (transformESet) result.append(transform); else result.append("<unset>");
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RectPrimitiveImpl
