/**
 */
package analytics.models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.models.TweetImage#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see analytics.models.modelssPackage#getTweetImage()
 * @model
 * @generated
 */
public interface TweetImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(Byte)
	 * @see analytics.models.modelssPackage#getTweetImage_Image()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ByteObject"
	 * @generated
	 */
	Byte getImage();

	/**
	 * Sets the value of the '{@link analytics.models.TweetImage#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Byte value);

} // TweetImage
