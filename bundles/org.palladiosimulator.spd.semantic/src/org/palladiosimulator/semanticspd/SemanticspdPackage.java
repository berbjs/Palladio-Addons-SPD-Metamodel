/**
 */
package org.palladiosimulator.semanticspd;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.palladiosimulator.semanticspd.SemanticspdFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticspdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semanticspd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinitionSemantic/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "semanticspd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticspdPackage eINSTANCE = org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.ConfigurationImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Spd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SPD = 0;

	/**
	 * The feature id for the '<em><b>Enacted Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENACTED_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Target Cfgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TARGET_CFGS = 2;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ALLOCATION = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESOURCE_ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__REPOSITORY = 6;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.TargetGroupCfgImpl <em>Target Group Cfg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.TargetGroupCfgImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getTargetGroupCfg()
	 * @generated
	 */
	int TARGET_GROUP_CFG = 1;

	/**
	 * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_CFG__ENACTED_POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Target Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_CFG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_CFG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.ElasticInfrastructureCfgImpl <em>Elastic Infrastructure Cfg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.ElasticInfrastructureCfgImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getElasticInfrastructureCfg()
	 * @generated
	 */
	int ELASTIC_INFRASTRUCTURE_CFG = 2;

	/**
	 * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG__ENACTED_POLICIES = TARGET_GROUP_CFG__ENACTED_POLICIES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG__UNIT = TARGET_GROUP_CFG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS = TARGET_GROUP_CFG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linking Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE = TARGET_GROUP_CFG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT = TARGET_GROUP_CFG_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Elastic Infrastructure Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG_FEATURE_COUNT = TARGET_GROUP_CFG_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Elastic Infrastructure Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTIC_INFRASTRUCTURE_CFG_OPERATION_COUNT = TARGET_GROUP_CFG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.ServiceGroupCfgImpl <em>Service Group Cfg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.ServiceGroupCfgImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getServiceGroupCfg()
	 * @generated
	 */
	int SERVICE_GROUP_CFG = 3;

	/**
	 * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG__ENACTED_POLICIES = TARGET_GROUP_CFG__ENACTED_POLICIES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG__UNIT = TARGET_GROUP_CFG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG__ELEMENTS = TARGET_GROUP_CFG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load Balancing Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY = TARGET_GROUP_CFG_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG_FEATURE_COUNT = TARGET_GROUP_CFG_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUP_CFG_OPERATION_COUNT = TARGET_GROUP_CFG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.CompetingConsumersGroupCfgImpl <em>Competing Consumers Group Cfg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.CompetingConsumersGroupCfgImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getCompetingConsumersGroupCfg()
	 * @generated
	 */
	int COMPETING_CONSUMERS_GROUP_CFG = 4;

	/**
	 * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG__ENACTED_POLICIES = TARGET_GROUP_CFG__ENACTED_POLICIES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG__UNIT = TARGET_GROUP_CFG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG__ELEMENTS = TARGET_GROUP_CFG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Broker Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG__BROKER_ASSEMBLY = TARGET_GROUP_CFG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG__QUEUE = TARGET_GROUP_CFG_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Competing Consumers Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG_FEATURE_COUNT = TARGET_GROUP_CFG_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Competing Consumers Group Cfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_CONSUMERS_GROUP_CFG_OPERATION_COUNT = TARGET_GROUP_CFG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.semanticspd.impl.QueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.semanticspd.impl.QueueImpl
	 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 5;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__REQUIRED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Passive Resource Queue Messages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getSpd <em>Spd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spd</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getSpd()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Spd();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getEnactedPolicy <em>Enacted Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enacted Policy</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getEnactedPolicy()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_EnactedPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.semanticspd.Configuration#getTargetCfgs <em>Target Cfgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Cfgs</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getTargetCfgs()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_TargetCfgs();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getAllocation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Allocation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getSystem()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_System();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Environment</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getResourceEnvironment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ResourceEnvironment();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Configuration#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.palladiosimulator.semanticspd.Configuration#getRepository()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Repository();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.TargetGroupCfg <em>Target Group Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group Cfg</em>'.
	 * @see org.palladiosimulator.semanticspd.TargetGroupCfg
	 * @generated
	 */
	EClass getTargetGroupCfg();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.semanticspd.TargetGroupCfg#getEnactedPolicies <em>Enacted Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enacted Policies</em>'.
	 * @see org.palladiosimulator.semanticspd.TargetGroupCfg#getEnactedPolicies()
	 * @see #getTargetGroupCfg()
	 * @generated
	 */
	EReference getTargetGroupCfg_EnactedPolicies();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.ElasticInfrastructureCfg <em>Elastic Infrastructure Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elastic Infrastructure Cfg</em>'.
	 * @see org.palladiosimulator.semanticspd.ElasticInfrastructureCfg
	 * @generated
	 */
	EClass getElasticInfrastructureCfg();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getUnit()
	 * @see #getElasticInfrastructureCfg()
	 * @generated
	 */
	EReference getElasticInfrastructureCfg_Unit();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getElements()
	 * @see #getElasticInfrastructureCfg()
	 * @generated
	 */
	EReference getElasticInfrastructureCfg_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getLinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linking Resource</em>'.
	 * @see org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getLinkingResource()
	 * @see #getElasticInfrastructureCfg()
	 * @generated
	 */
	EReference getElasticInfrastructureCfg_LinkingResource();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Environment</em>'.
	 * @see org.palladiosimulator.semanticspd.ElasticInfrastructureCfg#getResourceEnvironment()
	 * @see #getElasticInfrastructureCfg()
	 * @generated
	 */
	EReference getElasticInfrastructureCfg_ResourceEnvironment();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.ServiceGroupCfg <em>Service Group Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Group Cfg</em>'.
	 * @see org.palladiosimulator.semanticspd.ServiceGroupCfg
	 * @generated
	 */
	EClass getServiceGroupCfg();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.ServiceGroupCfg#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.palladiosimulator.semanticspd.ServiceGroupCfg#getUnit()
	 * @see #getServiceGroupCfg()
	 * @generated
	 */
	EReference getServiceGroupCfg_Unit();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.semanticspd.ServiceGroupCfg#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.palladiosimulator.semanticspd.ServiceGroupCfg#getElements()
	 * @see #getServiceGroupCfg()
	 * @generated
	 */
	EReference getServiceGroupCfg_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.ServiceGroupCfg#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Balancing Assembly</em>'.
	 * @see org.palladiosimulator.semanticspd.ServiceGroupCfg#getLoadBalancingAssembly()
	 * @see #getServiceGroupCfg()
	 * @generated
	 */
	EReference getServiceGroupCfg_LoadBalancingAssembly();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg <em>Competing Consumers Group Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competing Consumers Group Cfg</em>'.
	 * @see org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg
	 * @generated
	 */
	EClass getCompetingConsumersGroupCfg();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getUnit()
	 * @see #getCompetingConsumersGroupCfg()
	 * @generated
	 */
	EReference getCompetingConsumersGroupCfg_Unit();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getElements()
	 * @see #getCompetingConsumersGroupCfg()
	 * @generated
	 */
	EReference getCompetingConsumersGroupCfg_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getBrokerAssembly <em>Broker Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Broker Assembly</em>'.
	 * @see org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getBrokerAssembly()
	 * @see #getCompetingConsumersGroupCfg()
	 * @generated
	 */
	EReference getCompetingConsumersGroupCfg_BrokerAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queue</em>'.
	 * @see org.palladiosimulator.semanticspd.CompetingConsumersGroupCfg#getQueue()
	 * @see #getCompetingConsumersGroupCfg()
	 * @generated
	 */
	EReference getCompetingConsumersGroupCfg_Queue();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.semanticspd.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see org.palladiosimulator.semanticspd.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Queue#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see org.palladiosimulator.semanticspd.Queue#getRequiredRole()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_RequiredRole();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.semanticspd.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Resource Queue Messages</em>'.
	 * @see org.palladiosimulator.semanticspd.Queue#getPassiveResourceQueueMessages()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_PassiveResourceQueueMessages();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.semanticspd.Queue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.semanticspd.Queue#getName()
	 * @see #getQueue()
	 * @generated
	 */
	EAttribute getQueue_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticspdFactory getSemanticspdFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.ConfigurationImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Spd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__SPD = eINSTANCE.getConfiguration_Spd();

		/**
		 * The meta object literal for the '<em><b>Enacted Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENACTED_POLICY = eINSTANCE.getConfiguration_EnactedPolicy();

		/**
		 * The meta object literal for the '<em><b>Target Cfgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__TARGET_CFGS = eINSTANCE.getConfiguration_TargetCfgs();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ALLOCATION = eINSTANCE.getConfiguration_Allocation();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__SYSTEM = eINSTANCE.getConfiguration_System();

		/**
		 * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__RESOURCE_ENVIRONMENT = eINSTANCE.getConfiguration_ResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__REPOSITORY = eINSTANCE.getConfiguration_Repository();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.TargetGroupCfgImpl <em>Target Group Cfg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.TargetGroupCfgImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getTargetGroupCfg()
		 * @generated
		 */
		EClass TARGET_GROUP_CFG = eINSTANCE.getTargetGroupCfg();

		/**
		 * The meta object literal for the '<em><b>Enacted Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP_CFG__ENACTED_POLICIES = eINSTANCE.getTargetGroupCfg_EnactedPolicies();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.ElasticInfrastructureCfgImpl <em>Elastic Infrastructure Cfg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.ElasticInfrastructureCfgImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getElasticInfrastructureCfg()
		 * @generated
		 */
		EClass ELASTIC_INFRASTRUCTURE_CFG = eINSTANCE.getElasticInfrastructureCfg();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELASTIC_INFRASTRUCTURE_CFG__UNIT = eINSTANCE.getElasticInfrastructureCfg_Unit();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS = eINSTANCE.getElasticInfrastructureCfg_Elements();

		/**
		 * The meta object literal for the '<em><b>Linking Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE = eINSTANCE.getElasticInfrastructureCfg_LinkingResource();

		/**
		 * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT = eINSTANCE.getElasticInfrastructureCfg_ResourceEnvironment();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.ServiceGroupCfgImpl <em>Service Group Cfg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.ServiceGroupCfgImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getServiceGroupCfg()
		 * @generated
		 */
		EClass SERVICE_GROUP_CFG = eINSTANCE.getServiceGroupCfg();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUP_CFG__UNIT = eINSTANCE.getServiceGroupCfg_Unit();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUP_CFG__ELEMENTS = eINSTANCE.getServiceGroupCfg_Elements();

		/**
		 * The meta object literal for the '<em><b>Load Balancing Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY = eINSTANCE.getServiceGroupCfg_LoadBalancingAssembly();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.CompetingConsumersGroupCfgImpl <em>Competing Consumers Group Cfg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.CompetingConsumersGroupCfgImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getCompetingConsumersGroupCfg()
		 * @generated
		 */
		EClass COMPETING_CONSUMERS_GROUP_CFG = eINSTANCE.getCompetingConsumersGroupCfg();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETING_CONSUMERS_GROUP_CFG__UNIT = eINSTANCE.getCompetingConsumersGroupCfg_Unit();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETING_CONSUMERS_GROUP_CFG__ELEMENTS = eINSTANCE.getCompetingConsumersGroupCfg_Elements();

		/**
		 * The meta object literal for the '<em><b>Broker Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETING_CONSUMERS_GROUP_CFG__BROKER_ASSEMBLY = eINSTANCE.getCompetingConsumersGroupCfg_BrokerAssembly();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETING_CONSUMERS_GROUP_CFG__QUEUE = eINSTANCE.getCompetingConsumersGroupCfg_Queue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.semanticspd.impl.QueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.semanticspd.impl.QueueImpl
		 * @see org.palladiosimulator.semanticspd.impl.SemanticspdPackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE__REQUIRED_ROLE = eINSTANCE.getQueue_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Queue Messages</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES = eINSTANCE.getQueue_PassiveResourceQueueMessages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE__NAME = eINSTANCE.getQueue_Name();

	}

} //SemanticspdPackage
