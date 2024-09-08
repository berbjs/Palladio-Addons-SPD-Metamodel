/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.triggers.BaseTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.triggers.BaseTrigger}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class BaseTriggerItemProvider extends ScalingTriggerItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public BaseTriggerItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS);
            this.childrenFeatures.add(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((BaseTrigger) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_BaseTrigger_type")
                : this.getString("_UI_BaseTrigger_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(BaseTrigger.class)) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createOperationResponseTime()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createNumberOfElements()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createCPUUtilization()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createMemoryUtilization()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createSimulationTime()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createHDDUtilization()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createTaskCount()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createQueueLength()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createNetworkUtilization()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                StimuliFactory.eINSTANCE.createAggregatedStimulus()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
                ExpectationsFactory.eINSTANCE.createNoExpectation()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
                ExpectationsFactory.eINSTANCE.createExpectedPercentage()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
                ExpectationsFactory.eINSTANCE.createExpectedCount()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
                ExpectationsFactory.eINSTANCE.createExpectedTime()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
                ExpectationsFactory.eINSTANCE.createExpectedTrend()));
    }

}
