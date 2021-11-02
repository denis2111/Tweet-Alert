/**
 */
package service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Filter Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see service.ServicePackage#getLocationFilterRule()
 * @model
 * @generated
 */
public interface LocationFilterRule extends FilteringRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" tweetsMany="false"
	 * @generated
	 */
	EList<?> filter(EList<?> tweets);

} // LocationFilterRule
