/**
 */
package service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link service.FilteringService#getFilteringrule <em>Filteringrule</em>}</li>
 * </ul>
 *
 * @see service.ServicePackage#getFilteringService()
 * @model
 * @generated
 */
public interface FilteringService extends EObject {
	/**
	 * Returns the value of the '<em><b>Filteringrule</b></em>' containment reference list.
	 * The list contents are of type {@link service.FilteringRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filteringrule</em>' containment reference list.
	 * @see service.ServicePackage#getFilteringService_Filteringrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilteringRule> getFilteringrule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" objectsMany="false"
	 * @generated
	 */
	EList<?> filter(EList<?> objects);

} // FilteringService
