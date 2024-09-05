/**
 */
package org.palladiosimulator.spdmodelreward;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Function Reward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.FunctionReward#getRewards <em>Rewards</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.FunctionReward#getFunction
 * <em>Function</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getFunctionReward()
 * @model
 * @generated
 */
public interface FunctionReward extends BaseReward {
    /**
     * Returns the value of the '<em><b>Rewards</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.spdmodelreward.BaseReward}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rewards</em>' containment reference list.
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getFunctionReward_Rewards()
     * @model containment="true" required="true"
     * @generated
     */
    EList<BaseReward> getRewards();

    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.spdmodelreward.RewardAggregationMethod}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Function</em>' attribute.
     * @see org.palladiosimulator.spdmodelreward.RewardAggregationMethod
     * @see #setFunction(RewardAggregationMethod)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getFunctionReward_Function()
     * @model
     * @generated
     */
    RewardAggregationMethod getFunction();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spdmodelreward.FunctionReward#getFunction
     * <em>Function</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Function</em>' attribute.
     * @see org.palladiosimulator.spdmodelreward.RewardAggregationMethod
     * @see #getFunction()
     * @generated
     */
    void setFunction(RewardAggregationMethod value);

} // FunctionReward
