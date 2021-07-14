/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Utilization Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getProcessingResourceUtilizationBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingResourceUtilizationBasedTrigger extends ResourceUtilizationBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getProcessingResourceUtilizationBasedTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

} // ProcessingResourceUtilizationBasedTrigger
