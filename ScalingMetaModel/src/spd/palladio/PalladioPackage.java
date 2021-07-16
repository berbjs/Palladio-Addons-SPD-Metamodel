/**
 */
package spd.palladio;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spd.palladio.PalladioFactory
 * @model kind="package"
 * @generated
 */
public interface PalladioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "palladio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "palladio";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "palladio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladioPackage eINSTANCE = spd.palladio.impl.PalladioPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.palladio.impl.PCMResourceEnvironmentImpl <em>PCM Resource Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.palladio.impl.PCMResourceEnvironmentImpl
	 * @see spd.palladio.impl.PalladioPackageImpl#getPCMResourceEnvironment()
	 * @generated
	 */
	int PCM_RESOURCE_ENVIRONMENT = 0;

	/**
	 * The number of structural features of the '<em>PCM Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RESOURCE_ENVIRONMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCM Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RESOURCE_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.palladio.impl.PCMResourceContainerImpl <em>PCM Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.palladio.impl.PCMResourceContainerImpl
	 * @see spd.palladio.impl.PalladioPackageImpl#getPCMResourceContainer()
	 * @generated
	 */
	int PCM_RESOURCE_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>PCM Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RESOURCE_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCM Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RESOURCE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.palladio.impl.PCMLinkingResourceImpl <em>PCM Linking Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.palladio.impl.PCMLinkingResourceImpl
	 * @see spd.palladio.impl.PalladioPackageImpl#getPCMLinkingResource()
	 * @generated
	 */
	int PCM_LINKING_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>PCM Linking Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_LINKING_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCM Linking Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_LINKING_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.palladio.impl.PCMOperationSignatureImpl <em>PCM Operation Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.palladio.impl.PCMOperationSignatureImpl
	 * @see spd.palladio.impl.PalladioPackageImpl#getPCMOperationSignature()
	 * @generated
	 */
	int PCM_OPERATION_SIGNATURE = 3;

	/**
	 * The number of structural features of the '<em>PCM Operation Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION_SIGNATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCM Operation Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION_SIGNATURE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link spd.palladio.PCMResourceEnvironment <em>PCM Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Resource Environment</em>'.
	 * @see spd.palladio.PCMResourceEnvironment
	 * @generated
	 */
	EClass getPCMResourceEnvironment();

	/**
	 * Returns the meta object for class '{@link spd.palladio.PCMResourceContainer <em>PCM Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Resource Container</em>'.
	 * @see spd.palladio.PCMResourceContainer
	 * @generated
	 */
	EClass getPCMResourceContainer();

	/**
	 * Returns the meta object for class '{@link spd.palladio.PCMLinkingResource <em>PCM Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Linking Resource</em>'.
	 * @see spd.palladio.PCMLinkingResource
	 * @generated
	 */
	EClass getPCMLinkingResource();

	/**
	 * Returns the meta object for class '{@link spd.palladio.PCMOperationSignature <em>PCM Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Operation Signature</em>'.
	 * @see spd.palladio.PCMOperationSignature
	 * @generated
	 */
	EClass getPCMOperationSignature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PalladioFactory getPalladioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spd.palladio.impl.PCMResourceEnvironmentImpl <em>PCM Resource Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.palladio.impl.PCMResourceEnvironmentImpl
		 * @see spd.palladio.impl.PalladioPackageImpl#getPCMResourceEnvironment()
		 * @generated
		 */
		EClass PCM_RESOURCE_ENVIRONMENT = eINSTANCE.getPCMResourceEnvironment();

		/**
		 * The meta object literal for the '{@link spd.palladio.impl.PCMResourceContainerImpl <em>PCM Resource Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.palladio.impl.PCMResourceContainerImpl
		 * @see spd.palladio.impl.PalladioPackageImpl#getPCMResourceContainer()
		 * @generated
		 */
		EClass PCM_RESOURCE_CONTAINER = eINSTANCE.getPCMResourceContainer();

		/**
		 * The meta object literal for the '{@link spd.palladio.impl.PCMLinkingResourceImpl <em>PCM Linking Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.palladio.impl.PCMLinkingResourceImpl
		 * @see spd.palladio.impl.PalladioPackageImpl#getPCMLinkingResource()
		 * @generated
		 */
		EClass PCM_LINKING_RESOURCE = eINSTANCE.getPCMLinkingResource();

		/**
		 * The meta object literal for the '{@link spd.palladio.impl.PCMOperationSignatureImpl <em>PCM Operation Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.palladio.impl.PCMOperationSignatureImpl
		 * @see spd.palladio.impl.PalladioPackageImpl#getPCMOperationSignature()
		 * @generated
		 */
		EClass PCM_OPERATION_SIGNATURE = eINSTANCE.getPCMOperationSignature();

	}

} //PalladioPackage
