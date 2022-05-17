/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/unistuttgart/sqa/slingshot/spd/constraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.unistuttgart.sqa.slingshot.spd.constraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.PolicyConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getPolicyConstraint()
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
	int POLICY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TemporalConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTemporalConstraint()
	 * @generated
	 */
	int TEMPORAL_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetConstraintImpl <em>Target Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTargetConstraint()
	 * @generated
	 */
	int TARGET_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Targetgroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CONSTRAINT__TARGETGROUP = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetGroupSizeConstraintImpl <em>Target Group Size Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetGroupSizeConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTargetGroupSizeConstraint()
	 * @generated
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Targetgroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT__TARGETGROUP = TARGET_CONSTRAINT__TARGETGROUP;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = TARGET_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = TARGET_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT_FEATURE_COUNT = TARGET_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT_OPERATION_COUNT = TARGET_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.IntervallConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getIntervallConstraint()
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
	int INTERVALL_CONSTRAINT__OFFSET = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervall Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__INTERVALL_DURATION = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getCooldownConstraint()
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
	int COOLDOWN_CONSTRAINT__COOLDOWN_TIME = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Scaling Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.StateBasedContraintImpl <em>State Based Contraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.StateBasedContraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getStateBasedContraint()
	 * @generated
	 */
	int STATE_BASED_CONTRAINT = 5;

	/**
	 * The number of structural features of the '<em>State Based Contraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_CONTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Based Contraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_CONTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.ThrashingConstraintImpl <em>Thrashing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ThrashingConstraintImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getThrashingConstraint()
	 * @generated
	 */
	int THRASHING_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Minimum Time No Thrashing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thrashing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thrashing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.PolicyConstraint
	 * @generated
	 */
	EClass getPolicyConstraint();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TemporalConstraint
	 * @generated
	 */
	EClass getTemporalConstraint();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint <em>Target Group Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group Size Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint
	 * @generated
	 */
	EClass getTargetGroupSizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMinSize()
	 * @see #getTargetGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getTargetGroupSizeConstraint_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint#getMaxSize()
	 * @see #getTargetGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getTargetGroupSizeConstraint_MaxSize();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint <em>Intervall Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervall Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint
	 * @generated
	 */
	EClass getIntervallConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint#getOffset()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_Offset();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint#getIntervallDuration <em>Intervall Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intervall Duration</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint#getIntervallDuration()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_IntervallDuration();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint <em>Cooldown Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint
	 * @generated
	 */
	EClass getCooldownConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown Time</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint#getCooldownTime()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_CooldownTime();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scaling Operations</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint#getMaxScalingOperations()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_MaxScalingOperations();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.StateBasedContraint <em>State Based Contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Based Contraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.StateBasedContraint
	 * @generated
	 */
	EClass getStateBasedContraint();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint <em>Thrashing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thrashing Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint
	 * @generated
	 */
	EClass getThrashingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint#getMinimumTimeNoThrashing <em>Minimum Time No Thrashing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Time No Thrashing</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint#getMinimumTimeNoThrashing()
	 * @see #getThrashingConstraint()
	 * @generated
	 */
	EAttribute getThrashingConstraint_MinimumTimeNoThrashing();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint <em>Target Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Constraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint
	 * @generated
	 */
	EClass getTargetConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint#getTargetgroup <em>Targetgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetgroup</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint#getTargetgroup()
	 * @see #getTargetConstraint()
	 * @generated
	 */
	EReference getTargetConstraint_Targetgroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

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
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.PolicyConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getPolicyConstraint()
		 * @generated
		 */
		EClass POLICY_CONSTRAINT = eINSTANCE.getPolicyConstraint();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TemporalConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTemporalConstraint()
		 * @generated
		 */
		EClass TEMPORAL_CONSTRAINT = eINSTANCE.getTemporalConstraint();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetGroupSizeConstraintImpl <em>Target Group Size Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetGroupSizeConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTargetGroupSizeConstraint()
		 * @generated
		 */
		EClass TARGET_GROUP_SIZE_CONSTRAINT = eINSTANCE.getTargetGroupSizeConstraint();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MinSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MaxSize();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.IntervallConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getIntervallConstraint()
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
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.CooldownConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getCooldownConstraint()
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

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.StateBasedContraintImpl <em>State Based Contraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.StateBasedContraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getStateBasedContraint()
		 * @generated
		 */
		EClass STATE_BASED_CONTRAINT = eINSTANCE.getStateBasedContraint();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.ThrashingConstraintImpl <em>Thrashing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ThrashingConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getThrashingConstraint()
		 * @generated
		 */
		EClass THRASHING_CONSTRAINT = eINSTANCE.getThrashingConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum Time No Thrashing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = eINSTANCE.getThrashingConstraint_MinimumTimeNoThrashing();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetConstraintImpl <em>Target Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.TargetConstraintImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsPackageImpl#getTargetConstraint()
		 * @generated
		 */
		EClass TARGET_CONSTRAINT = eINSTANCE.getTargetConstraint();

		/**
		 * The meta object literal for the '<em><b>Targetgroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CONSTRAINT__TARGETGROUP = eINSTANCE.getTargetConstraint_Targetgroup();

	}

} //ConstraintsPackage
