/**
 */
package spd.scalingtrigger.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spd.scalingtrigger.ResourceUtilizationBasedTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

/**
 * This is the item provider adapter for a {@link spd.scalingtrigger.ResourceUtilizationBasedTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceUtilizationBasedTriggerItemProvider extends ThresholdBasedTriggerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUtilizationBasedTriggerItemProvider(AdapterFactory adapterFactory) {
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

			addThresholdPropertyDescriptor(object);
			addThresholdDirectionPropertyDescriptor(object);
			addProcessingResourceAggregationPropertyDescriptor(object);
			addResourceContainerAggregationPropertyDescriptor(object);
			addViolationWindowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceUtilizationBasedTrigger_threshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceUtilizationBasedTrigger_threshold_feature", "_UI_ResourceUtilizationBasedTrigger_type"),
				 ScalingtriggerPackage.Literals.RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceUtilizationBasedTrigger_thresholdDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceUtilizationBasedTrigger_thresholdDirection_feature", "_UI_ResourceUtilizationBasedTrigger_type"),
				 ScalingtriggerPackage.Literals.RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Resource Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingResourceAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceUtilizationBasedTrigger_processingResourceAggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceUtilizationBasedTrigger_processingResourceAggregation_feature", "_UI_ResourceUtilizationBasedTrigger_type"),
				 ScalingtriggerPackage.Literals.RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Container Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceContainerAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceUtilizationBasedTrigger_resourceContainerAggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceUtilizationBasedTrigger_resourceContainerAggregation_feature", "_UI_ResourceUtilizationBasedTrigger_type"),
				 ScalingtriggerPackage.Literals.RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Violation Window feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViolationWindowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceUtilizationBasedTrigger_violationWindow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceUtilizationBasedTrigger_violationWindow_feature", "_UI_ResourceUtilizationBasedTrigger_type"),
				 ScalingtriggerPackage.Literals.RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResourceUtilizationBasedTrigger resourceUtilizationBasedTrigger = (ResourceUtilizationBasedTrigger)object;
		return getString("_UI_ResourceUtilizationBasedTrigger_type") + " " + resourceUtilizationBasedTrigger.getThreshold();
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

		switch (notification.getFeatureID(ResourceUtilizationBasedTrigger.class)) {
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD:
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION:
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION:
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION:
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
