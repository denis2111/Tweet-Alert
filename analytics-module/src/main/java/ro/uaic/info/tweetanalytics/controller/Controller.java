/**
 */
package controller;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controller.Controller#isName <em>Name</em>}</li>
 * </ul>
 *
 * @see controller.ControllerPackage#getController()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Controller extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(boolean)
	 * @see controller.ControllerPackage#getController_Name()
	 * @model
	 * @generated
	 */
	boolean isName();

	/**
	 * Sets the value of the '{@link controller.Controller#isName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isName()
	 * @generated
	 */
	void setName(boolean value);
} // Controller
