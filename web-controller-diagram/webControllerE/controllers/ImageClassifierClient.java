/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EObject;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Classifier Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.ImageClassifierClient#getResponsebuilder <em>Responsebuilder</em>}</li>
 * </ul>
 *
 * @see webControllerE.controllers.controllersPackage#getImageClassifierClient()
 * @model
 * @generated
 */
public interface ImageClassifierClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsebuilder</em>' reference.
	 * @see #setResponsebuilder(ResponseBuilder)
	 * @see webControllerE.controllers.controllersPackage#getImageClassifierClient_Responsebuilder()
	 * @model
	 * @generated
	 */
	ResponseBuilder getResponsebuilder();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.ImageClassifierClient#getResponsebuilder <em>Responsebuilder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsebuilder</em>' reference.
	 * @see #getResponsebuilder()
	 * @generated
	 */
	void setResponsebuilder(ResponseBuilder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ClassificationResponse classify(Tweet tweet);

} // ImageClassifierClient
