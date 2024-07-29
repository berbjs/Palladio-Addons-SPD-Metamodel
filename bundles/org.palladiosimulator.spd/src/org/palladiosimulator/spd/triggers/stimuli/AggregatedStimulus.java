/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.palladiosimulator.spd.triggers.StimulusTimeAggregationMethod;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Aggregated
 * Stimulus</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregationOverTime
 * <em>Aggregation Over Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregationPeriod
 * <em>Aggregation Period</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregatedStimulus
 * <em>Aggregated Stimulus</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getAggregatedStimulus()
 * @model
 * @generated
 */
public interface AggregatedStimulus extends Stimulus {
    /**
     * Returns the value of the '<em><b>Aggregation Over Time</b></em>' attribute. The literals are
     * from the enumeration
     * {@link org.palladiosimulator.spd.triggers.stimuli.StimulusAggregationMethod}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Aggregation Over Time</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.stimuli.StimulusAggregationMethod
     * @see #setAggregationOverTime(StimulusAggregationMethod)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getAggregatedStimulus_AggregationOverTime()
     * @model required="true"
     * @generated
     */
    StimulusTimeAggregationMethod getAggregationOverTime();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregationOverTime
     * <em>Aggregation Over Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Aggregation Over Time</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.StimulusTimeAggregationMethod
     * @see #getAggregationOverTime()
     * @generated
     */
    void setAggregationOverTime(StimulusTimeAggregationMethod value);

    /**
     * Returns the value of the '<em><b>Aggregation Period</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Not necessarily present - if it is not
     * present, than the interval given to the model / trigger should be used <!-- end-model-doc -->
     *
     * @return the value of the '<em>Aggregation Period</em>' attribute.
     * @see #setAggregationPeriod(int)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getAggregatedStimulus_AggregationPeriod()
     * @model
     * @generated
     */
    int getAggregationPeriod();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregationPeriod
     * <em>Aggregation Period</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Aggregation Period</em>' attribute.
     * @see #getAggregationPeriod()
     * @generated
     */
    void setAggregationPeriod(int value);

    /**
     * Returns the value of the '<em><b>Aggregated Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Aggregated Stimulus</em>' containment reference.
     * @see #setAggregatedStimulus(Stimulus)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getAggregatedStimulus_AggregatedStimulus()
     * @model containment="true"
     * @generated
     */
    Stimulus getAggregatedStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus#getAggregatedStimulus
     * <em>Aggregated Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Aggregated Stimulus</em>' containment reference.
     * @see #getAggregatedStimulus()
     * @generated
     */
    void setAggregatedStimulus(Stimulus value);

} // AggregatedStimulus
