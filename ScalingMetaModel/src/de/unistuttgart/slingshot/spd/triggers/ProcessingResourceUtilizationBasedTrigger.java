/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Utilization Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class for triggers based on the utilization of a processing resource such as CPU, RAM or HDD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.ProcessingResourceUtilizationBasedTrigger#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getProcessingResourceUtilizationBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingResourceUtilizationBasedTrigger extends ResourceUtilizationBasedTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of resource containers for which the processing resource utilization is collected. If left empty, all resource containers as referenced by the TargetGroup are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getProcessingResourceUtilizationBasedTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

} // ProcessingResourceUtilizationBasedTrigger
