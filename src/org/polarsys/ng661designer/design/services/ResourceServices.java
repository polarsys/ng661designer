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

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.polarsys.ng661designer.dsl.part2.gen.FunctionType;

import com.google.common.collect.Lists;

import org.polarsys.ng661designer.design.Activator;

/**
 * Services for representations.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class ResourceServices {

	private NG661DesignerModelUtils ng661ModelUtils;
	private List<IResourceChangeListener> resourceChangeListeners = Lists.newArrayList();

	/**
	 * Open editor on a function.
	 * 
	 * @param functionType
	 *            FunctionType
	 */
	public String openEditor(FunctionType functionType) {
		return openEditor(functionType, functionType.getName(), functionType.getScript());
	}

	/**
	 * Open editor on eobject.
	 * 
	 * @param element
	 *            EObject
	 * @param name
	 * @param script
	 * @return script
	 */
	public String openEditor(EObject element, String name, String script) {
		// get File
		IFile file = getFunctionFile(element, name, script);
		// open editor
		openEditor(file, element);
		// get file content
		return getStringFromInputStream(file);
	}

	/**
	 * @param script
	 * @param functionType
	 *            FunctionType
	 * @return Function file.
	 */
	private IFile getFunctionFile(EObject element, String name, String script) {
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(element.eResource().getURI().toPlatformString(true)));
		IFolder folder = modelFile.getProject().getFolder(element.eClass().getName());
		if (!folder.exists()) {
			createFolder(folder);
		}
		IFile file = folder.getFile(name + ".script");
		if (!file.exists()) {
			if (script == null) {
				script = "";
			}
			createFile(file, script);
		}
		return file;
	}

	/**
	 * Create folder
	 * 
	 * @param folder
	 *            IFolder
	 */
	private void createFolder(IFolder folder) {
		try {
			folder.create(IResource.NONE, true, null);
		} catch (CoreException e) {
			Activator.getDefault().getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Creating folder failed", e));
		}
	}

	/**
	 * Create file and init it with script value.
	 * 
	 * @param file
	 *            IFile
	 * @param script
	 */
	private void createFile(IFile file, String script) {
		byte[] bytes = script.getBytes();
		InputStream source = new ByteArrayInputStream(bytes);
		try {
			file.create(source, IResource.NONE, null);
		} catch (CoreException e) {
			Activator.getDefault().getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Creating file failed", e));
		}
	}

	/**
	 * @param file
	 *            IFile
	 * @return file content.
	 */
	private static String getStringFromInputStream(IFile file) {
		try {
			InputStream is = file.getContents();
			BufferedReader br = null;
			StringBuilder sb = new StringBuilder();

			String line;
			try {
				br = new BufferedReader(new InputStreamReader(is));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
			} catch (IOException e) {
				Activator.getDefault().getLog()
						.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Reading script failed", e));
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return sb.toString();
		} catch (CoreException e) {
			Activator.getDefault().getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Reading script failed", e));
		}
		return "";
	}

	/**
	 * Open text editor.
	 * 
	 * @param file
	 *            IFile
	 */
	private IEditorPart openEditor(final IFile file, final EObject element) {
		IEditorInput editorInput = new FileEditorInput(file);
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPage page = window.getActivePage();
			final IResourceChangeListener listener = new IResourceChangeListener() {

				@Override
				public void resourceChanged(IResourceChangeEvent event) {
					try {
						event.getDelta().accept(new DeltaPrinter(file.getName(), element));
					} catch (CoreException e) {
						Activator.getDefault().getLog()
								.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Resource changed failed", e));
					}

				}

				class DeltaPrinter implements IResourceDeltaVisitor {
					private String name;
					private EObject element;
					private Session session;

					public DeltaPrinter(String name, EObject element) {
						this.name = name;
						this.element = element;
						this.session = SessionManager.INSTANCE.getSession(element);
					}

					public boolean visit(IResourceDelta delta) {
						IResource res = delta.getResource();
						switch (delta.getKind()) {
						case IResourceDelta.CHANGED:
							if (res.getFullPath().toString().contains(element.eClass().getName() + "/" + name)) {
								final String script = getStringFromInputStream((IFile) delta.getResource());

								session.getTransactionalEditingDomain().getCommandStack().execute(
										new RecordingCommand(session.getTransactionalEditingDomain(), "Set script") {

									@Override
									protected void doExecute() {
										getNG661DesignerModelUtils().setScript(element, script);
									}
								});
							}
							break;
						}
						return true; // visit the children
					}
				}
			};
			page.addPartListener(new IPartListener() {

				@Override
				public void partOpened(IWorkbenchPart part) {
					if (!resourceChangeListeners.contains(listener)) {
						ResourcesPlugin.getWorkspace().addResourceChangeListener(listener,
								IResourceChangeEvent.POST_CHANGE);
						resourceChangeListeners.add(listener);
					}
				}

				@Override
				public void partDeactivated(IWorkbenchPart part) {
				}

				@Override
				public void partClosed(IWorkbenchPart part) {
					ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
					resourceChangeListeners.remove(listener);
				}

				@Override
				public void partBroughtToTop(IWorkbenchPart part) {
				}

				@Override
				public void partActivated(IWorkbenchPart part) {
				}
			});
			IEditorPart openEditor = page.openEditor(editorInput, "org.eclipse.ui.DefaultTextEditor");
			return openEditor;
		} catch (PartInitException e) {
			Activator.getDefault().getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Open text editor failed", e));
		}
		return null;
	}

	/**
	 * @return EcoreServices
	 */
	private NG661DesignerModelUtils getNG661DesignerModelUtils() {
		if (ng661ModelUtils == null) {
			ng661ModelUtils = new NG661DesignerModelUtils();
		}
		return ng661ModelUtils;
	}

}
