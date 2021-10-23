/**
 */
package analytics.services;

import analytics.dtos.TweetDto;

import analytics.models.Feedback;

import analytics.repositories.FeedbackRepository;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.services.FeedbackService#getFeedbackrepository <em>Feedbackrepository</em>}</li>
 *   <li>{@link analytics.services.FeedbackService#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see analytics.services.servicesPackage#getFeedbackService()
 * @model
 * @generated
 */
public interface FeedbackService extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedbackrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbackrepository</em>' containment reference.
	 * @see #setFeedbackrepository(FeedbackRepository)
	 * @see analytics.services.servicesPackage#getFeedbackService_Feedbackrepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeedbackRepository getFeedbackrepository();

	/**
	 * Sets the value of the '{@link analytics.services.FeedbackService#getFeedbackrepository <em>Feedbackrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedbackrepository</em>' containment reference.
	 * @see #getFeedbackrepository()
	 * @generated
	 */
	void setFeedbackrepository(FeedbackRepository value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference.
	 * @see #setFeedback(Feedback)
	 * @see analytics.services.servicesPackage#getFeedbackService_Feedback()
	 * @model
	 * @generated
	 */
	Feedback getFeedback();

	/**
	 * Sets the value of the '{@link analytics.services.FeedbackService#getFeedback <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(Feedback value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EOperation storeFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getFeedback(TweetDto tweet);

} // FeedbackService
