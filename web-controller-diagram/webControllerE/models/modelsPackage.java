/**
 */
package webControllerE.models;

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
 * @see webControllerE.models.modelsFactory
 * @model kind="package"
 * @generated
 */
public interface modelsPackage extends EPackage {
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
	modelsPackage eINSTANCE = webControllerE.models.impl.modelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link webControllerE.models.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.impl.ImageImpl
	 * @see webControllerE.models.impl.modelsPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.impl.ClassificationResponseImpl <em>Classification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.impl.ClassificationResponseImpl
	 * @see webControllerE.models.impl.modelsPackageImpl#getClassificationResponse()
	 * @generated
	 */
	int CLASSIFICATION_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Classification Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_RESPONSE__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>Classification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.impl.TweetImpl <em>Tweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.impl.TweetImpl
	 * @see webControllerE.models.impl.modelsPackageImpl#getTweet()
	 * @generated
	 */
	int TWEET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__IMAGE = 3;

	/**
	 * The number of structural features of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.impl.ResponseBuilderImpl <em>Response Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.impl.ResponseBuilderImpl
	 * @see webControllerE.models.impl.modelsPackageImpl#getResponseBuilder()
	 * @generated
	 */
	int RESPONSE_BUILDER = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Classification Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER__CLASSIFICATION_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER__PRECISION = 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER__RESPONSE = 3;

	/**
	 * The number of structural features of the '<em>Response Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.Response <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.Response
	 * @see webControllerE.models.impl.modelsPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Classification Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CLASSIFICATION_LABEL = CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__PRECISION = CLASSIFICATION_RESPONSE__PRECISION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__LOCATION = CLASSIFICATION_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classificationresponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CLASSIFICATIONRESPONSE = CLASSIFICATION_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = CLASSIFICATION_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = CLASSIFICATION_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.impl.LocalizedResponseImpl <em>Localized Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.impl.LocalizedResponseImpl
	 * @see webControllerE.models.impl.modelsPackageImpl#getLocalizedResponse()
	 * @generated
	 */
	int LOCALIZED_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_RESPONSE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Classificationresponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Localized Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Localized Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webControllerE.models.DisasterType <em>Disaster Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.models.DisasterType
	 * @see webControllerE.models.impl.modelsPackageImpl#getDisasterType()
	 * @generated
	 */
	int DISASTER_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link webControllerE.models.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see webControllerE.models.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.Image#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see webControllerE.models.Image#getImage()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Image();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.Image#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see webControllerE.models.Image#getLocation()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Location();

	/**
	 * Returns the meta object for class '{@link webControllerE.models.ClassificationResponse <em>Classification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Response</em>'.
	 * @see webControllerE.models.ClassificationResponse
	 * @generated
	 */
	EClass getClassificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.ClassificationResponse#getClassificationLabel <em>Classification Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Label</em>'.
	 * @see webControllerE.models.ClassificationResponse#getClassificationLabel()
	 * @see #getClassificationResponse()
	 * @generated
	 */
	EAttribute getClassificationResponse_ClassificationLabel();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.ClassificationResponse#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see webControllerE.models.ClassificationResponse#getPrecision()
	 * @see #getClassificationResponse()
	 * @generated
	 */
	EAttribute getClassificationResponse_Precision();

	/**
	 * Returns the meta object for class '{@link webControllerE.models.Tweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet</em>'.
	 * @see webControllerE.models.Tweet
	 * @generated
	 */
	EClass getTweet();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.Tweet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see webControllerE.models.Tweet#getId()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Id();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.Tweet#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see webControllerE.models.Tweet#getLocation()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Location();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.Tweet#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webControllerE.models.Tweet#getText()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Text();

	/**
	 * Returns the meta object for the containment reference '{@link webControllerE.models.Tweet#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see webControllerE.models.Tweet#getImage()
	 * @see #getTweet()
	 * @generated
	 */
	EReference getTweet_Image();

	/**
	 * Returns the meta object for class '{@link webControllerE.models.ResponseBuilder <em>Response Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Builder</em>'.
	 * @see webControllerE.models.ResponseBuilder
	 * @generated
	 */
	EClass getResponseBuilder();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.ResponseBuilder#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see webControllerE.models.ResponseBuilder#getLocation()
	 * @see #getResponseBuilder()
	 * @generated
	 */
	EAttribute getResponseBuilder_Location();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.ResponseBuilder#getClassificationLabel <em>Classification Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Label</em>'.
	 * @see webControllerE.models.ResponseBuilder#getClassificationLabel()
	 * @see #getResponseBuilder()
	 * @generated
	 */
	EAttribute getResponseBuilder_ClassificationLabel();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.ResponseBuilder#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see webControllerE.models.ResponseBuilder#getPrecision()
	 * @see #getResponseBuilder()
	 * @generated
	 */
	EAttribute getResponseBuilder_Precision();

