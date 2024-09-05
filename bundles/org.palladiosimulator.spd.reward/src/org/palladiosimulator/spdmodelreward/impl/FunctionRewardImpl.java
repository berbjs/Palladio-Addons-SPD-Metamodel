/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.spdmodelreward.BaseReward;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.RewardAggregationMethod;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Function Reward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl#getRewards
 * <em>Rewards</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl#getFunction
 * <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRewardImpl extends BaseRewardImpl implements FunctionReward {
    /**
     * The default value of the '{@link #getFunction() <em>Function</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected static final RewardAggregationMethod FUNCTION_EDEFAULT = RewardAggregationMethod.ADDITION;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FunctionRewardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmodelrewardPackage.Literals.FUNCTION_REWARD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<BaseReward> getRewards() {
        return (EList<BaseReward>) this.eDynamicGet(SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS,
                SpdmodelrewardPackage.Literals.FUNCTION_REWARD__REWARDS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RewardAggregationMethod getFunction() {
        return (RewardAggregationMethod) this.eDynamicGet(SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION,
                SpdmodelrewardPackage.Literals.FUNCTION_REWARD__FUNCTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFunction(final RewardAggregationMethod newFunction) {
        this.eDynamicSet(SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION,
                SpdmodelrewardPackage.Literals.FUNCTION_REWARD__FUNCTION, newFunction);
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
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
            return ((InternalEList<?>) this.getRewards()).basicRemove(otherEnd, msgs);
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
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
            return this.getRewards();
        case SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION:
            return this.getFunction();
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
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
            this.getRewards()
                .clear();
            this.getRewards()
                .addAll((Collection<? extends BaseReward>) newValue);
            return;
        case SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION:
            this.setFunction((RewardAggregationMethod) newValue);
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
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
            this.getRewards()
                .clear();
            return;
        case SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION:
            this.setFunction(FUNCTION_EDEFAULT);
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
        case SpdmodelrewardPackage.FUNCTION_REWARD__REWARDS:
            return !this.getRewards()
                .isEmpty();
        case SpdmodelrewardPackage.FUNCTION_REWARD__FUNCTION:
            return this.getFunction() != FUNCTION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // FunctionRewardImpl
