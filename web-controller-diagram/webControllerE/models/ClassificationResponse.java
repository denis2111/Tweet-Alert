/**
 */
package webControllerE.models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.ClassificationResponse#getClassificationLabel <em>Classification Label</em>}</li>
 *   <li>{@link webControllerE.models.ClassificationResponse#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see webControllerE.models.modelsPackage#getClassificationResponse()
 * @model
 * @generated
 */
public interface ClassificationResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification Label</b></em>' attribute.
	 * The default value is <code>"NO-DISASTER"</code>.
	 * The literals are from the enumeration {@link webControllerE.models.DisasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Label</em>' attribute.
	 * @see webControllerE.models.DisasterType
	 * @see #setClassificationLabel(DisasterType)
	 * @see webControllerE.models.modelsPackage#getClassificationResponse_ClassificationLabel()
	 * @model default="NO-DISASTER"
	 * @generated
	 */
	DisasterType getClassificationLabel();

	/**
	 * Sets the value of the '{@link webControllerE.models.ClassificationResponse#getClassificationLabel <em>Classification Label</em>}' attribute.
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
	 * @see webControllerE.models.modelsPackage#getClassificationResponse_Precision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getPrecision();

	/**
	 * Sets the value of the '{@link webControllerE.models.ClassificationResponse#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(float value);

} // ClassificationResponse
