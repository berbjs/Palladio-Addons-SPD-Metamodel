/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.palladiosimulator.spd.stimulus.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>QThresholds Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput <em>Input</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus
 * <em>Utilization Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getLearningRate <em>Learning
 * Rate</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon <em>Epsilon</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel()
 * @model
 * @generated
 */
public interface QThresholdsModel extends LearningBasedModel {

    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Input</em>' containment reference.
     * @see #setInput(Stimulus)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_Input()
     * @model containment="true"
     * @generated
     */
    Stimulus getInput();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput
     * <em>Input</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Input</em>' containment reference.
     * @see #getInput()
     * @generated
     */
    void setInput(Stimulus value);

    /**
     * Returns the value of the '<em><b>Utilization Stimulus</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Utilization Stimulus</em>' reference.
     * @see #setUtilizationStimulus(Stimulus)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_UtilizationStimulus()
     * @model
     * @generated
     */
    Stimulus getUtilizationStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus
     * <em>Utilization Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Utilization Stimulus</em>' containment reference.
     * @see #getUtilizationStimulus()
     * @generated
     */
    void setUtilizationStimulus(Stimulus value);

    /**
     * Returns the value of the '<em><b>Learning Rate</b></em>' attribute. The default value is
     * <code>"0.1"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Learning Rate</em>' attribute.
     * @see #setLearningRate(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_LearningRate()
     * @model default="0.1" dataType="org.palladiosimulator.spd.models.PercentDouble"
     *        required="true"
     * @generated
     */
    double getLearningRate();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getLearningRate <em>Learning
     * Rate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Learning Rate</em>' attribute.
     * @see #getLearningRate()
     * @generated
     */
    void setLearningRate(double value);

    /**
     * Returns the value of the '<em><b>Epsilon</b></em>' attribute. The default value is
     * <code>"0.05"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Epsilon</em>' attribute.
     * @see #setEpsilon(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_Epsilon()
     * @model default="0.05" dataType="org.palladiosimulator.spd.models.PercentDouble"
     *        required="true"
     * @generated
     */
    double getEpsilon();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon
     * <em>Epsilon</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Epsilon</em>' attribute.
     * @see #getEpsilon()
     * @generated
     */
    void setEpsilon(double value);
} // QThresholdsModel
