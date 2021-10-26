/**
 */
package webControllerE.models.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.DisasterType;
import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.models.impl.ClassificationResponseImpl#getClassificationLabel <em>Classification Label</em>}</li>
 *   <li>{@link webControllerE.models.impl.ClassificationResponseImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationResponseImpl extends MinimalEObjectImpl.Container implements ClassificationResponse {
	/**
	 * The default value of the '{@link #getClassificationLabel() <em>Classification Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final DisasterType CLASSIFICATION_LABEL_EDEFAULT = DisasterType.CYCLONE;

	/**
	 * The cached value of the '{@link #getClassificationLabel() <em>Classification Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLabel()
	 * @generated
	 * @ordered
	 */
	protected DisasterType classificationLabel = CLASSIFICATION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final float PRECISION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected float precision = PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelsPackage.Literals.CLASSIFICATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisasterType getClassificationLabel() {
		return classificationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationLabel(DisasterType newClassificationLabel) {
		DisasterType oldClassificationLabel = classificationLabel;
		classificationLabel = newClassificationLabel == null ? CLASSIFICATION_LABEL_EDEFAULT : newClassificationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					modelsPackage.CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL, oldClassificationLabel,
					classificationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(float newPrecision) {
		float oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelsPackage.CLASSIFICATION_RESPONSE__PRECISION,
					oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case modelsPackage.CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL:
			return getClassificationLabel();
		case modelsPackage.CLASSIFICATION_RESPONSE__PRECISION:
			return getPrecision();
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
		case modelsPackage.CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL:
			setClassificationLabel((DisasterType) newValue);
			return;
		case modelsPackage.CLASSIFICATION_RESPONSE__PRECISION:
			setPrecision((Float) newValue);
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
		case modelsPackage.CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL:
			setClassificationLabel(CLASSIFICATION_LABEL_EDEFAULT);
			return;
		case modelsPackage.CLASSIFICATION_RESPONSE__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
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
		case modelsPackage.CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL:
			return classificationLabel != CLASSIFICATION_LABEL_EDEFAULT;
		case modelsPackage.CLASSIFICATION_RESPONSE__PRECISION:
			return precision != PRECISION_EDEFAULT;
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
		result.append(" (classificationLabel: ");
		result.append(classificationLabel);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //ClassificationResponseImpl
