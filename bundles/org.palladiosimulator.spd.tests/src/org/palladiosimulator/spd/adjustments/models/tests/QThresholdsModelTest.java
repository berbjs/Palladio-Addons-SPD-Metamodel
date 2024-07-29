/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.models.tests;

import org.palladiosimulator.spd.adjustments.models.ModelsFactory;
import org.palladiosimulator.spd.adjustments.models.QThresholdsModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>QThresholds Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QThresholdsModelTest extends BaseModelTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(QThresholdsModelTest.class);
    }

    /**
     * Constructs a new QThresholds Model test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public QThresholdsModelTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this QThresholds Model test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected QThresholdsModel getFixture() {
        return (QThresholdsModel) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createQThresholdsModel());
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

} // QThresholdsModelTest
