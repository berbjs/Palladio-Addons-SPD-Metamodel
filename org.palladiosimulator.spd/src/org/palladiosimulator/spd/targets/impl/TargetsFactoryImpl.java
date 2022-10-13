/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.spd.targets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetsFactoryImpl extends EFactoryImpl implements TargetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetsFactory init() {
		try {
			TargetsFactory theTargetsFactory = (TargetsFactory)EPackage.Registry.INSTANCE.getEFactory(TargetsPackage.eNS_URI);
			if (theTargetsFactory != null) {
				return theTargetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TargetsPackage.ELASTIC_INFRASTRUCTURE: return createElasticInfrastructure();
			case TargetsPackage.SERVICE_GROUP: return createServiceGroup();
			case TargetsPackage.COMPETING_CONSUMERS_GROUP: return createCompetingConsumersGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElasticInfrastructure createElasticInfrastructure() {
		ElasticInfrastructureImpl elasticInfrastructure = new ElasticInfrastructureImpl();
		return elasticInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceGroup createServiceGroup() {
		ServiceGroupImpl serviceGroup = new ServiceGroupImpl();
		return serviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetingConsumersGroup createCompetingConsumersGroup() {
		CompetingConsumersGroupImpl competingConsumersGroup = new CompetingConsumersGroupImpl();
		return competingConsumersGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetsPackage getTargetsPackage() {
		return (TargetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetsPackage getPackage() {
		return TargetsPackage.eINSTANCE;
	}

} //TargetsFactoryImpl
