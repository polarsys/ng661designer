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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;

/**
 * Session manager listener.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerSessionListener implements SessionManagerListener {

	private Session session;
	private CreateRepresentationTrigger trigger;

	public static final NotificationFilter CREATE_REPRESENTATION = new NotificationFilter.Custom() {

		public boolean matches(Notification notification) {
			return (notification.getFeature() == Part2Package.eINSTANCE.getComponentDefinitionType_Behavior() || notification.getFeature() == Part2Package.eINSTANCE.getComponentDefinitionType_Interface() || notification.getFeature() == Part2Package.eINSTANCE.getComponentDefinitionType_Representation()
					|| notification.getFeature() == Part2Package.eINSTANCE.getBehaviorType_Scxml() || notification.getFeature() == Part2Package.eINSTANCE.getDocumentRoot_ComponentDefinition() || notification.getFeature() == ViewpointPackage.eINSTANCE.getDAnalysis_SemanticResources());
		}
	};

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#notifyAddSession(org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	public void notifyAddSession(Session newSession) {
		this.session = newSession;
		trigger = new CreateRepresentationTrigger(session);
		this.session.getEventBroker().addLocalTrigger(CREATE_REPRESENTATION, trigger);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#notifyRemoveSession(org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	public void notifyRemoveSession(Session removedSession) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#viewpointSelected(org.eclipse.sirius.viewpoint.description.Viewpoint)
	 */
	@Override
	public void viewpointSelected(Viewpoint selectedSirius) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#viewpointDeselected(org.eclipse.sirius.viewpoint.description.Viewpoint)
	 */
	@Override
	public void viewpointDeselected(Viewpoint deselectedSirius) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#notify(org.eclipse.sirius.business.api.session.Session,
	 *      int)
	 */
	@Override
	public void notify(Session updated, int notification) {
	}

}
