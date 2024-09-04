/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Response Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.OperationResponseTimeImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationResponseTimeImpl extends SourceInterfaceStimulusImpl implements OperationResponseTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationResponseTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.OPERATION_RESPONSE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationSignature getOperationSignature() {
		return (OperationSignature) eDynamicGet(StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE,
				StimuliPackage.Literals.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetOperationSignature() {
		return (OperationSignature) eDynamicGet(StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE,
				StimuliPackage.Literals.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationSignature(OperationSignature newOperationSignature) {
		eDynamicSet(StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE,
				StimuliPackage.Literals.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE, newOperationSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
			if (resolve) {
				return getOperationSignature();
			}
			return basicGetOperationSignature();
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
		case StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) newValue);
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
		case StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) null);
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
		case StimuliPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
			return basicGetOperationSignature() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationResponseTimeImpl
