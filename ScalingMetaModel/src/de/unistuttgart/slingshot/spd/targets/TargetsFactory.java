/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.slingshot.spd.targets.TargetsPackage
 * @generated
 */
public interface TargetsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetsFactory eINSTANCE = de.unistuttgart.slingshot.spd.targets.impl.TargetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Elastic Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elastic Infrastructure</em>'.
	 * @generated
	 */
	ElasticInfrastructure createElasticInfrastructure();

	/**
	 * Returns a new object of class '<em>Elastic Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elastic Service</em>'.
	 * @generated
	 */
	ElasticService createElasticService();

	/**
	 * Returns a new object of class '<em>Elastic Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elastic Queue</em>'.
	 * @generated
	 */
	ElasticQueue createElasticQueue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetsPackage getTargetsPackage();

} //TargetsFactory
