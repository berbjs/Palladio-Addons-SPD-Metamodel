/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards.tests;

import org.palladiosimulator.spd.models.rewards.ExponentialSloReward;
import org.palladiosimulator.spd.models.rewards.RewardsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exponential Slo Reward</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialSloRewardTest extends BaseRewardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExponentialSloRewardTest.class);
	}

	/**
	 * Constructs a new Exponential Slo Reward test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialSloRewardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exponential Slo Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExponentialSloReward getFixture() {
		return (ExponentialSloReward) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RewardsFactory.eINSTANCE.createExponentialSloReward());
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

} //ExponentialSloRewardTest
