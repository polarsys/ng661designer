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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.GroupPrimitive#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive()
 * @model
 * @generated
 */
public interface GroupPrimitive extends RepresentationTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Child Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.RepresentationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Elements</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_ChildElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationTypes> getChildElements();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.GroupPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see #isSetGroup()
	 * @see #unsetGroup()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Group()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GroupPrimitive> getGroup();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getGroup <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroup()
	 * @see #getGroup()
	 * @generated
	 */
	void unsetGroup();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getGroup <em>Group</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group</em>' reference list is set.
	 * @see #unsetGroup()
	 * @see #getGroup()
	 * @generated
	 */
	boolean isSetGroup();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ChildPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see #isSetChildren()
	 * @see #unsetChildren()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Children()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ChildPrimitive> getChildren();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getChildren <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	void unsetChildren();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getChildren <em>Children</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Children</em>' reference list is set.
	 * @see #unsetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	boolean isSetChildren();

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.RectPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' reference list.
	 * @see #isSetRectangle()
	 * @see #unsetRectangle()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Rectangle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getRectangle <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	void unsetRectangle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getRectangle <em>Rectangle</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rectangle</em>' reference list is set.
	 * @see #unsetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	boolean isSetRectangle();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.CirclePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' reference list.
	 * @see #isSetCircle()
	 * @see #unsetCircle()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Circle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCircle <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	void unsetCircle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCircle <em>Circle</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Circle</em>' reference list is set.
	 * @see #unsetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	boolean isSetCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.EllipsePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' reference list.
	 * @see #isSetEllipse()
	 * @see #unsetEllipse()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Ellipse()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getEllipse <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	void unsetEllipse();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getEllipse <em>Ellipse</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ellipse</em>' reference list is set.
	 * @see #unsetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	boolean isSetEllipse();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.LinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see #isSetLine()
	 * @see #unsetLine()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Line()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getLine <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getLine <em>Line</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line</em>' reference list is set.
	 * @see #unsetLine()
	 * @see #getLine()
	 * @generated
	 */
	boolean isSetLine();

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PolylinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' reference list.
	 * @see #isSetPolyline()
	 * @see #unsetPolyline()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Polyline()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolylinePrimitive> getPolyline();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolyline <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	void unsetPolyline();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolyline <em>Polyline</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polyline</em>' reference list is set.
	 * @see #unsetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	boolean isSetPolyline();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PolygonPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' reference list.
	 * @see #isSetPolygon()
	 * @see #unsetPolygon()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Polygon()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolygonPrimitive> getPolygon();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolygon <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	void unsetPolygon();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolygon <em>Polygon</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polygon</em>' reference list is set.
	 * @see #unsetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	boolean isSetPolygon();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Path()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PathPrimitive> getPath();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPath <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPath <em>Path</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path</em>' reference list is set.
	 * @see #unsetPath()
	 * @see #getPath()
	 * @generated
	 */
	boolean isSetPath();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ImagePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference list.
	 * @see #isSetImage()
	 * @see #unsetImage()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Image()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ImagePrimitive> getImage();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getImage <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImage()
	 * @see #getImage()
	 * @generated
	 */
	void unsetImage();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getImage <em>Image</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image</em>' reference list is set.
	 * @see #unsetImage()
	 * @see #getImage()
	 * @generated
	 */
	boolean isSetImage();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.TextPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference list.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Text()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TextPrimitive> getText();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getText <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getText <em>Text</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' reference list is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	boolean isSetText();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ArcComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' reference list.
	 * @see #isSetArc()
	 * @see #unsetArc()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Arc()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ArcComponent> getArc();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getArc <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArc()
	 * @see #getArc()
	 * @generated
	 */
	void unsetArc();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getArc <em>Arc</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arc</em>' reference list is set.
	 * @see #unsetArc()
	 * @see #getArc()
	 * @generated
	 */
	boolean isSetArc();

	/**
	 * Returns the value of the '<em><b>Crown</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.CrownComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crown</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crown</em>' reference list.
	 * @see #isSetCrown()
	 * @see #unsetCrown()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Crown()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CrownComponent> getCrown();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCrown <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	void unsetCrown();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCrown <em>Crown</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crown</em>' reference list is set.
	 * @see #unsetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	boolean isSetCrown();

	/**
	 * Returns the value of the '<em><b>Polar Line</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PolarLineComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polar Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polar Line</em>' reference list.
	 * @see #isSetPolarLine()
	 * @see #unsetPolarLine()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_PolarLine()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolarLineComponent> getPolarLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolarLine <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	void unsetPolarLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPolarLine <em>Polar Line</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polar Line</em>' reference list is set.
	 * @see #unsetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	boolean isSetPolarLine();

	/**
	 * Returns the value of the '<em><b>Pointer Area</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PointerAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Area</em>' reference list.
	 * @see #isSetPointerArea()
	 * @see #unsetPointerArea()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_PointerArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getPointerArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPointerArea <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	void unsetPointerArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getPointerArea <em>Pointer Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pointer Area</em>' reference list is set.
	 * @see #unsetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	boolean isSetPointerArea();

	/**
	 * Returns the value of the '<em><b>Touch Area</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.PointerAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touch Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touch Area</em>' reference list.
	 * @see #isSetTouchArea()
	 * @see #unsetTouchArea()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_TouchArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getTouchArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getTouchArea <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	void unsetTouchArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getTouchArea <em>Touch Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Touch Area</em>' reference list is set.
	 * @see #unsetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	boolean isSetTouchArea();

	/**
	 * Returns the value of the '<em><b>Gesture Area</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.GestureAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gesture Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesture Area</em>' reference list.
	 * @see #isSetGestureArea()
	 * @see #unsetGestureArea()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_GestureArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GestureAreaPrimitive> getGestureArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getGestureArea <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	void unsetGestureArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getGestureArea <em>Gesture Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gesture Area</em>' reference list is set.
	 * @see #unsetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	boolean isSetGestureArea();

	/**
	 * Returns the value of the '<em><b>Scroll Wheel Area</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ScrollWheelAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll Wheel Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll Wheel Area</em>' reference list.
	 * @see #isSetScrollWheelArea()
	 * @see #unsetScrollWheelArea()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_ScrollWheelArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ScrollWheelAreaPrimitive> getScrollWheelArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollWheelArea()
	 * @see #getScrollWheelArea()
	 * @generated
	 */
	void unsetScrollWheelArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scroll Wheel Area</em>' reference list is set.
	 * @see #unsetScrollWheelArea()
	 * @see #getScrollWheelArea()
	 * @generated
	 */
	boolean isSetScrollWheelArea();

	/**
	 * Returns the value of the '<em><b>Keyboard Input</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.KeyboardInputPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard Input</em>' reference list.
	 * @see #isSetKeyboardInput()
	 * @see #unsetKeyboardInput()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_KeyboardInput()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<KeyboardInputPrimitive> getKeyboardInput();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	void unsetKeyboardInput();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keyboard Input</em>' reference list is set.
	 * @see #unsetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	boolean isSetKeyboardInput();

	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.WidgetComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see #isSetCompositions()
	 * @see #unsetCompositions()
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Compositions()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<WidgetComposition> getCompositions();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCompositions <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	void unsetCompositions();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getCompositions <em>Compositions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compositions</em>' reference list is set.
	 * @see #unsetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	boolean isSetCompositions();

	/**
	 * Returns the value of the '<em><b>Drawing Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Priority</em>' attribute.
	 * @see #isSetDrawingPriority()
	 * @see #unsetDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Priority</em>' attribute.
	 * @see #isSetDrawingPriority()
	 * @see #unsetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @generated
	 */
	void setDrawingPriority(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drawing Priority</em>' attribute is set.
	 * @see #unsetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	boolean isSetDrawingPriority();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #setTransform(String)
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getTransform <em>Transform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform</em>' attribute is set.
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	boolean isSetTransform();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"visible"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(Object)
	 * @see org.example.ng661.part2.Part2Package#getGroupPrimitive_Visibility()
	 * @model default="visible" unsettable="true" dataType="org.example.ng661.part2.VisibilityType"
	 * @generated
	 */
	Object getVisibility();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.GroupPrimitive#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.GroupPrimitive#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	boolean isSetVisibility();

} // GroupPrimitive
