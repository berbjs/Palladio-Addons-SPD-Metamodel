/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Competing Consumers Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly <em>Unit Assembly</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage#getCompetingConsumersGroup()
 * @model
 * @generated
 */
public interface CompetingConsumersGroup extends TargetGroup {

	/**
	 * Returns the value of the '<em><b>Unit Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Assembly</em>' reference.
	 * @see #setUnitAssembly(AssemblyContext)
	 * @see org.palladiosimulator.spd.targets.TargetsPackage#getCompetingConsumersGroup_UnitAssembly()
	 * @model
	 * @generated
	 */
	AssemblyContext getUnitAssembly();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly <em>Unit Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Assembly</em>' reference.
	 * @see #getUnitAssembly()
	 * @generated
	 */
	void setUnitAssembly(AssemblyContext value);
} // CompetingConsumersGroup
