/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;
import spd.palladio.PCMOperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ResponseTimeTrigger#getOperationSignature <em>Operation Signature</em>}</li>
 *   <li>{@link spd.scalingtrigger.ResponseTimeTrigger#getThresholdDirection <em>Threshold Direction</em>}</li>
 *   <li>{@link spd.scalingtrigger.ResponseTimeTrigger#getViolationWindow <em>Violation Window</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger()
 * @model
 * @generated
 */
public interface ResponseTimeTrigger extends TimeBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' reference list.
	 * The list contents are of type {@link spd.palladio.PCMOperationSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger_OperationSignature()
	 * @model
	 * @generated
	 */
	EList<PCMOperationSignature> getOperationSignature();

	/**
	 * Returns the value of the '<em><b>Threshold Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.THRESHOLDDIRECTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #setThresholdDirection(THRESHOLDDIRECTION)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger_ThresholdDirection()
	 * @model
	 * @generated
	 */
	THRESHOLDDIRECTION getThresholdDirection();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ResponseTimeTrigger#getThresholdDirection <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #getThresholdDirection()
	 * @generated
	 */
	void setThresholdDirection(THRESHOLDDIRECTION value);

	/**
	 * Returns the value of the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Window</em>' attribute.
	 * @see #setViolationWindow(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger_ViolationWindow()
	 * @model required="true"
	 * @generated
	 */
	double getViolationWindow();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ResponseTimeTrigger#getViolationWindow <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violation Window</em>' attribute.
	 * @see #getViolationWindow()
	 * @generated
	 */
	void setViolationWindow(double value);

} // ResponseTimeTrigger
