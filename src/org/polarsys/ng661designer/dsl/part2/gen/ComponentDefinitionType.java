/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.ComponentDefinitionType#getImport <em>Import</em>}</li>
 *   <li>{@link org.example.ng661.part2.ComponentDefinitionType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.example.ng661.part2.ComponentDefinitionType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.example.ng661.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.example.ng661.part2.ComponentDefinitionType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType()
 * @model
 * @generated
 */
public interface ComponentDefinitionType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.ng661.part2.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType_Import()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Import' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(InterfaceType)
	 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceType getInterface();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ComponentDefinitionType#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(RepresentationType)
	 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Representation' namespace='##targetNamespace'"
	 * @generated
	 */
	RepresentationType getRepresentation();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ComponentDefinitionType#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(RepresentationType value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(BehaviorType)
	 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType_Behavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	BehaviorType getBehavior();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(BehaviorType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.example.ng661.part2.Part2Package#getComponentDefinitionType_Name()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.ComponentDefinitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentDefinitionType
