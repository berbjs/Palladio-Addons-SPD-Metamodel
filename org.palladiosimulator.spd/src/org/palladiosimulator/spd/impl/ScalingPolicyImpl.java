/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;

import org.palladiosimulator.spd.adjustments.AdjustmentType;

import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;

import org.palladiosimulator.spd.targets.TargetGroup;

import org.palladiosimulator.spd.triggers.ScalingTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getScalingTrigger <em>Scaling Trigger</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getAdjustmentType <em>Adjustment Type</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getTargetGroup <em>Target Group</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getPolicyConstraints <em>Policy Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalingPolicyImpl extends NamedElementImpl implements ScalingPolicy {
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScalingTrigger() <em>Scaling Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingTrigger()
	 * @generated
	 * @ordered
	 */
	protected ScalingTrigger scalingTrigger;

	/**
	 * The cached value of the '{@link #getAdjustmentType() <em>Adjustment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustmentType()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustmentType;

	/**
	 * The cached value of the '{@link #getTargetGroup() <em>Target Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroup()
	 * @generated
	 * @ordered
	 */
	protected TargetGroup targetGroup;

	/**
	 * The cached value of the '{@link #getPolicyConstraints() <em>Policy Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyConstraint> policyConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingTrigger getScalingTrigger() {
		return scalingTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingTrigger(ScalingTrigger newScalingTrigger, NotificationChain msgs) {
		ScalingTrigger oldScalingTrigger = scalingTrigger;
		scalingTrigger = newScalingTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__SCALING_TRIGGER, oldScalingTrigger, newScalingTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingTrigger(ScalingTrigger newScalingTrigger) {
		if (newScalingTrigger != scalingTrigger) {
			NotificationChain msgs = null;
			if (scalingTrigger != null)
				msgs = ((InternalEObject)scalingTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__SCALING_TRIGGER, null, msgs);
			if (newScalingTrigger != null)
				msgs = ((InternalEObject)newScalingTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__SCALING_TRIGGER, null, msgs);
			msgs = basicSetScalingTrigger(newScalingTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__SCALING_TRIGGER, newScalingTrigger, newScalingTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmentType getAdjustmentType() {
		return adjustmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdjustmentType(AdjustmentType newAdjustmentType, NotificationChain msgs) {
		AdjustmentType oldAdjustmentType = adjustmentType;
		adjustmentType = newAdjustmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE, oldAdjustmentType, newAdjustmentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustmentType(AdjustmentType newAdjustmentType) {
		if (newAdjustmentType != adjustmentType) {
			NotificationChain msgs = null;
			if (adjustmentType != null)
				msgs = ((InternalEObject)adjustmentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE, null, msgs);
			if (newAdjustmentType != null)
				msgs = ((InternalEObject)newAdjustmentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE, null, msgs);
			msgs = basicSetAdjustmentType(newAdjustmentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE, newAdjustmentType, newAdjustmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroup getTargetGroup() {
		if (targetGroup != null && targetGroup.eIsProxy()) {
			InternalEObject oldTargetGroup = (InternalEObject)targetGroup;
			targetGroup = (TargetGroup)eResolveProxy(oldTargetGroup);
			if (targetGroup != oldTargetGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpdPackage.SCALING_POLICY__TARGET_GROUP, oldTargetGroup, targetGroup));
			}
		}
		return targetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup basicGetTargetGroup() {
		return targetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetGroup(TargetGroup newTargetGroup) {
		TargetGroup oldTargetGroup = targetGroup;
		targetGroup = newTargetGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__TARGET_GROUP, oldTargetGroup, targetGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyConstraint> getPolicyConstraints() {
		if (policyConstraints == null) {
			policyConstraints = new EObjectContainmentEList<PolicyConstraint>(PolicyConstraint.class, this, SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS);
		}
		return policyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
				return basicSetScalingTrigger(null, msgs);
			case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
				return basicSetAdjustmentType(null, msgs);
			case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
				return ((InternalEList<?>)getPolicyConstraints()).basicRemove(otherEnd, msgs);
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
			case SpdPackage.SCALING_POLICY__ACTIVE:
				return isActive();
			case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
				return getScalingTrigger();
			case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
				return getAdjustmentType();
			case SpdPackage.SCALING_POLICY__TARGET_GROUP:
				if (resolve) return getTargetGroup();
				return basicGetTargetGroup();
			case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
				return getPolicyConstraints();
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
			case SpdPackage.SCALING_POLICY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
				setScalingTrigger((ScalingTrigger)newValue);
				return;
			case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
				setAdjustmentType((AdjustmentType)newValue);
				return;
			case SpdPackage.SCALING_POLICY__TARGET_GROUP:
				setTargetGroup((TargetGroup)newValue);
				return;
			case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
				getPolicyConstraints().clear();
				getPolicyConstraints().addAll((Collection<? extends PolicyConstraint>)newValue);
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
			case SpdPackage.SCALING_POLICY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
				setScalingTrigger((ScalingTrigger)null);
				return;
			case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
				setAdjustmentType((AdjustmentType)null);
				return;
			case SpdPackage.SCALING_POLICY__TARGET_GROUP:
				setTargetGroup((TargetGroup)null);
				return;
			case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
				getPolicyConstraints().clear();
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
			case SpdPackage.SCALING_POLICY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
				return scalingTrigger != null;
			case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
				return adjustmentType != null;
			case SpdPackage.SCALING_POLICY__TARGET_GROUP:
				return targetGroup != null;
			case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
				return policyConstraints != null && !policyConstraints.isEmpty();
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
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //ScalingPolicyImpl
