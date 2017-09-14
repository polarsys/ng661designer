/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.convert.builders;

import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPropertyKind;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import org.polarsys.ng661designer.convert.Activator;

/**
 * Builder for GenModel.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class GenModelBuilder {

	/**
	 * Constants.
	 */
	public static final String NG661_PART2 = "NG661Part2";
	public static final String GENMODEL_NAME = NG661_PART2 + ".genmodel";
	public static final String GEN_SUFFIX = "-gen";

	/**
	 * Build GenModel from ecore resource.
	 * 
	 * @param resource
	 *            Resource
	 * @return genModel
	 * @throws Exception
	 */
	public GenModel buildGenModel(Resource resource) {
		// generate genmodel from ecore resource: use EcoreImporter.
		GenModel genModel = generateGenModel(resource);
		// update genPacjkage information
		manageGenPackage(genModel);
		// update genFeature information
		manageGenFeature(genModel);
		return genModel;
	}

	/**
	 * Update package and document root information
	 * 
	 * @param genModel
	 *            {@link GenModel}
	 */
	protected void manageGenPackage(GenModel genModel) {
		for (GenPackage genPackage : genModel.getGenPackages()) {
			setBasePackage(genPackage);
			updateDocumentRoot(genPackage);
			if (!NG661Builder.NG_661_URI.equals(genPackage.getNSURI())) {
				genPackage.setGenerateModelWizard(false);
			}
		}
	}

	/**
	 * Update DocumentRoot: for new composition reference (ex feature map
	 * entries), set children creation to true.
	 * 
	 * @param genPackage
	 *            {@link GenPackage}
	 */
	protected void updateDocumentRoot(GenPackage genPackage) {
		// get document root eclass
		Iterable<GenClass> documentRoots = Iterables.filter(genPackage.getGenClasses(), new Predicate<GenClass>() {
			@Override
			public boolean apply(GenClass arg0) {
				return BuilderUtil.DOCUMENT_ROOT.equals(arg0.getName());
			}
		});
		GenClass documentRoot = Iterables.getFirst(documentRoots, null);
		// update features.
		if (documentRoot != null) {
			for (GenFeature genFeature : documentRoot.getAllGenFeatures()) {
				if (genFeature.getEcoreFeature() instanceof EReference && ((EReference) genFeature.getEcoreFeature()).isContainment() && !genFeature.getEcoreFeature().isTransient()) {
					genFeature.setChildren(true);
					genFeature.setCreateChild(true);
					genFeature.setNotify(true);
				}
			}
		}
	}

	/**
	 * Put some references in read only: Scxml.script and Send.param.
	 * 
	 * @param genModel
	 *            {@link GenModel}
	 */
	protected void manageGenFeature(GenModel genModel) {
		for (GenFeature genFeature : genModel.getAllGenFeatures()) {
			if (genFeature.getEcoreFeature() instanceof EReference && genFeature.getEcoreFeature().isTransient() && genFeature.getEcoreFeature().isDerived() && !((EReference) genFeature.getEcoreFeature()).isContainment()) {
				genFeature.setProperty(GenPropertyKind.NONE_LITERAL);
			}
			if (("script".equals(genFeature.getName()) && "ScxmlScxmlType".equals(genFeature.getGenClass().getName()) || "param".equals(genFeature.getName()) && "ScxmlSendType".equals(genFeature.getGenClass().getName()))) {
				genFeature.setProperty(GenPropertyKind.READONLY_LITERAL);
			}
		}
	}

	/**
	 * Convert Ecore resource into genModel.
	 * 
	 * @param resource
	 *            {@link Resource}
	 * @return genModel
	 * @throws Exception
	 */
	protected GenModel generateGenModel(Resource resource) {
		try {
			BasicMonitor emfMonitor = new BasicMonitor();
			IFile ecoreFile = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(true));
			ModelImporter importer = initializeConverter(GENMODEL_NAME, ecoreFile, emfMonitor);
			initializeGenModel(importer, emfMonitor);
			return importer.getGenModel();
		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error during GenModel creation.", e));
		}
		return null;
	}

	/**
	 * Calculate base package, code from XSDEcoreBuilder
	 * 
	 * @param genPackage
	 *            {@link GenPackage}
	 */
	protected void setBasePackage(GenPackage genPackage) {
		EPackage ePackage = genPackage.getEcorePackage();
		XSDEcoreBuilder builder = new XSDEcoreBuilder();
		String name = builder.qualifiedPackageName(ePackage.getNsURI());
		if (name == null) {
			name = "null";
		}
		int index = name.lastIndexOf(".");
		if (index != -1) {
			String basePackage = "";
			String namePackage = name.substring(0, index);
			name = name.substring(index + 1);

			if (basePackage != null && !namePackage.startsWith(basePackage)) {
				namePackage = basePackage + "." + namePackage;
			}

			StringBuffer basePackageName = new StringBuffer();
			for (StringTokenizer stringTokenizer = new StringTokenizer(namePackage, "."); stringTokenizer.hasMoreTokens();) {
				String packageName = stringTokenizer.nextToken();
				basePackageName.append(CodeGenUtil.safeName(packageName));
				if (stringTokenizer.hasMoreTokens()) {
					basePackageName.append('.');
				}
			}

			genPackage.setBasePackage(basePackageName.toString());
		}
	}

	/**
	 * Initialize Ecore Importer
	 * 
	 * @param genmodelFileName
	 * @param ecoreFile
	 * @param monitor
	 * @return EcoreImpoter
	 * @throws Exception
	 */
	protected ModelImporter initializeConverter(String genmodelFileName, IFile ecoreFile, Monitor monitor) throws Exception {
		ModelImporter converter = new org.eclipse.emf.importer.ecore.EcoreImporter();
		converter.setGenModelContainerPath(ecoreFile.getParent().getFullPath());
		converter.setGenModelFileName(genmodelFileName);
		converter.setModelFile(ecoreFile);
		converter.computeEPackages(monitor);
		for (EPackage ePackage : converter.getEPackages()) {
			converter.getEPackageImportInfo(ePackage).setConvert(true);
		}
		converter.adjustEPackages(monitor);
		return converter;
	}

	/**
	 * Initialize genModel
	 * 
	 * @param importer
	 *            EcoreImporter
	 * @param monitor
	 * @throws Exception
	 */
	protected void initializeGenModel(ModelImporter importer, Monitor monitor) throws Exception {
		importer.prepareGenModelAndEPackages(monitor);
		configureGenModel(importer.getGenModel());
		importer.saveGenModelAndEPackages(monitor);
	}

	/**
	 * Configure genModel
	 * 
	 * @param genModel
	 *            {@link GenModel}
	 */
	protected void configureGenModel(GenModel genModel) {
		genModel.setModelDirectory(genModel.getModelDirectory() + GEN_SUFFIX);
		genModel.setEditDirectory(genModel.getEditDirectory() + GEN_SUFFIX);
		genModel.setEditorDirectory(genModel.getEditorDirectory() + GEN_SUFFIX);
		genModel.setTestsDirectory(genModel.getTestsDirectory() + GEN_SUFFIX);
		genModel.setCreationIcons(false);
		genModel.setModelName(NG661_PART2);
	}

}
