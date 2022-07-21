/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.adjustments.tests;

import de.unistuttgart.slingshot.spd.adjustments.AbsoluteAdjustment;
import de.unistuttgart.slingshot.spd.adjustments.AdjustmentsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Absolute Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsoluteAdjustmentTest extends AdjustmentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbsoluteAdjustmentTest.class);
	}

	/**
	 * Constructs a new Absolute Adjustment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteAdjustmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Absolute Adjustment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbsoluteAdjustment getFixture() {
		return (AbsoluteAdjustment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdjustmentsFactory.eINSTANCE.createAbsoluteAdjustment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AbsoluteAdjustmentTest
