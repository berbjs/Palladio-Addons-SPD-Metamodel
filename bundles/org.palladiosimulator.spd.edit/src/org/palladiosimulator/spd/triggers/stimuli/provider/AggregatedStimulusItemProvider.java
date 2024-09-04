/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregatedStimulusItemProvider extends StimulusItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedStimulusItemProvider(AdapterFactory adapterFactory) {
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

			addAggregationMethodPropertyDescriptor(object);
			addAggregationPeriodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aggregation Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AggregatedStimulus_aggregationMethod_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AggregatedStimulus_aggregationMethod_feature",
						"_UI_AggregatedStimulus_type"),
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_METHOD, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Aggregation Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AggregatedStimulus_aggregationPeriod_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AggregatedStimulus_aggregationPeriod_feature",
						"_UI_AggregatedStimulus_type"),
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, true, false, false,
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
			childrenFeatures.add(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS);
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
	 * This returns AggregatedStimulus.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AggregatedStimulus"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AGGREGATIONMETHOD labelValue = ((AggregatedStimulus) object).getAggregationMethod();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_AggregatedStimulus_type")
				: getString("_UI_AggregatedStimulus_type") + " " + label;
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

		switch (notification.getFeatureID(AggregatedStimulus.class)) {
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
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

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createOperationResponseTime()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createNumberOfElements()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createCPUUtilization()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createMemoryUtilization()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createSimulationTime()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createHDDUtilization()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createTaskCount()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createQueueLength()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createNetworkUtilization()));

		newChildDescriptors.add(createChildParameter(StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliFactory.eINSTANCE.createAggregatedStimulus()));
	}

}