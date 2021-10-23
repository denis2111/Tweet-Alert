/**
 */
package analytics.security.impl;

import analytics.controllers.controllersPackage;

import analytics.controllers.impl.controllersPackageImpl;

import analytics.dtos.dtosPackage;

import analytics.dtos.impl.dtosPackageImpl;

import analytics.exceptions.exceptionsPackage;

import analytics.exceptions.impl.exceptionsPackageImpl;

import analytics.models.impl.modelssPackageImpl;

import analytics.models.modelssPackage;

import analytics.repositories.impl.repositoriesPackageImpl;

import analytics.repositories.repositoriesPackage;

import analytics.security.AuthenticationEntryPoint;
import analytics.security.JwtAuthenticationEntryPoint;
import analytics.security.JwtRequestFilter;
import analytics.security.JwtTokenUtil;
import analytics.security.JwtUserDetailsService;
import analytics.security.UserDetailsService;
import analytics.security.securityFactory;
import analytics.security.securityPackage;

import analytics.services.impl.servicesPackageImpl;

import analytics.services.servicesPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class securityPackageImpl extends EPackageImpl implements securityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtAuthenticationEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtRequestFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtUserDetailsServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDetailsServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtTokenUtilEClass = null;

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
	 * @see analytics.security.securityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private securityPackageImpl() {
		super(eNS_URI, securityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link securityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static securityPackage init() {
		if (isInited)
			return (securityPackage) EPackage.Registry.INSTANCE.getEPackage(securityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredsecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		securityPackageImpl thesecurityPackage = registeredsecurityPackage instanceof securityPackageImpl
				? (securityPackageImpl) registeredsecurityPackage
				: new securityPackageImpl();

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
		thesecurityPackage.createPackageContents();
		themodelssPackage.createPackageContents();
		theservicesPackage.createPackageContents();
		theexceptionsPackage.createPackageContents();
		therepositoriesPackage.createPackageContents();
		thedtosPackage.createPackageContents();
		thecontrollersPackage.createPackageContents();

		// Initialize created meta-data
		thesecurityPackage.initializePackageContents();
		themodelssPackage.initializePackageContents();
		theservicesPackage.initializePackageContents();
		theexceptionsPackage.initializePackageContents();
		therepositoriesPackage.initializePackageContents();
		thedtosPackage.initializePackageContents();
		thecontrollersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(securityPackage.eNS_URI, thesecurityPackage);
		return thesecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtAuthenticationEntryPoint() {
		return jwtAuthenticationEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtAuthenticationEntryPoint_SerialVersionUId() {
		return (EAttribute) jwtAuthenticationEntryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtAuthenticationEntryPoint__Commence__Object_Object_Exception() {
		return jwtAuthenticationEntryPointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationEntryPoint() {
		return authenticationEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtRequestFilter() {
		return jwtRequestFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtRequestFilter_Jwtuserdetailsservice() {
		return (EReference) jwtRequestFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtRequestFilter_Jwttokenutil() {
		return (EReference) jwtRequestFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtRequestFilter__DoFilterInternal__Object_Object() {
		return jwtRequestFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtUserDetailsService() {
		return jwtUserDetailsServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtUserDetailsService_Usersservice() {
		return (EReference) jwtUserDetailsServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtUserDetailsService__LoadUserByUsername() {
		return jwtUserDetailsServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDetailsService() {
		return userDetailsServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtTokenUtil() {
		return jwtTokenUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtTokenUtil_SerialVersionUID() {
		return (EAttribute) jwtTokenUtilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtTokenUtil_JWT_TOKEN_VALIDITY() {
		return (EAttribute) jwtTokenUtilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtTokenUtil__GetUsernameFromToken__String() {
		return jwtTokenUtilEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtTokenUtil__GetExpirationDateFromToken__String() {
		return jwtTokenUtilEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtTokenUtil__IsTokenExpired__String() {
		return jwtTokenUtilEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtTokenUtil__GenerateToken() {
		return jwtTokenUtilEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtTokenUtil__ValidateToken__String() {
		return jwtTokenUtilEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securityFactory getsecurityFactory() {
		return (securityFactory) getEFactoryInstance();
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
		jwtAuthenticationEntryPointEClass = createEClass(JWT_AUTHENTICATION_ENTRY_POINT);
		createEAttribute(jwtAuthenticationEntryPointEClass, JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID);
		createEOperation(jwtAuthenticationEntryPointEClass,
				JWT_AUTHENTICATION_ENTRY_POINT___COMMENCE__OBJECT_OBJECT_EXCEPTION);

		authenticationEntryPointEClass = createEClass(AUTHENTICATION_ENTRY_POINT);

		jwtRequestFilterEClass = createEClass(JWT_REQUEST_FILTER);
		createEReference(jwtRequestFilterEClass, JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE);
		createEReference(jwtRequestFilterEClass, JWT_REQUEST_FILTER__JWTTOKENUTIL);
		createEOperation(jwtRequestFilterEClass, JWT_REQUEST_FILTER___DO_FILTER_INTERNAL__OBJECT_OBJECT);

		jwtUserDetailsServiceEClass = createEClass(JWT_USER_DETAILS_SERVICE);
		createEReference(jwtUserDetailsServiceEClass, JWT_USER_DETAILS_SERVICE__USERSSERVICE);
		createEOperation(jwtUserDetailsServiceEClass, JWT_USER_DETAILS_SERVICE___LOAD_USER_BY_USERNAME);

		userDetailsServiceEClass = createEClass(USER_DETAILS_SERVICE);

		jwtTokenUtilEClass = createEClass(JWT_TOKEN_UTIL);
		createEAttribute(jwtTokenUtilEClass, JWT_TOKEN_UTIL__SERIAL_VERSION_UID);
		createEAttribute(jwtTokenUtilEClass, JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY);
		createEOperation(jwtTokenUtilEClass, JWT_TOKEN_UTIL___GET_USERNAME_FROM_TOKEN__STRING);
		createEOperation(jwtTokenUtilEClass, JWT_TOKEN_UTIL___GET_EXPIRATION_DATE_FROM_TOKEN__STRING);
		createEOperation(jwtTokenUtilEClass, JWT_TOKEN_UTIL___IS_TOKEN_EXPIRED__STRING);
		createEOperation(jwtTokenUtilEClass, JWT_TOKEN_UTIL___GENERATE_TOKEN);
		createEOperation(jwtTokenUtilEClass, JWT_TOKEN_UTIL___VALIDATE_TOKEN__STRING);
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
		exceptionsPackage theexceptionsPackage = (exceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(exceptionsPackage.eNS_URI);
		servicesPackage theservicesPackage = (servicesPackage) EPackage.Registry.INSTANCE
				.getEPackage(servicesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jwtAuthenticationEntryPointEClass.getESuperTypes().add(this.getAuthenticationEntryPoint());
		jwtUserDetailsServiceEClass.getESuperTypes().add(this.getUserDetailsService());

		// Initialize classes, features, and operations; add parameters
		initEClass(jwtAuthenticationEntryPointEClass, JwtAuthenticationEntryPoint.class, "JwtAuthenticationEntryPoint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJwtAuthenticationEntryPoint_SerialVersionUId(), theXMLTypePackage.getLong(),
				"serialVersionUId", null, 0, 1, JwtAuthenticationEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJwtAuthenticationEntryPoint__Commence__Object_Object_Exception(), null,
				"commence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnySimpleType(), "request", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnySimpleType(), "response", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theexceptionsPackage.getException(), "authenticationException", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authenticationEntryPointEClass, AuthenticationEntryPoint.class, "AuthenticationEntryPoint",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jwtRequestFilterEClass, JwtRequestFilter.class, "JwtRequestFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJwtRequestFilter_Jwtuserdetailsservice(), this.getJwtUserDetailsService(), null,
				"jwtuserdetailsservice", null, 0, 1, JwtRequestFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJwtRequestFilter_Jwttokenutil(), this.getJwtTokenUtil(), null, "jwttokenutil", null, 0, 1,
				JwtRequestFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJwtRequestFilter__DoFilterInternal__Object_Object(), null, "doFilterInternal", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnySimpleType(), "request", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnySimpleType(), "response", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jwtUserDetailsServiceEClass, JwtUserDetailsService.class, "JwtUserDetailsService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJwtUserDetailsService_Usersservice(), theservicesPackage.getUsersService(), null,
				"usersservice", null, 1, 1, JwtUserDetailsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJwtUserDetailsService__LoadUserByUsername(), theXMLTypePackage.getAnySimpleType(),
				"loadUserByUsername", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userDetailsServiceEClass, UserDetailsService.class, "UserDetailsService", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jwtTokenUtilEClass, JwtTokenUtil.class, "JwtTokenUtil", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJwtTokenUtil_SerialVersionUID(), theXMLTypePackage.getID(), "serialVersionUID", null, 0, 1,
				JwtTokenUtil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtTokenUtil_JWT_TOKEN_VALIDITY(), theXMLTypePackage.getLong(), "JWT_TOKEN_VALIDITY", null, 0,
				1, JwtTokenUtil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJwtTokenUtil__GetUsernameFromToken__String(), null, "getUsernameFromToken", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJwtTokenUtil__GetExpirationDateFromToken__String(), null, "getExpirationDateFromToken",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJwtTokenUtil__IsTokenExpired__String(), null, "isTokenExpired", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJwtTokenUtil__GenerateToken(), theXMLTypePackage.getToken(), "generateToken", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getJwtTokenUtil__ValidateToken__String(), null, "validateToken", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //securityPackageImpl
