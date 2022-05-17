/**
 */
package de.unistuttgart.sqa.slingshot.spd.triggers.impl;

import de.unistuttgart.sqa.slingshot.spd.triggers.NETWORKUSAGETYPE;
import de.unistuttgart.sqa.slingshot.spd.triggers.NetworkUtilizationTrigger;
import de.unistuttgart.sqa.slingshot.spd.triggers.TriggersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.triggers.impl.NetworkUtilizationTriggerImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link de.unistuttgart.sqa.slingshot.spd.triggers.impl.NetworkUtilizationTriggerImpl#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkUtilizationTriggerImpl extends ResourceUtilizationBasedTriggerImpl implements NetworkUtilizationTrigger {
	/**
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final NETWORKUSAGETYPE USAGE_TYPE_EDEFAULT = NETWORKUSAGETYPE.SEND;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected NETWORKUSAGETYPE usageType = USAGE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkingResource() <em>Linking Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResource()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkingResource> linkingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkUtilizationTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.NETWORK_UTILIZATION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NETWORKUSAGETYPE getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageType(NETWORKUSAGETYPE newUsageType) {
		NETWORKUSAGETYPE oldUsageType = usageType;
		usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkingResource> getLinkingResource() {
		if (linkingResource == null) {
			linkingResource = new EObjectResolvingEList<LinkingResource>(LinkingResource.class, this, TriggersPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE);
		}
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				return getUsageType();
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				return getLinkingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType((NETWORKUSAGETYPE)newValue);
				return;
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				getLinkingResource().clear();
				getLinkingResource().addAll((Collection<? extends LinkingResource>)newValue);
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
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
				return;
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				getLinkingResource().clear();
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
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				return usageType != USAGE_TYPE_EDEFAULT;
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				return linkingResource != null && !linkingResource.isEmpty();
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
		result.append(" (usageType: ");
		result.append(usageType);
		result.append(')');
		return result.toString();
	}

} //NetworkUtilizationTriggerImpl
