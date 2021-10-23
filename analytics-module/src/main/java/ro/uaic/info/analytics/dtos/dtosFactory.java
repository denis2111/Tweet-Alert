/**
 */
package analytics.dtos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analytics.dtos.dtosPackage
 * @generated
 */
public interface dtosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	dtosFactory eINSTANCE = analytics.dtos.impl.dtosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tweet Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tweet Dto</em>'.
	 * @generated
	 */
	TweetDto createTweetDto();

	/**
	 * Returns a new object of class '<em>Feedback Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Dto</em>'.
	 * @generated
	 */
	FeedbackDto createFeedbackDto();

	/**
	 * Returns a new object of class '<em>Verdict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verdict</em>'.
	 * @generated
	 */
	Verdict createVerdict();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	dtosPackage getdtosPackage();

} //dtosFactory
