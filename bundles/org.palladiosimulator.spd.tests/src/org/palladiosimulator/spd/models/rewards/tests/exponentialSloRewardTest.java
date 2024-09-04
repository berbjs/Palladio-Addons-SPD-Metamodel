/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards.tests;

import org.palladiosimulator.spd.models.rewards.RewardsFactory;
import org.palladiosimulator.spd.models.rewards.exponentialSloReward;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>exponential Slo Reward</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class exponentialSloRewardTest extends BaseRewardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(exponentialSloRewardTest.class);
	}

	/**
	 * Constructs a new exponential Slo Reward test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exponentialSloRewardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this exponential Slo Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected exponentialSloReward getFixture() {
		return (exponentialSloReward) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RewardsFactory.eINSTANCE.createexponentialSloReward());
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

} //exponentialSloRewardTest
