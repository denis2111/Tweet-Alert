/**
 */
package webControllerE.models.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.LocalizedResponse;
import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localized Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.impl.LocalizedResponseImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link webControllerE.models.impl.LocalizedResponseImpl#getClassificationresponse <em>Classificationresponse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalizedResponseImpl extends MinimalEObjectImpl.Container implements LocalizedResponse {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassificationresponse() <em>Classificationresponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationresponse()
	 * @generated
	 * @ordered
	 */
	protected ClassificationResponse classificationresponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalizedResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelsPackage.Literals.LOCALIZED_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.LOCALIZED_RESPONSE__LOCATION,
					oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationResponse getClassificationresponse() {
		return classificationresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationresponse(ClassificationResponse newClassificationresponse,
			NotificationChain msgs) {
		ClassificationResponse oldClassificationresponse = classificationresponse;
		classificationresponse = newClassificationresponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE, oldClassificationresponse,
					newClassificationresponse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationresponse(ClassificationResponse newClassificationresponse) {
		if (newClassificationresponse != classificationresponse) {
			NotificationChain msgs = null;
			if (classificationresponse != null)
				msgs = ((InternalEObject) classificationresponse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE, null, msgs);
			if (newClassificationresponse != null)
				msgs = ((InternalEObject) newClassificationresponse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE, null, msgs);
			msgs = basicSetClassificationresponse(newClassificationresponse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE, newClassificationresponse,
					newClassificationresponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE:
			return basicSetClassificationresponse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case modelsPackage.LOCALIZED_RESPONSE__LOCATION:
			return getLocation();
		case modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE:
			return getClassificationresponse();
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
		case modelsPackage.LOCALIZED_RESPONSE__LOCATION:
			setLocation((String) newValue);
			return;
		case modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE:
			setClassificationresponse((ClassificationResponse) newValue);
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
		case modelsPackage.LOCALIZED_RESPONSE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE:
			setClassificationresponse((ClassificationResponse) null);
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
		case modelsPackage.LOCALIZED_RESPONSE__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case modelsPackage.LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE:
			return classificationresponse != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //LocalizedResponseImpl
