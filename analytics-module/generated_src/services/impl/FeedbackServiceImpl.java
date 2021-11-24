/**
 */
package analytics.services.impl;

import analytics.dtos.TweetDto;

import analytics.models.Feedback;

import analytics.repositories.FeedbackRepository;

import analytics.services.FeedbackService;
import analytics.services.servicesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.services.impl.FeedbackServiceImpl#getFeedbackrepository <em>Feedbackrepository</em>}</li>
 *   <li>{@link analytics.services.impl.FeedbackServiceImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackServiceImpl extends MinimalEObjectImpl.Container implements FeedbackService {
	/**
	 * The cached value of the '{@link #getFeedbackrepository() <em>Feedbackrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackrepository()
	 * @generated
	 * @ordered
	 */
	protected FeedbackRepository feedbackrepository;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected Feedback feedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return servicesPackage.Literals.FEEDBACK_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackRepository getFeedbackrepository() {
		return feedbackrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedbackrepository(FeedbackRepository newFeedbackrepository,
			NotificationChain msgs) {
		FeedbackRepository oldFeedbackrepository = feedbackrepository;
		feedbackrepository = newFeedbackrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY, oldFeedbackrepository, newFeedbackrepository);
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
	public void setFeedbackrepository(FeedbackRepository newFeedbackrepository) {
		if (newFeedbackrepository != feedbackrepository) {
			NotificationChain msgs = null;
			if (feedbackrepository != null)
				msgs = ((InternalEObject) feedbackrepository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY, null, msgs);
			if (newFeedbackrepository != null)
				msgs = ((InternalEObject) newFeedbackrepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY, null, msgs);
			msgs = basicSetFeedbackrepository(newFeedbackrepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY,
					newFeedbackrepository, newFeedbackrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback getFeedback() {
		if (feedback != null && feedback.eIsProxy()) {
			InternalEObject oldFeedback = (InternalEObject) feedback;
			feedback = (Feedback) eResolveProxy(oldFeedback);
			if (feedback != oldFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							servicesPackage.FEEDBACK_SERVICE__FEEDBACK, oldFeedback, feedback));
			}
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(Feedback newFeedback) {
		Feedback oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, servicesPackage.FEEDBACK_SERVICE__FEEDBACK,
					oldFeedback, feedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation storeFeedback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getFeedback(TweetDto tweet) {
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
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY:
			return basicSetFeedbackrepository(null, msgs);
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
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY:
			return getFeedbackrepository();
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACK:
			if (resolve)
				return getFeedback();
			return basicGetFeedback();
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
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY:
			setFeedbackrepository((FeedbackRepository) newValue);
			return;
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACK:
			setFeedback((Feedback) newValue);
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
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY:
			setFeedbackrepository((FeedbackRepository) null);
			return;
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACK:
			setFeedback((Feedback) null);
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
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACKREPOSITORY:
			return feedbackrepository != null;
		case servicesPackage.FEEDBACK_SERVICE__FEEDBACK:
			return feedback != null;
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
		case servicesPackage.FEEDBACK_SERVICE___STORE_FEEDBACK:
			return storeFeedback();
		case servicesPackage.FEEDBACK_SERVICE___GET_FEEDBACK__TWEETDTO:
			getFeedback((TweetDto) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeedbackServiceImpl
