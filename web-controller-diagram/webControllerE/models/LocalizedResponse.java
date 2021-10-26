/**
 */
package webControllerE.models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localized Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.LocalizedResponse#getLocation <em>Location</em>}</li>
 *   <li>{@link webControllerE.models.LocalizedResponse#getClassificationresponse <em>Classificationresponse</em>}</li>
 * </ul>
 *
 * @see webControllerE.models.modelsPackage#getLocalizedResponse()
 * @model
 * @generated
 */
public interface LocalizedResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see webControllerE.models.modelsPackage#getLocalizedResponse_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link webControllerE.models.LocalizedResponse#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Classificationresponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classificationresponse</em>' containment reference.
	 * @see #setClassificationresponse(ClassificationResponse)
	 * @see webControllerE.models.modelsPackage#getLocalizedResponse_Classificationresponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassificationResponse getClassificationresponse();

	/**
	 * Sets the value of the '{@link webControllerE.models.LocalizedResponse#getClassificationresponse <em>Classificationresponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classificationresponse</em>' containment reference.
	 * @see #getClassificationresponse()
	 * @generated
	 */
	void setClassificationresponse(ClassificationResponse value);

} // LocalizedResponse
