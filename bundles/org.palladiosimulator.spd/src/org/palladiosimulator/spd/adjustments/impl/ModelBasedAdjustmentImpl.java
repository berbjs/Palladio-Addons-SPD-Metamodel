/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.ModelBasedAdjustment;
import org.palladiosimulator.spd.adjustments.models.BaseModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model Based
 * Adjustment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.adjustments.impl.ModelBasedAdjustmentImpl#getUsedModel
 * <em>Used Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelBasedAdjustmentImpl extends AdjustmentTypeImpl implements ModelBasedAdjustment {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ModelBasedAdjustmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdjustmentsPackage.Literals.MODEL_BASED_ADJUSTMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BaseModel getUsedModel() {
        return (BaseModel) this.eDynamicGet(AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL,
                AdjustmentsPackage.Literals.MODEL_BASED_ADJUSTMENT__USED_MODEL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUsedModel(final BaseModel newUsedModel, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUsedModel,
                AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsedModel(final BaseModel newUsedModel) {
        this.eDynamicSet(AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL,
                AdjustmentsPackage.Literals.MODEL_BASED_ADJUSTMENT__USED_MODEL, newUsedModel);
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
        case AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL:
            return this.basicSetUsedModel(null, msgs);
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
        case AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL:
            return this.getUsedModel();
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
        case AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL:
            this.setUsedModel((BaseModel) newValue);
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
        case AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL:
            this.setUsedModel((BaseModel) null);
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
        case AdjustmentsPackage.MODEL_BASED_ADJUSTMENT__USED_MODEL:
            return this.getUsedModel() != null;
        }
        return super.eIsSet(featureID);
    }

} // ModelBasedAdjustmentImpl
