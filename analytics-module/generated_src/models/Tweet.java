/**
 */
package analytics.models;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.models.Tweet#getId <em>Id</em>}</li>
 *   <li>{@link analytics.models.Tweet#getText <em>Text</em>}</li>
 *   <li>{@link analytics.models.Tweet#getImage <em>Image</em>}</li>
 *   <li>{@link analytics.models.Tweet#getLocation <em>Location</em>}</li>
 *   <li>{@link analytics.models.Tweet#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see analytics.models.modelssPackage#getTweet()
 * @model
 * @generated
 */
public interface Tweet extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see analytics.models.modelssPackage#getTweet_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link analytics.models.Tweet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see analytics.models.modelssPackage#getTweet_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link analytics.models.Tweet#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link analytics.models.TweetImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see analytics.models.modelssPackage#getTweet_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<TweetImage> getImage();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(Object)
	 * @see analytics.models.modelssPackage#getTweet_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getLocation();

	/**
	 * Sets the value of the '{@link analytics.models.Tweet#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Object value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link analytics.models.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference list.
	 * @see analytics.models.modelssPackage#getTweet_Feedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getFeedback();

} // Tweet
