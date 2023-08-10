/**
 */
package org.palladiosimulator.semanticspd;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticspd.Queue#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Queue#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getQueue()
 * @model
 * @generated
 */
public interface Queue extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getQueue_RequiredRole()
	 * @model
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Queue#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Passive Resource Queue Messages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Resource Queue Messages</em>' reference.
	 * @see #setPassiveResourceQueueMessages(PassiveResource)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getQueue_PassiveResourceQueueMessages()
	 * @model
	 * @generated
	 */
	PassiveResource getPassiveResourceQueueMessages();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Resource Queue Messages</em>' reference.
	 * @see #getPassiveResourceQueueMessages()
	 * @generated
	 */
	void setPassiveResourceQueueMessages(PassiveResource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getQueue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Queue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Queue
