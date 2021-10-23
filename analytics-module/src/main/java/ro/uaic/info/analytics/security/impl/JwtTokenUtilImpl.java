/**
 */
package analytics.security.impl;

import analytics.security.JwtTokenUtil;
import analytics.security.securityPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Token Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.impl.JwtTokenUtilImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link analytics.security.impl.JwtTokenUtilImpl#getJWT_TOKEN_VALIDITY <em>JWT TOKEN VALIDITY</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtTokenUtilImpl extends MinimalEObjectImpl.Container implements JwtTokenUtil {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_VERSION_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected String serialVersionUID = SERIAL_VERSION_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJWT_TOKEN_VALIDITY() <em>JWT TOKEN VALIDITY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJWT_TOKEN_VALIDITY()
	 * @generated
	 * @ordered
	 */
	protected static final long JWT_TOKEN_VALIDITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getJWT_TOKEN_VALIDITY() <em>JWT TOKEN VALIDITY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJWT_TOKEN_VALIDITY()
	 * @generated
	 * @ordered
	 */
	protected long jwT_TOKEN_VALIDITY = JWT_TOKEN_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtTokenUtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return securityPackage.Literals.JWT_TOKEN_UTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialVersionUID(String newSerialVersionUID) {
		String oldSerialVersionUID = serialVersionUID;
		serialVersionUID = newSerialVersionUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, securityPackage.JWT_TOKEN_UTIL__SERIAL_VERSION_UID,
					oldSerialVersionUID, serialVersionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJWT_TOKEN_VALIDITY() {
		return jwT_TOKEN_VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJWT_TOKEN_VALIDITY(long newJWT_TOKEN_VALIDITY) {
		long oldJWT_TOKEN_VALIDITY = jwT_TOKEN_VALIDITY;
		jwT_TOKEN_VALIDITY = newJWT_TOKEN_VALIDITY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, securityPackage.JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY,
					oldJWT_TOKEN_VALIDITY, jwT_TOKEN_VALIDITY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getUsernameFromToken(String token) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getExpirationDateFromToken(String token) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isTokenExpired(String token) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String generateToken() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validateToken(String token) {
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
		case securityPackage.JWT_TOKEN_UTIL__SERIAL_VERSION_UID:
			return getSerialVersionUID();
		case securityPackage.JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY:
			return getJWT_TOKEN_VALIDITY();
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
		case securityPackage.JWT_TOKEN_UTIL__SERIAL_VERSION_UID:
			setSerialVersionUID((String) newValue);
			return;
		case securityPackage.JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY:
			setJWT_TOKEN_VALIDITY((Long) newValue);
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
		case securityPackage.JWT_TOKEN_UTIL__SERIAL_VERSION_UID:
			setSerialVersionUID(SERIAL_VERSION_UID_EDEFAULT);
			return;
		case securityPackage.JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY:
			setJWT_TOKEN_VALIDITY(JWT_TOKEN_VALIDITY_EDEFAULT);
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
		case securityPackage.JWT_TOKEN_UTIL__SERIAL_VERSION_UID:
			return SERIAL_VERSION_UID_EDEFAULT == null ? serialVersionUID != null
					: !SERIAL_VERSION_UID_EDEFAULT.equals(serialVersionUID);
		case securityPackage.JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY:
			return jwT_TOKEN_VALIDITY != JWT_TOKEN_VALIDITY_EDEFAULT;
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
		case securityPackage.JWT_TOKEN_UTIL___GET_USERNAME_FROM_TOKEN__STRING:
			getUsernameFromToken((String) arguments.get(0));
			return null;
		case securityPackage.JWT_TOKEN_UTIL___GET_EXPIRATION_DATE_FROM_TOKEN__STRING:
			getExpirationDateFromToken((String) arguments.get(0));
			return null;
		case securityPackage.JWT_TOKEN_UTIL___IS_TOKEN_EXPIRED__STRING:
			isTokenExpired((String) arguments.get(0));
			return null;
		case securityPackage.JWT_TOKEN_UTIL___GENERATE_TOKEN:
			return generateToken();
		case securityPackage.JWT_TOKEN_UTIL___VALIDATE_TOKEN__STRING:
			validateToken((String) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serialVersionUID: ");
		result.append(serialVersionUID);
		result.append(", JWT_TOKEN_VALIDITY: ");
		result.append(jwT_TOKEN_VALIDITY);
		result.append(')');
		return result.toString();
	}

} //JwtTokenUtilImpl
