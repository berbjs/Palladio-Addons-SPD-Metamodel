/**
 */
package spd.adjustmenttype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.adjustmenttype.StepAdjustment#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @see spd.adjustmenttype.AdjustmenttypePackage#getStepAdjustment()
 * @model
 * @generated
 */
public interface StepAdjustment extends AdjustmentType {
	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(int)
	 * @see spd.adjustmenttype.AdjustmenttypePackage#getStepAdjustment_StepValue()
	 * @model default="0"
	 * @generated
	 */
	int getStepValue();

	/**
	 * Sets the value of the '{@link spd.adjustmenttype.StepAdjustment#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(int value);

} // StepAdjustment
