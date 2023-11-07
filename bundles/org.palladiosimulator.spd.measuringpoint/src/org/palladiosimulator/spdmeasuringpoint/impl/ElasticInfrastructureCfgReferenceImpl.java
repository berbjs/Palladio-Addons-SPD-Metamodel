/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.semanticspd.ElasticInfrastructureCfg;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureCfgReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elastic Infrastructure Cfg Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.ElasticInfrastructureCfgReferenceImpl#getElasticInfrastructureCfg <em>Elastic Infrastructure Cfg</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElasticInfrastructureCfgReferenceImpl extends MinimalEObjectImpl.Container
		implements ElasticInfrastructureCfgReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticInfrastructureCfgReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElasticInfrastructureCfg getElasticInfrastructureCfg() {
		return (ElasticInfrastructureCfg) eDynamicGet(
				SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticInfrastructureCfg basicGetElasticInfrastructureCfg() {
		return (ElasticInfrastructureCfg) eDynamicGet(
				SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElasticInfrastructureCfg(ElasticInfrastructureCfg newElasticInfrastructureCfg) {
		eDynamicSet(SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG,
				newElasticInfrastructureCfg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG:
			if (resolve)
				return getElasticInfrastructureCfg();
			return basicGetElasticInfrastructureCfg();
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG:
			setElasticInfrastructureCfg((ElasticInfrastructureCfg) newValue);
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG:
			setElasticInfrastructureCfg((ElasticInfrastructureCfg) null);
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_CFG_REFERENCE__ELASTIC_INFRASTRUCTURE_CFG:
			return basicGetElasticInfrastructureCfg() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElasticInfrastructureCfgReferenceImpl
