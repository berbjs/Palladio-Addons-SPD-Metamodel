/**
 */
package org.palladiosimulator.spdmodelreward;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage
 * @generated
 */
public interface SpdmodelrewardFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SpdmodelrewardFactory eINSTANCE = org.palladiosimulator.spdmodelreward.impl.SpdmodelrewardFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Static Reward</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Static Reward</em>'.
     * @generated
     */
    StaticReward createStaticReward();

    /**
     * Returns a new object of class '<em>SLO Reward</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>SLO Reward</em>'.
     * @generated
     */
    SLOReward createSLOReward();

    /**
     * Returns a new object of class '<em>Utilization Reward</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Utilization Reward</em>'.
     * @generated
     */
    UtilizationReward createUtilizationReward();

    /**
     * Returns a new object of class '<em>Function Reward</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Function Reward</em>'.
     * @generated
     */
    FunctionReward createFunctionReward();

    /**
     * Returns a new object of class '<em>SPD Model Reward Repository</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SPD Model Reward Repository</em>'.
     * @generated
     */
    SPDModelRewardRepository createSPDModelRewardRepository();

    /**
     * Returns a new object of class '<em>Model Reward</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Model Reward</em>'.
     * @generated
     */
    ModelReward createModelReward();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    SpdmodelrewardPackage getSpdmodelrewardPackage();

} // SpdmodelrewardFactory
