/**
 */
package org.palladiosimulator.spdmeasuringpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public interface SpdmeasuringpointFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdmeasuringpointFactory eINSTANCE = org.palladiosimulator.spdmeasuringpoint.impl.SpdmeasuringpointFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>SPD Resource Container Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPD Resource Container Measuring Point</em>'.
	 * @generated
	 */
	SPDResourceContainerMeasuringPoint createSPDResourceContainerMeasuringPoint();

	/**
	 * Returns a new object of class '<em>SPD Assembly Context Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPD Assembly Context Measuring Point</em>'.
	 * @generated
	 */
	SPDAssemblyContextMeasuringPoint createSPDAssemblyContextMeasuringPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpdmeasuringpointPackage getSpdmeasuringpointPackage();

} //SpdmeasuringpointFactory
