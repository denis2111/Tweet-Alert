/**
 */
package analytics.controllers;

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
 * @see analytics.controllers.controllersFactory
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
	controllersPackage eINSTANCE = analytics.controllers.impl.controllersPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.controllers.impl.TweetsControllerImpl <em>Tweets Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.controllers.impl.TweetsControllerImpl
	 * @see analytics.controllers.impl.controllersPackageImpl#getTweetsController()
	 * @generated
	 */
	int TWEETS_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Tweetdto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER__TWEETDTO = 1;

	/**
	 * The number of structural features of the '<em>Tweets Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Tweets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___GET_TWEETS = 0;

	/**
	 * The operation id for the '<em>Get Tweet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___GET_TWEET = 1;

	/**
	 * The operation id for the '<em>Store Tweet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___STORE_TWEET__TWEETDTO = 2;

	/**
	 * The operation id for the '<em>Update Tweet Bu Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER___UPDATE_TWEET_BU_ID__TWEETDTO_STRING = 3;

	/**
	 * The number of operations of the '<em>Tweets Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_CONTROLLER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link analytics.controllers.impl.FeedbackControllerImpl <em>Feedback Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.controllers.impl.FeedbackControllerImpl
	 * @see analytics.controllers.impl.controllersPackageImpl#getFeedbackController()
	 * @generated
	 */
	int FEEDBACK_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONTROLLER__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Feedback Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Store Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONTROLLER___STORE_FEEDBACK = 0;

	/**
	 * The operation id for the '<em>Get Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONTROLLER___GET_FEEDBACK__TWEETDTO = 1;

	/**
	 * The number of operations of the '<em>Feedback Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONTROLLER_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Tweets Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Controller</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="TweetsController"
	 * @generated
	 */
	EClass getTweetsController();

	/**
	 * Returns the meta object for the containment reference '{@link java.lang.Object#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see java.lang.Object#getService()
	 * @see #getTweetsController()
	 * @generated
	 */
	EReference getTweetsController_Service();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getTweetdto <em>Tweetdto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tweetdto</em>'.
	 * @see java.lang.Object#getTweetdto()
	 * @see #getTweetsController()
	 * @generated
	 */
	EReference getTweetsController_Tweetdto();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#getTweets() <em>Get Tweets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweets</em>' operation.
	 * @see java.lang.Object#getTweets()
	 * @generated
	 */
	EOperation getTweetsController__GetTweets();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#getTweet() <em>Get Tweet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweet</em>' operation.
	 * @see java.lang.Object#getTweet()
	 * @generated
	 */
	EOperation getTweetsController__GetTweet();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#storeTweet(analytics.dtos.TweetDto) <em>Store Tweet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Tweet</em>' operation.
	 * @see java.lang.Object#storeTweet(analytics.dtos.TweetDto)
	 * @generated
	 */
	EOperation getTweetsController__StoreTweet__TweetDto();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#updateTweetBuId(analytics.dtos.TweetDto, java.lang.String) <em>Update Tweet Bu Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Tweet Bu Id</em>' operation.
	 * @see java.lang.Object#updateTweetBuId(analytics.dtos.TweetDto, java.lang.String)
	 * @generated
	 */
	EOperation getTweetsController__UpdateTweetBuId__TweetDto_String();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Feedback Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Controller</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="FeedbaclController"
	 * @generated
	 */
	EClass getFeedbackController();

	/**
	 * Returns the meta object for the containment reference '{@link java.lang.Object#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see java.lang.Object#getService()
	 * @see #getFeedbackController()
	 * @generated
	 */
	EReference getFeedbackController_Service();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#storeFeedback() <em>Store Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Feedback</em>' operation.
	 * @see java.lang.Object#storeFeedback()
	 * @generated
	 */
	EOperation getFeedbackController__StoreFeedback();

	/**
	 * Returns the meta object for the '{@link java.lang.Object#getFeedback(analytics.dtos.TweetDto) <em>Get Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback</em>' operation.
	 * @see java.lang.Object#getFeedback(analytics.dtos.TweetDto)
	 * @generated
	 */
	EOperation getFeedbackController__GetFeedback__TweetDto();

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
		 * The meta object literal for the '{@link analytics.controllers.impl.TweetsControllerImpl <em>Tweets Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.controllers.impl.TweetsControllerImpl
		 * @see analytics.controllers.impl.controllersPackageImpl#getTweetsController()
		 * @generated
		 */
		EClass TWEETS_CONTROLLER = eINSTANCE.getTweetsController();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_CONTROLLER__SERVICE = eINSTANCE.getTweetsController_Service();

		/**
		 * The meta object literal for the '<em><b>Tweetdto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEETS_CONTROLLER__TWEETDTO = eINSTANCE.getTweetsController_Tweetdto();

		/**
		 * The meta object literal for the '<em><b>Get Tweets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___GET_TWEETS = eINSTANCE.getTweetsController__GetTweets();

		/**
		 * The meta object literal for the '<em><b>Get Tweet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___GET_TWEET = eINSTANCE.getTweetsController__GetTweet();

		/**
		 * The meta object literal for the '<em><b>Store Tweet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___STORE_TWEET__TWEETDTO = eINSTANCE.getTweetsController__StoreTweet__TweetDto();

		/**
		 * The meta object literal for the '<em><b>Update Tweet Bu Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEETS_CONTROLLER___UPDATE_TWEET_BU_ID__TWEETDTO_STRING = eINSTANCE
				.getTweetsController__UpdateTweetBuId__TweetDto_String();

		/**
		 * The meta object literal for the '{@link analytics.controllers.impl.FeedbackControllerImpl <em>Feedback Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.controllers.impl.FeedbackControllerImpl
		 * @see analytics.controllers.impl.controllersPackageImpl#getFeedbackController()
		 * @generated
		 */
		EClass FEEDBACK_CONTROLLER = eINSTANCE.getFeedbackController();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_CONTROLLER__SERVICE = eINSTANCE.getFeedbackController_Service();

		/**
		 * The meta object literal for the '<em><b>Store Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_CONTROLLER___STORE_FEEDBACK = eINSTANCE.getFeedbackController__StoreFeedback();

		/**
		 * The meta object literal for the '<em><b>Get Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_CONTROLLER___GET_FEEDBACK__TWEETDTO = eINSTANCE
				.getFeedbackController__GetFeedback__TweetDto();

	}

} //controllersPackage
