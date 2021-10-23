/**
 */
package analytics.controllers.impl;

import analytics.controllers.controllersPackage;

import analytics.dtos.TweetDto;

import analytics.exceptions.NotFoundException;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweets Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.controllers.impl.TweetsControllerImpl#getService <em>Service</em>}</li>
 *   <li>{@link analytics.controllers.impl.TweetsControllerImpl#getTweetdto <em>Tweetdto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetsControllerImpl extends MinimalEObjectImpl.Container implements TweetsController {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Object service;

	/**
	 * The cached value of the '{@link #getTweetdto() <em>Tweetdto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetdto()
	 * @generated
	 * @ordered
	 */
	protected TweetDto tweetdto;

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
		return controllersPackage.Literals.TWEETS_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Object newService, NotificationChain msgs) {
		Object oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					controllersPackage.TWEETS_CONTROLLER__SERVICE, oldService, newService);
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
	public void setService(Object newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject) service).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - controllersPackage.TWEETS_CONTROLLER__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject) newService).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - controllersPackage.TWEETS_CONTROLLER__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.TWEETS_CONTROLLER__SERVICE,
					newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetDto getTweetdto() {
		if (tweetdto != null && tweetdto.eIsProxy()) {
			InternalEObject oldTweetdto = (InternalEObject) tweetdto;
			tweetdto = (TweetDto) eResolveProxy(oldTweetdto);
			if (tweetdto != oldTweetdto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							controllersPackage.TWEETS_CONTROLLER__TWEETDTO, oldTweetdto, tweetdto));
			}
		}
		return tweetdto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetDto basicGetTweetdto() {
		return tweetdto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweetdto(TweetDto newTweetdto) {
		TweetDto oldTweetdto = tweetdto;
		tweetdto = newTweetdto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.TWEETS_CONTROLLER__TWEETDTO,
					oldTweetdto, tweetdto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTweets() throws NotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetDto getTweet() throws NotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String storeTweet(TweetDto tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String updateTweetBuId(TweetDto tweet, String id) {
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
		case controllersPackage.TWEETS_CONTROLLER__SERVICE:
			return basicSetService(null, msgs);
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
		case controllersPackage.TWEETS_CONTROLLER__SERVICE:
			return getService();
		case controllersPackage.TWEETS_CONTROLLER__TWEETDTO:
			if (resolve)
				return getTweetdto();
			return basicGetTweetdto();
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
		case controllersPackage.TWEETS_CONTROLLER__SERVICE:
			setService((Object) newValue);
			return;
		case controllersPackage.TWEETS_CONTROLLER__TWEETDTO:
			setTweetdto((TweetDto) newValue);
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
		case controllersPackage.TWEETS_CONTROLLER__SERVICE:
			setService((Object) null);
			return;
		case controllersPackage.TWEETS_CONTROLLER__TWEETDTO:
			setTweetdto((TweetDto) null);
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
		case controllersPackage.TWEETS_CONTROLLER__SERVICE:
			return service != null;
		case controllersPackage.TWEETS_CONTROLLER__TWEETDTO:
			return tweetdto != null;
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
		case controllersPackage.TWEETS_CONTROLLER___GET_TWEETS:
			try {
				return getTweets();
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case controllersPackage.TWEETS_CONTROLLER___GET_TWEET:
			try {
				return getTweet();
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case controllersPackage.TWEETS_CONTROLLER___STORE_TWEET__TWEETDTO:
			return storeTweet((TweetDto) arguments.get(0));
		case controllersPackage.TWEETS_CONTROLLER___UPDATE_TWEET_BU_ID__TWEETDTO_STRING:
			return updateTweetBuId((TweetDto) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetsControllerImpl
