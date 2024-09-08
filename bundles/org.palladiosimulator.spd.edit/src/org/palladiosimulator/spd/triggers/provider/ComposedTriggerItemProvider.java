/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.TriggersFactory;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.triggers.ComposedTrigger} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ComposedTriggerItemProvider extends ScalingTriggerItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ComposedTriggerItemProvider(final AdapterFactory adapterFactory) {
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

            this.addLogicalOperatorPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Logical Operator feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLogicalOperatorPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ComposedTrigger_logicalOperator_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ComposedTrigger_logicalOperator_feature",
                        "_UI_ComposedTrigger_type"),
                TriggersPackage.Literals.COMPOSED_TRIGGER__LOGICAL_OPERATOR, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            this.childrenFeatures.add(TriggersPackage.Literals.COMPOSED_TRIGGER__SCALINGTRIGGER);
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

    /*
     * This overrides and reuses the icon for a trigger. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return super.getImage(object);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ComposedTrigger) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ComposedTrigger_type")
                : this.getString("_UI_ComposedTrigger_type") + " " + label;
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

        switch (notification.getFeatureID(ComposedTrigger.class)) {
        case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
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

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.COMPOSED_TRIGGER__SCALINGTRIGGER,
                TriggersFactory.eINSTANCE.createComposedTrigger()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.COMPOSED_TRIGGER__SCALINGTRIGGER,
                TriggersFactory.eINSTANCE.createSimpleFireOnValue()));

        newChildDescriptors.add(this.createChildParameter(TriggersPackage.Literals.COMPOSED_TRIGGER__SCALINGTRIGGER,
                TriggersFactory.eINSTANCE.createSimpleFireOnTrend()));
    }

}
