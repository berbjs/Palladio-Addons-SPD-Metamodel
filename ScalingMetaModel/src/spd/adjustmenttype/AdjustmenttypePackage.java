/**
 */
package spd.adjustmenttype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import spd.SpdPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spd.adjustmenttype.AdjustmenttypeFactory
 * @model kind="package"
 * @generated
 */
public interface AdjustmenttypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adjustmenttype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "adjustmenttype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adjustmenttype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdjustmenttypePackage eINSTANCE = spd.adjustmenttype.impl.AdjustmenttypePackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.adjustmenttype.impl.AdjustmentTypeImpl <em>Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.adjustmenttype.impl.AdjustmentTypeImpl
	 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getAdjustmentType()
	 * @generated
	 */
	int ADJUSTMENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUSTMENT_TYPE_FEATURE_COUNT = SpdPackage.ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUSTMENT_TYPE_OPERATION_COUNT = SpdPackage.ADJUSTMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.adjustmenttype.impl.RelativeAdjustmentImpl <em>Relative Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.adjustmenttype.impl.RelativeAdjustmentImpl
	 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getRelativeAdjustment()
	 * @generated
	 */
	int RELATIVE_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Percentage Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Adjustment Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relative Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ADJUSTMENT_OPERATION_COUNT = ADJUSTMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.adjustmenttype.impl.AbsoluteAdjustmentImpl <em>Absolute Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.adjustmenttype.impl.AbsoluteAdjustmentImpl
	 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getAbsoluteAdjustment()
	 * @generated
	 */
	int ABSOLUTE_ADJUSTMENT = 2;

	/**
	 * The feature id for the '<em><b>Goal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT__GOAL_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ADJUSTMENT_OPERATION_COUNT = ADJUSTMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.adjustmenttype.impl.StepAdjustmentImpl <em>Step Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.adjustmenttype.impl.StepAdjustmentImpl
	 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getStepAdjustment()
	 * @generated
	 */
	int STEP_ADJUSTMENT = 3;

	/**
	 * The feature id for the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT__STEP_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ADJUSTMENT_OPERATION_COUNT = ADJUSTMENT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spd.adjustmenttype.AdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type</em>'.
	 * @see spd.adjustmenttype.AdjustmentType
	 * @generated
	 */
	EClass getAdjustmentType();

	/**
	 * Returns the meta object for class '{@link spd.adjustmenttype.RelativeAdjustment <em>Relative Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Adjustment</em>'.
	 * @see spd.adjustmenttype.RelativeAdjustment
	 * @generated
	 */
	EClass getRelativeAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link spd.adjustmenttype.RelativeAdjustment#getPercentageValue <em>Percentage Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Value</em>'.
	 * @see spd.adjustmenttype.RelativeAdjustment#getPercentageValue()
	 * @see #getRelativeAdjustment()
	 * @generated
	 */
	EAttribute getRelativeAdjustment_PercentageValue();

	/**
	 * Returns the meta object for the attribute '{@link spd.adjustmenttype.RelativeAdjustment#getMinAdjustmentValue <em>Min Adjustment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Adjustment Value</em>'.
	 * @see spd.adjustmenttype.RelativeAdjustment#getMinAdjustmentValue()
	 * @see #getRelativeAdjustment()
	 * @generated
	 */
	EAttribute getRelativeAdjustment_MinAdjustmentValue();

	/**
	 * Returns the meta object for class '{@link spd.adjustmenttype.AbsoluteAdjustment <em>Absolute Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Adjustment</em>'.
	 * @see spd.adjustmenttype.AbsoluteAdjustment
	 * @generated
	 */
	EClass getAbsoluteAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link spd.adjustmenttype.AbsoluteAdjustment#getGoalValue <em>Goal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Value</em>'.
	 * @see spd.adjustmenttype.AbsoluteAdjustment#getGoalValue()
	 * @see #getAbsoluteAdjustment()
	 * @generated
	 */
	EAttribute getAbsoluteAdjustment_GoalValue();

	/**
	 * Returns the meta object for class '{@link spd.adjustmenttype.StepAdjustment <em>Step Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Adjustment</em>'.
	 * @see spd.adjustmenttype.StepAdjustment
	 * @generated
	 */
	EClass getStepAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link spd.adjustmenttype.StepAdjustment#getStepValue <em>Step Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Value</em>'.
	 * @see spd.adjustmenttype.StepAdjustment#getStepValue()
	 * @see #getStepAdjustment()
	 * @generated
	 */
	EAttribute getStepAdjustment_StepValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdjustmenttypeFactory getAdjustmenttypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spd.adjustmenttype.impl.AdjustmentTypeImpl <em>Adjustment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.adjustmenttype.impl.AdjustmentTypeImpl
		 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getAdjustmentType()
		 * @generated
		 */
		EClass ADJUSTMENT_TYPE = eINSTANCE.getAdjustmentType();

		/**
		 * The meta object literal for the '{@link spd.adjustmenttype.impl.RelativeAdjustmentImpl <em>Relative Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.adjustmenttype.impl.RelativeAdjustmentImpl
		 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getRelativeAdjustment()
		 * @generated
		 */
		EClass RELATIVE_ADJUSTMENT = eINSTANCE.getRelativeAdjustment();

		/**
		 * The meta object literal for the '<em><b>Percentage Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE = eINSTANCE.getRelativeAdjustment_PercentageValue();

		/**
		 * The meta object literal for the '<em><b>Min Adjustment Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE = eINSTANCE.getRelativeAdjustment_MinAdjustmentValue();

		/**
		 * The meta object literal for the '{@link spd.adjustmenttype.impl.AbsoluteAdjustmentImpl <em>Absolute Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.adjustmenttype.impl.AbsoluteAdjustmentImpl
		 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getAbsoluteAdjustment()
		 * @generated
		 */
		EClass ABSOLUTE_ADJUSTMENT = eINSTANCE.getAbsoluteAdjustment();

		/**
		 * The meta object literal for the '<em><b>Goal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_ADJUSTMENT__GOAL_VALUE = eINSTANCE.getAbsoluteAdjustment_GoalValue();

		/**
		 * The meta object literal for the '{@link spd.adjustmenttype.impl.StepAdjustmentImpl <em>Step Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.adjustmenttype.impl.StepAdjustmentImpl
		 * @see spd.adjustmenttype.impl.AdjustmenttypePackageImpl#getStepAdjustment()
		 * @generated
		 */
		EClass STEP_ADJUSTMENT = eINSTANCE.getStepAdjustment();

		/**
		 * The meta object literal for the '<em><b>Step Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_ADJUSTMENT__STEP_VALUE = eINSTANCE.getStepAdjustment_StepValue();

	}

} //AdjustmenttypePackage
