/**
 */
package analytics.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt Token Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analytics.security.JwtTokenUtil#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link analytics.security.JwtTokenUtil#getJWT_TOKEN_VALIDITY <em>JWT TOKEN VALIDITY</em>}</li>
 * </ul>
 *
 * @see analytics.security.securityPackage#getJwtTokenUtil()
 * @model
 * @generated
 */
public interface JwtTokenUtil extends EObject {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see #setSerialVersionUID(String)
	 * @see analytics.security.securityPackage#getJwtTokenUtil_SerialVersionUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getSerialVersionUID();

	/**
	 * Sets the value of the '{@link analytics.security.JwtTokenUtil#getSerialVersionUID <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Version UID</em>' attribute.
	 * @see #getSerialVersionUID()
	 * @generated
	 */
	void setSerialVersionUID(String value);

	/**
	 * Returns the value of the '<em><b>JWT TOKEN VALIDITY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JWT TOKEN VALIDITY</em>' attribute.
	 * @see #setJWT_TOKEN_VALIDITY(long)
	 * @see analytics.security.securityPackage#getJwtTokenUtil_JWT_TOKEN_VALIDITY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getJWT_TOKEN_VALIDITY();

	/**
	 * Sets the value of the '{@link analytics.security.JwtTokenUtil#getJWT_TOKEN_VALIDITY <em>JWT TOKEN VALIDITY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JWT TOKEN VALIDITY</em>' attribute.
	 * @see #getJWT_TOKEN_VALIDITY()
	 * @generated
	 */
	void setJWT_TOKEN_VALIDITY(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void getUsernameFromToken(String token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void getExpirationDateFromToken(String token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void isTokenExpired(String token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 * @generated
	 */
	String generateToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokenDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void validateToken(String token);

} // JwtTokenUtil
