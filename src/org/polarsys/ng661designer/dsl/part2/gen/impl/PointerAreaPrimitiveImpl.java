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
import org.polarsys.ng661designer.dsl.part2.gen.PointerAreaPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Area Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getAcceptedButtons <em>Accepted Buttons</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getPassThrough <em>Pass Through</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getPreventStealing <em>Prevent Stealing</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PointerAreaPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointerAreaPrimitiveImpl extends RepresentationTypesImpl implements PointerAreaPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getAcceptedButtons() <em>Accepted Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedButtons()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTED_BUTTONS_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getAcceptedButtons() <em>Accepted Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedButtons()
	 * @generated
	 * @ordered
	 */
	protected String acceptedButtons = ACCEPTED_BUTTONS_EDEFAULT;

	/**
	 * This is true if the Accepted Buttons attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptedButtonsESet;

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
	 * The default value of the '{@link #getPassThrough() <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThrough()
	 * @generated
	 * @ordered
	 */
	protected static final Object PASS_THROUGH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "false");

	/**
	 * The cached value of the '{@link #getPassThrough() <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThrough()
	 * @generated
	 * @ordered
	 */
	protected Object passThrough = PASS_THROUGH_EDEFAULT;

	/**
	 * This is true if the Pass Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passThroughESet;

	/**
	 * The default value of the '{@link #getPreventStealing() <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreventStealing()
	 * @generated
	 * @ordered
	 */
	protected static final Object PREVENT_STEALING_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "false");

	/**
	 * The cached value of the '{@link #getPreventStealing() <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreventStealing()
	 * @generated
	 * @ordered
	 */
	protected Object preventStealing = PREVENT_STEALING_EDEFAULT;

	/**
	 * This is true if the Prevent Stealing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preventStealingESet;

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
	protected PointerAreaPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getPointerAreaPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptedButtons() {
		return acceptedButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedButtons(String newAcceptedButtons) {
		String oldAcceptedButtons = acceptedButtons;
		acceptedButtons = newAcceptedButtons;
		boolean oldAcceptedButtonsESet = acceptedButtonsESet;
		acceptedButtonsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS, oldAcceptedButtons, acceptedButtons, !oldAcceptedButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptedButtons() {
		String oldAcceptedButtons = acceptedButtons;
		boolean oldAcceptedButtonsESet = acceptedButtonsESet;
		acceptedButtons = ACCEPTED_BUTTONS_EDEFAULT;
		acceptedButtonsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS, oldAcceptedButtons, ACCEPTED_BUTTONS_EDEFAULT, oldAcceptedButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptedButtons() {
		return acceptedButtonsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH, oldClipPath, clipPath, !oldClipPathESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH, oldClipPath, CLIP_PATH_EDEFAULT, oldClipPathESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPassThrough() {
		return passThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThrough(Object newPassThrough) {
		Object oldPassThrough = passThrough;
		passThrough = newPassThrough;
		boolean oldPassThroughESet = passThroughESet;
		passThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH, oldPassThrough, passThrough, !oldPassThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassThrough() {
		Object oldPassThrough = passThrough;
		boolean oldPassThroughESet = passThroughESet;
		passThrough = PASS_THROUGH_EDEFAULT;
		passThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH, oldPassThrough, PASS_THROUGH_EDEFAULT, oldPassThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassThrough() {
		return passThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPreventStealing() {
		return preventStealing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreventStealing(Object newPreventStealing) {
		Object oldPreventStealing = preventStealing;
		preventStealing = newPreventStealing;
		boolean oldPreventStealingESet = preventStealingESet;
		preventStealingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING, oldPreventStealing, preventStealing, !oldPreventStealingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreventStealing() {
		Object oldPreventStealing = preventStealing;
		boolean oldPreventStealingESet = preventStealingESet;
		preventStealing = PREVENT_STEALING_EDEFAULT;
		preventStealingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING, oldPreventStealing, PREVENT_STEALING_EDEFAULT, oldPreventStealingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreventStealing() {
		return preventStealingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM, oldTransform, transform, !oldTransformESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POINTER_AREA_PRIMITIVE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POINTER_AREA_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
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
			case Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS:
				return getAcceptedButtons();
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH:
				return getClipPath();
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE:
				return getClipRule();
			case Part2Package.POINTER_AREA_PRIMITIVE__ENABLED:
				return getEnabled();
			case Part2Package.POINTER_AREA_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.POINTER_AREA_PRIMITIVE__ID:
				return getId();
			case Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH:
				return getPassThrough();
			case Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING:
				return getPreventStealing();
			case Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM:
				return getTransform();
			case Part2Package.POINTER_AREA_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.POINTER_AREA_PRIMITIVE__X:
				return getX();
			case Part2Package.POINTER_AREA_PRIMITIVE__Y:
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
			case Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS:
				setAcceptedButtons((String)newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE:
				setClipRule((String)newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__ENABLED:
				setEnabled(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH:
				setPassThrough(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING:
				setPreventStealing(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__Y:
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
			case Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS:
				unsetAcceptedButtons();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH:
				unsetClipPath();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE:
				unsetClipRule();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__ENABLED:
				unsetEnabled();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH:
				unsetPassThrough();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING:
				unsetPreventStealing();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.POINTER_AREA_PRIMITIVE__Y:
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
			case Part2Package.POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS:
				return isSetAcceptedButtons();
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_PATH:
				return isSetClipPath();
			case Part2Package.POINTER_AREA_PRIMITIVE__CLIP_RULE:
				return isSetClipRule();
			case Part2Package.POINTER_AREA_PRIMITIVE__ENABLED:
				return isSetEnabled();
			case Part2Package.POINTER_AREA_PRIMITIVE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Part2Package.POINTER_AREA_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.POINTER_AREA_PRIMITIVE__PASS_THROUGH:
				return isSetPassThrough();
			case Part2Package.POINTER_AREA_PRIMITIVE__PREVENT_STEALING:
				return isSetPreventStealing();
			case Part2Package.POINTER_AREA_PRIMITIVE__TRANSFORM:
				return isSetTransform();
			case Part2Package.POINTER_AREA_PRIMITIVE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Part2Package.POINTER_AREA_PRIMITIVE__X:
				return isSetX();
			case Part2Package.POINTER_AREA_PRIMITIVE__Y:
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
		result.append(" (acceptedButtons: ");
		if (acceptedButtonsESet) result.append(acceptedButtons); else result.append("<unset>");
		result.append(", clipPath: ");
		if (clipPathESet) result.append(clipPath); else result.append("<unset>");
		result.append(", clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", passThrough: ");
		if (passThroughESet) result.append(passThrough); else result.append("<unset>");
		result.append(", preventStealing: ");
		if (preventStealingESet) result.append(preventStealing); else result.append("<unset>");
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

} //PointerAreaPrimitiveImpl
