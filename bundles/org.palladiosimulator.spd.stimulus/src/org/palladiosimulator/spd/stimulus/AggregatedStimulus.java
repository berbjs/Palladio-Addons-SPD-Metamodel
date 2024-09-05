/**
 */
package org.palladiosimulator.spd.stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregationMethod <em>Aggregation Method</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregationPeriod <em>Aggregation Period</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregatedStimulus <em>Aggregated Stimulus</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getAggregatedStimulus()
 * @model
 * @generated
 */
public interface AggregatedStimulus extends Stimulus {
    /**
     * Returns the value of the '<em><b>Aggregation Method</b></em>' attribute.
     * The literals are from the enumeration {@link org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD
     * @see #setAggregationMethod(AGGREGATIONMETHOD)
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getAggregatedStimulus_AggregationMethod()
     * @model required="true"
     * @generated
     */
    AGGREGATIONMETHOD getAggregationMethod();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregationMethod <em>Aggregation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.AGGREGATIONMETHOD
     * @see #getAggregationMethod()
     * @generated
     */
    void setAggregationMethod(AGGREGATIONMETHOD value);

    /**
     * Returns the value of the '<em><b>Aggregation Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Not necessarily present - if it is not present, than the interval given to the model / trigger should be used
     * <!-- end-model-doc -->
     * @return the value of the '<em>Aggregation Period</em>' attribute.
     * @see #setAggregationPeriod(double)
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getAggregatedStimulus_AggregationPeriod()
     * @model
     * @generated
     */
    double getAggregationPeriod();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregationPeriod <em>Aggregation Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation Period</em>' attribute.
     * @see #getAggregationPeriod()
     * @generated
     */
    void setAggregationPeriod(double value);

    /**
     * Returns the value of the '<em><b>Aggregated Stimulus</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregated Stimulus</em>' containment reference.
     * @see #setAggregatedStimulus(Stimulus)
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getAggregatedStimulus_AggregatedStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getAggregatedStimulus();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.stimulus.AggregatedStimulus#getAggregatedStimulus <em>Aggregated Stimulus</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregated Stimulus</em>' containment reference.
     * @see #getAggregatedStimulus()
     * @generated
     */
    void setAggregatedStimulus(Stimulus value);

} // AggregatedStimulus
