/**
 */
package analytics.models.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

import analytics.dtos.dtosPackage;

import analytics.dtos.impl.dtosPackageImpl;

import analytics.exceptions.exceptionsPackage;

import analytics.exceptions.impl.exceptionsPackageImpl;

import analytics.models.Feedback;
import analytics.models.Tweet;
import analytics.models.TweetImage;
import analytics.models.User;
import analytics.models.modelssFactory;
import analytics.models.modelssPackage;

import analytics.repositories.impl.repositoriesPackageImpl;

import analytics.repositories.repositoriesPackage;

import analytics.security.impl.securityPackageImpl;

import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class modelssPackageImpl extends EPackageImpl implements modelssPackage {
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
	private EClass tweetImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

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
	 * @see analytics.models.modelssPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modelssPackageImpl() {
		super(eNS_URI, modelssFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link modelssPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modelssPackage init() {
		if (isInited)
			return (modelssPackage) EPackage.Registry.INSTANCE.getEPackage(modelssPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredmodelssPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		modelssPackageImpl themodelssPackage = registeredmodelssPackage instanceof modelssPackageImpl
				? (modelssPackageImpl) registeredmodelssPackage
				: new modelssPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		modelssPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(servicesPackage.eNS_URI);
		servicesPackageImpl theservicesPackage = (servicesPackageImpl) (registeredPackage instanceof servicesPackageImpl
				? registeredPackage
				: servicesPackage.eINSTANCE);
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
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thedtosPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodelssPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modelssPackage.eNS_URI, themodelssPackage);
		return themodelssPackage;
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
		return (EAttribute) tweetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Text() {
		return (EAttribute) tweetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweet_Image() {
		return (EReference) tweetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Location() {
		return (EAttribute) tweetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweet_Feedback() {
		return (EReference) tweetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetImage() {
		return tweetImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetImage_Image() {
		return (EAttribute) tweetImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedback() {
		return feedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_ThumbsUp() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_TweetId() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelssFactory getmodelssFactory() {
		return (modelssFactory) getEFactoryInstance();
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
		tweetEClass = createEClass(TWEET);
		createEAttribute(tweetEClass, TWEET__ID);
		createEAttribute(tweetEClass, TWEET__TEXT);
		createEReference(tweetEClass, TWEET__IMAGE);
		createEAttribute(tweetEClass, TWEET__LOCATION);
		createEReference(tweetEClass, TWEET__FEEDBACK);

		tweetImageEClass = createEClass(TWEET_IMAGE);
		createEAttribute(tweetImageEClass, TWEET_IMAGE__IMAGE);

		feedbackEClass = createEClass(FEEDBACK);
		createEAttribute(feedbackEClass, FEEDBACK__THUMBS_UP);
		createEAttribute(feedbackEClass, FEEDBACK__TWEET_ID);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__PASSWORD);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tweetEClass, Tweet.class, "Tweet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTweet_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweet_Image(), this.getTweetImage(), null, "image", null, 0, -1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTweet_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, 1, Tweet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweet_Feedback(), this.getFeedback(), null, "feedback", null, 0, -1, Tweet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tweetImageEClass, TweetImage.class, "TweetImage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTweetImage_Image(), theXMLTypePackage.getByteObject(), "image", null, 0, 1, TweetImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedback_ThumbsUp(), theXMLTypePackage.getBoolean(), "thumbsUp", null, 0, 1, Feedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedback_TweetId(), theXMLTypePackage.getID(), "tweetId", null, 0, 1, Feedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //modelssPackageImpl
