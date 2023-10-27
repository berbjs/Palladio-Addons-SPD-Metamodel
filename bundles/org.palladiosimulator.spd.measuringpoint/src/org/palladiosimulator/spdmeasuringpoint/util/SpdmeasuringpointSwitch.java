/**
 */
package org.palladiosimulator.spdmeasuringpoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;

import org.palladiosimulator.pcmmeasuringpoint.AssemblyReference;
import org.palladiosimulator.pcmmeasuringpoint.ResourceContainerReference;

import org.palladiosimulator.spdmeasuringpoint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public class SpdmeasuringpointSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpdmeasuringpointPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointSwitch() {
		if (modelPackage == null) {
			modelPackage = SpdmeasuringpointPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT: {
			SPDResourceContainerMeasuringPoint spdResourceContainerMeasuringPoint = (SPDResourceContainerMeasuringPoint) theEObject;
			T result = caseSPDResourceContainerMeasuringPoint(spdResourceContainerMeasuringPoint);
			if (result == null)
				result = caseMeasuringPoint(spdResourceContainerMeasuringPoint);
			if (result == null)
				result = caseResourceContainerReference(spdResourceContainerMeasuringPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT: {
			SPDAssemblyContextMeasuringPoint spdAssemblyContextMeasuringPoint = (SPDAssemblyContextMeasuringPoint) theEObject;
			T result = caseSPDAssemblyContextMeasuringPoint(spdAssemblyContextMeasuringPoint);
			if (result == null)
				result = caseMeasuringPoint(spdAssemblyContextMeasuringPoint);
			if (result == null)
				result = caseAssemblyReference(spdAssemblyContextMeasuringPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPD Resource Container Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPD Resource Container Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPDResourceContainerMeasuringPoint(SPDResourceContainerMeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPD Assembly Context Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPD Assembly Context Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPDAssemblyContextMeasuringPoint(SPDAssemblyContextMeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuringPoint(MeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainerReference(ResourceContainerReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyReference(AssemblyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SpdmeasuringpointSwitch
