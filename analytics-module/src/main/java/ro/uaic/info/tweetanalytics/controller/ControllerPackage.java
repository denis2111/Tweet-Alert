/**
 */
package controller;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see controller.ControllerFactory
 * @model kind="package"
 * @generated
 */
public interface ControllerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controller";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/analytics/controller";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.analytics.controller";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllerPackage eINSTANCE = controller.impl.ControllerPackageImpl.init();

	/**
	 * The meta object id for the '{@link controller.Controller <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.Controller
	 * @see controller.impl.ControllerPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link controller.impl.TweetImpl <em>Tweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.impl.TweetImpl
	 * @see controller.impl.ControllerPackageImpl#getTweet()
	 * @generated
	 */
	int TWEET = 1;

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
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LANGUAGE = 5;

	/**
	 * The number of structural features of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Hashtags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET___GET_HASHTAGS = 0;

	/**
	 * The operation id for the '<em>Get Tweet Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET___GET_TWEET_LOCATION = 1;

	/**
	 * The number of operations of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link controller.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.impl.ImageImpl
	 * @see controller.impl.ControllerPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Grayscale Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GRAYSCALE_IMAGE = 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link controller.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.impl.LocationImpl
	 * @see controller.impl.ControllerPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Tranform Coordinates To String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___TRANFORM_COORDINATES_TO_STRING_REPRESENTATION__FLOAT_FLOAT = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link controller.impl.TweetCollectionImpl <em>Tweet Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.impl.TweetCollectionImpl
	 * @see controller.impl.ControllerPackageImpl#getTweetCollection()
	 * @generated
	 */
	int TWEET_COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Tweet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION__TWEET = 0;

	/**
	 * The number of structural features of the '<em>Tweet Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION___GET_ITERATOR = 0;

	/**
	 * The operation id for the '<em>Get Reverse Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION___GET_REVERSE_ITERATOR = 1;

	/**
	 * The operation id for the '<em>Add Tweet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION___ADD_TWEET__TWEET = 2;

	/**
	 * The number of operations of the '<em>Tweet Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_COLLECTION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link controller.impl.TweetIteratorImpl <em>Tweet Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.impl.TweetIteratorImpl
	 * @see controller.impl.ControllerPackageImpl#getTweetIterator()
	 * @generated
	 */
	int TWEET_ITERATOR = 5;

	/**
	 * The feature id for the '<em><b>Tweetcollection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR__TWEETCOLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR__REVERSE = 2;

	/**
	 * The number of structural features of the '<em>Tweet Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR___NEXT__TWEET = 0;

	/**
	 * The number of operations of the '<em>Tweet Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_ITERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link controller.Label <em>Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controller.Label
	 * @see controller.impl.ControllerPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 6;

	/**
	 * Returns the meta object for class '{@link controller.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see controller.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link controller.Controller#isName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controller.Controller#isName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for class '{@link controller.Tweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet</em>'.
	 * @see controller.Tweet
	 * @generated
	 */
	EClass getTweet();

	/**
	 * Returns the meta object for the attribute '{@link controller.Tweet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see controller.Tweet#getId()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Id();

	/**
	 * Returns the meta object for the attribute '{@link controller.Tweet#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see controller.Tweet#getText()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Text();

	/**
	 * Returns the meta object for the containment reference '{@link controller.Tweet#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see controller.Tweet#getImage()
	 * @see #getTweet()
	 * @generated
	 */
	EReference getTweet_Image();

	/**
	 * Returns the meta object for the containment reference '{@link controller.Tweet#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see controller.Tweet#getLocation()
	 * @see #getTweet()
	 * @generated
	 */
	EReference getTweet_Location();

	/**
	 * Returns the meta object for the attribute '{@link controller.Tweet#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see controller.Tweet#getLabel()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Label();

	/**
	 * Returns the meta object for the attribute '{@link controller.Tweet#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see controller.Tweet#getLanguage()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Language();

	/**
	 * Returns the meta object for the '{@link controller.Tweet#getHashtags() <em>Get Hashtags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hashtags</em>' operation.
	 * @see controller.Tweet#getHashtags()
	 * @generated
	 */
	EOperation getTweet__GetHashtags();

	/**
	 * Returns the meta object for the '{@link controller.Tweet#getTweetLocation() <em>Get Tweet Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tweet Location</em>' operation.
	 * @see controller.Tweet#getTweetLocation()
	 * @generated
	 */
	EOperation getTweet__GetTweetLocation();

	/**
	 * Returns the meta object for class '{@link controller.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see controller.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link controller.Image#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see controller.Image#getImage()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Image();

	/**
	 * Returns the meta object for the '{@link controller.Image#grayscaleImage() <em>Grayscale Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Grayscale Image</em>' operation.
	 * @see controller.Image#grayscaleImage()
	 * @generated
	 */
	EOperation getImage__GrayscaleImage();

	/**
	 * Returns the meta object for class '{@link controller.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see controller.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link controller.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controller.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link controller.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see controller.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link controller.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see controller.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the '{@link controller.Location#tranformCoordinatesToStringRepresentation(float, float) <em>Tranform Coordinates To String Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tranform Coordinates To String Representation</em>' operation.
	 * @see controller.Location#tranformCoordinatesToStringRepresentation(float, float)
	 * @generated
	 */
	EOperation getLocation__TranformCoordinatesToStringRepresentation__float_float();

	/**
	 * Returns the meta object for class '{@link controller.TweetCollection <em>Tweet Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet Collection</em>'.
	 * @see controller.TweetCollection
	 * @generated
	 */
	EClass getTweetCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link controller.TweetCollection#getTweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tweet</em>'.
	 * @see controller.TweetCollection#getTweet()
	 * @see #getTweetCollection()
	 * @generated
	 */
	EReference getTweetCollection_Tweet();

	/**
	 * Returns the meta object for the '{@link controller.TweetCollection#getIterator() <em>Get Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Iterator</em>' operation.
	 * @see controller.TweetCollection#getIterator()
	 * @generated
	 */
	EOperation getTweetCollection__GetIterator();

	/**
	 * Returns the meta object for the '{@link controller.TweetCollection#getReverseIterator() <em>Get Reverse Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reverse Iterator</em>' operation.
	 * @see controller.TweetCollection#getReverseIterator()
	 * @generated
	 */
	EOperation getTweetCollection__GetReverseIterator();

	/**
	 * Returns the meta object for the '{@link controller.TweetCollection#addTweet(controller.Tweet) <em>Add Tweet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Tweet</em>' operation.
	 * @see controller.TweetCollection#addTweet(controller.Tweet)
	 * @generated
	 */
	EOperation getTweetCollection__AddTweet__Tweet();

	/**
	 * Returns the meta object for class '{@link controller.TweetIterator <em>Tweet Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet Iterator</em>'.
	 * @see controller.TweetIterator
	 * @generated
	 */
	EClass getTweetIterator();

	/**
	 * Returns the meta object for the containment reference '{@link controller.TweetIterator#getTweetcollection <em>Tweetcollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tweetcollection</em>'.
	 * @see controller.TweetIterator#getTweetcollection()
	 * @see #getTweetIterator()
	 * @generated
	 */
	EReference getTweetIterator_Tweetcollection();

	/**
	 * Returns the meta object for the attribute '{@link controller.TweetIterator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see controller.TweetIterator#getIndex()
	 * @see #getTweetIterator()
	 * @generated
	 */
	EAttribute getTweetIterator_Index();

	/**
	 * Returns the meta object for the attribute '{@link controller.TweetIterator#isReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see controller.TweetIterator#isReverse()
	 * @see #getTweetIterator()
	 * @generated
	 */
	EAttribute getTweetIterator_Reverse();

	/**
	 * Returns the meta object for the '{@link controller.TweetIterator#next(controller.Tweet) <em>Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Next</em>' operation.
	 * @see controller.TweetIterator#next(controller.Tweet)
	 * @generated
	 */
	EOperation getTweetIterator__Next__Tweet();

	/**
	 * Returns the meta object for enum '{@link controller.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label</em>'.
	 * @see controller.Label
	 * @generated
	 */
	EEnum getLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControllerFactory getControllerFactory();

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
		 * The meta object literal for the '{@link controller.Controller <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.Controller
		 * @see controller.impl.ControllerPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();
		/**
		 * The meta object literal for the '{@link controller.impl.TweetImpl <em>Tweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.impl.TweetImpl
		 * @see controller.impl.ControllerPackageImpl#getTweet()
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
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET__IMAGE = eINSTANCE.getTweet_Image();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET__LOCATION = eINSTANCE.getTweet_Location();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__LABEL = eINSTANCE.getTweet_Label();
		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__LANGUAGE = eINSTANCE.getTweet_Language();
		/**
		 * The meta object literal for the '<em><b>Get Hashtags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET___GET_HASHTAGS = eINSTANCE.getTweet__GetHashtags();
		/**
		 * The meta object literal for the '<em><b>Get Tweet Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET___GET_TWEET_LOCATION = eINSTANCE.getTweet__GetTweetLocation();
		/**
		 * The meta object literal for the '{@link controller.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.impl.ImageImpl
		 * @see controller.impl.ControllerPackageImpl#getImage()
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
		 * The meta object literal for the '<em><b>Grayscale Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE___GRAYSCALE_IMAGE = eINSTANCE.getImage__GrayscaleImage();
		/**
		 * The meta object literal for the '{@link controller.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.impl.LocationImpl
		 * @see controller.impl.ControllerPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();
		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();
		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();
		/**
		 * The meta object literal for the '<em><b>Tranform Coordinates To String Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___TRANFORM_COORDINATES_TO_STRING_REPRESENTATION__FLOAT_FLOAT = eINSTANCE.getLocation__TranformCoordinatesToStringRepresentation__float_float();
		/**
		 * The meta object literal for the '{@link controller.impl.TweetCollectionImpl <em>Tweet Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.impl.TweetCollectionImpl
		 * @see controller.impl.ControllerPackageImpl#getTweetCollection()
		 * @generated
		 */
		EClass TWEET_COLLECTION = eINSTANCE.getTweetCollection();
		/**
		 * The meta object literal for the '<em><b>Tweet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET_COLLECTION__TWEET = eINSTANCE.getTweetCollection_Tweet();
		/**
		 * The meta object literal for the '<em><b>Get Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET_COLLECTION___GET_ITERATOR = eINSTANCE.getTweetCollection__GetIterator();
		/**
		 * The meta object literal for the '<em><b>Get Reverse Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET_COLLECTION___GET_REVERSE_ITERATOR = eINSTANCE.getTweetCollection__GetReverseIterator();
		/**
		 * The meta object literal for the '<em><b>Add Tweet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET_COLLECTION___ADD_TWEET__TWEET = eINSTANCE.getTweetCollection__AddTweet__Tweet();
		/**
		 * The meta object literal for the '{@link controller.impl.TweetIteratorImpl <em>Tweet Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.impl.TweetIteratorImpl
		 * @see controller.impl.ControllerPackageImpl#getTweetIterator()
		 * @generated
		 */
		EClass TWEET_ITERATOR = eINSTANCE.getTweetIterator();
		/**
		 * The meta object literal for the '<em><b>Tweetcollection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWEET_ITERATOR__TWEETCOLLECTION = eINSTANCE.getTweetIterator_Tweetcollection();
		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_ITERATOR__INDEX = eINSTANCE.getTweetIterator_Index();
		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET_ITERATOR__REVERSE = eINSTANCE.getTweetIterator_Reverse();
		/**
		 * The meta object literal for the '<em><b>Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWEET_ITERATOR___NEXT__TWEET = eINSTANCE.getTweetIterator__Next__Tweet();
		/**
		 * The meta object literal for the '{@link controller.Label <em>Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controller.Label
		 * @see controller.impl.ControllerPackageImpl#getLabel()
		 * @generated
		 */
		EEnum LABEL = eINSTANCE.getLabel();

	}

} //ControllerPackage
