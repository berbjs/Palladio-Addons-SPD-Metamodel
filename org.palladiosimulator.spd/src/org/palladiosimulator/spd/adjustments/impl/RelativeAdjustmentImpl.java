/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl#getPercentageGrowthValue <em>Percentage Growth Value</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl#getMinAdjustmentValue <em>Min Adjustment Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeAdjustmentImpl extends AdjustmentTypeImpl implements RelativeAdjustment {
	/**
	 * The default value of the '{@link #getPercentageGrowthValue() <em>Percentage Growth Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageGrowthValue()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_GROWTH_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageGrowthValue() <em>Percentage Growth Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageGrowthValue()
	 * @generated
	 * @ordered
	 */
	protected double percentageGrowthValue = PERCENTAGE_GROWTH_VALUE_EDEFAULT;

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
	public double getPercentageGrowthValue() {
		return percentageGrowthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageGrowthValue(double newPercentageGrowthValue) {
		double oldPercentageGrowthValue = percentageGrowthValue;
		percentageGrowthValue = newPercentageGrowthValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE, oldPercentageGrowthValue, percentageGrowthValue));
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
				return getPercentageGrowthValue();
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
				setPercentageGrowthValue((Double)newValue);
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
				setPercentageGrowthValue(PERCENTAGE_GROWTH_VALUE_EDEFAULT);
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
			case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
				return percentageGrowthValue != PERCENTAGE_GROWTH_VALUE_EDEFAULT;
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
		result.append(" (percentageGrowthValue: ");
		result.append(percentageGrowthValue);
		result.append(", minAdjustmentValue: ");
		result.append(minAdjustmentValue);
		result.append(')');
		return result.toString();
	}

} //RelativeAdjustmentImpl
