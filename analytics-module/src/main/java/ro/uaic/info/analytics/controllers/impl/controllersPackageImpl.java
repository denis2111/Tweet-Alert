/**
 */
package analytics.controllers.impl;

import analytics.controllers.controllersFactory;
import analytics.controllers.controllersPackage;

import analytics.dtos.dtosPackage;

import analytics.dtos.impl.dtosPackageImpl;

import analytics.exceptions.exceptionsPackage;

import analytics.exceptions.impl.exceptionsPackageImpl;

import analytics.models.impl.modelssPackageImpl;

import analytics.models.modelssPackage;

import analytics.repositories.impl.repositoriesPackageImpl;

import analytics.repositories.repositoriesPackage;

import analytics.security.impl.securityPackageImpl;

import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
	private EClass tweetsControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackControllerEClass = null;

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
	 * @see analytics.controllers.controllersPackage#eNS_URI
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
		modelssPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modelssPackage.eNS_URI);
		modelssPackageImpl themodelssPackage = (modelssPackageImpl) (registeredPackage instanceof modelssPackageImpl
				? registeredPackage
				: modelssPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(servicesPackage.eNS_URI);
		servicesPackageImpl theservicesPackage = (servicesPackageImpl) (registeredPackage instanceof servicesPackageImpl
				? registeredPackage
				: servicesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(securityPackage.eNS_URI);
		securityPackageImpl thesecurityPackage = (securityPackageImpl) (registeredPackage instanceof securityPackageImpl
				? registeredPackage
				: securityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(exceptionsPackage.eNS_URI);
		exceptionsPackageImpl theexceptionsPackage = (exceptionsPackageImpl) (registeredPackage instanceof exceptionsPackageImpl
				? registeredPackage
				: exceptionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(repositoriesPackage.eNS_URI);
		repositoriesPackageImpl therepositoriesPackage = (repositoriesPackageImpl) (registeredPackage instanceof repositoriesPackageImpl
				? registeredPackage
				: repositoriesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(dtosPackage.eNS_URI);
		dtosPackageImpl thedtosPackage = (dtosPackageImpl) (registeredPackage instanceof dtosPackageImpl
				? registeredPackage
				: dtosPackage.eINSTANCE);

		// Create package meta-data objects
		thecontrollersPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thedtosPackage.createPackageContents();

		// Initialize created meta-data
		thecontrollersPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();

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
	public EClass getTweetsController() {
		return tweetsControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetsController_Service() {
		return (EReference) tweetsControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetsController_Tweetdto() {
		return (EReference) tweetsControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__GetTweets() {
		return tweetsControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__GetTweet() {
		return tweetsControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__StoreTweet__TweetDto() {
		return tweetsControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__UpdateTweetBuId__TweetDto_String() {
		return tweetsControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackController() {
		return feedbackControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackController_Service() {
		return (EReference) feedbackControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackController__StoreFeedback() {
		return feedbackControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackController__GetFeedback__TweetDto() {
		return feedbackControllerEClass.getEOperations().get(1);
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
		tweetsControllerEClass = createEClass(TWEETS_CONTROLLER);
		createEReference(tweetsControllerEClass, TWEETS_CONTROLLER__SERVICE);
		createEReference(tweetsControllerEClass, TWEETS_CONTROLLER__TWEETDTO);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___GET_TWEETS);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___GET_TWEET);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___STORE_TWEET__TWEETDTO);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___UPDATE_TWEET_BU_ID__TWEETDTO_STRING);

		feedbackControllerEClass = createEClass(FEEDBACK_CONTROLLER);
		createEReference(feedbackControllerEClass, FEEDBACK_CONTROLLER__SERVICE);
		createEOperation(feedbackControllerEClass, FEEDBACK_CONTROLLER___STORE_FEEDBACK);
		createEOperation(feedbackControllerEClass, FEEDBACK_CONTROLLER___GET_FEEDBACK__TWEETDTO);
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
		servicesPackage theservicesPackage = (servicesPackage) EPackage.Registry.INSTANCE
				.getEPackage(servicesPackage.eNS_URI);
		dtosPackage thedtosPackage = (dtosPackage) EPackage.Registry.INSTANCE.getEPackage(dtosPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		exceptionsPackage theexceptionsPackage = (exceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(exceptionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tweetsControllerEClass, Object.class, "TweetsController", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetsController_Service(), theservicesPackage.getTweetsService(), null, "service", null, 1,
				1, TweetsController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweetsController_Tweetdto(), thedtosPackage.getTweetDto(), null, "tweetdto", null, 0, 1,
				TweetsController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTweetsController__GetTweets(), theXMLTypePackage.getString(), "getTweets", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theexceptionsPackage.getNotFoundException());

		op = initEOperation(getTweetsController__GetTweet(), thedtosPackage.getTweetDto(), "getTweet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEException(op, theexceptionsPackage.getNotFoundException());

		op = initEOperation(getTweetsController__StoreTweet__TweetDto(), theXMLTypePackage.getString(), "storeTweet", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thedtosPackage.getTweetDto(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsController__UpdateTweetBuId__TweetDto_String(), theXMLTypePackage.getString(),
				"updateTweetBuId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thedtosPackage.getTweetDto(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getID(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(feedbackControllerEClass, Object.class, "FeedbackController", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackController_Service(), theservicesPackage.getFeedbackService(), null, "service", null,
				1, 1, FeedbaclController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeedbackController__StoreFeedback(), ecorePackage.getEOperation(), "storeFeedback", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeedbackController__GetFeedback__TweetDto(), null, "getFeedback", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, thedtosPackage.getTweetDto(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //controllersPackageImpl
