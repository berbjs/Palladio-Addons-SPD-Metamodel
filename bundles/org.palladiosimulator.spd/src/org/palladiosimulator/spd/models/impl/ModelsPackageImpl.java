/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;
import org.palladiosimulator.spd.constraints.impl.ConstraintsPackageImpl;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;
import org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl;
import org.palladiosimulator.spd.impl.SpdPackageImpl;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.models.RandomModel;
import org.palladiosimulator.spd.models.util.ModelsValidator;
import org.palladiosimulator.spd.stimulus.StimulusPackage;
import org.palladiosimulator.spd.targets.TargetsPackage;
import org.palladiosimulator.spd.targets.impl.TargetsPackageImpl;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelsPackageImpl extends EPackageImpl implements ModelsPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass baseModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass qThresholdsModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass randomModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass improvedQLearningModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass learningBasedModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType percentDoubleEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType positiveIntegerEDataType = null;

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
     * @see org.palladiosimulator.spd.models.ModelsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelsPackageImpl() {
        super(eNS_URI, ModelsFactory.eINSTANCE);
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
     * This method is used to initialize {@link ModelsPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelsPackage init() {
        if (isInited) {
            return (ModelsPackage) EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredModelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final ModelsPackageImpl theModelsPackage = registeredModelsPackage instanceof ModelsPackageImpl
                ? (ModelsPackageImpl) registeredModelsPackage
                : new ModelsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        MetricSpecPackage.eINSTANCE.eClass();
        MonitorRepositoryPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        ServicelevelObjectivePackage.eINSTANCE.eClass();
        SpdmodelrewardPackage.eINSTANCE.eClass();
        StimulusPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
        final SpdPackageImpl theSpdPackage = (SpdPackageImpl) (registeredPackage instanceof SpdPackageImpl
                ? registeredPackage
                : SpdPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
        final TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl) (registeredPackage instanceof TargetsPackageImpl
                ? registeredPackage
                : TargetsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
        final AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl) (registeredPackage instanceof AdjustmentsPackageImpl
                ? registeredPackage
                : AdjustmentsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
        final ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl) (registeredPackage instanceof ConstraintsPackageImpl
                ? registeredPackage
                : ConstraintsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
        final PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
                ? registeredPackage
                : PolicyPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
        final TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
                ? registeredPackage
                : TargetPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
        final TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
                ? registeredPackage
                : TriggersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
        final ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
                ? registeredPackage
                : ExpectationsPackage.eINSTANCE);

        // Create package meta-data objects
        theModelsPackage.createPackageContents();
        theSpdPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();

        // Initialize created meta-data
        theModelsPackage.initializePackageContents();
        theSpdPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put(theModelsPackage, new EValidator.Descriptor() {
            @Override
            public EValidator getEValidator() {
                return ModelsValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theModelsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelsPackage.eNS_URI, theModelsPackage);
        return theModelsPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBaseModel() {
        return this.baseModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseModel_Interval() {
        return (EAttribute) this.baseModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseModel_InitalIntervalDelay() {
        return (EAttribute) this.baseModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQThresholdsModel() {
        return this.qThresholdsModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQThresholdsModel_Input() {
        return (EReference) this.qThresholdsModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQThresholdsModel_UtilizationStimulus() {
        return (EReference) this.qThresholdsModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getQThresholdsModel_LearningRate() {
        return (EAttribute) this.qThresholdsModelEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getQThresholdsModel_Epsilon() {
        return (EAttribute) this.qThresholdsModelEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRandomModel() {
        return this.randomModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_MinAdjustment() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_MaxAdjustment() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_Probability() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getImprovedQLearningModel() {
        return this.improvedQLearningModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getImprovedQLearningModel_Input() {
        return (EReference) this.improvedQLearningModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getImprovedQLearningModel_Epsilon() {
        return (EAttribute) this.improvedQLearningModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getImprovedQLearningModel_LearningRate() {
        return (EAttribute) this.improvedQLearningModelEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getImprovedQLearningModel_ActionCount() {
        return (EAttribute) this.improvedQLearningModelEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLearningBasedModel() {
        return this.learningBasedModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLearningBasedModel_Reward() {
        return (EReference) this.learningBasedModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getPercentDouble() {
        return this.percentDoubleEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getPositiveInteger() {
        return this.positiveIntegerEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelsFactory getModelsFactory() {
        return (ModelsFactory) this.getEFactoryInstance();
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
        this.baseModelEClass = this.createEClass(BASE_MODEL);
        this.createEAttribute(this.baseModelEClass, BASE_MODEL__INTERVAL);
        this.createEAttribute(this.baseModelEClass, BASE_MODEL__INITAL_INTERVAL_DELAY);

        this.qThresholdsModelEClass = this.createEClass(QTHRESHOLDS_MODEL);
        this.createEReference(this.qThresholdsModelEClass, QTHRESHOLDS_MODEL__INPUT);
        this.createEReference(this.qThresholdsModelEClass, QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS);
        this.createEAttribute(this.qThresholdsModelEClass, QTHRESHOLDS_MODEL__LEARNING_RATE);
        this.createEAttribute(this.qThresholdsModelEClass, QTHRESHOLDS_MODEL__EPSILON);

        this.randomModelEClass = this.createEClass(RANDOM_MODEL);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__MIN_ADJUSTMENT);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__MAX_ADJUSTMENT);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__PROBABILITY);

        this.improvedQLearningModelEClass = this.createEClass(IMPROVED_QLEARNING_MODEL);
        this.createEReference(this.improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__INPUT);
        this.createEAttribute(this.improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__EPSILON);
        this.createEAttribute(this.improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__LEARNING_RATE);
        this.createEAttribute(this.improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__ACTION_COUNT);

        this.learningBasedModelEClass = this.createEClass(LEARNING_BASED_MODEL);
        this.createEReference(this.learningBasedModelEClass, LEARNING_BASED_MODEL__REWARD);

        // Create data types
        this.percentDoubleEDataType = this.createEDataType(PERCENT_DOUBLE);
        this.positiveIntegerEDataType = this.createEDataType(POSITIVE_INTEGER);
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
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);
        final StimulusPackage theStimulusPackage = (StimulusPackage) EPackage.Registry.INSTANCE
            .getEPackage(StimulusPackage.eNS_URI);
        final SpdmodelrewardPackage theSpdmodelrewardPackage = (SpdmodelrewardPackage) EPackage.Registry.INSTANCE
            .getEPackage(SpdmodelrewardPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.qThresholdsModelEClass.getESuperTypes()
            .add(this.getLearningBasedModel());
        this.randomModelEClass.getESuperTypes()
            .add(this.getBaseModel());
        this.improvedQLearningModelEClass.getESuperTypes()
            .add(this.getLearningBasedModel());
        this.learningBasedModelEClass.getESuperTypes()
            .add(this.getBaseModel());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.baseModelEClass, BaseModel.class, "BaseModel", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBaseModel_Interval(), this.ecorePackage.getEDouble(), "interval", "1.0", 0, 1,
                BaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getBaseModel_InitalIntervalDelay(), theEcorePackage.getEDouble(),
                "initalIntervalDelay", "0", 0, 1, BaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.qThresholdsModelEClass, QThresholdsModel.class, "QThresholdsModel", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getQThresholdsModel_Input(), theStimulusPackage.getStimulus(), null, "input", null, 0,
                1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getQThresholdsModel_UtilizationStimulus(), theStimulusPackage.getStimulus(), null,
                "utilizationStimulus", null, 0, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getQThresholdsModel_LearningRate(), this.getPercentDouble(), "learningRate", "0.1", 1,
                1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getQThresholdsModel_Epsilon(), this.getPercentDouble(), "epsilon", "0.05", 1, 1,
                QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.randomModelEClass, RandomModel.class, "RandomModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRandomModel_MinAdjustment(), theEcorePackage.getEInt(), "minAdjustment", null, 1, 1,
                RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getRandomModel_MaxAdjustment(), theEcorePackage.getEInt(), "maxAdjustment", null, 1, 1,
                RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getRandomModel_Probability(), theEcorePackage.getEDouble(), "probability", "1.0", 1, 1,
                RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.improvedQLearningModelEClass, ImprovedQLearningModel.class, "ImprovedQLearningModel",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getImprovedQLearningModel_Input(), theStimulusPackage.getStimulus(), null, "input",
                null, 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getImprovedQLearningModel_Epsilon(), this.getPercentDouble(), "epsilon", "0.05", 1, 1,
                ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getImprovedQLearningModel_LearningRate(), this.getPercentDouble(), "learningRate",
                "0.1", 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getImprovedQLearningModel_ActionCount(), this.getPositiveInteger(), "actionCount", "5",
                1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.learningBasedModelEClass, LearningBasedModel.class, "LearningBasedModel", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLearningBasedModel_Reward(), theSpdmodelrewardPackage.getModelReward(), null,
                "reward", null, 1, 1, LearningBasedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        this.initEDataType(this.percentDoubleEDataType, double.class, "PercentDouble", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.positiveIntegerEDataType, int.class, "PositiveInteger", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this.percentDoubleEDataType, source,
                new String[] { "maxInclusive", "1.0", "minInclusive", "0.0" });
        this.addAnnotation(this.positiveIntegerEDataType, source, new String[] { "minInclusive", "0" });
    }

} // ModelsPackageImpl
