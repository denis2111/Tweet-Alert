/**
 */
package analytics.security;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt User Details Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.JwtUserDetailsService#getUsersservice <em>Usersservice</em>}</li>
 * </ul>
 *
 * @see analytics.security.securityPackage#getJwtUserDetailsService()
 * @model
 * @generated
 */
public interface JwtUserDetailsService extends UserDetailsService {
	/**
	 * Returns the value of the '<em><b>Usersservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usersservice</em>' reference.
	 * @see #setUsersservice(Object)
	 * @see analytics.security.securityPackage#getJwtUserDetailsService_Usersservice()
	 * @model type="analytics.services.UsersService" required="true"
	 * @generated
	 */
	Object getUsersservice();

	/**
	 * Sets the value of the '{@link analytics.security.JwtUserDetailsService#getUsersservice <em>Usersservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usersservice</em>' reference.
	 * @see #getUsersservice()
	 * @generated
	 */
	void setUsersservice(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object loadUserByUsername();

} // JwtUserDetailsService
