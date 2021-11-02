/**
 */
package service.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import service.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init() {
		try {
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null) {
				return theServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServicePackage.TWEETS_SERVICE: return createTweetsService();
			case ServicePackage.TWEETS_REPOSITORY: return createTweetsRepository();
			case ServicePackage.TWEETS_CONTROLLER: return createTweetsController();
			case ServicePackage.FILTERING_SERVICE: return createFilteringService();
			case ServicePackage.LOCATION_FILTER_RULE: return createLocationFilterRule();
			case ServicePackage.LABEL_FILTER_RULE: return createLabelFilterRule();
			case ServicePackage.POPULARITY_FILTER_RULE: return createPopularityFilterRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsService createTweetsService() {
		TweetsServiceImpl tweetsService = new TweetsServiceImpl();
		return tweetsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsRepository createTweetsRepository() {
		TweetsRepositoryImpl tweetsRepository = new TweetsRepositoryImpl();
		return tweetsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweetsController createTweetsController() {
		TweetsControllerImpl tweetsController = new TweetsControllerImpl();
		return tweetsController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringService createFilteringService() {
		FilteringServiceImpl filteringService = new FilteringServiceImpl();
		return filteringService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationFilterRule createLocationFilterRule() {
		LocationFilterRuleImpl locationFilterRule = new LocationFilterRuleImpl();
		return locationFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelFilterRule createLabelFilterRule() {
		LabelFilterRuleImpl labelFilterRule = new LabelFilterRuleImpl();
		return labelFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopularityFilterRule createPopularityFilterRule() {
		PopularityFilterRuleImpl popularityFilterRule = new PopularityFilterRuleImpl();
		return popularityFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePackage getServicePackage() {
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage() {
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryImpl
