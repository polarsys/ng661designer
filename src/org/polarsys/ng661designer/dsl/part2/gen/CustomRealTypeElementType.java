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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Real Type Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getAny <em>Any</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getMax <em>Max</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getMin <em>Min</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getName <em>Name</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomRealTypeElementType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType()
 * @model
 * @generated
 */
public interface CustomRealTypeElementType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(Object)
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Max()
	 * @model default="1.0" unsettable="true" dataType="org.example.ng661.part2.RealType"
	 * @generated
	 */
	Object getMax();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(Object)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(Object)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(Object)
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Min()
	 * @model default="0.0" unsettable="true" dataType="org.example.ng661.part2.RealType"
	 * @generated
	 */
	Object getMin();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(Object)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(Object)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Name()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #setResolution(Object)
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Resolution()
	 * @model default="0.001" unsettable="true" dataType="org.example.ng661.part2.RealType"
	 * @generated
	 */
	Object getResolution();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolution()
	 * @see #getResolution()
	 * @see #setResolution(Object)
	 * @generated
	 */
	void unsetResolution();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolution</em>' attribute is set.
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @see #setResolution(Object)
	 * @generated
	 */
	boolean isSetResolution();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(String)
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_Unit()
	 * @model default="" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.example.ng661.part2.Part2Package#getCustomRealTypeElementType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CustomRealTypeElementType
