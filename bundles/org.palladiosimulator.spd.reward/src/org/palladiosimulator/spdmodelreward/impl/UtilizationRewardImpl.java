/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.stimulus.Stimulus;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;
import org.palladiosimulator.spdmodelreward.UtilizationReward;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Utilization
 * Reward</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.UtilizationRewardImpl#getStimulus
 * <em>Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilizationRewardImpl extends BaseRewardImpl implements UtilizationReward {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UtilizationRewardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmodelrewardPackage.Literals.UTILIZATION_REWARD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getStimulus() {
        return (Stimulus) this.eDynamicGet(SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS,
                SpdmodelrewardPackage.Literals.UTILIZATION_REWARD__STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetStimulus(final Stimulus newStimulus, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newStimulus,
                SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStimulus(final Stimulus newStimulus) {
        this.eDynamicSet(SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS,
                SpdmodelrewardPackage.Literals.UTILIZATION_REWARD__STIMULUS, newStimulus);
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
        case SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS:
            return this.basicSetStimulus(null, msgs);
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
        case SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS:
            return this.getStimulus();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS:
            this.setStimulus((Stimulus) newValue);
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
        case SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS:
            this.setStimulus((Stimulus) null);
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
        case SpdmodelrewardPackage.UTILIZATION_REWARD__STIMULUS:
            return this.getStimulus() != null;
        }
        return super.eIsSet(featureID);
    }

} // UtilizationRewardImpl
