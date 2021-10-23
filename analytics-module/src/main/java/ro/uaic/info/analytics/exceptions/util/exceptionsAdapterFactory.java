/**
 */
package analytics.exceptions.util;

import analytics.exceptions.BadRequestException;
import analytics.exceptions.ControllerAdvice;
import analytics.exceptions.InternalErrorException;
import analytics.exceptions.NotFoundException;
import analytics.exceptions.exceptionsPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see analytics.exceptions.exceptionsPackage
 * @generated
 */
public class exceptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static exceptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = exceptionsPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected exceptionsSwitch<Adapter> modelSwitch = new exceptionsSwitch<Adapter>() {
		@Override
		public Adapter caseControllerAdvice(ControllerAdvice object) {
			return createControllerAdviceAdapter();
		}

		@Override
		public Adapter caseNotFoundException(NotFoundException object) {
			return createNotFoundExceptionAdapter();
		}

		@Override
		public Adapter caseException(analytics.exceptions.Exception object) {
			return createExceptionAdapter();
		}

		@Override
		public Adapter caseBadRequestException(BadRequestException object) {
			return createBadRequestExceptionAdapter();
		}

		@Override
		public Adapter caseInternalErrorException(InternalErrorException object) {
			return createInternalErrorExceptionAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.exceptions.ControllerAdvice <em>Controller Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.exceptions.ControllerAdvice
	 * @generated
	 */
	public Adapter createControllerAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.exceptions.NotFoundException <em>Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.exceptions.NotFoundException
	 * @generated
	 */
	public Adapter createNotFoundExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.exceptions.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.exceptions.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.exceptions.BadRequestException <em>Bad Request Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.exceptions.BadRequestException
	 * @generated
	 */
	public Adapter createBadRequestExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.exceptions.InternalErrorException <em>Internal Error Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.exceptions.InternalErrorException
	 * @generated
	 */
	public Adapter createInternalErrorExceptionAdapter() {
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

} //exceptionsAdapterFactory
