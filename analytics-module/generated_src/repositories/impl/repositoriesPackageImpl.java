/**
 */
package analytics.repositories.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

import analytics.dtos.dtosPackage;

import analytics.dtos.impl.dtosPackageImpl;

import analytics.exceptions.exceptionsPackage;

import analytics.exceptions.impl.exceptionsPackageImpl;

import analytics.models.impl.modelssPackageImpl;

import analytics.models.modelssPackage;

import analytics.repositories.FeedbackRepository;
import analytics.repositories.JpaRepository;
import analytics.repositories.repositoriesFactory;
import analytics.repositories.repositoriesPackage;

import analytics.security.impl.securityPackageImpl;

import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class repositoriesPackageImpl extends EPackageImpl implements repositoriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersRepositoryEClass = null;

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
	 * @see analytics.repositories.repositoriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private repositoriesPackageImpl() {
		super(eNS_URI, repositoriesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link repositoriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static repositoriesPackage init() {
		if (isInited)
			return (repositoriesPackage) EPackage.Registry.INSTANCE.getEPackage(repositoriesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredrepositoriesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		repositoriesPackageImpl therepositoriesPackage = registeredrepositoriesPackage instanceof repositoriesPackageImpl
				? (repositoriesPackageImpl) registeredrepositoriesPackage
				: new repositoriesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		modelssPackage.eINSTANCE.eClass();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(dtosPackage.eNS_URI);
		dtosPackageImpl thedtosPackage = (dtosPackageImpl) (registeredPackage instanceof dtosPackageImpl
				? registeredPackage
				: dtosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(controllersPackage.eNS_URI);
		controllersPackageImpl thecontrollersPackage = (controllersPackageImpl) (registeredPackage instanceof controllersPackageImpl
				? registeredPackage
				: controllersPackage.eINSTANCE);

		// Create package meta-data objects
		therepositoriesPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		thedtosPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		therepositoriesPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		therepositoriesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(repositoriesPackage.eNS_URI, therepositoriesPackage);
		return therepositoriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTweetsRepository() {
		return tweetsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackRepository() {
		return feedbackRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJpaRepository() {
		return jpaRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsersRepository() {
		return usersRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repositoriesFactory getrepositoriesFactory() {
		return (repositoriesFactory) getEFactoryInstance();
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
		tweetsRepositoryEClass = createEClass(TWEETS_REPOSITORY);

		feedbackRepositoryEClass = createEClass(FEEDBACK_REPOSITORY);

		jpaRepositoryEClass = createEClass(JPA_REPOSITORY);

		usersRepositoryEClass = createEClass(USERS_REPOSITORY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tweetsRepositoryEClass.getESuperTypes().add(this.getJpaRepository());
		feedbackRepositoryEClass.getESuperTypes().add(this.getJpaRepository());
		usersRepositoryEClass.getESuperTypes().add(this.getJpaRepository());

		// Initialize classes, features, and operations; add parameters
		initEClass(tweetsRepositoryEClass, Object.class, "TweetsRepository", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(feedbackRepositoryEClass, FeedbackRepository.class, "FeedbackRepository", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jpaRepositoryEClass, JpaRepository.class, "JpaRepository", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(usersRepositoryEClass, Object.class, "UsersRepository", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //repositoriesPackageImpl
