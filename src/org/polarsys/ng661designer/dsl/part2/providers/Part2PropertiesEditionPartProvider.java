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

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ArcComponentPropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.BehaviorTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ChildPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.CirclePrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ClipPathPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ClockTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ComponentDefinitionTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.CrownComponentPropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.CustomIntegerTypeElementTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.CustomRealTypeElementTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.CustomStringTypeElementTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.DocumentRootPropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.EllipsePrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.EventTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.FunctionTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.GestureAreaPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.GroupPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ImagePrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ImportTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.InterfaceTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.KeyboardInputPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.LinePrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ParamTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PathPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PointerAreaPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PolarLineComponentPropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PolygonPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PolylinePrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PropertyTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.PropertyValuePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.RectPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.RepresentationTypePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.ScrollWheelAreaPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.TextPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.TouchAreaPrimitivePropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.forms.WidgetCompositionPropertiesEditionPartForm;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ArcComponentPropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.BehaviorTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ChildPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.CirclePrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ClipPathPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ClockTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ComponentDefinitionTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.CrownComponentPropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.CustomIntegerTypeElementTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.CustomRealTypeElementTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.CustomStringTypeElementTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.DocumentRootPropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.EllipsePrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.EventTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.FunctionTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.GestureAreaPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.GroupPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ImagePrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ImportTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.InterfaceTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.KeyboardInputPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.LinePrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ParamTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PathPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PointerAreaPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PolarLineComponentPropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PolygonPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PolylinePrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PropertyTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.PropertyValuePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.RectPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.RepresentationTypePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.ScrollWheelAreaPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.TextPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.TouchAreaPrimitivePropertiesEditionPartImpl;
import org.polarsys.ng661designer.dsl.part2.parts.impl.WidgetCompositionPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class Part2PropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == Part2ViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == Part2ViewsRepository.ArcComponent.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ArcComponentPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ArcComponentPropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.BehaviorType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new BehaviorTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new BehaviorTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ChildPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ChildPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ChildPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.CirclePrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new CirclePrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new CirclePrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ClipPathPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ClipPathPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ClipPathPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ClockType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ClockTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ClockTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ComponentDefinitionType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ComponentDefinitionTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ComponentDefinitionTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.CrownComponent.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new CrownComponentPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new CrownComponentPropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.CustomIntegerTypeElementType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new CustomIntegerTypeElementTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new CustomIntegerTypeElementTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.CustomRealTypeElementType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new CustomRealTypeElementTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new CustomRealTypeElementTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.CustomStringTypeElementType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new CustomStringTypeElementTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new CustomStringTypeElementTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.DocumentRoot.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new DocumentRootPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new DocumentRootPropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.EllipsePrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new EllipsePrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new EllipsePrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.EventType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new EventTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new EventTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.FunctionType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new FunctionTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new FunctionTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.GestureAreaPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new GestureAreaPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new GestureAreaPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.GroupPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new GroupPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new GroupPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ImagePrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ImagePrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ImagePrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ImportType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ImportTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ImportTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.InterfaceType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new InterfaceTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new InterfaceTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.KeyboardInputPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new KeyboardInputPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new KeyboardInputPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.LinePrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new LinePrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new LinePrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ParamType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ParamTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ParamTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PathPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PathPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PathPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PointerAreaPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PointerAreaPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PointerAreaPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PolarLineComponent.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PolarLineComponentPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PolarLineComponentPropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PolygonPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PolygonPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PolygonPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PolylinePrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PolylinePrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PolylinePrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PropertyType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PropertyTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PropertyTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.RectPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new RectPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new RectPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.RepresentationType.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new RepresentationTypePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new RepresentationTypePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.ScrollWheelAreaPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new ScrollWheelAreaPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new ScrollWheelAreaPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.TextPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new TextPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new TextPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.TouchAreaPrimitive.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new TouchAreaPrimitivePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new TouchAreaPrimitivePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.PropertyValue.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new PropertyValuePropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new PropertyValuePropertiesEditionPartForm(component);
		}
		if (key == Part2ViewsRepository.WidgetComposition.class) {
			if (kind == Part2ViewsRepository.SWT_KIND)
				return new WidgetCompositionPropertiesEditionPartImpl(component);
			if (kind == Part2ViewsRepository.FORM_KIND)
				return new WidgetCompositionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
