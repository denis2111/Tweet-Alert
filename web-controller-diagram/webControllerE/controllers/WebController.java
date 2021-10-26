/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EObject;

import webControllerE.ClassifierClient;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webControllerE.controllers.WebController#getClassifierclient <em>Classifierclient</em>}</li>
 *   <li>{@link webControllerE.controllers.WebController#getAnalyticsclient <em>Analyticsclient</em>}</li>
 * </ul>
 *
 * @see webControllerE.controllers.controllersPackage#getWebController()
 * @model
 * @generated
 */
public interface WebController extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifierclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifierclient</em>' containment reference.
	 * @see #setClassifierclient(ClassifierClient)
	 * @see webControllerE.controllers.controllersPackage#getWebController_Classifierclient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassifierClient getClassifierclient();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.WebController#getClassifierclient <em>Classifierclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifierclient</em>' containment reference.
	 * @see #getClassifierclient()
	 * @generated
	 */
	void setClassifierclient(ClassifierClient value);

	/**
	 * Returns the value of the '<em><b>Analyticsclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyticsclient</em>' reference.
	 * @see #setAnalyticsclient(AnalyticsClient)
	 * @see webControllerE.controllers.controllersPackage#getWebController_Analyticsclient()
	 * @model
	 * @generated
	 */
	AnalyticsClient getAnalyticsclient();

	/**
	 * Sets the value of the '{@link webControllerE.controllers.WebController#getAnalyticsclient <em>Analyticsclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyticsclient</em>' reference.
	 * @see #getAnalyticsclient()
	 * @generated
	 */
	void setAnalyticsclient(AnalyticsClient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ClassificationResponse classify(Tweet tweet);

} // WebController
