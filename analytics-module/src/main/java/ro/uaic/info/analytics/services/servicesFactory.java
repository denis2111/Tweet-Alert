/**
 */
package analytics.services;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analytics.services.servicesPackage
 * @generated
 */
public interface servicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	servicesFactory eINSTANCE = analytics.services.impl.servicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tweets Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweets Service</em>'.
	 * @generated
	 */
	Object createTweetsService();

	/**
	 * Returns a new object of class '<em>Feedback Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Service</em>'.
	 * @generated
	 */
	FeedbackService createFeedbackService();

	/**
	 * Returns a new object of class '<em>Users Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Users Service</em>'.
	 * @generated
	 */
	Object createUsersService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	servicesPackage getservicesPackage();

} //servicesFactory
