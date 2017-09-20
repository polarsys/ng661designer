/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.ng661designer.dsl.part2.gen.ComponentDefinitionType;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PropertyValue;
import org.polarsys.ng661designer.dsl.part2.gen.WidgetComposition;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;
import org.polarsys.ng661designer.dsl.part2.parts.WidgetCompositionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class WidgetCompositionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for representation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings representationSettings;
	
	/**
	 * Settings for values ReferencesTable
	 */
	protected ReferencesTableSettings valuesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public WidgetCompositionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject widgetComposition, String editing_mode) {
		super(editingContext, widgetComposition, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.WidgetComposition.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final WidgetComposition widgetComposition = (WidgetComposition)elt;
			final WidgetCompositionPropertiesEditionPart basePart = (WidgetCompositionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.WidgetComposition.Properties.representation)) {
				// init part
				representationSettings = new EObjectFlatComboSettings(widgetComposition, Part2Package.eINSTANCE.getWidgetComposition_Representation());
				basePart.initRepresentation(representationSettings);
				// set the button mode
				basePart.setRepresentationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Part2ViewsRepository.WidgetComposition.Properties.values)) {
				valuesSettings = new ReferencesTableSettings(widgetComposition, Part2Package.eINSTANCE.getWidgetComposition_Values());
				basePart.initValues(valuesSettings);
			}
			// init filters
			if (isAccessible(Part2ViewsRepository.WidgetComposition.Properties.representation)) {
				basePart.addFilterToRepresentation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ComponentDefinitionType); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for representation
				// End of user code
			}
			if (isAccessible(Part2ViewsRepository.WidgetComposition.Properties.values)) {
				basePart.addFilterToValues(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof PropertyValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for values
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == Part2ViewsRepository.WidgetComposition.Properties.representation) {
			return Part2Package.eINSTANCE.getWidgetComposition_Representation();
		}
		if (editorKey == Part2ViewsRepository.WidgetComposition.Properties.values) {
			return Part2Package.eINSTANCE.getWidgetComposition_Values();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		WidgetComposition widgetComposition = (WidgetComposition)semanticObject;
		if (Part2ViewsRepository.WidgetComposition.Properties.representation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				representationSettings.setToReference((ComponentDefinitionType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ComponentDefinitionType eObject = Part2Factory.eINSTANCE.createComponentDefinitionType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				representationSettings.setToReference(eObject);
			}
		}
		if (Part2ViewsRepository.WidgetComposition.Properties.values == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, valuesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				valuesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				valuesSettings.move(event.getNewIndex(), (PropertyValue) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			WidgetCompositionPropertiesEditionPart basePart = (WidgetCompositionPropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getWidgetComposition_Representation().equals(msg.getFeature()) && basePart != null && isAccessible(Part2ViewsRepository.WidgetComposition.Properties.representation))
				basePart.setRepresentation((EObject)msg.getNewValue());
			if (Part2Package.eINSTANCE.getWidgetComposition_Values().equals(msg.getFeature()) && isAccessible(Part2ViewsRepository.WidgetComposition.Properties.values))
				basePart.updateValues();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			Part2Package.eINSTANCE.getWidgetComposition_Representation(),
			Part2Package.eINSTANCE.getWidgetComposition_Values()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
