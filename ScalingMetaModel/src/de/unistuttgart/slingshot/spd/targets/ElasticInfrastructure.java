/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elastic Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.targets.TargetsPackage#getElasticInfrastructure()
 * @model
 * @generated
 */
public interface ElasticInfrastructure extends TargetGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>PCM Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCM Resource Environment</em>' reference.
	 * @see #setPCM_ResourceEnvironment(ResourceEnvironment)
	 * @see de.unistuttgart.slingshot.spd.targets.TargetsPackage#getElasticInfrastructure_PCM_ResourceEnvironment()
	 * @model
	 * @generated
	 */
	ResourceEnvironment getPCM_ResourceEnvironment();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCM Resource Environment</em>' reference.
	 * @see #getPCM_ResourceEnvironment()
	 * @generated
	 */
	void setPCM_ResourceEnvironment(ResourceEnvironment value);

} // ElasticInfrastructure
