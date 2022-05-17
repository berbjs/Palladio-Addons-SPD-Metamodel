/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints.tests;

import de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsFactory;
import de.unistuttgart.sqa.slingshot.spd.constraints.TargetGroupSizeConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetGroupSizeConstraintTest extends TargetConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetGroupSizeConstraintTest.class);
	}

	/**
	 * Constructs a new Target Group Size Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroupSizeConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Group Size Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetGroupSizeConstraint getFixture() {
		return (TargetGroupSizeConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConstraintsFactory.eINSTANCE.createTargetGroupSizeConstraint());
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

} //TargetGroupSizeConstraintTest
