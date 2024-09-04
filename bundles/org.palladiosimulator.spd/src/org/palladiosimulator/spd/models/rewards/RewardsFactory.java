/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.rewards;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.models.rewards.RewardsPackage
 * @generated
 */
public interface RewardsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RewardsFactory eINSTANCE = org.palladiosimulator.spd.models.rewards.impl.RewardsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>exponential Slo Reward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>exponential Slo Reward</em>'.
	 * @generated
	 */
	exponentialSloReward createexponentialSloReward();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RewardsPackage getRewardsPackage();

} //RewardsFactory
