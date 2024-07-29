/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Stimulus
 * Aggregation Method</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getStimulusAggregationMethod()
 * @model
 * @generated
 */
public enum StimulusAggregationMethod implements Enumerator {
    /**
     * The '<em><b>Last Period Average</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #LAST_PERIOD_AVERAGE_VALUE
     * @generated
     * @ordered
     */
    LAST_PERIOD_AVERAGE(0, "LastPeriodAverage", "LastPeriodAverage"),

    /**
     * The '<em><b>Rate Of Change</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #RATE_OF_CHANGE_VALUE
     * @generated
     * @ordered
     */
    RATE_OF_CHANGE(1, "RateOfChange", "RateOfChange");

    /**
     * The '<em><b>Last Period Average</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #LAST_PERIOD_AVERAGE
     * @model name="LastPeriodAverage"
     * @generated
     * @ordered
     */
    public static final int LAST_PERIOD_AVERAGE_VALUE = 0;

    /**
     * The '<em><b>Rate Of Change</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #RATE_OF_CHANGE
     * @model name="RateOfChange"
     * @generated
     * @ordered
     */
    public static final int RATE_OF_CHANGE_VALUE = 1;

    /**
     * An array of all the '<em><b>Stimulus Aggregation Method</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final StimulusAggregationMethod[] VALUES_ARRAY = new StimulusAggregationMethod[] {
            LAST_PERIOD_AVERAGE, RATE_OF_CHANGE, };

    /**
     * A public read-only list of all the '<em><b>Stimulus Aggregation Method</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<StimulusAggregationMethod> VALUES = Collections
        .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Stimulus Aggregation Method</b></em>' literal with the specified literal
     * value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StimulusAggregationMethod get(final String literal) {
        for (final StimulusAggregationMethod result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Stimulus Aggregation Method</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StimulusAggregationMethod getByName(final String name) {
        for (final StimulusAggregationMethod result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Stimulus Aggregation Method</b></em>' literal with the specified integer
     * value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StimulusAggregationMethod get(final int value) {
        switch (value) {
        case LAST_PERIOD_AVERAGE_VALUE:
            return LAST_PERIOD_AVERAGE;
        case RATE_OF_CHANGE_VALUE:
            return RATE_OF_CHANGE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private StimulusAggregationMethod(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} // StimulusAggregationMethod
