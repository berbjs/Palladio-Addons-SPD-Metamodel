/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers;


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
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getHDDUtilizationTrigger()
 * @model
 * @generated
 */
public interface HDDUtilizationTrigger extends ProcessingResourceUtilizationBasedTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.unistuttgart.slingshot.spd.triggers.HDDUSAGETYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.HDDUSAGETYPE
	 * @see #setUsageType(HDDUSAGETYPE)
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getHDDUtilizationTrigger_UsageType()
	 * @model
	 * @generated
	 */
	HDDUSAGETYPE getUsageType();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.triggers.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.HDDUSAGETYPE
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(HDDUSAGETYPE value);

} // HDDUtilizationTrigger
