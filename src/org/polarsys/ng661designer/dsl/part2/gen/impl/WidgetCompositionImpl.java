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
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.CrownComponent;
import org.polarsys.ng661designer.dsl.part2.gen.EllipsePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.GestureAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.GroupPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ImagePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.KeyboardInputPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PointerAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolarLineComponent;
import org.polarsys.ng661designer.dsl.part2.gen.PolygonPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolylinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyValue;
import org.polarsys.ng661designer.dsl.part2.gen.RectPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationTypes;
import org.polarsys.ng661designer.dsl.part2.gen.ScrollWheelAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.TouchAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.WidgetComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.WidgetCompositionImpl#getKeyboardInput <em>Keyboard Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetCompositionImpl extends RepresentationTypesImpl implements WidgetComposition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionType representation;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValue> values;

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
	protected EList<TouchAreaPrimitive> touchArea;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getWidgetComposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (ComponentDefinitionType)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Part2Package.WIDGET_COMPOSITION__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(ComponentDefinitionType newRepresentation) {
		ComponentDefinitionType oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.WIDGET_COMPOSITION__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, Part2Package.WIDGET_COMPOSITION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationTypes> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentEList<RepresentationTypes>(RepresentationTypes.class, this, Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS);
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
			group = new EObjectResolvingEList.Unsettable<GroupPrimitive>(GroupPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__GROUP);
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
			children = new EObjectResolvingEList.Unsettable<ChildPrimitive>(ChildPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__CHILDREN);
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
			rectangle = new EObjectResolvingEList.Unsettable<RectPrimitive>(RectPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__RECTANGLE);
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
			circle = new EObjectResolvingEList.Unsettable<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__CIRCLE);
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
			ellipse = new EObjectResolvingEList.Unsettable<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__ELLIPSE);
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
			line = new EObjectResolvingEList.Unsettable<LinePrimitive>(LinePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__LINE);
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
			polyline = new EObjectResolvingEList.Unsettable<PolylinePrimitive>(PolylinePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POLYLINE);
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
			polygon = new EObjectResolvingEList.Unsettable<PolygonPrimitive>(PolygonPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POLYGON);
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
			path = new EObjectResolvingEList.Unsettable<PathPrimitive>(PathPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__PATH);
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
			image = new EObjectResolvingEList.Unsettable<ImagePrimitive>(ImagePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__IMAGE);
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
			text = new EObjectResolvingEList.Unsettable<TextPrimitive>(TextPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__TEXT);
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
			arc = new EObjectResolvingEList.Unsettable<ArcComponent>(ArcComponent.class, this, Part2Package.WIDGET_COMPOSITION__ARC);
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
			crown = new EObjectResolvingEList.Unsettable<CrownComponent>(CrownComponent.class, this, Part2Package.WIDGET_COMPOSITION__CROWN);
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
			polarLine = new EObjectResolvingEList.Unsettable<PolarLineComponent>(PolarLineComponent.class, this, Part2Package.WIDGET_COMPOSITION__POLAR_LINE);
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
			pointerArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POINTER_AREA);
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
	public EList<TouchAreaPrimitive> getTouchArea() {
		if (touchArea == null) {
			touchArea = new EObjectResolvingEList.Unsettable<TouchAreaPrimitive>(TouchAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__TOUCH_AREA);
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
			gestureArea = new EObjectResolvingEList.Unsettable<GestureAreaPrimitive>(GestureAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__GESTURE_AREA);
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
			scrollWheelArea = new EObjectResolvingEList.Unsettable<ScrollWheelAreaPrimitive>(ScrollWheelAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_AREA);
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
			keyboardInput = new EObjectResolvingEList.Unsettable<KeyboardInputPrimitive>(KeyboardInputPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return getValues();
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				return getChildElements();
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				return getGroup();
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				return getChildren();
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				return getRectangle();
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				return getCircle();
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				return getEllipse();
			case Part2Package.WIDGET_COMPOSITION__LINE:
				return getLine();
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				return getPolyline();
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				return getPolygon();
			case Part2Package.WIDGET_COMPOSITION__PATH:
				return getPath();
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				return getImage();
			case Part2Package.WIDGET_COMPOSITION__TEXT:
				return getText();
			case Part2Package.WIDGET_COMPOSITION__ARC:
				return getArc();
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				return getCrown();
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				return getPolarLine();
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				return getPointerArea();
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				return getTouchArea();
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				return getGestureArea();
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_AREA:
				return getScrollWheelArea();
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				return getKeyboardInput();
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				setRepresentation((ComponentDefinitionType)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends PropertyValue>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends RepresentationTypes>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends GroupPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ChildPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylinePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImagePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends ArcComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				getCrown().clear();
				getCrown().addAll((Collection<? extends CrownComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				getPolarLine().clear();
				getPolarLine().addAll((Collection<? extends PolarLineComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				getPointerArea().clear();
				getPointerArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				getTouchArea().clear();
				getTouchArea().addAll((Collection<? extends TouchAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				getGestureArea().clear();
				getGestureArea().addAll((Collection<? extends GestureAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_AREA:
				getScrollWheelArea().clear();
				getScrollWheelArea().addAll((Collection<? extends ScrollWheelAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				getKeyboardInput().clear();
				getKeyboardInput().addAll((Collection<? extends KeyboardInputPrimitive>)newValue);
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				setRepresentation((ComponentDefinitionType)null);
				return;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				getValues().clear();
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				unsetGroup();
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				unsetChildren();
				return;
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				unsetRectangle();
				return;
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				unsetCircle();
				return;
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				unsetEllipse();
				return;
			case Part2Package.WIDGET_COMPOSITION__LINE:
				unsetLine();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				unsetPolyline();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				unsetPolygon();
				return;
			case Part2Package.WIDGET_COMPOSITION__PATH:
				unsetPath();
				return;
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				unsetImage();
				return;
			case Part2Package.WIDGET_COMPOSITION__TEXT:
				unsetText();
				return;
			case Part2Package.WIDGET_COMPOSITION__ARC:
				unsetArc();
				return;
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				unsetCrown();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				unsetPolarLine();
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				unsetPointerArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				unsetTouchArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				unsetGestureArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_AREA:
				unsetScrollWheelArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				unsetKeyboardInput();
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				return representation != null;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return values != null && !values.isEmpty();
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				return isSetGroup();
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				return isSetChildren();
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				return isSetRectangle();
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				return isSetCircle();
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				return isSetEllipse();
			case Part2Package.WIDGET_COMPOSITION__LINE:
				return isSetLine();
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				return isSetPolyline();
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				return isSetPolygon();
			case Part2Package.WIDGET_COMPOSITION__PATH:
				return isSetPath();
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				return isSetImage();
			case Part2Package.WIDGET_COMPOSITION__TEXT:
				return isSetText();
			case Part2Package.WIDGET_COMPOSITION__ARC:
				return isSetArc();
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				return isSetCrown();
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				return isSetPolarLine();
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				return isSetPointerArea();
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				return isSetTouchArea();
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				return isSetGestureArea();
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_AREA:
				return isSetScrollWheelArea();
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				return isSetKeyboardInput();
		}
		return super.eIsSet(featureID);
	}

} //WidgetCompositionImpl
