/**
 */
package webControllerE.models.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.models.DisasterType;
import webControllerE.models.Response;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.impl.ResponseBuilderImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link webControllerE.models.impl.ResponseBuilderImpl#getClassificationLabel <em>Classification Label</em>}</li>
 *   <li>{@link webControllerE.models.impl.ResponseBuilderImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link webControllerE.models.impl.ResponseBuilderImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseBuilderImpl extends MinimalEObjectImpl.Container implements ResponseBuilder {
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
	 * The default value of the '{@link #getClassificationLabel() <em>Classification Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final DisasterType CLASSIFICATION_LABEL_EDEFAULT = DisasterType.CYCLONE;

	/**
	 * The cached value of the '{@link #getClassificationLabel() <em>Classification Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLabel()
	 * @generated
	 * @ordered
	 */
	protected DisasterType classificationLabel = CLASSIFICATION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final float PRECISION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected float precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Response response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelsPackage.Literals.RESPONSE_BUILDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.RESPONSE_BUILDER__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisasterType getClassificationLabel() {
		return classificationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationLabel(DisasterType newClassificationLabel) {
		DisasterType oldClassificationLabel = classificationLabel;
		classificationLabel = newClassificationLabel == null ? CLASSIFICATION_LABEL_EDEFAULT : newClassificationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.RESPONSE_BUILDER__CLASSIFICATION_LABEL,
					oldClassificationLabel, classificationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(float newPrecision) {
		float oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.RESPONSE_BUILDER__PRECISION,
					oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject) response;
			response = (Response) eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modelsPackage.RESPONSE_BUILDER__RESPONSE,
							oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Response newResponse) {
		Response oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.RESPONSE_BUILDER__RESPONSE, oldResponse,
					response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case modelsPackage.RESPONSE_BUILDER__LOCATION:
			return getLocation();
		case modelsPackage.RESPONSE_BUILDER__CLASSIFICATION_LABEL:
			return getClassificationLabel();
		case modelsPackage.RESPONSE_BUILDER__PRECISION:
			return getPrecision();
		case modelsPackage.RESPONSE_BUILDER__RESPONSE:
			if (resolve)
				return getResponse();
			return basicGetResponse();
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
		case modelsPackage.RESPONSE_BUILDER__LOCATION:
			setLocation((String) newValue);
			return;
		case modelsPackage.RESPONSE_BUILDER__CLASSIFICATION_LABEL:
			setClassificationLabel((DisasterType) newValue);
			return;
		case modelsPackage.RESPONSE_BUILDER__PRECISION:
			setPrecision((Float) newValue);
			return;
		case modelsPackage.RESPONSE_BUILDER__RESPONSE:
			setResponse((Response) newValue);
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
		case modelsPackage.RESPONSE_BUILDER__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case modelsPackage.RESPONSE_BUILDER__CLASSIFICATION_LABEL:
			setClassificationLabel(CLASSIFICATION_LABEL_EDEFAULT);
			return;
		case modelsPackage.RESPONSE_BUILDER__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
			return;
		case modelsPackage.RESPONSE_BUILDER__RESPONSE:
			setResponse((Response) null);
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
		case modelsPackage.RESPONSE_BUILDER__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case modelsPackage.RESPONSE_BUILDER__CLASSIFICATION_LABEL:
			return classificationLabel != CLASSIFICATION_LABEL_EDEFAULT;
		case modelsPackage.RESPONSE_BUILDER__PRECISION:
			return precision != PRECISION_EDEFAULT;
		case modelsPackage.RESPONSE_BUILDER__RESPONSE:
			return response != null;
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
		result.append(", classificationLabel: ");
		result.append(classificationLabel);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //ResponseBuilderImpl
