/**
 */
package controller.impl;

import controller.ControllerPackage;
import controller.Tweet;
import controller.TweetCollection;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweet Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link controller.impl.TweetCollectionImpl#getTweet <em>Tweet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetCollectionImpl extends MinimalEObjectImpl.Container implements TweetCollection {
	/**
	 * The cached value of the '{@link #getTweet() <em>Tweet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweet()
	 * @generated
	 * @ordered
	 */
	protected EList<Tweet> tweet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.TWEET_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tweet> getTweet() {
		if (tweet == null) {
			tweet = new EObjectContainmentEList<Tweet>(Tweet.class, this, ControllerPackage.TWEET_COLLECTION__TWEET);
		}
		return tweet;
	}


	public void addTweet(Tweet tweet) {
		this.tweet.add(tweet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.TWEET_COLLECTION__TWEET:
				return ((InternalEList<?>)getTweet()).basicRemove(otherEnd, msgs);
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
			case ControllerPackage.TWEET_COLLECTION__TWEET:
				return getTweet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControllerPackage.TWEET_COLLECTION__TWEET:
				getTweet().clear();
				getTweet().addAll((Collection<? extends Tweet>)newValue);
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
			case ControllerPackage.TWEET_COLLECTION__TWEET:
				getTweet().clear();
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
			case ControllerPackage.TWEET_COLLECTION__TWEET:
				return tweet != null && !tweet.isEmpty();
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
			case ControllerPackage.TWEET_COLLECTION___ADD_TWEET__TWEET:
				addTweet((Tweet)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetCollectionImpl
