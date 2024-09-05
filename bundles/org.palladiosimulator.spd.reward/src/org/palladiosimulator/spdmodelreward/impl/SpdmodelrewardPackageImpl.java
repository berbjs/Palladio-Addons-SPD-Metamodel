/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.spd.stimulus.StimulusPackage;
import org.palladiosimulator.spdmodelreward.BaseReward;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.RewardAggregationMethod;
import org.palladiosimulator.spdmodelreward.SLOReward;
import org.palladiosimulator.spdmodelreward.SPDModelRewardRepository;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardFactory;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;
import org.palladiosimulator.spdmodelreward.StaticReward;
import org.palladiosimulator.spdmodelreward.UtilizationReward;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdmodelrewardPackageImpl extends EPackageImpl implements SpdmodelrewardPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass baseRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass staticRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass sloRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass utilizationRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass functionRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass spdModelRewardRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass modelRewardEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum rewardAggregationMethodEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SpdmodelrewardPackageImpl() {
        super(eNS_URI, SpdmodelrewardFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link SpdmodelrewardPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SpdmodelrewardPackage init() {
        if (isInited) {
            return (SpdmodelrewardPackage) EPackage.Registry.INSTANCE.getEPackage(SpdmodelrewardPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredSpdmodelrewardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final SpdmodelrewardPackageImpl theSpdmodelrewardPackage = registeredSpdmodelrewardPackage instanceof SpdmodelrewardPackageImpl
                ? (SpdmodelrewardPackageImpl) registeredSpdmodelrewardPackage
                : new SpdmodelrewardPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        StimulusPackage.eINSTANCE.eClass();
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        MetricSpecPackage.eINSTANCE.eClass();
        MonitorRepositoryPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        ServicelevelObjectivePackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSpdmodelrewardPackage.createPackageContents();

        // Initialize created meta-data
        theSpdmodelrewardPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSpdmodelrewardPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SpdmodelrewardPackage.eNS_URI, theSpdmodelrewardPackage);
        return theSpdmodelrewardPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBaseReward() {
        return this.baseRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStaticReward() {
        return this.staticRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getStaticReward_Value() {
        return (EAttribute) this.staticRewardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSLOReward() {
        return this.sloRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSLOReward_Factor() {
        return (EAttribute) this.sloRewardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSLOReward_ServiceLevelObjective() {
        return (EReference) this.sloRewardEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getUtilizationReward() {
        return this.utilizationRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getUtilizationReward_Stimulus() {
        return (EReference) this.utilizationRewardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFunctionReward() {
        return this.functionRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFunctionReward_Rewards() {
        return (EReference) this.functionRewardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFunctionReward_Function() {
        return (EAttribute) this.functionRewardEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSPDModelRewardRepository() {
        return this.spdModelRewardRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSPDModelRewardRepository_ModelReward() {
        return (EReference) this.spdModelRewardRepositoryEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getModelReward() {
        return this.modelRewardEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getModelReward_Reward() {
        return (EReference) this.modelRewardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getModelReward_Name() {
        return (EAttribute) this.modelRewardEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getRewardAggregationMethod() {
        return this.rewardAggregationMethodEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SpdmodelrewardFactory getSpdmodelrewardFactory() {
        return (SpdmodelrewardFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.baseRewardEClass = this.createEClass(BASE_REWARD);

        this.staticRewardEClass = this.createEClass(STATIC_REWARD);
        this.createEAttribute(this.staticRewardEClass, STATIC_REWARD__VALUE);

        this.sloRewardEClass = this.createEClass(SLO_REWARD);
        this.createEAttribute(this.sloRewardEClass, SLO_REWARD__FACTOR);
        this.createEReference(this.sloRewardEClass, SLO_REWARD__SERVICE_LEVEL_OBJECTIVE);

        this.utilizationRewardEClass = this.createEClass(UTILIZATION_REWARD);
        this.createEReference(this.utilizationRewardEClass, UTILIZATION_REWARD__STIMULUS);

        this.functionRewardEClass = this.createEClass(FUNCTION_REWARD);
        this.createEReference(this.functionRewardEClass, FUNCTION_REWARD__REWARDS);
        this.createEAttribute(this.functionRewardEClass, FUNCTION_REWARD__FUNCTION);

        this.spdModelRewardRepositoryEClass = this.createEClass(SPD_MODEL_REWARD_REPOSITORY);
        this.createEReference(this.spdModelRewardRepositoryEClass, SPD_MODEL_REWARD_REPOSITORY__MODEL_REWARD);

        this.modelRewardEClass = this.createEClass(MODEL_REWARD);
        this.createEReference(this.modelRewardEClass, MODEL_REWARD__REWARD);
        this.createEAttribute(this.modelRewardEClass, MODEL_REWARD__NAME);

        // Create enums
        this.rewardAggregationMethodEEnum = this.createEEnum(REWARD_AGGREGATION_METHOD);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final ServicelevelObjectivePackage theServicelevelObjectivePackage = (ServicelevelObjectivePackage) EPackage.Registry.INSTANCE
            .getEPackage(ServicelevelObjectivePackage.eNS_URI);
        final StimulusPackage theStimulusPackage = (StimulusPackage) EPackage.Registry.INSTANCE
            .getEPackage(StimulusPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.staticRewardEClass.getESuperTypes()
            .add(this.getBaseReward());
        this.sloRewardEClass.getESuperTypes()
            .add(this.getBaseReward());
        this.utilizationRewardEClass.getESuperTypes()
            .add(this.getBaseReward());
        this.functionRewardEClass.getESuperTypes()
            .add(this.getBaseReward());

        // Initialize classes, features, and operations; add parameters
        this.initEClass(this.baseRewardEClass, BaseReward.class, "BaseReward", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.staticRewardEClass, StaticReward.class, "StaticReward", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStaticReward_Value(), this.ecorePackage.getEDouble(), "value", null, 0, 1,
                StaticReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.sloRewardEClass, SLOReward.class, "SLOReward", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSLOReward_Factor(), this.ecorePackage.getEDouble(), "factor", null, 0, 1,
                SLOReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSLOReward_ServiceLevelObjective(),
                theServicelevelObjectivePackage.getServiceLevelObjective(), null, "serviceLevelObjective", null, 0, 1,
                SLOReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.utilizationRewardEClass, UtilizationReward.class, "UtilizationReward", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUtilizationReward_Stimulus(), theStimulusPackage.getStimulus(), null, "stimulus",
                null, 1, 1, UtilizationReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.functionRewardEClass, FunctionReward.class, "FunctionReward", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFunctionReward_Rewards(), this.getBaseReward(), null, "rewards", null, 1, -1,
                FunctionReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFunctionReward_Function(), this.getRewardAggregationMethod(), "function", null, 0,
                1, FunctionReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.spdModelRewardRepositoryEClass, SPDModelRewardRepository.class, "SPDModelRewardRepository",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSPDModelRewardRepository_ModelReward(), this.getModelReward(), null, "modelReward",
                null, 0, -1, SPDModelRewardRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.modelRewardEClass, ModelReward.class, "ModelReward", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getModelReward_Reward(), this.getBaseReward(), null, "reward", null, 1, 1,
                ModelReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getModelReward_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
                ModelReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.rewardAggregationMethodEEnum, RewardAggregationMethod.class, "RewardAggregationMethod");
        this.addEEnumLiteral(this.rewardAggregationMethodEEnum, RewardAggregationMethod.ADDITION);
        this.addEEnumLiteral(this.rewardAggregationMethodEEnum, RewardAggregationMethod.SUBTRACTION);
        this.addEEnumLiteral(this.rewardAggregationMethodEEnum, RewardAggregationMethod.MULTIPLICATION);
        this.addEEnumLiteral(this.rewardAggregationMethodEEnum, RewardAggregationMethod.DIVISION);
        this.addEEnumLiteral(this.rewardAggregationMethodEEnum, RewardAggregationMethod.EXPONENTIAL);

        // Create resource
        this.createResource(eNS_URI);
    }

} // SpdmodelrewardPackageImpl
