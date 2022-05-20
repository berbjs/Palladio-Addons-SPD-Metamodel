/**
 */
package de.unistuttgart.slingshot.spd.constraints.policy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooldown Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.constraints.policy.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.constraints.policy.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage#getCooldownConstraint()
 * @model
 * @generated
 */
public interface CooldownConstraint extends TemporalConstraint {
	/**
	 * Returns the value of the '<em><b>Cooldown Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown Time</em>' attribute.
	 * @see #setCooldownTime(double)
	 * @see de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage#getCooldownConstraint_CooldownTime()
	 * @model required="true"
	 * @generated
	 */
	double getCooldownTime();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.constraints.policy.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown Time</em>' attribute.
	 * @see #getCooldownTime()
	 * @generated
	 */
	void setCooldownTime(double value);

	/**
	 * Returns the value of the '<em><b>Max Scaling Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Scaling Operations</em>' attribute.
	 * @see #setMaxScalingOperations(int)
	 * @see de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage#getCooldownConstraint_MaxScalingOperations()
	 * @model required="true"
	 * @generated
	 */
	int getMaxScalingOperations();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.constraints.policy.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scaling Operations</em>' attribute.
	 * @see #getMaxScalingOperations()
	 * @generated
	 */
	void setMaxScalingOperations(int value);

} // CooldownConstraint
