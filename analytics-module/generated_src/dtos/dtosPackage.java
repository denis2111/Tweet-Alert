/**
 */
package analytics.dtos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see analytics.dtos.dtosFactory
 * @model kind="package"
 * @generated
 */
public interface dtosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dtos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	dtosPackage eINSTANCE = analytics.dtos.impl.dtosPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.dtos.impl.TweetDtoImpl <em>Tweet Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.dtos.impl.TweetDtoImpl
	 * @see analytics.dtos.impl.dtosPackageImpl#getTweetDto()
	 * @generated
	 */
	int TWEET_DTO = 0;

	/**
	 * The feature id for the '<em><b>Feedback Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO__FEEDBACK_DTO = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO__TEXT = 1;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO__UID = 2;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO__VERDICT = 3;

	/**
	 * The feature id for the '<em><b>Compressed Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO__COMPRESSED_IMAGE = 4;

	/**
	 * The number of structural features of the '<em>Tweet Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tweet Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.dtos.impl.FeedbackDtoImpl <em>Feedback Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.dtos.impl.FeedbackDtoImpl
	 * @see analytics.dtos.impl.dtosPackageImpl#getFeedbackDto()
	 * @generated
	 */
	int FEEDBACK_DTO = 1;

	/**
	 * The feature id for the '<em><b>Thumbs Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DTO__THUMBS_UP = 0;

	/**
	 * The feature id for the '<em><b>Tweet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DTO__TWEET_ID = 1;

	/**
	 * The number of structural features of the '<em>Feedback Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.dtos.impl.VerdictImpl <em>Verdict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.dtos.impl.VerdictImpl
	 * @see analytics.dtos.impl.dtosPackageImpl#getVerdict()
	 * @generated
	 */
	int VERDICT = 2;

	/**
	 * The feature id for the '<em><b>Prediction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERDICT__PREDICTION_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Verdict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERDICT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Verdict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERDICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.dtos.PredictionType <em>Prediction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.dtos.PredictionType
	 * @see analytics.dtos.impl.dtosPackageImpl#getPredictionType()
	 * @generated
	 */
	int PREDICTION_TYPE = 3;

	/**
	 * Returns the meta object for class '{@link analytics.dtos.TweetDto <em>Tweet Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet Dto</em>'.
	 * @see analytics.dtos.TweetDto
	 * @generated
	 */
	EClass getTweetDto();

	/**
	 * Returns the meta object for the containment reference list '{@link analytics.dtos.TweetDto#getFeedbackDto <em>Feedback Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Dto</em>'.
	 * @see analytics.dtos.TweetDto#getFeedbackDto()
	 * @see #getTweetDto()
	 * @generated
	 */
	EReference getTweetDto_FeedbackDto();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.TweetDto#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see analytics.dtos.TweetDto#getText()
	 * @see #getTweetDto()
	 * @generated
	 */
	EAttribute getTweetDto_Text();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.TweetDto#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see analytics.dtos.TweetDto#getUID()
	 * @see #getTweetDto()
	 * @generated
	 */
	EAttribute getTweetDto_UID();

	/**
	 * Returns the meta object for the containment reference '{@link analytics.dtos.TweetDto#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verdict</em>'.
	 * @see analytics.dtos.TweetDto#getVerdict()
	 * @see #getTweetDto()
	 * @generated
	 */
	EReference getTweetDto_Verdict();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.TweetDto#getCompressedImage <em>Compressed Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compressed Image</em>'.
	 * @see analytics.dtos.TweetDto#getCompressedImage()
	 * @see #getTweetDto()
	 * @generated
	 */
	EAttribute getTweetDto_CompressedImage();

	/**
	 * Returns the meta object for class '{@link analytics.dtos.FeedbackDto <em>Feedback Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Dto</em>'.
	 * @see analytics.dtos.FeedbackDto
	 * @generated
	 */
	EClass getFeedbackDto();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.FeedbackDto#isThumbsUp <em>Thumbs Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbs Up</em>'.
	 * @see analytics.dtos.FeedbackDto#isThumbsUp()
	 * @see #getFeedbackDto()
	 * @generated
	 */
	EAttribute getFeedbackDto_ThumbsUp();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.FeedbackDto#getTweetId <em>Tweet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tweet Id</em>'.
	 * @see analytics.dtos.FeedbackDto#getTweetId()
	 * @see #getFeedbackDto()
	 * @generated
	 */
	EAttribute getFeedbackDto_TweetId();

	/**
	 * Returns the meta object for class '{@link analytics.dtos.Verdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verdict</em>'.
	 * @see analytics.dtos.Verdict
	 * @generated
	 */
	EClass getVerdict();

	/**
	 * Returns the meta object for the attribute '{@link analytics.dtos.Verdict#getPredictionType <em>Prediction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prediction Type</em>'.
	 * @see analytics.dtos.Verdict#getPredictionType()
	 * @see #getVerdict()
	 * @generated
	 */
	EAttribute getVerdict_PredictionType();

	/**
	 * Returns the meta object for enum '{@link analytics.dtos.PredictionType <em>Prediction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prediction Type</em>'.
	 * @see analytics.dtos.PredictionType
	 * @generated
	 */
	EEnum getPredictionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	dtosFactory getdtosFactory();

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
		 * The meta object literal for the '{@link analytics.dtos.impl.TweetDtoImpl <em>Tweet Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.dtos.impl.TweetDtoImpl
		 * @see analytics.dtos.impl.dtosPackageImpl#getTweetDto()
		 * @generated
		 */
		EClass TWEET_DTO = eINSTANCE.getTweetDto();

		/**
		 * The meta object literal for the '<em><b>Feedback Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET_DTO__FEEDBACK_DTO = eINSTANCE.getTweetDto_FeedbackDto();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_DTO__TEXT = eINSTANCE.getTweetDto_Text();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_DTO__UID = eINSTANCE.getTweetDto_UID();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET_DTO__VERDICT = eINSTANCE.getTweetDto_Verdict();

		/**
		 * The meta object literal for the '<em><b>Compressed Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_DTO__COMPRESSED_IMAGE = eINSTANCE.getTweetDto_CompressedImage();

		/**
		 * The meta object literal for the '{@link analytics.dtos.impl.FeedbackDtoImpl <em>Feedback Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.dtos.impl.FeedbackDtoImpl
		 * @see analytics.dtos.impl.dtosPackageImpl#getFeedbackDto()
		 * @generated
		 */
		EClass FEEDBACK_DTO = eINSTANCE.getFeedbackDto();

		/**
		 * The meta object literal for the '<em><b>Thumbs Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DTO__THUMBS_UP = eINSTANCE.getFeedbackDto_ThumbsUp();

		/**
		 * The meta object literal for the '<em><b>Tweet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DTO__TWEET_ID = eINSTANCE.getFeedbackDto_TweetId();

		/**
		 * The meta object literal for the '{@link analytics.dtos.impl.VerdictImpl <em>Verdict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.dtos.impl.VerdictImpl
		 * @see analytics.dtos.impl.dtosPackageImpl#getVerdict()
		 * @generated
		 */
		EClass VERDICT = eINSTANCE.getVerdict();

		/**
		 * The meta object literal for the '<em><b>Prediction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERDICT__PREDICTION_TYPE = eINSTANCE.getVerdict_PredictionType();

		/**
		 * The meta object literal for the '{@link analytics.dtos.PredictionType <em>Prediction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.dtos.PredictionType
		 * @see analytics.dtos.impl.dtosPackageImpl#getPredictionType()
		 * @generated
		 */
		EEnum PREDICTION_TYPE = eINSTANCE.getPredictionType();

	}

} //dtosPackage
