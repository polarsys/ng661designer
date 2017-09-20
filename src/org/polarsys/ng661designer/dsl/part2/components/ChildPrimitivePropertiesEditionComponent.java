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
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.polarsys.ng661designer.dsl.part2.gen.ChildPrimitive;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.parts.ChildPrimitivePropertiesEditionPart;
import org.polarsys.ng661designer.dsl.part2.parts.Part2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ChildPrimitivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChildPrimitivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject childPrimitive, String editing_mode) {
		super(editingContext, childPrimitive, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Part2ViewsRepository.class;
		partKey = Part2ViewsRepository.ChildPrimitive.class;
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
			
			final ChildPrimitive childPrimitive = (ChildPrimitive)elt;
			final ChildPrimitivePropertiesEditionPart basePart = (ChildPrimitivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getNameType(), childPrimitive.getId()));
			
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority))
				basePart.setDrawingPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), childPrimitive.getDrawingPriority()));
			
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren))
				basePart.setMaxNumberOfChildren(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), childPrimitive.getMaxNumberOfChildren()));
			
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.priority))
				basePart.setPriority(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), childPrimitive.getPriority()));
			
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.transform))
				basePart.setTransform(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getStringType(), childPrimitive.getTransform()));
			
			if (isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.visibility))
				basePart.setVisibility(EEFConverterUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), childPrimitive.getVisibility()));
			
			// init filters
			
			
			
			
			
			
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
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.id) {
			return Part2Package.eINSTANCE.getChildPrimitive_Id();
		}
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority) {
			return Part2Package.eINSTANCE.getChildPrimitive_DrawingPriority();
		}
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren) {
			return Part2Package.eINSTANCE.getChildPrimitive_MaxNumberOfChildren();
		}
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.priority) {
			return Part2Package.eINSTANCE.getChildPrimitive_Priority();
		}
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.transform) {
			return Part2Package.eINSTANCE.getChildPrimitive_Transform();
		}
		if (editorKey == Part2ViewsRepository.ChildPrimitive.Properties.visibility) {
			return Part2Package.eINSTANCE.getChildPrimitive_Visibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ChildPrimitive childPrimitive = (ChildPrimitive)semanticObject;
		if (Part2ViewsRepository.ChildPrimitive.Properties.id == event.getAffectedEditor()) {
			childPrimitive.setId((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getNameType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
			childPrimitive.setDrawingPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getZIndexType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren == event.getAffectedEditor()) {
			childPrimitive.setMaxNumberOfChildren((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ChildPrimitive.Properties.priority == event.getAffectedEditor()) {
			childPrimitive.setPriority((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getIntegerType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ChildPrimitive.Properties.transform == event.getAffectedEditor()) {
			childPrimitive.setTransform((java.lang.String)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getStringType(), (String)event.getNewValue()));
		}
		if (Part2ViewsRepository.ChildPrimitive.Properties.visibility == event.getAffectedEditor()) {
			childPrimitive.setVisibility((java.lang.Object)EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getVisibilityType(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ChildPrimitivePropertiesEditionPart basePart = (ChildPrimitivePropertiesEditionPart)editingPart;
			if (Part2Package.eINSTANCE.getChildPrimitive_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(Part2Package.eINSTANCE.getNameType(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Part2Package.eINSTANCE.getChildPrimitive_DrawingPriority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority)) {
				if (msg.getNewValue() != null) {
					basePart.setDrawingPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getZIndexType(), msg.getNewValue()));
				} else {
					basePart.setDrawingPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getChildPrimitive_MaxNumberOfChildren().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxNumberOfChildren(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setMaxNumberOfChildren("");
				}
			}
			if (Part2Package.eINSTANCE.getChildPrimitive_Priority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.priority)) {
				if (msg.getNewValue() != null) {
					basePart.setPriority(EcoreUtil.convertToString(Part2Package.eINSTANCE.getIntegerType(), msg.getNewValue()));
				} else {
					basePart.setPriority("");
				}
			}
			if (Part2Package.eINSTANCE.getChildPrimitive_Transform().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.transform)) {
				if (msg.getNewValue() != null) {
					basePart.setTransform(EcoreUtil.convertToString(Part2Package.eINSTANCE.getStringType(), msg.getNewValue()));
				} else {
					basePart.setTransform("");
				}
			}
			if (Part2Package.eINSTANCE.getChildPrimitive_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(Part2ViewsRepository.ChildPrimitive.Properties.visibility)) {
				if (msg.getNewValue() != null) {
					basePart.setVisibility(EcoreUtil.convertToString(Part2Package.eINSTANCE.getVisibilityType(), msg.getNewValue()));
				} else {
					basePart.setVisibility("");
				}
			}
			
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
			Part2Package.eINSTANCE.getChildPrimitive_Id(),
			Part2Package.eINSTANCE.getChildPrimitive_DrawingPriority(),
			Part2Package.eINSTANCE.getChildPrimitive_MaxNumberOfChildren(),
			Part2Package.eINSTANCE.getChildPrimitive_Priority(),
			Part2Package.eINSTANCE.getChildPrimitive_Transform(),
			Part2Package.eINSTANCE.getChildPrimitive_Visibility()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Part2ViewsRepository.ChildPrimitive.Properties.id;
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
				if (Part2ViewsRepository.ChildPrimitive.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_Id().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ChildPrimitive.Properties.drawingPriority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_DrawingPriority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_DrawingPriority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ChildPrimitive.Properties.maxNumberOfChildren == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_MaxNumberOfChildren().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_MaxNumberOfChildren().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ChildPrimitive.Properties.priority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_Priority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_Priority().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ChildPrimitive.Properties.transform == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_Transform().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_Transform().getEAttributeType(), newValue);
				}
				if (Part2ViewsRepository.ChildPrimitive.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Part2Package.eINSTANCE.getChildPrimitive_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Part2Package.eINSTANCE.getChildPrimitive_Visibility().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
