/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005._07.scxml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlFactoryImpl extends EFactoryImpl implements ScxmlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScxmlFactory init() {
		try {
			ScxmlFactory theScxmlFactory = (ScxmlFactory)EPackage.Registry.INSTANCE.getEFactory(ScxmlPackage.eNS_URI);
			if (theScxmlFactory != null) {
				return theScxmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScxmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE: return createScxmlOnexecuteType();
			case ScxmlPackage.SCXML_PARAM_TYPE: return createScxmlParamType();
			case ScxmlPackage.SCXML_SCRIPT_TYPE: return createScxmlScriptType();
			case ScxmlPackage.SCXML_SCXML_TYPE: return createScxmlScxmlType();
			case ScxmlPackage.SCXML_SEND_TYPE: return createScxmlSendType();
			case ScxmlPackage.SCXML_STATE_TYPE: return createScxmlStateType();
			case ScxmlPackage.SCXML_TRANSITION_TYPE: return createScxmlTransitionType();
			case ScxmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlPackage.SCXML_EXPR_TYPE:
				return createScxmlExprTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_ID_TYPE:
				return createScxmlIdTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_PARAM_NAME_TYPE:
				return createScxmlParamNameTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_SCRIPT_SOURCE_TYPE:
				return createScxmlScriptSourceTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_SEND_EVENT_TYPE:
				return createScxmlSendEventTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_TRANSITION_COND_TYPE:
				return createScxmlTransitionCondTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_TRANSITION_EVENT_TYPE:
				return createScxmlTransitionEventTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlPackage.SCXML_EXPR_TYPE:
				return convertScxmlExprTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_ID_TYPE:
				return convertScxmlIdTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_PARAM_NAME_TYPE:
				return convertScxmlParamNameTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_SCRIPT_SOURCE_TYPE:
				return convertScxmlScriptSourceTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_SEND_EVENT_TYPE:
				return convertScxmlSendEventTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_TRANSITION_COND_TYPE:
				return convertScxmlTransitionCondTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_TRANSITION_EVENT_TYPE:
				return convertScxmlTransitionEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlOnexecuteType createScxmlOnexecuteType() {
		ScxmlOnexecuteTypeImpl scxmlOnexecuteType = new ScxmlOnexecuteTypeImpl();
		return scxmlOnexecuteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlParamType createScxmlParamType() {
		ScxmlParamTypeImpl scxmlParamType = new ScxmlParamTypeImpl();
		return scxmlParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlScriptType createScxmlScriptType() {
		ScxmlScriptTypeImpl scxmlScriptType = new ScxmlScriptTypeImpl();
		return scxmlScriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlScxmlType createScxmlScxmlType() {
		ScxmlScxmlTypeImpl scxmlScxmlType = new ScxmlScxmlTypeImpl();
		return scxmlScxmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlSendType createScxmlSendType() {
		ScxmlSendTypeImpl scxmlSendType = new ScxmlSendTypeImpl();
		return scxmlSendType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlStateType createScxmlStateType() {
		ScxmlStateTypeImpl scxmlStateType = new ScxmlStateTypeImpl();
		return scxmlStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlTransitionType createScxmlTransitionType() {
		ScxmlTransitionTypeImpl scxmlTransitionType = new ScxmlTransitionTypeImpl();
		return scxmlTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlExprTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlExprTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlParamNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlParamNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlScriptSourceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlScriptSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlSendEventTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlSendEventTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlTransitionCondTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionCondTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlTransitionEventTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionEventTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlPackage getScxmlPackage() {
		return (ScxmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScxmlPackage getPackage() {
		return ScxmlPackage.eINSTANCE;
	}

} //ScxmlFactoryImpl
