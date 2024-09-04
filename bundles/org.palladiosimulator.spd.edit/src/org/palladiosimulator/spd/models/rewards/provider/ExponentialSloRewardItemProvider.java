/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.models.rewards.ExponentialSloReward;
import org.palladiosimulator.spd.models.rewards.RewardsPackage;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.models.rewards.ExponentialSloReward} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialSloRewardItemProvider extends BaseRewardItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialSloRewardItemProvider(AdapterFactory adapterFactory) {
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

			addTargetResponseTimePropertyDescriptor(object);
			addExponentialSteepnessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Response Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetResponseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExponentialSloReward_targetResponseTime_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ExponentialSloReward_targetResponseTime_feature", "_UI_ExponentialSloReward_type"),
						RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exponential Steepness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExponentialSteepnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ExponentialSloReward_exponentialSteepness_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExponentialSloReward_exponentialSteepness_feature",
						"_UI_ExponentialSloReward_type"),
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS);
			childrenFeatures.add(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS);
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
	 * This returns ExponentialSloReward.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExponentialSloReward"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ExponentialSloReward exponentialSloReward = (ExponentialSloReward) object;
		return getString("_UI_ExponentialSloReward_type") + " " + exponentialSloReward.getTargetResponseTime();
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

		switch (notification.getFeatureID(ExponentialSloReward.class)) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME:
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
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

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS,
						StimuliFactory.eINSTANCE.createOperationResponseTime()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createOperationResponseTime()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createNumberOfElements()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createCPUUtilization()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createMemoryUtilization()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createSimulationTime()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createHDDUtilization()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createTaskCount()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createQueueLength()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createNetworkUtilization()));

		newChildDescriptors
				.add(createChildParameter(RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
						StimuliFactory.eINSTANCE.createAggregatedStimulus()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS
				|| childFeature == RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
