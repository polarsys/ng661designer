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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

import org.polarsys.ng661designer.dsl.part2.gen.impl.Part2PackageImpl;

import org.w3._2005._07.scxml.DocumentRoot;
import org.w3._2005._07.scxml.ScxmlFactory;
import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlParamType;
import org.w3._2005._07.scxml.ScxmlScriptType;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlSendType;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

import org.w3._2005._07.scxml.util.ScxmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlPackageImpl extends EPackageImpl implements ScxmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlOnexecuteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlScriptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlScxmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlSendTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlStateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scxmlTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlExprTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlParamNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlScriptSourceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlSendEventTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlTransitionCondTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scxmlTransitionEventTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3._2005._07.scxml.ScxmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScxmlPackageImpl() {
		super(eNS_URI, ScxmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScxmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScxmlPackage init() {
		if (isInited) return (ScxmlPackage)EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI);

		// Obtain or create and register package
		ScxmlPackageImpl theScxmlPackage = (ScxmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScxmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScxmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Part2PackageImpl thePart2Package = (Part2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI) instanceof Part2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI) : Part2Package.eINSTANCE);

		// Load packages
		thePart2Package.loadPackage();

		// Create package meta-data objects
		theScxmlPackage.createPackageContents();

		// Initialize created meta-data
		theScxmlPackage.initializePackageContents();

		// Fix loaded packages
		thePart2Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theScxmlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ScxmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theScxmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScxmlPackage.eNS_URI, theScxmlPackage);
		return theScxmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlOnexecuteType() {
		return scxmlOnexecuteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlOnexecuteType_ScxmlExecutablecontent() {
		return (EAttribute)scxmlOnexecuteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlOnexecuteType_Any() {
		return (EAttribute)scxmlOnexecuteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlOnexecuteType_Send() {
		return (EReference)scxmlOnexecuteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlOnexecuteType_Script() {
		return (EReference)scxmlOnexecuteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlOnexecuteType_AnyAttribute() {
		return (EAttribute)scxmlOnexecuteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlParamType() {
		return scxmlParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlParamType_ScxmlExtraContent() {
		return (EAttribute)scxmlParamTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlParamType_Any() {
		return (EAttribute)scxmlParamTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlParamType_Expr() {
		return (EAttribute)scxmlParamTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlParamType_Name() {
		return (EAttribute)scxmlParamTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlParamType_AnyAttribute() {
		return (EAttribute)scxmlParamTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlScriptType() {
		return scxmlScriptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScriptType_Mixed() {
		return (EAttribute)scxmlScriptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScriptType_ScxmlExtraContent() {
		return (EAttribute)scxmlScriptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScriptType_Any() {
		return (EAttribute)scxmlScriptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScriptType_Src() {
		return (EAttribute)scxmlScriptTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScriptType_Content() {
		return (EAttribute)scxmlScriptTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlScxmlType() {
		return scxmlScxmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlScxmlType_State() {
		return (EReference)scxmlScxmlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlScxmlType_Script() {
		return (EReference)scxmlScxmlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScxmlType_Id() {
		return (EAttribute)scxmlScxmlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScxmlType_Initial() {
		return (EAttribute)scxmlScxmlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlScxmlType_Version() {
		return (EAttribute)scxmlScxmlTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlSendType() {
		return scxmlSendTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlSendType_Param() {
		return (EReference)scxmlSendTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlSendType_Event() {
		return (EAttribute)scxmlSendTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlStateType() {
		return scxmlStateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlStateType_Onentry() {
		return (EReference)scxmlStateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlStateType_Onexit() {
		return (EReference)scxmlStateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlStateType_Transition() {
		return (EReference)scxmlStateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlStateType_State() {
		return (EReference)scxmlStateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlStateType_Id() {
		return (EAttribute)scxmlStateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlStateType_Initial() {
		return (EAttribute)scxmlStateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScxmlTransitionType() {
		return scxmlTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlTransitionType_ScxmlExecutablecontent() {
		return (EAttribute)scxmlTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlTransitionType_Any() {
		return (EAttribute)scxmlTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlTransitionType_Send() {
		return (EReference)scxmlTransitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScxmlTransitionType_Script() {
		return (EReference)scxmlTransitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlTransitionType_Cond() {
		return (EAttribute)scxmlTransitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlTransitionType_Event() {
		return (EAttribute)scxmlTransitionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScxmlTransitionType_Target() {
		return (EAttribute)scxmlTransitionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scxml() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlExprType() {
		return scxmlExprTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlIdType() {
		return scxmlIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlParamNameType() {
		return scxmlParamNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlScriptSourceType() {
		return scxmlScriptSourceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlSendEventType() {
		return scxmlSendEventTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlTransitionCondType() {
		return scxmlTransitionCondTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScxmlTransitionEventType() {
		return scxmlTransitionEventTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlFactory getScxmlFactory() {
		return (ScxmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scxmlOnexecuteTypeEClass = createEClass(SCXML_ONEXECUTE_TYPE);
		createEAttribute(scxmlOnexecuteTypeEClass, SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT);
		createEAttribute(scxmlOnexecuteTypeEClass, SCXML_ONEXECUTE_TYPE__ANY);
		createEReference(scxmlOnexecuteTypeEClass, SCXML_ONEXECUTE_TYPE__SEND);
		createEReference(scxmlOnexecuteTypeEClass, SCXML_ONEXECUTE_TYPE__SCRIPT);
		createEAttribute(scxmlOnexecuteTypeEClass, SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE);

		scxmlParamTypeEClass = createEClass(SCXML_PARAM_TYPE);
		createEAttribute(scxmlParamTypeEClass, SCXML_PARAM_TYPE__SCXML_EXTRA_CONTENT);
		createEAttribute(scxmlParamTypeEClass, SCXML_PARAM_TYPE__ANY);
		createEAttribute(scxmlParamTypeEClass, SCXML_PARAM_TYPE__EXPR);
		createEAttribute(scxmlParamTypeEClass, SCXML_PARAM_TYPE__NAME);
		createEAttribute(scxmlParamTypeEClass, SCXML_PARAM_TYPE__ANY_ATTRIBUTE);

		scxmlScriptTypeEClass = createEClass(SCXML_SCRIPT_TYPE);
		createEAttribute(scxmlScriptTypeEClass, SCXML_SCRIPT_TYPE__MIXED);
		createEAttribute(scxmlScriptTypeEClass, SCXML_SCRIPT_TYPE__SCXML_EXTRA_CONTENT);
		createEAttribute(scxmlScriptTypeEClass, SCXML_SCRIPT_TYPE__ANY);
		createEAttribute(scxmlScriptTypeEClass, SCXML_SCRIPT_TYPE__SRC);
		createEAttribute(scxmlScriptTypeEClass, SCXML_SCRIPT_TYPE__CONTENT);

		scxmlScxmlTypeEClass = createEClass(SCXML_SCXML_TYPE);
		createEReference(scxmlScxmlTypeEClass, SCXML_SCXML_TYPE__STATE);
		createEReference(scxmlScxmlTypeEClass, SCXML_SCXML_TYPE__SCRIPT);
		createEAttribute(scxmlScxmlTypeEClass, SCXML_SCXML_TYPE__ID);
		createEAttribute(scxmlScxmlTypeEClass, SCXML_SCXML_TYPE__INITIAL);
		createEAttribute(scxmlScxmlTypeEClass, SCXML_SCXML_TYPE__VERSION);

		scxmlSendTypeEClass = createEClass(SCXML_SEND_TYPE);
		createEReference(scxmlSendTypeEClass, SCXML_SEND_TYPE__PARAM);
		createEAttribute(scxmlSendTypeEClass, SCXML_SEND_TYPE__EVENT);

		scxmlStateTypeEClass = createEClass(SCXML_STATE_TYPE);
		createEReference(scxmlStateTypeEClass, SCXML_STATE_TYPE__ONENTRY);
		createEReference(scxmlStateTypeEClass, SCXML_STATE_TYPE__ONEXIT);
		createEReference(scxmlStateTypeEClass, SCXML_STATE_TYPE__TRANSITION);
		createEReference(scxmlStateTypeEClass, SCXML_STATE_TYPE__STATE);
		createEAttribute(scxmlStateTypeEClass, SCXML_STATE_TYPE__ID);
		createEAttribute(scxmlStateTypeEClass, SCXML_STATE_TYPE__INITIAL);

		scxmlTransitionTypeEClass = createEClass(SCXML_TRANSITION_TYPE);
		createEAttribute(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__SCXML_EXECUTABLECONTENT);
		createEAttribute(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__ANY);
		createEReference(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__SEND);
		createEReference(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__SCRIPT);
		createEAttribute(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__COND);
		createEAttribute(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__EVENT);
		createEAttribute(scxmlTransitionTypeEClass, SCXML_TRANSITION_TYPE__TARGET);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCXML);

		// Create data types
		scxmlExprTypeEDataType = createEDataType(SCXML_EXPR_TYPE);
		scxmlIdTypeEDataType = createEDataType(SCXML_ID_TYPE);
		scxmlParamNameTypeEDataType = createEDataType(SCXML_PARAM_NAME_TYPE);
		scxmlScriptSourceTypeEDataType = createEDataType(SCXML_SCRIPT_SOURCE_TYPE);
		scxmlSendEventTypeEDataType = createEDataType(SCXML_SEND_EVENT_TYPE);
		scxmlTransitionCondTypeEDataType = createEDataType(SCXML_TRANSITION_COND_TYPE);
		scxmlTransitionEventTypeEDataType = createEDataType(SCXML_TRANSITION_EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scxmlOnexecuteTypeEClass, ScxmlOnexecuteType.class, "ScxmlOnexecuteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScxmlOnexecuteType_ScxmlExecutablecontent(), ecorePackage.getEFeatureMapEntry(), "scxmlExecutablecontent", null, 0, -1, ScxmlOnexecuteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlOnexecuteType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ScxmlOnexecuteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlOnexecuteType_Send(), this.getScxmlSendType(), null, "send", null, 0, -1, ScxmlOnexecuteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlOnexecuteType_Script(), this.getScxmlScriptType(), null, "script", null, 0, -1, ScxmlOnexecuteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlOnexecuteType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ScxmlOnexecuteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlParamTypeEClass, ScxmlParamType.class, "ScxmlParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScxmlParamType_ScxmlExtraContent(), ecorePackage.getEFeatureMapEntry(), "scxmlExtraContent", null, 0, -1, ScxmlParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlParamType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ScxmlParamType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlParamType_Expr(), this.getScxmlExprType(), "expr", null, 1, 1, ScxmlParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlParamType_Name(), this.getScxmlParamNameType(), "name", null, 1, 1, ScxmlParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlParamType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ScxmlParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlScriptTypeEClass, ScxmlScriptType.class, "ScxmlScriptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScxmlScriptType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ScxmlScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScriptType_ScxmlExtraContent(), ecorePackage.getEFeatureMapEntry(), "scxmlExtraContent", null, 0, -1, ScxmlScriptType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScriptType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ScxmlScriptType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScriptType_Src(), this.getScxmlScriptSourceType(), "src", null, 0, 1, ScxmlScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScriptType_Content(), ecorePackage.getEString(), "content", null, 0, 1, ScxmlScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlScxmlTypeEClass, ScxmlScxmlType.class, "ScxmlScxmlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScxmlScxmlType_State(), this.getScxmlStateType(), null, "state", null, 0, -1, ScxmlScxmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlScxmlType_Script(), this.getScxmlScriptType(), null, "script", null, 0, -1, ScxmlScxmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScxmlType_Id(), this.getScxmlIdType(), "id", null, 0, 1, ScxmlScxmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScxmlType_Initial(), this.getScxmlIdType(), "initial", null, 0, 1, ScxmlScxmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlScxmlType_Version(), theXMLTypePackage.getDecimal(), "version", null, 1, 1, ScxmlScxmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlSendTypeEClass, ScxmlSendType.class, "ScxmlSendType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScxmlSendType_Param(), this.getScxmlParamType(), null, "param", null, 0, -1, ScxmlSendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlSendType_Event(), this.getScxmlSendEventType(), "event", null, 1, 1, ScxmlSendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlStateTypeEClass, ScxmlStateType.class, "ScxmlStateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScxmlStateType_Onentry(), this.getScxmlOnexecuteType(), null, "onentry", null, 0, -1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlStateType_Onexit(), this.getScxmlOnexecuteType(), null, "onexit", null, 0, -1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlStateType_Transition(), this.getScxmlTransitionType(), null, "transition", null, 0, -1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlStateType_State(), this.getScxmlStateType(), null, "state", null, 0, -1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlStateType_Id(), this.getScxmlIdType(), "id", null, 1, 1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlStateType_Initial(), this.getScxmlIdType(), "initial", null, 0, 1, ScxmlStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scxmlTransitionTypeEClass, ScxmlTransitionType.class, "ScxmlTransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScxmlTransitionType_ScxmlExecutablecontent(), ecorePackage.getEFeatureMapEntry(), "scxmlExecutablecontent", null, 0, -1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlTransitionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ScxmlTransitionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlTransitionType_Send(), this.getScxmlSendType(), null, "send", null, 0, -1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScxmlTransitionType_Script(), this.getScxmlScriptType(), null, "script", null, 0, -1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlTransitionType_Cond(), this.getScxmlTransitionCondType(), "cond", "true", 0, 1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlTransitionType_Event(), this.getScxmlTransitionEventType(), "event", null, 0, 1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScxmlTransitionType_Target(), this.getScxmlIdType(), "target", null, 0, 1, ScxmlTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scxml(), this.getScxmlScxmlType(), null, "scxml", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(scxmlExprTypeEDataType, String.class, "ScxmlExprType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlIdTypeEDataType, String.class, "ScxmlIdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlParamNameTypeEDataType, String.class, "ScxmlParamNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlScriptSourceTypeEDataType, String.class, "ScxmlScriptSourceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlSendEventTypeEDataType, String.class, "ScxmlSendEventType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlTransitionCondTypeEDataType, String.class, "ScxmlTransitionCondType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scxmlTransitionEventTypeEDataType, String.class, "ScxmlTransitionEventType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (scxmlExprTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.expr.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (scxmlIdTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.id.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "128",
			 "minLength", "1",
			 "pattern", "[_a-zA-Z][_0-9a-zA-Z]*"
		   });	
		addAnnotation
		  (getScxmlOnexecuteType_ScxmlExecutablecontent(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ScxmlExecutablecontent:0"
		   });	
		addAnnotation
		  (getScxmlOnexecuteType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#ScxmlExecutablecontent:0"
		   });	
		addAnnotation
		  (getScxmlOnexecuteType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });	
		addAnnotation
		  (scxmlParamNameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.param.Name.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "128",
			 "minLength", "1",
			 "pattern", "[_a-zA-Z][_0-9a-zA-Z]*"
		   });	
		addAnnotation
		  (getScxmlParamType_ScxmlExtraContent(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ScxmlExtraContent:0"
		   });	
		addAnnotation
		  (getScxmlParamType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#ScxmlExtraContent:0"
		   });	
		addAnnotation
		  (getScxmlParamType_Expr(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expr"
		   });	
		addAnnotation
		  (getScxmlParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getScxmlParamType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });	
		addAnnotation
		  (scxmlScriptSourceTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.script.source.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });	
		addAnnotation
		  (scxmlScriptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scxml.script.type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getScxmlScriptType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getScxmlScriptType_ScxmlExtraContent(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ScxmlExtraContent:1"
		   });	
		addAnnotation
		  (getScxmlScriptType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#ScxmlExtraContent:1"
		   });	
		addAnnotation
		  (getScxmlScriptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });	
		addAnnotation
		  (getScxmlScxmlType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlScxmlType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlScxmlType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getScxmlScxmlType_Initial(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initial"
		   });	
		addAnnotation
		  (getScxmlScxmlType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (scxmlSendEventTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.send.event.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "(\\i|\\d)+(\\.(\\i|\\d)+)*"
		   });	
		addAnnotation
		  (getScxmlSendType_Event(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "event"
		   });	
		addAnnotation
		  (getScxmlStateType_Onentry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onentry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlStateType_Onexit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onexit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlStateType_Transition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlStateType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScxmlStateType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getScxmlStateType_Initial(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initial"
		   });	
		addAnnotation
		  (scxmlTransitionCondTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.transition.cond.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (scxmlTransitionEventTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "scxml.transition.event.type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\.?\\*|(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?(\\s(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?)*"
		   });	
		addAnnotation
		  (getScxmlTransitionType_ScxmlExecutablecontent(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ScxmlExecutablecontent:0"
		   });	
		addAnnotation
		  (getScxmlTransitionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#ScxmlExecutablecontent:0"
		   });	
		addAnnotation
		  (getScxmlTransitionType_Cond(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cond"
		   });	
		addAnnotation
		  (getScxmlTransitionType_Event(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "event"
		   });	
		addAnnotation
		  (getScxmlTransitionType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });
	}

} //ScxmlPackageImpl
