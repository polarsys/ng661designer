/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;

/**
 * This is the item provider adapter for a {@link org.example.ng661.part2.TextPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextPrimitiveItemProvider extends RepresentationTypesItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPrimitiveItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDrawingPriorityPropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addFillRulePropertyDescriptor(object);
			addFontFamilyPropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addFontStretchPropertyDescriptor(object);
			addFontStylePropertyDescriptor(object);
			addFontVariantPropertyDescriptor(object);
			addFontWeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addStrokePropertyDescriptor(object);
			addStrokeDasharrayPropertyDescriptor(object);
			addStrokeDashoffsetPropertyDescriptor(object);
			addStrokeLinecapPropertyDescriptor(object);
			addStrokeLinejoinPropertyDescriptor(object);
			addStrokeMiterlimitPropertyDescriptor(object);
			addStrokeOpacityPropertyDescriptor(object);
			addStrokewidthPropertyDescriptor(object);
			addTransformPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Drawing Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrawingPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_drawingPriority_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_DrawingPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fill_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Fill(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fillOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fillOpacity_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FillOpacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fillRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fillRule_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FillRule(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Family feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontFamilyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontFamily_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontFamily_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontFamily(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontSize_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Stretch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontStretchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontStretch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontStretch_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontStretch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontStyle_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontStyle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Variant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontVariantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontVariant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontVariant_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontVariant(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_fontWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_fontWeight_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_FontWeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_id_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_stroke_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Stroke(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Dasharray feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeDasharrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeDasharray_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeDasharray(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Dashoffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeDashoffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeDashoffset_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeDashoffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Linecap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeLinecapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeLinecap_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeLinecap(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Linejoin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeLinejoinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeLinejoin_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeLinejoin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Miterlimit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeMiterlimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeMiterlimit_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeMiterlimit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokeOpacity_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_StrokeOpacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strokewidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokewidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_strokewidth_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Strokewidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_transform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_transform_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Transform(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_value_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Value(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_visibility_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Visibility(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_x_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_X(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextPrimitive_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextPrimitive_y_feature", "_UI_TextPrimitive_type"),
				 Part2Package.eINSTANCE.getTextPrimitive_Y(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TextPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextPrimitive"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TextPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TextPrimitive_type") :
			getString("_UI_TextPrimitive_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TextPrimitive.class)) {
			case Part2Package.TEXT_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.TEXT_PRIMITIVE__FILL:
			case Part2Package.TEXT_PRIMITIVE__FILL_OPACITY:
			case Part2Package.TEXT_PRIMITIVE__FILL_RULE:
			case Part2Package.TEXT_PRIMITIVE__FONT_FAMILY:
			case Part2Package.TEXT_PRIMITIVE__FONT_SIZE:
			case Part2Package.TEXT_PRIMITIVE__FONT_STRETCH:
			case Part2Package.TEXT_PRIMITIVE__FONT_STYLE:
			case Part2Package.TEXT_PRIMITIVE__FONT_VARIANT:
			case Part2Package.TEXT_PRIMITIVE__FONT_WEIGHT:
			case Part2Package.TEXT_PRIMITIVE__ID:
			case Part2Package.TEXT_PRIMITIVE__STROKE:
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHARRAY:
			case Part2Package.TEXT_PRIMITIVE__STROKE_DASHOFFSET:
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINECAP:
			case Part2Package.TEXT_PRIMITIVE__STROKE_LINEJOIN:
			case Part2Package.TEXT_PRIMITIVE__STROKE_MITERLIMIT:
			case Part2Package.TEXT_PRIMITIVE__STROKE_OPACITY:
			case Part2Package.TEXT_PRIMITIVE__STROKEWIDTH:
			case Part2Package.TEXT_PRIMITIVE__TRANSFORM:
			case Part2Package.TEXT_PRIMITIVE__VALUE:
			case Part2Package.TEXT_PRIMITIVE__VISIBILITY:
			case Part2Package.TEXT_PRIMITIVE__X:
			case Part2Package.TEXT_PRIMITIVE__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
