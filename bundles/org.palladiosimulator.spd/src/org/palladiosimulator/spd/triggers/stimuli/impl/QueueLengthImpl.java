/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.spd.triggers.stimuli.QueueLength;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.QueueLengthImpl#getPassiveResource <em>Passive Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueLengthImpl extends SourceInterfaceStimulusImpl implements QueueLength {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueLengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.QUEUE_LENGTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassiveResource getPassiveResource() {
		return (PassiveResource) eDynamicGet(StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE,
				StimuliPackage.Literals.QUEUE_LENGTH__PASSIVE_RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource basicGetPassiveResource() {
		return (PassiveResource) eDynamicGet(StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE,
				StimuliPackage.Literals.QUEUE_LENGTH__PASSIVE_RESOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveResource(PassiveResource newPassiveResource) {
		eDynamicSet(StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE,
				StimuliPackage.Literals.QUEUE_LENGTH__PASSIVE_RESOURCE, newPassiveResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
			if (resolve) {
				return getPassiveResource();
			}
			return basicGetPassiveResource();
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
		case StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
			setPassiveResource((PassiveResource) newValue);
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
		case StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
			setPassiveResource((PassiveResource) null);
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
		case StimuliPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
			return basicGetPassiveResource() != null;
		}
		return super.eIsSet(featureID);
	}

} //QueueLengthImpl
