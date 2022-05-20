/**
 */
package de.unistuttgart.slingshot.spd.constraints.policy.impl;

import de.unistuttgart.slingshot.spd.constraints.impl.AbstractConstraintImpl;

import de.unistuttgart.slingshot.spd.constraints.policy.PolicyConstraint;
import de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PolicyConstraintImpl extends AbstractConstraintImpl implements PolicyConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.POLICY_CONSTRAINT;
	}

} //PolicyConstraintImpl
