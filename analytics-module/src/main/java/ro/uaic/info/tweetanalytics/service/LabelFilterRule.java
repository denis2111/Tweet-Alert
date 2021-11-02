/**
 */
package service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Filter Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see service.ServicePackage#getLabelFilterRule()
 * @model
 * @generated
 */
public interface LabelFilterRule extends FilteringRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" tweetsMany="false"
	 * @generated
	 */
	EList<?> filter(EList<?> tweets);

} // LabelFilterRule
