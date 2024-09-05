/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.spd.stimulus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StimulusFactoryImpl extends EFactoryImpl implements StimulusFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StimulusFactory init() {
        try {
            StimulusFactory theStimulusFactory = (StimulusFactory) EPackage.Registry.INSTANCE
                .getEFactory(StimulusPackage.eNS_URI);
            if (theStimulusFactory != null) {
                return theStimulusFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StimulusFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StimulusFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case StimulusPackage.OPERATION_RESPONSE_TIME:
            return createOperationResponseTime();
        case StimulusPackage.NUMBER_OF_ELEMENTS:
            return createNumberOfElements();
        case StimulusPackage.CPU_UTILIZATION:
            return createCPUUtilization();
        case StimulusPackage.MEMORY_UTILIZATION:
            return createMemoryUtilization();
        case StimulusPackage.SIMULATION_TIME:
            return createSimulationTime();
        case StimulusPackage.HDD_UTILIZATION:
            return createHDDUtilization();
        case StimulusPackage.TASK_COUNT:
            return createTaskCount();
        case StimulusPackage.QUEUE_LENGTH:
            return createQueueLength();
        case StimulusPackage.NETWORK_UTILIZATION:
            return createNetworkUtilization();
        case StimulusPackage.AGGREGATED_STIMULUS:
            return createAggregatedStimulus();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case StimulusPackage.AGGREGATIONMETHOD:
            return createAGGREGATIONMETHODFromString(eDataType, initialValue);
        case StimulusPackage.HDDUSAGETYPE:
            return createHDDUSAGETYPEFromString(eDataType, initialValue);
        case StimulusPackage.NETWORKUSAGETYPE:
            return createNETWORKUSAGETYPEFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case StimulusPackage.AGGREGATIONMETHOD:
            return convertAGGREGATIONMETHODToString(eDataType, instanceValue);
        case StimulusPackage.HDDUSAGETYPE:
            return convertHDDUSAGETYPEToString(eDataType, instanceValue);
        case StimulusPackage.NETWORKUSAGETYPE:
            return convertNETWORKUSAGETYPEToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationResponseTime createOperationResponseTime() {
        OperationResponseTimeImpl operationResponseTime = new OperationResponseTimeImpl();
        return operationResponseTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumberOfElements createNumberOfElements() {
        NumberOfElementsImpl numberOfElements = new NumberOfElementsImpl();
        return numberOfElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CPUUtilization createCPUUtilization() {
        CPUUtilizationImpl cpuUtilization = new CPUUtilizationImpl();
        return cpuUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MemoryUtilization createMemoryUtilization() {
        MemoryUtilizationImpl memoryUtilization = new MemoryUtilizationImpl();
        return memoryUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimulationTime createSimulationTime() {
        SimulationTimeImpl simulationTime = new SimulationTimeImpl();
        return simulationTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HDDUtilization createHDDUtilization() {
        HDDUtilizationImpl hddUtilization = new HDDUtilizationImpl();
        return hddUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TaskCount createTaskCount() {
        TaskCountImpl taskCount = new TaskCountImpl();
        return taskCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QueueLength createQueueLength() {
        QueueLengthImpl queueLength = new QueueLengthImpl();
        return queueLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NetworkUtilization createNetworkUtilization() {
        NetworkUtilizationImpl networkUtilization = new NetworkUtilizationImpl();
        return networkUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AggregatedStimulus createAggregatedStimulus() {
        AggregatedStimulusImpl aggregatedStimulus = new AggregatedStimulusImpl();
        return aggregatedStimulus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AGGREGATIONMETHOD createAGGREGATIONMETHODFromString(EDataType eDataType, String initialValue) {
        AGGREGATIONMETHOD result = AGGREGATIONMETHOD.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAGGREGATIONMETHODToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDDUSAGETYPE createHDDUSAGETYPEFromString(EDataType eDataType, String initialValue) {
        HDDUSAGETYPE result = HDDUSAGETYPE.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHDDUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NETWORKUSAGETYPE createNETWORKUSAGETYPEFromString(EDataType eDataType, String initialValue) {
        NETWORKUSAGETYPE result = NETWORKUSAGETYPE.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNETWORKUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StimulusPackage getStimulusPackage() {
        return (StimulusPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StimulusPackage getPackage() {
        return StimulusPackage.eINSTANCE;
    }

} //StimulusFactoryImpl
