/**
 */
package spd.adjustmenttype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spd.adjustmenttype.AbsoluteAdjustment;
import spd.adjustmenttype.AdjustmenttypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.adjustmenttype.impl.AbsoluteAdjustmentImpl#getGoalValue <em>Goal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteAdjustmentImpl extends AdjustmentTypeImpl implements AbsoluteAdjustment {
	/**
	 * The default value of the '{@link #getGoalValue() <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalValue()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalValue() <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalValue()
	 * @generated
	 * @ordered
	 */
	protected int goalValue = GOAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdjustmenttypePackage.Literals.ABSOLUTE_ADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoalValue() {
		return goalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalValue(int newGoalValue) {
		int oldGoalValue = goalValue;
		goalValue = newGoalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE, oldGoalValue, goalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
				return getGoalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
				setGoalValue((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
				setGoalValue(GOAL_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
				return goalValue != GOAL_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (goalValue: ");
		result.append(goalValue);
		result.append(')');
		return result.toString();
	}

} //AbsoluteAdjustmentImpl
