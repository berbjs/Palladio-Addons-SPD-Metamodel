/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.constraints.policy.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import de.unistuttgart.slingshot.spd.SpdPackage;

import de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage;

import de.unistuttgart.slingshot.spd.adjustments.impl.AdjustmentsPackageImpl;

import de.unistuttgart.slingshot.spd.constraints.ConstraintsPackage;

import de.unistuttgart.slingshot.spd.constraints.impl.ConstraintsPackageImpl;

import de.unistuttgart.slingshot.spd.constraints.policy.CooldownConstraint;
import de.unistuttgart.slingshot.spd.constraints.policy.IntervallConstraint;
import de.unistuttgart.slingshot.spd.constraints.policy.PolicyConstraint;
import de.unistuttgart.slingshot.spd.constraints.policy.PolicyFactory;
import de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage;
import de.unistuttgart.slingshot.spd.constraints.policy.StateBasedContraint;
import de.unistuttgart.slingshot.spd.constraints.policy.TemporalConstraint;
import de.unistuttgart.slingshot.spd.constraints.policy.ThrashingConstraint;

import de.unistuttgart.slingshot.spd.constraints.target.TargetPackage;

import de.unistuttgart.slingshot.spd.constraints.target.impl.TargetPackageImpl;

import de.unistuttgart.slingshot.spd.impl.SpdPackageImpl;

import de.unistuttgart.slingshot.spd.targets.TargetsPackage;

import de.unistuttgart.slingshot.spd.targets.impl.TargetsPackageImpl;

import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import de.unistuttgart.slingshot.spd.triggers.impl.TriggersPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervallConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateBasedContraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thrashingConstraintEClass = null;

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
	 * @see de.unistuttgart.slingshot.spd.constraints.policy.PolicyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyPackageImpl() {
		super(eNS_URI, PolicyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyPackage init() {
		if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolicyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolicyPackageImpl thePolicyPackage = registeredPolicyPackage instanceof PolicyPackageImpl ? (PolicyPackageImpl)registeredPolicyPackage : new PolicyPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
		AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl)(registeredPackage instanceof AdjustmentsPackageImpl ? registeredPackage : AdjustmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(registeredPackage instanceof ConstraintsPackageImpl ? registeredPackage : ConstraintsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl)(registeredPackage instanceof TargetPackageImpl ? registeredPackage : TargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);

		// Create package meta-data objects
		thePolicyPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theTargetPackage.createPackageContents();
		theTriggersPackage.createPackageContents();

		// Initialize created meta-data
		thePolicyPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
		return thePolicyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyConstraint() {
		return policyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalConstraint() {
		return temporalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntervallConstraint() {
		return intervallConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntervallConstraint_Offset() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntervallConstraint_IntervallDuration() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCooldownConstraint() {
		return cooldownConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCooldownConstraint_CooldownTime() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCooldownConstraint_MaxScalingOperations() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateBasedContraint() {
		return stateBasedContraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrashingConstraint() {
		return thrashingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrashingConstraint_MinimumTimeNoThrashing() {
		return (EAttribute)thrashingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyFactory getPolicyFactory() {
		return (PolicyFactory)getEFactoryInstance();
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
		policyConstraintEClass = createEClass(POLICY_CONSTRAINT);

		temporalConstraintEClass = createEClass(TEMPORAL_CONSTRAINT);

		intervallConstraintEClass = createEClass(INTERVALL_CONSTRAINT);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__OFFSET);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__INTERVALL_DURATION);

		cooldownConstraintEClass = createEClass(COOLDOWN_CONSTRAINT);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__COOLDOWN_TIME);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS);

		stateBasedContraintEClass = createEClass(STATE_BASED_CONTRAINT);

		thrashingConstraintEClass = createEClass(THRASHING_CONSTRAINT);
		createEAttribute(thrashingConstraintEClass, THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING);
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
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		policyConstraintEClass.getESuperTypes().add(theConstraintsPackage.getAbstractConstraint());
		temporalConstraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		intervallConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());
		cooldownConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());
		stateBasedContraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		thrashingConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(policyConstraintEClass, PolicyConstraint.class, "PolicyConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalConstraintEClass, TemporalConstraint.class, "TemporalConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervallConstraintEClass, IntervallConstraint.class, "IntervallConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervallConstraint_Offset(), ecorePackage.getEInt(), "offset", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervallConstraint_IntervallDuration(), ecorePackage.getEInt(), "intervallDuration", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooldownConstraintEClass, CooldownConstraint.class, "CooldownConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooldownConstraint_CooldownTime(), ecorePackage.getEDouble(), "cooldownTime", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCooldownConstraint_MaxScalingOperations(), ecorePackage.getEInt(), "maxScalingOperations", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateBasedContraintEClass, StateBasedContraint.class, "StateBasedContraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thrashingConstraintEClass, ThrashingConstraint.class, "ThrashingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrashingConstraint_MinimumTimeNoThrashing(), ecorePackage.getEDouble(), "minimumTimeNoThrashing", null, 0, 1, ThrashingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PolicyPackageImpl
