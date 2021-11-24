/**
 */
package analytics.models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see analytics.models.modelssFactory
 * @model kind="package"
 * @generated
 */
public interface modelssPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "models";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "models";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modelssPackage eINSTANCE = analytics.models.impl.modelssPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.models.impl.TweetImpl <em>Tweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.models.impl.TweetImpl
	 * @see analytics.models.impl.modelssPackageImpl#getTweet()
	 * @generated
	 */
	int TWEET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__FEEDBACK = 4;

	/**
	 * The number of structural features of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.models.impl.TweetImageImpl <em>Tweet Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.models.impl.TweetImageImpl
	 * @see analytics.models.impl.modelssPackageImpl#getTweetImage()
	 * @generated
	 */
	int TWEET_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_IMAGE__IMAGE = 0;

	/**
	 * The number of structural features of the '<em>Tweet Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tweet Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.models.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.models.impl.FeedbackImpl
	 * @see analytics.models.impl.modelssPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Thumbs Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__THUMBS_UP = 0;

	/**
	 * The feature id for the '<em><b>Tweet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__TWEET_ID = 1;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.models.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.models.impl.UserImpl
	 * @see analytics.models.impl.modelssPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link analytics.models.Tweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet</em>'.
	 * @see analytics.models.Tweet
	 * @generated
	 */
	EClass getTweet();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.Tweet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see analytics.models.Tweet#getId()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Id();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.Tweet#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see analytics.models.Tweet#getText()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link analytics.models.Tweet#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see analytics.models.Tweet#getImage()
	 * @see #getTweet()
	 * @generated
	 */
	EReference getTweet_Image();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.Tweet#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see analytics.models.Tweet#getLocation()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link analytics.models.Tweet#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback</em>'.
	 * @see analytics.models.Tweet#getFeedback()
	 * @see #getTweet()
	 * @generated
	 */
	EReference getTweet_Feedback();

	/**
	 * Returns the meta object for class '{@link analytics.models.TweetImage <em>Tweet Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet Image</em>'.
	 * @see analytics.models.TweetImage
	 * @generated
	 */
	EClass getTweetImage();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.TweetImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see analytics.models.TweetImage#getImage()
	 * @see #getTweetImage()
	 * @generated
	 */
	EAttribute getTweetImage_Image();

	/**
	 * Returns the meta object for class '{@link analytics.models.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see analytics.models.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.Feedback#isThumbsUp <em>Thumbs Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbs Up</em>'.
	 * @see analytics.models.Feedback#isThumbsUp()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_ThumbsUp();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.Feedback#getTweetId <em>Tweet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tweet Id</em>'.
	 * @see analytics.models.Feedback#getTweetId()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_TweetId();

	/**
	 * Returns the meta object for class '{@link analytics.models.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see analytics.models.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see analytics.models.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see analytics.models.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link analytics.models.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see analytics.models.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	modelssFactory getmodelssFactory();

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
		 * The meta object literal for the '{@link analytics.models.impl.TweetImpl <em>Tweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.models.impl.TweetImpl
		 * @see analytics.models.impl.modelssPackageImpl#getTweet()
		 * @generated
		 */
		EClass TWEET = eINSTANCE.getTweet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__ID = eINSTANCE.getTweet_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__TEXT = eINSTANCE.getTweet_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET__IMAGE = eINSTANCE.getTweet_Image();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__LOCATION = eINSTANCE.getTweet_Location();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET__FEEDBACK = eINSTANCE.getTweet_Feedback();

		/**
		 * The meta object literal for the '{@link analytics.models.impl.TweetImageImpl <em>Tweet Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.models.impl.TweetImageImpl
		 * @see analytics.models.impl.modelssPackageImpl#getTweetImage()
		 * @generated
		 */
		EClass TWEET_IMAGE = eINSTANCE.getTweetImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_IMAGE__IMAGE = eINSTANCE.getTweetImage_Image();

		/**
		 * The meta object literal for the '{@link analytics.models.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.models.impl.FeedbackImpl
		 * @see analytics.models.impl.modelssPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Thumbs Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__THUMBS_UP = eINSTANCE.getFeedback_ThumbsUp();

		/**
		 * The meta object literal for the '<em><b>Tweet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__TWEET_ID = eINSTANCE.getFeedback_TweetId();

		/**
		 * The meta object literal for the '{@link analytics.models.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.models.impl.UserImpl
		 * @see analytics.models.impl.modelssPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

	}

} //modelssPackage
