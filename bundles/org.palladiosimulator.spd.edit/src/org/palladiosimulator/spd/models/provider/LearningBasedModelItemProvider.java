/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.rewards.RewardsFactory;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.models.LearningBasedModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LearningBasedModelItemProvider extends BaseModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningBasedModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD);
			childrenFeatures.add(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LearningBasedModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LearningBasedModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LearningBasedModel learningBasedModel = (LearningBasedModel) object;
		return getString("_UI_LearningBasedModel_type") + " " + learningBasedModel.getInterval();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LearningBasedModel.class)) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD,
				RewardsFactory.eINSTANCE.createexponentialSloReward()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createOperationResponseTime()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createNumberOfElements()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createCPUUtilization()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createMemoryUtilization()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createSimulationTime()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createHDDUtilization()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createTaskCount()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createQueueLength()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createNetworkUtilization()));

		newChildDescriptors.add(createChildParameter(ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS,
				StimuliFactory.eINSTANCE.createAggregatedStimulus()));
	}

}
