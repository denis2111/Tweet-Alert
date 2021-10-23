/**
 */
package analytics.dtos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.dtos.TweetDto#getFeedbackDto <em>Feedback Dto</em>}</li>
 *   <li>{@link analytics.dtos.TweetDto#getText <em>Text</em>}</li>
 *   <li>{@link analytics.dtos.TweetDto#getUID <em>UID</em>}</li>
 *   <li>{@link analytics.dtos.TweetDto#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link analytics.dtos.TweetDto#getCompressedImage <em>Compressed Image</em>}</li>
 * </ul>
 *
 * @see analytics.dtos.dtosPackage#getTweetDto()
 * @model
 * @generated
 */
public interface TweetDto extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedback Dto</b></em>' containment reference list.
	 * The list contents are of type {@link analytics.dtos.FeedbackDto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Dto</em>' containment reference list.
	 * @see analytics.dtos.dtosPackage#getTweetDto_FeedbackDto()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackDto> getFeedbackDto();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see analytics.dtos.dtosPackage#getTweetDto_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link analytics.dtos.TweetDto#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see analytics.dtos.dtosPackage#getTweetDto_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link analytics.dtos.TweetDto#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

	/**
	 * Returns the value of the '<em><b>Verdict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verdict</em>' containment reference.
	 * @see #setVerdict(Verdict)
	 * @see analytics.dtos.dtosPackage#getTweetDto_Verdict()
	 * @model containment="true"
	 * @generated
	 */
	Verdict getVerdict();

	/**
	 * Sets the value of the '{@link analytics.dtos.TweetDto#getVerdict <em>Verdict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' containment reference.
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(Verdict value);

	/**
	 * Returns the value of the '<em><b>Compressed Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressed Image</em>' attribute.
	 * @see #setCompressedImage(byte)
	 * @see analytics.dtos.dtosPackage#getTweetDto_CompressedImage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 * @generated
	 */
	byte getCompressedImage();

	/**
	 * Sets the value of the '{@link analytics.dtos.TweetDto#getCompressedImage <em>Compressed Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed Image</em>' attribute.
	 * @see #getCompressedImage()
	 * @generated
	 */
	void setCompressedImage(byte value);

} // TweetDto
