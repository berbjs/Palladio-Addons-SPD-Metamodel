/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Count Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getThresholdDirection <em>Threshold Direction</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getViolationWindow <em>Violation Window</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger()
 * @model
 * @generated
 */
public interface TaskCountTrigger extends ThresholdBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_Threshold()
	 * @model default="0"
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

	/**
	 * Returns the value of the '<em><b>Threshold Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.THRESHOLDDIRECTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #setThresholdDirection(THRESHOLDDIRECTION)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ThresholdDirection()
	 * @model
	 * @generated
	 */
	THRESHOLDDIRECTION getThresholdDirection();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getThresholdDirection <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #getThresholdDirection()
	 * @generated
	 */
	void setThresholdDirection(THRESHOLDDIRECTION value);

	/**
	 * Returns the value of the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #setProcessingResourceAggregation(AGGREGATIONMETHOD)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ProcessingResourceAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getProcessingResourceAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #getProcessingResourceAggregation()
	 * @generated
	 */
	void setProcessingResourceAggregation(AGGREGATIONMETHOD value);

	/**
	 * Returns the value of the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #setResourceContainerAggregation(AGGREGATIONMETHOD)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ResourceContainerAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getResourceContainerAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #getResourceContainerAggregation()
	 * @generated
	 */
	void setResourceContainerAggregation(AGGREGATIONMETHOD value);

	/**
	 * Returns the value of the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Window</em>' attribute.
	 * @see #setViolationWindow(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ViolationWindow()
	 * @model
	 * @generated
	 */
	double getViolationWindow();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getViolationWindow <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violation Window</em>' attribute.
	 * @see #getViolationWindow()
	 * @generated
	 */
	void setViolationWindow(double value);

} // TaskCountTrigger
