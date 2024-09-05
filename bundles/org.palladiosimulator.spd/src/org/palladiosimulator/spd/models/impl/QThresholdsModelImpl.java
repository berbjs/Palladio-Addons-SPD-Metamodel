/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.stimulus.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>QThresholds
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getInput
 * <em>Input</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getUtilizationStimulus
 * <em>Utilization Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getLearningRate
 * <em>Learning Rate</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getEpsilon
 * <em>Epsilon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QThresholdsModelImpl extends LearningBasedModelImpl implements QThresholdsModel {
    /**
     * The default value of the '{@link #getLearningRate() <em>Learning Rate</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLearningRate()
     * @generated
     * @ordered
     */
    protected static final double LEARNING_RATE_EDEFAULT = 0.1;
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
    public double getLearningRate() {
        return (Double) this.eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__LEARNING_RATE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLearningRate(final double newLearningRate) {
        this.eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE,
                ModelsPackage.Literals.QTHRESHOLDS_MODEL__LEARNING_RATE, newLearningRate);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus();
        case ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE:
            return this.getLearningRate();
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
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) newValue);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE:
            this.setLearningRate((Double) newValue);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            this.setUtilizationStimulus((Stimulus) null);
            return;
        case ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE:
            this.setLearningRate(LEARNING_RATE_EDEFAULT);
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
        case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
            return this.getUtilizationStimulus() != null;
        case ModelsPackage.QTHRESHOLDS_MODEL__LEARNING_RATE:
            return this.getLearningRate() != LEARNING_RATE_EDEFAULT;
        case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
            return this.getEpsilon() != EPSILON_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // QThresholdsModelImpl
