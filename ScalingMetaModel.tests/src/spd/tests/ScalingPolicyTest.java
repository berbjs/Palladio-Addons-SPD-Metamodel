/**
 */
package spd.tests;

import junit.textui.TestRunner;

import spd.ScalingPolicy;
import spd.SpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingPolicyTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScalingPolicyTest.class);
	}

	/**
	 * Constructs a new Scaling Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scaling Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScalingPolicy getFixture() {
		return (ScalingPolicy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createScalingPolicy());
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

} //ScalingPolicyTest
