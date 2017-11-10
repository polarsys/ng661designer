/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.dsl.part2.gen.BehaviorType;
import org.polarsys.ng661designer.dsl.part2.gen.ClockType;
import org.polarsys.ng661designer.dsl.part2.gen.FunctionType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

import org.w3._2005._07.scxml.ScxmlScxmlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.BehaviorTypeImpl#getBehaviorGroup <em>Behavior Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.BehaviorTypeImpl#getScxml <em>Scxml</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.BehaviorTypeImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.BehaviorTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.BehaviorTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorTypeImpl extends MinimalEObjectImpl.Container implements BehaviorType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getBehaviorGroup() <em>Behavior Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap behaviorGroup;

	/**
	 * The cached value of the '{@link #getScxml() <em>Scxml</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScxml()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlScxmlType> scxml;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockType> clock;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getBehaviorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBehaviorGroup() {
		if (behaviorGroup == null) {
			behaviorGroup = new BasicFeatureMap(this, Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP);
		}
		return behaviorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlScxmlType> getScxml() {
		if (scxml == null) {
			scxml = new EObjectContainmentEList<ScxmlScxmlType>(ScxmlScxmlType.class, this, Part2Package.BEHAVIOR_TYPE__SCXML);
		}
		return scxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockType> getClock() {
		if (clock == null) {
			clock = new EObjectContainmentEList<ClockType>(ClockType.class, this, Part2Package.BEHAVIOR_TYPE__CLOCK);
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionType> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<FunctionType>(FunctionType.class, this, Part2Package.BEHAVIOR_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getBehaviorGroup().<FeatureMap.Entry>list(Part2Package.eINSTANCE.getBehaviorType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP:
				return ((InternalEList<?>)getBehaviorGroup()).basicRemove(otherEnd, msgs);
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return ((InternalEList<?>)getScxml()).basicRemove(otherEnd, msgs);
			case Part2Package.BEHAVIOR_TYPE__CLOCK:
				return ((InternalEList<?>)getClock()).basicRemove(otherEnd, msgs);
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case Part2Package.BEHAVIOR_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP:
				if (coreType) return getBehaviorGroup();
				return ((FeatureMap.Internal)getBehaviorGroup()).getWrapper();
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return getScxml();
			case Part2Package.BEHAVIOR_TYPE__CLOCK:
				return getClock();
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return getFunction();
			case Part2Package.BEHAVIOR_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP:
				((FeatureMap.Internal)getBehaviorGroup()).set(newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				getScxml().clear();
				getScxml().addAll((Collection<? extends ScxmlScxmlType>)newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__CLOCK:
				getClock().clear();
				getClock().addAll((Collection<? extends ClockType>)newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType>)newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP:
				getBehaviorGroup().clear();
				return;
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				getScxml().clear();
				return;
			case Part2Package.BEHAVIOR_TYPE__CLOCK:
				getClock().clear();
				return;
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case Part2Package.BEHAVIOR_TYPE__ANY:
				getAny().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__BEHAVIOR_GROUP:
				return behaviorGroup != null && !behaviorGroup.isEmpty();
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return scxml != null && !scxml.isEmpty();
			case Part2Package.BEHAVIOR_TYPE__CLOCK:
				return clock != null && !clock.isEmpty();
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case Part2Package.BEHAVIOR_TYPE__ANY:
				return !getAny().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (behaviorGroup: ");
		result.append(behaviorGroup);
		result.append(')');
		return result.toString();
	}

} //BehaviorTypeImpl
