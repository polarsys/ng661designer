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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polar Line Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getR <em>R</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getX1 <em>X1</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolarLineComponent#getY1 <em>Y1</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent()
 * @model
 * @generated
 */
public interface PolarLineComponent extends RepresentationTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Angle()
	 * @model dataType="org.example.ng661.part2.AngleType"
	 * @generated
	 */
	Object getAngle();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Object value);

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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_ClipPath()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipPath();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipPath <em>Clip Path</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipPath()
	 * @see #getClipPath()
	 * @see #setClipPath(String)
	 * @generated
	 */
	void unsetClipPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipPath <em>Clip Path</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_ClipRule()
	 * @model default="nonzero" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipRule();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipRule <em>Clip Rule</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(String)
	 * @generated
	 */
	void unsetClipRule();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getClipRule <em>Clip Rule</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_R()
	 * @model dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getR();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(Object value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #setStroke(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Stroke()
	 * @model default="white" unsettable="true" dataType="org.example.ng661.part2.ColorType"
	 * @generated
	 */
	Object getStroke();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Object)
	 * @generated
	 */
	void unsetStroke();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStroke <em>Stroke</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke</em>' attribute is set.
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Object)
	 * @generated
	 */
	boolean isSetStroke();

	/**
	 * Returns the value of the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dasharray</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #isSetStrokeDasharray()
	 * @see #unsetStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeDasharray()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeDasharray();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #isSetStrokeDasharray()
	 * @see #unsetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @generated
	 */
	void setStrokeDasharray(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @generated
	 */
	void unsetStrokeDasharray();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Dasharray</em>' attribute is set.
	 * @see #unsetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @generated
	 */
	boolean isSetStrokeDasharray();

	/**
	 * Returns the value of the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dashoffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dashoffset</em>' attribute.
	 * @see #isSetStrokeDashoffset()
	 * @see #unsetStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeDashoffset()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getStrokeDashoffset();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dashoffset</em>' attribute.
	 * @see #isSetStrokeDashoffset()
	 * @see #unsetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @generated
	 */
	void setStrokeDashoffset(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @generated
	 */
	void unsetStrokeDashoffset();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Dashoffset</em>' attribute is set.
	 * @see #unsetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @generated
	 */
	boolean isSetStrokeDashoffset();

	/**
	 * Returns the value of the '<em><b>Stroke Linecap</b></em>' attribute.
	 * The default value is <code>"butt"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Linecap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linecap</em>' attribute.
	 * @see #isSetStrokeLinecap()
	 * @see #unsetStrokeLinecap()
	 * @see #setStrokeLinecap(String)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeLinecap()
	 * @model default="butt" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeLinecap();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linecap</em>' attribute.
	 * @see #isSetStrokeLinecap()
	 * @see #unsetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @generated
	 */
	void setStrokeLinecap(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @see #setStrokeLinecap(String)
	 * @generated
	 */
	void unsetStrokeLinecap();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Linecap</em>' attribute is set.
	 * @see #unsetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @see #setStrokeLinecap(String)
	 * @generated
	 */
	boolean isSetStrokeLinecap();

	/**
	 * Returns the value of the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * The default value is <code>"miter"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Linejoin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #setStrokeLinejoin(String)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeLinejoin()
	 * @model default="miter" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeLinejoin();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @generated
	 */
	void setStrokeLinejoin(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(String)
	 * @generated
	 */
	void unsetStrokeLinejoin();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Linejoin</em>' attribute is set.
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(String)
	 * @generated
	 */
	boolean isSetStrokeLinejoin();

	/**
	 * Returns the value of the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Miterlimit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Miterlimit</em>' attribute.
	 * @see #isSetStrokeMiterlimit()
	 * @see #unsetStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeMiterlimit()
	 * @model default="4.0" unsettable="true" dataType="org.example.ng661.part2.RealType"
	 * @generated
	 */
	Object getStrokeMiterlimit();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Miterlimit</em>' attribute.
	 * @see #isSetStrokeMiterlimit()
	 * @see #unsetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @generated
	 */
	void setStrokeMiterlimit(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @generated
	 */
	void unsetStrokeMiterlimit();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Miterlimit</em>' attribute is set.
	 * @see #unsetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @generated
	 */
	boolean isSetStrokeMiterlimit();

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_StrokeOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.OpacityType"
	 * @generated
	 */
	Object getStrokeOpacity();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @generated
	 */
	void unsetStrokeOpacity();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Opacity</em>' attribute is set.
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @generated
	 */
	boolean isSetStrokeOpacity();

	/**
	 * Returns the value of the '<em><b>Strokewidth</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strokewidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strokewidth</em>' attribute.
	 * @see #isSetStrokewidth()
	 * @see #unsetStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Strokewidth()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getStrokewidth();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strokewidth</em>' attribute.
	 * @see #isSetStrokewidth()
	 * @see #unsetStrokewidth()
	 * @see #getStrokewidth()
	 * @generated
	 */
	void setStrokewidth(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokewidth()
	 * @see #getStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @generated
	 */
	void unsetStrokewidth();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strokewidth</em>' attribute is set.
	 * @see #unsetStrokewidth()
	 * @see #getStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @generated
	 */
	boolean isSetStrokewidth();

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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getTransform <em>Transform</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getTransform <em>Transform</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Visibility()
	 * @model default="visible" unsettable="true" dataType="org.example.ng661.part2.VisibilityType"
	 * @generated
	 */
	Object getVisibility();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolarLineComponent#getVisibility <em>Visibility</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_X1()
	 * @model dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getX1();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(Object value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolarLineComponent_Y1()
	 * @model dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getY1();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolarLineComponent#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(Object value);

} // PolarLineComponent
