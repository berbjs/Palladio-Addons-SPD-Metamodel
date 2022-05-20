/**
 */
package de.unistuttgart.slingshot.spd.targets;

import de.unistuttgart.slingshot.spd.SpdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unistuttgart.slingshot.spd.targets.TargetsFactory
 * @model kind="package"
 * @generated
 */
public interface TargetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/unistuttgart/sqa/slingshot/spd/targets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.unistuttgart.sqa.slingshot.spd.targets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetsPackage eINSTANCE = de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.slingshot.spd.targets.impl.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetGroupImpl
	 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__NAME = SpdPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__TARGET_CONSTRAINTS = SpdPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = SpdPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_OPERATION_COUNT = SpdPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticInfrastructureImpl <em>Elastic Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticInfrastructureImpl
	 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticInfrastructure()
	 * @generated
	 */
	int ELASTIC_INFRASTRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE__NAME = TARGET_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>PCM Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT = TARGET_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elastic Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elastic Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticServiceImpl <em>Elastic Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticServiceImpl
	 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticService()
	 * @generated
	 */
	int ELASTIC_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_SERVICE__NAME = TARGET_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_SERVICE__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Elastic Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_SERVICE_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elastic Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_SERVICE_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticQueueImpl <em>Elastic Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticQueueImpl
	 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticQueue()
	 * @generated
	 */
	int ELASTIC_QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_QUEUE__NAME = TARGET_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_QUEUE__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Elastic Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_QUEUE_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elastic Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_QUEUE_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.unistuttgart.slingshot.spd.targets.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.slingshot.spd.targets.TargetGroup#getTargetConstraints <em>Target Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Constraints</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.TargetGroup#getTargetConstraints()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_TargetConstraints();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure <em>Elastic Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elastic Infrastructure</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure
	 * @generated
	 */
	EClass getElasticInfrastructure();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PCM Resource Environment</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment()
	 * @see #getElasticInfrastructure()
	 * @generated
	 */
	EReference getElasticInfrastructure_PCM_ResourceEnvironment();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.slingshot.spd.targets.ElasticService <em>Elastic Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elastic Service</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.ElasticService
	 * @generated
	 */
	EClass getElasticService();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.slingshot.spd.targets.ElasticQueue <em>Elastic Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elastic Queue</em>'.
	 * @see de.unistuttgart.slingshot.spd.targets.ElasticQueue
	 * @generated
	 */
	EClass getElasticQueue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetsFactory getTargetsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.unistuttgart.slingshot.spd.targets.impl.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetGroupImpl
		 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '<em><b>Target Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__TARGET_CONSTRAINTS = eINSTANCE.getTargetGroup_TargetConstraints();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticInfrastructureImpl <em>Elastic Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticInfrastructureImpl
		 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticInfrastructure()
		 * @generated
		 */
		EClass ELASTIC_INFRASTRUCTURE = eINSTANCE.getElasticInfrastructure();

		/**
		 * The meta object literal for the '<em><b>PCM Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT = eINSTANCE.getElasticInfrastructure_PCM_ResourceEnvironment();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticServiceImpl <em>Elastic Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticServiceImpl
		 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticService()
		 * @generated
		 */
		EClass ELASTIC_SERVICE = eINSTANCE.getElasticService();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.slingshot.spd.targets.impl.ElasticQueueImpl <em>Elastic Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.slingshot.spd.targets.impl.ElasticQueueImpl
		 * @see de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl#getElasticQueue()
		 * @generated
		 */
		EClass ELASTIC_QUEUE = eINSTANCE.getElasticQueue();

	}

} //TargetsPackage
