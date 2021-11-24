/**
 */
package analytics.models.impl;

import analytics.models.Feedback;
import analytics.models.modelssPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.models.impl.FeedbackImpl#isThumbsUp <em>Thumbs Up</em>}</li>
 *   <li>{@link analytics.models.impl.FeedbackImpl#getTweetId <em>Tweet Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback {
	/**
	 * The default value of the '{@link #isThumbsUp() <em>Thumbs Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThumbsUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THUMBS_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThumbsUp() <em>Thumbs Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThumbsUp()
	 * @generated
	 * @ordered
	 */
	protected boolean thumbsUp = THUMBS_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTweetId() <em>Tweet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TWEET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTweetId() <em>Tweet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweetId()
	 * @generated
	 * @ordered
	 */
	protected String tweetId = TWEET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelssPackage.Literals.FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThumbsUp() {
		return thumbsUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbsUp(boolean newThumbsUp) {
		boolean oldThumbsUp = thumbsUp;
		thumbsUp = newThumbsUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelssPackage.FEEDBACK__THUMBS_UP, oldThumbsUp,
					thumbsUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTweetId() {
		return tweetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTweetId(String newTweetId) {
		String oldTweetId = tweetId;
		tweetId = newTweetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelssPackage.FEEDBACK__TWEET_ID, oldTweetId,
					tweetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case modelssPackage.FEEDBACK__THUMBS_UP:
			return isThumbsUp();
		case modelssPackage.FEEDBACK__TWEET_ID:
			return getTweetId();
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
		case modelssPackage.FEEDBACK__THUMBS_UP:
			setThumbsUp((Boolean) newValue);
			return;
		case modelssPackage.FEEDBACK__TWEET_ID:
			setTweetId((String) newValue);
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
		case modelssPackage.FEEDBACK__THUMBS_UP:
			setThumbsUp(THUMBS_UP_EDEFAULT);
			return;
		case modelssPackage.FEEDBACK__TWEET_ID:
			setTweetId(TWEET_ID_EDEFAULT);
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
		case modelssPackage.FEEDBACK__THUMBS_UP:
			return thumbsUp != THUMBS_UP_EDEFAULT;
		case modelssPackage.FEEDBACK__TWEET_ID:
			return TWEET_ID_EDEFAULT == null ? tweetId != null : !TWEET_ID_EDEFAULT.equals(tweetId);
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
		result.append(" (thumbsUp: ");
		result.append(thumbsUp);
		result.append(", tweetId: ");
		result.append(tweetId);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
