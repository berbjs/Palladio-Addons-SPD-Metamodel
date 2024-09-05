/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.spdmodelreward.BaseReward;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model Reward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl#getReward
 * <em>Reward</em>}</li>
 * <li>{@link org.palladiosimulator.spdmodelreward.impl.ModelRewardImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelRewardImpl extends MinimalEObjectImpl.Container implements ModelReward {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ModelRewardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmodelrewardPackage.Literals.MODEL_REWARD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BaseReward getReward() {
        return (BaseReward) this.eDynamicGet(SpdmodelrewardPackage.MODEL_REWARD__REWARD,
                SpdmodelrewardPackage.Literals.MODEL_REWARD__REWARD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetReward(final BaseReward newReward, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newReward, SpdmodelrewardPackage.MODEL_REWARD__REWARD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReward(final BaseReward newReward) {
        this.eDynamicSet(SpdmodelrewardPackage.MODEL_REWARD__REWARD,
                SpdmodelrewardPackage.Literals.MODEL_REWARD__REWARD, newReward);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return (String) this.eDynamicGet(SpdmodelrewardPackage.MODEL_REWARD__NAME,
                SpdmodelrewardPackage.Literals.MODEL_REWARD__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        this.eDynamicSet(SpdmodelrewardPackage.MODEL_REWARD__NAME, SpdmodelrewardPackage.Literals.MODEL_REWARD__NAME,
                newName);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case SpdmodelrewardPackage.MODEL_REWARD__REWARD:
            return this.basicSetReward(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdmodelrewardPackage.MODEL_REWARD__REWARD:
            return this.getReward();
        case SpdmodelrewardPackage.MODEL_REWARD__NAME:
            return this.getName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SpdmodelrewardPackage.MODEL_REWARD__REWARD:
            this.setReward((BaseReward) newValue);
            return;
        case SpdmodelrewardPackage.MODEL_REWARD__NAME:
            this.setName((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case SpdmodelrewardPackage.MODEL_REWARD__REWARD:
            this.setReward((BaseReward) null);
            return;
        case SpdmodelrewardPackage.MODEL_REWARD__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case SpdmodelrewardPackage.MODEL_REWARD__REWARD:
            return this.getReward() != null;
        case SpdmodelrewardPackage.MODEL_REWARD__NAME:
            return NAME_EDEFAULT == null ? this.getName() != null : !NAME_EDEFAULT.equals(this.getName());
        }
        return super.eIsSet(featureID);
    }

} // ModelRewardImpl
