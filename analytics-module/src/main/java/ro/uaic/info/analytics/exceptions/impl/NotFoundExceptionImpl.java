/**
 */
package analytics.exceptions.impl;

import analytics.exceptions.NotFoundException;
import analytics.exceptions.exceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Found Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotFoundExceptionImpl extends ExceptionImpl implements NotFoundException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotFoundExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exceptionsPackage.Literals.NOT_FOUND_EXCEPTION;
	}

} //NotFoundExceptionImpl
