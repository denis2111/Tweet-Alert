/**
 */
package analytics.dtos.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

import analytics.dtos.FeedbackDto;
import analytics.dtos.PredictionType;
import analytics.dtos.TweetDto;
import analytics.dtos.Verdict;
import analytics.dtos.dtosFactory;
import analytics.dtos.dtosPackage;

import analytics.exceptions.exceptionsPackage;

import analytics.exceptions.impl.exceptionsPackageImpl;

import analytics.models.impl.modelssPackageImpl;

import analytics.models.modelssPackage;

import analytics.repositories.impl.repositoriesPackageImpl;

import analytics.repositories.repositoriesPackage;

import analytics.security.impl.securityPackageImpl;

import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class dtosPackageImpl extends EPackageImpl implements dtosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetDtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackDtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verdictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predictionTypeEEnum = null;

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
	 * @see analytics.dtos.dtosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private dtosPackageImpl() {
		super(eNS_URI, dtosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link dtosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static dtosPackage init() {
		if (isInited)
			return (dtosPackage) EPackage.Registry.INSTANCE.getEPackage(dtosPackage.eNS_URI);

		// Obtain or create and register package
		Object registereddtosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		dtosPackageImpl thedtosPackage = registereddtosPackage instanceof dtosPackageImpl
				? (dtosPackageImpl) registereddtosPackage
				: new dtosPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		modelssPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modelssPackage.eNS_URI);
		modelssPackageImpl themodelssPackage = (modelssPackageImpl) (registeredPackage instanceof modelssPackageImpl
				? registeredPackage
				: modelssPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(servicesPackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);
		controllersPackageImpl thecontrollersPackage = (controllersPackageImpl) (registeredPackage instanceof controllersPackageImpl
				? registeredPackage
				: controllersPackage.eINSTANCE);

		// Create package meta-data objects
		thedtosPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		thedtosPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedtosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(dtosPackage.eNS_URI, thedtosPackage);
		return thedtosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetDto() {
		return tweetDtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetDto_FeedbackDto() {
		return (EReference) tweetDtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetDto_Text() {
		return (EAttribute) tweetDtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetDto_UID() {
		return (EAttribute) tweetDtoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweetDto_Verdict() {
		return (EReference) tweetDtoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweetDto_CompressedImage() {
		return (EAttribute) tweetDtoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackDto() {
		return feedbackDtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedbackDto_ThumbsUp() {
		return (EAttribute) feedbackDtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedbackDto_TweetId() {
		return (EAttribute) feedbackDtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerdict() {
		return verdictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerdict_PredictionType() {
		return (EAttribute) verdictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPredictionType() {
		return predictionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dtosFactory getdtosFactory() {
		return (dtosFactory) getEFactoryInstance();
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
		tweetDtoEClass = createEClass(TWEET_DTO);
		createEReference(tweetDtoEClass, TWEET_DTO__FEEDBACK_DTO);
		createEAttribute(tweetDtoEClass, TWEET_DTO__TEXT);
		createEAttribute(tweetDtoEClass, TWEET_DTO__UID);
		createEReference(tweetDtoEClass, TWEET_DTO__VERDICT);
		createEAttribute(tweetDtoEClass, TWEET_DTO__COMPRESSED_IMAGE);

		feedbackDtoEClass = createEClass(FEEDBACK_DTO);
		createEAttribute(feedbackDtoEClass, FEEDBACK_DTO__THUMBS_UP);
		createEAttribute(feedbackDtoEClass, FEEDBACK_DTO__TWEET_ID);

		verdictEClass = createEClass(VERDICT);
		createEAttribute(verdictEClass, VERDICT__PREDICTION_TYPE);

		// Create enums
		predictionTypeEEnum = createEEnum(PREDICTION_TYPE);
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
		initEClass(tweetDtoEClass, TweetDto.class, "TweetDto", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTweetDto_FeedbackDto(), this.getFeedbackDto(), null, "feedbackDto", null, 0, -1,
				TweetDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweetDto_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TweetDto.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweetDto_UID(), theXMLTypePackage.getID(), "UID", null, 0, 1, TweetDto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweetDto_Verdict(), this.getVerdict(), null, "verdict", null, 0, 1, TweetDto.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweetDto_CompressedImage(), theXMLTypePackage.getByte(), "compressedImage", null, 0, 1,
				TweetDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(feedbackDtoEClass, FeedbackDto.class, "FeedbackDto", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackDto_ThumbsUp(), theXMLTypePackage.getBoolean(), "thumbsUp", null, 0, 1,
				FeedbackDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackDto_TweetId(), theXMLTypePackage.getID(), "tweetId", null, 0, 1, FeedbackDto.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verdictEClass, Verdict.class, "Verdict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerdict_PredictionType(), this.getPredictionType(), "predictionType", "NO_DISASTER", 0, 1,
				Verdict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(predictionTypeEEnum, PredictionType.class, "PredictionType");
		addEEnumLiteral(predictionTypeEEnum, PredictionType.CYCLONE);
		addEEnumLiteral(predictionTypeEEnum, PredictionType.FLOOD);
		addEEnumLiteral(predictionTypeEEnum, PredictionType.EARTHQUAKE);
		addEEnumLiteral(predictionTypeEEnum, PredictionType.WILDFIRE);
		addEEnumLiteral(predictionTypeEEnum, PredictionType.NO_DISASTER);

		// Create resource
		createResource(eNS_URI);
	}

} //dtosPackageImpl
