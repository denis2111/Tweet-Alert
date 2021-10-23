/**
 */
package analytics.security.util;

import analytics.security.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see analytics.security.securityPackage
 * @generated
 */
public class securitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static securityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securitySwitch() {
		if (modelPackage == null) {
			modelPackage = securityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case securityPackage.JWT_AUTHENTICATION_ENTRY_POINT: {
			JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint = (JwtAuthenticationEntryPoint) theEObject;
			T result = caseJwtAuthenticationEntryPoint(jwtAuthenticationEntryPoint);
			if (result == null)
				result = caseAuthenticationEntryPoint(jwtAuthenticationEntryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case securityPackage.AUTHENTICATION_ENTRY_POINT: {
			AuthenticationEntryPoint authenticationEntryPoint = (AuthenticationEntryPoint) theEObject;
			T result = caseAuthenticationEntryPoint(authenticationEntryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case securityPackage.JWT_REQUEST_FILTER: {
			JwtRequestFilter jwtRequestFilter = (JwtRequestFilter) theEObject;
			T result = caseJwtRequestFilter(jwtRequestFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case securityPackage.JWT_USER_DETAILS_SERVICE: {
			JwtUserDetailsService jwtUserDetailsService = (JwtUserDetailsService) theEObject;
			T result = caseJwtUserDetailsService(jwtUserDetailsService);
			if (result == null)
				result = caseUserDetailsService(jwtUserDetailsService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case securityPackage.USER_DETAILS_SERVICE: {
			UserDetailsService userDetailsService = (UserDetailsService) theEObject;
			T result = caseUserDetailsService(userDetailsService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case securityPackage.JWT_TOKEN_UTIL: {
			JwtTokenUtil jwtTokenUtil = (JwtTokenUtil) theEObject;
			T result = caseJwtTokenUtil(jwtTokenUtil);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt Authentication Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt Authentication Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtAuthenticationEntryPoint(JwtAuthenticationEntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationEntryPoint(AuthenticationEntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt Request Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt Request Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtRequestFilter(JwtRequestFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt User Details Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt User Details Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtUserDetailsService(JwtUserDetailsService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Details Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Details Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDetailsService(UserDetailsService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt Token Util</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt Token Util</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtTokenUtil(JwtTokenUtil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //securitySwitch
