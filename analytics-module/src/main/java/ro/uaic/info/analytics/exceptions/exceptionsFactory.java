/**
 */
package analytics.exceptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analytics.exceptions.exceptionsPackage
 * @generated
 */
public interface exceptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	exceptionsFactory eINSTANCE = analytics.exceptions.impl.exceptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Controller Advice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Advice</em>'.
	 * @generated
	 */
	ControllerAdvice createControllerAdvice();

	/**
	 * Returns a new object of class '<em>Not Found Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Found Exception</em>'.
	 * @generated
	 */
	NotFoundException createNotFoundException();

	/**
	 * Returns a new object of class '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception</em>'.
	 * @generated
	 */
	Exception createException();

	/**
	 * Returns a new object of class '<em>Bad Request Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bad Request Exception</em>'.
	 * @generated
	 */
	BadRequestException createBadRequestException();

	/**
	 * Returns a new object of class '<em>Internal Error Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Error Exception</em>'.
	 * @generated
	 */
	InternalErrorException createInternalErrorException();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	exceptionsPackage getexceptionsPackage();

} //exceptionsFactory
