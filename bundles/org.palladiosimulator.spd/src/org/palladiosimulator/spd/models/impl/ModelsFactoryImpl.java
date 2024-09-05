/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelsFactoryImpl extends EFactoryImpl implements ModelsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ModelsFactory init() {
        try {
            final ModelsFactory theModelsFactory = (ModelsFactory) EPackage.Registry.INSTANCE
                .getEFactory(ModelsPackage.eNS_URI);
            if (theModelsFactory != null) {
                return theModelsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ModelsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelsFactoryImpl() {
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
        case ModelsPackage.QTHRESHOLDS_MODEL:
            return this.createQThresholdsModel();
        case ModelsPackage.RANDOM_MODEL:
            return this.createRandomModel();
        case ModelsPackage.IMPROVED_QLEARNING_MODEL:
            return this.createImprovedQLearningModel();
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
        case ModelsPackage.PERCENT_DOUBLE:
            return this.createPercentDoubleFromString(eDataType, initialValue);
        case ModelsPackage.POSITIVE_INTEGER:
            return this.createPositiveIntegerFromString(eDataType, initialValue);
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
        case ModelsPackage.PERCENT_DOUBLE:
            return this.convertPercentDoubleToString(eDataType, instanceValue);
        case ModelsPackage.POSITIVE_INTEGER:
            return this.convertPositiveIntegerToString(eDataType, instanceValue);
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
    public QThresholdsModel createQThresholdsModel() {
        final QThresholdsModelImpl qThresholdsModel = new QThresholdsModelImpl();
        return qThresholdsModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RandomModel createRandomModel() {
        final RandomModelImpl randomModel = new RandomModelImpl();
        return randomModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ImprovedQLearningModel createImprovedQLearningModel() {
        final ImprovedQLearningModelImpl improvedQLearningModel = new ImprovedQLearningModelImpl();
        return improvedQLearningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Double createPercentDoubleFromString(final EDataType eDataType, final String initialValue) {
        return (Double) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertPercentDoubleToString(final EDataType eDataType, final Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Integer createPositiveIntegerFromString(final EDataType eDataType, final String initialValue) {
        return (Integer) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertPositiveIntegerToString(final EDataType eDataType, final Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelsPackage getModelsPackage() {
        return (ModelsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelsPackage getPackage() {
        return ModelsPackage.eINSTANCE;
    }

} // ModelsFactoryImpl
