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
 * A representation of the model object '<em><b>Child Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren <em>Max Number Of Children</em>}</li>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.ChildPrimitive#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getChildPrimitive()
 * @model
 * @generated
 */
public interface ChildPrimitive extends RepresentationTypes {
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
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Children</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Children</em>' attribute.
	 * @see #isSetMaxNumberOfChildren()
	 * @see #unsetMaxNumberOfChildren()
	 * @see #setMaxNumberOfChildren(Object)
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_MaxNumberOfChildren()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.IntegerType"
	 * @generated
	 */
	Object getMaxNumberOfChildren();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren <em>Max Number Of Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Children</em>' attribute.
	 * @see #isSetMaxNumberOfChildren()
	 * @see #unsetMaxNumberOfChildren()
	 * @see #getMaxNumberOfChildren()
	 * @generated
	 */
	void setMaxNumberOfChildren(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren <em>Max Number Of Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxNumberOfChildren()
	 * @see #getMaxNumberOfChildren()
	 * @see #setMaxNumberOfChildren(Object)
	 * @generated
	 */
	void unsetMaxNumberOfChildren();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ChildPrimitive#getMaxNumberOfChildren <em>Max Number Of Children</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Number Of Children</em>' attribute is set.
	 * @see #unsetMaxNumberOfChildren()
	 * @see #getMaxNumberOfChildren()
	 * @see #setMaxNumberOfChildren(Object)
	 * @generated
	 */
	boolean isSetMaxNumberOfChildren();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(Object)
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_Priority()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.IntegerType"
	 * @generated
	 */
	Object getPriority();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Object)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ChildPrimitive#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Object)
	 * @generated
	 */
	boolean isSetPriority();

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
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getTransform <em>Transform</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ChildPrimitive#getTransform <em>Transform</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getChildPrimitive_Visibility()
	 * @model default="visible" unsettable="true" dataType="org.example.ng661.part2.VisibilityType"
	 * @generated
	 */
	Object getVisibility();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.ChildPrimitive#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ChildPrimitive#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Object)
	 * @generated
	 */
	boolean isSetVisibility();

} // ChildPrimitive
