/**
 */
package spd.policyconstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.policyconstraint.GroupSizeConstraint#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link spd.policyconstraint.GroupSizeConstraint#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see spd.policyconstraint.PolicyconstraintPackage#getGroupSizeConstraint()
 * @model
 * @generated
 */
public interface GroupSizeConstraint extends PolicyConstraint {
	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(int)
	 * @see spd.policyconstraint.PolicyconstraintPackage#getGroupSizeConstraint_MinSize()
	 * @model
	 * @generated
	 */
	int getMinSize();

	/**
	 * Sets the value of the '{@link spd.policyconstraint.GroupSizeConstraint#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #getMinSize()
	 * @generated
	 */
	void setMinSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see spd.policyconstraint.PolicyconstraintPackage#getGroupSizeConstraint_MaxSize()
	 * @model
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link spd.policyconstraint.GroupSizeConstraint#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // GroupSizeConstraint
