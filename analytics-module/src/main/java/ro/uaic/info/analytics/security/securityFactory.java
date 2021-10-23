/**
 */
package analytics.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analytics.security.securityPackage
 * @generated
 */
public interface securityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	securityFactory eINSTANCE = analytics.security.impl.securityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jwt Authentication Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Authentication Entry Point</em>'.
	 * @generated
	 */
	JwtAuthenticationEntryPoint createJwtAuthenticationEntryPoint();

	/**
	 * Returns a new object of class '<em>Jwt Request Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Request Filter</em>'.
	 * @generated
	 */
	JwtRequestFilter createJwtRequestFilter();

	/**
	 * Returns a new object of class '<em>Jwt User Details Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt User Details Service</em>'.
	 * @generated
	 */
	JwtUserDetailsService createJwtUserDetailsService();

	/**
	 * Returns a new object of class '<em>Jwt Token Util</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Token Util</em>'.
	 * @generated
	 */
	JwtTokenUtil createJwtTokenUtil();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	securityPackage getsecurityPackage();

} //securityFactory
