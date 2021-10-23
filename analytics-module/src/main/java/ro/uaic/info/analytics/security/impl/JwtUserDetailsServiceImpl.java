/**
 */
package analytics.security.impl;

import analytics.security.JwtUserDetailsService;
import analytics.security.securityPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt User Details Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.impl.JwtUserDetailsServiceImpl#getUsersservice <em>Usersservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtUserDetailsServiceImpl extends MinimalEObjectImpl.Container implements JwtUserDetailsService {
	/**
	 * The cached value of the '{@link #getUsersservice() <em>Usersservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsersservice()
	 * @generated
	 * @ordered
	 */
	protected Object usersservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtUserDetailsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return securityPackage.Literals.JWT_USER_DETAILS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUsersservice() {
		if (usersservice != null && ((EObject) usersservice).eIsProxy()) {
			InternalEObject oldUsersservice = (InternalEObject) usersservice;
			usersservice = (Object) eResolveProxy(oldUsersservice);
			if (usersservice != oldUsersservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE, oldUsersservice, usersservice));
			}
		}
		return usersservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetUsersservice() {
		return usersservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsersservice(Object newUsersservice) {
		Object oldUsersservice = usersservice;
		usersservice = newUsersservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE, oldUsersservice, usersservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object loadUserByUsername() {
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
		case securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE:
			if (resolve)
				return getUsersservice();
			return basicGetUsersservice();
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
		case securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE:
			setUsersservice((Object) newValue);
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
		case securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE:
			setUsersservice((Object) null);
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
		case securityPackage.JWT_USER_DETAILS_SERVICE__USERSSERVICE:
			return usersservice != null;
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
		case securityPackage.JWT_USER_DETAILS_SERVICE___LOAD_USER_BY_USERNAME:
			return loadUserByUsername();
		}
		return super.eInvoke(operationID, arguments);
	}

} //JwtUserDetailsServiceImpl
