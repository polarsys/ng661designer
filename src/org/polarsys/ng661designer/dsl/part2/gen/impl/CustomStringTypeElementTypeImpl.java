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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.dsl.part2.gen.CustomStringTypeElementType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom String Type Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.CustomStringTypeElementTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomStringTypeElementTypeImpl extends MinimalEObjectImpl.Container implements CustomStringTypeElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_LENGTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getIntegerType(), "256");

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Object maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLengthESet;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIN_LENGTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getIntegerType(), "0");

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Object minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * This is true if the Min Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minLengthESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = ".*";

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * This is true if the Regex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regexESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomStringTypeElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getCustomStringTypeElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Object newMaxLength) {
		Object oldMaxLength = maxLength;
		maxLength = newMaxLength;
		boolean oldMaxLengthESet = maxLengthESet;
		maxLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH, oldMaxLength, maxLength, !oldMaxLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxLength() {
		Object oldMaxLength = maxLength;
		boolean oldMaxLengthESet = maxLengthESet;
		maxLength = MAX_LENGTH_EDEFAULT;
		maxLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH, oldMaxLength, MAX_LENGTH_EDEFAULT, oldMaxLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxLength() {
		return maxLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(Object newMinLength) {
		Object oldMinLength = minLength;
		minLength = newMinLength;
		boolean oldMinLengthESet = minLengthESet;
		minLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH, oldMinLength, minLength, !oldMinLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinLength() {
		Object oldMinLength = minLength;
		boolean oldMinLengthESet = minLengthESet;
		minLength = MIN_LENGTH_EDEFAULT;
		minLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH, oldMinLength, MIN_LENGTH_EDEFAULT, oldMinLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinLength() {
		return minLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		boolean oldRegexESet = regexESet;
		regexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX, oldRegex, regex, !oldRegexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegex() {
		String oldRegex = regex;
		boolean oldRegexESet = regexESet;
		regex = REGEX_EDEFAULT;
		regexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX, oldRegex, REGEX_EDEFAULT, oldRegexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegex() {
		return regexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH:
				return getMaxLength();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH:
				return getMinLength();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME:
				return getName();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX:
				return getRegex();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH:
				setMaxLength(newValue);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH:
				setMinLength(newValue);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX:
				setRegex((String)newValue);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY:
				getAny().clear();
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH:
				unsetMaxLength();
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH:
				unsetMinLength();
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX:
				unsetRegex();
				return;
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY:
				return any != null && !any.isEmpty();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH:
				return isSetMaxLength();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH:
				return isSetMinLength();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX:
				return isSetRegex();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(", maxLength: ");
		if (maxLengthESet) result.append(maxLength); else result.append("<unset>");
		result.append(", minLength: ");
		if (minLengthESet) result.append(minLength); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", regex: ");
		if (regexESet) result.append(regex); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CustomStringTypeElementTypeImpl
