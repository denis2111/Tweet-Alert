/**
 */
package service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweets Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link service.TweetsController#getTweetsservice <em>Tweetsservice</em>}</li>
 * </ul>
 *
 * @see service.ServicePackage#getTweetsController()
 * @model
 * @generated
 */
public interface TweetsController extends EObject {
	/**
	 * Returns the value of the '<em><b>Tweetsservice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweetsservice</em>' containment reference.
	 * @see #setTweetsservice(TweetsService)
	 * @see service.ServicePackage#getTweetsController_Tweetsservice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TweetsService getTweetsservice();

	/**
	 * Sets the value of the '{@link service.TweetsController#getTweetsservice <em>Tweetsservice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tweetsservice</em>' containment reference.
	 * @see #getTweetsservice()
	 * @generated
	 */
	void setTweetsservice(TweetsService value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void storeTweet(EObject tweet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getTweetById(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getTweets();

} // TweetsController
