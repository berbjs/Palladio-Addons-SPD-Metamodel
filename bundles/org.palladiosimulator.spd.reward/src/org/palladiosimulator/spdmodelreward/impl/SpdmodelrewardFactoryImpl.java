/**
 */
package org.palladiosimulator.spdmodelreward.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spdmodelreward.FunctionReward;
import org.palladiosimulator.spdmodelreward.ModelReward;
import org.palladiosimulator.spdmodelreward.RewardAggregationMethod;
import org.palladiosimulator.spdmodelreward.SLOReward;
import org.palladiosimulator.spdmodelreward.SPDModelRewardRepository;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardFactory;
import org.palladiosimulator.spdmodelreward.SpdmodelrewardPackage;
import org.palladiosimulator.spdmodelreward.StaticReward;
import org.palladiosimulator.spdmodelreward.UtilizationReward;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdmodelrewardFactoryImpl extends EFactoryImpl implements SpdmodelrewardFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SpdmodelrewardFactory init() {
        try {
            final SpdmodelrewardFactory theSpdmodelrewardFactory = (SpdmodelrewardFactory) EPackage.Registry.INSTANCE
                .getEFactory(SpdmodelrewardPackage.eNS_URI);
            if (theSpdmodelrewardFactory != null) {
                return theSpdmodelrewardFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SpdmodelrewardFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmodelrewardFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SpdmodelrewardPackage.STATIC_REWARD:
            return this.createStaticReward();
        case SpdmodelrewardPackage.SLO_REWARD:
            return this.createSLOReward();
        case SpdmodelrewardPackage.UTILIZATION_REWARD:
            return this.createUtilizationReward();
        case SpdmodelrewardPackage.FUNCTION_REWARD:
            return this.createFunctionReward();
        case SpdmodelrewardPackage.SPD_MODEL_REWARD_REPOSITORY:
            return this.createSPDModelRewardRepository();
        case SpdmodelrewardPackage.MODEL_REWARD:
            return this.createModelReward();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case SpdmodelrewardPackage.REWARD_AGGREGATION_METHOD:
            return this.createRewardAggregationMethodFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case SpdmodelrewardPackage.REWARD_AGGREGATION_METHOD:
            return this.convertRewardAggregationMethodToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StaticReward createStaticReward() {
        final StaticRewardImpl staticReward = new StaticRewardImpl();
        return staticReward;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SLOReward createSLOReward() {
        final SLORewardImpl sloReward = new SLORewardImpl();
        return sloReward;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UtilizationReward createUtilizationReward() {
        final UtilizationRewardImpl utilizationReward = new UtilizationRewardImpl();
        return utilizationReward;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FunctionReward createFunctionReward() {
        final FunctionRewardImpl functionReward = new FunctionRewardImpl();
        return functionReward;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SPDModelRewardRepository createSPDModelRewardRepository() {
        final SPDModelRewardRepositoryImpl spdModelRewardRepository = new SPDModelRewardRepositoryImpl();
        return spdModelRewardRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelReward createModelReward() {
        final ModelRewardImpl modelReward = new ModelRewardImpl();
        return modelReward;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public RewardAggregationMethod createRewardAggregationMethodFromString(final EDataType eDataType,
            final String initialValue) {
        final RewardAggregationMethod result = RewardAggregationMethod.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertRewardAggregationMethodToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SpdmodelrewardPackage getSpdmodelrewardPackage() {
        return (SpdmodelrewardPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SpdmodelrewardPackage getPackage() {
        return SpdmodelrewardPackage.eINSTANCE;
    }

} // SpdmodelrewardFactoryImpl
