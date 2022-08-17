/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A utilization based trigger based on the HDD resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getHDDUtilizationTrigger()
 * @model
 * @generated
 */
public interface HDDUtilizationTrigger extends ProcessingResourceUtilizationBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.spd.triggers.HDDUSAGETYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see org.palladiosimulator.spd.triggers.HDDUSAGETYPE
	 * @see #setUsageType(HDDUSAGETYPE)
	 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getHDDUtilizationTrigger_UsageType()
	 * @model
	 * @generated
	 */
	HDDUSAGETYPE getUsageType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.triggers.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see org.palladiosimulator.spd.triggers.HDDUSAGETYPE
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(HDDUSAGETYPE value);

} // HDDUtilizationTrigger
