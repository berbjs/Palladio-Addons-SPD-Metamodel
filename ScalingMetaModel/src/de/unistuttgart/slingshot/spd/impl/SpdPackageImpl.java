/**
 */
package de.unistuttgart.slingshot.spd.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import de.unistuttgart.slingshot.spd.NamedElement;
import de.unistuttgart.slingshot.spd.ScalingPolicy;
import de.unistuttgart.slingshot.spd.SpdFactory;
import de.unistuttgart.slingshot.spd.SpdPackage;

import de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage;

import de.unistuttgart.slingshot.spd.adjustments.impl.AdjustmentsPackageImpl;

import de.unistuttgart.slingshot.spd.constraints.ConstraintsPackage;

import de.unistuttgart.slingshot.spd.constraints.impl.ConstraintsPackageImpl;

import de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage;

import de.unistuttgart.slingshot.spd.constraints.policy.impl.PolicyPackageImpl;

import de.unistuttgart.slingshot.spd.constraints.target.TargetPackage;

import de.unistuttgart.slingshot.spd.constraints.target.impl.TargetPackageImpl;

import de.unistuttgart.slingshot.spd.targets.TargetsPackage;

import de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl;

import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import de.unistuttgart.slingshot.spd.triggers.impl.TriggersPackageImpl;

import de.unistuttgart.slingshot.spd.util.SpdValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdPackageImpl extends EPackageImpl implements SpdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	 * @see de.unistuttgart.slingshot.spd.SpdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdPackageImpl() {
		super(eNS_URI, SpdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpdPackage init() {
		if (isInited) return (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpdPackageImpl theSpdPackage = registeredSpdPackage instanceof SpdPackageImpl ? (SpdPackageImpl)registeredSpdPackage : new SpdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
		AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl)(registeredPackage instanceof AdjustmentsPackageImpl ? registeredPackage : AdjustmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(registeredPackage instanceof ConstraintsPackageImpl ? registeredPackage : ConstraintsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl)(registeredPackage instanceof TargetPackageImpl ? registeredPackage : TargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);

		// Create package meta-data objects
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theTargetPackage.createPackageContents();
		theTriggersPackage.createPackageContents();

		// Initialize created meta-data
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSpdPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SpdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSpdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdPackage.eNS_URI, theSpdPackage);
		return theSpdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingPolicy() {
		return scalingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingPolicy_Active() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_ScalingTrigger() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_AdjustmentType() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_TargetGroup() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_PolicyConstraints() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPD() {
		return spdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPD_ScalingPolicies() {
		return (EReference)spdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPD_TargetGroups() {
		return (EReference)spdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdFactory getSpdFactory() {
		return (SpdFactory)getEFactoryInstance();
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
		scalingPolicyEClass = createEClass(SCALING_POLICY);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__ACTIVE);
		createEReference(scalingPolicyEClass, SCALING_POLICY__SCALING_TRIGGER);
		createEReference(scalingPolicyEClass, SCALING_POLICY__ADJUSTMENT_TYPE);
		createEReference(scalingPolicyEClass, SCALING_POLICY__TARGET_GROUP);
		createEReference(scalingPolicyEClass, SCALING_POLICY__POLICY_CONSTRAINTS);

		spdEClass = createEClass(SPD);
		createEReference(spdEClass, SPD__SCALING_POLICIES);
		createEReference(spdEClass, SPD__TARGET_GROUPS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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
		TargetsPackage theTargetsPackage = (TargetsPackage)EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		AdjustmentsPackage theAdjustmentsPackage = (AdjustmentsPackage)EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		TriggersPackage theTriggersPackage = (TriggersPackage)EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		PolicyPackage thePolicyPackage = (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTargetsPackage);
		getESubpackages().add(theAdjustmentsPackage);
		getESubpackages().add(theConstraintsPackage);
		getESubpackages().add(theTriggersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scalingPolicyEClass.getESuperTypes().add(this.getNamedElement());
		spdEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(scalingPolicyEClass, ScalingPolicy.class, "ScalingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalingPolicy_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_ScalingTrigger(), theTriggersPackage.getScalingTrigger(), null, "scalingTrigger", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_AdjustmentType(), theAdjustmentsPackage.getAdjustmentType(), null, "adjustmentType", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_TargetGroup(), theTargetsPackage.getTargetGroup(), null, "targetGroup", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_PolicyConstraints(), thePolicyPackage.getPolicyConstraint(), null, "policyConstraints", null, 0, -1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spdEClass, de.unistuttgart.slingshot.spd.SPD.class, "SPD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPD_ScalingPolicies(), this.getScalingPolicy(), null, "scalingPolicies", null, 1, -1, de.unistuttgart.slingshot.spd.SPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPD_TargetGroups(), theTargetsPackage.getTargetGroup(), null, "targetGroups", null, 1, -1, de.unistuttgart.slingshot.spd.SPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (scalingPolicyEClass,
		   source,
		   new String[] {
			   "constraints", "policyNameInvariant"
		   });
		addAnnotation
		  (spdEClass,
		   source,
		   new String[] {
			   "constraints", "nameInvariant noSameTargetGroup"
		   });
	}

} //SpdPackageImpl
