/**
 */
package de.unistuttgart.sqa.slingshot.spd.targets;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage#getTargetGroup()
 * @model
 * @generated
 */
public interface TargetGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage#getTargetGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>PCM Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCM Resource Environment</em>' reference.
	 * @see #setPCM_ResourceEnvironment(ResourceEnvironment)
	 * @see de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage#getTargetGroup_PCM_ResourceEnvironment()
	 * @model
	 * @generated
	 */
	ResourceEnvironment getPCM_ResourceEnvironment();

	/**
	 * Sets the value of the '{@link de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCM Resource Environment</em>' reference.
	 * @see #getPCM_ResourceEnvironment()
	 * @generated
	 */
	void setPCM_ResourceEnvironment(ResourceEnvironment value);

} // TargetGroup
