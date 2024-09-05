/**
 */
package org.palladiosimulator.spd.stimulus.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.spd.stimulus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.stimulus.StimulusPackage
 * @generated
 */
public class StimulusAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StimulusPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StimulusAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = StimulusPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StimulusSwitch<Adapter> modelSwitch = new StimulusSwitch<Adapter>() {
        @Override
        public Adapter caseStimulus(Stimulus object) {
            return createStimulusAdapter();
        }

        @Override
        public Adapter caseTargetGroupStateStimulus(TargetGroupStateStimulus object) {
            return createTargetGroupStateStimulusAdapter();
        }

        @Override
        public Adapter caseSimulationStateStimulus(SimulationStateStimulus object) {
            return createSimulationStateStimulusAdapter();
        }

        @Override
        public Adapter caseSourceInterfaceStimulus(SourceInterfaceStimulus object) {
            return createSourceInterfaceStimulusAdapter();
        }

        @Override
        public Adapter caseOperationResponseTime(OperationResponseTime object) {
            return createOperationResponseTimeAdapter();
        }

        @Override
        public Adapter caseNumberOfElements(NumberOfElements object) {
            return createNumberOfElementsAdapter();
        }

        @Override
        public Adapter caseManagedElementsStateStimulus(ManagedElementsStateStimulus object) {
            return createManagedElementsStateStimulusAdapter();
        }

        @Override
        public Adapter caseCPUUtilization(CPUUtilization object) {
            return createCPUUtilizationAdapter();
        }

        @Override
        public Adapter caseMemoryUtilization(MemoryUtilization object) {
            return createMemoryUtilizationAdapter();
        }

        @Override
        public Adapter caseSimulationTime(SimulationTime object) {
            return createSimulationTimeAdapter();
        }

        @Override
        public Adapter caseHDDUtilization(HDDUtilization object) {
            return createHDDUtilizationAdapter();
        }

        @Override
        public Adapter caseResourceUtilizationStimulus(ResourceUtilizationStimulus object) {
            return createResourceUtilizationStimulusAdapter();
        }

        @Override
        public Adapter caseTaskCount(TaskCount object) {
            return createTaskCountAdapter();
        }

        @Override
        public Adapter caseQueueLength(QueueLength object) {
            return createQueueLengthAdapter();
        }

        @Override
        public Adapter caseNetworkUtilization(NetworkUtilization object) {
            return createNetworkUtilizationAdapter();
        }

        @Override
        public Adapter caseAggregatedStimulus(AggregatedStimulus object) {
            return createAggregatedStimulusAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.Stimulus <em>Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.Stimulus
     * @generated
     */
    public Adapter createStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.TargetGroupStateStimulus <em>Target Group State Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.TargetGroupStateStimulus
     * @generated
     */
    public Adapter createTargetGroupStateStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.SimulationStateStimulus <em>Simulation State Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.SimulationStateStimulus
     * @generated
     */
    public Adapter createSimulationStateStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.SourceInterfaceStimulus <em>Source Interface Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.SourceInterfaceStimulus
     * @generated
     */
    public Adapter createSourceInterfaceStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.OperationResponseTime <em>Operation Response Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.OperationResponseTime
     * @generated
     */
    public Adapter createOperationResponseTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.NumberOfElements <em>Number Of Elements</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.NumberOfElements
     * @generated
     */
    public Adapter createNumberOfElementsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.ManagedElementsStateStimulus <em>Managed Elements State Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.ManagedElementsStateStimulus
     * @generated
     */
    public Adapter createManagedElementsStateStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.CPUUtilization <em>CPU Utilization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.CPUUtilization
     * @generated
     */
    public Adapter createCPUUtilizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.MemoryUtilization <em>Memory Utilization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.MemoryUtilization
     * @generated
     */
    public Adapter createMemoryUtilizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.SimulationTime <em>Simulation Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.SimulationTime
     * @generated
     */
    public Adapter createSimulationTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.HDDUtilization <em>HDD Utilization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.HDDUtilization
     * @generated
     */
    public Adapter createHDDUtilizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.ResourceUtilizationStimulus <em>Resource Utilization Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.ResourceUtilizationStimulus
     * @generated
     */
    public Adapter createResourceUtilizationStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.TaskCount <em>Task Count</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.TaskCount
     * @generated
     */
    public Adapter createTaskCountAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.QueueLength <em>Queue Length</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.QueueLength
     * @generated
     */
    public Adapter createQueueLengthAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.NetworkUtilization <em>Network Utilization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.NetworkUtilization
     * @generated
     */
    public Adapter createNetworkUtilizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus <em>Aggregated Stimulus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.spd.stimulus.AggregatedStimulus
     * @generated
     */
    public Adapter createAggregatedStimulusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //StimulusAdapterFactory
