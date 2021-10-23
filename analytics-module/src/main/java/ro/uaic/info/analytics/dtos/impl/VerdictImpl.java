/**
 */
package analytics.dtos.impl;

import analytics.dtos.PredictionType;
import analytics.dtos.Verdict;
import analytics.dtos.dtosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verdict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.dtos.impl.VerdictImpl#getPredictionType <em>Prediction Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerdictImpl extends MinimalEObjectImpl.Container implements Verdict {
	/**
	 * The default value of the '{@link #getPredictionType() <em>Prediction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictionType()
	 * @generated
	 * @ordered
	 */
	protected static final PredictionType PREDICTION_TYPE_EDEFAULT = PredictionType.NO_DISASTER;

	/**
	 * The cached value of the '{@link #getPredictionType() <em>Prediction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictionType()
	 * @generated
	 * @ordered
	 */
	protected PredictionType predictionType = PREDICTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerdictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dtosPackage.Literals.VERDICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictionType getPredictionType() {
		return predictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictionType(PredictionType newPredictionType) {
		PredictionType oldPredictionType = predictionType;
		predictionType = newPredictionType == null ? PREDICTION_TYPE_EDEFAULT : newPredictionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dtosPackage.VERDICT__PREDICTION_TYPE,
					oldPredictionType, predictionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case dtosPackage.VERDICT__PREDICTION_TYPE:
			return getPredictionType();
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
		case dtosPackage.VERDICT__PREDICTION_TYPE:
			setPredictionType((PredictionType) newValue);
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
		case dtosPackage.VERDICT__PREDICTION_TYPE:
			setPredictionType(PREDICTION_TYPE_EDEFAULT);
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
		case dtosPackage.VERDICT__PREDICTION_TYPE:
			return predictionType != PREDICTION_TYPE_EDEFAULT;
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
		result.append(" (predictionType: ");
		result.append(predictionType);
		result.append(')');
		return result.toString();
	}

} //VerdictImpl
