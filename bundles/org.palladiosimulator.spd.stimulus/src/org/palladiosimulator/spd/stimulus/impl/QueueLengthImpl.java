/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.PassiveResource;

import org.palladiosimulator.spd.stimulus.QueueLength;
import org.palladiosimulator.spd.stimulus.StimulusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.QueueLengthImpl#getPassiveResource <em>Passive Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueLengthImpl extends SourceInterfaceStimulusImpl implements QueueLength {
    /**
     * The cached value of the '{@link #getPassiveResource() <em>Passive Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassiveResource()
     * @generated
     * @ordered
     */
    protected PassiveResource passiveResource;

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
        return StimulusPackage.Literals.QUEUE_LENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PassiveResource getPassiveResource() {
        if (passiveResource != null && passiveResource.eIsProxy()) {
            InternalEObject oldPassiveResource = (InternalEObject) passiveResource;
            passiveResource = (PassiveResource) eResolveProxy(oldPassiveResource);
            if (passiveResource != oldPassiveResource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE, oldPassiveResource, passiveResource));
            }
        }
        return passiveResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PassiveResource basicGetPassiveResource() {
        return passiveResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPassiveResource(PassiveResource newPassiveResource) {
        PassiveResource oldPassiveResource = passiveResource;
        passiveResource = newPassiveResource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE,
                    oldPassiveResource, passiveResource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
            if (resolve)
                return getPassiveResource();
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
        case StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
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
        case StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
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
        case StimulusPackage.QUEUE_LENGTH__PASSIVE_RESOURCE:
            return passiveResource != null;
        }
        return super.eIsSet(featureID);
    }

} //QueueLengthImpl