	/**
	 * Returns the meta object for the reference '{@link webControllerE.models.ResponseBuilder#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see webControllerE.models.ResponseBuilder#getResponse()
	 * @see #getResponseBuilder()
	 * @generated
	 */
	EReference getResponseBuilder_Response();

	/**
	 * Returns the meta object for class '{@link webControllerE.models.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see webControllerE.models.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for class '{@link webControllerE.models.LocalizedResponse <em>Localized Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized Response</em>'.
	 * @see webControllerE.models.LocalizedResponse
	 * @generated
	 */
	EClass getLocalizedResponse();

	/**
	 * Returns the meta object for the attribute '{@link webControllerE.models.LocalizedResponse#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see webControllerE.models.LocalizedResponse#getLocation()
	 * @see #getLocalizedResponse()
	 * @generated
	 */
	EAttribute getLocalizedResponse_Location();

	/**
	 * Returns the meta object for the containment reference '{@link webControllerE.models.LocalizedResponse#getClassificationresponse <em>Classificationresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classificationresponse</em>'.
	 * @see webControllerE.models.LocalizedResponse#getClassificationresponse()
	 * @see #getLocalizedResponse()
	 * @generated
	 */
	EReference getLocalizedResponse_Classificationresponse();

	/**
	 * Returns the meta object for enum '{@link webControllerE.models.DisasterType <em>Disaster Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disaster Type</em>'.
	 * @see webControllerE.models.DisasterType
	 * @generated
	 */
	EEnum getDisasterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	modelsFactory getmodelsFactory();

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
		 * The meta object literal for the '{@link webControllerE.models.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.impl.ImageImpl
		 * @see webControllerE.models.impl.modelsPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__IMAGE = eINSTANCE.getImage_Image();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LOCATION = eINSTANCE.getImage_Location();

		/**
		 * The meta object literal for the '{@link webControllerE.models.impl.ClassificationResponseImpl <em>Classification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.impl.ClassificationResponseImpl
		 * @see webControllerE.models.impl.modelsPackageImpl#getClassificationResponse()
		 * @generated
		 */
		EClass CLASSIFICATION_RESPONSE = eINSTANCE.getClassificationResponse();

		/**
		 * The meta object literal for the '<em><b>Classification Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL = eINSTANCE
				.getClassificationResponse_ClassificationLabel();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_RESPONSE__PRECISION = eINSTANCE.getClassificationResponse_Precision();

		/**
		 * The meta object literal for the '{@link webControllerE.models.impl.TweetImpl <em>Tweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.impl.TweetImpl
		 * @see webControllerE.models.impl.modelsPackageImpl#getTweet()
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
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__LOCATION = eINSTANCE.getTweet_Location();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__TEXT = eINSTANCE.getTweet_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET__IMAGE = eINSTANCE.getTweet_Image();

		/**
		 * The meta object literal for the '{@link webControllerE.models.impl.ResponseBuilderImpl <em>Response Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.impl.ResponseBuilderImpl
		 * @see webControllerE.models.impl.modelsPackageImpl#getResponseBuilder()
		 * @generated
		 */
		EClass RESPONSE_BUILDER = eINSTANCE.getResponseBuilder();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BUILDER__LOCATION = eINSTANCE.getResponseBuilder_Location();

		/**
		 * The meta object literal for the '<em><b>Classification Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BUILDER__CLASSIFICATION_LABEL = eINSTANCE.getResponseBuilder_ClassificationLabel();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BUILDER__PRECISION = eINSTANCE.getResponseBuilder_Precision();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_BUILDER__RESPONSE = eINSTANCE.getResponseBuilder_Response();

		/**
		 * The meta object literal for the '{@link webControllerE.models.Response <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.Response
		 * @see webControllerE.models.impl.modelsPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '{@link webControllerE.models.impl.LocalizedResponseImpl <em>Localized Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.impl.LocalizedResponseImpl
		 * @see webControllerE.models.impl.modelsPackageImpl#getLocalizedResponse()
		 * @generated
		 */
		EClass LOCALIZED_RESPONSE = eINSTANCE.getLocalizedResponse();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_RESPONSE__LOCATION = eINSTANCE.getLocalizedResponse_Location();

		/**
		 * The meta object literal for the '<em><b>Classificationresponse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE = eINSTANCE.getLocalizedResponse_Classificationresponse();

		/**
		 * The meta object literal for the '{@link webControllerE.models.DisasterType <em>Disaster Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.models.DisasterType
		 * @see webControllerE.models.impl.modelsPackageImpl#getDisasterType()
		 * @generated
		 */
		EEnum DISASTER_TYPE = eINSTANCE.getDisasterType();

	}

} //modelsPackage
