/**
 */
package analytics.exceptions.impl;

import analytics.exceptions.BadRequestException;
import analytics.exceptions.ControllerAdvice;
import analytics.exceptions.InternalErrorException;
import analytics.exceptions.NotFoundException;
import analytics.exceptions.exceptionsFactory;
import analytics.exceptions.exceptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class exceptionsFactoryImpl extends EFactoryImpl implements exceptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static exceptionsFactory init() {
		try {
			exceptionsFactory theexceptionsFactory = (exceptionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(exceptionsPackage.eNS_URI);
			if (theexceptionsFactory != null) {
				return theexceptionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new exceptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case exceptionsPackage.CONTROLLER_ADVICE:
			return createControllerAdvice();
		case exceptionsPackage.NOT_FOUND_EXCEPTION:
			return createNotFoundException();
		case exceptionsPackage.EXCEPTION:
			return createException();
		case exceptionsPackage.BAD_REQUEST_EXCEPTION:
			return createBadRequestException();
		case exceptionsPackage.INTERNAL_ERROR_EXCEPTION:
			return createInternalErrorException();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerAdvice createControllerAdvice() {
		ControllerAdviceImpl controllerAdvice = new ControllerAdviceImpl();
		return controllerAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotFoundException createNotFoundException() {
		NotFoundExceptionImpl notFoundException = new NotFoundExceptionImpl();
		return notFoundException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public analytics.exceptions.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadRequestException createBadRequestException() {
		BadRequestExceptionImpl badRequestException = new BadRequestExceptionImpl();
		return badRequestException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalErrorException createInternalErrorException() {
		InternalErrorExceptionImpl internalErrorException = new InternalErrorExceptionImpl();
		return internalErrorException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionsPackage getexceptionsPackage() {
		return (exceptionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static exceptionsPackage getPackage() {
		return exceptionsPackage.eINSTANCE;
	}

} //exceptionsFactoryImpl
