/**
 */
package controller.tests;

import controller.ControllerFactory;
import controller.TweetIterator;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tweet Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link controller.TweetIterator#next(controller.Tweet) <em>Next</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TweetIteratorTest extends TestCase {

	/**
	 * The fixture for this Tweet Iterator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetIterator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TweetIteratorTest.class);
	}

	/**
	 * Constructs a new Tweet Iterator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetIteratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tweet Iterator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TweetIterator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tweet Iterator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetIterator getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControllerFactory.eINSTANCE.createTweetIterator());
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

	/**
	 * Tests the '{@link controller.TweetIterator#next(controller.Tweet) <em>Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.TweetIterator#next(controller.Tweet)
	 * @generated
	 */
	public void testNext__Tweet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TweetIteratorTest
