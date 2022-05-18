/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.impl;

import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage;
import de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thrashing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.ThrashingConstraintImpl#getMinimumTimeNoThrashing <em>Minimum Time No Thrashing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrashingConstraintImpl extends TemporalConstraintImpl implements ThrashingConstraint {
	/**
	 * The default value of the '{@link #getMinimumTimeNoThrashing() <em>Minimum Time No Thrashing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTimeNoThrashing()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_TIME_NO_THRASHING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumTimeNoThrashing() <em>Minimum Time No Thrashing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTimeNoThrashing()
	 * @generated
	 * @ordered
	 */
	protected double minimumTimeNoThrashing = MINIMUM_TIME_NO_THRASHING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrashingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.THRASHING_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumTimeNoThrashing() {
		return minimumTimeNoThrashing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumTimeNoThrashing(double newMinimumTimeNoThrashing) {
		double oldMinimumTimeNoThrashing = minimumTimeNoThrashing;
		minimumTimeNoThrashing = newMinimumTimeNoThrashing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING, oldMinimumTimeNoThrashing, minimumTimeNoThrashing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
				return getMinimumTimeNoThrashing();
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
			case ConstraintsPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
				setMinimumTimeNoThrashing((Double)newValue);
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
			case ConstraintsPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
				setMinimumTimeNoThrashing(MINIMUM_TIME_NO_THRASHING_EDEFAULT);
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
			case ConstraintsPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
				return minimumTimeNoThrashing != MINIMUM_TIME_NO_THRASHING_EDEFAULT;
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
		result.append(" (minimumTimeNoThrashing: ");
		result.append(minimumTimeNoThrashing);
		result.append(')');
		return result.toString();
	}

} //ThrashingConstraintImpl
