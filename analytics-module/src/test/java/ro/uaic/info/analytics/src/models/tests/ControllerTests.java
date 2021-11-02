/**
 */
package controller.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>controller</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerTests extends TestSuite {

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
		TestSuite suite = new ControllerTests("controller Tests");
		suite.addTestSuite(TweetTest.class);
		suite.addTestSuite(ImageTest.class);
		suite.addTestSuite(LocationTest.class);
		suite.addTestSuite(TweetCollectionTest.class);
		suite.addTestSuite(TweetIteratorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerTests(String name) {
		super(name);
	}

} //ControllerTests
