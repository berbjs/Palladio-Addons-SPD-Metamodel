/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>QThresholds
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getInput
 * <em>Input</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getTargetResponseTime
 * <em>Target Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getExponentialSteepness
 * <em>Exponential Steepness</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getUtilizationStimulus
 * <em>Utilization Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getEpsilon
 * <em>Epsilon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QThresholdsModelImpl extends LearningBasedModelImpl implements QThresholdsModel {
    /**
     * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTargetResponseTime()
     * @generated
     * @ordered
     */
    protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 0.0;
    /**
     * The default value of the '{@link #getExponentialSteepness() <em>Exponential Steepness</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExponentialSteepness()
     * @generated
     * @ordered
     */
    protected static final double EXPONENTIAL_STEEPNESS_EDEFAULT = 1.0;

    /**
     * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEpsilon()
     * @generated
     * @ordered
     */
    protected static final double EPSILON_EDEFAULT = 0.05;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QThresholdsModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.QTHRESHOLDS_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getInput() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__INPUT,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInput(final Stimulus newInput, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newInput, ModelsPackage.QTHRESHOLDS_MODEL__INPUT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInput(final Stimulus newInput) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__INPUT, ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT,
                newInput);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getTargetResponseTime() {
        return (Double) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTargetResponseTime(final double newTargetResponseTime) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME, newTargetResponseTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OperationResponseTime getResponseTimeStimulus() {
        return (OperationResponseTime) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
                ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getExponentialSteepness() {
        return (Double) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExponentialSteepness(final double newExponentialSteepness) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS, newExponentialSteepness);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getUtilizationStimulus() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUtilizationStimulus(final Stimulus newUtilizationStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUtilizationStimulus,
                ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUtilizationStimulus(final Stimulus newUtilizationStimulus) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, newUtilizationStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getEpsilon() {
        return (Double) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__EPSILON,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__EPSILON, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEpsilon(final double newEpsilon) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__EPSILON, ModelsPackage.Literals.QTHRESHOLDS_MODEL__EPSILON,
                newEpsilon);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
            return this.basicSetInput(null, msgs);
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
            return this.basicSetResponseTimeStimulus(null, msgs);
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            return this.basicSetUtilizationStimulus(null, msgs);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
            return this.getInput();
        case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime();
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus();
        case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
            return this.getExponentialSteepness();
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus();
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            return this.getEpsilon();
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
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
            this.setInput((Stimulus) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime((Double) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
            this.setExponentialSteepness((Double) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            this.setEpsilon((Double) newValue);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
            this.setInput((Stimulus) null);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) null);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
            this.setExponentialSteepness(EXPONENTIAL_STEEPNESS_EDEFAULT);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) null);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            this.setEpsilon(EPSILON_EDEFAULT);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
            return this.getInput() != null;
        case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
        case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus() != null;
        case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
            return this.getExponentialSteepness() != EXPONENTIAL_STEEPNESS_EDEFAULT;
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus() != null;
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            return this.getEpsilon() != EPSILON_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // QThresholdsModelImpl
