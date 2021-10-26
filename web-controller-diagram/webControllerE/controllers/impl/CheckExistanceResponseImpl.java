/**
 */
package webControllerE.controllers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.controllers.CheckExistanceResponse;
import webControllerE.controllers.controllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Existance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.impl.CheckExistanceResponseImpl#isExists <em>Exists</em>}</li>
 *   <li>{@link webControllerE.controllers.impl.CheckExistanceResponseImpl#getClassificationResponse <em>Classification Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckExistanceResponseImpl extends MinimalEObjectImpl.Container implements CheckExistanceResponse {
	/**
	 * The default value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXISTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected boolean exists = EXISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationResponse() <em>Classification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLASSIFICATION_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationResponse() <em>Classification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationResponse()
	 * @generated
	 * @ordered
	 */
	protected Object classificationResponse = CLASSIFICATION_RESPONSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckExistanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return controllersPackage.Literals.CHECK_EXISTANCE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExists() {
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExists(boolean newExists) {
		boolean oldExists = exists;
		exists = newExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.CHECK_EXISTANCE_RESPONSE__EXISTS,
					oldExists, exists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClassificationResponse() {
		return classificationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationResponse(Object newClassificationResponse) {
		Object oldClassificationResponse = classificationResponse;
		classificationResponse = newClassificationResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					controllersPackage.CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE, oldClassificationResponse,
					classificationResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__EXISTS:
			return isExists();
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE:
			return getClassificationResponse();
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
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__EXISTS:
			setExists((Boolean) newValue);
			return;
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE:
			setClassificationResponse(newValue);
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
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__EXISTS:
			setExists(EXISTS_EDEFAULT);
			return;
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE:
			setClassificationResponse(CLASSIFICATION_RESPONSE_EDEFAULT);
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
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__EXISTS:
			return exists != EXISTS_EDEFAULT;
		case controllersPackage.CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE:
			return CLASSIFICATION_RESPONSE_EDEFAULT == null ? classificationResponse != null
					: !CLASSIFICATION_RESPONSE_EDEFAULT.equals(classificationResponse);
		}
		return super.eIsSet(featureID);
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
		result.append(" (exists: ");
		result.append(exists);
		result.append(", classificationResponse: ");
		result.append(classificationResponse);
		result.append(')');
		return result.toString();
	}

} //CheckExistanceResponseImpl
