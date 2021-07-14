/**
 */
package spd.scalingtrigger.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spd.scalingtrigger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spd.scalingtrigger.ScalingtriggerPackage
 * @generated
 */
public class ScalingtriggerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalingtriggerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingtriggerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScalingtriggerPackage.eINSTANCE;
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
	protected ScalingtriggerSwitch<Adapter> modelSwitch =
		new ScalingtriggerSwitch<Adapter>() {
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
			public Adapter caseSpd_ScalingTrigger(spd.ScalingTrigger object) {
				return createSpd_ScalingTriggerAdapter();
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
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.ScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.ScalingTrigger
	 * @generated
	 */
	public Adapter createScalingTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.ThresholdBasedTrigger <em>Threshold Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.ThresholdBasedTrigger
	 * @generated
	 */
	public Adapter createThresholdBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.CPUUtilizationTrigger <em>CPU Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.CPUUtilizationTrigger
	 * @generated
	 */
	public Adapter createCPUUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.RAMUtilizationTrigger <em>RAM Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.RAMUtilizationTrigger
	 * @generated
	 */
	public Adapter createRAMUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.HDDUtilizationTrigger <em>HDD Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.HDDUtilizationTrigger
	 * @generated
	 */
	public Adapter createHDDUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.TimeBasedTrigger <em>Time Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.TimeBasedTrigger
	 * @generated
	 */
	public Adapter createTimeBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.PointInTimeTrigger <em>Point In Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.PointInTimeTrigger
	 * @generated
	 */
	public Adapter createPointInTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.IdleTimeTrigger <em>Idle Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.IdleTimeTrigger
	 * @generated
	 */
	public Adapter createIdleTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.TaskCountTrigger <em>Task Count Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.TaskCountTrigger
	 * @generated
	 */
	public Adapter createTaskCountTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.NetworkUtilizationTrigger <em>Network Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.NetworkUtilizationTrigger
	 * @generated
	 */
	public Adapter createNetworkUtilizationTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.ResponseTimeTrigger <em>Response Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.ResponseTimeTrigger
	 * @generated
	 */
	public Adapter createResponseTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger <em>Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.ResourceUtilizationBasedTrigger
	 * @generated
	 */
	public Adapter createResourceUtilizationBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger <em>Processing Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger
	 * @generated
	 */
	public Adapter createProcessingResourceUtilizationBasedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.ScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.ScalingTrigger
	 * @generated
	 */
	public Adapter createSpd_ScalingTriggerAdapter() {
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

} //ScalingtriggerAdapterFactory
