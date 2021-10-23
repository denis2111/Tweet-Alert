/**
 */
package analytics.security.impl;

import analytics.security.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class securityFactoryImpl extends EFactoryImpl implements securityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static securityFactory init() {
		try {
			securityFactory thesecurityFactory = (securityFactory) EPackage.Registry.INSTANCE
					.getEFactory(securityPackage.eNS_URI);
			if (thesecurityFactory != null) {
				return thesecurityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new securityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT:
			return createJwtAuthenticationEntryPoint();
		case securityPackage.JWT_REQUEST_FILTER:
			return createJwtRequestFilter();
		case securityPackage.JWT_USER_DETAILS_SERVICE:
			return createJwtUserDetailsService();
		case securityPackage.JWT_TOKEN_UTIL:
			return createJwtTokenUtil();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtAuthenticationEntryPoint createJwtAuthenticationEntryPoint() {
		JwtAuthenticationEntryPointImpl jwtAuthenticationEntryPoint = new JwtAuthenticationEntryPointImpl();
		return jwtAuthenticationEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtRequestFilter createJwtRequestFilter() {
		JwtRequestFilterImpl jwtRequestFilter = new JwtRequestFilterImpl();
		return jwtRequestFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtUserDetailsService createJwtUserDetailsService() {
		JwtUserDetailsServiceImpl jwtUserDetailsService = new JwtUserDetailsServiceImpl();
		return jwtUserDetailsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtTokenUtil createJwtTokenUtil() {
		JwtTokenUtilImpl jwtTokenUtil = new JwtTokenUtilImpl();
		return jwtTokenUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securityPackage getsecurityPackage() {
		return (securityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static securityPackage getPackage() {
		return securityPackage.eINSTANCE;
	}

} //securityFactoryImpl
