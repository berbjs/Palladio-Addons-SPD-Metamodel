/**
 */
package spd.scalingtrigger.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import spd.palladio.PCMOperationSignature;
import spd.scalingtrigger.ResponseTimeTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.THRESHOLDDIRECTION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl#getOperationSignature <em>Operation Signature</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl#getThresholdDirection <em>Threshold Direction</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl#getViolationWindow <em>Violation Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseTimeTriggerImpl extends TimeBasedTriggerImpl implements ResponseTimeTrigger {
	/**
	 * The cached value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMOperationSignature> operationSignature;

	/**
	 * The default value of the '{@link #getThresholdDirection() <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDirection()
	 * @generated
	 * @ordered
	 */
	protected static final THRESHOLDDIRECTION THRESHOLD_DIRECTION_EDEFAULT = THRESHOLDDIRECTION.EXCEDEED;

	/**
	 * The cached value of the '{@link #getThresholdDirection() <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDirection()
	 * @generated
	 * @ordered
	 */
	protected THRESHOLDDIRECTION thresholdDirection = THRESHOLD_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getViolationWindow() <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationWindow()
	 * @generated
	 * @ordered
	 */
	protected static final double VIOLATION_WINDOW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getViolationWindow() <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationWindow()
	 * @generated
	 * @ordered
	 */
	protected double violationWindow = VIOLATION_WINDOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.RESPONSE_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMOperationSignature> getOperationSignature() {
		if (operationSignature == null) {
			operationSignature = new EObjectResolvingEList<PCMOperationSignature>(PCMOperationSignature.class, this, ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE);
		}
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THRESHOLDDIRECTION getThresholdDirection() {
		return thresholdDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdDirection(THRESHOLDDIRECTION newThresholdDirection) {
		THRESHOLDDIRECTION oldThresholdDirection = thresholdDirection;
		thresholdDirection = newThresholdDirection == null ? THRESHOLD_DIRECTION_EDEFAULT : newThresholdDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION, oldThresholdDirection, thresholdDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViolationWindow() {
		return violationWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViolationWindow(double newViolationWindow) {
		double oldViolationWindow = violationWindow;
		violationWindow = newViolationWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW, oldViolationWindow, violationWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				return getOperationSignature();
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION:
				return getThresholdDirection();
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW:
				return getViolationWindow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				getOperationSignature().clear();
				getOperationSignature().addAll((Collection<? extends PCMOperationSignature>)newValue);
				return;
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION:
				setThresholdDirection((THRESHOLDDIRECTION)newValue);
				return;
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW:
				setViolationWindow((Double)newValue);
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
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				getOperationSignature().clear();
				return;
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION:
				setThresholdDirection(THRESHOLD_DIRECTION_EDEFAULT);
				return;
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW:
				setViolationWindow(VIOLATION_WINDOW_EDEFAULT);
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
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				return operationSignature != null && !operationSignature.isEmpty();
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION:
				return thresholdDirection != THRESHOLD_DIRECTION_EDEFAULT;
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW:
				return violationWindow != VIOLATION_WINDOW_EDEFAULT;
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
		result.append(" (thresholdDirection: ");
		result.append(thresholdDirection);
		result.append(", violationWindow: ");
		result.append(violationWindow);
		result.append(')');
		return result.toString();
	}

} //ResponseTimeTriggerImpl
