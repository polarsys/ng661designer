/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getState <em>State</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlStateType#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType()
 * @model
 * @generated
 */
public interface ScxmlStateType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Onentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlOnexecuteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onentry</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_Onentry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onentry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScxmlOnexecuteType> getOnentry();

	/**
	 * Returns the value of the '<em><b>Onexit</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlOnexecuteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onexit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onexit</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_Onexit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onexit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScxmlOnexecuteType> getOnexit();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlTransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_Transition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScxmlTransitionType> getTransition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_State()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScxmlStateType> getState();

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
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_Id()
	 * @model dataType="org.w3._2005._07.scxml.ScxmlIdType" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlStateType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(String)
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlStateType_Initial()
	 * @model dataType="org.w3._2005._07.scxml.ScxmlIdType"
	 *        extendedMetaData="kind='attribute' name='initial'"
	 * @generated
	 */
	String getInitial();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlStateType#getInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(String value);

} // ScxmlStateType
