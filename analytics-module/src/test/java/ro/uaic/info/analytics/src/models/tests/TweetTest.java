/**
 */
package controller.tests;

import controller.ControllerFactory;
import controller.Tweet;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link controller.Tweet#getHashtags() <em>Get Hashtags</em>}</li>
 *   <li>{@link controller.Tweet#getTweetLocation() <em>Get Tweet Location</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TweetTest extends TestCase {

	/**
	 * The fixture for this Tweet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tweet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TweetTest.class);
	}

	/**
	 * Constructs a new Tweet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tweet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tweet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tweet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tweet getFixture() {
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
		setFixture(ControllerFactory.eINSTANCE.createTweet());
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
	 * Tests the '{@link controller.Tweet#getHashtags() <em>Get Hashtags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.Tweet#getHashtags()
	 * @generated
	 */
	public void testGetHashtags() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link controller.Tweet#getTweetLocation() <em>Get Tweet Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.Tweet#getTweetLocation()
	 * @generated
	 */
	public void testGetTweetLocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TweetTest
