/**
 */
package service.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import service.ServicePackage;
import service.TweetsRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweets Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TweetsRepositoryImpl extends JpaRepositoryImpl implements TweetsRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TWEETS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object findById(int Id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> findAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateById(int Id, Object tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create(Object tweet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.TWEETS_REPOSITORY___FIND_BY_ID__INT:
				return findById((Integer)arguments.get(0));
			case ServicePackage.TWEETS_REPOSITORY___FIND_ALL:
				return findAll();
			case ServicePackage.TWEETS_REPOSITORY___UPDATE_BY_ID__INT_OBJECT:
				updateById((Integer)arguments.get(0), arguments.get(1));
				return null;
			case ServicePackage.TWEETS_REPOSITORY___CREATE__OBJECT:
				create(arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TweetsRepositoryImpl
