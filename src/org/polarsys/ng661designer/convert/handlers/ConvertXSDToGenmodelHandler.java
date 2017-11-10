/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.convert.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import org.polarsys.ng661designer.convert.builders.BuilderUtil;
import org.polarsys.ng661designer.convert.builders.EcoreBuilder;
import org.polarsys.ng661designer.convert.builders.GenModelBuilder;
import org.polarsys.ng661designer.convert.builders.NG661Builder;
import org.polarsys.ng661designer.convert.builders.ScxmlBuilder;

/**
 * Convert XSD to Ecore and GenModel files.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ConvertXSDToGenmodelHandler extends AbstractHandler {

	public static final String XSD = "xsd";
	public static final String DESTINATION_FOLFER = "/ng661designer.dsl.part2/model";
	/**
	 * EClass constants
	 */
	private static final String ECORE_EXTENSION = "ecore";

	/**
	 * Resource set variable
	 */
	private ResourceSet resourceSet;
	private Resource ng661Resource;

	/**
	 * Builders.
	 */
	private EcoreBuilder ecoreBuilder;
	private NG661Builder ng661Builder;
	private ScxmlBuilder scxmlBuilder;
	private GenModelBuilder genModelBuilder;

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		// check destination folder
		final IResource modelFolder = ResourcesPlugin.getWorkspace().getRoot().findMember(DESTINATION_FOLFER);
		if (!modelFolder.exists()) {
			MessageDialog.openError(HandlerUtil.getActiveShell(event), "Error during convertion", "File destination folder " + DESTINATION_FOLFER + "does not exist.");
			return null;
		}

		// init variables
		initVariables();

		Job job = new Job("Convert xsd to ecore and genmodel") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				SubMonitor subMonitor = SubMonitor.convert(monitor, 30);
				subMonitor.beginTask("Generate Ecore from XSD", 20);
				// convert xsd to ecore and genmodel
				ISelection selection = HandlerUtil.getCurrentSelection(event);
				if (selection instanceof StructuredSelection) {
					// generate ecore from xsd with basic xsd importer
					for (Object object : ((StructuredSelection) selection).toList()) {
						if (object instanceof IFile && XSD.equals(((IFile) object).getFileExtension())) {
							resourceSet = ecoreBuilder.generateEcoreFiles(modelFolder, (IFile) object);
						}
					}
					subMonitor.worked(20);

					// update ecore resource to update package information, add
					// widget
					// composition and remove non needed feature map entries.
					subMonitor.beginTask("Update Ecore files", 1);
					for (Resource ecoreResource : resourceSet.getResources()) {
						if (ECORE_EXTENSION.equals(ecoreResource.getURI().fileExtension())) {
							if (!ecoreResource.getContents().isEmpty() && ecoreResource.getContents().get(0) instanceof EPackage) {
								EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
								// update NG661 package
								if (ng661Resource == null) {
									ng661Resource = ng661Builder.manageNG661Package(ePackage);
								}	
								// update scxml package
								scxmlBuilder.manageScxmlPackage(ePackage);
								// manage feature map entries
								ecoreBuilder.updateEcoreResource(ecoreResource);
								// save resource
								BuilderUtil.saveResource(ecoreResource);
							}
						}
					}
					subMonitor.worked(1);

					// generate genModel from NG661 resource
					if (ng661Resource != null) {
						subMonitor.beginTask("Generate GenModel from Ecore files", 9);
						GenModel genModel = genModelBuilder.buildGenModel(ng661Resource);
						if (genModel != null) {
							BuilderUtil.saveResource(genModel.eResource());
						}
					}
					subMonitor.worked(9);
					subMonitor.done();
				}
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.setUser(true);
		job.schedule();

		return null;
	}

	/**
	 * Init variables.
	 */
	protected void initVariables() {
		ecoreBuilder = new EcoreBuilder();
		ng661Builder = new NG661Builder(ecoreBuilder);
		scxmlBuilder = new ScxmlBuilder(ecoreBuilder);
		genModelBuilder = new GenModelBuilder();
		resourceSet = new ResourceSetImpl();
	}

}
