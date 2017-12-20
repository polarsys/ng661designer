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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.ng661designer.dsl.part2.gen.util.Part2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Part2ItemProviderAdapterFactory extends Part2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ArcComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcComponentItemProvider arcComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ArcComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArcComponentAdapter() {
		if (arcComponentItemProvider == null) {
			arcComponentItemProvider = new ArcComponentItemProvider(this);
		}

		return arcComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.BehaviorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorTypeItemProvider behaviorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.BehaviorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorTypeAdapter() {
		if (behaviorTypeItemProvider == null) {
			behaviorTypeItemProvider = new BehaviorTypeItemProvider(this);
		}

		return behaviorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ChildPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildPrimitiveItemProvider childPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ChildPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChildPrimitiveAdapter() {
		if (childPrimitiveItemProvider == null) {
			childPrimitiveItemProvider = new ChildPrimitiveItemProvider(this);
		}

		return childPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.CirclePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CirclePrimitiveItemProvider circlePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.CirclePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCirclePrimitiveAdapter() {
		if (circlePrimitiveItemProvider == null) {
			circlePrimitiveItemProvider = new CirclePrimitiveItemProvider(this);
		}

		return circlePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ClipPathPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathPrimitiveItemProvider clipPathPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ClipPathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClipPathPrimitiveAdapter() {
		if (clipPathPrimitiveItemProvider == null) {
			clipPathPrimitiveItemProvider = new ClipPathPrimitiveItemProvider(this);
		}

		return clipPathPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ClockType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockTypeItemProvider clockTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ClockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockTypeAdapter() {
		if (clockTypeItemProvider == null) {
			clockTypeItemProvider = new ClockTypeItemProvider(this);
		}

		return clockTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ComponentDefinitionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefinitionTypeItemProvider componentDefinitionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ComponentDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentDefinitionTypeAdapter() {
		if (componentDefinitionTypeItemProvider == null) {
			componentDefinitionTypeItemProvider = new ComponentDefinitionTypeItemProvider(this);
		}

		return componentDefinitionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.CrownComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrownComponentItemProvider crownComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.CrownComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCrownComponentAdapter() {
		if (crownComponentItemProvider == null) {
			crownComponentItemProvider = new CrownComponentItemProvider(this);
		}

		return crownComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.CustomIntegerTypeElementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomIntegerTypeElementTypeItemProvider customIntegerTypeElementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.CustomIntegerTypeElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomIntegerTypeElementTypeAdapter() {
		if (customIntegerTypeElementTypeItemProvider == null) {
			customIntegerTypeElementTypeItemProvider = new CustomIntegerTypeElementTypeItemProvider(this);
		}

		return customIntegerTypeElementTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.CustomRealTypeElementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomRealTypeElementTypeItemProvider customRealTypeElementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.CustomRealTypeElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomRealTypeElementTypeAdapter() {
		if (customRealTypeElementTypeItemProvider == null) {
			customRealTypeElementTypeItemProvider = new CustomRealTypeElementTypeItemProvider(this);
		}

		return customRealTypeElementTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.CustomStringTypeElementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomStringTypeElementTypeItemProvider customStringTypeElementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.CustomStringTypeElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomStringTypeElementTypeAdapter() {
		if (customStringTypeElementTypeItemProvider == null) {
			customStringTypeElementTypeItemProvider = new CustomStringTypeElementTypeItemProvider(this);
		}

		return customStringTypeElementTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.EllipsePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipsePrimitiveItemProvider ellipsePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.EllipsePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEllipsePrimitiveAdapter() {
		if (ellipsePrimitiveItemProvider == null) {
			ellipsePrimitiveItemProvider = new EllipsePrimitiveItemProvider(this);
		}

		return ellipsePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.EventType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeItemProvider eventTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventTypeAdapter() {
		if (eventTypeItemProvider == null) {
			eventTypeItemProvider = new EventTypeItemProvider(this);
		}

		return eventTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.FunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeItemProvider functionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionTypeAdapter() {
		if (functionTypeItemProvider == null) {
			functionTypeItemProvider = new FunctionTypeItemProvider(this);
		}

		return functionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.GestureAreaPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestureAreaPrimitiveItemProvider gestureAreaPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.GestureAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGestureAreaPrimitiveAdapter() {
		if (gestureAreaPrimitiveItemProvider == null) {
			gestureAreaPrimitiveItemProvider = new GestureAreaPrimitiveItemProvider(this);
		}

		return gestureAreaPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.GroupPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupPrimitiveItemProvider groupPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.GroupPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupPrimitiveAdapter() {
		if (groupPrimitiveItemProvider == null) {
			groupPrimitiveItemProvider = new GroupPrimitiveItemProvider(this);
		}

		return groupPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ImagePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagePrimitiveItemProvider imagePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ImagePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImagePrimitiveAdapter() {
		if (imagePrimitiveItemProvider == null) {
			imagePrimitiveItemProvider = new ImagePrimitiveItemProvider(this);
		}

		return imagePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ImportType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportTypeItemProvider importTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ImportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportTypeAdapter() {
		if (importTypeItemProvider == null) {
			importTypeItemProvider = new ImportTypeItemProvider(this);
		}

		return importTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.InterfaceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTypeItemProvider interfaceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.InterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceTypeAdapter() {
		if (interfaceTypeItemProvider == null) {
			interfaceTypeItemProvider = new InterfaceTypeItemProvider(this);
		}

		return interfaceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.KeyboardInputPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyboardInputPrimitiveItemProvider keyboardInputPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.KeyboardInputPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyboardInputPrimitiveAdapter() {
		if (keyboardInputPrimitiveItemProvider == null) {
			keyboardInputPrimitiveItemProvider = new KeyboardInputPrimitiveItemProvider(this);
		}

		return keyboardInputPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.LinePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinePrimitiveItemProvider linePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.LinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinePrimitiveAdapter() {
		if (linePrimitiveItemProvider == null) {
			linePrimitiveItemProvider = new LinePrimitiveItemProvider(this);
		}

		return linePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ParamType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamTypeItemProvider paramTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParamTypeAdapter() {
		if (paramTypeItemProvider == null) {
			paramTypeItemProvider = new ParamTypeItemProvider(this);
		}

		return paramTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PathPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPrimitiveItemProvider pathPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathPrimitiveAdapter() {
		if (pathPrimitiveItemProvider == null) {
			pathPrimitiveItemProvider = new PathPrimitiveItemProvider(this);
		}

		return pathPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PointerAreaPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerAreaPrimitiveItemProvider pointerAreaPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PointerAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointerAreaPrimitiveAdapter() {
		if (pointerAreaPrimitiveItemProvider == null) {
			pointerAreaPrimitiveItemProvider = new PointerAreaPrimitiveItemProvider(this);
		}

		return pointerAreaPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PolarLineComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarLineComponentItemProvider polarLineComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PolarLineComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolarLineComponentAdapter() {
		if (polarLineComponentItemProvider == null) {
			polarLineComponentItemProvider = new PolarLineComponentItemProvider(this);
		}

		return polarLineComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PolygonPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonPrimitiveItemProvider polygonPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PolygonPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolygonPrimitiveAdapter() {
		if (polygonPrimitiveItemProvider == null) {
			polygonPrimitiveItemProvider = new PolygonPrimitiveItemProvider(this);
		}

		return polygonPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PolylinePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylinePrimitiveItemProvider polylinePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PolylinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolylinePrimitiveAdapter() {
		if (polylinePrimitiveItemProvider == null) {
			polylinePrimitiveItemProvider = new PolylinePrimitiveItemProvider(this);
		}

		return polylinePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PropertyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTypeItemProvider propertyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyTypeAdapter() {
		if (propertyTypeItemProvider == null) {
			propertyTypeItemProvider = new PropertyTypeItemProvider(this);
		}

		return propertyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.RectPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectPrimitiveItemProvider rectPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.RectPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRectPrimitiveAdapter() {
		if (rectPrimitiveItemProvider == null) {
			rectPrimitiveItemProvider = new RectPrimitiveItemProvider(this);
		}

		return rectPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.RepresentationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationTypeItemProvider representationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.RepresentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepresentationTypeAdapter() {
		if (representationTypeItemProvider == null) {
			representationTypeItemProvider = new RepresentationTypeItemProvider(this);
		}

		return representationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.ScrollWheelAreaPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollWheelAreaPrimitiveItemProvider scrollWheelAreaPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.ScrollWheelAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScrollWheelAreaPrimitiveAdapter() {
		if (scrollWheelAreaPrimitiveItemProvider == null) {
			scrollWheelAreaPrimitiveItemProvider = new ScrollWheelAreaPrimitiveItemProvider(this);
		}

		return scrollWheelAreaPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.TextPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPrimitiveItemProvider textPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.TextPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextPrimitiveAdapter() {
		if (textPrimitiveItemProvider == null) {
			textPrimitiveItemProvider = new TextPrimitiveItemProvider(this);
		}

		return textPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.TouchAreaPrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchAreaPrimitiveItemProvider touchAreaPrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.TouchAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchAreaPrimitiveAdapter() {
		if (touchAreaPrimitiveItemProvider == null) {
			touchAreaPrimitiveItemProvider = new TouchAreaPrimitiveItemProvider(this);
		}

		return touchAreaPrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.PropertyValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValueItemProvider propertyValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.PropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyValueAdapter() {
		if (propertyValueItemProvider == null) {
			propertyValueItemProvider = new PropertyValueItemProvider(this);
		}

		return propertyValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.example.ng661.part2.WidgetComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetCompositionItemProvider widgetCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.example.ng661.part2.WidgetComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWidgetCompositionAdapter() {
		if (widgetCompositionItemProvider == null) {
			widgetCompositionItemProvider = new WidgetCompositionItemProvider(this);
		}

		return widgetCompositionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (arcComponentItemProvider != null) arcComponentItemProvider.dispose();
		if (behaviorTypeItemProvider != null) behaviorTypeItemProvider.dispose();
		if (childPrimitiveItemProvider != null) childPrimitiveItemProvider.dispose();
		if (circlePrimitiveItemProvider != null) circlePrimitiveItemProvider.dispose();
		if (clipPathPrimitiveItemProvider != null) clipPathPrimitiveItemProvider.dispose();
		if (clockTypeItemProvider != null) clockTypeItemProvider.dispose();
		if (componentDefinitionTypeItemProvider != null) componentDefinitionTypeItemProvider.dispose();
		if (crownComponentItemProvider != null) crownComponentItemProvider.dispose();
		if (customIntegerTypeElementTypeItemProvider != null) customIntegerTypeElementTypeItemProvider.dispose();
		if (customRealTypeElementTypeItemProvider != null) customRealTypeElementTypeItemProvider.dispose();
		if (customStringTypeElementTypeItemProvider != null) customStringTypeElementTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (ellipsePrimitiveItemProvider != null) ellipsePrimitiveItemProvider.dispose();
		if (eventTypeItemProvider != null) eventTypeItemProvider.dispose();
		if (functionTypeItemProvider != null) functionTypeItemProvider.dispose();
		if (gestureAreaPrimitiveItemProvider != null) gestureAreaPrimitiveItemProvider.dispose();
		if (groupPrimitiveItemProvider != null) groupPrimitiveItemProvider.dispose();
		if (imagePrimitiveItemProvider != null) imagePrimitiveItemProvider.dispose();
		if (importTypeItemProvider != null) importTypeItemProvider.dispose();
		if (interfaceTypeItemProvider != null) interfaceTypeItemProvider.dispose();
		if (keyboardInputPrimitiveItemProvider != null) keyboardInputPrimitiveItemProvider.dispose();
		if (linePrimitiveItemProvider != null) linePrimitiveItemProvider.dispose();
		if (paramTypeItemProvider != null) paramTypeItemProvider.dispose();
		if (pathPrimitiveItemProvider != null) pathPrimitiveItemProvider.dispose();
		if (pointerAreaPrimitiveItemProvider != null) pointerAreaPrimitiveItemProvider.dispose();
		if (polarLineComponentItemProvider != null) polarLineComponentItemProvider.dispose();
		if (polygonPrimitiveItemProvider != null) polygonPrimitiveItemProvider.dispose();
		if (polylinePrimitiveItemProvider != null) polylinePrimitiveItemProvider.dispose();
		if (propertyTypeItemProvider != null) propertyTypeItemProvider.dispose();
		if (rectPrimitiveItemProvider != null) rectPrimitiveItemProvider.dispose();
		if (representationTypeItemProvider != null) representationTypeItemProvider.dispose();
		if (scrollWheelAreaPrimitiveItemProvider != null) scrollWheelAreaPrimitiveItemProvider.dispose();
		if (textPrimitiveItemProvider != null) textPrimitiveItemProvider.dispose();
		if (touchAreaPrimitiveItemProvider != null) touchAreaPrimitiveItemProvider.dispose();
		if (propertyValueItemProvider != null) propertyValueItemProvider.dispose();
		if (widgetCompositionItemProvider != null) widgetCompositionItemProvider.dispose();
	}

}