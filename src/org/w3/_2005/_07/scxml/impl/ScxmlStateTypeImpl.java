/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

import org.polarsys.ng661designer.dsl.part2.util.NG661DesignerUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScxmlStateTypeImpl extends MinimalEObjectImpl.Container implements ScxmlStateType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getOnentry() <em>Onentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnentry()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlOnexecuteType> onentry;

	/**
	 * The cached value of the '{@link #getOnexit() <em>Onexit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnexit()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlOnexecuteType> onexit;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlTransitionType> transition;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlStateType> state;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected String initial = INITIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScxmlStateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SCXML_STATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlOnexecuteType> getOnentry() {
		if (onentry == null) {
			onentry = new EObjectContainmentEList<ScxmlOnexecuteType>(ScxmlOnexecuteType.class, this, ScxmlPackage.SCXML_STATE_TYPE__ONENTRY);
		}
		return onentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlOnexecuteType> getOnexit() {
		if (onexit == null) {
			onexit = new EObjectContainmentEList<ScxmlOnexecuteType>(ScxmlOnexecuteType.class, this, ScxmlPackage.SCXML_STATE_TYPE__ONEXIT);
		}
		return onexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlTransitionType> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<ScxmlTransitionType>(ScxmlTransitionType.class, this, ScxmlPackage.SCXML_STATE_TYPE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlStateType> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<ScxmlStateType>(ScxmlStateType.class, this, ScxmlPackage.SCXML_STATE_TYPE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setId(String newId) {
		String oldId = id;
		// [self.eContainer(scxml::ScxmlScxmlType).eAllContents(scxml::ScxmlTransitionType)->select(t : scxml::ScxmlTransitionType | t.target = self.id)/]
		ScxmlScxmlType container = NG661DesignerUtil.getScxmlScxmlTypeContainer(this);
		if (container != null) {
			TreeIterator<EObject> eAllContents = container.eAllContents();
			while (eAllContents.hasNext()) {
				EObject next = eAllContents.next();
				if (next instanceof ScxmlTransitionType) {
					if (id.equals(((ScxmlTransitionType) next).getTarget())) {
						((ScxmlTransitionType) next).setTarget(newId);
					}
				}
			}
		}
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SCXML_STATE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(String newInitial) {
		String oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SCXML_STATE_TYPE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.SCXML_STATE_TYPE__ONENTRY:
				return ((InternalEList<?>)getOnentry()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_STATE_TYPE__ONEXIT:
				return ((InternalEList<?>)getOnexit()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_STATE_TYPE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_STATE_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.SCXML_STATE_TYPE__ONENTRY:
				return getOnentry();
			case ScxmlPackage.SCXML_STATE_TYPE__ONEXIT:
				return getOnexit();
			case ScxmlPackage.SCXML_STATE_TYPE__TRANSITION:
				return getTransition();
			case ScxmlPackage.SCXML_STATE_TYPE__STATE:
				return getState();
			case ScxmlPackage.SCXML_STATE_TYPE__ID:
				return getId();
			case ScxmlPackage.SCXML_STATE_TYPE__INITIAL:
				return getInitial();
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
			case ScxmlPackage.SCXML_STATE_TYPE__ONENTRY:
				getOnentry().clear();
				getOnentry().addAll((Collection<? extends ScxmlOnexecuteType>)newValue);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__ONEXIT:
				getOnexit().clear();
				getOnexit().addAll((Collection<? extends ScxmlOnexecuteType>)newValue);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends ScxmlTransitionType>)newValue);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends ScxmlStateType>)newValue);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__INITIAL:
				setInitial((String)newValue);
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
			case ScxmlPackage.SCXML_STATE_TYPE__ONENTRY:
				getOnentry().clear();
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__ONEXIT:
				getOnexit().clear();
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__STATE:
				getState().clear();
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.SCXML_STATE_TYPE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
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
			case ScxmlPackage.SCXML_STATE_TYPE__ONENTRY:
				return onentry != null && !onentry.isEmpty();
			case ScxmlPackage.SCXML_STATE_TYPE__ONEXIT:
				return onexit != null && !onexit.isEmpty();
			case ScxmlPackage.SCXML_STATE_TYPE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ScxmlPackage.SCXML_STATE_TYPE__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.SCXML_STATE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.SCXML_STATE_TYPE__INITIAL:
				return INITIAL_EDEFAULT == null ? initial != null : !INITIAL_EDEFAULT.equals(initial);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", initial: ");
		result.append(initial);
		result.append(')');
		return result.toString();
	}

} //ScxmlStateTypeImpl
