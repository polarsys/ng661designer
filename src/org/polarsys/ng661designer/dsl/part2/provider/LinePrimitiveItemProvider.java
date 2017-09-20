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
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * This is the item provider adapter for a {@link org.example.ng661.part2.LinePrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinePrimitiveItemProvider extends ClipRepresentationTypesItemProvider {
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
	public LinePrimitiveItemProvider(AdapterFactory adapterFactory) {
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
			addVisibilityPropertyDescriptor(object);
			addX1PropertyDescriptor(object);
			addX2PropertyDescriptor(object);
			addY1PropertyDescriptor(object);
			addY2PropertyDescriptor(object);
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
				 getString("_UI_LinePrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_drawingPriority_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_DrawingPriority(),
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
				 getString("_UI_LinePrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_id_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Id(),
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
				 getString("_UI_LinePrimitive_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_stroke_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Stroke(),
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
				 getString("_UI_LinePrimitive_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeDasharray_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeDasharray(),
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
				 getString("_UI_LinePrimitive_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeDashoffset_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeDashoffset(),
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
				 getString("_UI_LinePrimitive_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeLinecap_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeLinecap(),
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
				 getString("_UI_LinePrimitive_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeLinejoin_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeLinejoin(),
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
				 getString("_UI_LinePrimitive_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeMiterlimit_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeMiterlimit(),
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
				 getString("_UI_LinePrimitive_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokeOpacity_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_StrokeOpacity(),
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
				 getString("_UI_LinePrimitive_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_strokewidth_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Strokewidth(),
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
				 getString("_UI_LinePrimitive_transform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_transform_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Transform(),
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
				 getString("_UI_LinePrimitive_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_visibility_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Visibility(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinePrimitive_x1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_x1_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_X1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinePrimitive_x2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_x2_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_X2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addY1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinePrimitive_y1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_y1_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Y1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addY2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinePrimitive_y2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinePrimitive_y2_feature", "_UI_LinePrimitive_type"),
				 Part2Package.eINSTANCE.getLinePrimitive_Y2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LinePrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LinePrimitive"));
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
		String label = ((LinePrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_LinePrimitive_type") :
			getString("_UI_LinePrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(LinePrimitive.class)) {
			case Part2Package.LINE_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.LINE_PRIMITIVE__ID:
			case Part2Package.LINE_PRIMITIVE__STROKE:
			case Part2Package.LINE_PRIMITIVE__STROKE_DASHARRAY:
			case Part2Package.LINE_PRIMITIVE__STROKE_DASHOFFSET:
			case Part2Package.LINE_PRIMITIVE__STROKE_LINECAP:
			case Part2Package.LINE_PRIMITIVE__STROKE_LINEJOIN:
			case Part2Package.LINE_PRIMITIVE__STROKE_MITERLIMIT:
			case Part2Package.LINE_PRIMITIVE__STROKE_OPACITY:
			case Part2Package.LINE_PRIMITIVE__STROKEWIDTH:
			case Part2Package.LINE_PRIMITIVE__TRANSFORM:
			case Part2Package.LINE_PRIMITIVE__VISIBILITY:
			case Part2Package.LINE_PRIMITIVE__X1:
			case Part2Package.LINE_PRIMITIVE__X2:
			case Part2Package.LINE_PRIMITIVE__Y1:
			case Part2Package.LINE_PRIMITIVE__Y2:
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
