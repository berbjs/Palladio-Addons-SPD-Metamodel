/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards;

import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exponential Slo Reward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Reward should be based on the reward discussed by Horovitz, Arian in "Efficient Cloud Auto-Scaling with SLA objective  using Q-Learning" (2018).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getTargetResponseTime <em>Target Response Time</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getResponseTimeStimulus <em>Response Time Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getExponentialSteepness <em>Exponential Steepness</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getUtilizationStimulus <em>Utilization Stimulus</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage#getexponentialSloReward()
 * @model
 * @generated
 */
public interface exponentialSloReward extends BaseReward {
	/**
	 * Returns the value of the '<em><b>Target Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Response Time</em>' attribute.
	 * @see #setTargetResponseTime(double)
	 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage#getexponentialSloReward_TargetResponseTime()
	 * @model
	 * @generated
	 */
	double getTargetResponseTime();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getTargetResponseTime <em>Target Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Response Time</em>' attribute.
	 * @see #getTargetResponseTime()
	 * @generated
	 */
	void setTargetResponseTime(double value);

	/**
	 * Returns the value of the '<em><b>Response Time Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time Stimulus</em>' containment reference.
	 * @see #setResponseTimeStimulus(OperationResponseTime)
	 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage#getexponentialSloReward_ResponseTimeStimulus()
	 * @model containment="true"
	 * @generated
	 */
	OperationResponseTime getResponseTimeStimulus();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getResponseTimeStimulus <em>Response Time Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time Stimulus</em>' containment reference.
	 * @see #getResponseTimeStimulus()
	 * @generated
	 */
	void setResponseTimeStimulus(OperationResponseTime value);

	/**
	 * Returns the value of the '<em><b>Exponential Steepness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponential Steepness</em>' attribute.
	 * @see #setExponentialSteepness(double)
	 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage#getexponentialSloReward_ExponentialSteepness()
	 * @model
	 * @generated
	 */
	double getExponentialSteepness();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getExponentialSteepness <em>Exponential Steepness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponential Steepness</em>' attribute.
	 * @see #getExponentialSteepness()
	 * @generated
	 */
	void setExponentialSteepness(double value);

	/**
	 * Returns the value of the '<em><b>Utilization Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization Stimulus</em>' reference.
	 * @see #setUtilizationStimulus(Stimulus)
	 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage#getexponentialSloReward_UtilizationStimulus()
	 * @model
	 * @generated
	 */
	Stimulus getUtilizationStimulus();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getUtilizationStimulus <em>Utilization Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization Stimulus</em>' reference.
	 * @see #getUtilizationStimulus()
	 * @generated
	 */
	void setUtilizationStimulus(Stimulus value);

} // exponentialSloReward