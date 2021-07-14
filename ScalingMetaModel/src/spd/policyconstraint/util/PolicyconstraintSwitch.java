/**
 */
package spd.policyconstraint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import spd.policyconstraint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see spd.policyconstraint.PolicyconstraintPackage
 * @generated
 */
public class PolicyconstraintSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyconstraintPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyconstraintSwitch() {
		if (modelPackage == null) {
			modelPackage = PolicyconstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PolicyconstraintPackage.POLICY_CONSTRAINT: {
				PolicyConstraint policyConstraint = (PolicyConstraint)theEObject;
				T result = casePolicyConstraint(policyConstraint);
				if (result == null) result = caseSpd_PolicyConstraint(policyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyconstraintPackage.TIME_BASED_CONSTRAINT: {
				TimeBasedConstraint timeBasedConstraint = (TimeBasedConstraint)theEObject;
				T result = caseTimeBasedConstraint(timeBasedConstraint);
				if (result == null) result = casePolicyConstraint(timeBasedConstraint);
				if (result == null) result = caseSpd_PolicyConstraint(timeBasedConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyconstraintPackage.GROUP_SIZE_CONSTRAINT: {
				GroupSizeConstraint groupSizeConstraint = (GroupSizeConstraint)theEObject;
				T result = caseGroupSizeConstraint(groupSizeConstraint);
				if (result == null) result = casePolicyConstraint(groupSizeConstraint);
				if (result == null) result = caseSpd_PolicyConstraint(groupSizeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT: {
				IntervallConstraint intervallConstraint = (IntervallConstraint)theEObject;
				T result = caseIntervallConstraint(intervallConstraint);
				if (result == null) result = caseTimeBasedConstraint(intervallConstraint);
				if (result == null) result = casePolicyConstraint(intervallConstraint);
				if (result == null) result = caseSpd_PolicyConstraint(intervallConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyconstraintPackage.COOLDOWN_CONSTRAINT: {
				CooldownConstraint cooldownConstraint = (CooldownConstraint)theEObject;
				T result = caseCooldownConstraint(cooldownConstraint);
				if (result == null) result = caseTimeBasedConstraint(cooldownConstraint);
				if (result == null) result = casePolicyConstraint(cooldownConstraint);
				if (result == null) result = caseSpd_PolicyConstraint(cooldownConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyConstraint(PolicyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBasedConstraint(TimeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Size Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupSizeConstraint(GroupSizeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervall Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervall Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervallConstraint(IntervallConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cooldown Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cooldown Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCooldownConstraint(CooldownConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpd_PolicyConstraint(spd.PolicyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PolicyconstraintSwitch
