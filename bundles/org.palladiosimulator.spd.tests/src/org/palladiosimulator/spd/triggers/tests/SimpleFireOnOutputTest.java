/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.tests;

import org.palladiosimulator.spd.triggers.SimpleFireOnOutput;
import org.palladiosimulator.spd.triggers.TriggersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Fire On Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleFireOnOutputTest extends BaseTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleFireOnOutputTest.class);
	}

	/**
	 * Constructs a new Simple Fire On Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFireOnOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Fire On Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleFireOnOutput getFixture() {
		return (SimpleFireOnOutput) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createSimpleFireOnOutput());
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

} //SimpleFireOnOutputTest
