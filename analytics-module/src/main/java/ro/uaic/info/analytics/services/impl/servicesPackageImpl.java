/**
 */
package analytics.services.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

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

import analytics.services.FeedbackService;
import analytics.services.servicesFactory;
import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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
public class servicesPackageImpl extends EPackageImpl implements servicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetsServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersServiceEClass = null;

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
	 * @see analytics.services.servicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private servicesPackageImpl() {
		super(eNS_URI, servicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link servicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static servicesPackage init() {
		if (isInited)
			return (servicesPackage) EPackage.Registry.INSTANCE.getEPackage(servicesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredservicesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		servicesPackageImpl theservicesPackage = registeredservicesPackage instanceof servicesPackageImpl
				? (servicesPackageImpl) registeredservicesPackage
				: new servicesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		modelssPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modelssPackage.eNS_URI);
		modelssPackageImpl themodelssPackage = (modelssPackageImpl) (registeredPackage instanceof modelssPackageImpl
				? registeredPackage
				: modelssPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);
		controllersPackageImpl thecontrollersPackage = (controllersPackageImpl) (registeredPackage instanceof controllersPackageImpl
				? registeredPackage
				: controllersPackage.eINSTANCE);

		// Create package meta-data objects
		theservicesPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thedtosPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		theservicesPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theservicesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(servicesPackage.eNS_URI, theservicesPackage);
		return theservicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetsService() {
		return tweetsServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetsService_Repository() {
		return (EReference) tweetsServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetsService_Tweet() {
		return (EReference) tweetsServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__GetTweets() {
		return tweetsServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__StoreTweet__Tweet() {
		return tweetsServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__GetTweeet() {
		return tweetsServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__UpdateTweetBuId__Tweet_String() {
		return tweetsServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackService() {
		return feedbackServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackService_Feedbackrepository() {
		return (EReference) feedbackServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackService_Feedback() {
		return (EReference) feedbackServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackService__StoreFeedback() {
		return feedbackServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackService__GetFeedback__TweetDto() {
		return feedbackServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsersService() {
		return usersServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsersService_Repository() {
		return (EReference) usersServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsersService_User() {
		return (EReference) usersServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsersService__FindByUsername() {
		return usersServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public servicesFactory getservicesFactory() {
		return (servicesFactory) getEFactoryInstance();
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
		tweetsServiceEClass = createEClass(TWEETS_SERVICE);
		createEReference(tweetsServiceEClass, TWEETS_SERVICE__REPOSITORY);
		createEReference(tweetsServiceEClass, TWEETS_SERVICE__TWEET);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___GET_TWEETS);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___STORE_TWEET__TWEET);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___GET_TWEEET);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___UPDATE_TWEET_BU_ID__TWEET_STRING);

		feedbackServiceEClass = createEClass(FEEDBACK_SERVICE);
		createEReference(feedbackServiceEClass, FEEDBACK_SERVICE__FEEDBACKREPOSITORY);
		createEReference(feedbackServiceEClass, FEEDBACK_SERVICE__FEEDBACK);
		createEOperation(feedbackServiceEClass, FEEDBACK_SERVICE___STORE_FEEDBACK);
		createEOperation(feedbackServiceEClass, FEEDBACK_SERVICE___GET_FEEDBACK__TWEETDTO);

		usersServiceEClass = createEClass(USERS_SERVICE);
		createEReference(usersServiceEClass, USERS_SERVICE__REPOSITORY);
		createEReference(usersServiceEClass, USERS_SERVICE__USER);
		createEOperation(usersServiceEClass, USERS_SERVICE___FIND_BY_USERNAME);
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
		repositoriesPackage therepositoriesPackage = (repositoriesPackage) EPackage.Registry.INSTANCE
				.getEPackage(repositoriesPackage.eNS_URI);
		modelssPackage themodelssPackage = (modelssPackage) EPackage.Registry.INSTANCE
				.getEPackage(modelssPackage.eNS_URI);
		exceptionsPackage theexceptionsPackage = (exceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(exceptionsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		dtosPackage thedtosPackage = (dtosPackage) EPackage.Registry.INSTANCE.getEPackage(dtosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tweetsServiceEClass, Object.class, "TweetsService", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetsService_Repository(), therepositoriesPackage.getTweetsRepository(), null, "repository",
				null, 1, 1, Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweetsService_Tweet(), themodelssPackage.getTweet(), null, "tweet", null, 0, 1, Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTweetsService__GetTweets(), null, "getTweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theexceptionsPackage.getNotFoundException());
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTweetsService__StoreTweet__Tweet(), null, "storeTweet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelssPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsService__GetTweeet(), themodelssPackage.getTweet(), "getTweeet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEException(op, theexceptionsPackage.getNotFoundException());

		op = initEOperation(getTweetsService__UpdateTweetBuId__Tweet_String(), null, "updateTweetBuId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, themodelssPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getID(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(feedbackServiceEClass, FeedbackService.class, "FeedbackService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackService_Feedbackrepository(), therepositoriesPackage.getFeedbackRepository(), null,
				"feedbackrepository", null, 1, 1, FeedbackService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackService_Feedback(), themodelssPackage.getFeedback(), null, "feedback", null, 0, 1,
				FeedbackService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeedbackService__StoreFeedback(), ecorePackage.getEOperation(), "storeFeedback", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeedbackService__GetFeedback__TweetDto(), null, "getFeedback", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, thedtosPackage.getTweetDto(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(usersServiceEClass, Object.class, "UsersService", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsersService_Repository(), therepositoriesPackage.getUsersRepository(), null, "repository",
				null, 1, 1, Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsersService_User(), themodelssPackage.getUser(), null, "user", null, 0, 1, Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUsersService__FindByUsername(), theXMLTypePackage.getAnySimpleType(), "findByUsername",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theexceptionsPackage.getNotFoundException());

		// Create resource
		createResource(eNS_URI);
	}

} //servicesPackageImpl
