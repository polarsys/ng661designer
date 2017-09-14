/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.services;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.ng661designer.dsl.part2.gen.ArcComponent;
import org.polarsys.ng661designer.dsl.part2.gen.ChildPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.CirclePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ClipPathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.CrownComponent;
import org.polarsys.ng661designer.dsl.part2.gen.EllipsePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.FunctionType;
import org.polarsys.ng661designer.dsl.part2.gen.GestureAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.KeyboardInputPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.LinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PathPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PointerAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolarLineComponent;
import org.polarsys.ng661designer.dsl.part2.gen.PolygonPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PolylinePrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyType;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyValue;
import org.polarsys.ng661designer.dsl.part2.gen.RectPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationType;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationTypes;
import org.polarsys.ng661designer.dsl.part2.gen.ScrollWheelAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.TextPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.TouchAreaPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.WidgetComposition;
import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlParamType;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlSendType;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.polarsys.ng661designer.dsl.part2.util.FeatureServices;

/**
 * Services for representations.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerServices {

	private static final String TOUCH_AREA = ".touch";
	private static final String NAME_TYPE = "NameType";
	private static final String ID = "id";

	private ResourceServices resourceServices;
	private EcoreServices ecoreServices;
	private FeatureServices featureServices;
	private NG661DesignerModelUtils ng661ModelUtils;

	/**
	 * @return ResourceServices
	 */
	private ResourceServices getResourceServices() {
		if (resourceServices == null) {
			resourceServices = new ResourceServices();
		}
		return resourceServices;
	}

	/**
	 * @return EcoreServices
	 */
	private EcoreServices getEcoreServices() {
		if (ecoreServices == null) {
			ecoreServices = new EcoreServices();
		}
		return ecoreServices;
	}

	/**
	 * @return FeatureServices
	 */
	private FeatureServices getFeatureServices() {
		if (featureServices == null) {
			featureServices = new FeatureServices();
		}
		return featureServices;
	}

	/**
	 * @return EcoreServices
	 */
	private NG661DesignerModelUtils getNG661DesignerModelUtils() {
		if (ng661ModelUtils == null) {
			ng661ModelUtils = new NG661DesignerModelUtils();
		}
		return ng661ModelUtils;
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param functionType
	 *            FunctionType
	 */
	public void setScript(FunctionType functionType) {
		String script = getResourceServices().openEditor(functionType);
		functionType.setScript(script);
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlOnentryType
	 */
	public void setScript(final ScxmlOnexecuteType type) {
		EObject eContainer = type.eContainer();
		if (eContainer instanceof ScxmlStateType) {
			EList<ScxmlOnexecuteType> onEntry = ((ScxmlStateType) eContainer).getOnentry();
			int index = 0;
			String tag = "";
			if (onEntry.contains(type)) {
				index = onEntry.indexOf(type);
				tag = "_OnEntry";
			} else {
				EList<ScxmlOnexecuteType> onExit = ((ScxmlStateType) eContainer).getOnexit();
				index = onExit.indexOf(type);
				tag = "_OnExit";
			}
			String name = ((ScxmlStateType) eContainer).getId() + tag + Integer.toString(index);
			String script = getResourceServices().openEditor(type, name, getNG661DesignerModelUtils().getScript(type.getScript()));
			getNG661DesignerModelUtils().setScript(type, script);
		}
	}
	
	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlTransitionType
	 */
	public void setScript(final ScxmlTransitionType type) {
		Iterable<ScxmlTransitionType> filter = Iterables.filter(type.eContainer().eContents(), ScxmlTransitionType.class);
		String name = "Transition_" + ((ScxmlStateType) type.eContainer()).getId() + "_" + Integer.toString(Iterables.indexOf(filter, new Predicate<ScxmlTransitionType>() {

			@Override
			public boolean apply(ScxmlTransitionType arg0) {
				return type.equals(arg0);
			}
		}));

		String script = getResourceServices().openEditor(type, name, getNG661DesignerModelUtils().getScript(type.getScript()));
		getNG661DesignerModelUtils().setScript(type, script);
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlScxmlType
	 */
	public void setScript(ScxmlScxmlType type) {
		String script = getResourceServices().openEditor(type, type.getId(), getNG661DesignerModelUtils().getScript(type.getScript()));
		getNG661DesignerModelUtils().setScript(type, script);
	}

	/**
	 * @param element
	 *            EObject
	 * @return id
	 */
	public String getRepresentationLabel(EObject element) {
		String label = "";
		if (element instanceof WidgetComposition && ((WidgetComposition) element).getRepresentation() != null) {
			String nameValue = null;
			EList<PropertyValue> values = ((WidgetComposition) element).getValues();
			for (PropertyValue propertyValue : values) {
				PropertyType property = propertyValue.getProperty();
				if (property != null) {
					String name = property.getName();
					if (name != null && name.equalsIgnoreCase("name")) {
						nameValue = propertyValue.getValue();
						break;
					}
				}
			}
			label = ((WidgetComposition) element).getRepresentation().getName();
			if (nameValue != null && !nameValue.isEmpty()) {
				String suffix = "\n<" + label + ">";
				return nameValue + suffix;
			}
		} else if (element instanceof ClipPathPrimitive) {
			label = "ClipPath";
		} else {
			EStructuralFeature featureID = element.eClass().getEStructuralFeature(ID);
			if (featureID != null && featureID.getEType().getName().contains(NAME_TYPE)) {
				String id = (String) element.eGet(featureID);
				if (id != null) {
					label += id;
				}
			}
		}
		String suffix = "\n<" + getSuffix(element) + ">";
		if (!label.endsWith(suffix)) {
			label += suffix;
		}
		return label;
	}

	/**
	 * @param element
	 *            EObject
	 * @return suffix
	 */
	public String getSuffix(EObject element) {
		String suffix = element.eClass().getName();
		if (element instanceof RepresentationTypes) {
			if (suffix.equals("RectPrimitive")) {
				suffix = "Rectangle";
			} else if (suffix.endsWith("ChildPrimitive")) {
				suffix = "Children";
			} else if (suffix.endsWith("Primitive")) {
				suffix = suffix.replace("Primitive", "");
			} else if (suffix.endsWith("Component")) {
				suffix = suffix.replace("Component", "");
			}
		}
		return suffix;
	}
	
	/**
	 * Set id to element.
	 * 
	 * @param element
	 *            EObject
	 */
	public void setRepresentation(EObject element, String newValue) {
		String suffix = "<" + getSuffix(element) + ">";
		if (newValue.endsWith(suffix)) {
			newValue = newValue.replaceAll(suffix, "");
		}
		newValue = newValue.trim();
		EStructuralFeature featureID = element.eClass().getEStructuralFeature(ID);
		if (featureID != null && featureID.getEType().getName().contains(NAME_TYPE)) {
			element.eSet(featureID, newValue);
		}
	}

	/**
	 * @param element
	 *            Representation Container
	 * @param className
	 *            class to create
	 * @return the new created object
	 */
	public EObject createRepresentation(EObject element, String className) {
		boolean touch = false;
		if (className.endsWith(TOUCH_AREA)) {
			className = className.substring(0, className.length() - TOUCH_AREA.length());
			touch = true;
		}
		return getEcoreServices().createIDElement(element, className, touch);
	}

	/**
	 * Add target in source.
	 * 
	 * @param source
	 *            EObject
	 * @param target
	 *            EObject
	 * @return source
	 */
	public EObject createContainmentLink(EObject source, EObject target) {
		EStructuralFeature parentFeature = getFeatureServices().getParentRepresentationFeatureName(source);
		if (parentFeature != null) {			
			getFeatureServices().addEObjectToReference(source, target, parentFeature);
		}
		return source;
	}

	/**
	 * @param source
	 *            EObject
	 * @return if a link can start to source
	 */
	public boolean canContainRepresentation(EObject source) {
		return !(source instanceof LinePrimitive || source instanceof PolylinePrimitive || source instanceof PolygonPrimitive || source instanceof PathPrimitive || source instanceof TextPrimitive || source instanceof ArcComponent || source instanceof CrownComponent || source instanceof PolarLineComponent || source instanceof PointerAreaPrimitive
				|| source instanceof TouchAreaPrimitive || source instanceof GestureAreaPrimitive || source instanceof KeyboardInputPrimitive || source instanceof ScrollWheelAreaPrimitive || source instanceof ChildPrimitive);
	}

	/**
	 * @param source
	 *            EObject
	 * @param target
	 *            EObject
	 * @return if a link can end on target
	 */
	public boolean canContainTargetRepresentation(EObject source, EObject target) {
		if (source instanceof ClipPathPrimitive && !(target instanceof RectPrimitive || target instanceof CirclePrimitive || target instanceof EllipsePrimitive || target instanceof LinePrimitive || target instanceof PathPrimitive)) {
			return false;
		}
		return true;
	}

	/**
	 * @param transitionScxmlTransitionType
	 * @return transition label
	 */
	public String getTransitionLabel(ScxmlTransitionType transition) {
		String label = "";
		if (transition.getEvent() != null) {
			label += transition.getEvent();
		}
		if (transition.getCond() != null) {
			label += "[" + transition.getCond() + "]";
		}
		return label;
	}

	/**
	 * @param onEntry
	 *            ScxmlOnentryType
	 * @return on entry label
	 */
	public String getOnentryLabel(ScxmlOnexecuteType onEntry) {
		String label = "";
		for (ScxmlSendType send : onEntry.getSend()) {
			label += send.getEvent() + "(";
			for (ScxmlParamType param : send.getParam()) {
				label += param.getName() + ":" + param.getExpr() + ", ";
			}
			if (label.endsWith(", ")) {
				label = label.substring(0, label.length() - 2);
			}
			label += ")\n";
		}

		return label;
	}
	
	/**
	 * @param onExit
	 *            ScxmlOnexitType
	 * @return on exit label
	 */
	public String getOnexitLabel(ScxmlOnexecuteType onExit) {
		String label = "";
		for (ScxmlSendType send : onExit.getSend()) {
			label += send.getEvent() + "(";
			for (ScxmlParamType param : send.getParam()) {
				label += param.getName() + ":" + param.getExpr() + ", ";
			}
			if (label.endsWith(", ")) {
				label = label.substring(0, label.length() - 2);
			}
			label += ")\n";
		}

		return label;
	}
	
	/**
	 * @param element
	 *            EObject
	 * @return associated element
	 */
	public List<EObject> getAssociatedElement(EObject element) {
		List<EObject> result = Lists.newArrayList();
		if (element instanceof ScxmlOnexecuteType) {
			result.addAll(((ScxmlOnexecuteType) element).getScript());
			result.addAll(((ScxmlOnexecuteType) element).getSend());
		}
		return result;
	}

	/**
	 * @param transition
	 *            ScxmlTransitionType
	 * @return label expression
	 */
	public String getTransitionInputLabelExpression(ScxmlTransitionType transition) {
		return transition.getEvent() + "[" + transition.getCond() + "]";
	}

	/**
	 * @param source
	 *            ScxmlStateType
	 * @param target
	 *            ScxmlStateType
	 * @return transition
	 */
	public ScxmlTransitionType createTransition(ScxmlStateType source, ScxmlStateType target) {
		ScxmlTransitionType element = (ScxmlTransitionType) getEcoreServices().createElement(source, "org.w3._2005._07.scxml.ScxmlTransitionType");
		String elementTarget = element.getTarget();
		if (elementTarget == null || (element != null && target != null && !elementTarget.equals(target.getId()))) {
			elementTarget = target.getId();
			element.setTarget(elementTarget);
		}
		return element;
	}

	/**
	 * Import all componentDefinitions in representation
	 * 
	 * @param representation
	 *            RepresentationType
	 * @param componentDefinitions
	 *            List<ComponentDefinitionType>
	 */
	public void importRepresentation(RepresentationType representation, List<ComponentDefinitionType> componentDefinitions) {
		for (ComponentDefinitionType componentDefinition : componentDefinitions) {
			getNG661DesignerModelUtils().addWidgetComposition(representation, componentDefinition);
		}
	}

	/**
	 * Import all componentDefinitions in representation
	 * 
	 * @param representation
	 *            RepresentationType
	 * @param componentDefinitions
	 *            List<ComponentDefinitionType>
	 */
	public void importProperty(WidgetComposition widgetComposition, List<PropertyType> propertyTypes) {
		// add property value
		for (PropertyType property : propertyTypes) {
			if (!getNG661DesignerModelUtils().contains(property, widgetComposition.getValues())) {
				getNG661DesignerModelUtils().addPropertyValue(widgetComposition, property);
			}
		}
		List<EObject> toRemove = Lists.newArrayList();
		for (PropertyValue value : widgetComposition.getValues()) {
			if (!propertyTypes.contains(value.getProperty())) {
				toRemove.add(value);
			}
		}
		// remove property value
		widgetComposition.getValues().removeAll(toRemove);
	}

	/**
	 * @param eObject
	 *            EObject
	 * @return representation associated elements.
	 */
	public List<EObject> getRepresentationAssociatedElements(EObject eObject) {
		List<EObject> result = Lists.newArrayList();
		result.add(eObject);
		if (eObject instanceof WidgetComposition) {
			result.addAll(((WidgetComposition) eObject).getValues());
		}
		return result;
	}

}
