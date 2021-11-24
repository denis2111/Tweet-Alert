/**
 */
package analytics.exceptions.impl;

import analytics.exceptions.BadRequestException;
import analytics.exceptions.ControllerAdvice;
import analytics.exceptions.InternalErrorException;
import analytics.exceptions.NotFoundException;
import analytics.exceptions.exceptionsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.exceptions.impl.ControllerAdviceImpl#getNotFoundException <em>Not Found Exception</em>}</li>
 *   <li>{@link analytics.exceptions.impl.ControllerAdviceImpl#getBadRequestException <em>Bad Request Exception</em>}</li>
 *   <li>{@link analytics.exceptions.impl.ControllerAdviceImpl#getInternalErrorException <em>Internal Error Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerAdviceImpl extends MinimalEObjectImpl.Container implements ControllerAdvice {
	/**
	 * The cached value of the '{@link #getNotFoundException() <em>Not Found Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFoundException()
	 * @generated
	 * @ordered
	 */
	protected NotFoundException notFoundException;

	/**
	 * The cached value of the '{@link #getBadRequestException() <em>Bad Request Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadRequestException()
	 * @generated
	 * @ordered
	 */
	protected BadRequestException badRequestException;

	/**
	 * The cached value of the '{@link #getInternalErrorException() <em>Internal Error Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalErrorException()
	 * @generated
	 * @ordered
	 */
	protected InternalErrorException internalErrorException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerAdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exceptionsPackage.Literals.CONTROLLER_ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotFoundException getNotFoundException() {
		if (notFoundException != null && notFoundException.eIsProxy()) {
			InternalEObject oldNotFoundException = (InternalEObject) notFoundException;
			notFoundException = (NotFoundException) eResolveProxy(oldNotFoundException);
			if (notFoundException != oldNotFoundException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION, oldNotFoundException,
							notFoundException));
			}
		}
		return notFoundException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotFoundException basicGetNotFoundException() {
		return notFoundException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotFoundException(NotFoundException newNotFoundException) {
		NotFoundException oldNotFoundException = notFoundException;
		notFoundException = newNotFoundException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION, oldNotFoundException, notFoundException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadRequestException getBadRequestException() {
		if (badRequestException != null && badRequestException.eIsProxy()) {
			InternalEObject oldBadRequestException = (InternalEObject) badRequestException;
			badRequestException = (BadRequestException) eResolveProxy(oldBadRequestException);
			if (badRequestException != oldBadRequestException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION, oldBadRequestException,
							badRequestException));
			}
		}
		return badRequestException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadRequestException basicGetBadRequestException() {
		return badRequestException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadRequestException(BadRequestException newBadRequestException) {
		BadRequestException oldBadRequestException = badRequestException;
		badRequestException = newBadRequestException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION, oldBadRequestException,
					badRequestException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalErrorException getInternalErrorException() {
		if (internalErrorException != null && internalErrorException.eIsProxy()) {
			InternalEObject oldInternalErrorException = (InternalEObject) internalErrorException;
			internalErrorException = (InternalErrorException) eResolveProxy(oldInternalErrorException);
			if (internalErrorException != oldInternalErrorException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION, oldInternalErrorException,
							internalErrorException));
			}
		}
		return internalErrorException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalErrorException basicGetInternalErrorException() {
		return internalErrorException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalErrorException(InternalErrorException newInternalErrorException) {
		InternalErrorException oldInternalErrorException = internalErrorException;
		internalErrorException = newInternalErrorException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION, oldInternalErrorException,
					internalErrorException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String handleNotFoundException(NotFoundException notFoundException) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION:
			if (resolve)
				return getNotFoundException();
			return basicGetNotFoundException();
		case exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION:
			if (resolve)
				return getBadRequestException();
			return basicGetBadRequestException();
		case exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION:
			if (resolve)
				return getInternalErrorException();
			return basicGetInternalErrorException();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION:
			setNotFoundException((NotFoundException) newValue);
			return;
		case exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION:
			setBadRequestException((BadRequestException) newValue);
			return;
		case exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION:
			setInternalErrorException((InternalErrorException) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION:
			setNotFoundException((NotFoundException) null);
			return;
		case exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION:
			setBadRequestException((BadRequestException) null);
			return;
		case exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION:
			setInternalErrorException((InternalErrorException) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case exceptionsPackage.CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION:
			return notFoundException != null;
		case exceptionsPackage.CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION:
			return badRequestException != null;
		case exceptionsPackage.CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION:
			return internalErrorException != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case exceptionsPackage.CONTROLLER_ADVICE___HANDLE_NOT_FOUND_EXCEPTION__NOTFOUNDEXCEPTION:
			return handleNotFoundException((NotFoundException) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ControllerAdviceImpl
