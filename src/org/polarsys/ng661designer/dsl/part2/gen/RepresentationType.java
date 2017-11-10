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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TO DO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.RepresentationType#getCompositions <em>Compositions</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getRepresentationType()
 * @model
 * @generated
 */
public interface RepresentationType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.RepresentationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationTypes> getGroup();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.GroupPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' reference list.
	 * @see #isSetGroup1()
	 * @see #unsetGroup1()
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Group1()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GroupPrimitive> getGroup1();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getGroup1 <em>Group1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroup1()
	 * @see #getGroup1()
	 * @generated
	 */
	void unsetGroup1();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getGroup1 <em>Group1</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group1</em>' reference list is set.
	 * @see #unsetGroup1()
	 * @see #getGroup1()
	 * @generated
	 */
	boolean isSetGroup1();

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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Children()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ChildPrimitive> getChildren();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getChildren <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	void unsetChildren();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getChildren <em>Children</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Rectangle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getRectangle <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	void unsetRectangle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getRectangle <em>Rectangle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Circle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getCircle <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	void unsetCircle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getCircle <em>Circle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Ellipse()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getEllipse <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	void unsetEllipse();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getEllipse <em>Ellipse</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Line()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getLine <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getLine <em>Line</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Polyline()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolylinePrimitive> getPolyline();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getPolyline <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	void unsetPolyline();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getPolyline <em>Polyline</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Polygon()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolygonPrimitive> getPolygon();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getPolygon <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	void unsetPolygon();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getPolygon <em>Polygon</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Path()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PathPrimitive> getPath();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getPath <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getPath <em>Path</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Image()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ImagePrimitive> getImage();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getImage <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImage()
	 * @see #getImage()
	 * @generated
	 */
	void unsetImage();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getImage <em>Image</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Text()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TextPrimitive> getText();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getText <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getText <em>Text</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Arc()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ArcComponent> getArc();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getArc <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArc()
	 * @see #getArc()
	 * @generated
	 */
	void unsetArc();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getArc <em>Arc</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Crown()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CrownComponent> getCrown();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getCrown <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	void unsetCrown();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getCrown <em>Crown</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_PolarLine()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolarLineComponent> getPolarLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getPolarLine <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	void unsetPolarLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getPolarLine <em>Polar Line</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_PointerArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getPointerArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getPointerArea <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	void unsetPointerArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getPointerArea <em>Pointer Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_TouchArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getTouchArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getTouchArea <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	void unsetTouchArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getTouchArea <em>Touch Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_GestureArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GestureAreaPrimitive> getGestureArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getGestureArea <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	void unsetGestureArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getGestureArea <em>Gesture Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_ScrollWheelArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ScrollWheelAreaPrimitive> getScrollWheelArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollWheelArea()
	 * @see #getScrollWheelArea()
	 * @generated
	 */
	void unsetScrollWheelArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_KeyboardInput()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<KeyboardInputPrimitive> getKeyboardInput();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getKeyboardInput <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	void unsetKeyboardInput();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getKeyboardInput <em>Keyboard Input</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keyboard Input</em>' reference list is set.
	 * @see #unsetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	boolean isSetKeyboardInput();

	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ClipPathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' reference list.
	 * @see #isSetClipPath()
	 * @see #unsetClipPath()
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_ClipPath()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ClipPathPrimitive> getClipPath();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getClipPath <em>Clip Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipPath()
	 * @see #getClipPath()
	 * @generated
	 */
	void unsetClipPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getClipPath <em>Clip Path</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Path</em>' reference list is set.
	 * @see #unsetClipPath()
	 * @see #getClipPath()
	 * @generated
	 */
	boolean isSetClipPath();

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
	 * @see org.example.ng661.part2.Part2Package#getRepresentationType_Compositions()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<WidgetComposition> getCompositions();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.RepresentationType#getCompositions <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	void unsetCompositions();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.RepresentationType#getCompositions <em>Compositions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compositions</em>' reference list is set.
	 * @see #unsetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	boolean isSetCompositions();

} // RepresentationType
