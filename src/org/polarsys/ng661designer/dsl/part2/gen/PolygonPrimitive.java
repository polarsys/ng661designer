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
 * A representation of the model object '<em><b>Polygon Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getFill <em>Fill</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getPoints <em>Points</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.PolygonPrimitive#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive()
 * @model
 * @generated
 */
public interface PolygonPrimitive extends RepresentationTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Fill()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.ColorType"
	 * @generated
	 */
	Object getFill();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(Object)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #getFill()
	 * @see #setFill(Object)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_FillOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.OpacityType"
	 * @generated
	 */
	Object getFillOpacity();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @generated
	 */
	void setFillOpacity(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @generated
	 */
	void unsetFillOpacity();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Opacity</em>' attribute is set.
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @generated
	 */
	boolean isSetFillOpacity();

	/**
	 * Returns the value of the '<em><b>Fill Rule</b></em>' attribute.
	 * The default value is <code>"nonzero"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Rule</em>' attribute.
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #setFillRule(Object)
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_FillRule()
	 * @model default="nonzero" unsettable="true" dataType="org.example.ng661.part2.FillRuleType"
	 * @generated
	 */
	Object getFillRule();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Rule</em>' attribute.
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @generated
	 */
	void setFillRule(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(Object)
	 * @generated
	 */
	void unsetFillRule();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Rule</em>' attribute is set.
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(Object)
	 * @generated
	 */
	boolean isSetFillRule();

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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Points()
	 * @model dataType="org.example.ng661.part2.StringType" required="true"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Stroke()
	 * @model default="white" unsettable="true" dataType="org.example.ng661.part2.ColorType"
	 * @generated
	 */
	Object getStroke();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStroke <em>Stroke</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Object)
	 * @generated
	 */
	void unsetStroke();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStroke <em>Stroke</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeDasharray()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeDasharray();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @generated
	 */
	void unsetStrokeDasharray();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeDashoffset()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getStrokeDashoffset();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @generated
	 */
	void unsetStrokeDashoffset();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeLinecap()
	 * @model default="butt" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeLinecap();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @see #setStrokeLinecap(String)
	 * @generated
	 */
	void unsetStrokeLinecap();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeLinejoin()
	 * @model default="miter" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getStrokeLinejoin();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(String)
	 * @generated
	 */
	void unsetStrokeLinejoin();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeMiterlimit()
	 * @model default="4.0" unsettable="true" dataType="org.example.ng661.part2.RealType"
	 * @generated
	 */
	Object getStrokeMiterlimit();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @generated
	 */
	void unsetStrokeMiterlimit();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_StrokeOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.OpacityType"
	 * @generated
	 */
	Object getStrokeOpacity();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @generated
	 */
	void unsetStrokeOpacity();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Strokewidth()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getStrokewidth();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokewidth()
	 * @see #getStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @generated
	 */
	void unsetStrokewidth();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getTransform <em>Transform</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getTransform <em>Transform</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPolygonPrimitive_Visibility()
	 * @model default="visible" unsettable="true" dataType="org.example.ng661.part2.VisibilityType"
	 * @generated
	 */
	Object getVisibility();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PolygonPrimitive#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	boolean isSetVisibility();

} // PolygonPrimitive
