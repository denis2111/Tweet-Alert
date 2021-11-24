/**
 */
package analytics.services;

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
 * @see analytics.services.servicesFactory
 * @model kind="package"
 * @generated
 */
public interface servicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "services";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "services";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "services";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	servicesPackage eINSTANCE = analytics.services.impl.servicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.services.impl.TweetsServiceImpl <em>Tweets Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.services.impl.TweetsServiceImpl
	 * @see analytics.services.impl.servicesPackageImpl#getTweetsService()
	 * @generated
	 */
	int TWEETS_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Tweet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE__TWEET = 1;

	/**
	 * The number of structural features of the '<em>Tweets Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Tweets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___GET_TWEETS = 0;

	/**
	 * The operation id for the '<em>Store Tweet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___STORE_TWEET__TWEET = 1;

	/**
	 * The operation id for the '<em>Get Tweeet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___GET_TWEEET = 2;

	/**
	 * The operation id for the '<em>Update Tweet Bu Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE___UPDATE_TWEET_BU_ID__TWEET_STRING = 3;

	/**
	 * The number of operations of the '<em>Tweets Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_SERVICE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link analytics.services.impl.FeedbackServiceImpl <em>Feedback Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.services.impl.FeedbackServiceImpl
	 * @see analytics.services.impl.servicesPackageImpl#getFeedbackService()
	 * @generated
	 */
	int FEEDBACK_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Feedbackrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE__FEEDBACKREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE__FEEDBACK = 1;

	/**
	 * The number of structural features of the '<em>Feedback Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Store Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE___STORE_FEEDBACK = 0;

	/**
	 * The operation id for the '<em>Get Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE___GET_FEEDBACK__TWEETDTO = 1;

	/**
	 * The number of operations of the '<em>Feedback Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_SERVICE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link analytics.services.impl.UsersServiceImpl <em>Users Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.services.impl.UsersServiceImpl
	 * @see analytics.services.impl.servicesPackageImpl#getUsersService()
	 * @generated
	 */
	int USERS_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_SERVICE__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_SERVICE__USER = 1;

	/**
	 * The number of structural features of the '<em>Users Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Find By Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_SERVICE___FIND_BY_USERNAME = 0;

	/**
	 * The number of operations of the '<em>Users Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_SERVICE_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Tweets Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Service</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getTweetsService();

	/**
	 * Returns the meta object for the containment reference '{@link java.lang.Object#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see java.lang.Object#getRepository()
	 * @see #getTweetsService()
	 * @generated
	 */
	EReference getTweetsService_Repository();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getTweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tweet</em>'.
	 * @see java.lang.Object#getTweet()
	 * @see #getTweetsService()
	 * @generated
	 */
	EReference getTweetsService_Tweet();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#getTweets() <em>Get Tweets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweets</em>' operation.
	 * @see java.lang.Object#getTweets()
	 * @generated
	 */
	EOperation getTweetsService__GetTweets();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#storeTweet(analytics.models.Tweet) <em>Store Tweet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Tweet</em>' operation.
	 * @see java.lang.Object#storeTweet(analytics.models.Tweet)
	 * @generated
	 */
	EOperation getTweetsService__StoreTweet__Tweet();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#getTweeet() <em>Get Tweeet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweeet</em>' operation.
	 * @see java.lang.Object#getTweeet()
	 * @generated
	 */
	EOperation getTweetsService__GetTweeet();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#updateTweetBuId(analytics.models.Tweet, java.lang.String) <em>Update Tweet Bu Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Tweet Bu Id</em>' operation.
	 * @see java.lang.Object#updateTweetBuId(analytics.models.Tweet, java.lang.String)
	 * @generated
	 */
	EOperation getTweetsService__UpdateTweetBuId__Tweet_String();

	/**
	 * Returns the meta object for class '{@link analytics.services.FeedbackService <em>Feedback Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Service</em>'.
	 * @see analytics.services.FeedbackService
	 * @generated
	 */
	EClass getFeedbackService();

	/**
	 * Returns the meta object for the containment reference '{@link analytics.services.FeedbackService#getFeedbackrepository <em>Feedbackrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedbackrepository</em>'.
	 * @see analytics.services.FeedbackService#getFeedbackrepository()
	 * @see #getFeedbackService()
	 * @generated
	 */
	EReference getFeedbackService_Feedbackrepository();

	/**
	 * Returns the meta object for the reference '{@link analytics.services.FeedbackService#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback</em>'.
	 * @see analytics.services.FeedbackService#getFeedback()
	 * @see #getFeedbackService()
	 * @generated
	 */
	EReference getFeedbackService_Feedback();

	/**
	 * Returns the meta object for the '{@link analytics.services.FeedbackService#storeFeedback() <em>Store Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Feedback</em>' operation.
	 * @see analytics.services.FeedbackService#storeFeedback()
	 * @generated
	 */
	EOperation getFeedbackService__StoreFeedback();

	/**
	 * Returns the meta object for the '{@link analytics.services.FeedbackService#getFeedback(analytics.dtos.TweetDto) <em>Get Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback</em>' operation.
	 * @see analytics.services.FeedbackService#getFeedback(analytics.dtos.TweetDto)
	 * @generated
	 */
	EOperation getFeedbackService__GetFeedback__TweetDto();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Users Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users Service</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getUsersService();

	/**
	 * Returns the meta object for the containment reference '{@link java.lang.Object#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see java.lang.Object#getRepository()
	 * @see #getUsersService()
	 * @generated
	 */
	EReference getUsersService_Repository();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see java.lang.Object#getUser()
	 * @see #getUsersService()
	 * @generated
	 */
	EReference getUsersService_User();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#findByUsername() <em>Find By Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find By Username</em>' operation.
	 * @see java.lang.Object#findByUsername()
	 * @generated
	 */
	EOperation getUsersService__FindByUsername();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	servicesFactory getservicesFactory();

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
		 * The meta object literal for the '{@link analytics.services.impl.TweetsServiceImpl <em>Tweets Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.services.impl.TweetsServiceImpl
		 * @see analytics.services.impl.servicesPackageImpl#getTweetsService()
		 * @generated
		 */
		EClass TWEETS_SERVICE = eINSTANCE.getTweetsService();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_SERVICE__REPOSITORY = eINSTANCE.getTweetsService_Repository();

		/**
		 * The meta object literal for the '<em><b>Tweet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_SERVICE__TWEET = eINSTANCE.getTweetsService_Tweet();

		/**
		 * The meta object literal for the '<em><b>Get Tweets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___GET_TWEETS = eINSTANCE.getTweetsService__GetTweets();

		/**
		 * The meta object literal for the '<em><b>Store Tweet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___STORE_TWEET__TWEET = eINSTANCE.getTweetsService__StoreTweet__Tweet();

		/**
		 * The meta object literal for the '<em><b>Get Tweeet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___GET_TWEEET = eINSTANCE.getTweetsService__GetTweeet();

		/**
		 * The meta object literal for the '<em><b>Update Tweet Bu Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_SERVICE___UPDATE_TWEET_BU_ID__TWEET_STRING = eINSTANCE
				.getTweetsService__UpdateTweetBuId__Tweet_String();

		/**
		 * The meta object literal for the '{@link analytics.services.impl.FeedbackServiceImpl <em>Feedback Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.services.impl.FeedbackServiceImpl
		 * @see analytics.services.impl.servicesPackageImpl#getFeedbackService()
		 * @generated
		 */
		EClass FEEDBACK_SERVICE = eINSTANCE.getFeedbackService();

		/**
		 * The meta object literal for the '<em><b>Feedbackrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_SERVICE__FEEDBACKREPOSITORY = eINSTANCE.getFeedbackService_Feedbackrepository();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_SERVICE__FEEDBACK = eINSTANCE.getFeedbackService_Feedback();

		/**
		 * The meta object literal for the '<em><b>Store Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_SERVICE___STORE_FEEDBACK = eINSTANCE.getFeedbackService__StoreFeedback();

		/**
		 * The meta object literal for the '<em><b>Get Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_SERVICE___GET_FEEDBACK__TWEETDTO = eINSTANCE.getFeedbackService__GetFeedback__TweetDto();

		/**
		 * The meta object literal for the '{@link analytics.services.impl.UsersServiceImpl <em>Users Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.services.impl.UsersServiceImpl
		 * @see analytics.services.impl.servicesPackageImpl#getUsersService()
		 * @generated
		 */
		EClass USERS_SERVICE = eINSTANCE.getUsersService();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS_SERVICE__REPOSITORY = eINSTANCE.getUsersService_Repository();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS_SERVICE__USER = eINSTANCE.getUsersService_User();

		/**
		 * The meta object literal for the '<em><b>Find By Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERS_SERVICE___FIND_BY_USERNAME = eINSTANCE.getUsersService__FindByUsername();

	}

} //servicesPackage
