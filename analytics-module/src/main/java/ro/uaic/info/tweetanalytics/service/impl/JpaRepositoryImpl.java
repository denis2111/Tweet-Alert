/**
 */
package service.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import service.JpaRepository;
import service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jpa Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JpaRepositoryImpl extends MinimalEObjectImpl.Container implements JpaRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JpaRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.JPA_REPOSITORY;
	}

} //JpaRepositoryImpl
