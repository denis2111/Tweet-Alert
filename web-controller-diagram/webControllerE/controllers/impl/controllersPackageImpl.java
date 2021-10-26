/**
 */
package webControllerE.controllers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import webControllerE.WebControllerEPackage;

import webControllerE.controllers.AnalyticsClient;
import webControllerE.controllers.CheckExistanceResponse;
import webControllerE.controllers.ImageClassifierClient;
import webControllerE.controllers.NLPClient;
import webControllerE.controllers.WebController;
import webControllerE.controllers.controllersFactory;
import webControllerE.controllers.controllersPackage;

import webControllerE.impl.WebControllerEPackageImpl;

import webControllerE.models.impl.modelsPackageImpl;

import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class controllersPackageImpl extends EPackageImpl implements controllersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlpClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageClassifierClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyticsClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkExistanceResponseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see webControllerE.controllers.controllersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private controllersPackageImpl() {
		super(eNS_URI, controllersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link controllersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static controllersPackage init() {
		if (isInited)
			return (controllersPackage) EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredcontrollersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		controllersPackageImpl thecontrollersPackage = registeredcontrollersPackage instanceof controllersPackageImpl
				? (controllersPackageImpl) registeredcontrollersPackage
				: new controllersPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		controllersPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WebControllerEPackage.eNS_URI);
		WebControllerEPackageImpl theWebControllerEPackage = (WebControllerEPackageImpl) (registeredPackage instanceof WebControllerEPackageImpl
				? registeredPackage
				: WebControllerEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modelsPackage.eNS_URI);
		modelsPackageImpl themodelsPackage = (modelsPackageImpl) (registeredPackage instanceof modelsPackageImpl
				? registeredPackage
				: modelsPackage.eINSTANCE);

		// Create package meta-data objects
		thecontrollersPackage.createPackageContents();
		theWebControllerEPackage.createPackageContents();
		themodelsPackage.createPackageContents();

		// Initialize created meta-data
		thecontrollersPackage.initializePackageContents();
		theWebControllerEPackage.initializePackageContents();
		themodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecontrollersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(controllersPackage.eNS_URI, thecontrollersPackage);
		return thecontrollersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNLPClient() {
		return nlpClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNLPClient_Tweet() {
		return (EReference) nlpClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNLPClient_Responsebuilder() {
		return (EReference) nlpClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNLPClient__Classify__Tweet() {
		return nlpClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageClassifierClient() {
		return imageClassifierClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageClassifierClient_Responsebuilder() {
		return (EReference) imageClassifierClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageClassifierClient__Classify__Tweet() {
		return imageClassifierClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebController() {
		return webControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebController_Classifierclient() {
		return (EReference) webControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebController_Analyticsclient() {
		return (EReference) webControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWebController__Classify__Tweet() {
		return webControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyticsClient() {
		return analyticsClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyticsClient_Checkexistanceresponse() {
		return (EReference) analyticsClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalyticsClient__CheckImageExistance__Image() {
		return analyticsClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalyticsClient__CheckTextExistance__String() {
		return analyticsClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalyticsClient__PersisImage__Image_Response() {
		return analyticsClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalyticsClient__PersisText__String_Response() {
		return analyticsClientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckExistanceResponse() {
		return checkExistanceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckExistanceResponse_Exists() {
		return (EAttribute) checkExistanceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckExistanceResponse_ClassificationResponse() {
		return (EAttribute) checkExistanceResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public controllersFactory getcontrollersFactory() {
		return (controllersFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		nlpClientEClass = createEClass(NLP_CLIENT);
		createEReference(nlpClientEClass, NLP_CLIENT__TWEET);
		createEReference(nlpClientEClass, NLP_CLIENT__RESPONSEBUILDER);
		createEOperation(nlpClientEClass, NLP_CLIENT___CLASSIFY__TWEET);

		imageClassifierClientEClass = createEClass(IMAGE_CLASSIFIER_CLIENT);
		createEReference(imageClassifierClientEClass, IMAGE_CLASSIFIER_CLIENT__RESPONSEBUILDER);
		createEOperation(imageClassifierClientEClass, IMAGE_CLASSIFIER_CLIENT___CLASSIFY__TWEET);

		webControllerEClass = createEClass(WEB_CONTROLLER);
		createEReference(webControllerEClass, WEB_CONTROLLER__CLASSIFIERCLIENT);
		createEReference(webControllerEClass, WEB_CONTROLLER__ANALYTICSCLIENT);
		createEOperation(webControllerEClass, WEB_CONTROLLER___CLASSIFY__TWEET);

		analyticsClientEClass = createEClass(ANALYTICS_CLIENT);
		createEReference(analyticsClientEClass, ANALYTICS_CLIENT__CHECKEXISTANCERESPONSE);
		createEOperation(analyticsClientEClass, ANALYTICS_CLIENT___CHECK_IMAGE_EXISTANCE__IMAGE);
		createEOperation(analyticsClientEClass, ANALYTICS_CLIENT___CHECK_TEXT_EXISTANCE__STRING);
		createEOperation(analyticsClientEClass, ANALYTICS_CLIENT___PERSIS_IMAGE__IMAGE_RESPONSE);
		createEOperation(analyticsClientEClass, ANALYTICS_CLIENT___PERSIS_TEXT__STRING_RESPONSE);

		checkExistanceResponseEClass = createEClass(CHECK_EXISTANCE_RESPONSE);
		createEAttribute(checkExistanceResponseEClass, CHECK_EXISTANCE_RESPONSE__EXISTS);
		createEAttribute(checkExistanceResponseEClass, CHECK_EXISTANCE_RESPONSE__CLASSIFICATION_RESPONSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		modelsPackage themodelsPackage = (modelsPackage) EPackage.Registry.INSTANCE.getEPackage(modelsPackage.eNS_URI);
		WebControllerEPackage theWebControllerEPackage = (WebControllerEPackage) EPackage.Registry.INSTANCE
				.getEPackage(WebControllerEPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nlpClientEClass, NLPClient.class, "NLPClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNLPClient_Tweet(), themodelsPackage.getTweet(), null, "tweet", null, 1, 1, NLPClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNLPClient_Responsebuilder(), themodelsPackage.getResponseBuilder(), null, "responsebuilder",
				null, 0, 1, NLPClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNLPClient__Classify__Tweet(), themodelsPackage.getClassificationResponse(),
				"classify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageClassifierClientEClass, ImageClassifierClient.class, "ImageClassifierClient", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageClassifierClient_Responsebuilder(), themodelsPackage.getResponseBuilder(), null,
				"responsebuilder", null, 0, 1, ImageClassifierClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getImageClassifierClient__Classify__Tweet(), themodelsPackage.getClassificationResponse(),
				"classify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webControllerEClass, WebController.class, "WebController", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebController_Classifierclient(), theWebControllerEPackage.getClassifierClient(), null,
				"classifierclient", null, 1, 1, WebController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebController_Analyticsclient(), this.getAnalyticsClient(), null, "analyticsclient", null, 0,
				1, WebController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getWebController__Classify__Tweet(), themodelsPackage.getClassificationResponse(),
				"classify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analyticsClientEClass, AnalyticsClient.class, "AnalyticsClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyticsClient_Checkexistanceresponse(), this.getCheckExistanceResponse(), null,
				"checkexistanceresponse", null, 0, -1, AnalyticsClient.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalyticsClient__CheckImageExistance__Image(), this.getCheckExistanceResponse(),
				"checkImageExistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getImage(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalyticsClient__CheckTextExistance__String(), this.getCheckExistanceResponse(),
				"checkTextExistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalyticsClient__PersisImage__Image_Response(), null, "persisImage", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, themodelsPackage.getImage(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getResponse(), "response", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalyticsClient__PersisText__String_Response(), null, "persisText", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getResponse(), "response", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(checkExistanceResponseEClass, CheckExistanceResponse.class, "CheckExistanceResponse", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckExistanceResponse_Exists(), theXMLTypePackage.getBoolean(), "exists", null, 0, 1,
				CheckExistanceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExistanceResponse_ClassificationResponse(), theXMLTypePackage.getAnySimpleType(),
				"classificationResponse", null, 0, 1, CheckExistanceResponse.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //controllersPackageImpl
