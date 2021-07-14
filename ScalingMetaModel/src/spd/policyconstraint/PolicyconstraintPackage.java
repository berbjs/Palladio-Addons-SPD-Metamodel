/**
 */
package spd.policyconstraint;

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
 * @see spd.policyconstraint.PolicyconstraintFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyconstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policyconstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "policyconstraint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policyconstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyconstraintPackage eINSTANCE = spd.policyconstraint.impl.PolicyconstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.PolicyConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getPolicyConstraint()
	 * @generated
	 */
	int POLICY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_FEATURE_COUNT = SpdPackage.POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_OPERATION_COUNT = SpdPackage.POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.TimeBasedConstraintImpl <em>Time Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.TimeBasedConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTimeBasedConstraint()
	 * @generated
	 */
	int TIME_BASED_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Time Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_CONSTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_CONSTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.GroupSizeConstraintImpl <em>Group Size Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.GroupSizeConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getGroupSizeConstraint()
	 * @generated
	 */
	int GROUP_SIZE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_CONSTRAINT__MIN_SIZE = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_CONSTRAINT__MAX_SIZE = POLICY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_CONSTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_CONSTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.IntervallConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getIntervallConstraint()
	 * @generated
	 */
	int INTERVALL_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__OFFSET = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervall Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__INTERVALL_DURATION = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_FEATURE_COUNT = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_OPERATION_COUNT = TIME_BASED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.CooldownConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getCooldownConstraint()
	 * @generated
	 */
	int COOLDOWN_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Cooldown Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__COOLDOWN_TIME = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Scaling Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_FEATURE_COUNT = TIME_BASED_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_OPERATION_COUNT = TIME_BASED_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Constraint</em>'.
	 * @see spd.policyconstraint.PolicyConstraint
	 * @generated
	 */
	EClass getPolicyConstraint();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.TimeBasedConstraint <em>Time Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based Constraint</em>'.
	 * @see spd.policyconstraint.TimeBasedConstraint
	 * @generated
	 */
	EClass getTimeBasedConstraint();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.GroupSizeConstraint <em>Group Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Size Constraint</em>'.
	 * @see spd.policyconstraint.GroupSizeConstraint
	 * @generated
	 */
	EClass getGroupSizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.GroupSizeConstraint#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see spd.policyconstraint.GroupSizeConstraint#getMinSize()
	 * @see #getGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getGroupSizeConstraint_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.GroupSizeConstraint#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see spd.policyconstraint.GroupSizeConstraint#getMaxSize()
	 * @see #getGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getGroupSizeConstraint_MaxSize();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.IntervallConstraint <em>Intervall Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervall Constraint</em>'.
	 * @see spd.policyconstraint.IntervallConstraint
	 * @generated
	 */
	EClass getIntervallConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.IntervallConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see spd.policyconstraint.IntervallConstraint#getOffset()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_Offset();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.IntervallConstraint#getIntervallDuration <em>Intervall Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intervall Duration</em>'.
	 * @see spd.policyconstraint.IntervallConstraint#getIntervallDuration()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_IntervallDuration();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.CooldownConstraint <em>Cooldown Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Constraint</em>'.
	 * @see spd.policyconstraint.CooldownConstraint
	 * @generated
	 */
	EClass getCooldownConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown Time</em>'.
	 * @see spd.policyconstraint.CooldownConstraint#getCooldownTime()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_CooldownTime();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scaling Operations</em>'.
	 * @see spd.policyconstraint.CooldownConstraint#getMaxScalingOperations()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_MaxScalingOperations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyconstraintFactory getPolicyconstraintFactory();

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
		 * The meta object literal for the '{@link spd.policyconstraint.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.PolicyConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getPolicyConstraint()
		 * @generated
		 */
		EClass POLICY_CONSTRAINT = eINSTANCE.getPolicyConstraint();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.TimeBasedConstraintImpl <em>Time Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.TimeBasedConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTimeBasedConstraint()
		 * @generated
		 */
		EClass TIME_BASED_CONSTRAINT = eINSTANCE.getTimeBasedConstraint();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.GroupSizeConstraintImpl <em>Group Size Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.GroupSizeConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getGroupSizeConstraint()
		 * @generated
		 */
		EClass GROUP_SIZE_CONSTRAINT = eINSTANCE.getGroupSizeConstraint();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SIZE_CONSTRAINT__MIN_SIZE = eINSTANCE.getGroupSizeConstraint_MinSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_SIZE_CONSTRAINT__MAX_SIZE = eINSTANCE.getGroupSizeConstraint_MaxSize();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.IntervallConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getIntervallConstraint()
		 * @generated
		 */
		EClass INTERVALL_CONSTRAINT = eINSTANCE.getIntervallConstraint();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALL_CONSTRAINT__OFFSET = eINSTANCE.getIntervallConstraint_Offset();

		/**
		 * The meta object literal for the '<em><b>Intervall Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALL_CONSTRAINT__INTERVALL_DURATION = eINSTANCE.getIntervallConstraint_IntervallDuration();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.CooldownConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getCooldownConstraint()
		 * @generated
		 */
		EClass COOLDOWN_CONSTRAINT = eINSTANCE.getCooldownConstraint();

		/**
		 * The meta object literal for the '<em><b>Cooldown Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOLDOWN_CONSTRAINT__COOLDOWN_TIME = eINSTANCE.getCooldownConstraint_CooldownTime();

		/**
		 * The meta object literal for the '<em><b>Max Scaling Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = eINSTANCE.getCooldownConstraint_MaxScalingOperations();

	}

} //PolicyconstraintPackage
