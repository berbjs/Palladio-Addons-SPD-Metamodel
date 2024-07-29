/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.triggers.StimulusTimeAggregationMethod;
import org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Aggregated
 * Stimulus</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregationOverTime
 * <em>Aggregation Over Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregationPeriod
 * <em>Aggregation Period</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregatedStimulus
 * <em>Aggregated Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedStimulusImpl extends StimulusImpl implements AggregatedStimulus {
    /**
     * The default value of the '{@link #getAggregationOverTime() <em>Aggregation Over Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAggregationOverTime()
     * @generated
     * @ordered
     */
    protected static final StimulusTimeAggregationMethod AGGREGATION_OVER_TIME_EDEFAULT = StimulusTimeAggregationMethod.LAST_PERIOD_AVERAGE;

    /**
     * The default value of the '{@link #getAggregationPeriod() <em>Aggregation Period</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAggregationPeriod()
     * @generated
     * @ordered
     */
    protected static final int AGGREGATION_PERIOD_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AggregatedStimulusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimuliPackage.Literals.AGGREGATED_STIMULUS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StimulusTimeAggregationMethod getAggregationOverTime() {
        return (StimulusTimeAggregationMethod) this.eDynamicGet(
                StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationOverTime(final StimulusTimeAggregationMethod newAggregationOverTime) {
        this.eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME, newAggregationOverTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getAggregationPeriod() {
        return (Integer) this.eDynamicGet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationPeriod(final int newAggregationPeriod) {
        this.eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, newAggregationPeriod);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getAggregatedStimulus() {
        return (Stimulus) this.eDynamicGet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAggregatedStimulus(final Stimulus newAggregatedStimulus, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newAggregatedStimulus,
                StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregatedStimulus(final Stimulus newAggregatedStimulus) {
        this.eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
                StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, newAggregatedStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return this.basicSetAggregatedStimulus(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME:
            return this.getAggregationOverTime();
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            return this.getAggregationPeriod();
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return this.getAggregatedStimulus();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME:
            this.setAggregationOverTime((StimulusTimeAggregationMethod) newValue);
            return;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            this.setAggregationPeriod((Integer) newValue);
            return;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            this.setAggregatedStimulus((Stimulus) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME:
            this.setAggregationOverTime(AGGREGATION_OVER_TIME_EDEFAULT);
            return;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            this.setAggregationPeriod(AGGREGATION_PERIOD_EDEFAULT);
            return;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            this.setAggregatedStimulus((Stimulus) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_OVER_TIME:
            return this.getAggregationOverTime() != AGGREGATION_OVER_TIME_EDEFAULT;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
            return this.getAggregationPeriod() != AGGREGATION_PERIOD_EDEFAULT;
        case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
            return this.getAggregatedStimulus() != null;
        }
        return super.eIsSet(featureID);
    }

} // AggregatedStimulusImpl
