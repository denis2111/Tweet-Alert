/**
 */
package controller;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controller.TweetCollection#getTweet <em>Tweet</em>}</li>
 * </ul>
 *
 * @see controller.ControllerPackage#getTweetCollection()
 * @model
 * @generated
 */
public interface TweetCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Tweet</b></em>' containment reference list.
	 * The list contents are of type {@link controller.Tweet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweet</em>' containment reference list.
	 * @see controller.ControllerPackage#getTweetCollection_Tweet()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tweet> getTweet();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTweet(Tweet tweet);

} // TweetCollection
