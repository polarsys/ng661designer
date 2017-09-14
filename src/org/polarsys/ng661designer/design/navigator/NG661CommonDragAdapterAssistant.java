/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.navigator.CommonDragAdapterAssistant;

/**
 * Drag adapter assistant to contribute to the model explorer view.
 * 
 * 
 */
public class NG661CommonDragAdapterAssistant extends CommonDragAdapterAssistant {

	private static final Transfer[] SUPPORTED_TRANSFERS = new Transfer[] {
			LocalSelectionTransfer.getTransfer(), LocalTransfer.getInstance() };

	/**
	 * Default constructor.
	 */
	public NG661CommonDragAdapterAssistant() {
	}

	@Override
	public Transfer[] getSupportedTransferTypes() {
		return SUPPORTED_TRANSFERS;
	}

	@Override
	public boolean setDragData(DragSourceEvent event,
			IStructuredSelection selection) {
		boolean canBeSet = false;
		Object o = selection.getFirstElement();
		if (o instanceof EObject) {
			event.data = o;
			event.detail = DND.DROP_MOVE;
			canBeSet = true;
		}
		return canBeSet;
	}
}