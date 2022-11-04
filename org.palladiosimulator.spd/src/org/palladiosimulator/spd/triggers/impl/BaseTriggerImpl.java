/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.spd.triggers.BaseTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;

import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;

import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseTriggerImpl extends ScalingTriggerImpl implements BaseTrigger {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Stimulus stimulus;

	/**
	 * The cached value of the '{@link #getExpectedValue() <em>Expected Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected ExpectedValue expectedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.BASE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulus(Stimulus newStimulus, NotificationChain msgs) {
		Stimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.BASE_TRIGGER__STIMULUS, oldStimulus, newStimulus);
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
	public void setStimulus(Stimulus newStimulus) {
		if (newStimulus != stimulus) {
			NotificationChain msgs = null;
			if (stimulus != null)
				msgs = ((InternalEObject)stimulus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.BASE_TRIGGER__STIMULUS, null, msgs);
			if (newStimulus != null)
				msgs = ((InternalEObject)newStimulus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.BASE_TRIGGER__STIMULUS, null, msgs);
			msgs = basicSetStimulus(newStimulus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.BASE_TRIGGER__STIMULUS, newStimulus, newStimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpectedValue getExpectedValue() {
		return expectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedValue(ExpectedValue newExpectedValue, NotificationChain msgs) {
		ExpectedValue oldExpectedValue = expectedValue;
		expectedValue = newExpectedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE, oldExpectedValue, newExpectedValue);
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
	public void setExpectedValue(ExpectedValue newExpectedValue) {
		if (newExpectedValue != expectedValue) {
			NotificationChain msgs = null;
			if (expectedValue != null)
				msgs = ((InternalEObject)expectedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE, null, msgs);
			if (newExpectedValue != null)
				msgs = ((InternalEObject)newExpectedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE, null, msgs);
			msgs = basicSetExpectedValue(newExpectedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE, newExpectedValue, newExpectedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.BASE_TRIGGER__STIMULUS:
				return basicSetStimulus(null, msgs);
			case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
				return basicSetExpectedValue(null, msgs);
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
			case TriggersPackage.BASE_TRIGGER__STIMULUS:
				return getStimulus();
			case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
				return getExpectedValue();
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
			case TriggersPackage.BASE_TRIGGER__STIMULUS:
				setStimulus((Stimulus)newValue);
				return;
			case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
				setExpectedValue((ExpectedValue)newValue);
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
			case TriggersPackage.BASE_TRIGGER__STIMULUS:
				setStimulus((Stimulus)null);
				return;
			case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
				setExpectedValue((ExpectedValue)null);
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
			case TriggersPackage.BASE_TRIGGER__STIMULUS:
				return stimulus != null;
			case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
				return expectedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseTriggerImpl
