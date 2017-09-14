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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.DocumentRoot;
import org.polarsys.ng661designer.dsl.part2.gen.FunctionType;
import org.polarsys.ng661designer.dsl.part2.gen.ImportType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyType;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyValue;
import org.polarsys.ng661designer.dsl.part2.gen.RepresentationType;
import org.polarsys.ng661designer.dsl.part2.gen.WidgetComposition;
import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlScriptType;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerModelUtils {

	private EcoreServices ecoreServices;

	/**
	 * @return EcoreServices
	 */
	private EcoreServices getEcoreServices() {
		if (ecoreServices == null) {
			ecoreServices = new EcoreServices();
		}
		return ecoreServices;
	}

	@SuppressWarnings("rawtypes")
	public void setScriptElement(EObject element, String script) {
		Object eGet = element.eGet(element.eClass().getEStructuralFeature("script"));
		if (eGet instanceof List && ((List) eGet).isEmpty()) {
			getEcoreServices().createElement(element, "org.w3._2005._07.scxml.ScxmlScriptType");
		}
		EObject eObject = (EObject) ((List) eGet).get(0);
		eObject.eSet(eObject.eClass().getEStructuralFeature("src"), script);
	}

	public void setScript(EObject element, String script) {
		if (element instanceof FunctionType) {
			((FunctionType) element).setScript(script);
		} else if (element instanceof ScxmlScxmlType || element instanceof ScxmlTransitionType || element instanceof ScxmlOnexecuteType) {
			setScriptElement(element, script);
		}
	}

	/**
	 * @param list
	 *            ScxmlScriptType
	 * @return first script
	 */
	public String getScript(List<ScxmlScriptType> list) {
		if (list.isEmpty()) {
			return "";
		}
		return list.get(0).getSrc();
	}

	/**
	 * @param transition
	 *            ScxmlTransitionType
	 * @param behavior
	 *            ScxmlScxmlType
	 * @return the target states.
	 */
	public List<ScxmlStateType> getTransitionTarget(ScxmlTransitionType transition, ScxmlScxmlType behavior) {
		List<ScxmlStateType> result = Lists.newArrayList();
		String target = transition.getTarget();
		if (target != null) {			
			for (Iterator<EObject> iterator = behavior.eAllContents(); iterator.hasNext();) {
				EObject element = (EObject) iterator.next();
				if (element instanceof ScxmlStateType && target.equalsIgnoreCase(((ScxmlStateType) element).getId())) {
					result.add((ScxmlStateType) element);
				}
			}
		}
		return result;
	}

	/**
	 * @param state
	 *            ScxmlStateType
	 * @return if initial state
	 */
	public boolean isInitialState(ScxmlStateType state) {
		if (state.eContainer() instanceof ScxmlScxmlType) {
			String initial = ((ScxmlScxmlType) state.eContainer()).getInitial();
			if (initial != null) {
				return initial.equalsIgnoreCase(state.getId());
			}
		}
		if (state.eContainer() instanceof ScxmlStateType) {
			String initial = ((ScxmlStateType) state.eContainer()).getInitial();
			if (initial != null) {
				return initial.equalsIgnoreCase(state.getId());
			}
		}
		return false;
	}

	/**
	 * @param state
	 *            ScxmlStateType
	 * @return if not initial state
	 */
	public boolean isNotInitialState(ScxmlStateType state) {
		return !isInitialState(state);
	}

	/**
	 * @param element
	 *            RepresentationType
	 * @return all ComponentDefinitionType in session.
	 */
	public List<ComponentDefinitionType> getAllComponentDefinitions(RepresentationType element) {
		List<ComponentDefinitionType> result = Lists.newArrayList();
		Session session = SessionManager.INSTANCE.getSession(element);
		if (session != null) {
			for (Resource resource : session.getSemanticResources()) {
				if (!resource.getContents().isEmpty() && resource.getContents().get(0) instanceof DocumentRoot && ((DocumentRoot) resource.getContents().get(0)).getComponentDefinition() != null && !Strings.isNullOrEmpty(((DocumentRoot) resource.getContents().get(0)).getComponentDefinition().getName())) {
					result.add(((DocumentRoot) resource.getContents().get(0)).getComponentDefinition());
				}
			}
			result.remove(element.eContainer());
		}
		return result;
	}

	/**
	 * Add widget composition.
	 * 
	 * @param representation
	 *            RepresentationType
	 * @param componentDefinition
	 *            ComponentDefinitionType
	 */
	public WidgetComposition addWidgetComposition(RepresentationType representation, ComponentDefinitionType componentDefinition) {
		if (Strings.isNullOrEmpty(componentDefinition.getName())) {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Add widget composition", "The reused representation has no name, it will not be imported.");
			return null;
		}
		// create widget composition
		WidgetComposition widgetComposition = Part2Factory.eINSTANCE.createWidgetComposition();
		widgetComposition.setRepresentation(componentDefinition);
		if (componentDefinition.getInterface() != null) {
			for (PropertyType property : componentDefinition.getInterface().getProperty()) {
				createPropertyValue(widgetComposition, property);
			}
		}
		representation.getGroup().add(widgetComposition);
		// add import
		List<ImportType> imports = ((ComponentDefinitionType) representation.eContainer()).getImport();
		if (!contains(imports, componentDefinition)) {
			ImportType importType = Part2Factory.eINSTANCE.createImportType();
			importType.setFile(componentDefinition.eResource().getURI().lastSegment());
			((ComponentDefinitionType) representation.eContainer()).getImport().add(importType);
		}
		return widgetComposition;
	}

	/**
	 * Create property value.
	 * 
	 * @param widgetComposition
	 *            WidgetComposition
	 * @param property
	 *            PropertyType
	 */
	protected PropertyValue createPropertyValue(WidgetComposition widgetComposition, PropertyType property) {
		PropertyValue value = Part2Factory.eINSTANCE.createPropertyValue();
		value.setProperty(property);
		widgetComposition.getValues().add(value);
		return value;
	}

	/**
	 * @param imports
	 *            List<ImportType>
	 * @param componentDefinition
	 *            ComponentDefinitionType
	 * @return if componentDefinition is already is imports list
	 */
	private boolean contains(List<ImportType> imports, ComponentDefinitionType componentDefinition) {
		for (ImportType importType : imports) {
			if (importType.getFile() != null && importType.getFile().equals(componentDefinition.eResource().getURI().lastSegment())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Add widget composition.
	 * 
	 * @param representation
	 *            RepresentationType
	 * @param componentDefinition
	 *            ComponentDefinitionType
	 */
	public PropertyValue addPropertyValue(WidgetComposition widgetComposition, PropertyType property) {
		if (Strings.isNullOrEmpty(property.getName())) {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Add property value", "The reused property has no name, it will not be imported.");
			return null;
		}
		return createPropertyValue(widgetComposition, property);
	}

	/**
	 * @param element
	 *            RepresentationType
	 * @return all ComponentDefinitionType in session.
	 */
	public List<PropertyType> getProperties(WidgetComposition widgetComposition) {
		List<PropertyType> properties = Lists.newArrayList();
		if (widgetComposition.getRepresentation() != null && widgetComposition.getRepresentation().getInterface() != null) {
			properties.addAll(widgetComposition.getRepresentation().getInterface().getProperty());
			// for (PropertyValue value : widgetComposition.getValues()) {
			// properties.remove(value.getProperty());
			// }
		}
		return properties;
	}

	/**
	 * @param propertyType
	 *            PropertyType
	 * @param values
	 *            List<PropertyValue>
	 * @return if propertyType is referenced in the list.
	 */
	public boolean contains(PropertyType propertyType, List<PropertyValue> values) {
		for (PropertyValue value : values) {
			if (value.getProperty() != null && value.getProperty().equals(propertyType)) {
				return true;
			}
		}
		return false;
	}
}
