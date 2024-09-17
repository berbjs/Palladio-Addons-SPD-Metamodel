/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Improved QLearning
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getInput
 * <em>Input</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getEpsilon
 * <em>Epsilon</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getActionCount
 * <em>Action Count</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getTargetResponseTime
 * <em>Target Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getExponentialSteepness
 * <em>Exponential Steepness</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getUtilizationStimulus
 * <em>Utilization Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getDiscountFactor
 * <em>Discount Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImprovedQLearningModelImpl extends LearningBasedModelImpl implements ImprovedQLearningModel {
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
     * The default value of the '{@link #getActionCount() <em>Action Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActionCount()
     * @generated
     * @ordered
     */
    protected static final int ACTION_COUNT_EDEFAULT = 5;
    /**
     * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTargetResponseTime()
     * @generated
     * @ordered
     */
    protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 1.0;
    /**
     * The default value of the '{@link #getExponentialSteepness() <em>Exponential Steepness</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExponentialSteepness()
     * @generated
     * @ordered
     */
    protected static final double EXPONENTIAL_STEEPNESS_EDEFAULT = 2.0;

    /**
     * The default value of the '{@link #getDiscountFactor() <em>Discount Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDiscountFactor()
     * @generated
     * @ordered
     */
    protected static final double DISCOUNT_FACTOR_EDEFAULT = 0.5;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ImprovedQLearningModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getInput() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInput(final Stimulus newInput, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newInput, ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInput(final Stimulus newInput) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT, newInput);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getEpsilon() {
        return (Double) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EPSILON, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEpsilon(final double newEpsilon) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EPSILON, newEpsilon);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getActionCount() {
        return (Integer) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__ACTION_COUNT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setActionCount(final int newActionCount) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__ACTION_COUNT, newActionCount);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getTargetResponseTime() {
        return (Double) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTargetResponseTime(final double newTargetResponseTime) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME, newTargetResponseTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OperationResponseTime getResponseTimeStimulus() {
        return (OperationResponseTime) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
                ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getExponentialSteepness() {
        return (Double) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExponentialSteepness(final double newExponentialSteepness) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS, newExponentialSteepness);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getUtilizationStimulus() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUtilizationStimulus(final Stimulus newUtilizationStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUtilizationStimulus,
                ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUtilizationStimulus(final Stimulus newUtilizationStimulus) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, newUtilizationStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDiscountFactor() {
        return (Double) this.eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDiscountFactor(final double newDiscountFactor) {
        this.eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR, newDiscountFactor);
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
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
            return this.basicSetInput(null, msgs);
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.basicSetResponseTimeStimulus(null, msgs);
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
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
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
            return this.getInput();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
            return this.getEpsilon();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
            return this.getActionCount();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
            return this.getExponentialSteepness();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor();
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
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
            this.setInput((Stimulus) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
            this.setEpsilon((Double) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
            this.setActionCount((Integer) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime((Double) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
            this.setExponentialSteepness((Double) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) newValue);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor((Double) newValue);
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
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
            this.setInput((Stimulus) null);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
            this.setEpsilon(EPSILON_EDEFAULT);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
            this.setActionCount(ACTION_COUNT_EDEFAULT);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) null);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
            this.setExponentialSteepness(EXPONENTIAL_STEEPNESS_EDEFAULT);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) null);
            return;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor(DISCOUNT_FACTOR_EDEFAULT);
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
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
            return this.getInput() != null;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
            return this.getEpsilon() != EPSILON_EDEFAULT;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
            return this.getActionCount() != ACTION_COUNT_EDEFAULT;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus() != null;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
            return this.getExponentialSteepness() != EXPONENTIAL_STEEPNESS_EDEFAULT;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus() != null;
        case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor() != DISCOUNT_FACTOR_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ImprovedQLearningModelImpl
