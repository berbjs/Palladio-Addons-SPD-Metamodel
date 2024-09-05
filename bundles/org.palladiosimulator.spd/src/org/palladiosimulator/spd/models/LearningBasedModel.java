/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.palladiosimulator.spdmodelreward.ModelReward;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Learning Based
 * Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Learning-based models have at least one stimulus as input and some
 * reward that is used for the learning process. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.LearningBasedModel#getReward <em>Reward</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel()
 * @model abstract="true"
 * @generated
 */
public interface LearningBasedModel extends BaseModel {
    /**
     * Returns the value of the '<em><b>Reward</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Reward</em>' reference.
     * @see #setReward(ModelReward)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel_Reward()
     * @model required="true"
     * @generated
     */
    ModelReward getReward();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.LearningBasedModel#getReward
     * <em>Reward</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Reward</em>' reference.
     * @see #getReward()
     * @generated
     */
    void setReward(ModelReward value);

} // LearningBasedModel
