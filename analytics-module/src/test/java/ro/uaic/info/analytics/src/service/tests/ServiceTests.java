/**
 */
package service.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>service</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ServiceTests("service Tests");
		suite.addTestSuite(TweetsServiceTest.class);
		suite.addTestSuite(TweetsRepositoryTest.class);
		suite.addTestSuite(TweetsControllerTest.class);
		suite.addTestSuite(FilteringServiceTest.class);
		suite.addTestSuite(LocationFilterRuleTest.class);
		suite.addTestSuite(LabelFilterRuleTest.class);
		suite.addTestSuite(PopularityFilterRuleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTests(String name) {
		super(name);
	}

} //ServiceTests
