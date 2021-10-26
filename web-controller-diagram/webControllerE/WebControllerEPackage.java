/**
 */
package webControllerE;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import webControllerE.controllers.controllersPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webControllerE.WebControllerEFactory
 * @model kind="package"
 * @generated
 */
public interface WebControllerEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webControllerE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webControllerE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webControllerE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebControllerEPackage eINSTANCE = webControllerE.impl.WebControllerEPackageImpl.init();

	/**
	 * The meta object id for the '{@link webControllerE.ClassifierClient <em>Classifier Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webControllerE.ClassifierClient
	 * @see webControllerE.impl.WebControllerEPackageImpl#getClassifierClient()
	 * @generated
	 */
	int CLASSIFIER_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Tweet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT__TWEET = controllersPackage.NLP_CLIENT__TWEET;

	/**
	 * The feature id for the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT__RESPONSEBUILDER = controllersPackage.NLP_CLIENT__RESPONSEBUILDER;

	/**
	 * The feature id for the '<em><b>Responsebuilder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT__RESPONSEBUILDER = controllersPackage.NLP_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT_FEATURE_COUNT = controllersPackage.NLP_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Classify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT___CLASSIFY__TWEET = controllersPackage.NLP_CLIENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CLIENT_OPERATION_COUNT = controllersPackage.NLP_CLIENT_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link webControllerE.ClassifierClient <em>Classifier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Client</em>'.
	 * @see webControllerE.ClassifierClient
	 * @generated
	 */
	EClass getClassifierClient();

	/**
	 * Returns the meta object for the '{@link webControllerE.ClassifierClient#classify(webControllerE.models.Tweet) <em>Classify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classify</em>' operation.
	 * @see webControllerE.ClassifierClient#classify(webControllerE.models.Tweet)
	 * @generated
	 */
	EOperation getClassifierClient__Classify__Tweet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebControllerEFactory getWebControllerEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webControllerE.ClassifierClient <em>Classifier Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webControllerE.ClassifierClient
		 * @see webControllerE.impl.WebControllerEPackageImpl#getClassifierClient()
		 * @generated
		 */
		EClass CLASSIFIER_CLIENT = eINSTANCE.getClassifierClient();

		/**
		 * The meta object literal for the '<em><b>Classify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER_CLIENT___CLASSIFY__TWEET = eINSTANCE.getClassifierClient__Classify__Tweet();

	}

} //WebControllerEPackage
