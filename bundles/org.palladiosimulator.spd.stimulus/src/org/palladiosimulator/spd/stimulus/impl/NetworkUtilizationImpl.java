/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE;
import org.palladiosimulator.spd.stimulus.NetworkUtilization;
import org.palladiosimulator.spd.stimulus.StimulusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Utilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.NetworkUtilizationImpl#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkUtilizationImpl extends ResourceUtilizationStimulusImpl implements NetworkUtilization {
    /**
     * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected static final NETWORKUSAGETYPE USAGE_TYPE_EDEFAULT = NETWORKUSAGETYPE.SEND;

    /**
     * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected NETWORKUSAGETYPE usageType = USAGE_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NetworkUtilizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimulusPackage.Literals.NETWORK_UTILIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NETWORKUSAGETYPE getUsageType() {
        return usageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsageType(NETWORKUSAGETYPE newUsageType) {
        NETWORKUSAGETYPE oldUsageType = usageType;
        usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StimulusPackage.NETWORK_UTILIZATION__USAGE_TYPE,
                    oldUsageType, usageType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case StimulusPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            return getUsageType();
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
        case StimulusPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            setUsageType((NETWORKUSAGETYPE) newValue);
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
        case StimulusPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            setUsageType(USAGE_TYPE_EDEFAULT);
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
        case StimulusPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            return usageType != USAGE_TYPE_EDEFAULT;
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
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (usageType: ");
        result.append(usageType);
        result.append(')');
        return result.toString();
    }

} //NetworkUtilizationImpl
