/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#getTargetGroupSizeConstraint()
 * @model
 * @generated
 */
public interface TargetGroupSizeConstraint extends TargetConstraint {
	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(int)
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#getTargetGroupSizeConstraint_MinSize()
	 * @model required="true"
	 * @generated
	 */
	int getMinSize();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}' attribute.
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
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#getTargetGroupSizeConstraint_MaxSize()
	 * @model required="true"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // TargetGroupSizeConstraint
