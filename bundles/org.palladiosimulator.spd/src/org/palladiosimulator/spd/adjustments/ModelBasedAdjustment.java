/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments;

import org.palladiosimulator.spd.adjustments.models.BaseModel;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model Based
 * Adjustment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ModelBasedAdjustment denotes that the group will be adjusted based
 * on a model <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.adjustments.ModelBasedAdjustment#getUsedModel <em>Used
 * Model</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage#getModelBasedAdjustment()
 * @model
 * @generated
 */
public interface ModelBasedAdjustment extends AdjustmentType {
    /**
     * Returns the value of the '<em><b>Used Model</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Used Model</em>' containment reference.
     * @see #setUsedModel(BaseModel)
     * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage#getModelBasedAdjustment_UsedModel()
     * @model containment="true" required="true"
     * @generated
     */
    BaseModel getUsedModel();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.adjustments.ModelBasedAdjustment#getUsedModel <em>Used
     * Model</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Used Model</em>' containment reference.
     * @see #getUsedModel()
     * @generated
     */
    void setUsedModel(BaseModel value);

} // ModelBasedAdjustment
