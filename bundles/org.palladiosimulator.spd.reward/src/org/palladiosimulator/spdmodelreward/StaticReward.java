/**
 */
package org.palladiosimulator.spdmodelreward;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Static Reward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.StaticReward#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getStaticReward()
 * @model
 * @generated
 */
public interface StaticReward extends BaseReward {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getStaticReward_Value()
     * @model
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spdmodelreward.StaticReward#getValue
     * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // StaticReward
