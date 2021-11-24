/**
 */
package analytics.controllers.impl;

import analytics.controllers.*;

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
public class controllersFactoryImpl extends EFactoryImpl implements controllersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static controllersFactory init() {
		try {
			controllersFactory thecontrollersFactory = (controllersFactory) EPackage.Registry.INSTANCE
					.getEFactory(controllersPackage.eNS_URI);
			if (thecontrollersFactory != null) {
				return thecontrollersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new controllersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public controllersFactoryImpl() {
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
		case controllersPackage.TWEETS_CONTROLLER:
			return (EObject) createTweetsController();
		case controllersPackage.FEEDBACK_CONTROLLER:
			return (EObject) createFeedbackController();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public FeedbaclController createFeedbackController() {
		FeedbackControllerImpl feedbackController = new FeedbackControllerImpl();
		return feedbackController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public controllersPackage getcontrollersPackage() {
		return (controllersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static controllersPackage getPackage() {
		return controllersPackage.eINSTANCE;
	}

} //controllersFactoryImpl
