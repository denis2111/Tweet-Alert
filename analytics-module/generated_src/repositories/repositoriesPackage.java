/**
 */
package analytics.repositories;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see analytics.repositories.repositoriesFactory
 * @model kind="package"
 * @generated
 */
public interface repositoriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repositories";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "repositories";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "repositories";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	repositoriesPackage eINSTANCE = analytics.repositories.impl.repositoriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link analytics.repositories.JpaRepository <em>Jpa Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.repositories.JpaRepository
	 * @see analytics.repositories.impl.repositoriesPackageImpl#getJpaRepository()
	 * @generated
	 */
	int JPA_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Jpa Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Jpa Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Tweets Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see analytics.repositories.impl.repositoriesPackageImpl#getTweetsRepository()
	 * @generated
	 */
	int TWEETS_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Tweets Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY_FEATURE_COUNT = JPA_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tweets Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_REPOSITORY_OPERATION_COUNT = JPA_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analytics.repositories.FeedbackRepository <em>Feedback Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analytics.repositories.FeedbackRepository
	 * @see analytics.repositories.impl.repositoriesPackageImpl#getFeedbackRepository()
	 * @generated
	 */
	int FEEDBACK_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Feedback Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_REPOSITORY_FEATURE_COUNT = JPA_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feedback Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_REPOSITORY_OPERATION_COUNT = JPA_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Users Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see analytics.repositories.impl.repositoriesPackageImpl#getUsersRepository()
	 * @generated
	 */
	int USERS_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Users Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_REPOSITORY_FEATURE_COUNT = JPA_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Users Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_REPOSITORY_OPERATION_COUNT = JPA_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Tweets Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweets Repository</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getTweetsRepository();

	/**
	 * Returns the meta object for class '{@link analytics.repositories.FeedbackRepository <em>Feedback Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Repository</em>'.
	 * @see analytics.repositories.FeedbackRepository
	 * @generated
	 */
	EClass getFeedbackRepository();

	/**
	 * Returns the meta object for class '{@link analytics.repositories.JpaRepository <em>Jpa Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jpa Repository</em>'.
	 * @see analytics.repositories.JpaRepository
	 * @generated
	 */
	EClass getJpaRepository();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Users Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users Repository</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getUsersRepository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	repositoriesFactory getrepositoriesFactory();

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
		 * The meta object literal for the '{@link java.lang.Object <em>Tweets Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see analytics.repositories.impl.repositoriesPackageImpl#getTweetsRepository()
		 * @generated
		 */
		EClass TWEETS_REPOSITORY = eINSTANCE.getTweetsRepository();

		/**
		 * The meta object literal for the '{@link analytics.repositories.FeedbackRepository <em>Feedback Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.repositories.FeedbackRepository
		 * @see analytics.repositories.impl.repositoriesPackageImpl#getFeedbackRepository()
		 * @generated
		 */
		EClass FEEDBACK_REPOSITORY = eINSTANCE.getFeedbackRepository();

		/**
		 * The meta object literal for the '{@link analytics.repositories.JpaRepository <em>Jpa Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analytics.repositories.JpaRepository
		 * @see analytics.repositories.impl.repositoriesPackageImpl#getJpaRepository()
		 * @generated
		 */
		EClass JPA_REPOSITORY = eINSTANCE.getJpaRepository();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Users Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see analytics.repositories.impl.repositoriesPackageImpl#getUsersRepository()
		 * @generated
		 */
		EClass USERS_REPOSITORY = eINSTANCE.getUsersRepository();

	}

} //repositoriesPackage
