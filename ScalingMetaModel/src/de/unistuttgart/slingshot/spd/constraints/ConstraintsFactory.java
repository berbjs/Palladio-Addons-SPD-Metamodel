/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.constraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.slingshot.spd.constraints.ConstraintsPackage
 * @generated
 */
public interface ConstraintsFactory extends EFactory {
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
	ConstraintsFactory eINSTANCE = de.unistuttgart.slingshot.spd.constraints.impl.ConstraintsFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintsPackage getConstraintsPackage();

} //ConstraintsFactory
