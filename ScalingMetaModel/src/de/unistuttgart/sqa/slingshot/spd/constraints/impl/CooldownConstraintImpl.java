/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.impl;

import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage;
import de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooldown Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl#getCooldownTime <em>Cooldown Time</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl#getMaxScalingOperations <em>Max Scaling Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CooldownConstraintImpl extends TemporalConstraintImpl implements CooldownConstraint {
	/**
	 * The default value of the '{@link #getCooldownTime() <em>Cooldown Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownTime()
	 * @generated
	 * @ordered
	 */
	protected static final double COOLDOWN_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCooldownTime() <em>Cooldown Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownTime()
	 * @generated
	 * @ordered
	 */
	protected double cooldownTime = COOLDOWN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScalingOperations() <em>Max Scaling Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScalingOperations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SCALING_OPERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxScalingOperations() <em>Max Scaling Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScalingOperations()
	 * @generated
	 * @ordered
	 */
	protected int maxScalingOperations = MAX_SCALING_OPERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooldownConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.COOLDOWN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCooldownTime() {
		return cooldownTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooldownTime(double newCooldownTime) {
		double oldCooldownTime = cooldownTime;
		cooldownTime = newCooldownTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME, oldCooldownTime, cooldownTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxScalingOperations() {
		return maxScalingOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxScalingOperations(int newMaxScalingOperations) {
		int oldMaxScalingOperations = maxScalingOperations;
		maxScalingOperations = newMaxScalingOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS, oldMaxScalingOperations, maxScalingOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
				return getCooldownTime();
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
				return getMaxScalingOperations();
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
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
				setCooldownTime((Double)newValue);
				return;
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
				setMaxScalingOperations((Integer)newValue);
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
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
				setCooldownTime(COOLDOWN_TIME_EDEFAULT);
				return;
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
				setMaxScalingOperations(MAX_SCALING_OPERATIONS_EDEFAULT);
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
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
				return cooldownTime != COOLDOWN_TIME_EDEFAULT;
			case ConstraintsPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
				return maxScalingOperations != MAX_SCALING_OPERATIONS_EDEFAULT;
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
		result.append(" (cooldownTime: ");
		result.append(cooldownTime);
		result.append(", maxScalingOperations: ");
		result.append(maxScalingOperations);
		result.append(')');
		return result.toString();
	}

} //CooldownConstraintImpl
