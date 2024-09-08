/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.tests;

import org.palladiosimulator.spd.constraints.target.TargetFactory;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;
import org.palladiosimulator.spd.constraints.tests.TemporalConstraintTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Thrashing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ThrashingConstraintTest extends TemporalConstraintTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ThrashingConstraintTest.class);
    }

    /**
     * Constructs a new Thrashing Constraint test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ThrashingConstraintTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Thrashing Constraint test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ThrashingConstraint getFixture() {
        return (ThrashingConstraint) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TargetFactory.eINSTANCE.createThrashingConstraint());
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

} // ThrashingConstraintTest
