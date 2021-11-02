/**
 */
package service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweets Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The service which has the business logic of Tweets
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link service.TweetsService#getTweetsrepository <em>Tweetsrepository</em>}</li>
 *   <li>{@link service.TweetsService#getFilteringservice <em>Filteringservice</em>}</li>
 * </ul>
 *
 * @see service.ServicePackage#getTweetsService()
 * @model
 * @generated
 */
public interface TweetsService extends EObject {
	/**
	 * Returns the value of the '<em><b>Tweetsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweetsrepository</em>' containment reference.
	 * @see #setTweetsrepository(TweetsRepository)
	 * @see service.ServicePackage#getTweetsService_Tweetsrepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TweetsRepository getTweetsrepository();

	/**
	 * Sets the value of the '{@link service.TweetsService#getTweetsrepository <em>Tweetsrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tweetsrepository</em>' containment reference.
	 * @see #getTweetsrepository()
	 * @generated
	 */
	void setTweetsrepository(TweetsRepository value);

	/**
	 * Returns the value of the '<em><b>Filteringservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filteringservice</em>' reference.
	 * @see #setFilteringservice(FilteringService)
	 * @see service.ServicePackage#getTweetsService_Filteringservice()
	 * @model required="true"
	 * @generated
	 */
	FilteringService getFilteringservice();

	/**
	 * Sets the value of the '{@link service.TweetsService#getFilteringservice <em>Filteringservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filteringservice</em>' reference.
	 * @see #getFilteringservice()
	 * @generated
	 */
	void setFilteringservice(FilteringService value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object extractTweetById(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> extractAllTweets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateTweetById(int id, EObject tweet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> extractTweetsByLocation(String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> extractTweetsByLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> extractTweetsByPopilarity(int minFeedbackEntries);

} // TweetsService
