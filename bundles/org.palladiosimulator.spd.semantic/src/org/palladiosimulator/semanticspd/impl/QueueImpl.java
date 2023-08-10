/**
 */
package org.palladiosimulator.semanticspd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.RequiredRole;

import org.palladiosimulator.semanticspd.Queue;
import org.palladiosimulator.semanticspd.SemanticspdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.QueueImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.QueueImpl#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.QueueImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueImpl extends MinimalEObjectImpl.Container implements Queue {
	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredRole;

	/**
	 * The cached value of the '{@link #getPassiveResourceQueueMessages() <em>Passive Resource Queue Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveResourceQueueMessages()
	 * @generated
	 * @ordered
	 */
	protected PassiveResource passiveResourceQueueMessages;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticspdPackage.Literals.QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject)requiredRole;
			requiredRole = (RequiredRole)eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.QUEUE__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(RequiredRole newRequiredRole) {
		RequiredRole oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__REQUIRED_ROLE, oldRequiredRole, requiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource getPassiveResourceQueueMessages() {
		if (passiveResourceQueueMessages != null && passiveResourceQueueMessages.eIsProxy()) {
			InternalEObject oldPassiveResourceQueueMessages = (InternalEObject)passiveResourceQueueMessages;
			passiveResourceQueueMessages = (PassiveResource)eResolveProxy(oldPassiveResourceQueueMessages);
			if (passiveResourceQueueMessages != oldPassiveResourceQueueMessages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES, oldPassiveResourceQueueMessages, passiveResourceQueueMessages));
			}
		}
		return passiveResourceQueueMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource basicGetPassiveResourceQueueMessages() {
		return passiveResourceQueueMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveResourceQueueMessages(PassiveResource newPassiveResourceQueueMessages) {
		PassiveResource oldPassiveResourceQueueMessages = passiveResourceQueueMessages;
		passiveResourceQueueMessages = newPassiveResourceQueueMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES, oldPassiveResourceQueueMessages, passiveResourceQueueMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticspdPackage.QUEUE__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				if (resolve) return getPassiveResourceQueueMessages();
				return basicGetPassiveResourceQueueMessages();
			case SemanticspdPackage.QUEUE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemanticspdPackage.QUEUE__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)newValue);
				return;
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				setPassiveResourceQueueMessages((PassiveResource)newValue);
				return;
			case SemanticspdPackage.QUEUE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemanticspdPackage.QUEUE__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)null);
				return;
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				setPassiveResourceQueueMessages((PassiveResource)null);
				return;
			case SemanticspdPackage.QUEUE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemanticspdPackage.QUEUE__REQUIRED_ROLE:
				return requiredRole != null;
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				return passiveResourceQueueMessages != null;
			case SemanticspdPackage.QUEUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QueueImpl
