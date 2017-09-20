/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.w3._2005._07.scxml.ScxmlFactory
 * @model kind="package"
 * @generated
 */
public interface ScxmlPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scxml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/07/scxml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "p";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScxmlPackage eINSTANCE = org.w3._2005._07.scxml.impl.ScxmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl <em>Onexecute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlOnexecuteType()
	 * @generated
	 */
	int SCXML_ONEXECUTE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Scxml Executablecontent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE__SEND = 2;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE__SCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Onexecute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Onexecute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_ONEXECUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlParamTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlParamType()
	 * @generated
	 */
	int SCXML_PARAM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Scxml Extra Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE__SCXML_EXTRA_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE__EXPR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_PARAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlScriptTypeImpl <em>Script Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlScriptTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScriptType()
	 * @generated
	 */
	int SCXML_SCRIPT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Scxml Extra Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE__SCXML_EXTRA_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE__SRC = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE__CONTENT = 4;

	/**
	 * The number of structural features of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCRIPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlScxmlTypeImpl <em>Scxml Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlScxmlTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScxmlType()
	 * @generated
	 */
	int SCXML_SCXML_TYPE = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE__INITIAL = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Scxml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scxml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SCXML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlSendTypeImpl <em>Send Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlSendTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlSendType()
	 * @generated
	 */
	int SCXML_SEND_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SEND_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SEND_TYPE__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Send Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SEND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Send Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_SEND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl <em>State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlStateType()
	 * @generated
	 */
	int SCXML_STATE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__ONENTRY = 0;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__ONEXIT = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE__INITIAL = 5;

	/**
	 * The number of structural features of the '<em>State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionType()
	 * @generated
	 */
	int SCXML_TRANSITION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Scxml Executablecontent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__SEND = 2;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__SCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__COND = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__EVENT = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE__TARGET = 6;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCXML_TRANSITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005._07.scxml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005._07.scxml.impl.DocumentRootImpl
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Scxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCXML = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Expr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlExprType()
	 * @generated
	 */
	int SCXML_EXPR_TYPE = 8;

	/**
	 * The meta object id for the '<em>Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlIdType()
	 * @generated
	 */
	int SCXML_ID_TYPE = 9;

	/**
	 * The meta object id for the '<em>Param Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlParamNameType()
	 * @generated
	 */
	int SCXML_PARAM_NAME_TYPE = 10;

	/**
	 * The meta object id for the '<em>Script Source Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScriptSourceType()
	 * @generated
	 */
	int SCXML_SCRIPT_SOURCE_TYPE = 11;

	/**
	 * The meta object id for the '<em>Send Event Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlSendEventType()
	 * @generated
	 */
	int SCXML_SEND_EVENT_TYPE = 12;

	/**
	 * The meta object id for the '<em>Transition Cond Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionCondType()
	 * @generated
	 */
	int SCXML_TRANSITION_COND_TYPE = 13;

	/**
	 * The meta object id for the '<em>Transition Event Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionEventType()
	 * @generated
	 */
	int SCXML_TRANSITION_EVENT_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType <em>Onexecute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onexecute Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType
	 * @generated
	 */
	EClass getScxmlOnexecuteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType#getScxmlExecutablecontent <em>Scxml Executablecontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scxml Executablecontent</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType#getScxmlExecutablecontent()
	 * @see #getScxmlOnexecuteType()
	 * @generated
	 */
	EAttribute getScxmlOnexecuteType_ScxmlExecutablecontent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType#getAny()
	 * @see #getScxmlOnexecuteType()
	 * @generated
	 */
	EAttribute getScxmlOnexecuteType_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType#getSend()
	 * @see #getScxmlOnexecuteType()
	 * @generated
	 */
	EReference getScxmlOnexecuteType_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType#getScript()
	 * @see #getScxmlOnexecuteType()
	 * @generated
	 */
	EReference getScxmlOnexecuteType_Script();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlOnexecuteType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlOnexecuteType#getAnyAttribute()
	 * @see #getScxmlOnexecuteType()
	 * @generated
	 */
	EAttribute getScxmlOnexecuteType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType
	 * @generated
	 */
	EClass getScxmlParamType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlParamType#getScxmlExtraContent <em>Scxml Extra Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scxml Extra Content</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType#getScxmlExtraContent()
	 * @see #getScxmlParamType()
	 * @generated
	 */
	EAttribute getScxmlParamType_ScxmlExtraContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlParamType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType#getAny()
	 * @see #getScxmlParamType()
	 * @generated
	 */
	EAttribute getScxmlParamType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlParamType#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType#getExpr()
	 * @see #getScxmlParamType()
	 * @generated
	 */
	EAttribute getScxmlParamType_Expr();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType#getName()
	 * @see #getScxmlParamType()
	 * @generated
	 */
	EAttribute getScxmlParamType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlParamType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlParamType#getAnyAttribute()
	 * @see #getScxmlParamType()
	 * @generated
	 */
	EAttribute getScxmlParamType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType
	 * @generated
	 */
	EClass getScxmlScriptType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlScriptType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType#getMixed()
	 * @see #getScxmlScriptType()
	 * @generated
	 */
	EAttribute getScxmlScriptType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlScriptType#getScxmlExtraContent <em>Scxml Extra Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scxml Extra Content</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType#getScxmlExtraContent()
	 * @see #getScxmlScriptType()
	 * @generated
	 */
	EAttribute getScxmlScriptType_ScxmlExtraContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlScriptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType#getAny()
	 * @see #getScxmlScriptType()
	 * @generated
	 */
	EAttribute getScxmlScriptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlScriptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType#getSrc()
	 * @see #getScxmlScriptType()
	 * @generated
	 */
	EAttribute getScxmlScriptType_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlScriptType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType#getContent()
	 * @see #getScxmlScriptType()
	 * @generated
	 */
	EAttribute getScxmlScriptType_Content();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlScxmlType <em>Scxml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scxml Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType
	 * @generated
	 */
	EClass getScxmlScxmlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlScxmlType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType#getState()
	 * @see #getScxmlScxmlType()
	 * @generated
	 */
	EReference getScxmlScxmlType_State();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlScxmlType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType#getScript()
	 * @see #getScxmlScxmlType()
	 * @generated
	 */
	EReference getScxmlScxmlType_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlScxmlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType#getId()
	 * @see #getScxmlScxmlType()
	 * @generated
	 */
	EAttribute getScxmlScxmlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlScxmlType#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType#getInitial()
	 * @see #getScxmlScxmlType()
	 * @generated
	 */
	EAttribute getScxmlScxmlType_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlScxmlType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType#getVersion()
	 * @see #getScxmlScxmlType()
	 * @generated
	 */
	EAttribute getScxmlScxmlType_Version();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlSendType <em>Send Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlSendType
	 * @generated
	 */
	EClass getScxmlSendType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlSendType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlSendType#getParam()
	 * @see #getScxmlSendType()
	 * @generated
	 */
	EReference getScxmlSendType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlSendType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlSendType#getEvent()
	 * @see #getScxmlSendType()
	 * @generated
	 */
	EAttribute getScxmlSendType_Event();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlStateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType
	 * @generated
	 */
	EClass getScxmlStateType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlStateType#getOnentry <em>Onentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onentry</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getOnentry()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EReference getScxmlStateType_Onentry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlStateType#getOnexit <em>Onexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onexit</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getOnexit()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EReference getScxmlStateType_Onexit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlStateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getTransition()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EReference getScxmlStateType_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlStateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getState()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EReference getScxmlStateType_State();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlStateType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getId()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EAttribute getScxmlStateType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlStateType#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlStateType#getInitial()
	 * @see #getScxmlStateType()
	 * @generated
	 */
	EAttribute getScxmlStateType_Initial();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.ScxmlTransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType
	 * @generated
	 */
	EClass getScxmlTransitionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getScxmlExecutablecontent <em>Scxml Executablecontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scxml Executablecontent</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getScxmlExecutablecontent()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EAttribute getScxmlTransitionType_ScxmlExecutablecontent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getAny()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EAttribute getScxmlTransitionType_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getSend()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EReference getScxmlTransitionType_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getScript()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EReference getScxmlTransitionType_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getCond()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EAttribute getScxmlTransitionType_Cond();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getEvent()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EAttribute getScxmlTransitionType_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005._07.scxml.ScxmlTransitionType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType#getTarget()
	 * @see #getScxmlTransitionType()
	 * @generated
	 */
	EAttribute getScxmlTransitionType_Target();

	/**
	 * Returns the meta object for class '{@link org.w3._2005._07.scxml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2005._07.scxml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005._07.scxml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2005._07.scxml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005._07.scxml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2005._07.scxml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005._07.scxml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2005._07.scxml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005._07.scxml.DocumentRoot#getScxml <em>Scxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scxml</em>'.
	 * @see org.w3._2005._07.scxml.DocumentRoot#getScxml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scxml();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expr Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.expr.type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getScxmlExprType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.id.type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*'"
	 * @generated
	 */
	EDataType getScxmlIdType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Param Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Param Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.param.Name.type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*'"
	 * @generated
	 */
	EDataType getScxmlParamNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Script Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Script Source Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.script.source.type' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getScxmlScriptSourceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Send Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Send Event Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.send.event.type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(\\i|\\d)+(\\.(\\i|\\d)+)*'"
	 * @generated
	 */
	EDataType getScxmlSendEventType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Transition Cond Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transition Cond Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.transition.cond.type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getScxmlTransitionCondType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Transition Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transition Event Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='scxml.transition.event.type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\.?\\*|(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?(\\s(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?)*'"
	 * @generated
	 */
	EDataType getScxmlTransitionEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScxmlFactory getScxmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl <em>Onexecute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlOnexecuteType()
		 * @generated
		 */
		EClass SCXML_ONEXECUTE_TYPE = eINSTANCE.getScxmlOnexecuteType();

		/**
		 * The meta object literal for the '<em><b>Scxml Executablecontent</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT = eINSTANCE.getScxmlOnexecuteType_ScxmlExecutablecontent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_ONEXECUTE_TYPE__ANY = eINSTANCE.getScxmlOnexecuteType_Any();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_ONEXECUTE_TYPE__SEND = eINSTANCE.getScxmlOnexecuteType_Send();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_ONEXECUTE_TYPE__SCRIPT = eINSTANCE.getScxmlOnexecuteType_Script();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getScxmlOnexecuteType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlParamTypeImpl <em>Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlParamTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlParamType()
		 * @generated
		 */
		EClass SCXML_PARAM_TYPE = eINSTANCE.getScxmlParamType();

		/**
		 * The meta object literal for the '<em><b>Scxml Extra Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_PARAM_TYPE__SCXML_EXTRA_CONTENT = eINSTANCE.getScxmlParamType_ScxmlExtraContent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_PARAM_TYPE__ANY = eINSTANCE.getScxmlParamType_Any();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_PARAM_TYPE__EXPR = eINSTANCE.getScxmlParamType_Expr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_PARAM_TYPE__NAME = eINSTANCE.getScxmlParamType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_PARAM_TYPE__ANY_ATTRIBUTE = eINSTANCE.getScxmlParamType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlScriptTypeImpl <em>Script Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlScriptTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScriptType()
		 * @generated
		 */
		EClass SCXML_SCRIPT_TYPE = eINSTANCE.getScxmlScriptType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCRIPT_TYPE__MIXED = eINSTANCE.getScxmlScriptType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Scxml Extra Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCRIPT_TYPE__SCXML_EXTRA_CONTENT = eINSTANCE.getScxmlScriptType_ScxmlExtraContent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCRIPT_TYPE__ANY = eINSTANCE.getScxmlScriptType_Any();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCRIPT_TYPE__SRC = eINSTANCE.getScxmlScriptType_Src();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCRIPT_TYPE__CONTENT = eINSTANCE.getScxmlScriptType_Content();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlScxmlTypeImpl <em>Scxml Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlScxmlTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScxmlType()
		 * @generated
		 */
		EClass SCXML_SCXML_TYPE = eINSTANCE.getScxmlScxmlType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_SCXML_TYPE__STATE = eINSTANCE.getScxmlScxmlType_State();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_SCXML_TYPE__SCRIPT = eINSTANCE.getScxmlScxmlType_Script();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCXML_TYPE__ID = eINSTANCE.getScxmlScxmlType_Id();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCXML_TYPE__INITIAL = eINSTANCE.getScxmlScxmlType_Initial();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SCXML_TYPE__VERSION = eINSTANCE.getScxmlScxmlType_Version();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlSendTypeImpl <em>Send Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlSendTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlSendType()
		 * @generated
		 */
		EClass SCXML_SEND_TYPE = eINSTANCE.getScxmlSendType();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_SEND_TYPE__PARAM = eINSTANCE.getScxmlSendType_Param();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_SEND_TYPE__EVENT = eINSTANCE.getScxmlSendType_Event();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl <em>State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlStateTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlStateType()
		 * @generated
		 */
		EClass SCXML_STATE_TYPE = eINSTANCE.getScxmlStateType();

		/**
		 * The meta object literal for the '<em><b>Onentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_STATE_TYPE__ONENTRY = eINSTANCE.getScxmlStateType_Onentry();

		/**
		 * The meta object literal for the '<em><b>Onexit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_STATE_TYPE__ONEXIT = eINSTANCE.getScxmlStateType_Onexit();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_STATE_TYPE__TRANSITION = eINSTANCE.getScxmlStateType_Transition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_STATE_TYPE__STATE = eINSTANCE.getScxmlStateType_State();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_STATE_TYPE__ID = eINSTANCE.getScxmlStateType_Id();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_STATE_TYPE__INITIAL = eINSTANCE.getScxmlStateType_Initial();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.ScxmlTransitionTypeImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionType()
		 * @generated
		 */
		EClass SCXML_TRANSITION_TYPE = eINSTANCE.getScxmlTransitionType();

		/**
		 * The meta object literal for the '<em><b>Scxml Executablecontent</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT = eINSTANCE.getScxmlTransitionType_ScxmlExecutablecontent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_TRANSITION_TYPE__ANY = eINSTANCE.getScxmlTransitionType_Any();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_TRANSITION_TYPE__SEND = eINSTANCE.getScxmlTransitionType_Send();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCXML_TRANSITION_TYPE__SCRIPT = eINSTANCE.getScxmlTransitionType_Script();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_TRANSITION_TYPE__COND = eINSTANCE.getScxmlTransitionType_Cond();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_TRANSITION_TYPE__EVENT = eINSTANCE.getScxmlTransitionType_Event();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCXML_TRANSITION_TYPE__TARGET = eINSTANCE.getScxmlTransitionType_Target();

		/**
		 * The meta object literal for the '{@link org.w3._2005._07.scxml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005._07.scxml.impl.DocumentRootImpl
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Scxml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCXML = eINSTANCE.getDocumentRoot_Scxml();

		/**
		 * The meta object literal for the '<em>Expr Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlExprType()
		 * @generated
		 */
		EDataType SCXML_EXPR_TYPE = eINSTANCE.getScxmlExprType();

		/**
		 * The meta object literal for the '<em>Id Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlIdType()
		 * @generated
		 */
		EDataType SCXML_ID_TYPE = eINSTANCE.getScxmlIdType();

		/**
		 * The meta object literal for the '<em>Param Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlParamNameType()
		 * @generated
		 */
		EDataType SCXML_PARAM_NAME_TYPE = eINSTANCE.getScxmlParamNameType();

		/**
		 * The meta object literal for the '<em>Script Source Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlScriptSourceType()
		 * @generated
		 */
		EDataType SCXML_SCRIPT_SOURCE_TYPE = eINSTANCE.getScxmlScriptSourceType();

		/**
		 * The meta object literal for the '<em>Send Event Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlSendEventType()
		 * @generated
		 */
		EDataType SCXML_SEND_EVENT_TYPE = eINSTANCE.getScxmlSendEventType();

		/**
		 * The meta object literal for the '<em>Transition Cond Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionCondType()
		 * @generated
		 */
		EDataType SCXML_TRANSITION_COND_TYPE = eINSTANCE.getScxmlTransitionCondType();

		/**
		 * The meta object literal for the '<em>Transition Event Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005._07.scxml.impl.ScxmlPackageImpl#getScxmlTransitionEventType()
		 * @generated
		 */
		EDataType SCXML_TRANSITION_EVENT_TYPE = eINSTANCE.getScxmlTransitionEventType();

	}

} //ScxmlPackage
