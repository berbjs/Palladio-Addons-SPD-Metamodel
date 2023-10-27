/**
 */
package org.palladiosimulator.spdmeasuringpoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory
 * @model kind="package"
 * @generated
 */
public interface SpdmeasuringpointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spdmeasuringpoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PCM/SPDMeasuringPoint/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spdmeasuringpoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdmeasuringpointPackage eINSTANCE = org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDResourceContainerMeasuringPointImpl <em>SPD Resource Container Measuring Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spdmeasuringpoint.impl.SPDResourceContainerMeasuringPointImpl
	 * @see org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointPackageImpl#getSPDResourceContainerMeasuringPoint()
	 * @generated
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT = 0;

	/**
	 * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>SPD Resource Container Measuring Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_RESOURCE_CONTAINER_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDAssemblyContextMeasuringPointImpl <em>SPD Assembly Context Measuring Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spdmeasuringpoint.impl.SPDAssemblyContextMeasuringPointImpl
	 * @see org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointPackageImpl#getSPDAssemblyContextMeasuringPoint()
	 * @generated
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT = 1;

	/**
	 * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SPD Assembly Context Measuring Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_ASSEMBLY_CONTEXT_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spdmeasuringpoint.SPDResourceContainerMeasuringPoint <em>SPD Resource Container Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPD Resource Container Measuring Point</em>'.
	 * @see org.palladiosimulator.spdmeasuringpoint.SPDResourceContainerMeasuringPoint
	 * @generated
	 */
	EClass getSPDResourceContainerMeasuringPoint();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spdmeasuringpoint.SPDAssemblyContextMeasuringPoint <em>SPD Assembly Context Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPD Assembly Context Measuring Point</em>'.
	 * @see org.palladiosimulator.spdmeasuringpoint.SPDAssemblyContextMeasuringPoint
	 * @generated
	 */
	EClass getSPDAssemblyContextMeasuringPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpdmeasuringpointFactory getSpdmeasuringpointFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDResourceContainerMeasuringPointImpl <em>SPD Resource Container Measuring Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spdmeasuringpoint.impl.SPDResourceContainerMeasuringPointImpl
		 * @see org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointPackageImpl#getSPDResourceContainerMeasuringPoint()
		 * @generated
		 */
		EClass SPD_RESOURCE_CONTAINER_MEASURING_POINT = eINSTANCE.getSPDResourceContainerMeasuringPoint();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDAssemblyContextMeasuringPointImpl <em>SPD Assembly Context Measuring Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spdmeasuringpoint.impl.SPDAssemblyContextMeasuringPointImpl
		 * @see org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointPackageImpl#getSPDAssemblyContextMeasuringPoint()
		 * @generated
		 */
		EClass SPD_ASSEMBLY_CONTEXT_MEASURING_POINT = eINSTANCE.getSPDAssemblyContextMeasuringPoint();

	}

} //SpdmeasuringpointPackage
