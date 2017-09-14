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
 * An implementation of the model object '<em><b>Image Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ImagePrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagePrimitiveImpl extends RepresentationTypesImpl implements ImagePrimitive {
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
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Object ALIGNMENT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getAlignementType(), "topLeft");

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Object alignment = ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentESet;

	/**
	 * The default value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Object ASPECT_RATIO_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getAspectRatioType(), "none");

	/**
	 * The cached value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected Object aspectRatio = ASPECT_RATIO_EDEFAULT;

	/**
	 * This is true if the Aspect Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aspectRatioESet;

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
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

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
	protected ImagePrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getImagePrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationTypes> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentEList<RepresentationTypes>(RepresentationTypes.class, this, Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS);
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
			group = new EObjectResolvingEList.Unsettable<GroupPrimitive>(GroupPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__GROUP);
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
			children = new EObjectResolvingEList.Unsettable<ChildPrimitive>(ChildPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__CHILDREN);
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
			rectangle = new EObjectResolvingEList.Unsettable<RectPrimitive>(RectPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__RECTANGLE);
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
			circle = new EObjectResolvingEList.Unsettable<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__CIRCLE);
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
			ellipse = new EObjectResolvingEList.Unsettable<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__ELLIPSE);
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
			line = new EObjectResolvingEList.Unsettable<LinePrimitive>(LinePrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__LINE);
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
			polyline = new EObjectResolvingEList.Unsettable<PolylinePrimitive>(PolylinePrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__POLYLINE);
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
			polygon = new EObjectResolvingEList.Unsettable<PolygonPrimitive>(PolygonPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__POLYGON);
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
			path = new EObjectResolvingEList.Unsettable<PathPrimitive>(PathPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__PATH);
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
			image = new EObjectResolvingEList.Unsettable<ImagePrimitive>(ImagePrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__IMAGE);
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
			text = new EObjectResolvingEList.Unsettable<TextPrimitive>(TextPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__TEXT);
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
			arc = new EObjectResolvingEList.Unsettable<ArcComponent>(ArcComponent.class, this, Part2Package.IMAGE_PRIMITIVE__ARC);
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
			crown = new EObjectResolvingEList.Unsettable<CrownComponent>(CrownComponent.class, this, Part2Package.IMAGE_PRIMITIVE__CROWN);
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
			polarLine = new EObjectResolvingEList.Unsettable<PolarLineComponent>(PolarLineComponent.class, this, Part2Package.IMAGE_PRIMITIVE__POLAR_LINE);
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
			pointerArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__POINTER_AREA);
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
			touchArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__TOUCH_AREA);
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
			gestureArea = new EObjectResolvingEList.Unsettable<GestureAreaPrimitive>(GestureAreaPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__GESTURE_AREA);
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
			scrollWheelArea = new EObjectResolvingEList.Unsettable<ScrollWheelAreaPrimitive>(ScrollWheelAreaPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA);
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
			keyboardInput = new EObjectResolvingEList.Unsettable<KeyboardInputPrimitive>(KeyboardInputPrimitive.class, this, Part2Package.IMAGE_PRIMITIVE__KEYBOARD_INPUT);
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
			compositions = new EObjectResolvingEList.Unsettable<WidgetComposition>(WidgetComposition.class, this, Part2Package.IMAGE_PRIMITIVE__COMPOSITIONS);
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
	public Object getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Object newAlignment) {
		Object oldAlignment = alignment;
		alignment = newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		Object oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT, oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignment() {
		return alignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAspectRatio() {
		return aspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRatio(Object newAspectRatio) {
		Object oldAspectRatio = aspectRatio;
		aspectRatio = newAspectRatio;
		boolean oldAspectRatioESet = aspectRatioESet;
		aspectRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO, oldAspectRatio, aspectRatio, !oldAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAspectRatio() {
		Object oldAspectRatio = aspectRatio;
		boolean oldAspectRatioESet = aspectRatioESet;
		aspectRatio = ASPECT_RATIO_EDEFAULT;
		aspectRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO, oldAspectRatio, ASPECT_RATIO_EDEFAULT, oldAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAspectRatio() {
		return aspectRatioESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__CLIP_PATH, oldClipPath, clipPath, !oldClipPathESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__CLIP_PATH, oldClipPath, CLIP_PATH_EDEFAULT, oldClipPathESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__TRANSFORM, oldTransform, transform, !oldTransformESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.IMAGE_PRIMITIVE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.IMAGE_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
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
			case Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS:
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
			case Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS:
				return getChildElements();
			case Part2Package.IMAGE_PRIMITIVE__GROUP:
				return getGroup();
			case Part2Package.IMAGE_PRIMITIVE__CHILDREN:
				return getChildren();
			case Part2Package.IMAGE_PRIMITIVE__RECTANGLE:
				return getRectangle();
			case Part2Package.IMAGE_PRIMITIVE__CIRCLE:
				return getCircle();
			case Part2Package.IMAGE_PRIMITIVE__ELLIPSE:
				return getEllipse();
			case Part2Package.IMAGE_PRIMITIVE__LINE:
				return getLine();
			case Part2Package.IMAGE_PRIMITIVE__POLYLINE:
				return getPolyline();
			case Part2Package.IMAGE_PRIMITIVE__POLYGON:
				return getPolygon();
			case Part2Package.IMAGE_PRIMITIVE__PATH:
				return getPath();
			case Part2Package.IMAGE_PRIMITIVE__IMAGE:
				return getImage();
			case Part2Package.IMAGE_PRIMITIVE__TEXT:
				return getText();
			case Part2Package.IMAGE_PRIMITIVE__ARC:
				return getArc();
			case Part2Package.IMAGE_PRIMITIVE__CROWN:
				return getCrown();
			case Part2Package.IMAGE_PRIMITIVE__POLAR_LINE:
				return getPolarLine();
			case Part2Package.IMAGE_PRIMITIVE__POINTER_AREA:
				return getPointerArea();
			case Part2Package.IMAGE_PRIMITIVE__TOUCH_AREA:
				return getTouchArea();
			case Part2Package.IMAGE_PRIMITIVE__GESTURE_AREA:
				return getGestureArea();
			case Part2Package.IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA:
				return getScrollWheelArea();
			case Part2Package.IMAGE_PRIMITIVE__KEYBOARD_INPUT:
				return getKeyboardInput();
			case Part2Package.IMAGE_PRIMITIVE__COMPOSITIONS:
				return getCompositions();
			case Part2Package.IMAGE_PRIMITIVE__ALIGNMENT:
				return getAlignment();
			case Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO:
				return getAspectRatio();
			case Part2Package.IMAGE_PRIMITIVE__CLIP_PATH:
				return getClipPath();
			case Part2Package.IMAGE_PRIMITIVE__CLIP_RULE:
				return getClipRule();
			case Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.IMAGE_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.IMAGE_PRIMITIVE__ID:
				return getId();
			case Part2Package.IMAGE_PRIMITIVE__SOURCE:
				return getSource();
			case Part2Package.IMAGE_PRIMITIVE__TRANSFORM:
				return getTransform();
			case Part2Package.IMAGE_PRIMITIVE__VISIBILITY:
				return getVisibility();
			case Part2Package.IMAGE_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.IMAGE_PRIMITIVE__X:
				return getX();
			case Part2Package.IMAGE_PRIMITIVE__Y:
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
			case Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends RepresentationTypes>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends GroupPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ChildPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylinePrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImagePrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends ArcComponent>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__CROWN:
				getCrown().clear();
				getCrown().addAll((Collection<? extends CrownComponent>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLAR_LINE:
				getPolarLine().clear();
				getPolarLine().addAll((Collection<? extends PolarLineComponent>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__POINTER_AREA:
				getPointerArea().clear();
				getPointerArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__TOUCH_AREA:
				getTouchArea().clear();
				getTouchArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__GESTURE_AREA:
				getGestureArea().clear();
				getGestureArea().addAll((Collection<? extends GestureAreaPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA:
				getScrollWheelArea().clear();
				getScrollWheelArea().addAll((Collection<? extends ScrollWheelAreaPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__KEYBOARD_INPUT:
				getKeyboardInput().clear();
				getKeyboardInput().addAll((Collection<? extends KeyboardInputPrimitive>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends WidgetComposition>)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ALIGNMENT:
				setAlignment(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO:
				setAspectRatio(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__CLIP_RULE:
				setClipRule((String)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__SOURCE:
				setSource((String)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__VISIBILITY:
				setVisibility(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.IMAGE_PRIMITIVE__Y:
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
			case Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case Part2Package.IMAGE_PRIMITIVE__GROUP:
				unsetGroup();
				return;
			case Part2Package.IMAGE_PRIMITIVE__CHILDREN:
				unsetChildren();
				return;
			case Part2Package.IMAGE_PRIMITIVE__RECTANGLE:
				unsetRectangle();
				return;
			case Part2Package.IMAGE_PRIMITIVE__CIRCLE:
				unsetCircle();
				return;
			case Part2Package.IMAGE_PRIMITIVE__ELLIPSE:
				unsetEllipse();
				return;
			case Part2Package.IMAGE_PRIMITIVE__LINE:
				unsetLine();
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLYLINE:
				unsetPolyline();
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLYGON:
				unsetPolygon();
				return;
			case Part2Package.IMAGE_PRIMITIVE__PATH:
				unsetPath();
				return;
			case Part2Package.IMAGE_PRIMITIVE__IMAGE:
				unsetImage();
				return;
			case Part2Package.IMAGE_PRIMITIVE__TEXT:
				unsetText();
				return;
			case Part2Package.IMAGE_PRIMITIVE__ARC:
				unsetArc();
				return;
			case Part2Package.IMAGE_PRIMITIVE__CROWN:
				unsetCrown();
				return;
			case Part2Package.IMAGE_PRIMITIVE__POLAR_LINE:
				unsetPolarLine();
				return;
			case Part2Package.IMAGE_PRIMITIVE__POINTER_AREA:
				unsetPointerArea();
				return;
			case Part2Package.IMAGE_PRIMITIVE__TOUCH_AREA:
				unsetTouchArea();
				return;
			case Part2Package.IMAGE_PRIMITIVE__GESTURE_AREA:
				unsetGestureArea();
				return;
			case Part2Package.IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA:
				unsetScrollWheelArea();
				return;
			case Part2Package.IMAGE_PRIMITIVE__KEYBOARD_INPUT:
				unsetKeyboardInput();
				return;
			case Part2Package.IMAGE_PRIMITIVE__COMPOSITIONS:
				unsetCompositions();
				return;
			case Part2Package.IMAGE_PRIMITIVE__ALIGNMENT:
				unsetAlignment();
				return;
			case Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO:
				unsetAspectRatio();
				return;
			case Part2Package.IMAGE_PRIMITIVE__CLIP_PATH:
				unsetClipPath();
				return;
			case Part2Package.IMAGE_PRIMITIVE__CLIP_RULE:
				unsetClipRule();
				return;
			case Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.IMAGE_PRIMITIVE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Part2Package.IMAGE_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.IMAGE_PRIMITIVE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case Part2Package.IMAGE_PRIMITIVE__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.IMAGE_PRIMITIVE__VISIBILITY:
				unsetVisibility();
				return;
			case Part2Package.IMAGE_PRIMITIVE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Part2Package.IMAGE_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.IMAGE_PRIMITIVE__Y:
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
			case Part2Package.IMAGE_PRIMITIVE__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case Part2Package.IMAGE_PRIMITIVE__GROUP:
				return isSetGroup();
			case Part2Package.IMAGE_PRIMITIVE__CHILDREN:
				return isSetChildren();
			case Part2Package.IMAGE_PRIMITIVE__RECTANGLE:
				return isSetRectangle();
			case Part2Package.IMAGE_PRIMITIVE__CIRCLE:
				return isSetCircle();
			case Part2Package.IMAGE_PRIMITIVE__ELLIPSE:
				return isSetEllipse();
			case Part2Package.IMAGE_PRIMITIVE__LINE:
				return isSetLine();
			case Part2Package.IMAGE_PRIMITIVE__POLYLINE:
				return isSetPolyline();
			case Part2Package.IMAGE_PRIMITIVE__POLYGON:
				return isSetPolygon();
			case Part2Package.IMAGE_PRIMITIVE__PATH:
				return isSetPath();
			case Part2Package.IMAGE_PRIMITIVE__IMAGE:
				return isSetImage();
			case Part2Package.IMAGE_PRIMITIVE__TEXT:
				return isSetText();
			case Part2Package.IMAGE_PRIMITIVE__ARC:
				return isSetArc();
			case Part2Package.IMAGE_PRIMITIVE__CROWN:
				return isSetCrown();
			case Part2Package.IMAGE_PRIMITIVE__POLAR_LINE:
				return isSetPolarLine();
			case Part2Package.IMAGE_PRIMITIVE__POINTER_AREA:
				return isSetPointerArea();
			case Part2Package.IMAGE_PRIMITIVE__TOUCH_AREA:
				return isSetTouchArea();
			case Part2Package.IMAGE_PRIMITIVE__GESTURE_AREA:
				return isSetGestureArea();
			case Part2Package.IMAGE_PRIMITIVE__SCROLL_WHEEL_AREA:
				return isSetScrollWheelArea();
			case Part2Package.IMAGE_PRIMITIVE__KEYBOARD_INPUT:
				return isSetKeyboardInput();
			case Part2Package.IMAGE_PRIMITIVE__COMPOSITIONS:
				return isSetCompositions();
			case Part2Package.IMAGE_PRIMITIVE__ALIGNMENT:
				return isSetAlignment();
			case Part2Package.IMAGE_PRIMITIVE__ASPECT_RATIO:
				return isSetAspectRatio();
			case Part2Package.IMAGE_PRIMITIVE__CLIP_PATH:
				return isSetClipPath();
			case Part2Package.IMAGE_PRIMITIVE__CLIP_RULE:
				return isSetClipRule();
			case Part2Package.IMAGE_PRIMITIVE__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.IMAGE_PRIMITIVE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Part2Package.IMAGE_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.IMAGE_PRIMITIVE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case Part2Package.IMAGE_PRIMITIVE__TRANSFORM:
				return isSetTransform();
			case Part2Package.IMAGE_PRIMITIVE__VISIBILITY:
				return isSetVisibility();
			case Part2Package.IMAGE_PRIMITIVE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Part2Package.IMAGE_PRIMITIVE__X:
				return isSetX();
			case Part2Package.IMAGE_PRIMITIVE__Y:
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
		result.append(" (alignment: ");
		if (alignmentESet) result.append(alignment); else result.append("<unset>");
		result.append(", aspectRatio: ");
		if (aspectRatioESet) result.append(aspectRatio); else result.append("<unset>");
		result.append(", clipPath: ");
		if (clipPathESet) result.append(clipPath); else result.append("<unset>");
		result.append(", clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(", drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", source: ");
		result.append(source);
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

} //ImagePrimitiveImpl
