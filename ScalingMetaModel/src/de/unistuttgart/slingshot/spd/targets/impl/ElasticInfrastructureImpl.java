/**
 */
package de.unistuttgart.slingshot.spd.targets.impl;

import de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure;
import de.unistuttgart.slingshot.spd.targets.TargetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elastic Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticInfrastructureImpl#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticInfrastructureImpl extends TargetGroupImpl implements ElasticInfrastructure {
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
	protected ElasticInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.ELASTIC_INFRASTRUCTURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT, oldPCM_ResourceEnvironment, pcM_ResourceEnvironment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT, oldPCM_ResourceEnvironment, pcM_ResourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
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
			case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
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
			case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
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
			case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
				return pcM_ResourceEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //ElasticInfrastructureImpl
