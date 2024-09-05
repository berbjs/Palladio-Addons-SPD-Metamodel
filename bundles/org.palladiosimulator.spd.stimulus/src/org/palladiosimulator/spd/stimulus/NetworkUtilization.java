/**
 */
package org.palladiosimulator.spd.stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * If the link has been modelled with a certain capacity, then the NetworkUtilization of a certain type determines the fraction of that capacity that is being used by the elements of the target group. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.stimulus.NetworkUtilization#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getNetworkUtilization()
 * @model
 * @generated
 */
public interface NetworkUtilization extends ResourceUtilizationStimulus {
    /**
     * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of network usage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Usage Type</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE
     * @see #setUsageType(NETWORKUSAGETYPE)
     * @see org.palladiosimulator.spd.stimulus.StimulusPackage#getNetworkUtilization_UsageType()
     * @model
     * @generated
     */
    NETWORKUSAGETYPE getUsageType();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.stimulus.NetworkUtilization#getUsageType <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Type</em>' attribute.
     * @see org.palladiosimulator.spd.stimulus.NETWORKUSAGETYPE
     * @see #getUsageType()
     * @generated
     */
    void setUsageType(NETWORKUSAGETYPE value);

} // NetworkUtilization
