/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.tests;

import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.adjustments.ModelBasedAdjustment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Model Based
 * Adjustment</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelBasedAdjustmentTest extends AdjustmentTypeTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ModelBasedAdjustmentTest.class);
    }

    /**
     * Constructs a new Model Based Adjustment test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelBasedAdjustmentTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Model Based Adjustment test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ModelBasedAdjustment getFixture() {
        return (ModelBasedAdjustment) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(AdjustmentsFactory.eINSTANCE.createModelBasedAdjustment());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        this.setFixture(null);
    }

} // ModelBasedAdjustmentTest
