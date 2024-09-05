/**
 */
package org.palladiosimulator.spdmodelreward.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spdmodelreward.BaseReward;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.SLOReward;
import org.palladiosimulator.spdmodelreward.SPDModelRewardRepository;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;
import org.palladiosimulator.spdmodelreward.StaticReward;
import org.palladiosimulator.spdmodelreward.UtilizationReward;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage
 * @generated
 */
public class SpdmodelrewardSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SpdmodelrewardPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmodelrewardSwitch() {
        if (modelPackage == null) {
            modelPackage = SpdmodelrewardPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case SpdmodelrewardPackage.BASE_REWARD: {
            final BaseReward baseReward = (BaseReward) theEObject;
            T result = this.caseBaseReward(baseReward);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.STATIC_REWARD: {
            final StaticReward staticReward = (StaticReward) theEObject;
            T result = this.caseStaticReward(staticReward);
            if (result == null) {
                result = this.caseBaseReward(staticReward);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.SLO_REWARD: {
            final SLOReward sloReward = (SLOReward) theEObject;
            T result = this.caseSLOReward(sloReward);
            if (result == null) {
                result = this.caseBaseReward(sloReward);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.UTILIZATION_REWARD: {
            final UtilizationReward utilizationReward = (UtilizationReward) theEObject;
            T result = this.caseUtilizationReward(utilizationReward);
            if (result == null) {
                result = this.caseBaseReward(utilizationReward);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.FUNCTION_REWARD: {
            final FunctionReward functionReward = (FunctionReward) theEObject;
            T result = this.caseFunctionReward(functionReward);
            if (result == null) {
                result = this.caseBaseReward(functionReward);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY: {
            final SPDModelRewardRepository spdModelRewardRepository = (SPDModelRewardRepository) theEObject;
            T result = this.caseSPDModelRewardRepository(spdModelRewardRepository);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmodelrewardPackage.MODEL_REWARD: {
            final ModelReward modelReward = (ModelReward) theEObject;
            T result = this.caseModelReward(modelReward);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Reward</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseReward(final BaseReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Reward</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticReward(final StaticReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SLO Reward</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SLO Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSLOReward(final SLOReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Utilization
     * Reward</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Utilization
     *         Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUtilizationReward(final UtilizationReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Reward</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionReward(final FunctionReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SPD Model Reward
     * Repository</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SPD Model Reward
     *         Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSPDModelRewardRepository(final SPDModelRewardRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Reward</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Reward</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelReward(final ModelReward object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // SpdmodelrewardSwitch
