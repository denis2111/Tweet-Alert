/**
 */
package webControllerE.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.controllers.ImageClassifierClient;
import webControllerE.controllers.controllersPackage;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Classifier Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.impl.ImageClassifierClientImpl#getResponsebuilder <em>Responsebuilder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageClassifierClientImpl extends MinimalEObjectImpl.Container implements ImageClassifierClient {
	/**
	 * The cached value of the '{@link #getResponsebuilder() <em>Responsebuilder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsebuilder()
	 * @generated
	 * @ordered
	 */
	protected ResponseBuilder responsebuilder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageClassifierClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return controllersPackage.Literals.IMAGE_CLASSIFIER_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBuilder getResponsebuilder() {
		if (responsebuilder != null && responsebuilder.eIsProxy()) {
			InternalEObject oldResponsebuilder = (InternalEObject) responsebuilder;
			responsebuilder = (ResponseBuilder) eResolveProxy(oldResponsebuilder);
			if (responsebuilder != oldResponsebuilder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER, oldResponsebuilder,
							responsebuilder));
			}
		}
		return responsebuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBuilder basicGetResponsebuilder() {
		return responsebuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsebuilder(ResponseBuilder newResponsebuilder) {
		ResponseBuilder oldResponsebuilder = responsebuilder;
		responsebuilder = newResponsebuilder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER, oldResponsebuilder, responsebuilder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationResponse classify(Tweet tweet) {
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
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER:
			if (resolve)
				return getResponsebuilder();
			return basicGetResponsebuilder();
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
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER:
			setResponsebuilder((ResponseBuilder) newValue);
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
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER:
			setResponsebuilder((ResponseBuilder) null);
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
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER:
			return responsebuilder != null;
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
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT___CLASSIFY__TWEET:
			return classify((Tweet) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImageClassifierClientImpl
