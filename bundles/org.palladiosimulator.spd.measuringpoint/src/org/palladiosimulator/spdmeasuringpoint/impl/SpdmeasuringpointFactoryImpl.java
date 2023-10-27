/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.spdmeasuringpoint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdmeasuringpointFactoryImpl extends EFactoryImpl implements SpdmeasuringpointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpdmeasuringpointFactory init() {
		try {
			SpdmeasuringpointFactory theSpdmeasuringpointFactory = (SpdmeasuringpointFactory) EPackage.Registry.INSTANCE
					.getEFactory(SpdmeasuringpointPackage.eNS_URI);
			if (theSpdmeasuringpointFactory != null) {
				return theSpdmeasuringpointFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpdmeasuringpointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointFactoryImpl() {
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
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT:
			return createSPDResourceContainerMeasuringPoint();
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT:
			return createSPDAssemblyContextMeasuringPoint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDResourceContainerMeasuringPoint createSPDResourceContainerMeasuringPoint() {
		SPDResourceContainerMeasuringPointImpl spdResourceContainerMeasuringPoint = new SPDResourceContainerMeasuringPointImpl();
		return spdResourceContainerMeasuringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDAssemblyContextMeasuringPoint createSPDAssemblyContextMeasuringPoint() {
		SPDAssemblyContextMeasuringPointImpl spdAssemblyContextMeasuringPoint = new SPDAssemblyContextMeasuringPointImpl();
		return spdAssemblyContextMeasuringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointPackage getSpdmeasuringpointPackage() {
		return (SpdmeasuringpointPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpdmeasuringpointPackage getPackage() {
		return SpdmeasuringpointPackage.eINSTANCE;
	}

} //SpdmeasuringpointFactoryImpl
