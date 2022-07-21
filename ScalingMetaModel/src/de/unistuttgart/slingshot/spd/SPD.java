/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd;

import de.unistuttgart.slingshot.spd.targets.TargetGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root elements that consists of all scaling policies under analysis for a given cloud application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.SPD#getScalingPolicies <em>Scaling Policies</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.SPD#getTargetGroups <em>Target Groups</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.SpdPackage#getSPD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameInvariant noSameTargetGroup'"
 * @generated
 */
public interface SPD extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Scaling Policies</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.slingshot.spd.ScalingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of scaling policies under analysis for the given cloud application model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scaling Policies</em>' containment reference list.
	 * @see de.unistuttgart.slingshot.spd.SpdPackage#getSPD_ScalingPolicies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ScalingPolicy> getScalingPolicies();

	/**
	 * Returns the value of the '<em><b>Target Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.slingshot.spd.targets.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Groups</em>' containment reference list.
	 * @see de.unistuttgart.slingshot.spd.SpdPackage#getSPD_TargetGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetGroup> getTargetGroups();

} // SPD
