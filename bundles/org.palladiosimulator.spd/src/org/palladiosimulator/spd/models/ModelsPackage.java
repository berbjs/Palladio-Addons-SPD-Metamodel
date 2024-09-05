/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "models";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "models";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ModelsPackage eINSTANCE = org.palladiosimulator.spd.models.impl.ModelsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl
     * <em>Base Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
     * @generated
     */
    int BASE_MODEL = 0;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INTERVAL = 0;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INITAL_INTERVAL_DELAY = 1;

    /**
     * The number of structural features of the '<em>Base Model</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL_FEATURE_COUNT = 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based
     * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
     * @generated
     */
    int LEARNING_BASED_MODEL = 4;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Reward</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__REWARD = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Learning Based Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
     * <em>QThresholds Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
     * @generated
     */
    int QTHRESHOLDS_MODEL = 1;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Reward</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__REWARD = LEARNING_BASED_MODEL__REWARD;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INPUT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Utilization Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__LEARNING_RATE = LEARNING_BASED_MODEL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__EPSILON = LEARNING_BASED_MODEL_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>QThresholds Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl
     * <em>Random Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
     * @generated
     */
    int RANDOM_MODEL = 2;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Min Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__MIN_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__MAX_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__PROBABILITY = BASE_MODEL_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Random Model</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved
     * QLearning Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
     * @generated
     */
    int IMPROVED_QLEARNING_MODEL = 3;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Reward</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__REWARD = LEARNING_BASED_MODEL__REWARD;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__INPUT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__EPSILON = LEARNING_BASED_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__LEARNING_RATE = LEARNING_BASED_MODEL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Action Count</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL__ACTION_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Improved QLearning Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IMPROVED_QLEARNING_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '<em>Percent Double</em>' data type. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getPercentDouble()
     * @generated
     */
    int PERCENT_DOUBLE = 5;

    /**
     * The meta object id for the '<em>Positive Integer</em>' data type. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getPositiveInteger()
     * @generated
     */
    int POSITIVE_INTEGER = 6;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.BaseModel <em>Base
     * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Base Model</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel
     * @generated
     */
    EClass getBaseModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Interval</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel#getInterval()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_Interval();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay <em>Inital Interval
     * Delay</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Inital Interval Delay</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_InitalIntervalDelay();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.QThresholdsModel
     * <em>QThresholds Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>QThresholds Model</em>'.
     * @see org.palladiosimulator.spd.models.QThresholdsModel
     * @generated
     */
    EClass getQThresholdsModel();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput <em>Input</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Input</em>'.
     * @see org.palladiosimulator.spd.models.QThresholdsModel#getInput()
     * @see #getQThresholdsModel()
     * @generated
     */
    EReference getQThresholdsModel_Input();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus
     * <em>Utilization Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Utilization Stimulus</em>'.
     * @see org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus()
     * @see #getQThresholdsModel()
     * @generated
     */
    EReference getQThresholdsModel_UtilizationStimulus();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getLearningRate <em>Learning
     * Rate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Learning Rate</em>'.
     * @see org.palladiosimulator.spd.models.QThresholdsModel#getLearningRate()
     * @see #getQThresholdsModel()
     * @generated
     */
    EAttribute getQThresholdsModel_LearningRate();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon <em>Epsilon</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Epsilon</em>'.
     * @see org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon()
     * @see #getQThresholdsModel()
     * @generated
     */
    EAttribute getQThresholdsModel_Epsilon();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.RandomModel
     * <em>Random Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Random Model</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel
     * @generated
     */
    EClass getRandomModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment <em>Min
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Min Adjustment</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getMinAdjustment()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_MinAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment <em>Max
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Max Adjustment</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_MaxAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getProbability <em>Probability</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Probability</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getProbability()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_Probability();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel <em>Improved QLearning
     * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Improved QLearning Model</em>'.
     * @see org.palladiosimulator.spd.models.ImprovedQLearningModel
     * @generated
     */
    EClass getImprovedQLearningModel();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getInput <em>Input</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Input</em>'.
     * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getInput()
     * @see #getImprovedQLearningModel()
     * @generated
     */
    EReference getImprovedQLearningModel_Input();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getEpsilon
     * <em>Epsilon</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Epsilon</em>'.
     * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getEpsilon()
     * @see #getImprovedQLearningModel()
     * @generated
     */
    EAttribute getImprovedQLearningModel_Epsilon();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getLearningRate <em>Learning
     * Rate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Learning Rate</em>'.
     * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getLearningRate()
     * @see #getImprovedQLearningModel()
     * @generated
     */
    EAttribute getImprovedQLearningModel_LearningRate();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getActionCount <em>Action
     * Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Action Count</em>'.
     * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getActionCount()
     * @see #getImprovedQLearningModel()
     * @generated
     */
    EAttribute getImprovedQLearningModel_ActionCount();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.LearningBasedModel
     * <em>Learning Based Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Learning Based Model</em>'.
     * @see org.palladiosimulator.spd.models.LearningBasedModel
     * @generated
     */
    EClass getLearningBasedModel();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.models.LearningBasedModel#getReward <em>Reward</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Reward</em>'.
     * @see org.palladiosimulator.spd.models.LearningBasedModel#getReward()
     * @see #getLearningBasedModel()
     * @generated
     */
    EReference getLearningBasedModel_Reward();

    /**
     * Returns the meta object for data type '<em>Percent Double</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for data type '<em>Percent Double</em>'.
     * @model instanceClass="double" extendedMetaData="maxInclusive='1.0' minInclusive='0.0'"
     * @generated
     */
    EDataType getPercentDouble();

    /**
     * Returns the meta object for data type '<em>Positive Integer</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Positive Integer</em>'.
     * @model instanceClass="int" extendedMetaData="minInclusive='0'"
     * @generated
     */
    EDataType getPositiveInteger();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelsFactory getModelsFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
         * @generated
         */
        EClass BASE_MODEL = eINSTANCE.getBaseModel();

        /**
         * The meta object literal for the '<em><b>Interval</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INTERVAL = eINSTANCE.getBaseModel_Interval();

        /**
         * The meta object literal for the '<em><b>Inital Interval Delay</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INITAL_INTERVAL_DELAY = eINSTANCE.getBaseModel_InitalIntervalDelay();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl <em>QThresholds
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
         * @generated
         */
        EClass QTHRESHOLDS_MODEL = eINSTANCE.getQThresholdsModel();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference QTHRESHOLDS_MODEL__INPUT = eINSTANCE.getQThresholdsModel_Input();

        /**
         * The meta object literal for the '<em><b>Utilization Stimulus</b></em>' containment
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS = eINSTANCE.getQThresholdsModel_UtilizationStimulus();

        /**
         * The meta object literal for the '<em><b>Learning Rate</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute QTHRESHOLDS_MODEL__LEARNING_RATE = eINSTANCE.getQThresholdsModel_LearningRate();

        /**
         * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute QTHRESHOLDS_MODEL__EPSILON = eINSTANCE.getQThresholdsModel_Epsilon();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
         * @generated
         */
        EClass RANDOM_MODEL = eINSTANCE.getRandomModel();

        /**
         * The meta object literal for the '<em><b>Min Adjustment</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__MIN_ADJUSTMENT = eINSTANCE.getRandomModel_MinAdjustment();

        /**
         * The meta object literal for the '<em><b>Max Adjustment</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__MAX_ADJUSTMENT = eINSTANCE.getRandomModel_MaxAdjustment();

        /**
         * The meta object literal for the '<em><b>Probability</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__PROBABILITY = eINSTANCE.getRandomModel_Probability();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved
         * QLearning Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
         * @generated
         */
        EClass IMPROVED_QLEARNING_MODEL = eINSTANCE.getImprovedQLearningModel();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference IMPROVED_QLEARNING_MODEL__INPUT = eINSTANCE.getImprovedQLearningModel_Input();

        /**
         * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute IMPROVED_QLEARNING_MODEL__EPSILON = eINSTANCE.getImprovedQLearningModel_Epsilon();

        /**
         * The meta object literal for the '<em><b>Learning Rate</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute IMPROVED_QLEARNING_MODEL__LEARNING_RATE = eINSTANCE.getImprovedQLearningModel_LearningRate();

        /**
         * The meta object literal for the '<em><b>Action Count</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute IMPROVED_QLEARNING_MODEL__ACTION_COUNT = eINSTANCE.getImprovedQLearningModel_ActionCount();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
         * @generated
         */
        EClass LEARNING_BASED_MODEL = eINSTANCE.getLearningBasedModel();

        /**
         * The meta object literal for the '<em><b>Reward</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference LEARNING_BASED_MODEL__REWARD = eINSTANCE.getLearningBasedModel_Reward();

        /**
         * The meta object literal for the '<em>Percent Double</em>' data type. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getPercentDouble()
         * @generated
         */
        EDataType PERCENT_DOUBLE = eINSTANCE.getPercentDouble();

        /**
         * The meta object literal for the '<em>Positive Integer</em>' data type. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getPositiveInteger()
         * @generated
         */
        EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

    }

} // ModelsPackage
