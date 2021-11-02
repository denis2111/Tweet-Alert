/**
 */
package service;

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
 * @see service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/analytics/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.analytics.service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link service.impl.TweetsServiceImpl <em>Tweets Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.TweetsServiceImpl
	 * @see service.impl.ServicePackageImpl#getTweetsService()
	 * @generated
	 */
	int TWEETS_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Tweetsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE__TWEETSREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Filteringservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE__FILTERINGSERVICE = 1;

	/**
	 * The number of structural features of the '<em>Tweets Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Extract Tweet By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___EXTRACT_TWEET_BY_ID__INT = 0;

	/**
	 * The operation id for the '<em>Extract All Tweets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___EXTRACT_ALL_TWEETS = 1;

	/**
	 * The operation id for the '<em>Update Tweet By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___UPDATE_TWEET_BY_ID__INT_EOBJECT = 2;

	/**
	 * The operation id for the '<em>Extract Tweets By Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___EXTRACT_TWEETS_BY_LOCATION__STRING = 3;

	/**
	 * The operation id for the '<em>Extract Tweets By Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___EXTRACT_TWEETS_BY_LABEL__STRING = 4;

	/**
	 * The operation id for the '<em>Extract Tweets By Popilarity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___EXTRACT_TWEETS_BY_POPILARITY__INT = 5;

	/**
	 * The number of operations of the '<em>Tweets Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link service.impl.JpaRepositoryImpl <em>Jpa Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.JpaRepositoryImpl
	 * @see service.impl.ServicePackageImpl#getJpaRepository()
	 * @generated
	 */
	int JPA_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Jpa Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Jpa Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link service.impl.TweetsRepositoryImpl <em>Tweets Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.TweetsRepositoryImpl
	 * @see service.impl.ServicePackageImpl#getTweetsRepository()
	 * @generated
	 */
	int TWEETS_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Tweets Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY_FEATURE_COUNT = JPA_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY___FIND_BY_ID__INT = JPA_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY___FIND_ALL = JPA_REPOSITORY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY___UPDATE_BY_ID__INT_OBJECT = JPA_REPOSITORY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY___CREATE__OBJECT = JPA_REPOSITORY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tweets Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY_OPERATION_COUNT = JPA_REPOSITORY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link service.impl.TweetsControllerImpl <em>Tweets Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.TweetsControllerImpl
	 * @see service.impl.ServicePackageImpl#getTweetsController()
	 * @generated
	 */
	int TWEETS_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Tweetsservice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER__TWEETSSERVICE = 0;

	/**
	 * The number of structural features of the '<em>Tweets Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Store Tweet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___STORE_TWEET__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Get Tweet By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___GET_TWEET_BY_ID__INT = 1;

	/**
	 * The operation id for the '<em>Get Tweets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___GET_TWEETS = 2;

	/**
	 * The number of operations of the '<em>Tweets Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link service.impl.FilteringServiceImpl <em>Filtering Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.FilteringServiceImpl
	 * @see service.impl.ServicePackageImpl#getFilteringService()
	 * @generated
	 */
	int FILTERING_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Filteringrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_SERVICE__FILTERINGRULE = 0;

	/**
	 * The number of structural features of the '<em>Filtering Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_SERVICE___FILTER__ELIST = 0;

	/**
	 * The number of operations of the '<em>Filtering Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link service.FilteringRule <em>Filtering Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.FilteringRule
	 * @see service.impl.ServicePackageImpl#getFilteringRule()
	 * @generated
	 */
	int FILTERING_RULE = 5;

	/**
	 * The number of structural features of the '<em>Filtering Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RULE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RULE___FILTER__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Filtering Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_RULE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link service.impl.LocationFilterRuleImpl <em>Location Filter Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.LocationFilterRuleImpl
	 * @see service.impl.ServicePackageImpl#getLocationFilterRule()
	 * @generated
	 */
	int LOCATION_FILTER_RULE = 6;

	/**
	 * The number of structural features of the '<em>Location Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FILTER_RULE_FEATURE_COUNT = FILTERING_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FILTER_RULE___FILTER__EOBJECT = FILTERING_RULE___FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FILTER_RULE___FILTER__ELIST = FILTERING_RULE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FILTER_RULE_OPERATION_COUNT = FILTERING_RULE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link service.impl.LabelFilterRuleImpl <em>Label Filter Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.LabelFilterRuleImpl
	 * @see service.impl.ServicePackageImpl#getLabelFilterRule()
	 * @generated
	 */
	int LABEL_FILTER_RULE = 7;

	/**
	 * The number of structural features of the '<em>Label Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FILTER_RULE_FEATURE_COUNT = FILTERING_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FILTER_RULE___FILTER__EOBJECT = FILTERING_RULE___FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FILTER_RULE___FILTER__ELIST = FILTERING_RULE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FILTER_RULE_OPERATION_COUNT = FILTERING_RULE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link service.impl.PopularityFilterRuleImpl <em>Popularity Filter Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see service.impl.PopularityFilterRuleImpl
	 * @see service.impl.ServicePackageImpl#getPopularityFilterRule()
	 * @generated
	 */
	int POPULARITY_FILTER_RULE = 8;

	/**
	 * The number of structural features of the '<em>Popularity Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULARITY_FILTER_RULE_FEATURE_COUNT = FILTERING_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULARITY_FILTER_RULE___FILTER__EOBJECT = FILTERING_RULE___FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULARITY_FILTER_RULE___FILTER__ELIST = FILTERING_RULE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Popularity Filter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULARITY_FILTER_RULE_OPERATION_COUNT = FILTERING_RULE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link service.TweetsService <em>Tweets Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Service</em>'.
	 * @see service.TweetsService
	 * @generated
	 */
	EClass getTweetsService();

	/**
	 * Returns the meta object for the containment reference '{@link service.TweetsService#getTweetsrepository <em>Tweetsrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tweetsrepository</em>'.
	 * @see service.TweetsService#getTweetsrepository()
	 * @see #getTweetsService()
	 * @generated
	 */
	EReference getTweetsService_Tweetsrepository();

	/**
	 * Returns the meta object for the reference '{@link service.TweetsService#getFilteringservice <em>Filteringservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filteringservice</em>'.
	 * @see service.TweetsService#getFilteringservice()
	 * @see #getTweetsService()
	 * @generated
	 */
	EReference getTweetsService_Filteringservice();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#extractTweetById(int) <em>Extract Tweet By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Tweet By Id</em>' operation.
	 * @see service.TweetsService#extractTweetById(int)
	 * @generated
	 */
	EOperation getTweetsService__ExtractTweetById__int();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#extractAllTweets() <em>Extract All Tweets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract All Tweets</em>' operation.
	 * @see service.TweetsService#extractAllTweets()
	 * @generated
	 */
	EOperation getTweetsService__ExtractAllTweets();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#updateTweetById(int, org.eclipse.emf.ecore.EObject) <em>Update Tweet By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Tweet By Id</em>' operation.
	 * @see service.TweetsService#updateTweetById(int, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTweetsService__UpdateTweetById__int_EObject();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#extractTweetsByLocation(java.lang.String) <em>Extract Tweets By Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Tweets By Location</em>' operation.
	 * @see service.TweetsService#extractTweetsByLocation(java.lang.String)
	 * @generated
	 */
	EOperation getTweetsService__ExtractTweetsByLocation__String();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#extractTweetsByLabel(java.lang.String) <em>Extract Tweets By Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Tweets By Label</em>' operation.
	 * @see service.TweetsService#extractTweetsByLabel(java.lang.String)
	 * @generated
	 */
	EOperation getTweetsService__ExtractTweetsByLabel__String();

	/**
	 * Returns the meta object for the '{@link service.TweetsService#extractTweetsByPopilarity(int) <em>Extract Tweets By Popilarity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Tweets By Popilarity</em>' operation.
	 * @see service.TweetsService#extractTweetsByPopilarity(int)
	 * @generated
	 */
	EOperation getTweetsService__ExtractTweetsByPopilarity__int();

	/**
	 * Returns the meta object for class '{@link service.TweetsRepository <em>Tweets Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Repository</em>'.
	 * @see service.TweetsRepository
	 * @generated
	 */
	EClass getTweetsRepository();

	/**
	 * Returns the meta object for the '{@link service.TweetsRepository#findById(int) <em>Find By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find By Id</em>' operation.
	 * @see service.TweetsRepository#findById(int)
	 * @generated
	 */
	EOperation getTweetsRepository__FindById__int();

	/**
	 * Returns the meta object for the '{@link service.TweetsRepository#findAll() <em>Find All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find All</em>' operation.
	 * @see service.TweetsRepository#findAll()
	 * @generated
	 */
	EOperation getTweetsRepository__FindAll();

	/**
	 * Returns the meta object for the '{@link service.TweetsRepository#updateById(int, java.lang.Object) <em>Update By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update By Id</em>' operation.
	 * @see service.TweetsRepository#updateById(int, java.lang.Object)
	 * @generated
	 */
	EOperation getTweetsRepository__UpdateById__int_Object();

	/**
	 * Returns the meta object for the '{@link service.TweetsRepository#create(java.lang.Object) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see service.TweetsRepository#create(java.lang.Object)
	 * @generated
	 */
	EOperation getTweetsRepository__Create__Object();

	/**
	 * Returns the meta object for class '{@link service.JpaRepository <em>Jpa Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jpa Repository</em>'.
	 * @see service.JpaRepository
	 * @generated
	 */
	EClass getJpaRepository();

	/**
	 * Returns the meta object for class '{@link service.TweetsController <em>Tweets Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Controller</em>'.
	 * @see service.TweetsController
	 * @generated
	 */
	EClass getTweetsController();

	/**
	 * Returns the meta object for the containment reference '{@link service.TweetsController#getTweetsservice <em>Tweetsservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tweetsservice</em>'.
	 * @see service.TweetsController#getTweetsservice()
	 * @see #getTweetsController()
	 * @generated
	 */
	EReference getTweetsController_Tweetsservice();

	/**
	 * Returns the meta object for the '{@link service.TweetsController#storeTweet(org.eclipse.emf.ecore.EObject) <em>Store Tweet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Tweet</em>' operation.
	 * @see service.TweetsController#storeTweet(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTweetsController__StoreTweet__EObject();

	/**
	 * Returns the meta object for the '{@link service.TweetsController#getTweetById(int) <em>Get Tweet By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweet By Id</em>' operation.
	 * @see service.TweetsController#getTweetById(int)
	 * @generated
	 */
	EOperation getTweetsController__GetTweetById__int();

	/**
	 * Returns the meta object for the '{@link service.TweetsController#getTweets() <em>Get Tweets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweets</em>' operation.
	 * @see service.TweetsController#getTweets()
	 * @generated
	 */
	EOperation getTweetsController__GetTweets();

	/**
	 * Returns the meta object for class '{@link service.FilteringService <em>Filtering Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Service</em>'.
	 * @see service.FilteringService
	 * @generated
	 */
	EClass getFilteringService();

	/**
	 * Returns the meta object for the containment reference list '{@link service.FilteringService#getFilteringrule <em>Filteringrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filteringrule</em>'.
	 * @see service.FilteringService#getFilteringrule()
	 * @see #getFilteringService()
	 * @generated
	 */
	EReference getFilteringService_Filteringrule();

	/**
	 * Returns the meta object for the '{@link service.FilteringService#filter(org.eclipse.emf.common.util.EList) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see service.FilteringService#filter(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFilteringService__Filter__EList();

	/**
	 * Returns the meta object for class '{@link service.FilteringRule <em>Filtering Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Rule</em>'.
	 * @see service.FilteringRule
	 * @generated
	 */
	EClass getFilteringRule();

	/**
	 * Returns the meta object for the '{@link service.FilteringRule#filter(org.eclipse.emf.ecore.EObject) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see service.FilteringRule#filter(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFilteringRule__Filter__EObject();

	/**
	 * Returns the meta object for class '{@link service.LocationFilterRule <em>Location Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Filter Rule</em>'.
	 * @see service.LocationFilterRule
	 * @generated
	 */
	EClass getLocationFilterRule();

	/**
	 * Returns the meta object for the '{@link service.LocationFilterRule#filter(org.eclipse.emf.common.util.EList) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see service.LocationFilterRule#filter(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLocationFilterRule__Filter__EList();

	/**
	 * Returns the meta object for class '{@link service.LabelFilterRule <em>Label Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Filter Rule</em>'.
	 * @see service.LabelFilterRule
	 * @generated
	 */
	EClass getLabelFilterRule();

	/**
	 * Returns the meta object for the '{@link service.LabelFilterRule#filter(org.eclipse.emf.common.util.EList) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see service.LabelFilterRule#filter(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLabelFilterRule__Filter__EList();

	/**
	 * Returns the meta object for class '{@link service.PopularityFilterRule <em>Popularity Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popularity Filter Rule</em>'.
	 * @see service.PopularityFilterRule
	 * @generated
	 */
	EClass getPopularityFilterRule();

	/**
	 * Returns the meta object for the '{@link service.PopularityFilterRule#filter(org.eclipse.emf.common.util.EList) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see service.PopularityFilterRule#filter(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPopularityFilterRule__Filter__EList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link service.impl.TweetsServiceImpl <em>Tweets Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.TweetsServiceImpl
		 * @see service.impl.ServicePackageImpl#getTweetsService()
		 * @generated
		 */
		EClass TWEETS_SERVICE = eINSTANCE.getTweetsService();

		/**
		 * The meta object literal for the '<em><b>Tweetsrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_SERVICE__TWEETSREPOSITORY = eINSTANCE.getTweetsService_Tweetsrepository();

		/**
		 * The meta object literal for the '<em><b>Filteringservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_SERVICE__FILTERINGSERVICE = eINSTANCE.getTweetsService_Filteringservice();

		/**
		 * The meta object literal for the '<em><b>Extract Tweet By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___EXTRACT_TWEET_BY_ID__INT = eINSTANCE.getTweetsService__ExtractTweetById__int();

		/**
		 * The meta object literal for the '<em><b>Extract All Tweets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___EXTRACT_ALL_TWEETS = eINSTANCE.getTweetsService__ExtractAllTweets();

		/**
		 * The meta object literal for the '<em><b>Update Tweet By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___UPDATE_TWEET_BY_ID__INT_EOBJECT = eINSTANCE.getTweetsService__UpdateTweetById__int_EObject();

		/**
		 * The meta object literal for the '<em><b>Extract Tweets By Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___EXTRACT_TWEETS_BY_LOCATION__STRING = eINSTANCE.getTweetsService__ExtractTweetsByLocation__String();

		/**
		 * The meta object literal for the '<em><b>Extract Tweets By Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___EXTRACT_TWEETS_BY_LABEL__STRING = eINSTANCE.getTweetsService__ExtractTweetsByLabel__String();

		/**
		 * The meta object literal for the '<em><b>Extract Tweets By Popilarity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___EXTRACT_TWEETS_BY_POPILARITY__INT = eINSTANCE.getTweetsService__ExtractTweetsByPopilarity__int();

		/**
		 * The meta object literal for the '{@link service.impl.TweetsRepositoryImpl <em>Tweets Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.TweetsRepositoryImpl
		 * @see service.impl.ServicePackageImpl#getTweetsRepository()
		 * @generated
		 */
		EClass TWEETS_REPOSITORY = eINSTANCE.getTweetsRepository();

		/**
		 * The meta object literal for the '<em><b>Find By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_REPOSITORY___FIND_BY_ID__INT = eINSTANCE.getTweetsRepository__FindById__int();

		/**
		 * The meta object literal for the '<em><b>Find All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_REPOSITORY___FIND_ALL = eINSTANCE.getTweetsRepository__FindAll();

		/**
		 * The meta object literal for the '<em><b>Update By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_REPOSITORY___UPDATE_BY_ID__INT_OBJECT = eINSTANCE.getTweetsRepository__UpdateById__int_Object();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_REPOSITORY___CREATE__OBJECT = eINSTANCE.getTweetsRepository__Create__Object();

		/**
		 * The meta object literal for the '{@link service.impl.JpaRepositoryImpl <em>Jpa Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.JpaRepositoryImpl
		 * @see service.impl.ServicePackageImpl#getJpaRepository()
		 * @generated
		 */
		EClass JPA_REPOSITORY = eINSTANCE.getJpaRepository();

		/**
		 * The meta object literal for the '{@link service.impl.TweetsControllerImpl <em>Tweets Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.TweetsControllerImpl
		 * @see service.impl.ServicePackageImpl#getTweetsController()
		 * @generated
		 */
		EClass TWEETS_CONTROLLER = eINSTANCE.getTweetsController();

		/**
		 * The meta object literal for the '<em><b>Tweetsservice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_CONTROLLER__TWEETSSERVICE = eINSTANCE.getTweetsController_Tweetsservice();

		/**
		 * The meta object literal for the '<em><b>Store Tweet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___STORE_TWEET__EOBJECT = eINSTANCE.getTweetsController__StoreTweet__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Tweet By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___GET_TWEET_BY_ID__INT = eINSTANCE.getTweetsController__GetTweetById__int();

		/**
		 * The meta object literal for the '<em><b>Get Tweets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___GET_TWEETS = eINSTANCE.getTweetsController__GetTweets();

		/**
		 * The meta object literal for the '{@link service.impl.FilteringServiceImpl <em>Filtering Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.FilteringServiceImpl
		 * @see service.impl.ServicePackageImpl#getFilteringService()
		 * @generated
		 */
		EClass FILTERING_SERVICE = eINSTANCE.getFilteringService();

		/**
		 * The meta object literal for the '<em><b>Filteringrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTERING_SERVICE__FILTERINGRULE = eINSTANCE.getFilteringService_Filteringrule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTERING_SERVICE___FILTER__ELIST = eINSTANCE.getFilteringService__Filter__EList();

		/**
		 * The meta object literal for the '{@link service.FilteringRule <em>Filtering Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.FilteringRule
		 * @see service.impl.ServicePackageImpl#getFilteringRule()
		 * @generated
		 */
		EClass FILTERING_RULE = eINSTANCE.getFilteringRule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTERING_RULE___FILTER__EOBJECT = eINSTANCE.getFilteringRule__Filter__EObject();

		/**
		 * The meta object literal for the '{@link service.impl.LocationFilterRuleImpl <em>Location Filter Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.LocationFilterRuleImpl
		 * @see service.impl.ServicePackageImpl#getLocationFilterRule()
		 * @generated
		 */
		EClass LOCATION_FILTER_RULE = eINSTANCE.getLocationFilterRule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_FILTER_RULE___FILTER__ELIST = eINSTANCE.getLocationFilterRule__Filter__EList();

		/**
		 * The meta object literal for the '{@link service.impl.LabelFilterRuleImpl <em>Label Filter Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.LabelFilterRuleImpl
		 * @see service.impl.ServicePackageImpl#getLabelFilterRule()
		 * @generated
		 */
		EClass LABEL_FILTER_RULE = eINSTANCE.getLabelFilterRule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_FILTER_RULE___FILTER__ELIST = eINSTANCE.getLabelFilterRule__Filter__EList();

		/**
		 * The meta object literal for the '{@link service.impl.PopularityFilterRuleImpl <em>Popularity Filter Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see service.impl.PopularityFilterRuleImpl
		 * @see service.impl.ServicePackageImpl#getPopularityFilterRule()
		 * @generated
		 */
		EClass POPULARITY_FILTER_RULE = eINSTANCE.getPopularityFilterRule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POPULARITY_FILTER_RULE___FILTER__ELIST = eINSTANCE.getPopularityFilterRule__Filter__EList();

	}

} //ServicePackage
