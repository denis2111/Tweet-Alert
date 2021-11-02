/**
 */
package service;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see service.ServicePackage
 * @generated
 */
public interface ServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceFactory eINSTANCE = service.impl.ServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tweets Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweets Service</em>'.
	 * @generated
	 */
	TweetsService createTweetsService();

	/**
	 * Returns a new object of class '<em>Tweets Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweets Repository</em>'.
	 * @generated
	 */
	TweetsRepository createTweetsRepository();

	/**
	 * Returns a new object of class '<em>Tweets Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweets Controller</em>'.
	 * @generated
	 */
	TweetsController createTweetsController();

	/**
	 * Returns a new object of class '<em>Filtering Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtering Service</em>'.
	 * @generated
	 */
	FilteringService createFilteringService();

	/**
	 * Returns a new object of class '<em>Location Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Filter Rule</em>'.
	 * @generated
	 */
	LocationFilterRule createLocationFilterRule();

	/**
	 * Returns a new object of class '<em>Label Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Filter Rule</em>'.
	 * @generated
	 */
	LabelFilterRule createLabelFilterRule();

	/**
	 * Returns a new object of class '<em>Popularity Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popularity Filter Rule</em>'.
	 * @generated
	 */
	PopularityFilterRule createPopularityFilterRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePackage getServicePackage();

} //ServiceFactory
