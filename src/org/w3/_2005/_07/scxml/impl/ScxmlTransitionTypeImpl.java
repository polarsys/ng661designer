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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScriptType;
import org.w3._2005._07.scxml.ScxmlSendType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getScxmlExecutablecontent <em>Scxml Executablecontent</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScxmlTransitionTypeImpl extends MinimalEObjectImpl.Container implements ScxmlTransitionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getScxmlExecutablecontent() <em>Scxml Executablecontent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScxmlExecutablecontent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scxmlExecutablecontent;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlSendType> send;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlScriptType> script;

	/**
	 * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected static final String COND_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected String cond = COND_EDEFAULT;

	/**
	 * This is true if the Cond attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean condESet;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScxmlTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SCXML_TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScxmlExecutablecontent() {
		if (scxmlExecutablecontent == null) {
			scxmlExecutablecontent = new BasicFeatureMap(this, ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT);
		}
		return scxmlExecutablecontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getScxmlExecutablecontent().<FeatureMap.Entry>list(ScxmlPackage.Literals.SCXML_TRANSITION_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlSendType> getSend() {
		if (send == null) {
			send = new EObjectContainmentEList<ScxmlSendType>(ScxmlSendType.class, this, ScxmlPackage.SCXML_TRANSITION_TYPE__SEND);
		}
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlScriptType> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<ScxmlScriptType>(ScxmlScriptType.class, this, ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(String newCond) {
		String oldCond = cond;
		cond = newCond;
		boolean oldCondESet = condESet;
		condESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SCXML_TRANSITION_TYPE__COND, oldCond, cond, !oldCondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCond() {
		String oldCond = cond;
		boolean oldCondESet = condESet;
		cond = COND_EDEFAULT;
		condESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScxmlPackage.SCXML_TRANSITION_TYPE__COND, oldCond, COND_EDEFAULT, oldCondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCond() {
		return condESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SCXML_TRANSITION_TYPE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SCXML_TRANSITION_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT:
				return ((InternalEList<?>)getScxmlExecutablecontent()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_TRANSITION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SEND:
				return ((InternalEList<?>)getSend()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT:
				if (coreType) return getScxmlExecutablecontent();
				return ((FeatureMap.Internal)getScxmlExecutablecontent()).getWrapper();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SEND:
				return getSend();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT:
				return getScript();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__COND:
				return getCond();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__EVENT:
				return getEvent();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__TARGET:
				return getTarget();
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
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT:
				((FeatureMap.Internal)getScxmlExecutablecontent()).set(newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends ScxmlSendType>)newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScxmlScriptType>)newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__COND:
				setCond((String)newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__EVENT:
				setEvent((String)newValue);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__TARGET:
				setTarget((String)newValue);
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
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT:
				getScxmlExecutablecontent().clear();
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__ANY:
				getAny().clear();
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SEND:
				getSend().clear();
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT:
				getScript().clear();
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__COND:
				unsetCond();
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case ScxmlPackage.SCXML_TRANSITION_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT:
				return scxmlExecutablecontent != null && !scxmlExecutablecontent.isEmpty();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__ANY:
				return !getAny().isEmpty();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SEND:
				return send != null && !send.isEmpty();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__SCRIPT:
				return script != null && !script.isEmpty();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__COND:
				return isSetCond();
			case ScxmlPackage.SCXML_TRANSITION_TYPE__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
			case ScxmlPackage.SCXML_TRANSITION_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
		result.append(" (scxmlExecutablecontent: ");
		result.append(scxmlExecutablecontent);
		result.append(", cond: ");
		if (condESet) result.append(cond); else result.append("<unset>");
		result.append(", event: ");
		result.append(event);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //ScxmlTransitionTypeImpl
