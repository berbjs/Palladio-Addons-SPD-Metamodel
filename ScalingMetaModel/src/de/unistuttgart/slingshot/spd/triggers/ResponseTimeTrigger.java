/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ResponseTimeTrigger is a TimeBasedTrigger that is based on the response time exceeding a reference threshold value. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.triggers.ResponseTimeTrigger#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getResponseTimeTrigger()
 * @model
 * @generated
 */
public interface ResponseTimeTrigger extends TimeBasedTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation from which the response time is used. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Signature</em>' reference list.
	 * @see de.unistuttgart.slingshot.spd.triggers.TriggersPackage#getResponseTimeTrigger_OperationSignature()
	 * @model
	 * @generated
	 */
	EList<OperationSignature> getOperationSignature();

} // ResponseTimeTrigger
