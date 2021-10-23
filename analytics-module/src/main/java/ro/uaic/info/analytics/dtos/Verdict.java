/**
 */
package analytics.dtos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verdict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.dtos.Verdict#getPredictionType <em>Prediction Type</em>}</li>
 * </ul>
 *
 * @see analytics.dtos.dtosPackage#getVerdict()
 * @model
 * @generated
 */
public interface Verdict extends EObject {
	/**
	 * Returns the value of the '<em><b>Prediction Type</b></em>' attribute.
	 * The default value is <code>"NO_DISASTER"</code>.
	 * The literals are from the enumeration {@link analytics.dtos.PredictionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prediction Type</em>' attribute.
	 * @see analytics.dtos.PredictionType
	 * @see #setPredictionType(PredictionType)
	 * @see analytics.dtos.dtosPackage#getVerdict_PredictionType()
	 * @model default="NO_DISASTER"
	 * @generated
	 */
	PredictionType getPredictionType();

	/**
	 * Sets the value of the '{@link analytics.dtos.Verdict#getPredictionType <em>Prediction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prediction Type</em>' attribute.
	 * @see analytics.dtos.PredictionType
	 * @see #getPredictionType()
	 * @generated
	 */
	void setPredictionType(PredictionType value);

} // Verdict
