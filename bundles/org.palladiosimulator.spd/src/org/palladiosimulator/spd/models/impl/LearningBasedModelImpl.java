/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.rewards.BaseReward;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Learning Based Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl#getReward <em>Reward</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningBasedModelImpl extends BaseModelImpl implements LearningBasedModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningBasedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.LEARNING_BASED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseReward getReward() {
		return (BaseReward) eDynamicGet(ModelsPackage.LEARNING_BASED_MODEL__REWARD,
				ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReward(BaseReward newReward, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newReward, ModelsPackage.LEARNING_BASED_MODEL__REWARD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReward(BaseReward newReward) {
		eDynamicSet(ModelsPackage.LEARNING_BASED_MODEL__REWARD, ModelsPackage.Literals.LEARNING_BASED_MODEL__REWARD,
				newReward);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Stimulus> getInputs() {
		return (EList<Stimulus>) eDynamicGet(ModelsPackage.LEARNING_BASED_MODEL__INPUTS,
				ModelsPackage.Literals.LEARNING_BASED_MODEL__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
			return basicSetReward(null, msgs);
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
			return getReward();
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
			setReward((BaseReward) newValue);
			return;
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Stimulus>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
			setReward((BaseReward) null);
			return;
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			getInputs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__REWARD:
			return getReward() != null;
		case ModelsPackage.LEARNING_BASED_MODEL__INPUTS:
			return !getInputs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LearningBasedModelImpl
