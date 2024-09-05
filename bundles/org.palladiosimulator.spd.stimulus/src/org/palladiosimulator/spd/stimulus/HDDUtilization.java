/**
 */
package org.palladiosimulator.spd.stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource utilization based stimulus based on the HDD resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.HDDUtilization#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getHDDUtilization()
 * @model
 * @generated
 */
public interface HDDUtilization extends ResourceUtilizationStimulus {
    /**
     * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.palladiosimulator.spd.stimulus.HDDUSAGETYPE}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Type</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.HDDUSAGETYPE
     * @see #setUsageType(HDDUSAGETYPE)
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getHDDUtilization_UsageType()
     * @model
     * @generated
     */
    HDDUSAGETYPE getUsageType();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.stimulus.HDDUtilization#getUsageType <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Type</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.HDDUSAGETYPE
     * @see #getUsageType()
     * @generated
     */
    void setUsageType(HDDUSAGETYPE value);

} // HDDUtilization
