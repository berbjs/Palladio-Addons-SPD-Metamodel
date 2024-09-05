/**
 */
package org.palladiosimulator.spd.stimulus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.stimulus.AggregatedStimulus;
import org.palladiosimulator.spd.stimulus.Stimulus;
import org.palladiosimulator.spd.stimulus.StimulusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.AggregatedStimulusImpl#getAggregationMethod <em>Aggregation Method</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.AggregatedStimulusImpl#getAggregationPeriod <em>Aggregation Period</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.stimulus.impl.AggregatedStimulusImpl#getAggregatedStimulus <em>Aggregated Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedStimulusImpl extends StimulusImpl implements AggregatedStimulus {
    /**
     * The default value of the '{@link #getAggregationMethod() <em>Aggregation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationMethod()
     * @generated
     * @ordered
     */
    protected static final AGGREGATIONMETHOD AGGREGATION_METHOD_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

    /**
     * The cached value of the '{@link #getAggregationMethod() <em>Aggregation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationMethod()
     * @generated
     * @ordered
     */
    protected AGGREGATIONMETHOD aggregationMethod = AGGREGATION_METHOD_EDEFAULT;

    /**
     * The default value of the '{@link #getAggregationPeriod() <em>Aggregation Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationPeriod()
     * @generated
     * @ordered
     */
    protected static final double AGGREGATION_PERIOD_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAggregationPeriod() <em>Aggregation Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationPeriod()
     * @generated
     * @ordered
     */
    protected double aggregationPeriod = AGGREGATION_PERIOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getAggregatedStimulus() <em>Aggregated Stimulus</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregatedStimulus()
     * @generated
     * @ordered
     */
    protected Stimulus aggregatedStimulus;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AggregatedStimulusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimulusPackage.Literals.AGGREGATED_STIMULUS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AGGREGATIONMETHOD getAggregationMethod() {
        return aggregationMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregationMethod(AGGREGATIONMETHOD newAggregationMethod) {
        AGGREGATIONMETHOD oldAggregationMethod = aggregationMethod;
        aggregationMethod = newAggregationMethod == null ? AGGREGATION_METHOD_EDEFAULT : newAggregationMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD, oldAggregationMethod, aggregationMethod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getAggregationPeriod() {
        return aggregationPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregationPeriod(double newAggregationPeriod) {
        double oldAggregationPeriod = aggregationPeriod;
        aggregationPeriod = newAggregationPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, oldAggregationPeriod, aggregationPeriod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Stimulus getAggregatedStimulus() {
        return aggregatedStimulus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAggregatedStimulus(Stimulus newAggregatedStimulus, NotificationChain msgs) {
        Stimulus oldAggregatedStimulus = aggregatedStimulus;
        aggregatedStimulus = newAggregatedStimulus;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, oldAggregatedStimulus,
                    newAggregatedStimulus);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregatedStimulus(Stimulus newAggregatedStimulus) {
        if (newAggregatedStimulus != aggregatedStimulus) {
            NotificationChain msgs = null;
            if (aggregatedStimulus != null)
                msgs = ((InternalEObject) aggregatedStimulus).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, null, msgs);
            if (newAggregatedStimulus != null)
                msgs = ((InternalEObject) newAggregatedStimulus).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, null, msgs);
            msgs = basicSetAggregatedStimulus(newAggregatedStimulus, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, newAggregatedStimulus,
                    newAggregatedStimulus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return basicSetAggregatedStimulus(null, msgs);
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
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
            return getAggregationMethod();
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            return getAggregationPeriod();
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return getAggregatedStimulus();
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
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
            setAggregationMethod((AGGREGATIONMETHOD) newValue);
            return;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            setAggregationPeriod((Double) newValue);
            return;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            setAggregatedStimulus((Stimulus) newValue);
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
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
            setAggregationMethod(AGGREGATION_METHOD_EDEFAULT);
            return;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            setAggregationPeriod(AGGREGATION_PERIOD_EDEFAULT);
            return;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            setAggregatedStimulus((Stimulus) null);
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
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
            return aggregationMethod != AGGREGATION_METHOD_EDEFAULT;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            return aggregationPeriod != AGGREGATION_PERIOD_EDEFAULT;
        case StimulusPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return aggregatedStimulus != null;
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
        result.append(" (aggregationMethod: ");
        result.append(aggregationMethod);
        result.append(", aggregationPeriod: ");
        result.append(aggregationPeriod);
        result.append(')');
        return result.toString();
    }

} //AggregatedStimulusImpl
