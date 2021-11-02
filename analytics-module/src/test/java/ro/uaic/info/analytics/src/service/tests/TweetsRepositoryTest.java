/**
 */
package service.tests;

import junit.textui.TestRunner;

import service.ServiceFactory;
import service.TweetsRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tweets Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link service.TweetsRepository#findById(int) <em>Find By Id</em>}</li>
 *   <li>{@link service.TweetsRepository#findAll() <em>Find All</em>}</li>
 *   <li>{@link service.TweetsRepository#updateById(int, java.lang.Object) <em>Update By Id</em>}</li>
 *   <li>{@link service.TweetsRepository#create(java.lang.Object) <em>Create</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TweetsRepositoryTest extends JpaRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TweetsRepositoryTest.class);
	}

	/**
	 * Constructs a new Tweets Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tweets Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TweetsRepository getFixture() {
		return (TweetsRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceFactory.eINSTANCE.createTweetsRepository());
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
	 * Tests the '{@link service.TweetsRepository#findById(int) <em>Find By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.TweetsRepository#findById(int)
	 * @generated
	 */
	public void testFindById__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link service.TweetsRepository#findAll() <em>Find All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.TweetsRepository#findAll()
	 * @generated
	 */
	public void testFindAll() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link service.TweetsRepository#updateById(int, java.lang.Object) <em>Update By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.TweetsRepository#updateById(int, java.lang.Object)
	 * @generated
	 */
	public void testUpdateById__int_Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link service.TweetsRepository#create(java.lang.Object) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.TweetsRepository#create(java.lang.Object)
	 * @generated
	 */
	public void testCreate__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TweetsRepositoryTest
