/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints;

import de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint#getTargetgroup <em>Targetgroup</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#getTargetConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TargetConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Targetgroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetgroup</em>' reference.
	 * @see #setTargetgroup(TargetGroup)
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#getTargetConstraint_Targetgroup()
	 * @model required="true"
	 * @generated
	 */
	TargetGroup getTargetgroup();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint#getTargetgroup <em>Targetgroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetgroup</em>' reference.
	 * @see #getTargetgroup()
	 * @generated
	 */
	void setTargetgroup(TargetGroup value);

} // TargetConstraint
