/**
 */
package spd.policyconstraint.tests;

import junit.textui.TestRunner;

import spd.policyconstraint.GroupSizeConstraint;
import spd.policyconstraint.PolicyconstraintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupSizeConstraintTest extends PolicyConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupSizeConstraintTest.class);
	}

	/**
	 * Constructs a new Group Size Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSizeConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Size Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupSizeConstraint getFixture() {
		return (GroupSizeConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyconstraintFactory.eINSTANCE.createGroupSizeConstraint());
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

} //GroupSizeConstraintTest
