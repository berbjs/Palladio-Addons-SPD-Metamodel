/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.LogicalOperator;
import org.palladiosimulator.spd.triggers.ScalingTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl#getScalingtrigger <em>Scalingtrigger</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedTriggerImpl extends ScalingTriggerImpl implements ComposedTrigger {
	/**
	 * The cached value of the '{@link #getScalingtrigger() <em>Scalingtrigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingtrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalingTrigger> scalingtrigger;

	/**
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator LOGICAL_OPERATOR_EDEFAULT = LogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.COMPOSED_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScalingTrigger> getScalingtrigger() {
		if (scalingtrigger == null) {
			scalingtrigger = new EObjectContainmentEList<ScalingTrigger>(ScalingTrigger.class, this, TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER);
		}
		return scalingtrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalOperator(LogicalOperator newLogicalOperator) {
		LogicalOperator oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR, oldLogicalOperator, logicalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
				return ((InternalEList<?>)getScalingtrigger()).basicRemove(otherEnd, msgs);
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
			case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
				return getScalingtrigger();
			case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
				return getLogicalOperator();
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
			case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
				getScalingtrigger().clear();
				getScalingtrigger().addAll((Collection<? extends ScalingTrigger>)newValue);
				return;
			case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
				setLogicalOperator((LogicalOperator)newValue);
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
			case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
				getScalingtrigger().clear();
				return;
			case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
				setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
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
			case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
				return scalingtrigger != null && !scalingtrigger.isEmpty();
			case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
				return logicalOperator != LOGICAL_OPERATOR_EDEFAULT;
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
		result.append(" (logicalOperator: ");
		result.append(logicalOperator);
		result.append(')');
		return result.toString();
	}

} //ComposedTriggerImpl
