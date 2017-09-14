/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.polarsys.ng661designer.dsl.part2.gen.util.Part2AdapterFactory;

/**
 * 
 * 
 */
public class Part2EEFAdapterFactory extends Part2AdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createArcComponentAdapter()
	 * 
	 */
	public Adapter createArcComponentAdapter() {
		return new ArcComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createChildPrimitiveAdapter()
	 * 
	 */
	public Adapter createChildPrimitiveAdapter() {
		return new ChildPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createCirclePrimitiveAdapter()
	 * 
	 */
	public Adapter createCirclePrimitiveAdapter() {
		return new CirclePrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createClockTypeAdapter()
	 * 
	 */
	public Adapter createClockTypeAdapter() {
		return new ClockTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createComponentDefinitionTypeAdapter()
	 * 
	 */
	public Adapter createComponentDefinitionTypeAdapter() {
		return new ComponentDefinitionTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createCrownComponentAdapter()
	 * 
	 */
	public Adapter createCrownComponentAdapter() {
		return new CrownComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createCustomIntegerTypeElementTypeAdapter()
	 * 
	 */
	public Adapter createCustomIntegerTypeElementTypeAdapter() {
		return new CustomIntegerTypeElementTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createCustomRealTypeElementTypeAdapter()
	 * 
	 */
	public Adapter createCustomRealTypeElementTypeAdapter() {
		return new CustomRealTypeElementTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createCustomStringTypeElementTypeAdapter()
	 * 
	 */
	public Adapter createCustomStringTypeElementTypeAdapter() {
		return new CustomStringTypeElementTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createEllipsePrimitiveAdapter()
	 * 
	 */
	public Adapter createEllipsePrimitiveAdapter() {
		return new EllipsePrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createEventTypeAdapter()
	 * 
	 */
	public Adapter createEventTypeAdapter() {
		return new EventTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createFunctionTypeAdapter()
	 * 
	 */
	public Adapter createFunctionTypeAdapter() {
		return new FunctionTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createGestureAreaPrimitiveAdapter()
	 * 
	 */
	public Adapter createGestureAreaPrimitiveAdapter() {
		return new GestureAreaPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createGroupPrimitiveAdapter()
	 * 
	 */
	public Adapter createGroupPrimitiveAdapter() {
		return new GroupPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createImagePrimitiveAdapter()
	 * 
	 */
	public Adapter createImagePrimitiveAdapter() {
		return new ImagePrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createImportTypeAdapter()
	 * 
	 */
	public Adapter createImportTypeAdapter() {
		return new ImportTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createKeyboardInputPrimitiveAdapter()
	 * 
	 */
	public Adapter createKeyboardInputPrimitiveAdapter() {
		return new KeyboardInputPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createLinePrimitiveAdapter()
	 * 
	 */
	public Adapter createLinePrimitiveAdapter() {
		return new LinePrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createParamTypeAdapter()
	 * 
	 */
	public Adapter createParamTypeAdapter() {
		return new ParamTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPathPrimitiveAdapter()
	 * 
	 */
	public Adapter createPathPrimitiveAdapter() {
		return new PathPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPointerAreaPrimitiveAdapter()
	 * 
	 */
	public Adapter createPointerAreaPrimitiveAdapter() {
		return new PointerAreaPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPolarLineComponentAdapter()
	 * 
	 */
	public Adapter createPolarLineComponentAdapter() {
		return new PolarLineComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPolygonPrimitiveAdapter()
	 * 
	 */
	public Adapter createPolygonPrimitiveAdapter() {
		return new PolygonPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPolylinePrimitiveAdapter()
	 * 
	 */
	public Adapter createPolylinePrimitiveAdapter() {
		return new PolylinePrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPropertyTypeAdapter()
	 * 
	 */
	public Adapter createPropertyTypeAdapter() {
		return new PropertyTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createRectPrimitiveAdapter()
	 * 
	 */
	public Adapter createRectPrimitiveAdapter() {
		return new RectPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createScrollWheelAreaPrimitiveAdapter()
	 * 
	 */
	public Adapter createScrollWheelAreaPrimitiveAdapter() {
		return new ScrollWheelAreaPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createTextPrimitiveAdapter()
	 * 
	 */
	public Adapter createTextPrimitiveAdapter() {
		return new TextPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createTouchAreaPrimitiveAdapter()
	 * 
	 */
	public Adapter createTouchAreaPrimitiveAdapter() {
		return new TouchAreaPrimitivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createPropertyValueAdapter()
	 * 
	 */
	public Adapter createPropertyValueAdapter() {
		return new PropertyValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.example.ng661.part2.util.Part2AdapterFactory#createWidgetCompositionAdapter()
	 * 
	 */
	public Adapter createWidgetCompositionAdapter() {
		return new WidgetCompositionPropertiesEditionProvider();
	}

}
