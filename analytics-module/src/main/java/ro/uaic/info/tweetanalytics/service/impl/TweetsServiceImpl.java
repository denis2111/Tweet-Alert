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

import service.FilteringService;
import service.ServicePackage;
import service.TweetsRepository;
import service.TweetsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweets Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link service.impl.TweetsServiceImpl#getTweetsrepository <em>Tweetsrepository</em>}</li>
 *   <li>{@link service.impl.TweetsServiceImpl#getFilteringservice <em>Filteringservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetsServiceImpl extends MinimalEObjectImpl.Container implements TweetsService {
	/**
	 * The cached value of the '{@link #getTweetsrepository() <em>Tweetsrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetsrepository()
	 * @generated
	 * @ordered
	 */
	protected TweetsRepository tweetsrepository;

	/**
	 * The cached value of the '{@link #getFilteringservice() <em>Filteringservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteringservice()
	 * @generated
	 * @ordered
	 */
	protected FilteringService filteringservice;

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
		return ServicePackage.Literals.TWEETS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsRepository getTweetsrepository() {
		return tweetsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTweetsrepository(TweetsRepository newTweetsrepository, NotificationChain msgs) {
		TweetsRepository oldTweetsrepository = tweetsrepository;
		tweetsrepository = newTweetsrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY, oldTweetsrepository, newTweetsrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweetsrepository(TweetsRepository newTweetsrepository) {
		if (newTweetsrepository != tweetsrepository) {
			NotificationChain msgs = null;
			if (tweetsrepository != null)
				msgs = ((InternalEObject)tweetsrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY, null, msgs);
			if (newTweetsrepository != null)
				msgs = ((InternalEObject)newTweetsrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY, null, msgs);
			msgs = basicSetTweetsrepository(newTweetsrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY, newTweetsrepository, newTweetsrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringService getFilteringservice() {
		if (filteringservice != null && filteringservice.eIsProxy()) {
			InternalEObject oldFilteringservice = (InternalEObject)filteringservice;
			filteringservice = (FilteringService)eResolveProxy(oldFilteringservice);
			if (filteringservice != oldFilteringservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE, oldFilteringservice, filteringservice));
			}
		}
		return filteringservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringService basicGetFilteringservice() {
		return filteringservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteringservice(FilteringService newFilteringservice) {
		FilteringService oldFilteringservice = filteringservice;
		filteringservice = newFilteringservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE, oldFilteringservice, filteringservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object extractTweetById(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> extractAllTweets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateTweetById(int id, EObject tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> extractTweetsByLocation(String location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> extractTweetsByLabel(String label) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> extractTweetsByPopilarity(int minFeedbackEntries) {
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
			case ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY:
				return basicSetTweetsrepository(null, msgs);
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
			case ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY:
				return getTweetsrepository();
			case ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE:
				if (resolve) return getFilteringservice();
				return basicGetFilteringservice();
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
			case ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY:
				setTweetsrepository((TweetsRepository)newValue);
				return;
			case ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE:
				setFilteringservice((FilteringService)newValue);
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
			case ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY:
				setTweetsrepository((TweetsRepository)null);
				return;
			case ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE:
				setFilteringservice((FilteringService)null);
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
			case ServicePackage.TWEETS_SERVICE__TWEETSREPOSITORY:
				return tweetsrepository != null;
			case ServicePackage.TWEETS_SERVICE__FILTERINGSERVICE:
				return filteringservice != null;
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
			case ServicePackage.TWEETS_SERVICE___EXTRACT_TWEET_BY_ID__INT:
				return extractTweetById((Integer)arguments.get(0));
			case ServicePackage.TWEETS_SERVICE___EXTRACT_ALL_TWEETS:
				return extractAllTweets();
			case ServicePackage.TWEETS_SERVICE___UPDATE_TWEET_BY_ID__INT_EOBJECT:
				updateTweetById((Integer)arguments.get(0), (EObject)arguments.get(1));
				return null;
			case ServicePackage.TWEETS_SERVICE___EXTRACT_TWEETS_BY_LOCATION__STRING:
				return extractTweetsByLocation((String)arguments.get(0));
			case ServicePackage.TWEETS_SERVICE___EXTRACT_TWEETS_BY_LABEL__STRING:
				return extractTweetsByLabel((String)arguments.get(0));
			case ServicePackage.TWEETS_SERVICE___EXTRACT_TWEETS_BY_POPILARITY__INT:
				return extractTweetsByPopilarity((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetsServiceImpl
