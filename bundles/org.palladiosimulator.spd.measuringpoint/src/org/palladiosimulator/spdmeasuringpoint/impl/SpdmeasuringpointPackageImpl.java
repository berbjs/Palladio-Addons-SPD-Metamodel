/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

import org.palladiosimulator.metricspec.MetricSpecPackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;

import org.palladiosimulator.spdmeasuringpoint.SPDAssemblyContextMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SPDResourceContainerMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdmeasuringpointPackageImpl extends EPackageImpl implements SpdmeasuringpointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdResourceContainerMeasuringPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdAssemblyContextMeasuringPointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdmeasuringpointPackageImpl() {
		super(eNS_URI, SpdmeasuringpointFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpdmeasuringpointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpdmeasuringpointPackage init() {
		if (isInited)
			return (SpdmeasuringpointPackage) EPackage.Registry.INSTANCE.getEPackage(SpdmeasuringpointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpdmeasuringpointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpdmeasuringpointPackageImpl theSpdmeasuringpointPackage = registeredSpdmeasuringpointPackage instanceof SpdmeasuringpointPackageImpl
				? (SpdmeasuringpointPackageImpl) registeredSpdmeasuringpointPackage
				: new SpdmeasuringpointPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		MetricSpecPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		PcmmeasuringpointPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpdmeasuringpointPackage.createPackageContents();

		// Initialize created meta-data
		theSpdmeasuringpointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpdmeasuringpointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdmeasuringpointPackage.eNS_URI, theSpdmeasuringpointPackage);
		return theSpdmeasuringpointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPDResourceContainerMeasuringPoint() {
		return spdResourceContainerMeasuringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPDAssemblyContextMeasuringPoint() {
		return spdAssemblyContextMeasuringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointFactory getSpdmeasuringpointFactory() {
		return (SpdmeasuringpointFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		spdResourceContainerMeasuringPointEClass = createEClass(SPD_RESOURCE_CONTAINER_MEASURING_POINT);

		spdAssemblyContextMeasuringPointEClass = createEClass(SPD_ASSEMBLY_CONTEXT_MEASURING_POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
				.getEPackage(MeasuringpointPackage.eNS_URI);
		PcmmeasuringpointPackage thePcmmeasuringpointPackage = (PcmmeasuringpointPackage) EPackage.Registry.INSTANCE
				.getEPackage(PcmmeasuringpointPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spdResourceContainerMeasuringPointEClass.getESuperTypes().add(theMeasuringpointPackage.getMeasuringPoint());
		spdResourceContainerMeasuringPointEClass.getESuperTypes()
				.add(thePcmmeasuringpointPackage.getResourceContainerReference());
		spdAssemblyContextMeasuringPointEClass.getESuperTypes().add(theMeasuringpointPackage.getMeasuringPoint());
		spdAssemblyContextMeasuringPointEClass.getESuperTypes().add(thePcmmeasuringpointPackage.getAssemblyReference());

		// Initialize classes and features; add operations and parameters
		initEClass(spdResourceContainerMeasuringPointEClass, SPDResourceContainerMeasuringPoint.class,
				"SPDResourceContainerMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spdAssemblyContextMeasuringPointEClass, SPDAssemblyContextMeasuringPoint.class,
				"SPDAssemblyContextMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SpdmeasuringpointPackageImpl
