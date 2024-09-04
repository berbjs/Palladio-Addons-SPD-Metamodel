/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.rewards.RewardsPackage;
import org.palladiosimulator.spd.models.rewards.exponentialSloReward;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exponential Slo Reward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl#getTargetResponseTime <em>Target Response Time</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl#getResponseTimeStimulus <em>Response Time Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl#getExponentialSteepness <em>Exponential Steepness</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl#getUtilizationStimulus <em>Utilization Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exponentialSloRewardImpl extends BaseRewardImpl implements exponentialSloReward {
	/**
	 * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getExponentialSteepness() <em>Exponential Steepness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponentialSteepness()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPONENTIAL_STEEPNESS_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected exponentialSloRewardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTargetResponseTime() {
		return (Double) eDynamicGet(RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetResponseTime(double newTargetResponseTime) {
		eDynamicSet(RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME, newTargetResponseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationResponseTime getResponseTimeStimulus() {
		return (OperationResponseTime) eDynamicGet(RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
				RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus) {
		eDynamicSet(RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExponentialSteepness() {
		return (Double) eDynamicGet(RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponentialSteepness(double newExponentialSteepness) {
		eDynamicSet(RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS, newExponentialSteepness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getUtilizationStimulus() {
		return (Stimulus) eDynamicGet(RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilizationStimulus(Stimulus newUtilizationStimulus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newUtilizationStimulus,
				RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilizationStimulus(Stimulus newUtilizationStimulus) {
		eDynamicSet(RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS,
				RewardsPackage.Literals.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS, newUtilizationStimulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
			return basicSetResponseTimeStimulus(null, msgs);
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
			return basicSetUtilizationStimulus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME:
			return getTargetResponseTime();
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus();
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness();
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
			return getUtilizationStimulus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME:
			setTargetResponseTime((Double) newValue);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) newValue);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness((Double) newValue);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME:
			setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) null);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness(EXPONENTIAL_STEEPNESS_EDEFAULT);
			return;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME:
			return getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus() != null;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness() != EXPONENTIAL_STEEPNESS_EDEFAULT;
		case RewardsPackage.EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS:
			return getUtilizationStimulus() != null;
		}
		return super.eIsSet(featureID);
	}

} //exponentialSloRewardImpl
