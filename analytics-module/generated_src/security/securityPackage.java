/**
 */
package analytics.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see analytics.security.securityFactory
 * @model kind="package"
 * @generated
 */
public interface securityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	securityPackage eINSTANCE = analytics.security.impl.securityPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.security.AuthenticationEntryPoint <em>Authentication Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.AuthenticationEntryPoint
	 * @see analytics.security.impl.securityPackageImpl#getAuthenticationEntryPoint()
	 * @generated
	 */
	int AUTHENTICATION_ENTRY_POINT = 1;

	/**
	 * The number of structural features of the '<em>Authentication Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ENTRY_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Authentication Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ENTRY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.security.impl.JwtAuthenticationEntryPointImpl <em>Jwt Authentication Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.impl.JwtAuthenticationEntryPointImpl
	 * @see analytics.security.impl.securityPackageImpl#getJwtAuthenticationEntryPoint()
	 * @generated
	 */
	int JWT_AUTHENTICATION_ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Serial Version UId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID = AUTHENTICATION_ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jwt Authentication Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_AUTHENTICATION_ENTRY_POINT_FEATURE_COUNT = AUTHENTICATION_ENTRY_POINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Commence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_AUTHENTICATION_ENTRY_POINT___COMMENCE__OBJECT_OBJECT_EXCEPTION = AUTHENTICATION_ENTRY_POINT_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>Jwt Authentication Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_AUTHENTICATION_ENTRY_POINT_OPERATION_COUNT = AUTHENTICATION_ENTRY_POINT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link analytics.security.impl.JwtRequestFilterImpl <em>Jwt Request Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.impl.JwtRequestFilterImpl
	 * @see analytics.security.impl.securityPackageImpl#getJwtRequestFilter()
	 * @generated
	 */
	int JWT_REQUEST_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Jwtuserdetailsservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Jwttokenutil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_REQUEST_FILTER__JWTTOKENUTIL = 1;

	/**
	 * The number of structural features of the '<em>Jwt Request Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_REQUEST_FILTER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Do Filter Internal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_REQUEST_FILTER___DO_FILTER_INTERNAL__OBJECT_OBJECT = 0;

	/**
	 * The number of operations of the '<em>Jwt Request Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_REQUEST_FILTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link analytics.security.UserDetailsService <em>User Details Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.UserDetailsService
	 * @see analytics.security.impl.securityPackageImpl#getUserDetailsService()
	 * @generated
	 */
	int USER_DETAILS_SERVICE = 4;

	/**
	 * The number of structural features of the '<em>User Details Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILS_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User Details Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILS_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analytics.security.impl.JwtUserDetailsServiceImpl <em>Jwt User Details Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.impl.JwtUserDetailsServiceImpl
	 * @see analytics.security.impl.securityPackageImpl#getJwtUserDetailsService()
	 * @generated
	 */
	int JWT_USER_DETAILS_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Usersservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_USER_DETAILS_SERVICE__USERSSERVICE = USER_DETAILS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jwt User Details Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_USER_DETAILS_SERVICE_FEATURE_COUNT = USER_DETAILS_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load User By Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_USER_DETAILS_SERVICE___LOAD_USER_BY_USERNAME = USER_DETAILS_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jwt User Details Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_USER_DETAILS_SERVICE_OPERATION_COUNT = USER_DETAILS_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link analytics.security.impl.JwtTokenUtilImpl <em>Jwt Token Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.security.impl.JwtTokenUtilImpl
	 * @see analytics.security.impl.securityPackageImpl#getJwtTokenUtil()
	 * @generated
	 */
	int JWT_TOKEN_UTIL = 5;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL__SERIAL_VERSION_UID = 0;

	/**
	 * The feature id for the '<em><b>JWT TOKEN VALIDITY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY = 1;

	/**
	 * The number of structural features of the '<em>Jwt Token Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Username From Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL___GET_USERNAME_FROM_TOKEN__STRING = 0;

	/**
	 * The operation id for the '<em>Get Expiration Date From Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL___GET_EXPIRATION_DATE_FROM_TOKEN__STRING = 1;

	/**
	 * The operation id for the '<em>Is Token Expired</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL___IS_TOKEN_EXPIRED__STRING = 2;

	/**
	 * The operation id for the '<em>Generate Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL___GENERATE_TOKEN = 3;

	/**
	 * The operation id for the '<em>Validate Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL___VALIDATE_TOKEN__STRING = 4;

	/**
	 * The number of operations of the '<em>Jwt Token Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_TOKEN_UTIL_OPERATION_COUNT = 5;

	/**
	 * Returns the meta object for class '{@link analytics.security.JwtAuthenticationEntryPoint <em>Jwt Authentication Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Authentication Entry Point</em>'.
	 * @see analytics.security.JwtAuthenticationEntryPoint
	 * @generated
	 */
	EClass getJwtAuthenticationEntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link analytics.security.JwtAuthenticationEntryPoint#getSerialVersionUId <em>Serial Version UId</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UId</em>'.
	 * @see analytics.security.JwtAuthenticationEntryPoint#getSerialVersionUId()
	 * @see #getJwtAuthenticationEntryPoint()
	 * @generated
	 */
	EAttribute getJwtAuthenticationEntryPoint_SerialVersionUId();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtAuthenticationEntryPoint#commence(java.lang.Object, java.lang.Object, analytics.exceptions.Exception) <em>Commence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commence</em>' operation.
	 * @see analytics.security.JwtAuthenticationEntryPoint#commence(java.lang.Object, java.lang.Object, analytics.exceptions.Exception)
	 * @generated
	 */
	EOperation getJwtAuthenticationEntryPoint__Commence__Object_Object_Exception();

	/**
	 * Returns the meta object for class '{@link analytics.security.AuthenticationEntryPoint <em>Authentication Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Entry Point</em>'.
	 * @see analytics.security.AuthenticationEntryPoint
	 * @generated
	 */
	EClass getAuthenticationEntryPoint();

	/**
	 * Returns the meta object for class '{@link analytics.security.JwtRequestFilter <em>Jwt Request Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Request Filter</em>'.
	 * @see analytics.security.JwtRequestFilter
	 * @generated
	 */
	EClass getJwtRequestFilter();

	/**
	 * Returns the meta object for the reference '{@link analytics.security.JwtRequestFilter#getJwtuserdetailsservice <em>Jwtuserdetailsservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jwtuserdetailsservice</em>'.
	 * @see analytics.security.JwtRequestFilter#getJwtuserdetailsservice()
	 * @see #getJwtRequestFilter()
	 * @generated
	 */
	EReference getJwtRequestFilter_Jwtuserdetailsservice();

	/**
	 * Returns the meta object for the reference '{@link analytics.security.JwtRequestFilter#getJwttokenutil <em>Jwttokenutil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jwttokenutil</em>'.
	 * @see analytics.security.JwtRequestFilter#getJwttokenutil()
	 * @see #getJwtRequestFilter()
	 * @generated
	 */
	EReference getJwtRequestFilter_Jwttokenutil();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtRequestFilter#doFilterInternal(java.lang.Object, java.lang.Object) <em>Do Filter Internal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Filter Internal</em>' operation.
	 * @see analytics.security.JwtRequestFilter#doFilterInternal(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getJwtRequestFilter__DoFilterInternal__Object_Object();

	/**
	 * Returns the meta object for class '{@link analytics.security.JwtUserDetailsService <em>Jwt User Details Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt User Details Service</em>'.
	 * @see analytics.security.JwtUserDetailsService
	 * @generated
	 */
	EClass getJwtUserDetailsService();

	/**
	 * Returns the meta object for the reference '{@link analytics.security.JwtUserDetailsService#getUsersservice <em>Usersservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usersservice</em>'.
	 * @see analytics.security.JwtUserDetailsService#getUsersservice()
	 * @see #getJwtUserDetailsService()
	 * @generated
	 */
	EReference getJwtUserDetailsService_Usersservice();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtUserDetailsService#loadUserByUsername() <em>Load User By Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load User By Username</em>' operation.
	 * @see analytics.security.JwtUserDetailsService#loadUserByUsername()
	 * @generated
	 */
	EOperation getJwtUserDetailsService__LoadUserByUsername();

	/**
	 * Returns the meta object for class '{@link analytics.security.UserDetailsService <em>User Details Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Details Service</em>'.
	 * @see analytics.security.UserDetailsService
	 * @generated
	 */
	EClass getUserDetailsService();

	/**
	 * Returns the meta object for class '{@link analytics.security.JwtTokenUtil <em>Jwt Token Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Token Util</em>'.
	 * @see analytics.security.JwtTokenUtil
	 * @generated
	 */
	EClass getJwtTokenUtil();

	/**
	 * Returns the meta object for the attribute '{@link analytics.security.JwtTokenUtil#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see analytics.security.JwtTokenUtil#getSerialVersionUID()
	 * @see #getJwtTokenUtil()
	 * @generated
	 */
	EAttribute getJwtTokenUtil_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link analytics.security.JwtTokenUtil#getJWT_TOKEN_VALIDITY <em>JWT TOKEN VALIDITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JWT TOKEN VALIDITY</em>'.
	 * @see analytics.security.JwtTokenUtil#getJWT_TOKEN_VALIDITY()
	 * @see #getJwtTokenUtil()
	 * @generated
	 */
	EAttribute getJwtTokenUtil_JWT_TOKEN_VALIDITY();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtTokenUtil#getUsernameFromToken(java.lang.String) <em>Get Username From Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Username From Token</em>' operation.
	 * @see analytics.security.JwtTokenUtil#getUsernameFromToken(java.lang.String)
	 * @generated
	 */
	EOperation getJwtTokenUtil__GetUsernameFromToken__String();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtTokenUtil#getExpirationDateFromToken(java.lang.String) <em>Get Expiration Date From Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expiration Date From Token</em>' operation.
	 * @see analytics.security.JwtTokenUtil#getExpirationDateFromToken(java.lang.String)
	 * @generated
	 */
	EOperation getJwtTokenUtil__GetExpirationDateFromToken__String();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtTokenUtil#isTokenExpired(java.lang.String) <em>Is Token Expired</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Token Expired</em>' operation.
	 * @see analytics.security.JwtTokenUtil#isTokenExpired(java.lang.String)
	 * @generated
	 */
	EOperation getJwtTokenUtil__IsTokenExpired__String();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtTokenUtil#generateToken() <em>Generate Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Token</em>' operation.
	 * @see analytics.security.JwtTokenUtil#generateToken()
	 * @generated
	 */
	EOperation getJwtTokenUtil__GenerateToken();

	/**
	 * Returns the meta object for the '{@link analytics.security.JwtTokenUtil#validateToken(java.lang.String) <em>Validate Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Token</em>' operation.
	 * @see analytics.security.JwtTokenUtil#validateToken(java.lang.String)
	 * @generated
	 */
	EOperation getJwtTokenUtil__ValidateToken__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	securityFactory getsecurityFactory();

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
		 * The meta object literal for the '{@link analytics.security.impl.JwtAuthenticationEntryPointImpl <em>Jwt Authentication Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.impl.JwtAuthenticationEntryPointImpl
		 * @see analytics.security.impl.securityPackageImpl#getJwtAuthenticationEntryPoint()
		 * @generated
		 */
		EClass JWT_AUTHENTICATION_ENTRY_POINT = eINSTANCE.getJwtAuthenticationEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Serial Version UId</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_AUTHENTICATION_ENTRY_POINT__SERIAL_VERSION_UID = eINSTANCE
				.getJwtAuthenticationEntryPoint_SerialVersionUId();

		/**
		 * The meta object literal for the '<em><b>Commence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_AUTHENTICATION_ENTRY_POINT___COMMENCE__OBJECT_OBJECT_EXCEPTION = eINSTANCE
				.getJwtAuthenticationEntryPoint__Commence__Object_Object_Exception();

		/**
		 * The meta object literal for the '{@link analytics.security.AuthenticationEntryPoint <em>Authentication Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.AuthenticationEntryPoint
		 * @see analytics.security.impl.securityPackageImpl#getAuthenticationEntryPoint()
		 * @generated
		 */
		EClass AUTHENTICATION_ENTRY_POINT = eINSTANCE.getAuthenticationEntryPoint();

		/**
		 * The meta object literal for the '{@link analytics.security.impl.JwtRequestFilterImpl <em>Jwt Request Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.impl.JwtRequestFilterImpl
		 * @see analytics.security.impl.securityPackageImpl#getJwtRequestFilter()
		 * @generated
		 */
		EClass JWT_REQUEST_FILTER = eINSTANCE.getJwtRequestFilter();

		/**
		 * The meta object literal for the '<em><b>Jwtuserdetailsservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_REQUEST_FILTER__JWTUSERDETAILSSERVICE = eINSTANCE.getJwtRequestFilter_Jwtuserdetailsservice();

		/**
		 * The meta object literal for the '<em><b>Jwttokenutil</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_REQUEST_FILTER__JWTTOKENUTIL = eINSTANCE.getJwtRequestFilter_Jwttokenutil();

		/**
		 * The meta object literal for the '<em><b>Do Filter Internal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_REQUEST_FILTER___DO_FILTER_INTERNAL__OBJECT_OBJECT = eINSTANCE
				.getJwtRequestFilter__DoFilterInternal__Object_Object();

		/**
		 * The meta object literal for the '{@link analytics.security.impl.JwtUserDetailsServiceImpl <em>Jwt User Details Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.impl.JwtUserDetailsServiceImpl
		 * @see analytics.security.impl.securityPackageImpl#getJwtUserDetailsService()
		 * @generated
		 */
		EClass JWT_USER_DETAILS_SERVICE = eINSTANCE.getJwtUserDetailsService();

		/**
		 * The meta object literal for the '<em><b>Usersservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_USER_DETAILS_SERVICE__USERSSERVICE = eINSTANCE.getJwtUserDetailsService_Usersservice();

		/**
		 * The meta object literal for the '<em><b>Load User By Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_USER_DETAILS_SERVICE___LOAD_USER_BY_USERNAME = eINSTANCE
				.getJwtUserDetailsService__LoadUserByUsername();

		/**
		 * The meta object literal for the '{@link analytics.security.UserDetailsService <em>User Details Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.UserDetailsService
		 * @see analytics.security.impl.securityPackageImpl#getUserDetailsService()
		 * @generated
		 */
		EClass USER_DETAILS_SERVICE = eINSTANCE.getUserDetailsService();

		/**
		 * The meta object literal for the '{@link analytics.security.impl.JwtTokenUtilImpl <em>Jwt Token Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.security.impl.JwtTokenUtilImpl
		 * @see analytics.security.impl.securityPackageImpl#getJwtTokenUtil()
		 * @generated
		 */
		EClass JWT_TOKEN_UTIL = eINSTANCE.getJwtTokenUtil();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_TOKEN_UTIL__SERIAL_VERSION_UID = eINSTANCE.getJwtTokenUtil_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>JWT TOKEN VALIDITY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_TOKEN_UTIL__JWT_TOKEN_VALIDITY = eINSTANCE.getJwtTokenUtil_JWT_TOKEN_VALIDITY();

		/**
		 * The meta object literal for the '<em><b>Get Username From Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_TOKEN_UTIL___GET_USERNAME_FROM_TOKEN__STRING = eINSTANCE
				.getJwtTokenUtil__GetUsernameFromToken__String();

		/**
		 * The meta object literal for the '<em><b>Get Expiration Date From Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_TOKEN_UTIL___GET_EXPIRATION_DATE_FROM_TOKEN__STRING = eINSTANCE
				.getJwtTokenUtil__GetExpirationDateFromToken__String();

		/**
		 * The meta object literal for the '<em><b>Is Token Expired</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_TOKEN_UTIL___IS_TOKEN_EXPIRED__STRING = eINSTANCE.getJwtTokenUtil__IsTokenExpired__String();

		/**
		 * The meta object literal for the '<em><b>Generate Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_TOKEN_UTIL___GENERATE_TOKEN = eINSTANCE.getJwtTokenUtil__GenerateToken();

		/**
		 * The meta object literal for the '<em><b>Validate Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_TOKEN_UTIL___VALIDATE_TOKEN__STRING = eINSTANCE.getJwtTokenUtil__ValidateToken__String();

	}

} //securityPackage
