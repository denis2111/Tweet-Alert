/**
 */
package analytics.dtos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.dtos.FeedbackDto#isThumbsUp <em>Thumbs Up</em>}</li>
 *   <li>{@link analytics.dtos.FeedbackDto#getTweetId <em>Tweet Id</em>}</li>
 * </ul>
 *
 * @see analytics.dtos.dtosPackage#getFeedbackDto()
 * @model
 * @generated
 */
public interface FeedbackDto extends EObject {
	/**
	 * Returns the value of the '<em><b>Thumbs Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbs Up</em>' attribute.
	 * @see #setThumbsUp(boolean)
	 * @see analytics.dtos.dtosPackage#getFeedbackDto_ThumbsUp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isThumbsUp();

	/**
	 * Sets the value of the '{@link analytics.dtos.FeedbackDto#isThumbsUp <em>Thumbs Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbs Up</em>' attribute.
	 * @see #isThumbsUp()
	 * @generated
	 */
	void setThumbsUp(boolean value);

	/**
	 * Returns the value of the '<em><b>Tweet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweet Id</em>' attribute.
	 * @see #setTweetId(String)
	 * @see analytics.dtos.dtosPackage#getFeedbackDto_TweetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getTweetId();

	/**
	 * Sets the value of the '{@link analytics.dtos.FeedbackDto#getTweetId <em>Tweet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tweet Id</em>' attribute.
	 * @see #getTweetId()
	 * @generated
	 */
	void setTweetId(String value);

} // FeedbackDto
