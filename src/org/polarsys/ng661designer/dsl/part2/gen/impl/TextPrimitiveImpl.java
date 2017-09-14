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
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontStretch <em>Font Stretch</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.TextPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextPrimitiveImpl extends RepresentationTypesImpl implements TextPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Object DRAWING_PRIORITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getZIndexType(), "0");

	/**
	 * The cached value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected Object drawingPriority = DRAWING_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Drawing Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawingPriorityESet;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "none");

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Object fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object fillOpacity = FILL_OPACITY_EDEFAULT;

	/**
	 * This is true if the Fill Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillOpacityESet;

	/**
	 * The default value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_RULE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getFillRuleType(), "nonzero");

	/**
	 * The cached value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected Object fillRule = FILL_RULE_EDEFAULT;

	/**
	 * This is true if the Fill Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillRuleESet;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected String fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = "medium";

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Font Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeESet;

	/**
	 * The default value of the '{@link #getFontStretch() <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStretch()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STRETCH_EDEFAULT = "normal";

	/**
	 * The cached value of the '{@link #getFontStretch() <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStretch()
	 * @generated
	 * @ordered
	 */
	protected String fontStretch = FONT_STRETCH_EDEFAULT;

	/**
	 * This is true if the Font Stretch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStretchESet;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_EDEFAULT = "normal";

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected String fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * This is true if the Font Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleESet;

	/**
	 * The default value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_VARIANT_EDEFAULT = "normal";

	/**
	 * The cached value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected String fontVariant = FONT_VARIANT_EDEFAULT;

	/**
	 * This is true if the Font Variant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontVariantESet;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_WEIGHT_EDEFAULT = "normal";

	/**
	 * The cached value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected String fontWeight = FONT_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Font Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontWeightESet;

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
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Object stroke = STROKE_EDEFAULT;

	/**
	 * This is true if the Stroke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected String strokeDasharray = STROKE_DASHARRAY_EDEFAULT;

	/**
	 * This is true if the Stroke Dasharray attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDasharrayESet;

	/**
	 * The default value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_DASHOFFSET_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected Object strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;

	/**
	 * This is true if the Stroke Dashoffset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDashoffsetESet;

	/**
	 * The default value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINECAP_EDEFAULT = "butt";

	/**
	 * The cached value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinecap = STROKE_LINECAP_EDEFAULT;

	/**
	 * This is true if the Stroke Linecap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinecapESet;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINEJOIN_EDEFAULT = "miter";

	/**
	 * The cached value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Stroke Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinejoinESet;

	/**
	 * The default value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_MITERLIMIT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getRealType(), "4.0");

	/**
	 * The cached value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected Object strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;

	/**
	 * This is true if the Stroke Miterlimit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeMiterlimitESet;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stroke Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeOpacityESet;

	/**
	 * The default value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKEWIDTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected Object strokewidth = STROKEWIDTH_EDEFAULT;

	/**
	 * This is true if the Strokewidth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokewidthESet;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBILITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getVisibilityType(), "visible");

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Object visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

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
	protected TextPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTextPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDrawingPriority() {
		return drawingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPriority(Object newDrawingPriority) {
		Object oldDrawingPriority = drawingPriority;
		drawingPriority = newDrawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrawingPriority() {
		Object oldDrawingPriority = drawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriority = DRAWING_PRIORITY_EDEFAULT;
		drawingPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrawingPriority() {
		return drawingPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Object newFill) {
		Object oldFill = fill;
		fill = newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		Object oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(Object newFillOpacity) {
		Object oldFillOpacity = fillOpacity;
		fillOpacity = newFillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, fillOpacity, !oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillOpacity() {
		Object oldFillOpacity = fillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacity = FILL_OPACITY_EDEFAULT;
		fillOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, FILL_OPACITY_EDEFAULT, oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillOpacity() {
		return fillOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFillRule() {
		return fillRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillRule(Object newFillRule) {
		Object oldFillRule = fillRule;
		fillRule = newFillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FILL_RULE, oldFillRule, fillRule, !oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillRule() {
		Object oldFillRule = fillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRule = FILL_RULE_EDEFAULT;
		fillRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FILL_RULE, oldFillRule, FILL_RULE_EDEFAULT, oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillRule() {
		return fillRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		String oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_SIZE, oldFontSize, fontSize, !oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontSize() {
		String oldFontSize = fontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSize = FONT_SIZE_EDEFAULT;
		fontSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FONT_SIZE, oldFontSize, FONT_SIZE_EDEFAULT, oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontSize() {
		return fontSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStretch() {
		return fontStretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStretch(String newFontStretch) {
		String oldFontStretch = fontStretch;
		fontStretch = newFontStretch;
		boolean oldFontStretchESet = fontStretchESet;
		fontStretchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_STRETCH, oldFontStretch, fontStretch, !oldFontStretchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStretch() {
		String oldFontStretch = fontStretch;
		boolean oldFontStretchESet = fontStretchESet;
		fontStretch = FONT_STRETCH_EDEFAULT;
		fontStretchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FONT_STRETCH, oldFontStretch, FONT_STRETCH_EDEFAULT, oldFontStretchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStretch() {
		return fontStretchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		String oldFontStyle = fontStyle;
		fontStyle = newFontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		String oldFontStyle = fontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyle = FONT_STYLE_EDEFAULT;
		fontStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return fontStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontVariant() {
		return fontVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(String newFontVariant) {
		String oldFontVariant = fontVariant;
		fontVariant = newFontVariant;
		boolean oldFontVariantESet = fontVariantESet;
		fontVariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_VARIANT, oldFontVariant, fontVariant, !oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		String oldFontVariant = fontVariant;
		boolean oldFontVariantESet = fontVariantESet;
		fontVariant = FONT_VARIANT_EDEFAULT;
		fontVariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FONT_VARIANT, oldFontVariant, FONT_VARIANT_EDEFAULT, oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return fontVariantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return fontWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		String oldFontWeight = fontWeight;
		fontWeight = newFontWeight;
		boolean oldFontWeightESet = fontWeightESet;
		fontWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT, oldFontWeight, fontWeight, !oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		String oldFontWeight = fontWeight;
		boolean oldFontWeightESet = fontWeightESet;
		fontWeight = FONT_WEIGHT_EDEFAULT;
		fontWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT, oldFontWeight, FONT_WEIGHT_EDEFAULT, oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return fontWeightESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Object newStroke) {
		Object oldStroke = stroke;
		stroke = newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE, oldStroke, stroke, !oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		Object oldStroke = stroke;
		boolean oldStrokeESet = strokeESet;
		stroke = STROKE_EDEFAULT;
		strokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE, oldStroke, STROKE_EDEFAULT, oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return strokeDasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		String oldStrokeDasharray = strokeDasharray;
		strokeDasharray = newStrokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharrayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, strokeDasharray, !oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDasharray() {
		String oldStrokeDasharray = strokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharray = STROKE_DASHARRAY_EDEFAULT;
		strokeDasharrayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, STROKE_DASHARRAY_EDEFAULT, oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDasharray() {
		return strokeDasharrayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeDashoffset() {
		return strokeDashoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDashoffset(Object newStrokeDashoffset) {
		Object oldStrokeDashoffset = strokeDashoffset;
		strokeDashoffset = newStrokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, strokeDashoffset, !oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDashoffset() {
		Object oldStrokeDashoffset = strokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;
		strokeDashoffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, STROKE_DASHOFFSET_EDEFAULT, oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDashoffset() {
		return strokeDashoffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinecap() {
		return strokeLinecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(String newStrokeLinecap) {
		String oldStrokeLinecap = strokeLinecap;
		strokeLinecap = newStrokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, strokeLinecap, !oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinecap() {
		String oldStrokeLinecap = strokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecap = STROKE_LINECAP_EDEFAULT;
		strokeLinecapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, STROKE_LINECAP_EDEFAULT, oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinecap() {
		return strokeLinecapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(String newStrokeLinejoin) {
		String oldStrokeLinejoin = strokeLinejoin;
		strokeLinejoin = newStrokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, strokeLinejoin, !oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinejoin() {
		String oldStrokeLinejoin = strokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;
		strokeLinejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, STROKE_LINEJOIN_EDEFAULT, oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinejoin() {
		return strokeLinejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeMiterlimit() {
		return strokeMiterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeMiterlimit(Object newStrokeMiterlimit) {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		strokeMiterlimit = newStrokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, strokeMiterlimit, !oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeMiterlimit() {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;
		strokeMiterlimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, STROKE_MITERLIMIT_EDEFAULT, oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeMiterlimit() {
		return strokeMiterlimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(Object newStrokeOpacity) {
		Object oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity, !oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeOpacity() {
		Object oldStrokeOpacity = strokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacity = STROKE_OPACITY_EDEFAULT;
		strokeOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, STROKE_OPACITY_EDEFAULT, oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeOpacity() {
		return strokeOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokewidth() {
		return strokewidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokewidth(Object newStrokewidth) {
		Object oldStrokewidth = strokewidth;
		strokewidth = newStrokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__STROKEWIDTH, oldStrokewidth, strokewidth, !oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokewidth() {
		Object oldStrokewidth = strokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidth = STROKEWIDTH_EDEFAULT;
		strokewidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__STROKEWIDTH, oldStrokewidth, STROKEWIDTH_EDEFAULT, oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokewidth() {
		return strokewidthESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__TRANSFORM, oldTransform, transform, !oldTransformESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
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
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Object newVisibility) {
		Object oldVisibility = visibility;
		visibility = newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		Object oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TEXT_PRIMITIVE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TEXT_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
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
			case Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.TEXT_PRIMITIVE__FILL:
				return getFill();
			case Part2Package.TEXT_PRIMITIVE__FILL_OPACITY:
				return getFillOpacity();
			case Part2Package.TEXT_PRIMITIVE__FILL_RULE:
				return getFillRule();
			case Part2Package.TEXT_PRIMITIVE__FONT_FAMILY:
				return getFontFamily();
			case Part2Package.TEXT_PRIMITIVE__FONT_SIZE:
				return getFontSize();
			case Part2Package.TEXT_PRIMITIVE__FONT_STRETCH:
				return getFontStretch();
			case Part2Package.TEXT_PRIMITIVE__FONT_STYLE:
				return getFontStyle();
			case Part2Package.TEXT_PRIMITIVE__FONT_VARIANT:
				return getFontVariant();
			case Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT:
				return getFontWeight();
			case Part2Package.TEXT_PRIMITIVE__ID:
				return getId();
			case Part2Package.TEXT_PRIMITIVE__STROKE:
				return getStroke();
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET:
				return getStrokeDashoffset();
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP:
				return getStrokeLinecap();
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT:
				return getStrokeMiterlimit();
			case Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY:
				return getStrokeOpacity();
			case Part2Package.TEXT_PRIMITIVE__STROKEWIDTH:
				return getStrokewidth();
			case Part2Package.TEXT_PRIMITIVE__TRANSFORM:
				return getTransform();
			case Part2Package.TEXT_PRIMITIVE__VALUE:
				return getValue();
			case Part2Package.TEXT_PRIMITIVE__VISIBILITY:
				return getVisibility();
			case Part2Package.TEXT_PRIMITIVE__X:
				return getX();
			case Part2Package.TEXT_PRIMITIVE__Y:
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
			case Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL:
				setFill(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL_OPACITY:
				setFillOpacity(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL_RULE:
				setFillRule(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_STRETCH:
				setFontStretch((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_STYLE:
				setFontStyle((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_VARIANT:
				setFontVariant((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT:
				setFontWeight((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE:
				setStroke(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET:
				setStrokeDashoffset(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP:
				setStrokeLinecap((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN:
				setStrokeLinejoin((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT:
				setStrokeMiterlimit(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY:
				setStrokeOpacity(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKEWIDTH:
				setStrokewidth(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__VALUE:
				setValue((String)newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__VISIBILITY:
				setVisibility(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.TEXT_PRIMITIVE__Y:
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
			case Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL:
				unsetFill();
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL_OPACITY:
				unsetFillOpacity();
				return;
			case Part2Package.TEXT_PRIMITIVE__FILL_RULE:
				unsetFillRule();
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_SIZE:
				unsetFontSize();
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_STRETCH:
				unsetFontStretch();
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_STYLE:
				unsetFontStyle();
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_VARIANT:
				unsetFontVariant();
				return;
			case Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT:
				unsetFontWeight();
				return;
			case Part2Package.TEXT_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE:
				unsetStroke();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY:
				unsetStrokeDasharray();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET:
				unsetStrokeDashoffset();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP:
				unsetStrokeLinecap();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN:
				unsetStrokeLinejoin();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT:
				unsetStrokeMiterlimit();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY:
				unsetStrokeOpacity();
				return;
			case Part2Package.TEXT_PRIMITIVE__STROKEWIDTH:
				unsetStrokewidth();
				return;
			case Part2Package.TEXT_PRIMITIVE__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.TEXT_PRIMITIVE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Part2Package.TEXT_PRIMITIVE__VISIBILITY:
				unsetVisibility();
				return;
			case Part2Package.TEXT_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.TEXT_PRIMITIVE__Y:
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
			case Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.TEXT_PRIMITIVE__FILL:
				return isSetFill();
			case Part2Package.TEXT_PRIMITIVE__FILL_OPACITY:
				return isSetFillOpacity();
			case Part2Package.TEXT_PRIMITIVE__FILL_RULE:
				return isSetFillRule();
			case Part2Package.TEXT_PRIMITIVE__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case Part2Package.TEXT_PRIMITIVE__FONT_SIZE:
				return isSetFontSize();
			case Part2Package.TEXT_PRIMITIVE__FONT_STRETCH:
				return isSetFontStretch();
			case Part2Package.TEXT_PRIMITIVE__FONT_STYLE:
				return isSetFontStyle();
			case Part2Package.TEXT_PRIMITIVE__FONT_VARIANT:
				return isSetFontVariant();
			case Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT:
				return isSetFontWeight();
			case Part2Package.TEXT_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.TEXT_PRIMITIVE__STROKE:
				return isSetStroke();
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY:
				return isSetStrokeDasharray();
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET:
				return isSetStrokeDashoffset();
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP:
				return isSetStrokeLinecap();
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN:
				return isSetStrokeLinejoin();
			case Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT:
				return isSetStrokeMiterlimit();
			case Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY:
				return isSetStrokeOpacity();
			case Part2Package.TEXT_PRIMITIVE__STROKEWIDTH:
				return isSetStrokewidth();
			case Part2Package.TEXT_PRIMITIVE__TRANSFORM:
				return isSetTransform();
			case Part2Package.TEXT_PRIMITIVE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Part2Package.TEXT_PRIMITIVE__VISIBILITY:
				return isSetVisibility();
			case Part2Package.TEXT_PRIMITIVE__X:
				return isSetX();
			case Part2Package.TEXT_PRIMITIVE__Y:
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
		result.append(" (drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillOpacity: ");
		if (fillOpacityESet) result.append(fillOpacity); else result.append("<unset>");
		result.append(", fillRule: ");
		if (fillRuleESet) result.append(fillRule); else result.append("<unset>");
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontSize: ");
		if (fontSizeESet) result.append(fontSize); else result.append("<unset>");
		result.append(", fontStretch: ");
		if (fontStretchESet) result.append(fontStretch); else result.append("<unset>");
		result.append(", fontStyle: ");
		if (fontStyleESet) result.append(fontStyle); else result.append("<unset>");
		result.append(", fontVariant: ");
		if (fontVariantESet) result.append(fontVariant); else result.append("<unset>");
		result.append(", fontWeight: ");
		if (fontWeightESet) result.append(fontWeight); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", stroke: ");
		if (strokeESet) result.append(stroke); else result.append("<unset>");
		result.append(", strokeDasharray: ");
		if (strokeDasharrayESet) result.append(strokeDasharray); else result.append("<unset>");
		result.append(", strokeDashoffset: ");
		if (strokeDashoffsetESet) result.append(strokeDashoffset); else result.append("<unset>");
		result.append(", strokeLinecap: ");
		if (strokeLinecapESet) result.append(strokeLinecap); else result.append("<unset>");
		result.append(", strokeLinejoin: ");
		if (strokeLinejoinESet) result.append(strokeLinejoin); else result.append("<unset>");
		result.append(", strokeMiterlimit: ");
		if (strokeMiterlimitESet) result.append(strokeMiterlimit); else result.append("<unset>");
		result.append(", strokeOpacity: ");
		if (strokeOpacityESet) result.append(strokeOpacity); else result.append("<unset>");
		result.append(", strokewidth: ");
		if (strokewidthESet) result.append(strokewidth); else result.append("<unset>");
		result.append(", transform: ");
		if (transformESet) result.append(transform); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextPrimitiveImpl
