/**
 */
package spd.palladio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spd.palladio.PalladioPackage
 * @generated
 */
public interface PalladioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladioFactory eINSTANCE = spd.palladio.impl.PalladioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Resource Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Resource Environment</em>'.
	 * @generated
	 */
	PCMResourceEnvironment createPCMResourceEnvironment();

	/**
	 * Returns a new object of class '<em>PCM Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Resource Container</em>'.
	 * @generated
	 */
	PCMResourceContainer createPCMResourceContainer();

	/**
	 * Returns a new object of class '<em>PCM Linking Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Linking Resource</em>'.
	 * @generated
	 */
	PCMLinkingResource createPCMLinkingResource();

	/**
	 * Returns a new object of class '<em>PCM Operation Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Operation Signature</em>'.
	 * @generated
	 */
	PCMOperationSignature createPCMOperationSignature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PalladioPackage getPalladioPackage();

} //PalladioFactory
