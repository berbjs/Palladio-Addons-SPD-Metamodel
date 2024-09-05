/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.stimulus.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.stimulus.StimulusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Elements State Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.ManagedElementsStateStimulusImpl#getAggregationOverElements <em>Aggregation Over Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ManagedElementsStateStimulusImpl extends TargetGroupStateStimulusImpl
        implements ManagedElementsStateStimulus {
    /**
     * The default value of the '{@link #getAggregationOverElements() <em>Aggregation Over Elements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationOverElements()
     * @generated
     * @ordered
     */
    protected static final AGGREGATIONMETHOD AGGREGATION_OVER_ELEMENTS_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

    /**
     * The cached value of the '{@link #getAggregationOverElements() <em>Aggregation Over Elements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationOverElements()
     * @generated
     * @ordered
     */
    protected AGGREGATIONMETHOD aggregationOverElements = AGGREGATION_OVER_ELEMENTS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManagedElementsStateStimulusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimulusPackage.Literals.MANAGED_ELEMENTS_STATE_STIMULUS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AGGREGATIONMETHOD getAggregationOverElements() {
        return aggregationOverElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregationOverElements(AGGREGATIONMETHOD newAggregationOverElements) {
        AGGREGATIONMETHOD oldAggregationOverElements = aggregationOverElements;
        aggregationOverElements = newAggregationOverElements == null ? AGGREGATION_OVER_ELEMENTS_EDEFAULT
                : newAggregationOverElements;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS,
                    oldAggregationOverElements, aggregationOverElements));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case StimulusPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            return getAggregationOverElements();
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
        case StimulusPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            setAggregationOverElements((AGGREGATIONMETHOD) newValue);
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
        case StimulusPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            setAggregationOverElements(AGGREGATION_OVER_ELEMENTS_EDEFAULT);
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
        case StimulusPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            return aggregationOverElements != AGGREGATION_OVER_ELEMENTS_EDEFAULT;
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
        result.append(" (aggregationOverElements: ");
        result.append(aggregationOverElements);
        result.append(')');
        return result.toString();
    }

} //ManagedElementsStateStimulusImpl
