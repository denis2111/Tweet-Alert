/**
 */
package webControllerE.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.ClassifierClient;

import webControllerE.controllers.AnalyticsClient;
import webControllerE.controllers.WebController;
import webControllerE.controllers.controllersPackage;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.impl.WebControllerImpl#getClassifierclient <em>Classifierclient</em>}</li>
 *   <li>{@link webControllerE.controllers.impl.WebControllerImpl#getAnalyticsclient <em>Analyticsclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebControllerImpl extends MinimalEObjectImpl.Container implements WebController {
	/**
	 * The cached value of the '{@link #getClassifierclient() <em>Classifierclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierclient()
	 * @generated
	 * @ordered
	 */
	protected ClassifierClient classifierclient;

	/**
	 * The cached value of the '{@link #getAnalyticsclient() <em>Analyticsclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyticsclient()
	 * @generated
	 * @ordered
	 */
	protected AnalyticsClient analyticsclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return controllersPackage.Literals.WEB_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierClient getClassifierclient() {
		return classifierclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierclient(ClassifierClient newClassifierclient, NotificationChain msgs) {
		ClassifierClient oldClassifierclient = classifierclient;
		classifierclient = newClassifierclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT, oldClassifierclient, newClassifierclient);
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
	public void setClassifierclient(ClassifierClient newClassifierclient) {
		if (newClassifierclient != classifierclient) {
			NotificationChain msgs = null;
			if (classifierclient != null)
				msgs = ((InternalEObject) classifierclient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT, null, msgs);
			if (newClassifierclient != null)
				msgs = ((InternalEObject) newClassifierclient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT, null, msgs);
			msgs = basicSetClassifierclient(newClassifierclient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT,
					newClassifierclient, newClassifierclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsClient getAnalyticsclient() {
		if (analyticsclient != null && analyticsclient.eIsProxy()) {
			InternalEObject oldAnalyticsclient = (InternalEObject) analyticsclient;
			analyticsclient = (AnalyticsClient) eResolveProxy(oldAnalyticsclient);
			if (analyticsclient != oldAnalyticsclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT, oldAnalyticsclient, analyticsclient));
			}
		}
		return analyticsclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsClient basicGetAnalyticsclient() {
		return analyticsclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyticsclient(AnalyticsClient newAnalyticsclient) {
		AnalyticsClient oldAnalyticsclient = analyticsclient;
		analyticsclient = newAnalyticsclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT,
					oldAnalyticsclient, analyticsclient));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT:
			return basicSetClassifierclient(null, msgs);
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
		case controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT:
			return getClassifierclient();
		case controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT:
			if (resolve)
				return getAnalyticsclient();
			return basicGetAnalyticsclient();
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
		case controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT:
			setClassifierclient((ClassifierClient) newValue);
			return;
		case controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT:
			setAnalyticsclient((AnalyticsClient) newValue);
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
		case controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT:
			setClassifierclient((ClassifierClient) null);
			return;
		case controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT:
			setAnalyticsclient((AnalyticsClient) null);
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
		case controllersPackage.WEB_CONTROLLER__CLASSIFIERCLIENT:
			return classifierclient != null;
		case controllersPackage.WEB_CONTROLLER__ANALYTICSCLIENT:
			return analyticsclient != null;
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
		case controllersPackage.WEB_CONTROLLER___CLASSIFY__TWEET:
			return classify((Tweet) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WebControllerImpl
