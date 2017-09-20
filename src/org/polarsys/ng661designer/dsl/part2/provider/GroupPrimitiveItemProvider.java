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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.ng661designer.dsl.part2.gen.GroupPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * This is the item provider adapter for a {@link org.example.ng661.part2.GroupPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupPrimitiveItemProvider extends RepresentationTypesItemProvider {
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
	public GroupPrimitiveItemProvider(AdapterFactory adapterFactory) {
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
			addTransformPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
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
				 getString("_UI_GroupPrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_drawingPriority_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_DrawingPriority(),
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
				 getString("_UI_GroupPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_id_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Id(),
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
				 getString("_UI_GroupPrimitive_transform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_transform_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Transform(),
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
				 getString("_UI_GroupPrimitive_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_visibility_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Visibility(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GroupPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroupPrimitive"));
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
		String label = ((GroupPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_GroupPrimitive_type") :
			getString("_UI_GroupPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(GroupPrimitive.class)) {
			case Part2Package.GROUP_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.GROUP_PRIMITIVE__ID:
			case Part2Package.GROUP_PRIMITIVE__TRANSFORM:
			case Part2Package.GROUP_PRIMITIVE__VISIBILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.GROUP_PRIMITIVE__CHILD_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createArcComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createChildPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCirclePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClipPathPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCrownComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createEllipsePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImagePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createKeyboardInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createLinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPathPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolarLineComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolygonPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolylinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createRectPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createScrollWheelAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTextPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createWidgetComposition()));
	}

}
