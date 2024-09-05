/**
 */
package org.palladiosimulator.spdmodelreward.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.RewardAggregationMethod;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardFactory;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spdmodelreward.FunctionReward} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class FunctionRewardItemProvider extends BaseRewardItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public FunctionRewardItemProvider(final AdapterFactory adapterFactory) {
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

            this.addFunctionPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Function feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addFunctionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_FunctionReward_function_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_FunctionReward_function_feature",
                        "_UI_FunctionReward_type"),
                SpdmodelrewardPackage.Literals.FUNCTION_REWARD__FUNCTION, true, false, false,
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
            this.childrenFeatures.add(SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS);
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
     * This returns FunctionReward.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/FunctionReward"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final RewardAggregationMethod labelValue = ((FunctionReward) object).getFunction();
        final String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? this.getString("_UI_FunctionReward_type")
                : this.getString("_UI_FunctionReward_type") + " " + label;
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

        switch (notification.getFeatureID(FunctionReward.class)) {
        case SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
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

        newChildDescriptors.add(this.createChildParameter(SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS,
                SpdmodelrewardFactory.eINSTANCE.createStaticReward()));

        newChildDescriptors.add(this.createChildParameter(SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS,
                SpdmodelrewardFactory.eINSTANCE.createSLOReward()));

        newChildDescriptors.add(this.createChildParameter(SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS,
                SpdmodelrewardFactory.eINSTANCE.createUtilizationReward()));

        newChildDescriptors.add(this.createChildParameter(SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS,
                SpdmodelrewardFactory.eINSTANCE.createFunctionReward()));
    }

}
