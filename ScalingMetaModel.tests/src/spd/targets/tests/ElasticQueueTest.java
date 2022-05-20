/**
 */
package spd.targets.tests;

import junit.textui.TestRunner;

import spd.targets.ElasticQueue;
import spd.targets.TargetsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elastic Queue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticQueueTest extends TargetGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElasticQueueTest.class);
	}

	/**
	 * Constructs a new Elastic Queue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticQueueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elastic Queue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElasticQueue getFixture() {
		return (ElasticQueue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TargetsFactory.eINSTANCE.createElasticQueue());
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

} //ElasticQueueTest
