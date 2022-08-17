/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.spd.triggers.TimeBasedTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TimeBasedTriggerImpl extends ThresholdBasedTriggerImpl implements TimeBasedTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBasedTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.TIME_BASED_TRIGGER;
	}

} //TimeBasedTriggerImpl
