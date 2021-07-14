/**
 */
package spd.scalingtrigger.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import spd.scalingtrigger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see spd.scalingtrigger.ScalingtriggerPackage
 * @generated
 */
public class ScalingtriggerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalingtriggerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingtriggerSwitch() {
		if (modelPackage == null) {
			modelPackage = ScalingtriggerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScalingtriggerPackage.SCALING_TRIGGER: {
				ScalingTrigger scalingTrigger = (ScalingTrigger)theEObject;
				T result = caseScalingTrigger(scalingTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(scalingTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER: {
				ThresholdBasedTrigger thresholdBasedTrigger = (ThresholdBasedTrigger)theEObject;
				T result = caseThresholdBasedTrigger(thresholdBasedTrigger);
				if (result == null) result = caseScalingTrigger(thresholdBasedTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(thresholdBasedTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.CPU_UTILIZATION_TRIGGER: {
				CPUUtilizationTrigger cpuUtilizationTrigger = (CPUUtilizationTrigger)theEObject;
				T result = caseCPUUtilizationTrigger(cpuUtilizationTrigger);
				if (result == null) result = caseProcessingResourceUtilizationBasedTrigger(cpuUtilizationTrigger);
				if (result == null) result = caseResourceUtilizationBasedTrigger(cpuUtilizationTrigger);
				if (result == null) result = caseThresholdBasedTrigger(cpuUtilizationTrigger);
				if (result == null) result = caseScalingTrigger(cpuUtilizationTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(cpuUtilizationTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.RAM_UTILIZATION_TRIGGER: {
				RAMUtilizationTrigger ramUtilizationTrigger = (RAMUtilizationTrigger)theEObject;
				T result = caseRAMUtilizationTrigger(ramUtilizationTrigger);
				if (result == null) result = caseProcessingResourceUtilizationBasedTrigger(ramUtilizationTrigger);
				if (result == null) result = caseResourceUtilizationBasedTrigger(ramUtilizationTrigger);
				if (result == null) result = caseThresholdBasedTrigger(ramUtilizationTrigger);
				if (result == null) result = caseScalingTrigger(ramUtilizationTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(ramUtilizationTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER: {
				HDDUtilizationTrigger hddUtilizationTrigger = (HDDUtilizationTrigger)theEObject;
				T result = caseHDDUtilizationTrigger(hddUtilizationTrigger);
				if (result == null) result = caseProcessingResourceUtilizationBasedTrigger(hddUtilizationTrigger);
				if (result == null) result = caseResourceUtilizationBasedTrigger(hddUtilizationTrigger);
				if (result == null) result = caseThresholdBasedTrigger(hddUtilizationTrigger);
				if (result == null) result = caseScalingTrigger(hddUtilizationTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(hddUtilizationTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.TIME_BASED_TRIGGER: {
				TimeBasedTrigger timeBasedTrigger = (TimeBasedTrigger)theEObject;
				T result = caseTimeBasedTrigger(timeBasedTrigger);
				if (result == null) result = caseThresholdBasedTrigger(timeBasedTrigger);
				if (result == null) result = caseScalingTrigger(timeBasedTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(timeBasedTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.POINT_IN_TIME_TRIGGER: {
				PointInTimeTrigger pointInTimeTrigger = (PointInTimeTrigger)theEObject;
				T result = casePointInTimeTrigger(pointInTimeTrigger);
				if (result == null) result = caseScalingTrigger(pointInTimeTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(pointInTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER: {
				IdleTimeTrigger idleTimeTrigger = (IdleTimeTrigger)theEObject;
				T result = caseIdleTimeTrigger(idleTimeTrigger);
				if (result == null) result = caseTimeBasedTrigger(idleTimeTrigger);
				if (result == null) result = caseThresholdBasedTrigger(idleTimeTrigger);
				if (result == null) result = caseScalingTrigger(idleTimeTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(idleTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER: {
				TaskCountTrigger taskCountTrigger = (TaskCountTrigger)theEObject;
				T result = caseTaskCountTrigger(taskCountTrigger);
				if (result == null) result = caseThresholdBasedTrigger(taskCountTrigger);
				if (result == null) result = caseScalingTrigger(taskCountTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(taskCountTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER: {
				NetworkUtilizationTrigger networkUtilizationTrigger = (NetworkUtilizationTrigger)theEObject;
				T result = caseNetworkUtilizationTrigger(networkUtilizationTrigger);
				if (result == null) result = caseResourceUtilizationBasedTrigger(networkUtilizationTrigger);
				if (result == null) result = caseThresholdBasedTrigger(networkUtilizationTrigger);
				if (result == null) result = caseScalingTrigger(networkUtilizationTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(networkUtilizationTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER: {
				ResponseTimeTrigger responseTimeTrigger = (ResponseTimeTrigger)theEObject;
				T result = caseResponseTimeTrigger(responseTimeTrigger);
				if (result == null) result = caseTimeBasedTrigger(responseTimeTrigger);
				if (result == null) result = caseThresholdBasedTrigger(responseTimeTrigger);
				if (result == null) result = caseScalingTrigger(responseTimeTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(responseTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.RESOURCE_UTILIZATION_BASED_TRIGGER: {
				ResourceUtilizationBasedTrigger resourceUtilizationBasedTrigger = (ResourceUtilizationBasedTrigger)theEObject;
				T result = caseResourceUtilizationBasedTrigger(resourceUtilizationBasedTrigger);
				if (result == null) result = caseThresholdBasedTrigger(resourceUtilizationBasedTrigger);
				if (result == null) result = caseScalingTrigger(resourceUtilizationBasedTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(resourceUtilizationBasedTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalingtriggerPackage.PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER: {
				ProcessingResourceUtilizationBasedTrigger processingResourceUtilizationBasedTrigger = (ProcessingResourceUtilizationBasedTrigger)theEObject;
				T result = caseProcessingResourceUtilizationBasedTrigger(processingResourceUtilizationBasedTrigger);
				if (result == null) result = caseResourceUtilizationBasedTrigger(processingResourceUtilizationBasedTrigger);
				if (result == null) result = caseThresholdBasedTrigger(processingResourceUtilizationBasedTrigger);
				if (result == null) result = caseScalingTrigger(processingResourceUtilizationBasedTrigger);
				if (result == null) result = caseSpd_ScalingTrigger(processingResourceUtilizationBasedTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingTrigger(ScalingTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold Based Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold Based Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThresholdBasedTrigger(ThresholdBasedTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Utilization Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUUtilizationTrigger(CPUUtilizationTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Utilization Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMUtilizationTrigger(RAMUtilizationTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDD Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDD Utilization Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDDUtilizationTrigger(HDDUtilizationTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Based Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Based Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBasedTrigger(TimeBasedTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point In Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point In Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointInTimeTrigger(PointInTimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idle Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idle Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdleTimeTrigger(IdleTimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Count Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Count Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCountTrigger(TaskCountTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Utilization Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkUtilizationTrigger(NetworkUtilizationTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseTimeTrigger(ResponseTimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Utilization Based Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Utilization Based Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUtilizationBasedTrigger(ResourceUtilizationBasedTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Utilization Based Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Utilization Based Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceUtilizationBasedTrigger(ProcessingResourceUtilizationBasedTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpd_ScalingTrigger(spd.ScalingTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScalingtriggerSwitch
