/**
 */
package org.palladiosimulator.spdmodelreward;

import org.palladiosimulator.spd.stimulus.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Utilization
 * Reward</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.UtilizationReward#getStimulus
 * <em>Stimulus</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getUtilizationReward()
 * @model
 * @generated
 */
public interface UtilizationReward extends BaseReward {
    /**
     * Returns the value of the '<em><b>Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Stimulus</em>' containment reference.
     * @see #setStimulus(Stimulus)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getUtilizationReward_Stimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spdmodelreward.UtilizationReward#getStimulus
     * <em>Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Stimulus</em>' containment reference.
     * @see #getStimulus()
     * @generated
     */
    void setStimulus(Stimulus value);

} // UtilizationReward
