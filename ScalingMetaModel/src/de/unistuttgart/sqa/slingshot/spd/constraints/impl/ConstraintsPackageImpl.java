/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import de.unistuttgart.sqa.slingshot.spd.SpdPackage;

import de.unistuttgart.sqa.slingshot.spd.adjustments.AdjustmentsPackage;

import de.unistuttgart.sqa.slingshot.spd.adjustments.impl.AdjustmentsPackageImpl;

import de.unistuttgart.sqa.slingshot.spd.constraints.Constraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsFactory;
import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage;
import de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.IntervallConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.PolicyConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.StateBasedContraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.TargetConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.TemporalConstraint;
import de.unistuttgart.sqa.slingshot.spd.constraints.ThrashingConstraint;

import de.unistuttgart.sqa.slingshot.spd.impl.SpdPackageImpl;

import de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage;

import de.unistuttgart.sqa.slingshot.spd.targets.impl.TargetsPackageImpl;

import de.unistuttgart.sqa.slingshot.spd.triggers.TriggersPackage;

import de.unistuttgart.sqa.slingshot.spd.triggers.impl.TriggersPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
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
	private EClass targetGroupSizeConstraintEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetConstraintEClass = null;

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
	 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited) return (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConstraintsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = registeredConstraintsPackage instanceof ConstraintsPackageImpl ? (ConstraintsPackageImpl)registeredConstraintsPackage : new ConstraintsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		theTriggersPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyConstraint() {
		return policyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalConstraint() {
		return temporalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetGroupSizeConstraint() {
		return targetGroupSizeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetGroupSizeConstraint_MinSize() {
		return (EAttribute)targetGroupSizeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetGroupSizeConstraint_MaxSize() {
		return (EAttribute)targetGroupSizeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervallConstraint() {
		return intervallConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervallConstraint_Offset() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervallConstraint_IntervallDuration() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooldownConstraint() {
		return cooldownConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooldownConstraint_CooldownTime() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooldownConstraint_MaxScalingOperations() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateBasedContraint() {
		return stateBasedContraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrashingConstraint() {
		return thrashingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrashingConstraint_MinimumTimeNoThrashing() {
		return (EAttribute)thrashingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetConstraint() {
		return targetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetConstraint_Targetgroup() {
		return (EReference)targetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory)getEFactoryInstance();
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

		targetGroupSizeConstraintEClass = createEClass(TARGET_GROUP_SIZE_CONSTRAINT);
		createEAttribute(targetGroupSizeConstraintEClass, TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE);
		createEAttribute(targetGroupSizeConstraintEClass, TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE);

		intervallConstraintEClass = createEClass(INTERVALL_CONSTRAINT);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__OFFSET);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__INTERVALL_DURATION);

		cooldownConstraintEClass = createEClass(COOLDOWN_CONSTRAINT);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__COOLDOWN_TIME);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS);

		stateBasedContraintEClass = createEClass(STATE_BASED_CONTRAINT);

		thrashingConstraintEClass = createEClass(THRASHING_CONSTRAINT);
		createEAttribute(thrashingConstraintEClass, THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING);

		constraintEClass = createEClass(CONSTRAINT);

		targetConstraintEClass = createEClass(TARGET_CONSTRAINT);
		createEReference(targetConstraintEClass, TARGET_CONSTRAINT__TARGETGROUP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		policyConstraintEClass.getESuperTypes().add(this.getConstraint());
		temporalConstraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		targetGroupSizeConstraintEClass.getESuperTypes().add(this.getTargetConstraint());
		intervallConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());
		cooldownConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());
		stateBasedContraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		thrashingConstraintEClass.getESuperTypes().add(this.getTemporalConstraint());
		targetConstraintEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(policyConstraintEClass, PolicyConstraint.class, "PolicyConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalConstraintEClass, TemporalConstraint.class, "TemporalConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetGroupSizeConstraintEClass, TargetGroupSizeConstraint.class, "TargetGroupSizeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetGroupSizeConstraint_MinSize(), ecorePackage.getEInt(), "minSize", null, 1, 1, TargetGroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetGroupSizeConstraint_MaxSize(), ecorePackage.getEInt(), "maxSize", null, 1, 1, TargetGroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervallConstraintEClass, IntervallConstraint.class, "IntervallConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervallConstraint_Offset(), ecorePackage.getEInt(), "offset", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervallConstraint_IntervallDuration(), ecorePackage.getEInt(), "intervallDuration", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooldownConstraintEClass, CooldownConstraint.class, "CooldownConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooldownConstraint_CooldownTime(), ecorePackage.getEDouble(), "cooldownTime", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCooldownConstraint_MaxScalingOperations(), ecorePackage.getEInt(), "maxScalingOperations", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateBasedContraintEClass, StateBasedContraint.class, "StateBasedContraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thrashingConstraintEClass, ThrashingConstraint.class, "ThrashingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrashingConstraint_MinimumTimeNoThrashing(), ecorePackage.getEDouble(), "minimumTimeNoThrashing", null, 0, 1, ThrashingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetConstraintEClass, TargetConstraint.class, "TargetConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetConstraint_Targetgroup(), theTargetsPackage.getTargetGroup(), null, "targetgroup", null, 1, 1, TargetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConstraintsPackageImpl
