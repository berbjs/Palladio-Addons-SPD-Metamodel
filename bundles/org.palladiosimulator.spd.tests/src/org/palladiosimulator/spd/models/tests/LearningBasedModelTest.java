/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Learning Based Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LearningBasedModelTest extends BaseModelTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(LearningBasedModelTest.class);
    }

    /**
     * Constructs a new Learning Based Model test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LearningBasedModelTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Learning Based Model test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected LearningBasedModel getFixture() {
        return (LearningBasedModel) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createLearningBasedModel());
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

} // LearningBasedModelTest
