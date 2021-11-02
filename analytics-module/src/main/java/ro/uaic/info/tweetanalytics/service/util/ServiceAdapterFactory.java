/**
 */
package service.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import service.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see service.ServicePackage
 * @generated
 */
public class ServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSwitch<Adapter> modelSwitch =
		new ServiceSwitch<Adapter>() {
			@Override
			public Adapter caseTweetsService(TweetsService object) {
				return createTweetsServiceAdapter();
			}
			@Override
			public Adapter caseTweetsRepository(TweetsRepository object) {
				return createTweetsRepositoryAdapter();
			}
			@Override
			public Adapter caseJpaRepository(JpaRepository object) {
				return createJpaRepositoryAdapter();
			}
			@Override
			public Adapter caseTweetsController(TweetsController object) {
				return createTweetsControllerAdapter();
			}
			@Override
			public Adapter caseFilteringService(FilteringService object) {
				return createFilteringServiceAdapter();
			}
			@Override
			public Adapter caseFilteringRule(FilteringRule object) {
				return createFilteringRuleAdapter();
			}
			@Override
			public Adapter caseLocationFilterRule(LocationFilterRule object) {
				return createLocationFilterRuleAdapter();
			}
			@Override
			public Adapter caseLabelFilterRule(LabelFilterRule object) {
				return createLabelFilterRuleAdapter();
			}
			@Override
			public Adapter casePopularityFilterRule(PopularityFilterRule object) {
				return createPopularityFilterRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link service.TweetsService <em>Tweets Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.TweetsService
	 * @generated
	 */
	public Adapter createTweetsServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.TweetsRepository <em>Tweets Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.TweetsRepository
	 * @generated
	 */
	public Adapter createTweetsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.JpaRepository <em>Jpa Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.JpaRepository
	 * @generated
	 */
	public Adapter createJpaRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.TweetsController <em>Tweets Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.TweetsController
	 * @generated
	 */
	public Adapter createTweetsControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.FilteringService <em>Filtering Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.FilteringService
	 * @generated
	 */
	public Adapter createFilteringServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.FilteringRule <em>Filtering Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.FilteringRule
	 * @generated
	 */
	public Adapter createFilteringRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.LocationFilterRule <em>Location Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.LocationFilterRule
	 * @generated
	 */
	public Adapter createLocationFilterRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.LabelFilterRule <em>Label Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.LabelFilterRule
	 * @generated
	 */
	public Adapter createLabelFilterRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link service.PopularityFilterRule <em>Popularity Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see service.PopularityFilterRule
	 * @generated
	 */
	public Adapter createPopularityFilterRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServiceAdapterFactory
