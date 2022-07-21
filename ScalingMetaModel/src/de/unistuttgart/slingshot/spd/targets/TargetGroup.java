/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets;

import de.unistuttgart.slingshot.spd.NamedElement;

import de.unistuttgart.slingshot.spd.constraints.target.TargetConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.targets.TargetGroup#getTargetConstraints <em>Target Constraints</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.targets.TargetsPackage#getTargetGroup()
 * @model abstract="true"
 * @generated
 */
public interface TargetGroup extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Target Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.slingshot.spd.constraints.target.TargetConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Constraints</em>' containment reference list.
	 * @see de.unistuttgart.slingshot.spd.targets.TargetsPackage#getTargetGroup_TargetConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetConstraint> getTargetConstraints();

} // TargetGroup
