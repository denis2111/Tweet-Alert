/**
 */
package webControllerE.controllers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webControllerE.controllers.*;

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
		case controllersPackage.NLP_CLIENT:
			return createNLPClient();
		case controllersPackage.IMAGE_CLASSIFIER_CLIENT:
			return createImageClassifierClient();
		case controllersPackage.WEB_CONTROLLER:
			return createWebController();
		case controllersPackage.ANALYTICS_CLIENT:
			return createAnalyticsClient();
		case controllersPackage.CHECK_EXISTANCE_RESPONSE:
			return createCheckExistanceResponse();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NLPClient createNLPClient() {
		NLPClientImpl nlpClient = new NLPClientImpl();
		return nlpClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageClassifierClient createImageClassifierClient() {
		ImageClassifierClientImpl imageClassifierClient = new ImageClassifierClientImpl();
		return imageClassifierClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebController createWebController() {
		WebControllerImpl webController = new WebControllerImpl();
		return webController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsClient createAnalyticsClient() {
		AnalyticsClientImpl analyticsClient = new AnalyticsClientImpl();
		return analyticsClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckExistanceResponse createCheckExistanceResponse() {
		CheckExistanceResponseImpl checkExistanceResponse = new CheckExistanceResponseImpl();
		return checkExistanceResponse;
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
