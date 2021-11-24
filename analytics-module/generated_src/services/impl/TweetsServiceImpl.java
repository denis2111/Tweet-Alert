/**
 */
package analytics.services.impl;

import analytics.exceptions.NotFoundException;

import analytics.models.Tweet;

import analytics.services.servicesPackage;

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
 * An implementation of the model object '<em><b>Tweets Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.services.impl.TweetsServiceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link analytics.services.impl.TweetsServiceImpl#getTweet <em>Tweet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetsServiceImpl extends MinimalEObjectImpl.Container implements Object {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Object repository;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return servicesPackage.Literals.TWEETS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Object newRepository, NotificationChain msgs) {
		Object oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					servicesPackage.TWEETS_SERVICE__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(Object newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - servicesPackage.TWEETS_SERVICE__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - servicesPackage.TWEETS_SERVICE__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, servicesPackage.TWEETS_SERVICE__REPOSITORY,
					newRepository, newRepository));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, servicesPackage.TWEETS_SERVICE__TWEET,
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
			eNotify(new ENotificationImpl(this, Notification.SET, servicesPackage.TWEETS_SERVICE__TWEET, oldTweet,
					tweet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getTweets() throws NotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void storeTweet(Tweet tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tweet getTweeet() throws NotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateTweetBuId(Tweet tweet, String id) {
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
		case servicesPackage.TWEETS_SERVICE__REPOSITORY:
			return basicSetRepository(null, msgs);
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
		case servicesPackage.TWEETS_SERVICE__REPOSITORY:
			return getRepository();
		case servicesPackage.TWEETS_SERVICE__TWEET:
			if (resolve)
				return getTweet();
			return basicGetTweet();
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
		case servicesPackage.TWEETS_SERVICE__REPOSITORY:
			setRepository((Object) newValue);
			return;
		case servicesPackage.TWEETS_SERVICE__TWEET:
			setTweet((Tweet) newValue);
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
		case servicesPackage.TWEETS_SERVICE__REPOSITORY:
			setRepository((Object) null);
			return;
		case servicesPackage.TWEETS_SERVICE__TWEET:
			setTweet((Tweet) null);
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
		case servicesPackage.TWEETS_SERVICE__REPOSITORY:
			return repository != null;
		case servicesPackage.TWEETS_SERVICE__TWEET:
			return tweet != null;
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
		case servicesPackage.TWEETS_SERVICE___GET_TWEETS:
			try {
				return getTweets();
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case servicesPackage.TWEETS_SERVICE___STORE_TWEET__TWEET:
			storeTweet((Tweet) arguments.get(0));
			return null;
		case servicesPackage.TWEETS_SERVICE___GET_TWEEET:
			try {
				return getTweeet();
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case servicesPackage.TWEETS_SERVICE___UPDATE_TWEET_BU_ID__TWEET_STRING:
			updateTweetBuId((Tweet) arguments.get(0), (String) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetsServiceImpl
