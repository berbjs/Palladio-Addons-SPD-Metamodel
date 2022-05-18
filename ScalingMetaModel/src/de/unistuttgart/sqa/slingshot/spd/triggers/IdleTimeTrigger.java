/**
 */
package de.unistuttgart.sqa.slingshot.spd.triggers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idle Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IdleTimeTrigger bases the trigger on the idle time of a resource container.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.triggers.IdleTimeTrigger#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.sqa.slingshot.spd.triggers.TriggersPackage#getIdleTimeTrigger()
 * @model
 * @generated
 */
public interface IdleTimeTrigger extends TimeBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource containers that are checked for being idle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see de.unistuttgart.sqa.slingshot.spd.triggers.TriggersPackage#getIdleTimeTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

} // IdleTimeTrigger
