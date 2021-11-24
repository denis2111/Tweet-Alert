/**
 */
package analytics.exceptions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see analytics.exceptions.exceptionsFactory
 * @model kind="package"
 * @generated
 */
public interface exceptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exceptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "exceptions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	exceptionsPackage eINSTANCE = analytics.exceptions.impl.exceptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.exceptions.impl.ControllerAdviceImpl <em>Controller Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.exceptions.impl.ControllerAdviceImpl
	 * @see analytics.exceptions.impl.exceptionsPackageImpl#getControllerAdvice()
	 * @generated
	 */
	int CONTROLLER_ADVICE = 0;

	/**
	 * The feature id for the '<em><b>Not Found Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Bad Request Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Internal Error Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION = 2;

	/**
	 * The number of structural features of the '<em>Controller Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Handle Not Found Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE___HANDLE_NOT_FOUND_EXCEPTION__NOTFOUNDEXCEPTION = 0;

	/**
	 * The number of operations of the '<em>Controller Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_ADVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link analytics.exceptions.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.exceptions.impl.ExceptionImpl
	 * @see analytics.exceptions.impl.exceptionsPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 2;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.exceptions.impl.NotFoundExceptionImpl <em>Not Found Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.exceptions.impl.NotFoundExceptionImpl
	 * @see analytics.exceptions.impl.exceptionsPackageImpl#getNotFoundException()
	 * @generated
	 */
	int NOT_FOUND_EXCEPTION = 1;

	/**
	 * The number of structural features of the '<em>Not Found Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Found Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analytics.exceptions.impl.BadRequestExceptionImpl <em>Bad Request Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.exceptions.impl.BadRequestExceptionImpl
	 * @see analytics.exceptions.impl.exceptionsPackageImpl#getBadRequestException()
	 * @generated
	 */
	int BAD_REQUEST_EXCEPTION = 3;

	/**
	 * The number of structural features of the '<em>Bad Request Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bad Request Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analytics.exceptions.impl.InternalErrorExceptionImpl <em>Internal Error Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.exceptions.impl.InternalErrorExceptionImpl
	 * @see analytics.exceptions.impl.exceptionsPackageImpl#getInternalErrorException()
	 * @generated
	 */
	int INTERNAL_ERROR_EXCEPTION = 4;

	/**
	 * The number of structural features of the '<em>Internal Error Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Error Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link analytics.exceptions.ControllerAdvice <em>Controller Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Advice</em>'.
	 * @see analytics.exceptions.ControllerAdvice
	 * @generated
	 */
	EClass getControllerAdvice();

	/**
	 * Returns the meta object for the reference '{@link analytics.exceptions.ControllerAdvice#getNotFoundException <em>Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not Found Exception</em>'.
	 * @see analytics.exceptions.ControllerAdvice#getNotFoundException()
	 * @see #getControllerAdvice()
	 * @generated
	 */
	EReference getControllerAdvice_NotFoundException();

	/**
	 * Returns the meta object for the reference '{@link analytics.exceptions.ControllerAdvice#getBadRequestException <em>Bad Request Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bad Request Exception</em>'.
	 * @see analytics.exceptions.ControllerAdvice#getBadRequestException()
	 * @see #getControllerAdvice()
	 * @generated
	 */
	EReference getControllerAdvice_BadRequestException();

	/**
	 * Returns the meta object for the reference '{@link analytics.exceptions.ControllerAdvice#getInternalErrorException <em>Internal Error Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Error Exception</em>'.
	 * @see analytics.exceptions.ControllerAdvice#getInternalErrorException()
	 * @see #getControllerAdvice()
	 * @generated
	 */
	EReference getControllerAdvice_InternalErrorException();

	/**
	 * Returns the meta object for the '{@link analytics.exceptions.ControllerAdvice#handleNotFoundException(analytics.exceptions.NotFoundException) <em>Handle Not Found Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Not Found Exception</em>' operation.
	 * @see analytics.exceptions.ControllerAdvice#handleNotFoundException(analytics.exceptions.NotFoundException)
	 * @generated
	 */
	EOperation getControllerAdvice__HandleNotFoundException__NotFoundException();

	/**
	 * Returns the meta object for class '{@link analytics.exceptions.NotFoundException <em>Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Found Exception</em>'.
	 * @see analytics.exceptions.NotFoundException
	 * @generated
	 */
	EClass getNotFoundException();

	/**
	 * Returns the meta object for class '{@link analytics.exceptions.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see analytics.exceptions.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link analytics.exceptions.BadRequestException <em>Bad Request Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bad Request Exception</em>'.
	 * @see analytics.exceptions.BadRequestException
	 * @generated
	 */
	EClass getBadRequestException();

	/**
	 * Returns the meta object for class '{@link analytics.exceptions.InternalErrorException <em>Internal Error Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Error Exception</em>'.
	 * @see analytics.exceptions.InternalErrorException
	 * @generated
	 */
	EClass getInternalErrorException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	exceptionsFactory getexceptionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link analytics.exceptions.impl.ControllerAdviceImpl <em>Controller Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.exceptions.impl.ControllerAdviceImpl
		 * @see analytics.exceptions.impl.exceptionsPackageImpl#getControllerAdvice()
		 * @generated
		 */
		EClass CONTROLLER_ADVICE = eINSTANCE.getControllerAdvice();

		/**
		 * The meta object literal for the '<em><b>Not Found Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION = eINSTANCE.getControllerAdvice_NotFoundException();

		/**
		 * The meta object literal for the '<em><b>Bad Request Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION = eINSTANCE.getControllerAdvice_BadRequestException();

		/**
		 * The meta object literal for the '<em><b>Internal Error Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION = eINSTANCE.getControllerAdvice_InternalErrorException();

		/**
		 * The meta object literal for the '<em><b>Handle Not Found Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_ADVICE___HANDLE_NOT_FOUND_EXCEPTION__NOTFOUNDEXCEPTION = eINSTANCE
				.getControllerAdvice__HandleNotFoundException__NotFoundException();

		/**
		 * The meta object literal for the '{@link analytics.exceptions.impl.NotFoundExceptionImpl <em>Not Found Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.exceptions.impl.NotFoundExceptionImpl
		 * @see analytics.exceptions.impl.exceptionsPackageImpl#getNotFoundException()
		 * @generated
		 */
		EClass NOT_FOUND_EXCEPTION = eINSTANCE.getNotFoundException();

		/**
		 * The meta object literal for the '{@link analytics.exceptions.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.exceptions.impl.ExceptionImpl
		 * @see analytics.exceptions.impl.exceptionsPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link analytics.exceptions.impl.BadRequestExceptionImpl <em>Bad Request Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.exceptions.impl.BadRequestExceptionImpl
		 * @see analytics.exceptions.impl.exceptionsPackageImpl#getBadRequestException()
		 * @generated
		 */
		EClass BAD_REQUEST_EXCEPTION = eINSTANCE.getBadRequestException();

		/**
		 * The meta object literal for the '{@link analytics.exceptions.impl.InternalErrorExceptionImpl <em>Internal Error Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.exceptions.impl.InternalErrorExceptionImpl
		 * @see analytics.exceptions.impl.exceptionsPackageImpl#getInternalErrorException()
		 * @generated
		 */
		EClass INTERNAL_ERROR_EXCEPTION = eINSTANCE.getInternalErrorException();

	}

} //exceptionsPackage
