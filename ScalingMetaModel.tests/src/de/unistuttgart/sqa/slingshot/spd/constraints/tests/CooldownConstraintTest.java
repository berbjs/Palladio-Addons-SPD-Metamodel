/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.tests;

import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsFactory;
import de.unistuttgart.sqa.slingshot.spd.constraints.CooldownConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cooldown Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CooldownConstraintTest extends TemporalConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CooldownConstraintTest.class);
	}

	/**
	 * Constructs a new Cooldown Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooldownConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cooldown Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CooldownConstraint getFixture() {
		return (CooldownConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConstraintsFactory.eINSTANCE.createCooldownConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CooldownConstraintTest
