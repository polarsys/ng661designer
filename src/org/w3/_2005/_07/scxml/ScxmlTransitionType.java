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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getScxmlExecutablecontent <em>Scxml Executablecontent</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getSend <em>Send</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getCond <em>Cond</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getEvent <em>Event</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlTransitionType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType()
 * @model
 * @generated
 */
public interface ScxmlTransitionType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Scxml Executablecontent</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scxml Executablecontent</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scxml Executablecontent</em>' attribute list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_ScxmlExecutablecontent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScxmlExecutablecontent:0'"
	 * @generated
	 */
	FeatureMap getScxmlExecutablecontent();

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
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax' group='#ScxmlExecutablecontent:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Send</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlSendType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Send()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScxmlSendType> getSend();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlScriptType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Script()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScxmlScriptType> getScript();

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see #isSetCond()
	 * @see #unsetCond()
	 * @see #setCond(String)
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Cond()
	 * @model default="true" unsettable="true" dataType="org.w3._2005._07.scxml.ScxmlTransitionCondType"
	 *        extendedMetaData="kind='attribute' name='cond'"
	 * @generated
	 */
	String getCond();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #isSetCond()
	 * @see #unsetCond()
	 * @see #getCond()
	 * @generated
	 */
	void setCond(String value);

	/**
	 * Unsets the value of the '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCond()
	 * @see #getCond()
	 * @see #setCond(String)
	 * @generated
	 */
	void unsetCond();

	/**
	 * Returns whether the value of the '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getCond <em>Cond</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cond</em>' attribute is set.
	 * @see #unsetCond()
	 * @see #getCond()
	 * @see #setCond(String)
	 * @generated
	 */
	boolean isSetCond();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Event()
	 * @model dataType="org.w3._2005._07.scxml.ScxmlTransitionEventType"
	 *        extendedMetaData="kind='attribute' name='event'"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlTransitionType_Target()
	 * @model dataType="org.w3._2005._07.scxml.ScxmlIdType"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // ScxmlTransitionType
