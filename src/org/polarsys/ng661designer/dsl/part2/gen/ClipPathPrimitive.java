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
 * A representation of the model object '<em><b>Clip Path Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.ClipPathPrimitive#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive()
 * @model
 * @generated
 */
public interface ClipPathPrimitive extends RepresentationTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ClipRepresentationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClipRepresentationTypes> getGroup();

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
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Rectangle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	void unsetRectangle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Circle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getCircle <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	void unsetCircle();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getCircle <em>Circle</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Ellipse()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	void unsetEllipse();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}' reference list is set.
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
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Line()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getLine <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getLine <em>Line</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line</em>' reference list is set.
	 * @see #unsetLine()
	 * @see #getLine()
	 * @generated
	 */
	boolean isSetLine();

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
	 * @see org.example.ng661.part2.Part2Package#getClipPathPrimitive_Path()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PathPrimitive> getPath();

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getPath <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ClipPathPrimitive#getPath <em>Path</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path</em>' reference list is set.
	 * @see #unsetPath()
	 * @see #getPath()
	 * @generated
	 */
	boolean isSetPath();

} // ClipPathPrimitive
