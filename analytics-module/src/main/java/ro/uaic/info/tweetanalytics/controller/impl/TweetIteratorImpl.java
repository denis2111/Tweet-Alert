/**
 */
package controller.impl;

import controller.ControllerPackage;
import controller.Tweet;
import controller.TweetCollection;
import controller.TweetIterator;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweet Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link controller.impl.TweetIteratorImpl#getTweetcollection <em>Tweetcollection</em>}</li>
 *   <li>{@link controller.impl.TweetIteratorImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link controller.impl.TweetIteratorImpl#isReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetIteratorImpl extends MinimalEObjectImpl.Container implements TweetIterator {
	/**
	 * The cached value of the '{@link #getTweetcollection() <em>Tweetcollection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetcollection()
	 * @generated
	 * @ordered
	 */
	protected TweetCollection tweetcollection;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverse()
	 * @generated
	 * @ordered
	 */
	protected boolean reverse = REVERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.TWEET_ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetCollection getTweetcollection() {
		return tweetcollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTweetcollection(TweetCollection newTweetcollection, NotificationChain msgs) {
		TweetCollection oldTweetcollection = tweetcollection;
		tweetcollection = newTweetcollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION, oldTweetcollection, newTweetcollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweetcollection(TweetCollection newTweetcollection) {
		if (newTweetcollection != tweetcollection) {
			NotificationChain msgs = null;
			if (tweetcollection != null)
				msgs = ((InternalEObject)tweetcollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION, null, msgs);
			if (newTweetcollection != null)
				msgs = ((InternalEObject)newTweetcollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION, null, msgs);
			msgs = basicSetTweetcollection(newTweetcollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION, newTweetcollection, newTweetcollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.TWEET_ITERATOR__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(boolean newReverse) {
		boolean oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.TWEET_ITERATOR__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional<Tweet> next(Tweet current) {
		int position = tweetcollection.getTweet().indexOf(current);
		position = isReverse() ? position+1 : position - 1;

		if (position <= tweetcollection.getTweet().size() && position >= 0) {
			return Optional.of(tweetcollection.getTweet().get(position + 1));
		}
		return Optional.empty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION:
				return basicSetTweetcollection(null, msgs);
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
			case ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION:
				return getTweetcollection();
			case ControllerPackage.TWEET_ITERATOR__INDEX:
				return getIndex();
			case ControllerPackage.TWEET_ITERATOR__REVERSE:
				return isReverse();
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
			case ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION:
				setTweetcollection((TweetCollection)newValue);
				return;
			case ControllerPackage.TWEET_ITERATOR__INDEX:
				setIndex((Integer)newValue);
				return;
			case ControllerPackage.TWEET_ITERATOR__REVERSE:
				setReverse((Boolean)newValue);
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
			case ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION:
				setTweetcollection((TweetCollection)null);
				return;
			case ControllerPackage.TWEET_ITERATOR__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ControllerPackage.TWEET_ITERATOR__REVERSE:
				setReverse(REVERSE_EDEFAULT);
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
			case ControllerPackage.TWEET_ITERATOR__TWEETCOLLECTION:
				return tweetcollection != null;
			case ControllerPackage.TWEET_ITERATOR__INDEX:
				return index != INDEX_EDEFAULT;
			case ControllerPackage.TWEET_ITERATOR__REVERSE:
				return reverse != REVERSE_EDEFAULT;
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
			case ControllerPackage.TWEET_ITERATOR___NEXT__TWEET:
				return next((Tweet)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(", reverse: ");
		result.append(reverse);
		result.append(')');
		return result.toString();
	}

} //TweetIteratorImpl
