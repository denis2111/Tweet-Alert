/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Existance Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.CheckExistanceResponse#isExists <em>Exists</em>}</li>
 *   <li>{@link webControllerE.controllers.CheckExistanceResponse#getClassificationResponse <em>Classification Response</em>}</li>
 * </ul>
 *
 * @see webControllerE.controllers.controllersPackage#getCheckExistanceResponse()
 * @model
 * @generated
 */
public interface CheckExistanceResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(boolean)
	 * @see webControllerE.controllers.controllersPackage#getCheckExistanceResponse_Exists()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isExists();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.CheckExistanceResponse#isExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #isExists()
	 * @generated
	 */
	void setExists(boolean value);

	/**
	 * Returns the value of the '<em><b>Classification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Response</em>' attribute.
	 * @see #setClassificationResponse(Object)
	 * @see webControllerE.controllers.controllersPackage#getCheckExistanceResponse_ClassificationResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getClassificationResponse();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.CheckExistanceResponse#getClassificationResponse <em>Classification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Response</em>' attribute.
	 * @see #getClassificationResponse()
	 * @generated
	 */
	void setClassificationResponse(Object value);

} // CheckExistanceResponse
