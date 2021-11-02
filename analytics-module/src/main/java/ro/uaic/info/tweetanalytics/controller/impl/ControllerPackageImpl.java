/**
 */
package controller.impl;

import controller.Controller;
import controller.ControllerFactory;
import controller.ControllerPackage;

import controller.Image;
import controller.Label;
import controller.Location;
import controller.Tweet;
import controller.TweetCollection;
import controller.TweetIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class ControllerPackageImpl extends EPackageImpl implements ControllerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelEEnum = null;

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
	 * @see controller.ControllerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControllerPackageImpl() {
		super(eNS_URI, ControllerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControllerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControllerPackage init() {
		if (isInited) return (ControllerPackage)EPackage.Registry.INSTANCE.getEPackage(ControllerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredControllerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ControllerPackageImpl theControllerPackage = registeredControllerPackage instanceof ControllerPackageImpl ? (ControllerPackageImpl)registeredControllerPackage : new ControllerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theControllerPackage.createPackageContents();

		// Initialize created meta-data
		theControllerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControllerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControllerPackage.eNS_URI, theControllerPackage);
		return theControllerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Name() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweet() {
		return tweetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Id() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Text() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweet_Image() {
		return (EReference)tweetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweet_Location() {
		return (EReference)tweetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Label() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Language() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweet__GetHashtags() {
		return tweetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweet__GetTweetLocation() {
		return tweetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Image() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImage__GrayscaleImage() {
		return imageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__TranformCoordinatesToStringRepresentation__float_float() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetCollection() {
		return tweetCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetCollection_Tweet() {
		return (EReference)tweetCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetCollection__GetIterator() {
		return tweetCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetCollection__GetReverseIterator() {
		return tweetCollectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetCollection__AddTweet__Tweet() {
		return tweetCollectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetIterator() {
		return tweetIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetIterator_Tweetcollection() {
		return (EReference)tweetIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetIterator_Index() {
		return (EAttribute)tweetIteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetIterator_Reverse() {
		return (EAttribute)tweetIteratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTweetIterator__Next__Tweet() {
		return tweetIteratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabel() {
		return labelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerFactory getControllerFactory() {
		return (ControllerFactory)getEFactoryInstance();
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
		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);

		tweetEClass = createEClass(TWEET);
		createEAttribute(tweetEClass, TWEET__ID);
		createEAttribute(tweetEClass, TWEET__TEXT);
		createEReference(tweetEClass, TWEET__IMAGE);
		createEReference(tweetEClass, TWEET__LOCATION);
		createEAttribute(tweetEClass, TWEET__LABEL);
		createEAttribute(tweetEClass, TWEET__LANGUAGE);
		createEOperation(tweetEClass, TWEET___GET_HASHTAGS);
		createEOperation(tweetEClass, TWEET___GET_TWEET_LOCATION);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__IMAGE);
		createEOperation(imageEClass, IMAGE___GRAYSCALE_IMAGE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEOperation(locationEClass, LOCATION___TRANFORM_COORDINATES_TO_STRING_REPRESENTATION__FLOAT_FLOAT);

		tweetCollectionEClass = createEClass(TWEET_COLLECTION);
		createEReference(tweetCollectionEClass, TWEET_COLLECTION__TWEET);
		createEOperation(tweetCollectionEClass, TWEET_COLLECTION___GET_ITERATOR);
		createEOperation(tweetCollectionEClass, TWEET_COLLECTION___GET_REVERSE_ITERATOR);
		createEOperation(tweetCollectionEClass, TWEET_COLLECTION___ADD_TWEET__TWEET);

		tweetIteratorEClass = createEClass(TWEET_ITERATOR);
		createEReference(tweetIteratorEClass, TWEET_ITERATOR__TWEETCOLLECTION);
		createEAttribute(tweetIteratorEClass, TWEET_ITERATOR__INDEX);
		createEAttribute(tweetIteratorEClass, TWEET_ITERATOR__REVERSE);
		createEOperation(tweetIteratorEClass, TWEET_ITERATOR___NEXT__TWEET);

		// Create enums
		labelEEnum = createEEnum(LABEL);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEBoolean(), "name", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tweetEClass, Tweet.class, "Tweet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTweet_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweet_Image(), this.getImage(), null, "image", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweet_Location(), this.getLocation(), null, "location", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Label(), this.getLabel(), "label", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Language(), theXMLTypePackage.getString(), "language", null, 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTweet__GetHashtags(), null, "getHashtags", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getTweet__GetTweetLocation(), theXMLTypePackage.getString(), "getTweetLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Image(), ecorePackage.getEByteArray(), "image", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImage__GrayscaleImage(), null, "grayscaleImage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), theXMLTypePackage.getShort(), "name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Latitude(), theXMLTypePackage.getFloat(), "latitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), theXMLTypePackage.getFloat(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocation__TranformCoordinatesToStringRepresentation__float_float(), theXMLTypePackage.getString(), "tranformCoordinatesToStringRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getFloat(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getFloat(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tweetCollectionEClass, TweetCollection.class, "TweetCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetCollection_Tweet(), this.getTweet(), null, "tweet", null, 0, -1, TweetCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTweetCollection__GetIterator(), this.getTweetIterator(), "getIterator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTweetCollection__GetReverseIterator(), this.getTweetIterator(), "getReverseIterator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTweetCollection__AddTweet__Tweet(), null, "addTweet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tweetIteratorEClass, TweetIterator.class, "TweetIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetIterator_Tweetcollection(), this.getTweetCollection(), null, "tweetcollection", null, 0, 1, TweetIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweetIterator_Index(), theXMLTypePackage.getInt(), "index", null, 0, 1, TweetIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweetIterator_Reverse(), theXMLTypePackage.getBoolean(), "reverse", "false", 0, 1, TweetIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTweetIterator__Next__Tweet(), this.getTweet(), "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTweet(), "current", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(labelEEnum, Label.class, "Label");
		addEEnumLiteral(labelEEnum, Label.NONDISASTER);
		addEEnumLiteral(labelEEnum, Label.CYCLONE);
		addEEnumLiteral(labelEEnum, Label.EARTHQUAKE);
		addEEnumLiteral(labelEEnum, Label.FLOOD);
		addEEnumLiteral(labelEEnum, Label.FIRE);

		// Create resource
		createResource(eNS_URI);
	}

} //ControllerPackageImpl
