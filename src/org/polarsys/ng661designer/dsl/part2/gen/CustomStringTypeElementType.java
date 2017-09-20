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
 * A representation of the model object '<em><b>Custom String Type Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getAny <em>Any</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getName <em>Name</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.example.ng661.part2.CustomStringTypeElementType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType()
 * @model
 * @generated
 */
public interface CustomStringTypeElementType extends EObject {
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
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #setMaxLength(Object)
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_MaxLength()
	 * @model default="256" unsettable="true" dataType="org.example.ng661.part2.IntegerType"
	 * @generated
	 */
	Object getMaxLength();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(Object)
	 * @generated
	 */
	void unsetMaxLength();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Length</em>' attribute is set.
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(Object)
	 * @generated
	 */
	boolean isSetMaxLength();

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #setMinLength(Object)
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_MinLength()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.IntegerType"
	 * @generated
	 */
	Object getMinLength();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(Object)
	 * @generated
	 */
	void unsetMinLength();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Length</em>' attribute is set.
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(Object)
	 * @generated
	 */
	boolean isSetMinLength();

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
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_Name()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * The default value is <code>".*"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #isSetRegex()
	 * @see #unsetRegex()
	 * @see #setRegex(String)
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_Regex()
	 * @model default=".*" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #isSetRegex()
	 * @see #unsetRegex()
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegex()
	 * @see #getRegex()
	 * @see #setRegex(String)
	 * @generated
	 */
	void unsetRegex();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regex</em>' attribute is set.
	 * @see #unsetRegex()
	 * @see #getRegex()
	 * @see #setRegex(String)
	 * @generated
	 */
	boolean isSetRegex();

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
	 * @see org.example.ng661.part2.Part2Package#getCustomStringTypeElementType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CustomStringTypeElementType
