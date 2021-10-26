/**
 */
package webControllerE.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webControllerE.controllers.AnalyticsClient;
import webControllerE.controllers.CheckExistanceResponse;
import webControllerE.controllers.controllersPackage;

import webControllerE.models.Image;
import webControllerE.models.Response;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analytics Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.impl.AnalyticsClientImpl#getCheckexistanceresponse <em>Checkexistanceresponse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticsClientImpl extends MinimalEObjectImpl.Container implements AnalyticsClient {
	/**
	 * The cached value of the '{@link #getCheckexistanceresponse() <em>Checkexistanceresponse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckexistanceresponse()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckExistanceResponse> checkexistanceresponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyticsClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return controllersPackage.Literals.ANALYTICS_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CheckExistanceResponse> getCheckexistanceresponse() {
		if (checkexistanceresponse == null) {
			checkexistanceresponse = new EObjectContainmentEList<CheckExistanceResponse>(CheckExistanceResponse.class,
					this, controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE);
		}
		return checkexistanceresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckExistanceResponse checkImageExistance(Image image) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckExistanceResponse checkTextExistance(String image) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void persisImage(Image image, Response response) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void persisText(String text, Response response) {
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
		case controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE:
			return ((InternalEList<?>) getCheckexistanceresponse()).basicRemove(otherEnd, msgs);
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
		case controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE:
			return getCheckexistanceresponse();
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
		case controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE:
			getCheckexistanceresponse().clear();
			getCheckexistanceresponse().addAll((Collection<? extends CheckExistanceResponse>) newValue);
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
		case controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE:
			getCheckexistanceresponse().clear();
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
		case controllersPackage.ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE:
			return checkexistanceresponse != null && !checkexistanceresponse.isEmpty();
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
		case controllersPackage.ANALYTICS_CLIENT___CHECK_IMAGE_EXISTANCE__IMAGE:
			return checkImageExistance((Image) arguments.get(0));
		case controllersPackage.ANALYTICS_CLIENT___CHECK_TEXT_EXISTANCE__STRING:
			return checkTextExistance((String) arguments.get(0));
		case controllersPackage.ANALYTICS_CLIENT___PERSIS_IMAGE__IMAGE_RESPONSE:
			persisImage((Image) arguments.get(0), (Response) arguments.get(1));
			return null;
		case controllersPackage.ANALYTICS_CLIENT___PERSIS_TEXT__STRING_RESPONSE:
			persisText((String) arguments.get(0), (Response) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalyticsClientImpl
