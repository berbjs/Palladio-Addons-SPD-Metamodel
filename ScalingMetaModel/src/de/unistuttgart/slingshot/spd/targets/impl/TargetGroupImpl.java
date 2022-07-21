/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets.impl;

import de.unistuttgart.slingshot.spd.constraints.target.TargetConstraint;

import de.unistuttgart.slingshot.spd.impl.NamedElementImpl;

import de.unistuttgart.slingshot.spd.targets.TargetGroup;
import de.unistuttgart.slingshot.spd.targets.TargetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.targets.impl.TargetGroupImpl#getTargetConstraints <em>Target Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetGroupImpl extends NamedElementImpl implements TargetGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * The cached value of the '{@link #getTargetConstraints() <em>Target Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetConstraint> targetConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.TARGET_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetConstraint> getTargetConstraints() {
		if (targetConstraints == null) {
			targetConstraints = new EObjectContainmentEList<TargetConstraint>(TargetConstraint.class, this, TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS);
		}
		return targetConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
				return ((InternalEList<?>)getTargetConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
				return getTargetConstraints();
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
			case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
				getTargetConstraints().clear();
				getTargetConstraints().addAll((Collection<? extends TargetConstraint>)newValue);
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
			case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
				getTargetConstraints().clear();
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
			case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
				return targetConstraints != null && !targetConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetGroupImpl