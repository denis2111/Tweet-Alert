/**
 */
package webControllerE.models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.ResponseBuilder#getLocation <em>Location</em>}</li>
 *   <li>{@link webControllerE.models.ResponseBuilder#getClassificationLabel <em>Classification Label</em>}</li>
 *   <li>{@link webControllerE.models.ResponseBuilder#getPrecision <em>Precision</em>}</li>
 *   <li>{@link webControllerE.models.ResponseBuilder#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see webControllerE.models.modelsPackage#getResponseBuilder()
 * @model
 * @generated
 */
public interface ResponseBuilder extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see webControllerE.models.modelsPackage#getResponseBuilder_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link webControllerE.models.ResponseBuilder#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Classification Label</b></em>' attribute.
	 * The default value is <code>"NO-DISASTER"</code>.
	 * The literals are from the enumeration {@link webControllerE.models.DisasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Label</em>' attribute.
	 * @see webControllerE.models.DisasterType
	 * @see #setClassificationLabel(DisasterType)
	 * @see webControllerE.models.modelsPackage#getResponseBuilder_ClassificationLabel()
	 * @model default="NO-DISASTER"
	 * @generated
	 */
	DisasterType getClassificationLabel();

	/**
	 * Sets the value of the '{@link webControllerE.models.ResponseBuilder#getClassificationLabel <em>Classification Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Label</em>' attribute.
	 * @see webControllerE.models.DisasterType
	 * @see #getClassificationLabel()
	 * @generated
	 */
	void setClassificationLabel(DisasterType value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(float)
	 * @see webControllerE.models.modelsPackage#getResponseBuilder_Precision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getPrecision();

	/**
	 * Sets the value of the '{@link webControllerE.models.ResponseBuilder#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(float value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Response)
	 * @see webControllerE.models.modelsPackage#getResponseBuilder_Response()
	 * @model
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link webControllerE.models.ResponseBuilder#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

} // ResponseBuilder
