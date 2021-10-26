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

import webControllerE.controllers.NLPClient;
import webControllerE.controllers.controllersPackage;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NLP Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.impl.NLPClientImpl#getTweet <em>Tweet</em>}</li>
 *   <li>{@link webControllerE.controllers.impl.NLPClientImpl#getResponsebuilder <em>Responsebuilder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NLPClientImpl extends MinimalEObjectImpl.Container implements NLPClient {
	/**
	 * The cached value of the '{@link #getTweet() <em>Tweet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweet()
	 * @generated
	 * @ordered
	 */
	protected Tweet tweet;

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
	protected NLPClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return controllersPackage.Literals.NLP_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tweet getTweet() {
		if (tweet != null && tweet.eIsProxy()) {
			InternalEObject oldTweet = (InternalEObject) tweet;
			tweet = (Tweet) eResolveProxy(oldTweet);
			if (tweet != oldTweet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, controllersPackage.NLP_CLIENT__TWEET,
							oldTweet, tweet));
			}
		}
		return tweet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tweet basicGetTweet() {
		return tweet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweet(Tweet newTweet) {
		Tweet oldTweet = tweet;
		tweet = newTweet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.NLP_CLIENT__TWEET, oldTweet,
					tweet));
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
							controllersPackage.NLP_CLIENT__RESPONSEBUILDER, oldResponsebuilder, responsebuilder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.NLP_CLIENT__RESPONSEBUILDER,
					oldResponsebuilder, responsebuilder));
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
		case controllersPackage.NLP_CLIENT__TWEET:
			if (resolve)
				return getTweet();
			return basicGetTweet();
		case controllersPackage.NLP_CLIENT__RESPONSEBUILDER:
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
		case controllersPackage.NLP_CLIENT__TWEET:
			setTweet((Tweet) newValue);
			return;
		case controllersPackage.NLP_CLIENT__RESPONSEBUILDER:
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
		case controllersPackage.NLP_CLIENT__TWEET:
			setTweet((Tweet) null);
			return;
		case controllersPackage.NLP_CLIENT__RESPONSEBUILDER:
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
		case controllersPackage.NLP_CLIENT__TWEET:
			return tweet != null;
		case controllersPackage.NLP_CLIENT__RESPONSEBUILDER:
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
		case controllersPackage.NLP_CLIENT___CLASSIFY__TWEET:
			return classify((Tweet) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NLPClientImpl
