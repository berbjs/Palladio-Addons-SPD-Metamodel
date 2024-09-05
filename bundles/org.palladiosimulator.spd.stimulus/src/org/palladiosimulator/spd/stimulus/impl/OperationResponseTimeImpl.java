/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.OperationSignature;

import org.palladiosimulator.spd.stimulus.OperationResponseTime;
import org.palladiosimulator.spd.stimulus.StimulusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Response Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.OperationResponseTimeImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationResponseTimeImpl extends SourceInterfaceStimulusImpl implements OperationResponseTime {
    /**
     * The cached value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationSignature()
     * @generated
     * @ordered
     */
    protected OperationSignature operationSignature;

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
        return StimulusPackage.Literals.OPERATION_RESPONSE_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationSignature getOperationSignature() {
        if (operationSignature != null && operationSignature.eIsProxy()) {
            InternalEObject oldOperationSignature = (InternalEObject) operationSignature;
            operationSignature = (OperationSignature) eResolveProxy(oldOperationSignature);
            if (operationSignature != oldOperationSignature) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE, oldOperationSignature,
                            operationSignature));
            }
        }
        return operationSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationSignature basicGetOperationSignature() {
        return operationSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationSignature(OperationSignature newOperationSignature) {
        OperationSignature oldOperationSignature = operationSignature;
        operationSignature = newOperationSignature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE, oldOperationSignature,
                    operationSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
            if (resolve)
                return getOperationSignature();
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
        case StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
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
        case StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
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
        case StimulusPackage.OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE:
            return operationSignature != null;
        }
        return super.eIsSet(featureID);
    }

} //OperationResponseTimeImpl
