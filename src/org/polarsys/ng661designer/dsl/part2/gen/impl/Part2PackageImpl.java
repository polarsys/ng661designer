/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

import org.polarsys.ng661designer.dsl.part2.gen.util.Part2Validator;

import org.w3._2005._07.scxml.ScxmlPackage;

import org.w3._2005._07.scxml.impl.ScxmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Part2PackageImpl extends EPackageImpl implements Part2Package {
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
	protected String packageFilename = "part2.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circlePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crownComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customIntegerTypeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRealTypeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customStringTypeElementTypeEClass = null;

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
	private EClass ellipsePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestureAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyboardInputPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarLineComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylinePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollWheelAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipRepresentationTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignementTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectRatioTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillRuleTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignementTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignementTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aspectRatioTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aspectRatioTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorReferenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBHEXTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBRgb255TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBRgbPercentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distanceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatStringTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatStringTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stippleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeDefaultmillisecondsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeHoursTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeMinutesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeSecondsOrSubsecondsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType velocityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType velocityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zIndexTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zIndexTypeValEDataType = null;

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
	 * @see org.example.ng661.part2.Part2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Part2PackageImpl() {
		super(eNS_URI, Part2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Part2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Part2Package init() {
		if (isInited) return (Part2Package)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI);

		// Obtain or create and register package
		Part2PackageImpl thePart2Package = (Part2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Part2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Part2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ScxmlPackageImpl theScxmlPackage = (ScxmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI) instanceof ScxmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI) : ScxmlPackage.eINSTANCE);

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
			(thePart2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Part2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePart2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Part2Package.eNS_URI, thePart2Package);
		return thePart2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcComponent() {
		if (arcComponentEClass == null) {
			arcComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(6);
		}
		return arcComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Angle() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_ClipPath() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_ClipRule() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_DrawingPriority() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Fill() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_FillOpacity() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_FillRule() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Id() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_InboundAngle() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Radius() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Stroke() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeDasharray() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeDashoffset() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeLinecap() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeLinejoin() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeMiterlimit() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeOpacity() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Strokewidth() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Transform() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Visibility() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_X() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Y() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorType() {
		if (behaviorTypeEClass == null) {
			behaviorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(10);
		}
		return behaviorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorType_BehaviorGroup() {
        return (EAttribute)getBehaviorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Scxml() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Clock() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Function() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorType_Any() {
        return (EAttribute)getBehaviorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPrimitive() {
		if (childPrimitiveEClass == null) {
			childPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(14);
		}
		return childPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_DrawingPriority() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Id() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_MaxNumberOfChildren() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Priority() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Transform() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Visibility() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCirclePrimitive() {
		if (circlePrimitiveEClass == null) {
			circlePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(15);
		}
		return circlePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_ChildElements() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Group() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Children() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Rectangle() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Circle() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Ellipse() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Line() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Polyline() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Polygon() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Path() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Image() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Text() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Arc() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Crown() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_PolarLine() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_PointerArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_TouchArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_GestureArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_ScrollWheelArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_KeyboardInput() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Compositions() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_ClipPath() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_ClipRule() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Cx() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Cy() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_DrawingPriority() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Fill() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_FillOpacity() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_FillRule() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Id() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_R() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Stroke() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeDasharray() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeDashoffset() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeLinecap() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeLinejoin() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeMiterlimit() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeOpacity() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Strokewidth() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Transform() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Visibility() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPathPrimitive() {
		if (clipPathPrimitiveEClass == null) {
			clipPathPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(16);
		}
		return clipPathPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Group() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Rectangle() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Circle() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Ellipse() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Line() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Path() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockType() {
		if (clockTypeEClass == null) {
			clockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(17);
		}
		return clockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockType_Id() {
        return (EAttribute)getClockType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDefinitionType() {
		if (componentDefinitionTypeEClass == null) {
			componentDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(25);
		}
		return componentDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Import() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Interface() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Representation() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Behavior() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionType_Name() {
        return (EAttribute)getComponentDefinitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrownComponent() {
		if (crownComponentEClass == null) {
			crownComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(26);
		}
		return crownComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_ClipPath() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_ClipRule() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_DrawingPriority() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Fill() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_FillOpacity() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_FillRule() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Id() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_InnerRadius() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_OuterRadius() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Stroke() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeDasharray() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeDashoffset() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeLinecap() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeLinejoin() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeMiterlimit() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeOpacity() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Strokewidth() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Transform() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Visibility() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_X() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Y() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomIntegerTypeElementType() {
		if (customIntegerTypeElementTypeEClass == null) {
			customIntegerTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(27);
		}
		return customIntegerTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Any() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Max() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Min() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Name() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Resolution() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Unit() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomRealTypeElementType() {
		if (customRealTypeElementTypeEClass == null) {
			customRealTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(28);
		}
		return customRealTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Any() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Max() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Min() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Name() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Resolution() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Unit() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomStringTypeElementType() {
		if (customStringTypeElementTypeEClass == null) {
			customStringTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(29);
		}
		return customStringTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Any() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_MaxLength() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_MinLength() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Name() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Regex() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(33);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsePrimitive() {
		if (ellipsePrimitiveEClass == null) {
			ellipsePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(34);
		}
		return ellipsePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_ChildElements() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Group() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Children() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Rectangle() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Circle() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Ellipse() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Line() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Polyline() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Polygon() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Path() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Image() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Text() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Arc() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Crown() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_PolarLine() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_PointerArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_TouchArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_GestureArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_ScrollWheelArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_KeyboardInput() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Compositions() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_ClipPath() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_ClipRule() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Cx() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Cy() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_DrawingPriority() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Fill() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_FillOpacity() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_FillRule() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Id() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Rx() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Ry() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Stroke() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeDasharray() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeDashoffset() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeLinecap() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeLinejoin() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeMiterlimit() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeOpacity() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Strokewidth() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Transform() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Visibility() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		if (eventTypeEClass == null) {
			eventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(35);
		}
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		if (functionTypeEClass == null) {
			functionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(46);
		}
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Param() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Script() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Name() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGestureAreaPrimitive() {
		if (gestureAreaPrimitiveEClass == null) {
			gestureAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(47);
		}
		return gestureAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_AcceptedGesture() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_ClipPath() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_ClipRule() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Enabled() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Height() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Id() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Transform() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Width() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_X() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Y() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupPrimitive() {
		if (groupPrimitiveEClass == null) {
			groupPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(48);
		}
		return groupPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_ChildElements() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Group() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Children() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Rectangle() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Circle() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Ellipse() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Line() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Polyline() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Polygon() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Path() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Image() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Text() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Arc() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Crown() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_PolarLine() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_PointerArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_TouchArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_GestureArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_ScrollWheelArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_KeyboardInput() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Compositions() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_DrawingPriority() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Id() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Transform() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Visibility() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagePrimitive() {
		if (imagePrimitiveEClass == null) {
			imagePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(49);
		}
		return imagePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_ChildElements() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Group() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Children() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Rectangle() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Circle() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Ellipse() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Line() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Polyline() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Polygon() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Path() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Image() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Text() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Arc() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Crown() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_PolarLine() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_PointerArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_TouchArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_GestureArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_ScrollWheelArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_KeyboardInput() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Compositions() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Alignment() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_AspectRatio() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_ClipPath() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_ClipRule() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_DrawingPriority() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Height() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Id() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Source() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Transform() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Visibility() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Width() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_X() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Y() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportType() {
		if (importTypeEClass == null) {
			importTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(51);
		}
		return importTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportType_File() {
        return (EAttribute)getImportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceType() {
		if (interfaceTypeEClass == null) {
			interfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(53);
		}
		return interfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Property() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Event() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyboardInputPrimitive() {
		if (keyboardInputPrimitiveEClass == null) {
			keyboardInputPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(54);
		}
		return keyboardInputPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Enabled() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Id() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinePrimitive() {
		if (linePrimitiveEClass == null) {
			linePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(55);
		}
		return linePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_DrawingPriority() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Id() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Stroke() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeDasharray() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeDashoffset() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeLinecap() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeLinejoin() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeMiterlimit() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeOpacity() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Strokewidth() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Transform() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Visibility() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_X1() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_X2() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Y1() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Y2() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		if (paramTypeEClass == null) {
			paramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(64);
		}
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Modality() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Type() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPrimitive() {
		if (pathPrimitiveEClass == null) {
			pathPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(65);
		}
		return pathPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_ClipPath() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_ClipRule() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_D() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_DrawingPriority() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Fill() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_FillOpacity() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_FillRule() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Id() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Stroke() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeDasharray() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeDashoffset() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeLinecap() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeLinejoin() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeMiterlimit() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeOpacity() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Strokewidth() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Transform() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Visibility() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerAreaPrimitive() {
		if (pointerAreaPrimitiveEClass == null) {
			pointerAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(66);
		}
		return pointerAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_AcceptedButtons() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_ClipPath() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_ClipRule() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Enabled() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Height() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Id() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_PassThrough() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_PreventStealing() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Transform() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Width() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_X() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Y() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarLineComponent() {
		if (polarLineComponentEClass == null) {
			polarLineComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(67);
		}
		return polarLineComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Angle() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_ClipPath() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_ClipRule() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_DrawingPriority() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Id() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_R() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Stroke() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeDasharray() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeDashoffset() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeLinecap() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeLinejoin() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeMiterlimit() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeOpacity() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Strokewidth() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Transform() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Visibility() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_X1() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Y1() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonPrimitive() {
		if (polygonPrimitiveEClass == null) {
			polygonPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(68);
		}
		return polygonPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_DrawingPriority() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Fill() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_FillOpacity() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_FillRule() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Id() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Points() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Stroke() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeDasharray() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeDashoffset() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeLinecap() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeLinejoin() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeMiterlimit() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeOpacity() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Strokewidth() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Transform() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Visibility() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolylinePrimitive() {
		if (polylinePrimitiveEClass == null) {
			polylinePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(69);
		}
		return polylinePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_DrawingPriority() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Id() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Points() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Stroke() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeDasharray() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeDashoffset() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeLinecap() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeLinejoin() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeMiterlimit() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeOpacity() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Strokewidth() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Transform() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Visibility() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(71);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_MaxStringLength() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Modality() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Type() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectPrimitive() {
		if (rectPrimitiveEClass == null) {
			rectPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(73);
		}
		return rectPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_ChildElements() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Group() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Children() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Rectangle() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Circle() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Ellipse() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Line() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Polyline() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Polygon() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Path() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Image() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Text() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Arc() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Crown() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_PolarLine() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_PointerArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_TouchArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_GestureArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_ScrollWheelArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_KeyboardInput() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Compositions() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_ClipPath() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_ClipRule() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_DrawingPriority() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Fill() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_FillOpacity() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_FillRule() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Height() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Id() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Rx() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Ry() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Stroke() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeDasharray() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeDashoffset() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeLinecap() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeLinejoin() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeMiterlimit() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeOpacity() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Strokewidth() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Transform() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Visibility() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Width() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_X() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Y() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationType() {
		if (representationTypeEClass == null) {
			representationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(74);
		}
		return representationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Group() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Group1() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Children() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Rectangle() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Circle() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Ellipse() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Line() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Polyline() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Polygon() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Path() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Image() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Text() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Arc() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Crown() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_PolarLine() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_PointerArea() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_TouchArea() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_GestureArea() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_ScrollWheelArea() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_KeyboardInput() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_ClipPath() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationType_Compositions() {
        return (EReference)getRepresentationType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollWheelAreaPrimitive() {
		if (scrollWheelAreaPrimitiveEClass == null) {
			scrollWheelAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(75);
		}
		return scrollWheelAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_ClipPath() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_ClipRule() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Enabled() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Height() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Id() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Transform() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Width() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_X() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelAreaPrimitive_Y() {
        return (EAttribute)getScrollWheelAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPrimitive() {
		if (textPrimitiveEClass == null) {
			textPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(78);
		}
		return textPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_DrawingPriority() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Fill() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FillOpacity() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FillRule() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontFamily() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontSize() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontStretch() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontStyle() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontVariant() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_FontWeight() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Id() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Stroke() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeDasharray() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeDashoffset() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeLinecap() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeLinejoin() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeMiterlimit() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_StrokeOpacity() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Strokewidth() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Transform() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Value() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Visibility() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_X() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPrimitive_Y() {
        return (EAttribute)getTextPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchAreaPrimitive() {
		if (touchAreaPrimitiveEClass == null) {
			touchAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(84);
		}
		return touchAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_ClipPath() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_ClipRule() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Enabled() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Height() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Id() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_MaximumTouchPoints() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_MinimumTouchPoints() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Transform() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Width() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_X() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Y() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationTypes() {
		if (representationTypesEClass == null) {
			representationTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(93);
		}
		return representationTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipRepresentationTypes() {
		if (clipRepresentationTypesEClass == null) {
			clipRepresentationTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(94);
		}
		return clipRepresentationTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		if (propertyValueEClass == null) {
			propertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(95);
		}
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Value() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValue_Property() {
        return (EReference)getPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetComposition() {
		if (widgetCompositionEClass == null) {
			widgetCompositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(96);
		}
		return widgetCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Representation() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Values() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_ChildElements() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Group() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Children() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Rectangle() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Circle() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Ellipse() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Line() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Polyline() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Polygon() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Path() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Image() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Text() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Arc() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Crown() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_PolarLine() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_PointerArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_TouchArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_GestureArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_ScrollWheelArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_KeyboardInput() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignementTypeVal() {
		if (alignementTypeValEEnum == null) {
			alignementTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(1);
		}
		return alignementTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspectRatioTypeVal() {
		if (aspectRatioTypeValEEnum == null) {
			aspectRatioTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(8);
		}
		return aspectRatioTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanTypeVal() {
		if (booleanTypeValEEnum == null) {
			booleanTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(12);
		}
		return booleanTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorReferenceType() {
		if (colorReferenceTypeEEnum == null) {
			colorReferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(18);
		}
		return colorReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillRuleTypeVal() {
		if (fillRuleTypeValEEnum == null) {
			fillRuleTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(38);
		}
		return fillRuleTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityType() {
		if (modalityTypeEEnum == null) {
			modalityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(56);
		}
		return modalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityType1() {
		if (modalityType1EEnum == null) {
			modalityType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(57);
		}
		return modalityType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityTypeVal() {
		if (visibilityTypeValEEnum == null) {
			visibilityTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(89);
		}
		return visibilityTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignementType() {
		if (alignementTypeEDataType == null) {
			alignementTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(0);
		}
		return alignementTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignementTypeValObject() {
		if (alignementTypeValObjectEDataType == null) {
			alignementTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(2);
		}
		return alignementTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleType() {
		if (angleTypeEDataType == null) {
			angleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(3);
		}
		return angleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleTypeVal() {
		if (angleTypeValEDataType == null) {
			angleTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(4);
		}
		return angleTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleTypeValObject() {
		if (angleTypeValObjectEDataType == null) {
			angleTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(5);
		}
		return angleTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAspectRatioType() {
		if (aspectRatioTypeEDataType == null) {
			aspectRatioTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(7);
		}
		return aspectRatioTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAspectRatioTypeValObject() {
		if (aspectRatioTypeValObjectEDataType == null) {
			aspectRatioTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(9);
		}
		return aspectRatioTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanType() {
		if (booleanTypeEDataType == null) {
			booleanTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(11);
		}
		return booleanTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanTypeValObject() {
		if (booleanTypeValObjectEDataType == null) {
			booleanTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(13);
		}
		return booleanTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorReferenceTypeObject() {
		if (colorReferenceTypeObjectEDataType == null) {
			colorReferenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(19);
		}
		return colorReferenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBHEXType() {
		if (colorRGBHEXTypeEDataType == null) {
			colorRGBHEXTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(20);
		}
		return colorRGBHEXTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBRgb255Type() {
		if (colorRGBRgb255TypeEDataType == null) {
			colorRGBRgb255TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(21);
		}
		return colorRGBRgb255TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBRgbPercentType() {
		if (colorRGBRgbPercentTypeEDataType == null) {
			colorRGBRgbPercentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(22);
		}
		return colorRGBRgbPercentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBType() {
		if (colorRGBTypeEDataType == null) {
			colorRGBTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(23);
		}
		return colorRGBTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorType() {
		if (colorTypeEDataType == null) {
			colorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(24);
		}
		return colorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimeType() {
		if (dateTimeTypeEDataType == null) {
			dateTimeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(30);
		}
		return dateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateType() {
		if (dateTypeEDataType == null) {
			dateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(31);
		}
		return dateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistanceType() {
		if (distanceTypeEDataType == null) {
			distanceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(32);
		}
		return distanceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpression() {
		if (expressionEDataType == null) {
			expressionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(36);
		}
		return expressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleType() {
		if (fillRuleTypeEDataType == null) {
			fillRuleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(37);
		}
		return fillRuleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleTypeValObject() {
		if (fillRuleTypeValObjectEDataType == null) {
			fillRuleTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(39);
		}
		return fillRuleTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontType() {
		if (fontTypeEDataType == null) {
			fontTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(40);
		}
		return fontTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatStringType() {
		if (formatStringTypeEDataType == null) {
			formatStringTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(41);
		}
		return formatStringTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatStringTypeVal() {
		if (formatStringTypeValEDataType == null) {
			formatStringTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(42);
		}
		return formatStringTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyType() {
		if (frequencyTypeEDataType == null) {
			frequencyTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(43);
		}
		return frequencyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyTypeVal() {
		if (frequencyTypeValEDataType == null) {
			frequencyTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(44);
		}
		return frequencyTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyTypeValObject() {
		if (frequencyTypeValObjectEDataType == null) {
			frequencyTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(45);
		}
		return frequencyTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageType() {
		if (imageTypeEDataType == null) {
			imageTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(50);
		}
		return imageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerType() {
		if (integerTypeEDataType == null) {
			integerTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(52);
		}
		return integerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityTypeObject() {
		if (modalityTypeObjectEDataType == null) {
			modalityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(58);
		}
		return modalityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityTypeObject1() {
		if (modalityTypeObject1EDataType == null) {
			modalityTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(59);
		}
		return modalityTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(60);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityType() {
		if (opacityTypeEDataType == null) {
			opacityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(61);
		}
		return opacityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityTypeVal() {
		if (opacityTypeValEDataType == null) {
			opacityTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(62);
		}
		return opacityTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityTypeValObject() {
		if (opacityTypeValObjectEDataType == null) {
			opacityTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(63);
		}
		return opacityTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionType() {
		if (positionTypeEDataType == null) {
			positionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(70);
		}
		return positionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRealType() {
		if (realTypeEDataType == null) {
			realTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(72);
		}
		return realTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStippleType() {
		if (stippleTypeEDataType == null) {
			stippleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(76);
		}
		return stippleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringType() {
		if (stringTypeEDataType == null) {
			stringTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(77);
		}
		return stringTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeDefaultmillisecondsType() {
		if (timeDefaultmillisecondsTypeEDataType == null) {
			timeDefaultmillisecondsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(79);
		}
		return timeDefaultmillisecondsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeHoursType() {
		if (timeHoursTypeEDataType == null) {
			timeHoursTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(80);
		}
		return timeHoursTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeMinutesType() {
		if (timeMinutesTypeEDataType == null) {
			timeMinutesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(81);
		}
		return timeMinutesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeSecondsOrSubsecondsType() {
		if (timeSecondsOrSubsecondsTypeEDataType == null) {
			timeSecondsOrSubsecondsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(82);
		}
		return timeSecondsOrSubsecondsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeType() {
		if (timeTypeEDataType == null) {
			timeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(83);
		}
		return timeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeType() {
		if (typeTypeEDataType == null) {
			typeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(85);
		}
		return typeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVelocityType() {
		if (velocityTypeEDataType == null) {
			velocityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(86);
		}
		return velocityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVelocityTypeObject() {
		if (velocityTypeObjectEDataType == null) {
			velocityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(87);
		}
		return velocityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityType() {
		if (visibilityTypeEDataType == null) {
			visibilityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(88);
		}
		return visibilityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityTypeValObject() {
		if (visibilityTypeValObjectEDataType == null) {
			visibilityTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(90);
		}
		return visibilityTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZIndexType() {
		if (zIndexTypeEDataType == null) {
			zIndexTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(91);
		}
		return zIndexTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZIndexTypeVal() {
		if (zIndexTypeValEDataType == null) {
			zIndexTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(92);
		}
		return zIndexTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Factory getPart2Factory() {
		return (Part2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.example.ng661.part2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Part2PackageImpl
