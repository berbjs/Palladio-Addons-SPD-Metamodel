/**
 */
package org.palladiosimulator.spdmodelreward;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Reward
 * Aggregation Method</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getRewardAggregationMethod()
 * @model
 * @generated
 */
public enum RewardAggregationMethod implements Enumerator {
    /**
     * The '<em><b>ADDITION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #ADDITION_VALUE
     * @generated
     * @ordered
     */
    ADDITION(0, "ADDITION", "ADDITION"),

    /**
     * The '<em><b>SUBTRACTION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #SUBTRACTION_VALUE
     * @generated
     * @ordered
     */
    SUBTRACTION(1, "SUBTRACTION", "SUBTRACTION"),

    /**
     * The '<em><b>MULTIPLICATION</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #MULTIPLICATION_VALUE
     * @generated
     * @ordered
     */
    MULTIPLICATION(2, "MULTIPLICATION", "MULTIPLICATION"),

    /**
     * The '<em><b>DIVISION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #DIVISION_VALUE
     * @generated
     * @ordered
     */
    DIVISION(3, "DIVISION", "DIVISION"),

    /**
     * The '<em><b>EXPONENTIAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #EXPONENTIAL_VALUE
     * @generated
     * @ordered
     */
    EXPONENTIAL(4, "EXPONENTIAL", "EXPONENTIAL");

    /**
     * The '<em><b>ADDITION</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #ADDITION
     * @model
     * @generated
     * @ordered
     */
    public static final int ADDITION_VALUE = 0;

    /**
     * The '<em><b>SUBTRACTION</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #SUBTRACTION
     * @model
     * @generated
     * @ordered
     */
    public static final int SUBTRACTION_VALUE = 1;

    /**
     * The '<em><b>MULTIPLICATION</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #MULTIPLICATION
     * @model
     * @generated
     * @ordered
     */
    public static final int MULTIPLICATION_VALUE = 2;

    /**
     * The '<em><b>DIVISION</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #DIVISION
     * @model
     * @generated
     * @ordered
     */
    public static final int DIVISION_VALUE = 3;

    /**
     * The '<em><b>EXPONENTIAL</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #EXPONENTIAL
     * @model
     * @generated
     * @ordered
     */
    public static final int EXPONENTIAL_VALUE = 4;

    /**
     * An array of all the '<em><b>Reward Aggregation Method</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final RewardAggregationMethod[] VALUES_ARRAY = new RewardAggregationMethod[] { ADDITION, SUBTRACTION,
            MULTIPLICATION, DIVISION, EXPONENTIAL, };

    /**
     * A public read-only list of all the '<em><b>Reward Aggregation Method</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<RewardAggregationMethod> VALUES = Collections
        .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Reward Aggregation Method</b></em>' literal with the specified literal
     * value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RewardAggregationMethod get(final String literal) {
        for (final RewardAggregationMethod result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Reward Aggregation Method</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RewardAggregationMethod getByName(final String name) {
        for (final RewardAggregationMethod result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Reward Aggregation Method</b></em>' literal with the specified integer
     * value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RewardAggregationMethod get(final int value) {
        switch (value) {
        case ADDITION_VALUE:
            return ADDITION;
        case SUBTRACTION_VALUE:
            return SUBTRACTION;
        case MULTIPLICATION_VALUE:
            return MULTIPLICATION;
        case DIVISION_VALUE:
            return DIVISION;
        case EXPONENTIAL_VALUE:
            return EXPONENTIAL;
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
    private RewardAggregationMethod(final int value, final String name, final String literal) {
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

} // RewardAggregationMethod
