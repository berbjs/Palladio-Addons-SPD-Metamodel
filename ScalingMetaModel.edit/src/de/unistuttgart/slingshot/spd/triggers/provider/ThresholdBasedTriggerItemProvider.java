/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers.provider;


import de.unistuttgart.slingshot.spd.triggers.THRESHOLDDIRECTION;
import de.unistuttgart.slingshot.spd.triggers.ThresholdBasedTrigger;
import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.unistuttgart.slingshot.spd.triggers.ThresholdBasedTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThresholdBasedTriggerItemProvider extends ScalingTriggerItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdBasedTriggerItemProvider(AdapterFactory adapterFactory) {
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

			addThresholdDirectionPropertyDescriptor(object);
			addThresholdPropertyDescriptor(object);
			addViolationWindowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ThresholdBasedTrigger_thresholdDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThresholdBasedTrigger_thresholdDirection_feature", "_UI_ThresholdBasedTrigger_type"),
				 TriggersPackage.Literals.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ThresholdBasedTrigger_threshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThresholdBasedTrigger_threshold_feature", "_UI_ThresholdBasedTrigger_type"),
				 TriggersPackage.Literals.THRESHOLD_BASED_TRIGGER__THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ThresholdBasedTrigger_violationWindow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThresholdBasedTrigger_violationWindow_feature", "_UI_ThresholdBasedTrigger_type"),
				 TriggersPackage.Literals.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW,
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
		THRESHOLDDIRECTION labelValue = ((ThresholdBasedTrigger)object).getThresholdDirection();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ThresholdBasedTrigger_type") :
			getString("_UI_ThresholdBasedTrigger_type") + " " + label;
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

		switch (notification.getFeatureID(ThresholdBasedTrigger.class)) {
			case TriggersPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION:
			case TriggersPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD:
			case TriggersPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW:
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
