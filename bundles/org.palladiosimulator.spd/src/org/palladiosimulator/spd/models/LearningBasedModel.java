/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Based Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Learning-based models have at least one stimulus as input and some reward that is used for the learning process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.LearningBasedModel#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel()
 * @model
 * @generated
 */
public interface LearningBasedModel extends BaseModel {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.spd.triggers.stimuli.Stimulus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stimulus> getInputs();

} // LearningBasedModel
