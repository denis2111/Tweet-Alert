/**
 */
package analytics.services.impl;

import analytics.services.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class servicesFactoryImpl extends EFactoryImpl implements servicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static servicesFactory init() {
		try {
			servicesFactory theservicesFactory = (servicesFactory) EPackage.Registry.INSTANCE
					.getEFactory(servicesPackage.eNS_URI);
			if (theservicesFactory != null) {
				return theservicesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new servicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public servicesFactoryImpl() {
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
		case servicesPackage.TWEETS_SERVICE:
			return (EObject) createTweetsService();
		case servicesPackage.FEEDBACK_SERVICE:
			return createFeedbackService();
		case servicesPackage.USERS_SERVICE:
			return (EObject) createUsersService();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTweetsService() {
		TweetsServiceImpl tweetsService = new TweetsServiceImpl();
		return tweetsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackService createFeedbackService() {
		FeedbackServiceImpl feedbackService = new FeedbackServiceImpl();
		return feedbackService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUsersService() {
		UsersServiceImpl usersService = new UsersServiceImpl();
		return usersService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public servicesPackage getservicesPackage() {
		return (servicesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static servicesPackage getPackage() {
		return servicesPackage.eINSTANCE;
	}

} //servicesFactoryImpl
