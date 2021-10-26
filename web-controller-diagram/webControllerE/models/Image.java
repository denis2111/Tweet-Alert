/**
 */
package webControllerE.models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.Image#getImage <em>Image</em>}</li>
 *   <li>{@link webControllerE.models.Image#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see webControllerE.models.modelsPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(Byte)
	 * @see webControllerE.models.modelsPackage#getImage_Image()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ByteObject"
	 * @generated
	 */
	Byte getImage();

	/**
	 * Sets the value of the '{@link webControllerE.models.Image#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Byte value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see webControllerE.models.modelsPackage#getImage_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link webControllerE.models.Image#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Image
