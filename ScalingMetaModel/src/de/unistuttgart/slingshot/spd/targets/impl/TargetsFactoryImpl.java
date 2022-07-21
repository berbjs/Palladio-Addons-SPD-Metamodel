/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets.impl;

import de.unistuttgart.slingshot.spd.targets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetsFactoryImpl extends EFactoryImpl implements TargetsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

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
			case TargetsPackage.ELASTIC_SERVICE: return createElasticService();
			case TargetsPackage.ELASTIC_QUEUE: return createElasticQueue();
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
	public ElasticService createElasticService() {
		ElasticServiceImpl elasticService = new ElasticServiceImpl();
		return elasticService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElasticQueue createElasticQueue() {
		ElasticQueueImpl elasticQueue = new ElasticQueueImpl();
		return elasticQueue;
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
