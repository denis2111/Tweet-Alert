/**
 */
package analytics.exceptions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.exceptions.ControllerAdvice#getNotFoundException <em>Not Found Exception</em>}</li>
 *   <li>{@link analytics.exceptions.ControllerAdvice#getBadRequestException <em>Bad Request Exception</em>}</li>
 *   <li>{@link analytics.exceptions.ControllerAdvice#getInternalErrorException <em>Internal Error Exception</em>}</li>
 * </ul>
 *
 * @see analytics.exceptions.exceptionsPackage#getControllerAdvice()
 * @model
 * @generated
 */
public interface ControllerAdvice extends EObject {
	/**
	 * Returns the value of the '<em><b>Not Found Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Found Exception</em>' reference.
	 * @see #setNotFoundException(NotFoundException)
	 * @see analytics.exceptions.exceptionsPackage#getControllerAdvice_NotFoundException()
	 * @model
	 * @generated
	 */
	NotFoundException getNotFoundException();

	/**
	 * Sets the value of the '{@link analytics.exceptions.ControllerAdvice#getNotFoundException <em>Not Found Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Found Exception</em>' reference.
	 * @see #getNotFoundException()
	 * @generated
	 */
	void setNotFoundException(NotFoundException value);

	/**
	 * Returns the value of the '<em><b>Bad Request Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Request Exception</em>' reference.
	 * @see #setBadRequestException(BadRequestException)
	 * @see analytics.exceptions.exceptionsPackage#getControllerAdvice_BadRequestException()
	 * @model
	 * @generated
	 */
	BadRequestException getBadRequestException();

	/**
	 * Sets the value of the '{@link analytics.exceptions.ControllerAdvice#getBadRequestException <em>Bad Request Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Request Exception</em>' reference.
	 * @see #getBadRequestException()
	 * @generated
	 */
	void setBadRequestException(BadRequestException value);

	/**
	 * Returns the value of the '<em><b>Internal Error Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Error Exception</em>' reference.
	 * @see #setInternalErrorException(InternalErrorException)
	 * @see analytics.exceptions.exceptionsPackage#getControllerAdvice_InternalErrorException()
	 * @model
	 * @generated
	 */
	InternalErrorException getInternalErrorException();

	/**
	 * Sets the value of the '{@link analytics.exceptions.ControllerAdvice#getInternalErrorException <em>Internal Error Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Error Exception</em>' reference.
	 * @see #getInternalErrorException()
	 * @generated
	 */
	void setInternalErrorException(InternalErrorException value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITY"
	 * @generated
	 */
	String handleNotFoundException(NotFoundException notFoundException);

} // ControllerAdvice
