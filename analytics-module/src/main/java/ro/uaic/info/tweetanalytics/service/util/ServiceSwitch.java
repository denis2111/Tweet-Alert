/**
 */
package service.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import service.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see service.ServicePackage
 * @generated
 */
public class ServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = ServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ServicePackage.TWEETS_SERVICE: {
				TweetsService tweetsService = (TweetsService)theEObject;
				T result = caseTweetsService(tweetsService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TWEETS_REPOSITORY: {
				TweetsRepository tweetsRepository = (TweetsRepository)theEObject;
				T result = caseTweetsRepository(tweetsRepository);
				if (result == null) result = caseJpaRepository(tweetsRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.JPA_REPOSITORY: {
				JpaRepository jpaRepository = (JpaRepository)theEObject;
				T result = caseJpaRepository(jpaRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TWEETS_CONTROLLER: {
				TweetsController tweetsController = (TweetsController)theEObject;
				T result = caseTweetsController(tweetsController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.FILTERING_SERVICE: {
				FilteringService filteringService = (FilteringService)theEObject;
				T result = caseFilteringService(filteringService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.FILTERING_RULE: {
				FilteringRule filteringRule = (FilteringRule)theEObject;
				T result = caseFilteringRule(filteringRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.LOCATION_FILTER_RULE: {
				LocationFilterRule locationFilterRule = (LocationFilterRule)theEObject;
				T result = caseLocationFilterRule(locationFilterRule);
				if (result == null) result = caseFilteringRule(locationFilterRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.LABEL_FILTER_RULE: {
				LabelFilterRule labelFilterRule = (LabelFilterRule)theEObject;
				T result = caseLabelFilterRule(labelFilterRule);
				if (result == null) result = caseFilteringRule(labelFilterRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.POPULARITY_FILTER_RULE: {
				PopularityFilterRule popularityFilterRule = (PopularityFilterRule)theEObject;
				T result = casePopularityFilterRule(popularityFilterRule);
				if (result == null) result = caseFilteringRule(popularityFilterRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tweets Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tweets Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTweetsService(TweetsService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tweets Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tweets Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTweetsRepository(TweetsRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jpa Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jpa Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJpaRepository(JpaRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tweets Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tweets Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTweetsController(TweetsController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringService(FilteringService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringRule(FilteringRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Filter Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationFilterRule(LocationFilterRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Filter Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelFilterRule(LabelFilterRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popularity Filter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popularity Filter Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopularityFilterRule(PopularityFilterRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ServiceSwitch
