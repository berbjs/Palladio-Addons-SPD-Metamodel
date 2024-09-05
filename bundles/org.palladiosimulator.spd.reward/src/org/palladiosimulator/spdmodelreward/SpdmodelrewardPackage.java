/**
 */
package org.palladiosimulator.spdmodelreward;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardFactory
 * @model kind="package"
 * @generated
 */
public interface SpdmodelrewardPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "spdmodelreward";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/PCM/SPDModelReward/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "spdmodelreward";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SpdmodelrewardPackage eINSTANCE = org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spdmodelreward.impl.BaseRewardImpl
     * <em>Base Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.BaseRewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getBaseReward()
     * @generated
     */
    int BASE_REWARD = 0;

    /**
     * The number of structural features of the '<em>Base Reward</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_REWARD_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Base Reward</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_REWARD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spdmodelreward.impl.StaticRewardImpl
     * <em>Static Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.StaticRewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getStaticReward()
     * @generated
     */
    int STATIC_REWARD = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STATIC_REWARD__VALUE = BASE_REWARD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Static Reward</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STATIC_REWARD_FEATURE_COUNT = BASE_REWARD_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Static Reward</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STATIC_REWARD_OPERATION_COUNT = BASE_REWARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spdmodelreward.impl.SLORewardImpl
     * <em>SLO Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.SLORewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getSLOReward()
     * @generated
     */
    int SLO_REWARD = 2;

    /**
     * The feature id for the '<em><b>Factor</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SLO_REWARD__FACTOR = BASE_REWARD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Service Level Objective</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SLO_REWARD__SERVICE_LEVEL_OBJECTIVE = BASE_REWARD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SLO Reward</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SLO_REWARD_FEATURE_COUNT = BASE_REWARD_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>SLO Reward</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SLO_REWARD_OPERATION_COUNT = BASE_REWARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spdmodelreward.impl.UtilizationRewardImpl <em>Utilization
     * Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.UtilizationRewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getUtilizationReward()
     * @generated
     */
    int UTILIZATION_REWARD = 3;

    /**
     * The feature id for the '<em><b>Stimulus</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int UTILIZATION_REWARD__STIMULUS = BASE_REWARD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Utilization Reward</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int UTILIZATION_REWARD_FEATURE_COUNT = BASE_REWARD_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Utilization Reward</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int UTILIZATION_REWARD_OPERATION_COUNT = BASE_REWARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl <em>Function
     * Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getFunctionReward()
     * @generated
     */
    int FUNCTION_REWARD = 4;

    /**
     * The feature id for the '<em><b>Rewards</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUNCTION_REWARD__REWARDS = BASE_REWARD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUNCTION_REWARD__FUNCTION = BASE_REWARD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function Reward</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUNCTION_REWARD_FEATURE_COUNT = BASE_REWARD_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Function Reward</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUNCTION_REWARD_OPERATION_COUNT = BASE_REWARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spdmodelreward.impl.SPDModelRewardRepositoryImpl <em>SPD Model
     * Reward Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.SPDModelRewardRepositoryImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getSPDModelRewardRepository()
     * @generated
     */
    int SPD_MODEL_REWARD_REPOSITORY = 5;

    /**
     * The feature id for the '<em><b>Model Reward</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD = 0;

    /**
     * The number of structural features of the '<em>SPD Model Reward Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD_MODEL_REWARD_REPOSITORY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>SPD Model Reward Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD_MODEL_REWARD_REPOSITORY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl
     * <em>Model Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getModelReward()
     * @generated
     */
    int MODEL_REWARD = 6;

    /**
     * The feature id for the '<em><b>Reward</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_REWARD__REWARD = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_REWARD__NAME = 1;

    /**
     * The number of structural features of the '<em>Model Reward</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_REWARD_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Model Reward</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_REWARD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spdmodelreward.RewardAggregationMethod <em>Reward Aggregation
     * Method</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spdmodelreward.RewardAggregationMethod
     * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getRewardAggregationMethod()
     * @generated
     */
    int REWARD_AGGREGATION_METHOD = 7;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spdmodelreward.BaseReward
     * <em>Base Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Base Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.BaseReward
     * @generated
     */
    EClass getBaseReward();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spdmodelreward.StaticReward
     * <em>Static Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Static Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.StaticReward
     * @generated
     */
    EClass getStaticReward();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spdmodelreward.StaticReward#getValue <em>Value</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.spdmodelreward.StaticReward#getValue()
     * @see #getStaticReward()
     * @generated
     */
    EAttribute getStaticReward_Value();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spdmodelreward.SLOReward
     * <em>SLO Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>SLO Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.SLOReward
     * @generated
     */
    EClass getSLOReward();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spdmodelreward.SLOReward#getFactor <em>Factor</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Factor</em>'.
     * @see org.palladiosimulator.spdmodelreward.SLOReward#getFactor()
     * @see #getSLOReward()
     * @generated
     */
    EAttribute getSLOReward_Factor();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spdmodelreward.SLOReward#getServiceLevelObjective <em>Service
     * Level Objective</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Service Level Objective</em>'.
     * @see org.palladiosimulator.spdmodelreward.SLOReward#getServiceLevelObjective()
     * @see #getSLOReward()
     * @generated
     */
    EReference getSLOReward_ServiceLevelObjective();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spdmodelreward.UtilizationReward <em>Utilization Reward</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Utilization Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.UtilizationReward
     * @generated
     */
    EClass getUtilizationReward();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spdmodelreward.UtilizationReward#getStimulus
     * <em>Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Stimulus</em>'.
     * @see org.palladiosimulator.spdmodelreward.UtilizationReward#getStimulus()
     * @see #getUtilizationReward()
     * @generated
     */
    EReference getUtilizationReward_Stimulus();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spdmodelreward.FunctionReward
     * <em>Function Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Function Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.FunctionReward
     * @generated
     */
    EClass getFunctionReward();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spdmodelreward.FunctionReward#getRewards <em>Rewards</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Rewards</em>'.
     * @see org.palladiosimulator.spdmodelreward.FunctionReward#getRewards()
     * @see #getFunctionReward()
     * @generated
     */
    EReference getFunctionReward_Rewards();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spdmodelreward.FunctionReward#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Function</em>'.
     * @see org.palladiosimulator.spdmodelreward.FunctionReward#getFunction()
     * @see #getFunctionReward()
     * @generated
     */
    EAttribute getFunctionReward_Function();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spdmodelreward.SPDModelRewardRepository <em>SPD Model Reward
     * Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>SPD Model Reward Repository</em>'.
     * @see org.palladiosimulator.spdmodelreward.SPDModelRewardRepository
     * @generated
     */
    EClass getSPDModelRewardRepository();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spdmodelreward.SPDModelRewardRepository#getModelReward
     * <em>Model Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Model Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.SPDModelRewardRepository#getModelReward()
     * @see #getSPDModelRewardRepository()
     * @generated
     */
    EReference getSPDModelRewardRepository_ModelReward();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spdmodelreward.ModelReward
     * <em>Model Reward</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Model Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.ModelReward
     * @generated
     */
    EClass getModelReward();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spdmodelreward.ModelReward#getReward <em>Reward</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Reward</em>'.
     * @see org.palladiosimulator.spdmodelreward.ModelReward#getReward()
     * @see #getModelReward()
     * @generated
     */
    EReference getModelReward_Reward();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spdmodelreward.ModelReward#getName <em>Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.spdmodelreward.ModelReward#getName()
     * @see #getModelReward()
     * @generated
     */
    EAttribute getModelReward_Name();

    /**
     * Returns the meta object for enum
     * '{@link org.palladiosimulator.spdmodelreward.RewardAggregationMethod <em>Reward Aggregation
     * Method</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Reward Aggregation Method</em>'.
     * @see org.palladiosimulator.spdmodelreward.RewardAggregationMethod
     * @generated
     */
    EEnum getRewardAggregationMethod();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SpdmodelrewardFactory getSpdmodelrewardFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
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
         * '{@link org.palladiosimulator.spdmodelreward.impl.BaseRewardImpl <em>Base Reward</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.BaseRewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getBaseReward()
         * @generated
         */
        EClass BASE_REWARD = eINSTANCE.getBaseReward();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.StaticRewardImpl <em>Static
         * Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.StaticRewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getStaticReward()
         * @generated
         */
        EClass STATIC_REWARD = eINSTANCE.getStaticReward();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute STATIC_REWARD__VALUE = eINSTANCE.getStaticReward_Value();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.SLORewardImpl <em>SLO Reward</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.SLORewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getSLOReward()
         * @generated
         */
        EClass SLO_REWARD = eINSTANCE.getSLOReward();

        /**
         * The meta object literal for the '<em><b>Factor</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SLO_REWARD__FACTOR = eINSTANCE.getSLOReward_Factor();

        /**
         * The meta object literal for the '<em><b>Service Level Objective</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SLO_REWARD__SERVICE_LEVEL_OBJECTIVE = eINSTANCE.getSLOReward_ServiceLevelObjective();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.UtilizationRewardImpl <em>Utilization
         * Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.UtilizationRewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getUtilizationReward()
         * @generated
         */
        EClass UTILIZATION_REWARD = eINSTANCE.getUtilizationReward();

        /**
         * The meta object literal for the '<em><b>Stimulus</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference UTILIZATION_REWARD__STIMULUS = eINSTANCE.getUtilizationReward_Stimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl <em>Function
         * Reward</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.FunctionRewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getFunctionReward()
         * @generated
         */
        EClass FUNCTION_REWARD = eINSTANCE.getFunctionReward();

        /**
         * The meta object literal for the '<em><b>Rewards</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference FUNCTION_REWARD__REWARDS = eINSTANCE.getFunctionReward_Rewards();

        /**
         * The meta object literal for the '<em><b>Function</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUNCTION_REWARD__FUNCTION = eINSTANCE.getFunctionReward_Function();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.SPDModelRewardRepositoryImpl <em>SPD
         * Model Reward Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.SPDModelRewardRepositoryImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getSPDModelRewardRepository()
         * @generated
         */
        EClass SPD_MODEL_REWARD_REPOSITORY = eINSTANCE.getSPDModelRewardRepository();

        /**
         * The meta object literal for the '<em><b>Model Reward</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD = eINSTANCE.getSPDModelRewardRepository_ModelReward();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl <em>Model Reward</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getModelReward()
         * @generated
         */
        EClass MODEL_REWARD = eINSTANCE.getModelReward();

        /**
         * The meta object literal for the '<em><b>Reward</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference MODEL_REWARD__REWARD = eINSTANCE.getModelReward_Reward();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MODEL_REWARD__NAME = eINSTANCE.getModelReward_Name();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spdmodelreward.RewardAggregationMethod <em>Reward
         * Aggregation Method</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spdmodelreward.RewardAggregationMethod
         * @see org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardPackageImpl#getRewardAggregationMethod()
         * @generated
         */
        EEnum REWARD_AGGREGATION_METHOD = eINSTANCE.getRewardAggregationMethod();

    }

} // SpdmodelrewardPackage
