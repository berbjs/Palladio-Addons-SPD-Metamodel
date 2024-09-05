/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.spdmodelreward.SLOReward;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SLO Reward</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.SLORewardImpl#getFactor
 * <em>Factor</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.SLORewardImpl#getServiceLevelObjective
 * <em>Service Level Objective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SLORewardImpl extends BaseRewardImpl implements SLOReward {
    /**
     * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFactor()
     * @generated
     * @ordered
     */
    protected static final double FACTOR_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SLORewardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmodelrewardPackage.Literals.SLO_REWARD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getFactor() {
        return (Double) this.eDynamicGet(SpdmodelrewardPackage.SLO_REWARD__FACTOR,
                SpdmodelrewardPackage.Literals.SLO_REWARD__FACTOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFactor(final double newFactor) {
        this.eDynamicSet(SpdmodelrewardPackage.SLO_REWARD__FACTOR, SpdmodelrewardPackage.Literals.SLO_REWARD__FACTOR,
                newFactor);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceLevelObjective getServiceLevelObjective() {
        return (ServiceLevelObjective) this.eDynamicGet(SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE,
                SpdmodelrewardPackage.Literals.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceLevelObjective basicGetServiceLevelObjective() {
        return (ServiceLevelObjective) this.eDynamicGet(SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE,
                SpdmodelrewardPackage.Literals.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceLevelObjective(final ServiceLevelObjective newServiceLevelObjective) {
        this.eDynamicSet(SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE,
                SpdmodelrewardPackage.Literals.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE, newServiceLevelObjective);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdmodelrewardPackage.SLO_REWARD__FACTOR:
            return this.getFactor();
        case SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE:
            if (resolve) {
                return this.getServiceLevelObjective();
            }
            return this.basicGetServiceLevelObjective();
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
        case SpdmodelrewardPackage.SLO_REWARD__FACTOR:
            this.setFactor((Double) newValue);
            return;
        case SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE:
            this.setServiceLevelObjective((ServiceLevelObjective) newValue);
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
        case SpdmodelrewardPackage.SLO_REWARD__FACTOR:
            this.setFactor(FACTOR_EDEFAULT);
            return;
        case SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE:
            this.setServiceLevelObjective((ServiceLevelObjective) null);
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
        case SpdmodelrewardPackage.SLO_REWARD__FACTOR:
            return this.getFactor() != FACTOR_EDEFAULT;
        case SpdmodelrewardPackage.SLO_REWARD__SERVICE_LEVEL_OBJECTIVE:
            return this.basicGetServiceLevelObjective() != null;
        }
        return super.eIsSet(featureID);
    }

} // SLORewardImpl
