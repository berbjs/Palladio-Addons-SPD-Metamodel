/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets.tests;

import de.unistuttgart.slingshot.spd.targets.ElasticInfrastructure;
import de.unistuttgart.slingshot.spd.targets.TargetsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elastic Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticInfrastructureTest extends TargetGroupTest {

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
	public static void main(String[] args) {
		TestRunner.run(ElasticInfrastructureTest.class);
	}

	/**
	 * Constructs a new Elastic Infrastructure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticInfrastructureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elastic Infrastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElasticInfrastructure getFixture() {
		return (ElasticInfrastructure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TargetsFactory.eINSTANCE.createElasticInfrastructure());
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

} //ElasticInfrastructureTest
