/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.adjustments.impl;

import de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage;
import de.unistuttgart.slingshot.spd.adjustments.RelativeAdjustment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.adjustments.impl.RelativeAdjustmentImpl#getPercentageValue <em>Percentage Value</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.adjustments.impl.RelativeAdjustmentImpl#getMinAdjustmentValue <em>Min Adjustment Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeAdjustmentImpl extends AdjustmentTypeImpl implements RelativeAdjustment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * The default value of the '{@link #getPercentageValue() <em>Percentage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageValue()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageValue() <em>Percentage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageValue()
	 * @generated
	 * @ordered
	 */
	protected double percentageValue = PERCENTAGE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAdjustmentValue() <em>Min Adjustment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAdjustmentValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ADJUSTMENT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinAdjustmentValue() <em>Min Adjustment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAdjustmentValue()
	 * @generated
	 * @ordered
	 */
	protected int minAdjustmentValue = MIN_ADJUSTMENT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPercentageValue() {
		return percentageValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageValue(double newPercentageValue) {
		double oldPercentageValue = percentageValue;
		percentageValue = newPercentageValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE, oldPercentageValue, percentageValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAdjustmentValue() {
		return minAdjustmentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAdjustmentValue(int newMinAdjustmentValue) {
		int oldMinAdjustmentValue = minAdjustmentValue;
		minAdjustmentValue = newMinAdjustmentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE, oldMinAdjustmentValue, minAdjustmentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE:
				return getPercentageValue();
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
				return getMinAdjustmentValue();
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE:
				setPercentageValue((Double)newValue);
				return;
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
				setMinAdjustmentValue((Integer)newValue);
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE:
				setPercentageValue(PERCENTAGE_VALUE_EDEFAULT);
				return;
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
				setMinAdjustmentValue(MIN_ADJUSTMENT_VALUE_EDEFAULT);
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE:
				return percentageValue != PERCENTAGE_VALUE_EDEFAULT;
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
				return minAdjustmentValue != MIN_ADJUSTMENT_VALUE_EDEFAULT;
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
		result.append(" (percentageValue: ");
		result.append(percentageValue);
		result.append(", minAdjustmentValue: ");
		result.append(minAdjustmentValue);
		result.append(')');
		return result.toString();
	}

} //RelativeAdjustmentImpl
