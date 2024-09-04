/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.models.QThresholdsModel}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class QThresholdsModelItemProvider extends LearningBasedModelItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public QThresholdsModelItemProvider(final AdapterFactory adapterFactory) {
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

            this.addTargetResponseTimePropertyDescriptor(object);
            this.addExponentialSteepnessPropertyDescriptor(object);
            this.addEpsilonPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Target Response Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addTargetResponseTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_QThresholdsModel_targetResponseTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_QThresholdsModel_targetResponseTime_feature",
                        "_UI_QThresholdsModel_type"),
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Exponential Steepness feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addExponentialSteepnessPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_QThresholdsModel_exponentialSteepness_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_QThresholdsModel_exponentialSteepness_feature", "_UI_QThresholdsModel_type"),
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Epsilon feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addEpsilonPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_QThresholdsModel_epsilon_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_QThresholdsModel_epsilon_feature",
                        "_UI_QThresholdsModel_type"),
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__EPSILON, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
            this.childrenFeatures.add(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT);
            this.childrenFeatures.add(ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS);
            this.childrenFeatures.add(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS);
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
     * This returns QThresholdsModel.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/QThresholdsModel"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final QThresholdsModel qThresholdsModel = (QThresholdsModel) object;
        return this.getString("_UI_QThresholdsModel_type") + " " + qThresholdsModel.getInterval();
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

        switch (notification.getFeatureID(QThresholdsModel.class)) {
        case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
        case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
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

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createOperationResponseTime()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createNumberOfElements()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createCPUUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createMemoryUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createSimulationTime()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createHDDUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createTaskCount()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createQueueLength()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createNetworkUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                StimuliFactory.eINSTANCE.createAggregatedStimulus()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS,
                    StimuliFactory.eINSTANCE.createOperationResponseTime()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createOperationResponseTime()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createNumberOfElements()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createCPUUtilization()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createMemoryUtilization()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createSimulationTime()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createHDDUtilization()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createTaskCount()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createQueueLength()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createNetworkUtilization()));

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                    StimuliFactory.eINSTANCE.createAggregatedStimulus()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT
                || childFeature == ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS
                || childFeature == ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS;

        if (qualify) {
            return this.getString("_UI_CreateChild_text2", new Object[] { this.getTypeText(childObject),
                    this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
