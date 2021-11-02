/**
 */
package controller;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controller.TweetIterator#getTweetcollection <em>Tweetcollection</em>}</li>
 *   <li>{@link controller.TweetIterator#getIndex <em>Index</em>}</li>
 *   <li>{@link controller.TweetIterator#isReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @see controller.ControllerPackage#getTweetIterator()
 * @model
 * @generated
 */
public interface TweetIterator extends EObject {
	/**
	 * Returns the value of the '<em><b>Tweetcollection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweetcollection</em>' containment reference.
	 * @see #setTweetcollection(TweetCollection)
	 * @see controller.ControllerPackage#getTweetIterator_Tweetcollection()
	 * @model containment="true"
	 * @generated
	 */
	TweetCollection getTweetcollection();

	/**
	 * Sets the value of the '{@link controller.TweetIterator#getTweetcollection <em>Tweetcollection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tweetcollection</em>' containment reference.
	 * @see #getTweetcollection()
	 * @generated
	 */
	void setTweetcollection(TweetCollection value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see controller.ControllerPackage#getTweetIterator_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link controller.TweetIterator#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(boolean)
	 * @see controller.ControllerPackage#getTweetIterator_Reverse()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReverse();

	/**
	 * Sets the value of the '{@link controller.TweetIterator#isReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #isReverse()
	 * @generated
	 */
	void setReverse(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Optional<Tweet> next(Tweet current);

} // TweetIterator
