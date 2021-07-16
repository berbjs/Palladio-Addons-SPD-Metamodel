/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point In Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.PointInTimeTrigger#getPointInTime <em>Point In Time</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getPointInTimeTrigger()
 * @model
 * @generated
 */
public interface PointInTimeTrigger extends ScalingTrigger {
	/**
	 * Returns the value of the '<em><b>Point In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point In Time</em>' attribute.
	 * @see #setPointInTime(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getPointInTimeTrigger_PointInTime()
	 * @model required="true"
	 * @generated
	 */
	double getPointInTime();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.PointInTimeTrigger#getPointInTime <em>Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point In Time</em>' attribute.
	 * @see #getPointInTime()
	 * @generated
	 */
	void setPointInTime(double value);

} // PointInTimeTrigger
