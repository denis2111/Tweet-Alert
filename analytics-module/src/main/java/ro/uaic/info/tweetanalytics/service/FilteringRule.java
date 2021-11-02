/**
 */
package service;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see service.ServicePackage#getFilteringRule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FilteringRule extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> filter(EObject objects);

} // FilteringRule
