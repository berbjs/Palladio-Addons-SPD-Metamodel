/**
 */
package spd.adjustmenttype.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import spd.adjustmenttype.*;

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
 * @see spd.adjustmenttype.AdjustmenttypePackage
 * @generated
 */
public class AdjustmenttypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdjustmenttypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmenttypeSwitch() {
		if (modelPackage == null) {
			modelPackage = AdjustmenttypePackage.eINSTANCE;
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
			case AdjustmenttypePackage.ADJUSTMENT_TYPE: {
				AdjustmentType adjustmentType = (AdjustmentType)theEObject;
				T result = caseAdjustmentType(adjustmentType);
				if (result == null) result = caseSpd_AdjustmentType(adjustmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdjustmenttypePackage.RELATIVE_ADJUSTMENT: {
				RelativeAdjustment relativeAdjustment = (RelativeAdjustment)theEObject;
				T result = caseRelativeAdjustment(relativeAdjustment);
				if (result == null) result = caseAdjustmentType(relativeAdjustment);
				if (result == null) result = caseSpd_AdjustmentType(relativeAdjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT: {
				AbsoluteAdjustment absoluteAdjustment = (AbsoluteAdjustment)theEObject;
				T result = caseAbsoluteAdjustment(absoluteAdjustment);
				if (result == null) result = caseAdjustmentType(absoluteAdjustment);
				if (result == null) result = caseSpd_AdjustmentType(absoluteAdjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdjustmenttypePackage.STEP_ADJUSTMENT: {
				StepAdjustment stepAdjustment = (StepAdjustment)theEObject;
				T result = caseStepAdjustment(stepAdjustment);
				if (result == null) result = caseAdjustmentType(stepAdjustment);
				if (result == null) result = caseSpd_AdjustmentType(stepAdjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjustmentType(AdjustmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Adjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeAdjustment(RelativeAdjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Adjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteAdjustment(AbsoluteAdjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Adjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepAdjustment(StepAdjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpd_AdjustmentType(spd.AdjustmentType object) {
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

} //AdjustmenttypeSwitch
