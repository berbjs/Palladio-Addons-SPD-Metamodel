/**
 */
package spd.palladio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spd.palladio.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PalladioFactoryImpl extends EFactoryImpl implements PalladioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PalladioFactory init() {
		try {
			PalladioFactory thePalladioFactory = (PalladioFactory)EPackage.Registry.INSTANCE.getEFactory(PalladioPackage.eNS_URI);
			if (thePalladioFactory != null) {
				return thePalladioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PalladioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PalladioPackage.PCM_RESOURCE_ENVIRONMENT: return createPCMResourceEnvironment();
			case PalladioPackage.PCM_RESOURCE_CONTAINER: return createPCMResourceContainer();
			case PalladioPackage.PCM_LINKING_RESOURCE: return createPCMLinkingResource();
			case PalladioPackage.PCM_OPERATION_SIGNATURE: return createPCMOperationSignature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMResourceEnvironment createPCMResourceEnvironment() {
		PCMResourceEnvironmentImpl pcmResourceEnvironment = new PCMResourceEnvironmentImpl();
		return pcmResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMResourceContainer createPCMResourceContainer() {
		PCMResourceContainerImpl pcmResourceContainer = new PCMResourceContainerImpl();
		return pcmResourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMLinkingResource createPCMLinkingResource() {
		PCMLinkingResourceImpl pcmLinkingResource = new PCMLinkingResourceImpl();
		return pcmLinkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMOperationSignature createPCMOperationSignature() {
		PCMOperationSignatureImpl pcmOperationSignature = new PCMOperationSignatureImpl();
		return pcmOperationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PalladioPackage getPalladioPackage() {
		return (PalladioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PalladioPackage getPackage() {
		return PalladioPackage.eINSTANCE;
	}

} //PalladioFactoryImpl
