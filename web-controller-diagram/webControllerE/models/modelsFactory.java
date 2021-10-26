/**
 */
package webControllerE.models;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webControllerE.models.modelsPackage
 * @generated
 */
public interface modelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modelsFactory eINSTANCE = webControllerE.models.impl.modelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Classification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Response</em>'.
	 * @generated
	 */
	ClassificationResponse createClassificationResponse();

	/**
	 * Returns a new object of class '<em>Tweet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweet</em>'.
	 * @generated
	 */
	Tweet createTweet();

	/**
	 * Returns a new object of class '<em>Response Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Builder</em>'.
	 * @generated
	 */
	ResponseBuilder createResponseBuilder();

	/**
	 * Returns a new object of class '<em>Localized Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localized Response</em>'.
	 * @generated
	 */
	LocalizedResponse createLocalizedResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modelsPackage getmodelsPackage();

} //modelsFactory
