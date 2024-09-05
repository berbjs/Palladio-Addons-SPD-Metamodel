/**
 */
package org.palladiosimulator.spdmodelreward.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.spdmodelreward.BaseReward;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.SLOReward;
import org.palladiosimulator.spdmodelreward.SPDModelRewardRepository;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;
import org.palladiosimulator.spdmodelreward.StaticReward;
import org.palladiosimulator.spdmodelreward.UtilizationReward;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage
 * @generated
 */
public class SpdmodelrewardAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SpdmodelrewardPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmodelrewardAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SpdmodelrewardPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SpdmodelrewardSwitch<Adapter> modelSwitch = new SpdmodelrewardSwitch<>() {
        @Override
        public Adapter caseBaseReward(final BaseReward object) {
            return SpdmodelrewardAdapterFactory.this.createBaseRewardAdapter();
        }

        @Override
        public Adapter caseStaticReward(final StaticReward object) {
            return SpdmodelrewardAdapterFactory.this.createStaticRewardAdapter();
        }

        @Override
        public Adapter caseSLOReward(final SLOReward object) {
            return SpdmodelrewardAdapterFactory.this.createSLORewardAdapter();
        }

        @Override
        public Adapter caseUtilizationReward(final UtilizationReward object) {
            return SpdmodelrewardAdapterFactory.this.createUtilizationRewardAdapter();
        }

        @Override
        public Adapter caseFunctionReward(final FunctionReward object) {
            return SpdmodelrewardAdapterFactory.this.createFunctionRewardAdapter();
        }

        @Override
        public Adapter caseSPDModelRewardRepository(final SPDModelRewardRepository object) {
            return SpdmodelrewardAdapterFactory.this.createSPDModelRewardRepositoryAdapter();
        }

        @Override
        public Adapter caseModelReward(final ModelReward object) {
            return SpdmodelrewardAdapterFactory.this.createModelRewardAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return SpdmodelrewardAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.BaseReward <em>Base Reward</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.BaseReward
     * @generated
     */
    public Adapter createBaseRewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.StaticReward <em>Static Reward</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.StaticReward
     * @generated
     */
    public Adapter createStaticRewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.SLOReward <em>SLO Reward</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.SLOReward
     * @generated
     */
    public Adapter createSLORewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.UtilizationReward <em>Utilization Reward</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.UtilizationReward
     * @generated
     */
    public Adapter createUtilizationRewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.FunctionReward <em>Function Reward</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.FunctionReward
     * @generated
     */
    public Adapter createFunctionRewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.SPDModelRewardRepository <em>SPD Model Reward
     * Repository</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.SPDModelRewardRepository
     * @generated
     */
    public Adapter createSPDModelRewardRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spdmodelreward.ModelReward <em>Model Reward</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spdmodelreward.ModelReward
     * @generated
     */
    public Adapter createModelRewardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SpdmodelrewardAdapterFactory
