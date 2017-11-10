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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.ParamType#getModality <em>Modality</em>}</li>
 *   <li>{@link org.example.ng661.part2.ParamType#getName <em>Name</em>}</li>
 *   <li>{@link org.example.ng661.part2.ParamType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getParamType()
 * @model
 * @generated
 */
public interface ParamType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.example.ng661.part2.ModalityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see org.example.ng661.part2.ModalityType
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #setModality(ModalityType)
	 * @see org.example.ng661.part2.Part2Package#getParamType_Modality()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	ModalityType getModality();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ParamType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see org.example.ng661.part2.ModalityType
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #getModality()
	 * @generated
	 */
	void setModality(ModalityType value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.ParamType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType)
	 * @generated
	 */
	void unsetModality();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.ParamType#getModality <em>Modality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modality</em>' attribute is set.
	 * @see #unsetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType)
	 * @generated
	 */
	boolean isSetModality();

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
	 * @see org.example.ng661.part2.Part2Package#getParamType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ParamType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.example.ng661.part2.Part2Package#getParamType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ParamType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ParamType
