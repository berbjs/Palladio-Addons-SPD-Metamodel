/**
 */
package de.unistuttgart.slingshot.spd.triggers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Count Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getTaskCountTrigger()
 * @model
 * @generated
 */
public interface TaskCountTrigger extends ThresholdBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of resource containers for which task count is used. If left empty, all resource containers as referenced by the TargetGroup are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getTaskCountTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

	/**
	 * Returns the value of the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation for monitors inside a single resource container. Since a resource container may consists of multiple resources of same type (e.g., several CPUs) then the specified aggregation method determines how multiple monitors should be aggregated within a single resource container.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD
	 * @see #setProcessingResourceAggregation(AGGREGATIONMETHOD)
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getTaskCountTrigger_ProcessingResourceAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getProcessingResourceAggregation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD
	 * @see #getProcessingResourceAggregation()
	 * @generated
	 */
	void setProcessingResourceAggregation(AGGREGATIONMETHOD value);

	/**
	 * Returns the value of the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation accross different resource containers in the Target Group. For example if two containers C1 and C2 have a resource utilizaiton of 0.6, respectively 0.8, then choosing AVERAGE as an aggreagtion method then it determines that the value of 0.7 should be compared against the threshold value. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD
	 * @see #setResourceContainerAggregation(AGGREGATIONMETHOD)
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getTaskCountTrigger_ResourceContainerAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getResourceContainerAggregation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.triggers.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see de.unistuttgart.slingshot.spd.triggers.AGGREGATIONMETHOD
	 * @see #getResourceContainerAggregation()
	 * @generated
	 */
	void setResourceContainerAggregation(AGGREGATIONMETHOD value);

} // TaskCountTrigger
