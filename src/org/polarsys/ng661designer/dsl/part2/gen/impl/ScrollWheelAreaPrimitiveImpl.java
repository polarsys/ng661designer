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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.ScrollWheelAreaPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll Wheel Area Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ScrollWheelAreaPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollWheelAreaPrimitiveImpl extends RepresentationTypesImpl implements ScrollWheelAreaPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected String clipPath = CLIP_PATH_EDEFAULT;

	/**
	 * This is true if the Clip Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipPathESet;

	/**
	 * The default value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_RULE_EDEFAULT = "nonzero";

	/**
	 * The cached value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected String clipRule = CLIP_RULE_EDEFAULT;

	/**
	 * This is true if the Clip Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipRuleESet;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENABLED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Object enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollWheelAreaPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getScrollWheelAreaPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPath() {
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(String newClipPath) {
		String oldClipPath = clipPath;
		clipPath = newClipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH, oldClipPath, clipPath, !oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipPath() {
		String oldClipPath = clipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPath = CLIP_PATH_EDEFAULT;
		clipPathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH, oldClipPath, CLIP_PATH_EDEFAULT, oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipPath() {
		return clipPathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipRule() {
		return clipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipRule(String newClipRule) {
		String oldClipRule = clipRule;
		clipRule = newClipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipRule() {
		String oldClipRule = clipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRule = CLIP_RULE_EDEFAULT;
		clipRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipRule() {
		return clipRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Object newEnabled) {
		Object oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		Object oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT, oldHeight, height));
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
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		boolean oldTransformESet = transformESet;
		transformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM, oldTransform, transform, !oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransform() {
		String oldTransform = transform;
		boolean oldTransformESet = transformESet;
		transform = TRANSFORM_EDEFAULT;
		transformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransform() {
		return transformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		Object oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		Object oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH:
				return getClipPath();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE:
				return getClipRule();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED:
				return getEnabled();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ID:
				return getId();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM:
				return getTransform();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X:
				return getX();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y:
				return getY();
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
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE:
				setClipRule((String)newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED:
				setEnabled(newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y:
				setY(newValue);
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
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH:
				unsetClipPath();
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE:
				unsetClipRule();
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED:
				unsetEnabled();
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y:
				unsetY();
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
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_PATH:
				return isSetClipPath();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__CLIP_RULE:
				return isSetClipRule();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ENABLED:
				return isSetEnabled();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__TRANSFORM:
				return isSetTransform();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__X:
				return isSetX();
			case Part2Package.SCROLL_WHEEL_AREA_PRIMITIVE__Y:
				return isSetY();
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
		result.append(" (clipPath: ");
		if (clipPathESet) result.append(clipPath); else result.append("<unset>");
		result.append(", clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", transform: ");
		if (transformESet) result.append(transform); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScrollWheelAreaPrimitiveImpl
