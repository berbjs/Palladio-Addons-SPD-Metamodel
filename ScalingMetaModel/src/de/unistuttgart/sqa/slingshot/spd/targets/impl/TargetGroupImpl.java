/**
 */
package de.unistuttgart.sqa.slingshot.spd.targets.impl;

import de.unistuttgart.sqa.slingshot.spd.targets.TargetGroup;
import de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.targets.impl.TargetGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.targets.impl.TargetGroupImpl#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetGroupImpl extends MinimalEObjectImpl.Container implements TargetGroup {
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
	 * The cached value of the '{@link #getPCM_ResourceEnvironment() <em>PCM Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCM_ResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvironment pcM_ResourceEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.TARGET_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.TARGET_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getPCM_ResourceEnvironment() {
		if (pcM_ResourceEnvironment != null && pcM_ResourceEnvironment.eIsProxy()) {
			InternalEObject oldPCM_ResourceEnvironment = (InternalEObject)pcM_ResourceEnvironment;
			pcM_ResourceEnvironment = (ResourceEnvironment)eResolveProxy(oldPCM_ResourceEnvironment);
			if (pcM_ResourceEnvironment != oldPCM_ResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT, oldPCM_ResourceEnvironment, pcM_ResourceEnvironment));
			}
		}
		return pcM_ResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment basicGetPCM_ResourceEnvironment() {
		return pcM_ResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCM_ResourceEnvironment(ResourceEnvironment newPCM_ResourceEnvironment) {
		ResourceEnvironment oldPCM_ResourceEnvironment = pcM_ResourceEnvironment;
		pcM_ResourceEnvironment = newPCM_ResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT, oldPCM_ResourceEnvironment, pcM_ResourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.TARGET_GROUP__NAME:
				return getName();
			case TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT:
				if (resolve) return getPCM_ResourceEnvironment();
				return basicGetPCM_ResourceEnvironment();
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
			case TargetsPackage.TARGET_GROUP__NAME:
				setName((String)newValue);
				return;
			case TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT:
				setPCM_ResourceEnvironment((ResourceEnvironment)newValue);
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
			case TargetsPackage.TARGET_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT:
				setPCM_ResourceEnvironment((ResourceEnvironment)null);
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
			case TargetsPackage.TARGET_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetsPackage.TARGET_GROUP__PCM_RESOURCE_ENVIRONMENT:
				return pcM_ResourceEnvironment != null;
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

} //TargetGroupImpl
