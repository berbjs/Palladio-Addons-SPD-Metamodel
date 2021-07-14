/**
 */
package spd.scalingtrigger.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import spd.SpdPackage;

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.impl.SpdPackageImpl;

import spd.policyconstraint.PolicyconstraintPackage;

import spd.policyconstraint.impl.PolicyconstraintPackageImpl;

import spd.scalingtrigger.CPUUtilizationTrigger;
import spd.scalingtrigger.HDDUtilizationTrigger;
import spd.scalingtrigger.IdleTimeTrigger;
import spd.scalingtrigger.NetworkUtilizationTrigger;
import spd.scalingtrigger.PointInTimeTrigger;
import spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger;
import spd.scalingtrigger.RAMUtilizationTrigger;
import spd.scalingtrigger.ResourceUtilizationBasedTrigger;
import spd.scalingtrigger.ResponseTimeTrigger;
import spd.scalingtrigger.ScalingTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.TaskCountTrigger;
import spd.scalingtrigger.ThresholdBasedTrigger;
import spd.scalingtrigger.TimeBasedTrigger;

import spd.targetgroup.TargetgroupPackage;

import spd.targetgroup.impl.TargetgroupPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingtriggerPackageImpl extends EPackageImpl implements ScalingtriggerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hddUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointInTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idleTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCountTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceUtilizationBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceUtilizationBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationmethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hddusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thresholddirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spd.scalingtrigger.ScalingtriggerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScalingtriggerPackageImpl() {
		super(eNS_URI, ScalingtriggerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ScalingtriggerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScalingtriggerPackage init() {
		if (isInited) return (ScalingtriggerPackage)EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScalingtriggerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = registeredScalingtriggerPackage instanceof ScalingtriggerPackageImpl ? (ScalingtriggerPackageImpl)registeredScalingtriggerPackage : new ScalingtriggerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		SpdPackageImpl theSpdPackage = (SpdPackageImpl)(registeredPackage instanceof SpdPackageImpl ? registeredPackage : SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = (TargetgroupPackageImpl)(registeredPackage instanceof TargetgroupPackageImpl ? registeredPackage : TargetgroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);

		// Create package meta-data objects
		theScalingtriggerPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();

		// Initialize created meta-data
		theScalingtriggerPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScalingtriggerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScalingtriggerPackage.eNS_URI, theScalingtriggerPackage);
		return theScalingtriggerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingTrigger() {
		return scalingTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThresholdBasedTrigger() {
		return thresholdBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPUUtilizationTrigger() {
		return cpuUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAMUtilizationTrigger() {
		return ramUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDDUtilizationTrigger() {
		return hddUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDDUtilizationTrigger_UsageType() {
		return (EAttribute)hddUtilizationTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBasedTrigger() {
		return timeBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBasedTrigger_Threshold() {
		return (EAttribute)timeBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointInTimeTrigger() {
		return pointInTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointInTimeTrigger_PointInTime() {
		return (EAttribute)pointInTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdleTimeTrigger() {
		return idleTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdleTimeTrigger_ResourceContainer() {
		return (EReference)idleTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskCountTrigger() {
		return taskCountTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCountTrigger_Threshold() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskCountTrigger_ResourceContainer() {
		return (EReference)taskCountTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCountTrigger_ThresholdDirection() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCountTrigger_ProcessingResourceAggregation() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCountTrigger_ResourceContainerAggregation() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCountTrigger_ViolationWindow() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkUtilizationTrigger() {
		return networkUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkUtilizationTrigger_UsageType() {
		return (EAttribute)networkUtilizationTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkUtilizationTrigger_LinkingResource() {
		return (EReference)networkUtilizationTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseTimeTrigger() {
		return responseTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseTimeTrigger_OperationSignature() {
		return (EReference)responseTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseTimeTrigger_ThresholdDirection() {
		return (EAttribute)responseTimeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseTimeTrigger_ViolationWindow() {
		return (EAttribute)responseTimeTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceUtilizationBasedTrigger() {
		return resourceUtilizationBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUtilizationBasedTrigger_Threshold() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUtilizationBasedTrigger_ThresholdDirection() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUtilizationBasedTrigger_ProcessingResourceAggregation() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUtilizationBasedTrigger_ResourceContainerAggregation() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUtilizationBasedTrigger_ViolationWindow() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourceUtilizationBasedTrigger() {
		return processingResourceUtilizationBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceUtilizationBasedTrigger_ResourceContainer() {
		return (EReference)processingResourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAGGREGATIONMETHOD() {
		return aggregationmethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHDDUSAGETYPE() {
		return hddusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNETWORKUSAGETYPE() {
		return networkusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTHRESHOLDDIRECTION() {
		return thresholddirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingtriggerFactory getScalingtriggerFactory() {
		return (ScalingtriggerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scalingTriggerEClass = createEClass(SCALING_TRIGGER);

		thresholdBasedTriggerEClass = createEClass(THRESHOLD_BASED_TRIGGER);

		cpuUtilizationTriggerEClass = createEClass(CPU_UTILIZATION_TRIGGER);

		ramUtilizationTriggerEClass = createEClass(RAM_UTILIZATION_TRIGGER);

		hddUtilizationTriggerEClass = createEClass(HDD_UTILIZATION_TRIGGER);
		createEAttribute(hddUtilizationTriggerEClass, HDD_UTILIZATION_TRIGGER__USAGE_TYPE);

		timeBasedTriggerEClass = createEClass(TIME_BASED_TRIGGER);
		createEAttribute(timeBasedTriggerEClass, TIME_BASED_TRIGGER__THRESHOLD);

		pointInTimeTriggerEClass = createEClass(POINT_IN_TIME_TRIGGER);
		createEAttribute(pointInTimeTriggerEClass, POINT_IN_TIME_TRIGGER__POINT_IN_TIME);

		idleTimeTriggerEClass = createEClass(IDLE_TIME_TRIGGER);
		createEReference(idleTimeTriggerEClass, IDLE_TIME_TRIGGER__RESOURCE_CONTAINER);

		taskCountTriggerEClass = createEClass(TASK_COUNT_TRIGGER);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__THRESHOLD);
		createEReference(taskCountTriggerEClass, TASK_COUNT_TRIGGER__RESOURCE_CONTAINER);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__THRESHOLD_DIRECTION);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__VIOLATION_WINDOW);

		networkUtilizationTriggerEClass = createEClass(NETWORK_UTILIZATION_TRIGGER);
		createEAttribute(networkUtilizationTriggerEClass, NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE);
		createEReference(networkUtilizationTriggerEClass, NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE);

		responseTimeTriggerEClass = createEClass(RESPONSE_TIME_TRIGGER);
		createEReference(responseTimeTriggerEClass, RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE);
		createEAttribute(responseTimeTriggerEClass, RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION);
		createEAttribute(responseTimeTriggerEClass, RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW);

		resourceUtilizationBasedTriggerEClass = createEClass(RESOURCE_UTILIZATION_BASED_TRIGGER);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW);

		processingResourceUtilizationBasedTriggerEClass = createEClass(PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER);
		createEReference(processingResourceUtilizationBasedTriggerEClass, PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER);

		// Create enums
		aggregationmethodEEnum = createEEnum(AGGREGATIONMETHOD);
		hddusagetypeEEnum = createEEnum(HDDUSAGETYPE);
		networkusagetypeEEnum = createEEnum(NETWORKUSAGETYPE);
		thresholddirectionEEnum = createEEnum(THRESHOLDDIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpdPackage theSpdPackage = (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scalingTriggerEClass.getESuperTypes().add(theSpdPackage.getScalingTrigger());
		thresholdBasedTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		cpuUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		ramUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		hddUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		timeBasedTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		pointInTimeTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		idleTimeTriggerEClass.getESuperTypes().add(this.getTimeBasedTrigger());
		taskCountTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		networkUtilizationTriggerEClass.getESuperTypes().add(this.getResourceUtilizationBasedTrigger());
		responseTimeTriggerEClass.getESuperTypes().add(this.getTimeBasedTrigger());
		resourceUtilizationBasedTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		processingResourceUtilizationBasedTriggerEClass.getESuperTypes().add(this.getResourceUtilizationBasedTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(scalingTriggerEClass, ScalingTrigger.class, "ScalingTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thresholdBasedTriggerEClass, ThresholdBasedTrigger.class, "ThresholdBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuUtilizationTriggerEClass, CPUUtilizationTrigger.class, "CPUUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ramUtilizationTriggerEClass, RAMUtilizationTrigger.class, "RAMUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hddUtilizationTriggerEClass, HDDUtilizationTrigger.class, "HDDUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHDDUtilizationTrigger_UsageType(), this.getHDDUSAGETYPE(), "usageType", null, 0, 1, HDDUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBasedTriggerEClass, TimeBasedTrigger.class, "TimeBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBasedTrigger_Threshold(), ecorePackage.getEDouble(), "threshold", "0.0", 0, 1, TimeBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointInTimeTriggerEClass, PointInTimeTrigger.class, "PointInTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointInTimeTrigger_PointInTime(), theEcorePackage.getEDouble(), "pointInTime", null, 0, 1, PointInTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idleTimeTriggerEClass, IdleTimeTrigger.class, "IdleTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdleTimeTrigger_ResourceContainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer", null, 0, -1, IdleTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCountTriggerEClass, TaskCountTrigger.class, "TaskCountTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskCountTrigger_Threshold(), theEcorePackage.getEInt(), "threshold", "0", 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskCountTrigger_ResourceContainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer", null, 0, -1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ThresholdDirection(), this.getTHRESHOLDDIRECTION(), "thresholdDirection", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ProcessingResourceAggregation(), this.getAGGREGATIONMETHOD(), "processingResourceAggregation", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ResourceContainerAggregation(), this.getAGGREGATIONMETHOD(), "resourceContainerAggregation", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ViolationWindow(), theEcorePackage.getEDouble(), "violationWindow", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkUtilizationTriggerEClass, NetworkUtilizationTrigger.class, "NetworkUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkUtilizationTrigger_UsageType(), this.getNETWORKUSAGETYPE(), "usageType", null, 0, 1, NetworkUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkUtilizationTrigger_LinkingResource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 0, -1, NetworkUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseTimeTriggerEClass, ResponseTimeTrigger.class, "ResponseTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseTimeTrigger_OperationSignature(), theRepositoryPackage.getOperationSignature(), null, "operationSignature", null, 0, -1, ResponseTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseTimeTrigger_ThresholdDirection(), this.getTHRESHOLDDIRECTION(), "thresholdDirection", null, 0, 1, ResponseTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseTimeTrigger_ViolationWindow(), theEcorePackage.getEDouble(), "violationWindow", null, 0, 1, ResponseTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceUtilizationBasedTriggerEClass, ResourceUtilizationBasedTrigger.class, "ResourceUtilizationBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceUtilizationBasedTrigger_Threshold(), theEcorePackage.getEDouble(), "threshold", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceUtilizationBasedTrigger_ThresholdDirection(), this.getTHRESHOLDDIRECTION(), "thresholdDirection", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceUtilizationBasedTrigger_ProcessingResourceAggregation(), this.getAGGREGATIONMETHOD(), "processingResourceAggregation", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceUtilizationBasedTrigger_ResourceContainerAggregation(), this.getAGGREGATIONMETHOD(), "resourceContainerAggregation", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceUtilizationBasedTrigger_ViolationWindow(), theEcorePackage.getEDouble(), "violationWindow", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceUtilizationBasedTriggerEClass, ProcessingResourceUtilizationBasedTrigger.class, "ProcessingResourceUtilizationBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceUtilizationBasedTrigger_ResourceContainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer", null, 0, -1, ProcessingResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.class, "AGGREGATIONMETHOD");
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.AVERAGE);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MAX);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MIN);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MEDIAN);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.SUM);

		initEEnum(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.class, "HDDUSAGETYPE");
		addEEnumLiteral(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.READ);
		addEEnumLiteral(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.WRITE);

		initEEnum(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.class, "NETWORKUSAGETYPE");
		addEEnumLiteral(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.SEND);
		addEEnumLiteral(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.RECEIVE);

		initEEnum(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.class, "THRESHOLDDIRECTION");
		addEEnumLiteral(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.EXCEDEED);
		addEEnumLiteral(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.UNDERCUT);
	}

} //ScalingtriggerPackageImpl
