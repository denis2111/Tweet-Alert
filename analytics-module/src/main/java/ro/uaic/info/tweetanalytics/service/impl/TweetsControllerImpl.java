/**
 */
package service.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import service.ServicePackage;
import service.TweetsController;
import service.TweetsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweets Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link service.impl.TweetsControllerImpl#getTweetsservice <em>Tweetsservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetsControllerImpl extends MinimalEObjectImpl.Container implements TweetsController {
	/**
	 * The cached value of the '{@link #getTweetsservice() <em>Tweetsservice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetsservice()
	 * @generated
	 * @ordered
	 */
	protected TweetsService tweetsservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetsControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TWEETS_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsService getTweetsservice() {
		return tweetsservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTweetsservice(TweetsService newTweetsservice, NotificationChain msgs) {
		TweetsService oldTweetsservice = tweetsservice;
		tweetsservice = newTweetsservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE, oldTweetsservice, newTweetsservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweetsservice(TweetsService newTweetsservice) {
		if (newTweetsservice != tweetsservice) {
			NotificationChain msgs = null;
			if (tweetsservice != null)
				msgs = ((InternalEObject)tweetsservice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE, null, msgs);
			if (newTweetsservice != null)
				msgs = ((InternalEObject)newTweetsservice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE, null, msgs);
			msgs = basicSetTweetsservice(newTweetsservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE, newTweetsservice, newTweetsservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void storeTweet(EObject tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTweetById(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getTweets() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE:
				return basicSetTweetsservice(null, msgs);
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
			case ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE:
				return getTweetsservice();
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
			case ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE:
				setTweetsservice((TweetsService)newValue);
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
			case ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE:
				setTweetsservice((TweetsService)null);
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
			case ServicePackage.TWEETS_CONTROLLER__TWEETSSERVICE:
				return tweetsservice != null;
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
			case ServicePackage.TWEETS_CONTROLLER___STORE_TWEET__EOBJECT:
				storeTweet((EObject)arguments.get(0));
				return null;
			case ServicePackage.TWEETS_CONTROLLER___GET_TWEET_BY_ID__INT:
				return getTweetById((Integer)arguments.get(0));
			case ServicePackage.TWEETS_CONTROLLER___GET_TWEETS:
				return getTweets();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetsControllerImpl
