/**
 */
package org.palladiosimulator.semanticspd;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Competing Consumers Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getBrokerAssembly <em>Broker Assembly</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getQueue <em>Queue</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getCompetingConsumersGroupCfg()
 * @model
 * @generated
 */
public interface CompetingConsumersGroupCfg extends TargetGroupCfg {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(AssemblyContext)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getCompetingConsumersGroupCfg_Unit()
	 * @model
	 * @generated
	 */
	AssemblyContext getUnit();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getCompetingConsumersGroupCfg_Elements()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getElements();

	/**
	 * Returns the value of the '<em><b>Broker Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Assembly</em>' reference.
	 * @see #setBrokerAssembly(AssemblyContext)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getCompetingConsumersGroupCfg_BrokerAssembly()
	 * @model
	 * @generated
	 */
	AssemblyContext getBrokerAssembly();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getBrokerAssembly <em>Broker Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Assembly</em>' reference.
	 * @see #getBrokerAssembly()
	 * @generated
	 */
	void setBrokerAssembly(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.semanticspd.Queue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' containment reference list.
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getCompetingConsumersGroupCfg_Queue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Queue> getQueue();

} // CompetingConsumersGroupCfg
