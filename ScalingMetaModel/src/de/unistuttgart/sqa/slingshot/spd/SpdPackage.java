/**
 */
package de.unistuttgart.sqa.slingshot.spd;

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
 * @see de.unistuttgart.sqa.slingshot.spd.SpdFactory
 * @model kind="package"
 * @generated
 */
public interface SpdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/unistuttgart/sqa/slingshot/spd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.unistuttgart.sqa.slingshot.spd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdPackage eINSTANCE = de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.impl.ScalingPolicyImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl#getScalingPolicy()
	 * @generated
	 */
	int SCALING_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__POLICY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Scaling Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__SCALING_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Adjustment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ADJUSTMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Target Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__TARGET_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Policyconstraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__POLICYCONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.sqa.slingshot.spd.impl.SPDImpl <em>SPD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.sqa.slingshot.spd.impl.SPDImpl
	 * @see de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl#getSPD()
	 * @generated
	 */
	int SPD = 1;

	/**
	 * The feature id for the '<em><b>Scalingpolicy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__SCALINGPOLICY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Target Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__TARGET_GROUPS = 2;

	/**
	 * The number of structural features of the '<em>SPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy <em>Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Policy</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy
	 * @generated
	 */
	EClass getScalingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyName()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#isActive()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_Active();

	/**
	 * Returns the meta object for the containment reference '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling Trigger</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getScalingTrigger()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_ScalingTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getAdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adjustment Type</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getAdjustmentType()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_AdjustmentType();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getTargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Group</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getTargetGroup()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_TargetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyconstraint <em>Policyconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policyconstraint</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyconstraint()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Policyconstraint();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.sqa.slingshot.spd.SPD <em>SPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPD</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.SPD
	 * @generated
	 */
	EClass getSPD();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.sqa.slingshot.spd.SPD#getScalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalingpolicy</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.SPD#getScalingpolicy()
	 * @see #getSPD()
	 * @generated
	 */
	EReference getSPD_Scalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.sqa.slingshot.spd.SPD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.SPD#getName()
	 * @see #getSPD()
	 * @generated
	 */
	EAttribute getSPD_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.sqa.slingshot.spd.SPD#getTargetGroups <em>Target Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Groups</em>'.
	 * @see de.unistuttgart.sqa.slingshot.spd.SPD#getTargetGroups()
	 * @see #getSPD()
	 * @generated
	 */
	EReference getSPD_TargetGroups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpdFactory getSpdFactory();

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
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.impl.ScalingPolicyImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl#getScalingPolicy()
		 * @generated
		 */
		EClass SCALING_POLICY = eINSTANCE.getScalingPolicy();

		/**
		 * The meta object literal for the '<em><b>Policy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__POLICY_NAME = eINSTANCE.getScalingPolicy_PolicyName();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__ACTIVE = eINSTANCE.getScalingPolicy_Active();

		/**
		 * The meta object literal for the '<em><b>Scaling Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__SCALING_TRIGGER = eINSTANCE.getScalingPolicy_ScalingTrigger();

		/**
		 * The meta object literal for the '<em><b>Adjustment Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__ADJUSTMENT_TYPE = eINSTANCE.getScalingPolicy_AdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Target Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__TARGET_GROUP = eINSTANCE.getScalingPolicy_TargetGroup();

		/**
		 * The meta object literal for the '<em><b>Policyconstraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__POLICYCONSTRAINT = eINSTANCE.getScalingPolicy_Policyconstraint();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.sqa.slingshot.spd.impl.SPDImpl <em>SPD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.sqa.slingshot.spd.impl.SPDImpl
		 * @see de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl#getSPD()
		 * @generated
		 */
		EClass SPD = eINSTANCE.getSPD();

		/**
		 * The meta object literal for the '<em><b>Scalingpolicy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD__SCALINGPOLICY = eINSTANCE.getSPD_Scalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPD__NAME = eINSTANCE.getSPD_Name();

		/**
		 * The meta object literal for the '<em><b>Target Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD__TARGET_GROUPS = eINSTANCE.getSPD_TargetGroups();

	}

} //SpdPackage
