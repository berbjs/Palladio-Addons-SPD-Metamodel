/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.triggers.TriggersPackage
 * @generated
 */
public interface TriggersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersFactory eINSTANCE = org.palladiosimulator.spd.triggers.impl.TriggersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CPU Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Utilization Trigger</em>'.
	 * @generated
	 */
	CPUUtilizationTrigger createCPUUtilizationTrigger();

	/**
	 * Returns a new object of class '<em>RAM Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Utilization Trigger</em>'.
	 * @generated
	 */
	RAMUtilizationTrigger createRAMUtilizationTrigger();

	/**
	 * Returns a new object of class '<em>HDD Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDD Utilization Trigger</em>'.
	 * @generated
	 */
	HDDUtilizationTrigger createHDDUtilizationTrigger();

	/**
	 * Returns a new object of class '<em>Point In Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point In Time Trigger</em>'.
	 * @generated
	 */
	PointInTimeTrigger createPointInTimeTrigger();

	/**
	 * Returns a new object of class '<em>Idle Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idle Time Trigger</em>'.
	 * @generated
	 */
	IdleTimeTrigger createIdleTimeTrigger();

	/**
	 * Returns a new object of class '<em>Task Count Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Count Trigger</em>'.
	 * @generated
	 */
	TaskCountTrigger createTaskCountTrigger();

	/**
	 * Returns a new object of class '<em>Network Utilization Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Utilization Trigger</em>'.
	 * @generated
	 */
	NetworkUtilizationTrigger createNetworkUtilizationTrigger();

	/**
	 * Returns a new object of class '<em>Response Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Time Trigger</em>'.
	 * @generated
	 */
	ResponseTimeTrigger createResponseTimeTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TriggersPackage getTriggersPackage();

} //TriggersFactory
