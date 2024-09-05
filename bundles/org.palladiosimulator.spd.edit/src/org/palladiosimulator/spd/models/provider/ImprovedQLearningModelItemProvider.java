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
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.stimulus.StimulusFactory;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.models.ImprovedQLearningModel} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImprovedQLearningModelItemProvider extends LearningBasedModelItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ImprovedQLearningModelItemProvider(final AdapterFactory adapterFactory) {
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

            this.addEpsilonPropertyDescriptor(object);
            this.addLearningRatePropertyDescriptor(object);
            this.addActionCountPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
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
                this.getString("_UI_ImprovedQLearningModel_epsilon_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ImprovedQLearningModel_epsilon_feature",
                        "_UI_ImprovedQLearningModel_type"),
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EPSILON, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Learning Rate feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addLearningRatePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ImprovedQLearningModel_learningRate_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ImprovedQLearningModel_learningRate_feature",
                        "_UI_ImprovedQLearningModel_type"),
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__LEARNING_RATE, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Action Count feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addActionCountPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ImprovedQLearningModel_actionCount_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ImprovedQLearningModel_actionCount_feature",
                        "_UI_ImprovedQLearningModel_type"),
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__ACTION_COUNT, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
            this.childrenFeatures.add(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT);
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
     * This returns ImprovedQLearningModel.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/ImprovedQLearningModel"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final ImprovedQLearningModel improvedQLearningModel = (ImprovedQLearningModel) object;
        return this.getString("_UI_ImprovedQLearningModel_type") + " " + improvedQLearningModel.getInterval();
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

        switch (notification.getFeatureID(ImprovedQLearningModel.class)) {
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__LEARNING_RATE:
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
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

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createOperationResponseTime()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createNumberOfElements()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createCPUUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createMemoryUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createSimulationTime()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createHDDUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createTaskCount()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createQueueLength()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createNetworkUtilization()));

        newChildDescriptors.add(this.createChildParameter(ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT,
                StimulusFactory.eINSTANCE.createAggregatedStimulus()));
    }

}
