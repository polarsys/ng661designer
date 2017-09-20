/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.w3._2005._07.scxml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3._2005._07.scxml.ScxmlPackage
 * @generated
 */
public class ScxmlValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScxmlValidator INSTANCE = new ScxmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3._2005._07.scxml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ScxmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE:
				return validateScxmlOnexecuteType((ScxmlOnexecuteType)value, diagnostics, context);
			case ScxmlPackage.SCXML_PARAM_TYPE:
				return validateScxmlParamType((ScxmlParamType)value, diagnostics, context);
			case ScxmlPackage.SCXML_SCRIPT_TYPE:
				return validateScxmlScriptType((ScxmlScriptType)value, diagnostics, context);
			case ScxmlPackage.SCXML_SCXML_TYPE:
				return validateScxmlScxmlType((ScxmlScxmlType)value, diagnostics, context);
			case ScxmlPackage.SCXML_SEND_TYPE:
				return validateScxmlSendType((ScxmlSendType)value, diagnostics, context);
			case ScxmlPackage.SCXML_STATE_TYPE:
				return validateScxmlStateType((ScxmlStateType)value, diagnostics, context);
			case ScxmlPackage.SCXML_TRANSITION_TYPE:
				return validateScxmlTransitionType((ScxmlTransitionType)value, diagnostics, context);
			case ScxmlPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ScxmlPackage.SCXML_EXPR_TYPE:
				return validateScxmlExprType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_ID_TYPE:
				return validateScxmlIdType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_PARAM_NAME_TYPE:
				return validateScxmlParamNameType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_SCRIPT_SOURCE_TYPE:
				return validateScxmlScriptSourceType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_SEND_EVENT_TYPE:
				return validateScxmlSendEventType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_TRANSITION_COND_TYPE:
				return validateScxmlTransitionCondType((String)value, diagnostics, context);
			case ScxmlPackage.SCXML_TRANSITION_EVENT_TYPE:
				return validateScxmlTransitionEventType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlOnexecuteType(ScxmlOnexecuteType scxmlOnexecuteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlOnexecuteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlExprType(String scxmlExprType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlIdType(String scxmlIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScxmlIdType_Pattern(scxmlIdType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScxmlIdType_MinLength(scxmlIdType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScxmlIdType_MaxLength(scxmlIdType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScxmlIdType_Pattern
	 */
	public static final  PatternMatcher [][] SCXML_ID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[_a-zA-Z][_0-9a-zA-Z]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlIdType_Pattern(String scxmlIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlIdType, SCXML_ID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlIdType_MinLength(String scxmlIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = scxmlIdType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlIdType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlIdType_MaxLength(String scxmlIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = scxmlIdType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ScxmlPackage.Literals.SCXML_ID_TYPE, scxmlIdType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlParamNameType(String scxmlParamNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScxmlParamNameType_Pattern(scxmlParamNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScxmlParamNameType_MinLength(scxmlParamNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScxmlParamNameType_MaxLength(scxmlParamNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScxmlParamNameType_Pattern
	 */
	public static final  PatternMatcher [][] SCXML_PARAM_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[_a-zA-Z][_0-9a-zA-Z]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Param Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlParamNameType_Pattern(String scxmlParamNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, scxmlParamNameType, SCXML_PARAM_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Param Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlParamNameType_MinLength(String scxmlParamNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = scxmlParamNameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, scxmlParamNameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Param Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlParamNameType_MaxLength(String scxmlParamNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = scxmlParamNameType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ScxmlPackage.Literals.SCXML_PARAM_NAME_TYPE, scxmlParamNameType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlScriptSourceType(String scxmlScriptSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlSendEventType(String scxmlSendEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScxmlSendEventType_Pattern(scxmlSendEventType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScxmlSendEventType_Pattern
	 */
	public static final  PatternMatcher [][] SCXML_SEND_EVENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\i|\\d)+(\\.(\\i|\\d)+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Send Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlSendEventType_Pattern(String scxmlSendEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ScxmlPackage.Literals.SCXML_SEND_EVENT_TYPE, scxmlSendEventType, SCXML_SEND_EVENT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlTransitionCondType(String scxmlTransitionCondType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlTransitionEventType(String scxmlTransitionEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScxmlTransitionEventType_Pattern(scxmlTransitionEventType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScxmlTransitionEventType_Pattern
	 */
	public static final  PatternMatcher [][] SCXML_TRANSITION_EVENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\.?\\*|(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?(\\s(\\i|\\d)+(\\.(\\i|\\d)+)*(\\.\\*)?)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Transition Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlTransitionEventType_Pattern(String scxmlTransitionEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ScxmlPackage.Literals.SCXML_TRANSITION_EVENT_TYPE, scxmlTransitionEventType, SCXML_TRANSITION_EVENT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlParamType(ScxmlParamType scxmlParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlScriptType(ScxmlScriptType scxmlScriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlScriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlScxmlType(ScxmlScxmlType scxmlScxmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlScxmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlSendType(ScxmlSendType scxmlSendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlSendType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlStateType(ScxmlStateType scxmlStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScxmlTransitionType(ScxmlTransitionType scxmlTransitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scxmlTransitionType, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ScxmlValidator
