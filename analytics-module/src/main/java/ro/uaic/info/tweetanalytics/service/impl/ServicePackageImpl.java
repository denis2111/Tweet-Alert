/**
 */
package service.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import service.FilteringRule;
import service.FilteringService;
import service.JpaRepository;
import service.LabelFilterRule;
import service.LocationFilterRule;
import service.PopularityFilterRule;
import service.ServiceFactory;
import service.ServicePackage;
import service.TweetsController;
import service.TweetsRepository;
import service.TweetsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
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
	private EClass tweetsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaRepositoryEClass = null;

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
	private EClass filteringServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationFilterRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelFilterRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popularityFilterRuleEClass = null;

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
	 * @see service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServicePackageImpl theServicePackage = registeredServicePackage instanceof ServicePackageImpl ? (ServicePackageImpl)registeredServicePackage : new ServicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theServicePackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
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
	public EReference getTweetsService_Tweetsrepository() {
		return (EReference)tweetsServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetsService_Filteringservice() {
		return (EReference)tweetsServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__ExtractTweetById__int() {
		return tweetsServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__ExtractAllTweets() {
		return tweetsServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__UpdateTweetById__int_EObject() {
		return tweetsServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__ExtractTweetsByLocation__String() {
		return tweetsServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__ExtractTweetsByLabel__String() {
		return tweetsServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsService__ExtractTweetsByPopilarity__int() {
		return tweetsServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetsRepository() {
		return tweetsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsRepository__FindById__int() {
		return tweetsRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsRepository__FindAll() {
		return tweetsRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsRepository__UpdateById__int_Object() {
		return tweetsRepositoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsRepository__Create__Object() {
		return tweetsRepositoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJpaRepository() {
		return jpaRepositoryEClass;
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
	public EReference getTweetsController_Tweetsservice() {
		return (EReference)tweetsControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__StoreTweet__EObject() {
		return tweetsControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__GetTweetById__int() {
		return tweetsControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetsController__GetTweets() {
		return tweetsControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringService() {
		return filteringServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteringService_Filteringrule() {
		return (EReference)filteringServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilteringService__Filter__EList() {
		return filteringServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringRule() {
		return filteringRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilteringRule__Filter__EObject() {
		return filteringRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationFilterRule() {
		return locationFilterRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationFilterRule__Filter__EList() {
		return locationFilterRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelFilterRule() {
		return labelFilterRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabelFilterRule__Filter__EList() {
		return labelFilterRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopularityFilterRule() {
		return popularityFilterRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopularityFilterRule__Filter__EList() {
		return popularityFilterRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tweetsServiceEClass = createEClass(TWEETS_SERVICE);
		createEReference(tweetsServiceEClass, TWEETS_SERVICE__TWEETSREPOSITORY);
		createEReference(tweetsServiceEClass, TWEETS_SERVICE__FILTERINGSERVICE);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___EXTRACT_TWEET_BY_ID__INT);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___EXTRACT_ALL_TWEETS);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___UPDATE_TWEET_BY_ID__INT_EOBJECT);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___EXTRACT_TWEETS_BY_LOCATION__STRING);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___EXTRACT_TWEETS_BY_LABEL__STRING);
		createEOperation(tweetsServiceEClass, TWEETS_SERVICE___EXTRACT_TWEETS_BY_POPILARITY__INT);

		tweetsRepositoryEClass = createEClass(TWEETS_REPOSITORY);
		createEOperation(tweetsRepositoryEClass, TWEETS_REPOSITORY___FIND_BY_ID__INT);
		createEOperation(tweetsRepositoryEClass, TWEETS_REPOSITORY___FIND_ALL);
		createEOperation(tweetsRepositoryEClass, TWEETS_REPOSITORY___UPDATE_BY_ID__INT_OBJECT);
		createEOperation(tweetsRepositoryEClass, TWEETS_REPOSITORY___CREATE__OBJECT);

		jpaRepositoryEClass = createEClass(JPA_REPOSITORY);

		tweetsControllerEClass = createEClass(TWEETS_CONTROLLER);
		createEReference(tweetsControllerEClass, TWEETS_CONTROLLER__TWEETSSERVICE);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___STORE_TWEET__EOBJECT);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___GET_TWEET_BY_ID__INT);
		createEOperation(tweetsControllerEClass, TWEETS_CONTROLLER___GET_TWEETS);

		filteringServiceEClass = createEClass(FILTERING_SERVICE);
		createEReference(filteringServiceEClass, FILTERING_SERVICE__FILTERINGRULE);
		createEOperation(filteringServiceEClass, FILTERING_SERVICE___FILTER__ELIST);

		filteringRuleEClass = createEClass(FILTERING_RULE);
		createEOperation(filteringRuleEClass, FILTERING_RULE___FILTER__EOBJECT);

		locationFilterRuleEClass = createEClass(LOCATION_FILTER_RULE);
		createEOperation(locationFilterRuleEClass, LOCATION_FILTER_RULE___FILTER__ELIST);

		labelFilterRuleEClass = createEClass(LABEL_FILTER_RULE);
		createEOperation(labelFilterRuleEClass, LABEL_FILTER_RULE___FILTER__ELIST);

		popularityFilterRuleEClass = createEClass(POPULARITY_FILTER_RULE);
		createEOperation(popularityFilterRuleEClass, POPULARITY_FILTER_RULE___FILTER__ELIST);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tweetsRepositoryEClass.getESuperTypes().add(this.getJpaRepository());
		locationFilterRuleEClass.getESuperTypes().add(this.getFilteringRule());
		labelFilterRuleEClass.getESuperTypes().add(this.getFilteringRule());
		popularityFilterRuleEClass.getESuperTypes().add(this.getFilteringRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(tweetsServiceEClass, TweetsService.class, "TweetsService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetsService_Tweetsrepository(), this.getTweetsRepository(), null, "tweetsrepository", null, 1, 1, TweetsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweetsService_Filteringservice(), this.getFilteringService(), null, "filteringservice", null, 1, 1, TweetsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTweetsService__ExtractTweetById__int(), ecorePackage.getEJavaObject(), "extractTweetById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsService__ExtractAllTweets(), null, "extractAllTweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTweetsService__UpdateTweetById__int_EObject(), null, "updateTweetById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsService__ExtractTweetsByLocation__String(), null, "extractTweetsByLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTweetsService__ExtractTweetsByLabel__String(), null, "extractTweetsByLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTweetsService__ExtractTweetsByPopilarity__int(), null, "extractTweetsByPopilarity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "minFeedbackEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tweetsRepositoryEClass, TweetsRepository.class, "TweetsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTweetsRepository__FindById__int(), ecorePackage.getEJavaObject(), "findById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "Id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsRepository__FindAll(), null, "findAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTweetsRepository__UpdateById__int_Object(), null, "updateById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "Id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsRepository__Create__Object(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jpaRepositoryEClass, JpaRepository.class, "JpaRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tweetsControllerEClass, TweetsController.class, "TweetsController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetsController_Tweetsservice(), this.getTweetsService(), null, "tweetsservice", null, 1, 1, TweetsController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTweetsController__StoreTweet__EObject(), null, "storeTweet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsController__GetTweetById__int(), ecorePackage.getEObject(), "getTweetById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetsController__GetTweets(), null, "getTweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(filteringServiceEClass, FilteringService.class, "FilteringService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilteringService_Filteringrule(), this.getFilteringRule(), null, "filteringrule", null, 0, -1, FilteringService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFilteringService__Filter__EList(), null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "objects", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(filteringRuleEClass, FilteringRule.class, "FilteringRule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFilteringRule__Filter__EObject(), null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "objects", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(locationFilterRuleEClass, LocationFilterRule.class, "LocationFilterRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLocationFilterRule__Filter__EList(), null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "tweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(labelFilterRuleEClass, LabelFilterRule.class, "LabelFilterRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLabelFilterRule__Filter__EList(), null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "tweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(popularityFilterRuleEClass, PopularityFilterRule.class, "PopularityFilterRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPopularityFilterRule__Filter__EList(), null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "tweets", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicePackageImpl
