/**
 */
package de.unistuttgart.sqa.slingshot.spd;

import de.unistuttgart.sqa.slingshot.spd.adjustments.AdjustmentType;

import de.unistuttgart.sqa.slingshot.spd.constraints.PolicyConstraint;

import de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup;

import de.unistuttgart.sqa.slingshot.spd.triggers.ScalingTrigger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scaling policy determines the complete information for scaling a parituclar target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#isActive <em>Active</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getScalingTrigger <em>Scaling Trigger</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getAdjustmentType <em>Adjustment Type</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getTargetGroup <em>Target Group</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyconstraint <em>Policyconstraint</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='policyNameInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot policyNameInvariant='policyName &lt;&gt;\'\''"
 * @generated
 */
public interface ScalingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Name</em>' attribute.
	 * @see #setPolicyName(String)
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_PolicyName()
	 * @model
	 * @generated
	 */
	String getPolicyName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name</em>' attribute.
	 * @see #getPolicyName()
	 * @generated
	 */
	void setPolicyName(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Scaling Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Trigger</em>' containment reference.
	 * @see #setScalingTrigger(ScalingTrigger)
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_ScalingTrigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScalingTrigger getScalingTrigger();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getScalingTrigger <em>Scaling Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Trigger</em>' containment reference.
	 * @see #getScalingTrigger()
	 * @generated
	 */
	void setScalingTrigger(ScalingTrigger value);

	/**
	 * Returns the value of the '<em><b>Adjustment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment Type</em>' containment reference.
	 * @see #setAdjustmentType(AdjustmentType)
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_AdjustmentType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdjustmentType getAdjustmentType();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getAdjustmentType <em>Adjustment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment Type</em>' containment reference.
	 * @see #getAdjustmentType()
	 * @generated
	 */
	void setAdjustmentType(AdjustmentType value);

	/**
	 * Returns the value of the '<em><b>Target Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Group</em>' reference.
	 * @see #setTargetGroup(TargetGroup)
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_TargetGroup()
	 * @model required="true"
	 * @generated
	 */
	TargetGroup getTargetGroup();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.ScalingPolicy#getTargetGroup <em>Target Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Group</em>' reference.
	 * @see #getTargetGroup()
	 * @generated
	 */
	void setTargetGroup(TargetGroup value);

	/**
	 * Returns the value of the '<em><b>Policyconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.sqa.slingshot.spd.constraints.PolicyConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policyconstraint</em>' containment reference list.
	 * @see de.unistuttgart.sqa.slingshot.spd.SpdPackage#getScalingPolicy_Policyconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyConstraint> getPolicyconstraint();

} // ScalingPolicy
