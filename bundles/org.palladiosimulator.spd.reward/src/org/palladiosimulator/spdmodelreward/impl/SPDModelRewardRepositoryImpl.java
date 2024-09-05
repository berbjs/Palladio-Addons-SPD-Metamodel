/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.SPDModelRewardRepository;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SPD Model Reward
 * Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.SPDModelRewardRepositoryImpl#getModelReward
 * <em>Model Reward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDModelRewardRepositoryImpl extends MinimalEObjectImpl.Container implements SPDModelRewardRepository {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SPDModelRewardRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmodelrewardPackage.Literals.SPD_MODEL_REWARD_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ModelReward> getModelReward() {
        return (EList<ModelReward>) this.eDynamicGet(SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD,
                SpdmodelrewardPackage.Literals.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD:
            return ((InternalEList<?>) this.getModelReward()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD:
            return this.getModelReward();
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
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD:
            this.getModelReward()
                .clear();
            this.getModelReward()
                .addAll((Collection<? extends ModelReward>) newValue);
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
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD:
            this.getModelReward()
                .clear();
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
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD:
            return !this.getModelReward()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SPDModelRewardRepositoryImpl
