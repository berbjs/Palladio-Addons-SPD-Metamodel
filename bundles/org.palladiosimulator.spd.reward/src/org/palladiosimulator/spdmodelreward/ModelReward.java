/**
 */
package org.palladiosimulator.spdmodelreward;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model Reward</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.ModelReward#getReward <em>Reward</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.ModelReward#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getModelReward()
 * @model
 * @generated
 */
public interface ModelReward extends EObject {
    /**
     * Returns the value of the '<em><b>Reward</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reward</em>' containment reference.
     * @see #setReward(BaseReward)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getModelReward_Reward()
     * @model containment="true" required="true"
     * @generated
     */
    BaseReward getReward();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spdmodelreward.ModelReward#getReward
     * <em>Reward</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Reward</em>' containment reference.
     * @see #getReward()
     * @generated
     */
    void setReward(BaseReward value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage#getModelReward_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spdmodelreward.ModelReward#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ModelReward
