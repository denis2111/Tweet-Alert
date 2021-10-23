/**
 */
package analytics.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt Request Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.JwtRequestFilter#getJwtuserdetailsservice <em>Jwtuserdetailsservice</em>}</li>
 *   <li>{@link analytics.security.JwtRequestFilter#getJwttokenutil <em>Jwttokenutil</em>}</li>
 * </ul>
 *
 * @see analytics.security.securityPackage#getJwtRequestFilter()
 * @model
 * @generated
 */
public interface JwtRequestFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Jwtuserdetailsservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jwtuserdetailsservice</em>' reference.
	 * @see #setJwtuserdetailsservice(JwtUserDetailsService)
	 * @see analytics.security.securityPackage#getJwtRequestFilter_Jwtuserdetailsservice()
	 * @model
	 * @generated
	 */
	JwtUserDetailsService getJwtuserdetailsservice();

	/**
	 * Sets the value of the '{@link analytics.security.JwtRequestFilter#getJwtuserdetailsservice <em>Jwtuserdetailsservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jwtuserdetailsservice</em>' reference.
	 * @see #getJwtuserdetailsservice()
	 * @generated
	 */
	void setJwtuserdetailsservice(JwtUserDetailsService value);

	/**
	 * Returns the value of the '<em><b>Jwttokenutil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jwttokenutil</em>' reference.
	 * @see #setJwttokenutil(JwtTokenUtil)
	 * @see analytics.security.securityPackage#getJwtRequestFilter_Jwttokenutil()
	 * @model
	 * @generated
	 */
	JwtTokenUtil getJwttokenutil();

	/**
	 * Sets the value of the '{@link analytics.security.JwtRequestFilter#getJwttokenutil <em>Jwttokenutil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jwttokenutil</em>' reference.
	 * @see #getJwttokenutil()
	 * @generated
	 */
	void setJwttokenutil(JwtTokenUtil value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" responseDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	void doFilterInternal(Object request, Object response);

} // JwtRequestFilter
