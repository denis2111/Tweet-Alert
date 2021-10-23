/**
 */
package analytics.exceptions.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

import analytics.dtos.dtosPackage;

import analytics.dtos.impl.dtosPackageImpl;

import analytics.exceptions.BadRequestException;
import analytics.exceptions.ControllerAdvice;
import analytics.exceptions.InternalErrorException;
import analytics.exceptions.NotFoundException;
import analytics.exceptions.exceptionsFactory;
import analytics.exceptions.exceptionsPackage;

import analytics.models.impl.modelssPackageImpl;

import analytics.models.modelssPackage;

import analytics.repositories.impl.repositoriesPackageImpl;

import analytics.repositories.repositoriesPackage;

import analytics.security.impl.securityPackageImpl;

import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EClass;
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
public class exceptionsPackageImpl extends EPackageImpl implements exceptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerAdviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFoundExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badRequestExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalErrorExceptionEClass = null;

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
	 * @see analytics.exceptions.exceptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private exceptionsPackageImpl() {
		super(eNS_URI, exceptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link exceptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static exceptionsPackage init() {
		if (isInited)
			return (exceptionsPackage) EPackage.Registry.INSTANCE.getEPackage(exceptionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredexceptionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		exceptionsPackageImpl theexceptionsPackage = registeredexceptionsPackage instanceof exceptionsPackageImpl
				? (exceptionsPackageImpl) registeredexceptionsPackage
				: new exceptionsPackageImpl();

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
		theexceptionsPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		thesecurityPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thedtosPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		theexceptionsPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		thesecurityPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theexceptionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(exceptionsPackage.eNS_URI, theexceptionsPackage);
		return theexceptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerAdvice() {
		return controllerAdviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerAdvice_NotFoundException() {
		return (EReference) controllerAdviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerAdvice_BadRequestException() {
		return (EReference) controllerAdviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerAdvice_InternalErrorException() {
		return (EReference) controllerAdviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerAdvice__HandleNotFoundException__NotFoundException() {
		return controllerAdviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotFoundException() {
		return notFoundExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadRequestException() {
		return badRequestExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalErrorException() {
		return internalErrorExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionsFactory getexceptionsFactory() {
		return (exceptionsFactory) getEFactoryInstance();
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
		controllerAdviceEClass = createEClass(CONTROLLER_ADVICE);
		createEReference(controllerAdviceEClass, CONTROLLER_ADVICE__NOT_FOUND_EXCEPTION);
		createEReference(controllerAdviceEClass, CONTROLLER_ADVICE__BAD_REQUEST_EXCEPTION);
		createEReference(controllerAdviceEClass, CONTROLLER_ADVICE__INTERNAL_ERROR_EXCEPTION);
		createEOperation(controllerAdviceEClass, CONTROLLER_ADVICE___HANDLE_NOT_FOUND_EXCEPTION__NOTFOUNDEXCEPTION);

		notFoundExceptionEClass = createEClass(NOT_FOUND_EXCEPTION);

		exceptionEClass = createEClass(EXCEPTION);

		badRequestExceptionEClass = createEClass(BAD_REQUEST_EXCEPTION);

		internalErrorExceptionEClass = createEClass(INTERNAL_ERROR_EXCEPTION);
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
		notFoundExceptionEClass.getESuperTypes().add(this.getException());
		badRequestExceptionEClass.getESuperTypes().add(this.getException());
		internalErrorExceptionEClass.getESuperTypes().add(this.getException());

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerAdviceEClass, ControllerAdvice.class, "ControllerAdvice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerAdvice_NotFoundException(), this.getNotFoundException(), null, "notFoundException",
				null, 0, 1, ControllerAdvice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerAdvice_BadRequestException(), this.getBadRequestException(), null,
				"badRequestException", null, 0, 1, ControllerAdvice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerAdvice_InternalErrorException(), this.getInternalErrorException(), null,
				"internalErrorException", null, 0, 1, ControllerAdvice.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getControllerAdvice__HandleNotFoundException__NotFoundException(),
				theXMLTypePackage.getENTITY(), "handleNotFoundException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotFoundException(), "notFoundException", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notFoundExceptionEClass, NotFoundException.class, "NotFoundException", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionEClass, analytics.exceptions.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(badRequestExceptionEClass, BadRequestException.class, "BadRequestException", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalErrorExceptionEClass, InternalErrorException.class, "InternalErrorException", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //exceptionsPackageImpl
