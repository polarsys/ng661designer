/*******************************************************************************
 * Copyright (c) 2015, 2017 THALES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.interpreter.view;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Launch Interpreter Handler.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class LaunchInterpreterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		Object element = ((StructuredSelection) selection).getFirstElement();
		if (element instanceof GraphicalEditPart) {
			GraphicalEditPart editPart = ((GraphicalEditPart) element);
			if (editPart.resolveSemanticElement() instanceof DSemanticDecorator) {
				Resource resource = ((DSemanticDecorator) editPart.resolveSemanticElement()).getTarget().eResource();
				org.eclipse.emf.common.util.URI resolvedFile = CommonPlugin.resolve(resource.getURI());
				String fileString = resolvedFile.toFileString();
				try {
					IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InterpreterView.ID);
					if (view == null) {
						view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(InterpreterView.ID);
					}
					if (view instanceof InterpreterView) {
						if (((InterpreterView) view).getInterpreteur() == null) {
							((InterpreterView) view).initInterpreter(fileString);
						} else {
							((InterpreterView) view).updateInterpreter(fileString);
						}
					}
				} catch (PartInitException e) {
					org.polarsys.ng661designer.interpreter.Activator.getDefault().getLog().log(new Status(Status.ERROR, org.polarsys.ng661designer.interpreter.Activator.PLUGIN_ID, "The interpreter view does not exist.", e));
				}

			}
		}

		return null;
	}

}
