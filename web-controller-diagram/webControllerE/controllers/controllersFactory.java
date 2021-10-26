/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webControllerE.controllers.controllersPackage
 * @generated
 */
public interface controllersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	controllersFactory eINSTANCE = webControllerE.controllers.impl.controllersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NLP Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NLP Client</em>'.
	 * @generated
	 */
	NLPClient createNLPClient();

	/**
	 * Returns a new object of class '<em>Image Classifier Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Classifier Client</em>'.
	 * @generated
	 */
	ImageClassifierClient createImageClassifierClient();

	/**
	 * Returns a new object of class '<em>Web Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Controller</em>'.
	 * @generated
	 */
	WebController createWebController();

	/**
	 * Returns a new object of class '<em>Analytics Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analytics Client</em>'.
	 * @generated
	 */
	AnalyticsClient createAnalyticsClient();

	/**
	 * Returns a new object of class '<em>Check Existance Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Existance Response</em>'.
	 * @generated
	 */
	CheckExistanceResponse createCheckExistanceResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	controllersPackage getcontrollersPackage();

} //controllersFactory
