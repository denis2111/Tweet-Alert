/**
 */
package webControllerE.models.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import webControllerE.WebControllerEPackage;

import webControllerE.controllers.controllersPackage;

import webControllerE.controllers.impl.controllersPackageImpl;

import webControllerE.impl.WebControllerEPackageImpl;

import webControllerE.models.ClassificationResponse;
import webControllerE.models.DisasterType;
import webControllerE.models.Image;
import webControllerE.models.LocalizedResponse;
import webControllerE.models.Response;
import webControllerE.models.ResponseBuilder;
import webControllerE.models.Tweet;
import webControllerE.models.modelsFactory;
import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modelsPackageImpl extends EPackageImpl implements modelsPackage {
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
	private EClass classificationResponseEClass = null;

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
	private EClass responseBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disasterTypeEEnum = null;

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
	 * @see webControllerE.models.modelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modelsPackageImpl() {
		super(eNS_URI, modelsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link modelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modelsPackage init() {
		if (isInited)
			return (modelsPackage) EPackage.Registry.INSTANCE.getEPackage(modelsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredmodelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		modelsPackageImpl themodelsPackage = registeredmodelsPackage instanceof modelsPackageImpl
				? (modelsPackageImpl) registeredmodelsPackage
				: new modelsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		controllersPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WebControllerEPackage.eNS_URI);
		WebControllerEPackageImpl theWebControllerEPackage = (WebControllerEPackageImpl) (registeredPackage instanceof WebControllerEPackageImpl
				? registeredPackage
				: WebControllerEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);
		controllersPackageImpl thecontrollersPackage = (controllersPackageImpl) (registeredPackage instanceof controllersPackageImpl
				? registeredPackage
				: controllersPackage.eINSTANCE);

		// Create package meta-data objects
		themodelsPackage.createPackageContents();
		theWebControllerEPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		themodelsPackage.initializePackageContents();
		theWebControllerEPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodelsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modelsPackage.eNS_URI, themodelsPackage);
		return themodelsPackage;
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
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Location() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationResponse() {
		return classificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationResponse_ClassificationLabel() {
		return (EAttribute) classificationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationResponse_Precision() {
		return (EAttribute) classificationResponseEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTweet_Location() {
		return (EAttribute) tweetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTweet_Text() {
		return (EAttribute) tweetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTweet_Image() {
		return (EReference) tweetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBuilder() {
		return responseBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBuilder_Location() {
		return (EAttribute) responseBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBuilder_ClassificationLabel() {
		return (EAttribute) responseBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBuilder_Precision() {
		return (EAttribute) responseBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseBuilder_Response() {
		return (EReference) responseBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedResponse() {
		return localizedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedResponse_Location() {
		return (EAttribute) localizedResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalizedResponse_Classificationresponse() {
		return (EReference) localizedResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisasterType() {
		return disasterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelsFactory getmodelsFactory() {
		return (modelsFactory) getEFactoryInstance();
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
		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__IMAGE);
		createEAttribute(imageEClass, IMAGE__LOCATION);

		classificationResponseEClass = createEClass(CLASSIFICATION_RESPONSE);
		createEAttribute(classificationResponseEClass, CLASSIFICATION_RESPONSE__CLASSIFICATION_LABEL);
		createEAttribute(classificationResponseEClass, CLASSIFICATION_RESPONSE__PRECISION);

		tweetEClass = createEClass(TWEET);
		createEAttribute(tweetEClass, TWEET__ID);
		createEAttribute(tweetEClass, TWEET__LOCATION);
		createEAttribute(tweetEClass, TWEET__TEXT);
		createEReference(tweetEClass, TWEET__IMAGE);

		responseBuilderEClass = createEClass(RESPONSE_BUILDER);
		createEAttribute(responseBuilderEClass, RESPONSE_BUILDER__LOCATION);
		createEAttribute(responseBuilderEClass, RESPONSE_BUILDER__CLASSIFICATION_LABEL);
		createEAttribute(responseBuilderEClass, RESPONSE_BUILDER__PRECISION);
		createEReference(responseBuilderEClass, RESPONSE_BUILDER__RESPONSE);

		responseEClass = createEClass(RESPONSE);

		localizedResponseEClass = createEClass(LOCALIZED_RESPONSE);
		createEAttribute(localizedResponseEClass, LOCALIZED_RESPONSE__LOCATION);
		createEReference(localizedResponseEClass, LOCALIZED_RESPONSE__CLASSIFICATIONRESPONSE);

		// Create enums
		disasterTypeEEnum = createEEnum(DISASTER_TYPE);
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
		responseEClass.getESuperTypes().add(this.getClassificationResponse());
		responseEClass.getESuperTypes().add(this.getLocalizedResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Image(), theXMLTypePackage.getByteObject(), "image", null, 0, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationResponseEClass, ClassificationResponse.class, "ClassificationResponse", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationResponse_ClassificationLabel(), this.getDisasterType(), "classificationLabel",
				"NO-DISASTER", 0, 1, ClassificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationResponse_Precision(), theXMLTypePackage.getFloat(), "precision", null, 0, 1,
				ClassificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tweetEClass, Tweet.class, "Tweet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTweet_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Tweet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTweet_Image(), this.getImage(), null, "image", null, 0, 1, Tweet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(responseBuilderEClass, ResponseBuilder.class, "ResponseBuilder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseBuilder_Location(), theXMLTypePackage.getString(), "location", null, 0, 1,
				ResponseBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseBuilder_ClassificationLabel(), this.getDisasterType(), "classificationLabel",
				"NO-DISASTER", 0, 1, ResponseBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseBuilder_Precision(), theXMLTypePackage.getFloat(), "precision", null, 0, 1,
				ResponseBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResponseBuilder_Response(), this.getResponse(), null, "response", null, 0, 1,
				ResponseBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localizedResponseEClass, LocalizedResponse.class, "LocalizedResponse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalizedResponse_Location(), theXMLTypePackage.getString(), "location", null, 0, 1,
				LocalizedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLocalizedResponse_Classificationresponse(), this.getClassificationResponse(), null,
				"classificationresponse", null, 1, 1, LocalizedResponse.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(disasterTypeEEnum, DisasterType.class, "DisasterType");
		addEEnumLiteral(disasterTypeEEnum, DisasterType.CYCLONE);
		addEEnumLiteral(disasterTypeEEnum, DisasterType.FLOOD);
		addEEnumLiteral(disasterTypeEEnum, DisasterType.EARTHQUAKE);
		addEEnumLiteral(disasterTypeEEnum, DisasterType.WILDFIRE);
		addEEnumLiteral(disasterTypeEEnum, DisasterType.NO_DISASTER);
	}

} //modelsPackageImpl
