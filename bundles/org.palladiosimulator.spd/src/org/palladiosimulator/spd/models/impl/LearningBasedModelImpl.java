/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spdmodelreward.ModelReward;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Learning Based
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl#getReward
 * <em>Reward</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LearningBasedModelImpl extends BaseModelImpl implements LearningBasedModel {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LearningBasedModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.LEARNING_BASED_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelReward getReward() {
        return (ModelReward) this.eDynamicGet(ModelsPackage.LEARNING_BASED_MODEL__REWARD,
                ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelReward basicGetReward() {
        return (ModelReward) this.eDynamicGet(ModelsPackage.LEARNING_BASED_MODEL__REWARD,
                ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReward(final ModelReward newReward) {
        this.eDynamicSet(ModelsPackage.LEARNING_BASED_MODEL__REWARD,
                ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD, newReward);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
            if (resolve) {
                return this.getReward();
            }
            return this.basicGetReward();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
            this.setReward((ModelReward) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
            this.setReward((ModelReward) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
            return this.basicGetReward() != null;
        }
        return super.eIsSet(featureID);
    }

} // LearningBasedModelImpl
