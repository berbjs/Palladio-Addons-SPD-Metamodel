/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.slingshot.spd.SpdPackage
 * @generated
 */
public interface SpdFactory extends EFactory {
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
	SpdFactory eINSTANCE = de.unistuttgart.slingshot.spd.impl.SpdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scaling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Policy</em>'.
	 * @generated
	 */
	ScalingPolicy createScalingPolicy();

	/**
	 * Returns a new object of class '<em>SPD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPD</em>'.
	 * @generated
	 */
	SPD createSPD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpdPackage getSpdPackage();

} //SpdFactory
