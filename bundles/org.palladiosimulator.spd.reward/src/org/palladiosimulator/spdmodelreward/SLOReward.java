/**
 */
package org.palladiosimulator.spdmodelreward;

import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SLO Reward</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.SLOReward#getFactor <em>Factor</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.SLOReward#getServiceLevelObjective <em>Service
 * Level Objective</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getSLOReward()
 * @model
 * @generated
 */
public interface SLOReward extends BaseReward {
    /**
     * Returns the value of the '<em><b>Factor</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Factor</em>' attribute.
     * @see #setFactor(double)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getSLOReward_Factor()
     * @model
     * @generated
     */
    double getFactor();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spdmodelreward.SLOReward#getFactor
     * <em>Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Factor</em>' attribute.
     * @see #getFactor()
     * @generated
     */
    void setFactor(double value);

    /**
     * Returns the value of the '<em><b>Service Level Objective</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Level Objective</em>' reference.
     * @see #setServiceLevelObjective(ServiceLevelObjective)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getSLOReward_ServiceLevelObjective()
     * @model
     * @generated
     */
    ServiceLevelObjective getServiceLevelObjective();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spdmodelreward.SLOReward#getServiceLevelObjective <em>Service
     * Level Objective</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Level Objective</em>' reference.
     * @see #getServiceLevelObjective()
     * @generated
     */
    void setServiceLevelObjective(ServiceLevelObjective value);

} // SLOReward
