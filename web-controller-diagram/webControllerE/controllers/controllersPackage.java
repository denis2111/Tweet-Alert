/**
 */
package webControllerE.controllers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webControllerE.controllers.controllersFactory
 * @model kind="package"
 * @generated
 */
public interface controllersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controllers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "controllers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controllers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	controllersPackage eINSTANCE = webControllerE.controllers.impl.controllersPackageImpl.init();

	/**
	 * The meta object id for the '{@link webControllerE.controllers.impl.NLPClientImpl <em>NLP Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.controllers.impl.NLPClientImpl
	 * @see webControllerE.controllers.impl.controllersPackageImpl#getNLPClient()
	 * @generated
	 */
	int NLP_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Tweet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_CLIENT__TWEET = 0;

	/**
	 * The feature id for the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_CLIENT__RESPONSEBUILDER = 1;

	/**
	 * The number of structural features of the '<em>NLP Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Classify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_CLIENT___CLASSIFY__TWEET = 0;

	/**
	 * The number of operations of the '<em>NLP Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_CLIENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link webControllerE.controllers.impl.ImageClassifierClientImpl <em>Image Classifier Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.controllers.impl.ImageClassifierClientImpl
	 * @see webControllerE.controllers.impl.controllersPackageImpl#getImageClassifierClient()
	 * @generated
	 */
	int IMAGE_CLASSIFIER_CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER = 0;

	/**
	 * The number of structural features of the '<em>Image Classifier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CLASSIFIER_CLIENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Classify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CLASSIFIER_CLIENT___CLASSIFY__TWEET = 0;

	/**
	 * The number of operations of the '<em>Image Classifier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CLASSIFIER_CLIENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link webControllerE.controllers.impl.WebControllerImpl <em>Web Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.controllers.impl.WebControllerImpl
	 * @see webControllerE.controllers.impl.controllersPackageImpl#getWebController()
	 * @generated
	 */
	int WEB_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Classifierclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTROLLER__CLASSIFIERCLIENT = 0;

	/**
	 * The feature id for the '<em><b>Analyticsclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTROLLER__ANALYTICSCLIENT = 1;

	/**
	 * The number of structural features of the '<em>Web Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Classify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTROLLER___CLASSIFY__TWEET = 0;

	/**
	 * The number of operations of the '<em>Web Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTROLLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link webControllerE.controllers.impl.AnalyticsClientImpl <em>Analytics Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.controllers.impl.AnalyticsClientImpl
	 * @see webControllerE.controllers.impl.controllersPackageImpl#getAnalyticsClient()
	 * @generated
	 */
	int ANALYTICS_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Checkexistanceresponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE = 0;

	/**
	 * The number of structural features of the '<em>Analytics Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Check Image Existance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT___CHECK_IMAGE_EXISTANCE__IMAGE = 0;

	/**
	 * The operation id for the '<em>Check Text Existance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT___CHECK_TEXT_EXISTANCE__STRING = 1;

	/**
	 * The operation id for the '<em>Persis Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT___PERSIS_IMAGE__IMAGE_RESPONSE = 2;

	/**
	 * The operation id for the '<em>Persis Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT___PERSIS_TEXT__STRING_RESPONSE = 3;

	/**
	 * The number of operations of the '<em>Analytics Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_CLIENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link webControllerE.controllers.impl.CheckExistanceResponseImpl <em>Check Existance Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.controllers.impl.CheckExistanceResponseImpl
	 * @see webControllerE.controllers.impl.controllersPackageImpl#getCheckExistanceResponse()
	 * @generated
	 */
	int CHECK_EXISTANCE_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXISTANCE_RESPONSE__EXISTS = 0;

	/**
	 * The feature id for the '<em><b>Classification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Check Existance Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXISTANCE_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Check Existance Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXISTANCE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link webControllerE.controllers.NLPClient <em>NLP Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NLP Client</em>'.
	 * @see webControllerE.controllers.NLPClient
	 * @generated
	 */
	EClass getNLPClient();

	/**
	 * Returns the meta object for the reference '{@link webControllerE.controllers.NLPClient#getTweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tweet</em>'.
	 * @see webControllerE.controllers.NLPClient#getTweet()
	 * @see #getNLPClient()
	 * @generated
	 */
	EReference getNLPClient_Tweet();

	/**
	 * Returns the meta object for the reference '{@link webControllerE.controllers.NLPClient#getResponsebuilder <em>Responsebuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsebuilder</em>'.
	 * @see webControllerE.controllers.NLPClient#getResponsebuilder()
	 * @see #getNLPClient()
	 * @generated
	 */
	EReference getNLPClient_Responsebuilder();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.NLPClient#classify(webControllerE.models.Tweet) <em>Classify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classify</em>' operation.
	 * @see webControllerE.controllers.NLPClient#classify(webControllerE.models.Tweet)
	 * @generated
	 */
	EOperation getNLPClient__Classify__Tweet();

	/**
	 * Returns the meta object for class '{@link webControllerE.controllers.ImageClassifierClient <em>Image Classifier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Classifier Client</em>'.
	 * @see webControllerE.controllers.ImageClassifierClient
	 * @generated
	 */
	EClass getImageClassifierClient();

	/**
	 * Returns the meta object for the reference '{@link webControllerE.controllers.ImageClassifierClient#getResponsebuilder <em>Responsebuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsebuilder</em>'.
	 * @see webControllerE.controllers.ImageClassifierClient#getResponsebuilder()
	 * @see #getImageClassifierClient()
	 * @generated
	 */
	EReference getImageClassifierClient_Responsebuilder();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.ImageClassifierClient#classify(webControllerE.models.Tweet) <em>Classify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classify</em>' operation.
	 * @see webControllerE.controllers.ImageClassifierClient#classify(webControllerE.models.Tweet)
	 * @generated
	 */
	EOperation getImageClassifierClient__Classify__Tweet();

	/**
	 * Returns the meta object for class '{@link webControllerE.controllers.WebController <em>Web Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Controller</em>'.
	 * @see webControllerE.controllers.WebController
	 * @generated
	 */
	EClass getWebController();

	/**
	 * Returns the meta object for the containment reference '{@link webControllerE.controllers.WebController#getClassifierclient <em>Classifierclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifierclient</em>'.
	 * @see webControllerE.controllers.WebController#getClassifierclient()
	 * @see #getWebController()
	 * @generated
	 */
	EReference getWebController_Classifierclient();

	/**
	 * Returns the meta object for the reference '{@link webControllerE.controllers.WebController#getAnalyticsclient <em>Analyticsclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analyticsclient</em>'.
	 * @see webControllerE.controllers.WebController#getAnalyticsclient()
	 * @see #getWebController()
	 * @generated
	 */
	EReference getWebController_Analyticsclient();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.WebController#classify(webControllerE.models.Tweet) <em>Classify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classify</em>' operation.
	 * @see webControllerE.controllers.WebController#classify(webControllerE.models.Tweet)
	 * @generated
	 */
	EOperation getWebController__Classify__Tweet();

	/**
	 * Returns the meta object for class '{@link webControllerE.controllers.AnalyticsClient <em>Analytics Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytics Client</em>'.
	 * @see webControllerE.controllers.AnalyticsClient
	 * @generated
	 */
	EClass getAnalyticsClient();

	/**
	 * Returns the meta object for the containment reference list '{@link webControllerE.controllers.AnalyticsClient#getCheckexistanceresponse <em>Checkexistanceresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checkexistanceresponse</em>'.
	 * @see webControllerE.controllers.AnalyticsClient#getCheckexistanceresponse()
	 * @see #getAnalyticsClient()
	 * @generated
	 */
	EReference getAnalyticsClient_Checkexistanceresponse();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.AnalyticsClient#checkImageExistance(webControllerE.models.Image) <em>Check Image Existance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Image Existance</em>' operation.
	 * @see webControllerE.controllers.AnalyticsClient#checkImageExistance(webControllerE.models.Image)
	 * @generated
	 */
	EOperation getAnalyticsClient__CheckImageExistance__Image();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.AnalyticsClient#checkTextExistance(java.lang.String) <em>Check Text Existance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Text Existance</em>' operation.
	 * @see webControllerE.controllers.AnalyticsClient#checkTextExistance(java.lang.String)
	 * @generated
	 */
	EOperation getAnalyticsClient__CheckTextExistance__String();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.AnalyticsClient#persisImage(webControllerE.models.Image, webControllerE.models.Response) <em>Persis Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Persis Image</em>' operation.
	 * @see webControllerE.controllers.AnalyticsClient#persisImage(webControllerE.models.Image, webControllerE.models.Response)
	 * @generated
	 */
	EOperation getAnalyticsClient__PersisImage__Image_Response();

	/**
	 * Returns the meta object for the '{@link webControllerE.controllers.AnalyticsClient#persisText(java.lang.String, webControllerE.models.Response) <em>Persis Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Persis Text</em>' operation.
	 * @see webControllerE.controllers.AnalyticsClient#persisText(java.lang.String, webControllerE.models.Response)
	 * @generated
	 */
	EOperation getAnalyticsClient__PersisText__String_Response();

	/**
	 * Returns the meta object for class '{@link webControllerE.controllers.CheckExistanceResponse <em>Check Existance Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Existance Response</em>'.
	 * @see webControllerE.controllers.CheckExistanceResponse
	 * @generated
	 */
	EClass getCheckExistanceResponse();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.controllers.CheckExistanceResponse#isExists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exists</em>'.
	 * @see webControllerE.controllers.CheckExistanceResponse#isExists()
	 * @see #getCheckExistanceResponse()
	 * @generated
	 */
	EAttribute getCheckExistanceResponse_Exists();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.controllers.CheckExistanceResponse#getClassificationResponse <em>Classification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Response</em>'.
	 * @see webControllerE.controllers.CheckExistanceResponse#getClassificationResponse()
	 * @see #getCheckExistanceResponse()
	 * @generated
	 */
	EAttribute getCheckExistanceResponse_ClassificationResponse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	controllersFactory getcontrollersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webControllerE.controllers.impl.NLPClientImpl <em>NLP Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.controllers.impl.NLPClientImpl
		 * @see webControllerE.controllers.impl.controllersPackageImpl#getNLPClient()
		 * @generated
		 */
		EClass NLP_CLIENT = eINSTANCE.getNLPClient();

		/**
		 * The meta object literal for the '<em><b>Tweet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NLP_CLIENT__TWEET = eINSTANCE.getNLPClient_Tweet();

		/**
		 * The meta object literal for the '<em><b>Responsebuilder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NLP_CLIENT__RESPONSEBUILDER = eINSTANCE.getNLPClient_Responsebuilder();

		/**
		 * The meta object literal for the '<em><b>Classify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NLP_CLIENT___CLASSIFY__TWEET = eINSTANCE.getNLPClient__Classify__Tweet();

		/**
		 * The meta object literal for the '{@link webControllerE.controllers.impl.ImageClassifierClientImpl <em>Image Classifier Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.controllers.impl.ImageClassifierClientImpl
		 * @see webControllerE.controllers.impl.controllersPackageImpl#getImageClassifierClient()
		 * @generated
		 */
		EClass IMAGE_CLASSIFIER_CLIENT = eINSTANCE.getImageClassifierClient();

		/**
		 * The meta object literal for the '<em><b>Responsebuilder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER = eINSTANCE.getImageClassifierClient_Responsebuilder();

		/**
		 * The meta object literal for the '<em><b>Classify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_CLASSIFIER_CLIENT___CLASSIFY__TWEET = eINSTANCE.getImageClassifierClient__Classify__Tweet();

		/**
		 * The meta object literal for the '{@link webControllerE.controllers.impl.WebControllerImpl <em>Web Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.controllers.impl.WebControllerImpl
		 * @see webControllerE.controllers.impl.controllersPackageImpl#getWebController()
		 * @generated
		 */
		EClass WEB_CONTROLLER = eINSTANCE.getWebController();

		/**
		 * The meta object literal for the '<em><b>Classifierclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_CONTROLLER__CLASSIFIERCLIENT = eINSTANCE.getWebController_Classifierclient();

		/**
		 * The meta object literal for the '<em><b>Analyticsclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_CONTROLLER__ANALYTICSCLIENT = eINSTANCE.getWebController_Analyticsclient();

		/**
		 * The meta object literal for the '<em><b>Classify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_CONTROLLER___CLASSIFY__TWEET = eINSTANCE.getWebController__Classify__Tweet();

		/**
		 * The meta object literal for the '{@link webControllerE.controllers.impl.AnalyticsClientImpl <em>Analytics Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.controllers.impl.AnalyticsClientImpl
		 * @see webControllerE.controllers.impl.controllersPackageImpl#getAnalyticsClient()
		 * @generated
		 */
		EClass ANALYTICS_CLIENT = eINSTANCE.getAnalyticsClient();

		/**
		 * The meta object literal for the '<em><b>Checkexistanceresponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE = eINSTANCE.getAnalyticsClient_Checkexistanceresponse();

		/**
		 * The meta object literal for the '<em><b>Check Image Existance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYTICS_CLIENT___CHECK_IMAGE_EXISTANCE__IMAGE = eINSTANCE
				.getAnalyticsClient__CheckImageExistance__Image();

		/**
		 * The meta object literal for the '<em><b>Check Text Existance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYTICS_CLIENT___CHECK_TEXT_EXISTANCE__STRING = eINSTANCE
				.getAnalyticsClient__CheckTextExistance__String();

		/**
		 * The meta object literal for the '<em><b>Persis Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYTICS_CLIENT___PERSIS_IMAGE__IMAGE_RESPONSE = eINSTANCE
				.getAnalyticsClient__PersisImage__Image_Response();

		/**
		 * The meta object literal for the '<em><b>Persis Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYTICS_CLIENT___PERSIS_TEXT__STRING_RESPONSE = eINSTANCE
				.getAnalyticsClient__PersisText__String_Response();

		/**
		 * The meta object literal for the '{@link webControllerE.controllers.impl.CheckExistanceResponseImpl <em>Check Existance Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.controllers.impl.CheckExistanceResponseImpl
		 * @see webControllerE.controllers.impl.controllersPackageImpl#getCheckExistanceResponse()
		 * @generated
		 */
		EClass CHECK_EXISTANCE_RESPONSE = eINSTANCE.getCheckExistanceResponse();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXISTANCE_RESPONSE__EXISTS = eINSTANCE.getCheckExistanceResponse_Exists();

		/**
		 * The meta object literal for the '<em><b>Classification Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE = eINSTANCE
				.getCheckExistanceResponse_ClassificationResponse();

	}

} //controllersPackage
