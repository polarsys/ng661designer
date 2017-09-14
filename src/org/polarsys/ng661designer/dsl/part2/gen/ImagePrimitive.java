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
 * A representation of the model object '<em><b>Image Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getChildren <em>Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getImage <em>Image</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getText <em>Text</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getArc <em>Arc</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getSource <em>Source</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.ImagePrimitive#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getImagePrimitive()
 * @model
 * @generated
 */
public interface ImagePrimitive extends RepresentationTypes {
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_ChildElements()
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Group()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GroupPrimitive> getGroup();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getGroup <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroup()
	 * @see #getGroup()
	 * @generated
	 */
	void unsetGroup();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getGroup <em>Group</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Children()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ChildPrimitive> getChildren();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getChildren <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	void unsetChildren();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getChildren <em>Children</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Rectangle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getRectangle <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	void unsetRectangle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getRectangle <em>Rectangle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Circle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCircle <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	void unsetCircle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCircle <em>Circle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Ellipse()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getEllipse <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	void unsetEllipse();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getEllipse <em>Ellipse</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Line()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getLine <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getLine <em>Line</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Polyline()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolylinePrimitive> getPolyline();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolyline <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	void unsetPolyline();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolyline <em>Polyline</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Polygon()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolygonPrimitive> getPolygon();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolygon <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	void unsetPolygon();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolygon <em>Polygon</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Path()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PathPrimitive> getPath();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPath <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPath <em>Path</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Image()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ImagePrimitive> getImage();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getImage <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImage()
	 * @see #getImage()
	 * @generated
	 */
	void unsetImage();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getImage <em>Image</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Text()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TextPrimitive> getText();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getText <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getText <em>Text</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Arc()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ArcComponent> getArc();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getArc <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArc()
	 * @see #getArc()
	 * @generated
	 */
	void unsetArc();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getArc <em>Arc</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Crown()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CrownComponent> getCrown();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCrown <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	void unsetCrown();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCrown <em>Crown</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_PolarLine()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolarLineComponent> getPolarLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolarLine <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	void unsetPolarLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPolarLine <em>Polar Line</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_PointerArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getPointerArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPointerArea <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	void unsetPointerArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getPointerArea <em>Pointer Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_TouchArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getTouchArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getTouchArea <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	void unsetTouchArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getTouchArea <em>Touch Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_GestureArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GestureAreaPrimitive> getGestureArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getGestureArea <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	void unsetGestureArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getGestureArea <em>Gesture Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_ScrollWheelArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ScrollWheelAreaPrimitive> getScrollWheelArea();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollWheelArea()
	 * @see #getScrollWheelArea()
	 * @generated
	 */
	void unsetScrollWheelArea();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getScrollWheelArea <em>Scroll Wheel Area</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_KeyboardInput()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<KeyboardInputPrimitive> getKeyboardInput();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getKeyboardInput <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	void unsetKeyboardInput();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getKeyboardInput <em>Keyboard Input</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Compositions()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<WidgetComposition> getCompositions();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCompositions <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	void unsetCompositions();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getCompositions <em>Compositions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compositions</em>' reference list is set.
	 * @see #unsetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	boolean isSetCompositions();

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"topLeft"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Alignment()
	 * @model default="topLeft" unsettable="true" dataType="org.example.ng661.part2.AlignementType"
	 * @generated
	 */
	Object getAlignment();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(Object)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(Object)
	 * @generated
	 */
	boolean isSetAlignment();

	/**
	 * Returns the value of the '<em><b>Aspect Ratio</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Ratio</em>' attribute.
	 * @see #isSetAspectRatio()
	 * @see #unsetAspectRatio()
	 * @see #setAspectRatio(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_AspectRatio()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.AspectRatioType"
	 * @generated
	 */
	Object getAspectRatio();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Ratio</em>' attribute.
	 * @see #isSetAspectRatio()
	 * @see #unsetAspectRatio()
	 * @see #getAspectRatio()
	 * @generated
	 */
	void setAspectRatio(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAspectRatio()
	 * @see #getAspectRatio()
	 * @see #setAspectRatio(Object)
	 * @generated
	 */
	void unsetAspectRatio();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aspect Ratio</em>' attribute is set.
	 * @see #unsetAspectRatio()
	 * @see #getAspectRatio()
	 * @see #setAspectRatio(Object)
	 * @generated
	 */
	boolean isSetAspectRatio();

	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' attribute.
	 * @see #isSetClipPath()
	 * @see #unsetClipPath()
	 * @see #setClipPath(String)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_ClipPath()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipPath();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path</em>' attribute.
	 * @see #isSetClipPath()
	 * @see #unsetClipPath()
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipPath()
	 * @see #getClipPath()
	 * @see #setClipPath(String)
	 * @generated
	 */
	void unsetClipPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipPath <em>Clip Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Path</em>' attribute is set.
	 * @see #unsetClipPath()
	 * @see #getClipPath()
	 * @see #setClipPath(String)
	 * @generated
	 */
	boolean isSetClipPath();

	/**
	 * Returns the value of the '<em><b>Clip Rule</b></em>' attribute.
	 * The default value is <code>"nonzero"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Rule</em>' attribute.
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #setClipRule(String)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_ClipRule()
	 * @model default="nonzero" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipRule();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Rule</em>' attribute.
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @generated
	 */
	void setClipRule(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(String)
	 * @generated
	 */
	void unsetClipRule();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getClipRule <em>Clip Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Rule</em>' attribute is set.
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(String)
	 * @generated
	 */
	boolean isSetClipRule();

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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Height()
	 * @model dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getHeight();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Object value);

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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Source()
	 * @model dataType="org.example.ng661.part2.ImageType"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getTransform <em>Transform</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getTransform <em>Transform</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Visibility()
	 * @model default="visible" unsettable="true" dataType="org.example.ng661.part2.VisibilityType"
	 * @generated
	 */
	Object getVisibility();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	boolean isSetVisibility();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Width()
	 * @model dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_X()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(Object)
	 * @see org.example.ng661.part2.Part2Package#getImagePrimitive_Y()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ImagePrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ImagePrimitive#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	boolean isSetY();

} // ImagePrimitive
