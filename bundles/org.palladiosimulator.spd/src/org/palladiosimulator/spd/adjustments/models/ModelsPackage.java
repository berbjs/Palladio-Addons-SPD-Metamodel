/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.adjustments.models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "models";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "models";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ModelsPackage eINSTANCE = org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl <em>Base Model</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl
     * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getBaseModel()
     * @generated
     */
    int BASE_MODEL = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INTERVAL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INITAL_INTERVAL_DELAY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INPUTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Base Model</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.models.impl.QThresholdsModelImpl
     * <em>QThresholds Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.models.impl.QThresholdsModelImpl
     * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getQThresholdsModel()
     * @generated
     */
    int QTHRESHOLDS_MODEL = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__ID = BASE_MODEL__ID;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL__INPUTS = BASE_MODEL__INPUTS;

    /**
     * The number of structural features of the '<em>QThresholds Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QTHRESHOLDS_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.models.impl.RandomModelImpl <em>Random
     * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.models.impl.RandomModelImpl
     * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getRandomModel()
     * @generated
     */
    int RANDOM_MODEL = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__ID = BASE_MODEL__ID;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INPUTS = BASE_MODEL__INPUTS;

    /**
     * The number of structural features of the '<em>Random Model</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.models.BaseModel <em>Base Model</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Base Model</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.BaseModel
     * @generated
     */
    EClass getBaseModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.models.BaseModel#getInterval
     * <em>Interval</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Interval</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.BaseModel#getInterval()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_Interval();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.models.BaseModel#getInitalIntervalDelay
     * <em>Inital Interval Delay</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Inital Interval Delay</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.BaseModel#getInitalIntervalDelay()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_InitalIntervalDelay();

    /**
     * Returns the meta object for the reference list
     * '{@link org.palladiosimulator.spd.adjustments.models.BaseModel#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Inputs</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.BaseModel#getInputs()
     * @see #getBaseModel()
     * @generated
     */
    EReference getBaseModel_Inputs();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.models.QThresholdsModel <em>QThresholds
     * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>QThresholds Model</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.QThresholdsModel
     * @generated
     */
    EClass getQThresholdsModel();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.models.RandomModel <em>Random Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Random Model</em>'.
     * @see org.palladiosimulator.spd.adjustments.models.RandomModel
     * @generated
     */
    EClass getRandomModel();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelsFactory getModelsFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl <em>Base
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.models.impl.BaseModelImpl
         * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getBaseModel()
         * @generated
         */
        EClass BASE_MODEL = eINSTANCE.getBaseModel();

        /**
         * The meta object literal for the '<em><b>Interval</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INTERVAL = eINSTANCE.getBaseModel_Interval();

        /**
         * The meta object literal for the '<em><b>Inital Interval Delay</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INITAL_INTERVAL_DELAY = eINSTANCE.getBaseModel_InitalIntervalDelay();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BASE_MODEL__INPUTS = eINSTANCE.getBaseModel_Inputs();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.models.impl.QThresholdsModelImpl
         * <em>QThresholds Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.models.impl.QThresholdsModelImpl
         * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getQThresholdsModel()
         * @generated
         */
        EClass QTHRESHOLDS_MODEL = eINSTANCE.getQThresholdsModel();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.models.impl.RandomModelImpl <em>Random
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.models.impl.RandomModelImpl
         * @see org.palladiosimulator.spd.adjustments.models.impl.ModelsPackageImpl#getRandomModel()
         * @generated
         */
        EClass RANDOM_MODEL = eINSTANCE.getRandomModel();

    }

} // ModelsPackage
