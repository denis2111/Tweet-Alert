/**
 */
package webControllerE.controllers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import webControllerE.models.Image;
import webControllerE.models.Response;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytics Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.AnalyticsClient#getCheckexistanceresponse <em>Checkexistanceresponse</em>}</li>
 * </ul>
 *
 * @see webControllerE.controllers.controllersPackage#getAnalyticsClient()
 * @model
 * @generated
 */
public interface AnalyticsClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Checkexistanceresponse</b></em>' containment reference list.
	 * The list contents are of type {@link webControllerE.controllers.CheckExistanceResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkexistanceresponse</em>' containment reference list.
	 * @see webControllerE.controllers.controllersPackage#getAnalyticsClient_Checkexistanceresponse()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckExistanceResponse> getCheckexistanceresponse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CheckExistanceResponse checkImageExistance(Image image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	CheckExistanceResponse checkTextExistance(String image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void persisImage(Image image, Response response);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model textDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void persisText(String text, Response response);

} // AnalyticsClient
