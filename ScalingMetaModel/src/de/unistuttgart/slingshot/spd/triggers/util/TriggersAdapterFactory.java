/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers.util;

import de.unistuttgart.slingshot.spd.triggers.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage
 * @generated
 */
public class TriggersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TriggersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TriggersPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggersSwitch<Adapter> modelSwitch =
		new TriggersSwitch<Adapter>() {
			@Override
			public Adapter caseScalingTrigger(ScalingTrigger object) {
				return createScalingTriggerAdapter();
			}
			@Override
			public Adapter caseThresholdBasedTrigger(ThresholdBasedTrigger object) {
				return createThresholdBasedTriggerAdapter();
			}
			@Override
			public Adapter caseCPUUtilizationTrigger(CPUUtilizationTrigger object) {
				return createCPUUtilizationTriggerAdapter();
			}
			@Override
			public Adapter caseRAMUtilizationTrigger(RAMUtilizationTrigger object) {
				return createRAMUtilizationTriggerAdapter();
			}
			@Override
			public Adapter caseHDDUtilizationTrigger(HDDUtilizationTrigger object) {
				return createHDDUtilizationTriggerAdapter();
			}
			@Override
			public Adapter caseTimeBasedTrigger(TimeBasedTrigger object) {
				return createTimeBasedTriggerAdapter();
			}
			@Override
			public Adapter casePointInTimeTrigger(PointInTimeTrigger object) {
				return createPointInTimeTriggerAdapter();
			}
			@Override
			public Adapter caseIdleTimeTrigger(IdleTimeTrigger object) {
				return createIdleTimeTriggerAdapter();
			}
			@Override
			public Adapter caseTaskCountTrigger(TaskCountTrigger object) {
				return createTaskCountTriggerAdapter();
			}
			@Override
			public Adapter caseNetworkUtilizationTrigger(NetworkUtilizationTrigger object) {
				return createNetworkUtilizationTriggerAdapter();
			}
			@Override
			public Adapter caseResponseTimeTrigger(ResponseTimeTrigger object) {
				return createResponseTimeTriggerAdapter();
			}
			@Override
			public Adapter caseResourceUtilizationBasedTrigger(ResourceUtilizationBasedTrigger object) {
				return createResourceUtilizationBasedTriggerAdapter();
			}
			@Override
			public Adapter caseProcessingResourceUtilizationBasedTrigger(ProcessingResourceUtilizationBasedTrigger object) {
				return createProcessingResourceUtilizationBasedTriggerAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.ScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.ScalingTrigger
	 * @generated
	 */
	public Adapter createScalingTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.ThresholdBasedTrigger <em>Threshold Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.ThresholdBasedTrigger
	 * @generated
	 */
	public Adapter createThresholdBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.CPUUtilizationTrigger <em>CPU Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.CPUUtilizationTrigger
	 * @generated
	 */
	public Adapter createCPUUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.RAMUtilizationTrigger <em>RAM Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.RAMUtilizationTrigger
	 * @generated
	 */
	public Adapter createRAMUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.HDDUtilizationTrigger <em>HDD Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.HDDUtilizationTrigger
	 * @generated
	 */
	public Adapter createHDDUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.TimeBasedTrigger <em>Time Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.TimeBasedTrigger
	 * @generated
	 */
	public Adapter createTimeBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.PointInTimeTrigger <em>Point In Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.PointInTimeTrigger
	 * @generated
	 */
	public Adapter createPointInTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.IdleTimeTrigger <em>Idle Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.IdleTimeTrigger
	 * @generated
	 */
	public Adapter createIdleTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger <em>Task Count Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger
	 * @generated
	 */
	public Adapter createTaskCountTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.NetworkUtilizationTrigger <em>Network Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.NetworkUtilizationTrigger
	 * @generated
	 */
	public Adapter createNetworkUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.ResponseTimeTrigger <em>Response Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.ResponseTimeTrigger
	 * @generated
	 */
	public Adapter createResponseTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.ResourceUtilizationBasedTrigger <em>Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.ResourceUtilizationBasedTrigger
	 * @generated
	 */
	public Adapter createResourceUtilizationBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.slingshot.spd.triggers.ProcessingResourceUtilizationBasedTrigger <em>Processing Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.slingshot.spd.triggers.ProcessingResourceUtilizationBasedTrigger
	 * @generated
	 */
	public Adapter createProcessingResourceUtilizationBasedTriggerAdapter() {
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

} //TriggersAdapterFactory
