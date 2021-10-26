/**
 */
package webControllerE.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import webControllerE.ClassifierClient;
import webControllerE.WebControllerEFactory;
import webControllerE.WebControllerEPackage;

import webControllerE.controllers.controllersPackage;

import webControllerE.controllers.impl.controllersPackageImpl;

import webControllerE.models.impl.modelsPackageImpl;

import webControllerE.models.modelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebControllerEPackageImpl extends EPackageImpl implements WebControllerEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierClientEClass = null;

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
	 * @see webControllerE.WebControllerEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebControllerEPackageImpl() {
		super(eNS_URI, WebControllerEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WebControllerEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebControllerEPackage init() {
		if (isInited)
			return (WebControllerEPackage) EPackage.Registry.INSTANCE.getEPackage(WebControllerEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWebControllerEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WebControllerEPackageImpl theWebControllerEPackage = registeredWebControllerEPackage instanceof WebControllerEPackageImpl
				? (WebControllerEPackageImpl) registeredWebControllerEPackage
				: new WebControllerEPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		controllersPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);
		controllersPackageImpl thecontrollersPackage = (controllersPackageImpl) (registeredPackage instanceof controllersPackageImpl
				? registeredPackage
				: controllersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modelsPackage.eNS_URI);
		modelsPackageImpl themodelsPackage = (modelsPackageImpl) (registeredPackage instanceof modelsPackageImpl
				? registeredPackage
				: modelsPackage.eINSTANCE);

		// Create package meta-data objects
		theWebControllerEPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();
		themodelsPackage.createPackageContents();

		// Initialize created meta-data
		theWebControllerEPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();
		themodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebControllerEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebControllerEPackage.eNS_URI, theWebControllerEPackage);
		return theWebControllerEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierClient() {
		return classifierClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifierClient__Classify__Tweet() {
		return classifierClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebControllerEFactory getWebControllerEFactory() {
		return (WebControllerEFactory) getEFactoryInstance();
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
		classifierClientEClass = createEClass(CLASSIFIER_CLIENT);
		createEOperation(classifierClientEClass, CLASSIFIER_CLIENT___CLASSIFY__TWEET);
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
		controllersPackage thecontrollersPackage = (controllersPackage) EPackage.Registry.INSTANCE
				.getEPackage(controllersPackage.eNS_URI);
		modelsPackage themodelsPackage = (modelsPackage) EPackage.Registry.INSTANCE.getEPackage(modelsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thecontrollersPackage);
		getESubpackages().add(themodelsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierClientEClass.getESuperTypes().add(thecontrollersPackage.getNLPClient());
		classifierClientEClass.getESuperTypes().add(thecontrollersPackage.getImageClassifierClient());

		// Initialize classes, features, and operations; add parameters
		initEClass(classifierClientEClass, ClassifierClient.class, "ClassifierClient", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getClassifierClient__Classify__Tweet(),
				themodelsPackage.getClassificationResponse(), "classify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, themodelsPackage.getTweet(), "tweet", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WebControllerEPackageImpl
