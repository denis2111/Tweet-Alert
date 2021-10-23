/**
 */
package analytics.security.impl;

import analytics.security.JwtRequestFilter;
import analytics.security.JwtTokenUtil;
import analytics.security.JwtUserDetailsService;
import analytics.security.securityPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Request Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.impl.JwtRequestFilterImpl#getJwtuserdetailsservice <em>Jwtuserdetailsservice</em>}</li>
 *   <li>{@link analytics.security.impl.JwtRequestFilterImpl#getJwttokenutil <em>Jwttokenutil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtRequestFilterImpl extends MinimalEObjectImpl.Container implements JwtRequestFilter {
	/**
	 * The cached value of the '{@link #getJwtuserdetailsservice() <em>Jwtuserdetailsservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJwtuserdetailsservice()
	 * @generated
	 * @ordered
	 */
	protected JwtUserDetailsService jwtuserdetailsservice;

	/**
	 * The cached value of the '{@link #getJwttokenutil() <em>Jwttokenutil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJwttokenutil()
	 * @generated
	 * @ordered
	 */
	protected JwtTokenUtil jwttokenutil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtRequestFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return securityPackage.Literals.JWT_REQUEST_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtUserDetailsService getJwtuserdetailsservice() {
		if (jwtuserdetailsservice != null && jwtuserdetailsservice.eIsProxy()) {
			InternalEObject oldJwtuserdetailsservice = (InternalEObject) jwtuserdetailsservice;
			jwtuserdetailsservice = (JwtUserDetailsService) eResolveProxy(oldJwtuserdetailsservice);
			if (jwtuserdetailsservice != oldJwtuserdetailsservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE, oldJwtuserdetailsservice,
							jwtuserdetailsservice));
			}
		}
		return jwtuserdetailsservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtUserDetailsService basicGetJwtuserdetailsservice() {
		return jwtuserdetailsservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJwtuserdetailsservice(JwtUserDetailsService newJwtuserdetailsservice) {
		JwtUserDetailsService oldJwtuserdetailsservice = jwtuserdetailsservice;
		jwtuserdetailsservice = newJwtuserdetailsservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE, oldJwtuserdetailsservice,
					jwtuserdetailsservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtTokenUtil getJwttokenutil() {
		if (jwttokenutil != null && jwttokenutil.eIsProxy()) {
			InternalEObject oldJwttokenutil = (InternalEObject) jwttokenutil;
			jwttokenutil = (JwtTokenUtil) eResolveProxy(oldJwttokenutil);
			if (jwttokenutil != oldJwttokenutil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL, oldJwttokenutil, jwttokenutil));
			}
		}
		return jwttokenutil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtTokenUtil basicGetJwttokenutil() {
		return jwttokenutil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJwttokenutil(JwtTokenUtil newJwttokenutil) {
		JwtTokenUtil oldJwttokenutil = jwttokenutil;
		jwttokenutil = newJwttokenutil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL,
					oldJwttokenutil, jwttokenutil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doFilterInternal(Object request, Object response) {
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
		case securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE:
			if (resolve)
				return getJwtuserdetailsservice();
			return basicGetJwtuserdetailsservice();
		case securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL:
			if (resolve)
				return getJwttokenutil();
			return basicGetJwttokenutil();
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
		case securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE:
			setJwtuserdetailsservice((JwtUserDetailsService) newValue);
			return;
		case securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL:
			setJwttokenutil((JwtTokenUtil) newValue);
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
		case securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE:
			setJwtuserdetailsservice((JwtUserDetailsService) null);
			return;
		case securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL:
			setJwttokenutil((JwtTokenUtil) null);
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
		case securityPackage.JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE:
			return jwtuserdetailsservice != null;
		case securityPackage.JWT_REQUEST_FILTER__JWTTOKENUTIL:
			return jwttokenutil != null;
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
		case securityPackage.JWT_REQUEST_FILTER___DO_FILTER_INTERNAL__OBJECT_OBJECT:
			doFilterInternal(arguments.get(0), arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JwtRequestFilterImpl
