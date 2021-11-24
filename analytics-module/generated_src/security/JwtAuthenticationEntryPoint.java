/**
 */
package analytics.security;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt Authentication Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.JwtAuthenticationEntryPoint#getSerialVersionUId <em>Serial Version UId</em>}</li>
 * </ul>
 *
 * @see analytics.security.securityPackage#getJwtAuthenticationEntryPoint()
 * @model
 * @generated
 */
public interface JwtAuthenticationEntryPoint extends AuthenticationEntryPoint {
	/**
	 * Returns the value of the '<em><b>Serial Version UId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UId</em>' attribute.
	 * @see #setSerialVersionUId(long)
	 * @see analytics.security.securityPackage#getJwtAuthenticationEntryPoint_SerialVersionUId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getSerialVersionUId();

	/**
	 * Sets the value of the '{@link analytics.security.JwtAuthenticationEntryPoint#getSerialVersionUId <em>Serial Version UId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Version UId</em>' attribute.
	 * @see #getSerialVersionUId()
	 * @generated
	 */
	void setSerialVersionUId(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" responseDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	void commence(Object request, Object response, analytics.exceptions.Exception authenticationException);

} // JwtAuthenticationEntryPoint
