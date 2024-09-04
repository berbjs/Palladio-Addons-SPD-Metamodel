/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

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
 * @see org.palladiosimulator.spd.models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "models";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelsPackage eINSTANCE = org.palladiosimulator.spd.models.impl.ModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
	 * @generated
	 */
	int BASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__INITAL_INTERVAL_DELAY = 1;

	/**
	 * The number of structural features of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
	 * @generated
	 */
	int LEARNING_BASED_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__REWARD = BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__INPUTS = BASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Learning Based Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl <em>QThresholds Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
	 * @generated
	 */
	int QTHRESHOLDS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__REWARD = LEARNING_BASED_MODEL__REWARD;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INPUTS = LEARNING_BASED_MODEL__INPUTS;

	/**
	 * The number of structural features of the '<em>QThresholds Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
	 * @generated
	 */
	int RANDOM_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Min Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__MIN_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__MAX_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__PROBABILITY = BASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Random Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved QLearning Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
	 * @generated
	 */
	int IMPROVED_QLEARNING_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__REWARD = LEARNING_BASED_MODEL__REWARD;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INPUTS = LEARNING_BASED_MODEL__INPUTS;

	/**
	 * The number of structural features of the '<em>Improved QLearning Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.BaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Model</em>'.
	 * @see org.palladiosimulator.spd.models.BaseModel
	 * @generated
	 */
	EClass getBaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.palladiosimulator.spd.models.BaseModel#getInterval()
	 * @see #getBaseModel()
	 * @generated
	 */
	EAttribute getBaseModel_Interval();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay <em>Inital Interval Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inital Interval Delay</em>'.
	 * @see org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay()
	 * @see #getBaseModel()
	 * @generated
	 */
	EAttribute getBaseModel_InitalIntervalDelay();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.QThresholdsModel <em>QThresholds Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QThresholds Model</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel
	 * @generated
	 */
	EClass getQThresholdsModel();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.RandomModel <em>Random Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Model</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel
	 * @generated
	 */
	EClass getRandomModel();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment <em>Min Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Adjustment</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getMinAdjustment()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_MinAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment <em>Max Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Adjustment</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_MaxAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getProbability()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_Probability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel <em>Improved QLearning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Improved QLearning Model</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel
	 * @generated
	 */
	EClass getImprovedQLearningModel();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.LearningBasedModel <em>Learning Based Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Based Model</em>'.
	 * @see org.palladiosimulator.spd.models.LearningBasedModel
	 * @generated
	 */
	EClass getLearningBasedModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.LearningBasedModel#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reward</em>'.
	 * @see org.palladiosimulator.spd.models.LearningBasedModel#getReward()
	 * @see #getLearningBasedModel()
	 * @generated
	 */
	EReference getLearningBasedModel_Reward();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.spd.models.LearningBasedModel#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.palladiosimulator.spd.models.LearningBasedModel#getInputs()
	 * @see #getLearningBasedModel()
	 * @generated
	 */
	EReference getLearningBasedModel_Inputs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelsFactory getModelsFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
		 * @generated
		 */
		EClass BASE_MODEL = eINSTANCE.getBaseModel();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_MODEL__INTERVAL = eINSTANCE.getBaseModel_Interval();

		/**
		 * The meta object literal for the '<em><b>Inital Interval Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_MODEL__INITAL_INTERVAL_DELAY = eINSTANCE.getBaseModel_InitalIntervalDelay();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl <em>QThresholds Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
		 * @generated
		 */
		EClass QTHRESHOLDS_MODEL = eINSTANCE.getQThresholdsModel();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
		 * @generated
		 */
		EClass RANDOM_MODEL = eINSTANCE.getRandomModel();

		/**
		 * The meta object literal for the '<em><b>Min Adjustment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_MODEL__MIN_ADJUSTMENT = eINSTANCE.getRandomModel_MinAdjustment();

		/**
		 * The meta object literal for the '<em><b>Max Adjustment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_MODEL__MAX_ADJUSTMENT = eINSTANCE.getRandomModel_MaxAdjustment();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_MODEL__PROBABILITY = eINSTANCE.getRandomModel_Probability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved QLearning Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
		 * @generated
		 */
		EClass IMPROVED_QLEARNING_MODEL = eINSTANCE.getImprovedQLearningModel();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
		 * @generated
		 */
		EClass LEARNING_BASED_MODEL = eINSTANCE.getLearningBasedModel();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_BASED_MODEL__REWARD = eINSTANCE.getLearningBasedModel_Reward();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_BASED_MODEL__INPUTS = eINSTANCE.getLearningBasedModel_Inputs();

	}

} //ModelsPackage