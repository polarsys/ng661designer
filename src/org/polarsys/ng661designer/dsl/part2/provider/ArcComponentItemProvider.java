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
import org.polarsys.ng661designer.dsl.part2.gen.ArcComponent;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * This is the item provider adapter for a {@link org.example.ng661.part2.ArcComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcComponentItemProvider extends RepresentationTypesItemProvider {
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
	public ArcComponentItemProvider(AdapterFactory adapterFactory) {
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

			addAnglePropertyDescriptor(object);
			addClipPathPropertyDescriptor(object);
			addClipRulePropertyDescriptor(object);
			addDrawingPriorityPropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addFillRulePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInboundAnglePropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
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
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcComponent_angle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_angle_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Angle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clip Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcComponent_clipPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_clipPath_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_ClipPath(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clip Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcComponent_clipRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_clipRule_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_ClipRule(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ArcComponent_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_drawingPriority_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_DrawingPriority(),
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
				 getString("_UI_ArcComponent_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_fill_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Fill(),
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
				 getString("_UI_ArcComponent_fillOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_fillOpacity_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_FillOpacity(),
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
				 getString("_UI_ArcComponent_fillRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_fillRule_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_FillRule(),
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
				 getString("_UI_ArcComponent_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_id_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbound Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInboundAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcComponent_inboundAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_inboundAngle_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_InboundAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcComponent_radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_radius_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Radius(),
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
				 getString("_UI_ArcComponent_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_stroke_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Stroke(),
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
				 getString("_UI_ArcComponent_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeDasharray_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeDasharray(),
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
				 getString("_UI_ArcComponent_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeDashoffset_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeDashoffset(),
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
				 getString("_UI_ArcComponent_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeLinecap_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeLinecap(),
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
				 getString("_UI_ArcComponent_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeLinejoin_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeLinejoin(),
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
				 getString("_UI_ArcComponent_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeMiterlimit_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeMiterlimit(),
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
				 getString("_UI_ArcComponent_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokeOpacity_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_StrokeOpacity(),
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
				 getString("_UI_ArcComponent_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_strokewidth_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Strokewidth(),
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
				 getString("_UI_ArcComponent_transform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_transform_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Transform(),
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
				 getString("_UI_ArcComponent_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_visibility_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Visibility(),
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
				 getString("_UI_ArcComponent_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_x_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_X(),
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
				 getString("_UI_ArcComponent_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcComponent_y_feature", "_UI_ArcComponent_type"),
				 Part2Package.eINSTANCE.getArcComponent_Y(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ArcComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArcComponent"));
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
		String label = ((ArcComponent)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ArcComponent_type") :
			getString("_UI_ArcComponent_type") + " " + label;
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

		switch (notification.getFeatureID(ArcComponent.class)) {
			case Part2Package.ARC_COMPONENT__ANGLE:
			case Part2Package.ARC_COMPONENT__CLIP_PATH:
			case Part2Package.ARC_COMPONENT__CLIP_RULE:
			case Part2Package.ARC_COMPONENT__DRAWING_PRIORITY:
			case Part2Package.ARC_COMPONENT__FILL:
			case Part2Package.ARC_COMPONENT__FILL_OPACITY:
			case Part2Package.ARC_COMPONENT__FILL_RULE:
			case Part2Package.ARC_COMPONENT__ID:
			case Part2Package.ARC_COMPONENT__INBOUND_ANGLE:
			case Part2Package.ARC_COMPONENT__RADIUS:
			case Part2Package.ARC_COMPONENT__STROKE:
			case Part2Package.ARC_COMPONENT__STROKE_DASHARRAY:
			case Part2Package.ARC_COMPONENT__STROKE_DASHOFFSET:
			case Part2Package.ARC_COMPONENT__STROKE_LINECAP:
			case Part2Package.ARC_COMPONENT__STROKE_LINEJOIN:
			case Part2Package.ARC_COMPONENT__STROKE_MITERLIMIT:
			case Part2Package.ARC_COMPONENT__STROKE_OPACITY:
			case Part2Package.ARC_COMPONENT__STROKEWIDTH:
			case Part2Package.ARC_COMPONENT__TRANSFORM:
			case Part2Package.ARC_COMPONENT__VISIBILITY:
			case Part2Package.ARC_COMPONENT__X:
			case Part2Package.ARC_COMPONENT__Y:
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
