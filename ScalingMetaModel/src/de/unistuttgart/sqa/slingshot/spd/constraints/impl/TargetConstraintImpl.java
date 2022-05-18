/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.impl;

import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage;
import de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint;

import de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetConstraintImpl#getTargetgroup <em>Targetgroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetConstraintImpl extends ConstraintImpl implements TargetConstraint {
	/**
	 * The cached value of the '{@link #getTargetgroup() <em>Targetgroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetgroup()
	 * @generated
	 * @ordered
	 */
	protected TargetGroup targetgroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.TARGET_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup getTargetgroup() {
		if (targetgroup != null && targetgroup.eIsProxy()) {
			InternalEObject oldTargetgroup = (InternalEObject)targetgroup;
			targetgroup = (TargetGroup)eResolveProxy(oldTargetgroup);
			if (targetgroup != oldTargetgroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP, oldTargetgroup, targetgroup));
			}
		}
		return targetgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup basicGetTargetgroup() {
		return targetgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetgroup(TargetGroup newTargetgroup) {
		TargetGroup oldTargetgroup = targetgroup;
		targetgroup = newTargetgroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP, oldTargetgroup, targetgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP:
				if (resolve) return getTargetgroup();
				return basicGetTargetgroup();
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
			case ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP:
				setTargetgroup((TargetGroup)newValue);
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
			case ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP:
				setTargetgroup((TargetGroup)null);
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
			case ConstraintsPackage.TARGET_CONSTRAINT__TARGETGROUP:
				return targetgroup != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetConstraintImpl
