/*******************************************************************************
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.listeners;

import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.internal.query.ResourceQueryInternal;
import org.eclipse.sirius.ecore.extender.tool.api.ModelUtils;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * Create representation automatically.
 * 
 * @author Nathalie Lepine <nathalie.lepine@obeo.fr>
 *
 */
@SuppressWarnings("restriction")
public class CreateRepresentationTrigger implements ModelChangeTrigger {

	private Session session;

	public CreateRepresentationTrigger(Session session) {
		this.session = session;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.ModelChangeTrigger#localChangesAboutToCommit()
	 */
	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		Command cmd = new CompoundCommand();
		for (final Notification notification : notifications) {
			if (notification.getEventType() == Notification.ADD) {
				Command command = new RecordingCommand(session.getTransactionalEditingDomain()) {

					/**
					 * (non-Javadoc)
					 * 
					 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
					 */
					@Override
					protected void doExecute() {
						// add part2 resource
						if (isDAnalysesSemanticResourcesNotification(notification)) {
							Resource resource = ModelUtils.getResource(session.getTransactionalEditingDomain().getResourceSet(), ((ResourceDescriptor) notification.getNewValue()).getResourceURI());
							if (resource != null) {
								EObject eObject = new ResourceQueryInternal(resource).findSemanticRoot();
								if (eObject instanceof ComponentDefinitionType) {
									createRepresentations((ComponentDefinitionType) eObject);
								}
							}
							// add Eobject:
							// Component/Behavior/Interface/Representation/HSM...
						} else if (notification.getNewValue() instanceof EObject) {
							createRepresentation((EObject) notification.getNewValue());
						}
					}

				};
				((CompoundCommand) cmd).append(command);
			}
		}
		return Options.newSome(cmd);

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.ModelChangeTrigger#priority()
	 */
	@Override
	public int priority() {
		return 0;
	}

	/**
	 * Create all representations on Eobject.
	 * 
	 * @param eObject
	 *            EObject
	 */
	protected void createRepresentation(EObject eObject) {
		Collection<RepresentationDescription> descs = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), eObject);
		for (RepresentationDescription desc : descs) {
			if (DialectManager.INSTANCE.canCreate(eObject, desc)) {
				DialectManager.INSTANCE.createRepresentation(desc.getLabel(), eObject, desc, session, new NullProgressMonitor());
			}
		}
	}

	/**
	 * @param notification
	 *            Notification
	 * @return if notication is "add par2 resource"
	 */
	protected boolean isDAnalysesSemanticResourcesNotification(Notification notification) {
		return notification.getNotifier() instanceof DAnalysis && notification.getNewValue() instanceof ResourceDescriptor && Part2Package.eINSTANCE.getName().equals(((ResourceDescriptor) notification.getNewValue()).getResourceURI().fileExtension());
	}

	/**
	 * Create representation on Component/Behavior/Interface/Representation
	 * 
	 * @param component
	 *            ComponentDefinitionType
	 */
	protected void createRepresentations(ComponentDefinitionType component) {
		createRepresentation(component);
		if (component.getBehavior() != null) {
			createRepresentation(component.getBehavior());
		}
		if (component.getInterface() != null) {
			createRepresentation(component.getInterface());
		}
		if (component.getRepresentation() != null) {
			createRepresentation(component.getRepresentation());
		}
	}
}
