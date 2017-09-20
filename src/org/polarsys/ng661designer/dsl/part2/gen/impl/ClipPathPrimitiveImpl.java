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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.dsl.part2.gen.CirclePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ClipPathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ClipRepresentationTypes;
import org.polarsys.ng661designer.dsl.part2.gen.EllipsePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RectPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.ClipPathPrimitiveImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipPathPrimitiveImpl extends RepresentationTypesImpl implements ClipPathPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ClipRepresentationTypes> group;

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList<RectPrimitive> rectangle;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList<CirclePrimitive> circle;

	/**
	 * The cached value of the '{@link #getEllipse() <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipse()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipsePrimitive> ellipse;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePrimitive> line;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathPrimitive> path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getClipPathPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClipRepresentationTypes> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<ClipRepresentationTypes>(ClipRepresentationTypes.class, this, Part2Package.CLIP_PATH_PRIMITIVE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectPrimitive> getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectResolvingEList.Unsettable<RectPrimitive>(RectPrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRectangle() {
		if (rectangle != null) ((InternalEList.Unsettable<?>)rectangle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRectangle() {
		return rectangle != null && ((InternalEList.Unsettable<?>)rectangle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CirclePrimitive> getCircle() {
		if (circle == null) {
			circle = new EObjectResolvingEList.Unsettable<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCircle() {
		if (circle != null) ((InternalEList.Unsettable<?>)circle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCircle() {
		return circle != null && ((InternalEList.Unsettable<?>)circle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipsePrimitive> getEllipse() {
		if (ellipse == null) {
			ellipse = new EObjectResolvingEList.Unsettable<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE);
		}
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEllipse() {
		if (ellipse != null) ((InternalEList.Unsettable<?>)ellipse).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEllipse() {
		return ellipse != null && ((InternalEList.Unsettable<?>)ellipse).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePrimitive> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList.Unsettable<LinePrimitive>(LinePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLine() {
		if (line != null) ((InternalEList.Unsettable<?>)line).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLine() {
		return line != null && ((InternalEList.Unsettable<?>)line).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathPrimitive> getPath() {
		if (path == null) {
			path = new EObjectResolvingEList.Unsettable<PathPrimitive>(PathPrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPath() {
		if (path != null) ((InternalEList.Unsettable<?>)path).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPath() {
		return path != null && ((InternalEList.Unsettable<?>)path).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.CLIP_PATH_PRIMITIVE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case Part2Package.CLIP_PATH_PRIMITIVE__GROUP:
				return getGroup();
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				return getRectangle();
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				return getCircle();
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				return getEllipse();
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				return getLine();
			case Part2Package.CLIP_PATH_PRIMITIVE__PATH:
				return getPath();
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
			case Part2Package.CLIP_PATH_PRIMITIVE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ClipRepresentationTypes>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathPrimitive>)newValue);
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
			case Part2Package.CLIP_PATH_PRIMITIVE__GROUP:
				getGroup().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				unsetRectangle();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				unsetCircle();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				unsetEllipse();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				unsetLine();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__PATH:
				unsetPath();
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
			case Part2Package.CLIP_PATH_PRIMITIVE__GROUP:
				return group != null && !group.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				return isSetRectangle();
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				return isSetCircle();
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				return isSetEllipse();
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				return isSetLine();
			case Part2Package.CLIP_PATH_PRIMITIVE__PATH:
				return isSetPath();
		}
		return super.eIsSet(featureID);
	}

} //ClipPathPrimitiveImpl
