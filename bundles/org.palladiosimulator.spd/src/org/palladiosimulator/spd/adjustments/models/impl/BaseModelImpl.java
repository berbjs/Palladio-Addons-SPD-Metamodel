/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.models.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.adjustments.models.BaseModel;
import org.palladiosimulator.spd.adjustments.models.ModelsPackage;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Model</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl#getInterval
 * <em>Interval</em>}</li>
 * <li>{@link org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl#getInitalIntervalDelay
 * <em>Inital Interval Delay</em>}</li>
 * <li>{@link org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl#getInputs
 * <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseModelImpl extends IdentifierImpl implements BaseModel {
    /**
     * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected static final double INTERVAL_EDEFAULT = 1.0;
    /**
     * The default value of the '{@link #getInitalIntervalDelay() <em>Inital Interval Delay</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInitalIntervalDelay()
     * @generated
     * @ordered
     */
    protected static final double INITAL_INTERVAL_DELAY_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BaseModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.BASE_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getInterval() {
        return (Double) this.eDynamicGet(ModelsPackage.BASE_MODEL__INTERVAL,
                ModelsPackage.Literals.BASE_MODEL__INTERVAL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInterval(final double newInterval) {
        this.eDynamicSet(ModelsPackage.BASE_MODEL__INTERVAL, ModelsPackage.Literals.BASE_MODEL__INTERVAL, newInterval);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getInitalIntervalDelay() {
        return (Double) this.eDynamicGet(ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY,
                ModelsPackage.Literals.BASE_MODEL__INITAL_INTERVAL_DELAY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInitalIntervalDelay(final double newInitalIntervalDelay) {
        this.eDynamicSet(ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY,
                ModelsPackage.Literals.BASE_MODEL__INITAL_INTERVAL_DELAY, newInitalIntervalDelay);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Stimulus> getInputs() {
        return (EList<Stimulus>) this.eDynamicGet(ModelsPackage.BASE_MODEL__INPUTS,
                ModelsPackage.Literals.BASE_MODEL__INPUTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ModelsPackage.BASE_MODEL__INTERVAL:
            return this.getInterval();
        case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
            return this.getInitalIntervalDelay();
        case ModelsPackage.BASE_MODEL__INPUTS:
            return this.getInputs();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ModelsPackage.BASE_MODEL__INTERVAL:
            this.setInterval((Double) newValue);
            return;
        case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
            this.setInitalIntervalDelay((Double) newValue);
            return;
        case ModelsPackage.BASE_MODEL__INPUTS:
            this.getInputs()
                .clear();
            this.getInputs()
                .addAll((Collection<? extends Stimulus>) newValue);
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
        case ModelsPackage.BASE_MODEL__INTERVAL:
            this.setInterval(INTERVAL_EDEFAULT);
            return;
        case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
            this.setInitalIntervalDelay(INITAL_INTERVAL_DELAY_EDEFAULT);
            return;
        case ModelsPackage.BASE_MODEL__INPUTS:
            this.getInputs()
                .clear();
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
        case ModelsPackage.BASE_MODEL__INTERVAL:
            return this.getInterval() != INTERVAL_EDEFAULT;
        case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
            return this.getInitalIntervalDelay() != INITAL_INTERVAL_DELAY_EDEFAULT;
        case ModelsPackage.BASE_MODEL__INPUTS:
            return !this.getInputs()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // BaseModelImpl
