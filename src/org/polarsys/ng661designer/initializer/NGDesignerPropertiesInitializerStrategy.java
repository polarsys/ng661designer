/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.initializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.eef.EEFGen.EEFGenFactory;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.codegen.core.initializer.ComponentTransformer;
import org.eclipse.emf.eef.codegen.core.initializer.PropertiesInitializer;
import org.eclipse.emf.eef.codegen.core.initializer.ViewTransformer;
import org.eclipse.emf.eef.codegen.core.util.EMFHelper;
import org.eclipse.emf.eef.codegen.flow.util.GenmodelHelper;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NGDesignerPropertiesInitializerStrategy extends PropertiesInitializer {

	private static final String SWT_TOOLKIT_NAME = "SWT";
	private static final String EMF_PROPERTIES_TOOLKIT_NAME = "EMFProperties";

	/**
	 * 
	 */
	public NGDesignerPropertiesInitializerStrategy() {
		super();
	}

	@Override
	public void initialize(URI modelURI, IContainer targetFolder) throws IOException, CoreException {
		ResourceSet resourceSet = new ResourceSetImpl();
		registerResourceFactories(resourceSet);
		registerPackages(resourceSet);
		EObject model = EMFHelper.load(modelURI, resourceSet);

		if (!targetFolder.exists()) {
			if (targetFolder instanceof IFolder)
				((IFolder) targetFolder).create(true, true, new NullProgressMonitor());
			else
				return;
		}

		Map<String, EObject> toolkits = new HashMap<String, EObject>();
		View instanceView = ViewsFactory.eINSTANCE.createView();
		toolkits.put(SWT_TOOLKIT_NAME, EMFHelper.load(URI.createURI(getSWTPathmap(instanceView), false), model.eResource().getResourceSet()));
		toolkits.put(EMF_PROPERTIES_TOOLKIT_NAME, EMFHelper.load(URI.createURI(getEMFPropertiesPathmap(instanceView), false), model.eResource().getResourceSet()));

		ViewTransformer viewTransformer = new NGDesignerViewTransformer(toolkits);
		TreeIterator<EObject> allContents = model.eAllContents();
		Map<ViewsRepository, String> repositories = new HashMap<ViewsRepository, String>();
		List<PropertiesEditionContext> contexts = new ArrayList<PropertiesEditionContext>();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof GenPackage) {
				GenPackage genPack = (GenPackage) next;
				if (genPack.getGenClassifiers().size() >= 1) {
					ViewsRepository repository = viewTransformer.genPackage2ViewsRepository(genPack, SWT_TOOLKIT_NAME);
					String completePackage = genPack.getBasePackage();
					if (completePackage != null && completePackage.length() > 0) {
						completePackage += "." + ecoreStringHierarchy(genPack);
					} else {
						completePackage = ecoreStringHierarchy(genPack);
					}
					repositories.put(repository, completePackage);
					ComponentTransformer componentTransformer = new NGDesignerComponentTransformer(viewTransformer.getWorkingResolvTemp());
					PropertiesEditionContext context = componentTransformer.genPackage2Context(genPack);
					contexts.add(context);
				}
			}
		}
		URI componentsModelUri = GenmodelHelper.computePropertiesComponentsModelURI(targetFolder, model.eResource().getURI());
		Resource componentsResource = model.eResource().getResourceSet().createResource(componentsModelUri);
		for (PropertiesEditionContext context : contexts)
			componentsResource.getContents().add(context);
		for (ViewsRepository repository : repositories.keySet())
			componentsResource.getContents().add(repository);
		componentsResource.save(Collections.EMPTY_MAP);
		EEFGenModel eefGenModel = createEEFGenModel(repositories, contexts, targetFolder);
		URI eefgenModelUri = GenmodelHelper.computePropertiesEEFGenModelURI(targetFolder, model.eResource().getURI());
		Resource eefgenResource = model.eResource().getResourceSet().createResource(eefgenModelUri);
		eefgenResource.getContents().add(eefGenModel);
		eefgenResource.save(Collections.EMPTY_MAP);
		return;

	}

	/***
	 *
	 * Copy from EEF
	 */
	private EEFGenModel createEEFGenModel(Map<ViewsRepository, String> repositories, List<PropertiesEditionContext> contexts, IContainer targetFolder) {
		EEFGenModel eefGenModel = EEFGenFactory.eINSTANCE.createEEFGenModel();
		eefGenModel.setGenDirectory(findGenDirectory(targetFolder));
		for (PropertiesEditionContext context : contexts)
			eefGenModel.getEditionContexts().add(createGenEditionContext(context));
		String contextPackage = "";
		if (contexts.size() > 0) {
			String findBasePackage = findBasePackage(contexts.get(0).getModel());
			if (findBasePackage != null && !findBasePackage.equals("")) {
				contextPackage = findBasePackage + ".";
			}
			contextPackage = contextPackage + contexts.get(0).getModel().getEcorePackage().getName().toLowerCase();
		}
		for (ViewsRepository repository : repositories.keySet())
			eefGenModel.getViewsRepositories().add(createGenViewsRepository(repository, repositories.get(repository)));
		return eefGenModel;
	}

	/***
	 *
	 * Copy from EEF
	 */
	private GenEditionContext createGenEditionContext(PropertiesEditionContext context) {
		GenEditionContext genEditionContext = EEFGenFactory.eINSTANCE.createGenEditionContext();
		genEditionContext.setPropertiesEditionContext(context);
		if (context.getModel() != null)
			genEditionContext.setBasePackage(findBasePackage(context.getModel()));
		genEditionContext.setDescriptorsGenericPropertiesViews(true);
		return genEditionContext;
	}

	/***
	 *
	 * Copy from EEF
	 */
	private GenViewsRepository createGenViewsRepository(ViewsRepository repository, String contextPackage) {
		GenViewsRepository genViewsRepository = EEFGenFactory.eINSTANCE.createGenViewsRepository();
		genViewsRepository.setViewsRepository(repository);
		genViewsRepository.setBasePackage(contextPackage);
		genViewsRepository.setSwtViews(true);
		genViewsRepository.setFormViews(true);
		return genViewsRepository;
	}

	/***
	 *
	 * Copy from EEF
	 */
	private String findBasePackage(GenPackage genPackage) {
		if (genPackage.getBasePackage() != null)
			return genPackage.getBasePackage();
		return "";
	}

	/***
	 *
	 * Copy from EEF
	 */
	private String findGenDirectory(IContainer targetFolder) {
		IProject project;
		if (targetFolder instanceof IFolder) {
			project = targetFolder.getProject();
		} else {
			project = (IProject) targetFolder;
		}

		return project.getFullPath().toString() + "/src-gen";
	}

}
