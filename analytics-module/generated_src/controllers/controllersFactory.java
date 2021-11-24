/**
 */
package analytics.controllers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analytics.controllers.controllersPackage
 * @generated
 */
public interface controllersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	controllersFactory eINSTANCE = analytics.controllers.impl.controllersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tweets Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweets Controller</em>'.
	 * @generated
	 */
	TweetsController createTweetsController();

	/**
	 * Returns a new object of class '<em>Feedback Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Controller</em>'.
	 * @generated
	 */
	FeedbaclController createFeedbackController();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	controllersPackage getcontrollersPackage();

} //controllersFactory
