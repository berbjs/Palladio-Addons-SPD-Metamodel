/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.spd.stimulus.AggregatedStimulus;
import org.palladiosimulator.spd.stimulus.CPUUtilization;
import org.palladiosimulator.spd.stimulus.HDDUtilization;
import org.palladiosimulator.spd.stimulus.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.stimulus.MemoryUtilization;
import org.palladiosimulator.spd.stimulus.NetworkUtilization;
import org.palladiosimulator.spd.stimulus.NumberOfElements;
import org.palladiosimulator.spd.stimulus.OperationResponseTime;
import org.palladiosimulator.spd.stimulus.QueueLength;
import org.palladiosimulator.spd.stimulus.ResourceUtilizationStimulus;
import org.palladiosimulator.spd.stimulus.SimulationStateStimulus;
import org.palladiosimulator.spd.stimulus.SimulationTime;
import org.palladiosimulator.spd.stimulus.SourceInterfaceStimulus;
import org.palladiosimulator.spd.stimulus.Stimulus;
import org.palladiosimulator.spd.stimulus.StimulusFactory;
import org.palladiosimulator.spd.stimulus.StimulusPackage;
import org.palladiosimulator.spd.stimulus.TargetGroupStateStimulus;
import org.palladiosimulator.spd.stimulus.TaskCount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StimulusPackageImpl extends EPackageImpl implements StimulusPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetGroupStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simulationStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceInterfaceStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationResponseTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numberOfElementsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass managedElementsStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cpuUtilizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memoryUtilizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simulationTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hddUtilizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceUtilizationStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskCountEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass queueLengthEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass networkUtilizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass aggregatedStimulusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum aggregationmethodEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum hddusagetypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum networkusagetypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StimulusPackageImpl() {
        super(eNS_URI, StimulusFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link StimulusPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StimulusPackage init() {
        if (isInited)
            return (StimulusPackage) EPackage.Registry.INSTANCE.getEPackage(StimulusPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredStimulusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        StimulusPackageImpl theStimulusPackage = registeredStimulusPackage instanceof StimulusPackageImpl
                ? (StimulusPackageImpl) registeredStimulusPackage
                : new StimulusPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theStimulusPackage.createPackageContents();

        // Initialize created meta-data
        theStimulusPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStimulusPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StimulusPackage.eNS_URI, theStimulusPackage);
        return theStimulusPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStimulus() {
        return stimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTargetGroupStateStimulus() {
        return targetGroupStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSimulationStateStimulus() {
        return simulationStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSourceInterfaceStimulus() {
        return sourceInterfaceStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOperationResponseTime() {
        return operationResponseTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOperationResponseTime_OperationSignature() {
        return (EReference) operationResponseTimeEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNumberOfElements() {
        return numberOfElementsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getManagedElementsStateStimulus() {
        return managedElementsStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getManagedElementsStateStimulus_AggregationOverElements() {
        return (EAttribute) managedElementsStateStimulusEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCPUUtilization() {
        return cpuUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMemoryUtilization() {
        return memoryUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSimulationTime() {
        return simulationTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHDDUtilization() {
        return hddUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHDDUtilization_UsageType() {
        return (EAttribute) hddUtilizationEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getResourceUtilizationStimulus() {
        return resourceUtilizationStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTaskCount() {
        return taskCountEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getQueueLength() {
        return queueLengthEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQueueLength_PassiveResource() {
        return (EReference) queueLengthEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNetworkUtilization() {
        return networkUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNetworkUtilization_UsageType() {
        return (EAttribute) networkUtilizationEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAggregatedStimulus() {
        return aggregatedStimulusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAggregatedStimulus_AggregationMethod() {
        return (EAttribute) aggregatedStimulusEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAggregatedStimulus_AggregationPeriod() {
        return (EAttribute) aggregatedStimulusEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAggregatedStimulus_AggregatedStimulus() {
        return (EReference) aggregatedStimulusEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAGGREGATIONMETHOD() {
        return aggregationmethodEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getHDDUSAGETYPE() {
        return hddusagetypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getNETWORKUSAGETYPE() {
        return networkusagetypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StimulusFactory getStimulusFactory() {
        return (StimulusFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        stimulusEClass = createEClass(STIMULUS);

        targetGroupStateStimulusEClass = createEClass(TARGET_GROUP_STATE_STIMULUS);

        simulationStateStimulusEClass = createEClass(SIMULATION_STATE_STIMULUS);

        sourceInterfaceStimulusEClass = createEClass(SOURCE_INTERFACE_STIMULUS);

        operationResponseTimeEClass = createEClass(OPERATION_RESPONSE_TIME);
        createEReference(operationResponseTimeEClass, OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE);

        numberOfElementsEClass = createEClass(NUMBER_OF_ELEMENTS);

        managedElementsStateStimulusEClass = createEClass(MANAGED_ELEMENTS_STATE_STIMULUS);
        createEAttribute(managedElementsStateStimulusEClass,
                MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS);

        cpuUtilizationEClass = createEClass(CPU_UTILIZATION);

        memoryUtilizationEClass = createEClass(MEMORY_UTILIZATION);

        simulationTimeEClass = createEClass(SIMULATION_TIME);

        hddUtilizationEClass = createEClass(HDD_UTILIZATION);
        createEAttribute(hddUtilizationEClass, HDD_UTILIZATION__USAGE_TYPE);

        resourceUtilizationStimulusEClass = createEClass(RESOURCE_UTILIZATION_STIMULUS);

        taskCountEClass = createEClass(TASK_COUNT);

        queueLengthEClass = createEClass(QUEUE_LENGTH);
        createEReference(queueLengthEClass, QUEUE_LENGTH__PASSIVE_RESOURCE);

        networkUtilizationEClass = createEClass(NETWORK_UTILIZATION);
        createEAttribute(networkUtilizationEClass, NETWORK_UTILIZATION__USAGE_TYPE);

        aggregatedStimulusEClass = createEClass(AGGREGATED_STIMULUS);
        createEAttribute(aggregatedStimulusEClass, AGGREGATED_STIMULUS__AGGREGATION_METHOD);
        createEAttribute(aggregatedStimulusEClass, AGGREGATED_STIMULUS__AGGREGATION_PERIOD);
        createEReference(aggregatedStimulusEClass, AGGREGATED_STIMULUS__AGGREGATED_STIMULUS);

        // Create enums
        aggregationmethodEEnum = createEEnum(AGGREGATIONMETHOD);
        hddusagetypeEEnum = createEEnum(HDDUSAGETYPE);
        networkusagetypeEEnum = createEEnum(NETWORKUSAGETYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
            .getEPackage(RepositoryPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        targetGroupStateStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        simulationStateStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        sourceInterfaceStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        operationResponseTimeEClass.getESuperTypes()
            .add(this.getSourceInterfaceStimulus());
        numberOfElementsEClass.getESuperTypes()
            .add(this.getTargetGroupStateStimulus());
        managedElementsStateStimulusEClass.getESuperTypes()
            .add(this.getTargetGroupStateStimulus());
        cpuUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        memoryUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        simulationTimeEClass.getESuperTypes()
            .add(this.getSimulationStateStimulus());
        hddUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        resourceUtilizationStimulusEClass.getESuperTypes()
            .add(this.getManagedElementsStateStimulus());
        taskCountEClass.getESuperTypes()
            .add(this.getManagedElementsStateStimulus());
        queueLengthEClass.getESuperTypes()
            .add(this.getSourceInterfaceStimulus());
        networkUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        aggregatedStimulusEClass.getESuperTypes()
            .add(this.getStimulus());

        // Initialize classes, features, and operations; add parameters
        initEClass(stimulusEClass, Stimulus.class, "Stimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(targetGroupStateStimulusEClass, TargetGroupStateStimulus.class, "TargetGroupStateStimulus",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simulationStateStimulusEClass, SimulationStateStimulus.class, "SimulationStateStimulus", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sourceInterfaceStimulusEClass, SourceInterfaceStimulus.class, "SourceInterfaceStimulus", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(operationResponseTimeEClass, OperationResponseTime.class, "OperationResponseTime", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationResponseTime_OperationSignature(), theRepositoryPackage.getOperationSignature(),
                null, "operationSignature", null, 0, 1, OperationResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numberOfElementsEClass, NumberOfElements.class, "NumberOfElements", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(managedElementsStateStimulusEClass, ManagedElementsStateStimulus.class,
                "ManagedElementsStateStimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getManagedElementsStateStimulus_AggregationOverElements(), this.getAGGREGATIONMETHOD(),
                "aggregationOverElements", null, 0, 1, ManagedElementsStateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cpuUtilizationEClass, CPUUtilization.class, "CPUUtilization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(memoryUtilizationEClass, MemoryUtilization.class, "MemoryUtilization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(simulationTimeEClass, SimulationTime.class, "SimulationTime", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(hddUtilizationEClass, HDDUtilization.class, "HDDUtilization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHDDUtilization_UsageType(), this.getHDDUSAGETYPE(), "usageType", null, 0, 1,
                HDDUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(resourceUtilizationStimulusEClass, ResourceUtilizationStimulus.class, "ResourceUtilizationStimulus",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(taskCountEClass, TaskCount.class, "TaskCount", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(queueLengthEClass, QueueLength.class, "QueueLength", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQueueLength_PassiveResource(), theRepositoryPackage.getPassiveResource(), null,
                "passiveResource", null, 0, 1, QueueLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(networkUtilizationEClass, NetworkUtilization.class, "NetworkUtilization", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNetworkUtilization_UsageType(), this.getNETWORKUSAGETYPE(), "usageType", null, 0, 1,
                NetworkUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(aggregatedStimulusEClass, AggregatedStimulus.class, "AggregatedStimulus", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAggregatedStimulus_AggregationMethod(), this.getAGGREGATIONMETHOD(), "aggregationMethod",
                null, 1, 1, AggregatedStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAggregatedStimulus_AggregationPeriod(), theEcorePackage.getEDouble(), "aggregationPeriod",
                null, 0, 1, AggregatedStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAggregatedStimulus_AggregatedStimulus(), this.getStimulus(), null, "aggregatedStimulus", null,
                1, 1, AggregatedStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.class,
                "AGGREGATIONMETHOD");
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.AVERAGE);
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.MAX);
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.MIN);
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.MEDIAN);
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.SUM);
        addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD.RATEOFCHANGE);

        initEEnum(hddusagetypeEEnum, org.palladiosimulator.spd.stimulus.HDDUSAGETYPE.class, "HDDUSAGETYPE");
        addEEnumLiteral(hddusagetypeEEnum, org.palladiosimulator.spd.stimulus.HDDUSAGETYPE.READ);
        addEEnumLiteral(hddusagetypeEEnum, org.palladiosimulator.spd.stimulus.HDDUSAGETYPE.WRITE);

        initEEnum(networkusagetypeEEnum, org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE.class, "NETWORKUSAGETYPE");
        addEEnumLiteral(networkusagetypeEEnum, org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE.SEND);
        addEEnumLiteral(networkusagetypeEEnum, org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE.RECEIVE);

        // Create resource
        createResource(eNS_URI);
    }

} //StimulusPackageImpl
