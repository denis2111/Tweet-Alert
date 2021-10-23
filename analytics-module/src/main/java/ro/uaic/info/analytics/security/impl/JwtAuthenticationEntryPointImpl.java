/**
 */
package analytics.security.impl;

import analytics.security.JwtAuthenticationEntryPoint;
import analytics.security.securityPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Authentication Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.impl.JwtAuthenticationEntryPointImpl#getSerialVersionUId <em>Serial Version UId</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtAuthenticationEntryPointImpl extends MinimalEObjectImpl.Container
		implements JwtAuthenticationEntryPoint {
	/**
	 * The default value of the '{@link #getSerialVersionUId() <em>Serial Version UId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUId()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSerialVersionUId() <em>Serial Version UId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUId()
	 * @generated
	 * @ordered
	 */
	protected long serialVersionUId = SERIAL_VERSION_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtAuthenticationEntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return securityPackage.Literals.JWT_AUTHENTICATION_ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSerialVersionUId() {
		return serialVersionUId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialVersionUId(long newSerialVersionUId) {
		long oldSerialVersionUId = serialVersionUId;
		serialVersionUId = newSerialVersionUId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					securityPackage.JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID, oldSerialVersionUId,
					serialVersionUId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void commence(Object request, Object response, analytics.exceptions.Exception authenticationException) {
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
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID:
			return getSerialVersionUId();
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
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID:
			setSerialVersionUId((Long) newValue);
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
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID:
			setSerialVersionUId(SERIAL_VERSION_UID_EDEFAULT);
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
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID:
			return serialVersionUId != SERIAL_VERSION_UID_EDEFAULT;
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
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT___COMMENCE__OBJECT_OBJECT_EXCEPTION:
			commence(arguments.get(0), arguments.get(1), (analytics.exceptions.Exception) arguments.get(2));
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
		result.append(" (serialVersionUId: ");
		result.append(serialVersionUId);
		result.append(')');
		return result.toString();
	}

} //JwtAuthenticationEntryPointImpl
