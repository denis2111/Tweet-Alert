/**
 */
package webControllerE;

import webControllerE.controllers.ImageClassifierClient;
import webControllerE.controllers.NLPClient;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.Tweet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see webControllerE.WebControllerEPackage#getClassifierClient()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ClassifierClient extends NLPClient, ImageClassifierClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ClassificationResponse classify(Tweet tweet);

} // ClassifierClient
