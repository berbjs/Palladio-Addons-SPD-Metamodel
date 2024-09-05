/**
 */
package org.palladiosimulator.spdmodelreward;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SPD Model Reward
 * Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.SPDModelRewardRepository#getModelReward <em>Model
 * Reward</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getSPDModelRewardRepository()
 * @model
 * @generated
 */
public interface SPDModelRewardRepository extends EObject {
    /**
     * Returns the value of the '<em><b>Model Reward</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.spdmodelreward.ModelReward}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Model Reward</em>' containment reference list.
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getSPDModelRewardRepository_ModelReward()
     * @model containment="true"
     * @generated
     */
    EList<ModelReward> getModelReward();

} // SPDModelRewardRepository
