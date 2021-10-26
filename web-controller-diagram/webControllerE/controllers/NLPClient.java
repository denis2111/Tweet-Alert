/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EObject;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NLP Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.NLPClient#getTweet <em>Tweet</em>}</li>
 *   <li>{@link webControllerE.controllers.NLPClient#getResponsebuilder <em>Responsebuilder</em>}</li>
 * </ul>
 *
 * @see webControllerE.controllers.controllersPackage#getNLPClient()
 * @model
 * @generated
 */
public interface NLPClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Tweet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweet</em>' reference.
	 * @see #setTweet(Tweet)
	 * @see webControllerE.controllers.controllersPackage#getNLPClient_Tweet()
	 * @model required="true"
	 * @generated
	 */
	Tweet getTweet();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.NLPClient#getTweet <em>Tweet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tweet</em>' reference.
	 * @see #getTweet()
	 * @generated
	 */
	void setTweet(Tweet value);

	/**
	 * Returns the value of the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsebuilder</em>' reference.
	 * @see #setResponsebuilder(ResponseBuilder)
	 * @see webControllerE.controllers.controllersPackage#getNLPClient_Responsebuilder()
	 * @model
	 * @generated
	 */
	ResponseBuilder getResponsebuilder();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.NLPClient#getResponsebuilder <em>Responsebuilder</em>}' reference.
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

} // NLPClient
