/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.models.rewards.RewardsFactory
 * @model kind="package"
 * @generated
 */
public interface RewardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rewards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/Rewards/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rewards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RewardsPackage eINSTANCE = org.palladiosimulator.spd.models.rewards.impl.RewardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.rewards.impl.BaseRewardImpl <em>Base Reward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.rewards.impl.BaseRewardImpl
	 * @see org.palladiosimulator.spd.models.rewards.impl.RewardsPackageImpl#getBaseReward()
	 * @generated
	 */
	int BASE_REWARD = 0;

	/**
	 * The number of structural features of the '<em>Base Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REWARD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl <em>exponential Slo Reward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl
	 * @see org.palladiosimulator.spd.models.rewards.impl.RewardsPackageImpl#getexponentialSloReward()
	 * @generated
	 */
	int EXPONENTIAL_SLO_REWARD = 1;

	/**
	 * The feature id for the '<em><b>Target Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME = BASE_REWARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS = BASE_REWARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exponential Steepness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS = BASE_REWARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Utilization Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS = BASE_REWARD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>exponential Slo Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_SLO_REWARD_FEATURE_COUNT = BASE_REWARD_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.rewards.BaseReward <em>Base Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Reward</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.BaseReward
	 * @generated
	 */
	EClass getBaseReward();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward <em>exponential Slo Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exponential Slo Reward</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.exponentialSloReward
	 * @generated
	 */
	EClass getexponentialSloReward();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getTargetResponseTime <em>Target Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Response Time</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.exponentialSloReward#getTargetResponseTime()
	 * @see #getexponentialSloReward()
	 * @generated
	 */
	EAttribute getexponentialSloReward_TargetResponseTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getResponseTimeStimulus <em>Response Time Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Time Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.exponentialSloReward#getResponseTimeStimulus()
	 * @see #getexponentialSloReward()
	 * @generated
	 */
	EReference getexponentialSloReward_ResponseTimeStimulus();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getExponentialSteepness <em>Exponential Steepness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponential Steepness</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.exponentialSloReward#getExponentialSteepness()
	 * @see #getexponentialSloReward()
	 * @generated
	 */
	EAttribute getexponentialSloReward_ExponentialSteepness();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.spd.models.rewards.exponentialSloReward#getUtilizationStimulus <em>Utilization Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilization Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.rewards.exponentialSloReward#getUtilizationStimulus()
	 * @see #getexponentialSloReward()
	 * @generated
	 */
	EReference getexponentialSloReward_UtilizationStimulus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RewardsFactory getRewardsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.rewards.impl.BaseRewardImpl <em>Base Reward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.rewards.impl.BaseRewardImpl
		 * @see org.palladiosimulator.spd.models.rewards.impl.RewardsPackageImpl#getBaseReward()
		 * @generated
		 */
		EClass BASE_REWARD = eINSTANCE.getBaseReward();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl <em>exponential Slo Reward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.rewards.impl.exponentialSloRewardImpl
		 * @see org.palladiosimulator.spd.models.rewards.impl.RewardsPackageImpl#getexponentialSloReward()
		 * @generated
		 */
		EClass EXPONENTIAL_SLO_REWARD = eINSTANCE.getexponentialSloReward();

		/**
		 * The meta object literal for the '<em><b>Target Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_SLO_REWARD__TARGET_RESPONSE_TIME = eINSTANCE
				.getexponentialSloReward_TargetResponseTime();

		/**
		 * The meta object literal for the '<em><b>Response Time Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_SLO_REWARD__RESPONSE_TIME_STIMULUS = eINSTANCE
				.getexponentialSloReward_ResponseTimeStimulus();

		/**
		 * The meta object literal for the '<em><b>Exponential Steepness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_SLO_REWARD__EXPONENTIAL_STEEPNESS = eINSTANCE
				.getexponentialSloReward_ExponentialSteepness();

		/**
		 * The meta object literal for the '<em><b>Utilization Stimulus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_SLO_REWARD__UTILIZATION_STIMULUS = eINSTANCE
				.getexponentialSloReward_UtilizationStimulus();

	}

} //RewardsPackage
