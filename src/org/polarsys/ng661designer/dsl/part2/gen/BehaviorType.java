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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2005._07.scxml.ScxmlScxmlType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows to instanciate components that have no representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.BehaviorType#getBehaviorGroup <em>Behavior Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.BehaviorType#getScxml <em>Scxml</em>}</li>
 *   <li>{@link org.example.ng661.part2.BehaviorType#getClock <em>Clock</em>}</li>
 *   <li>{@link org.example.ng661.part2.BehaviorType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.example.ng661.part2.BehaviorType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getBehaviorType()
 * @model
 * @generated
 */
public interface BehaviorType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Behavior Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Group</em>' attribute list.
	 * @see org.example.ng661.part2.Part2Package#getBehaviorType_BehaviorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BehaviorGroup:0'"
	 * @generated
	 */
	FeatureMap getBehaviorGroup();

	/**
	 * Returns the value of the '<em><b>Scxml</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlScxmlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scxml</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scxml</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getBehaviorType_Scxml()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScxmlScxmlType> getScxml();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ClockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getBehaviorType_Clock()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockType> getClock();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getBehaviorType_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionType> getFunction();

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
	 * @see org.example.ng661.part2.Part2Package#getBehaviorType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':4' processing='lax' group='#BehaviorGroup:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // BehaviorType
