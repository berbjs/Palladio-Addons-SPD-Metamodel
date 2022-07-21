/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers.impl;

import de.unistuttgart.slingshot.spd.triggers.PointInTimeTrigger;
import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point In Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.impl.PointInTimeTriggerImpl#getPointInTime <em>Point In Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointInTimeTriggerImpl extends ScalingTriggerImpl implements PointInTimeTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * The default value of the '{@link #getPointInTime() <em>Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInTime()
	 * @generated
	 * @ordered
	 */
	protected static final double POINT_IN_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPointInTime() <em>Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInTime()
	 * @generated
	 * @ordered
	 */
	protected double pointInTime = POINT_IN_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointInTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.POINT_IN_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPointInTime() {
		return pointInTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointInTime(double newPointInTime) {
		double oldPointInTime = pointInTime;
		pointInTime = newPointInTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POINT_IN_TIME_TRIGGER__POINT_IN_TIME, oldPointInTime, pointInTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.POINT_IN_TIME_TRIGGER__POINT_IN_TIME:
				return getPointInTime();
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
			case TriggersPackage.POINT_IN_TIME_TRIGGER__POINT_IN_TIME:
				setPointInTime((Double)newValue);
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
			case TriggersPackage.POINT_IN_TIME_TRIGGER__POINT_IN_TIME:
				setPointInTime(POINT_IN_TIME_EDEFAULT);
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
			case TriggersPackage.POINT_IN_TIME_TRIGGER__POINT_IN_TIME:
				return pointInTime != POINT_IN_TIME_EDEFAULT;
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
		result.append(" (pointInTime: ");
		result.append(pointInTime);
		result.append(')');
		return result.toString();
	}

} //PointInTimeTriggerImpl
