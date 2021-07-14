/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.TimeBasedTrigger#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getTimeBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface TimeBasedTrigger extends ThresholdBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTimeBasedTrigger_Threshold()
	 * @model default="0.0"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TimeBasedTrigger#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

} // TimeBasedTrigger
