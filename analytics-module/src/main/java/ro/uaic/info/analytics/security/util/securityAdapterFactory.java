/**
 */
package analytics.security.util;

import analytics.security.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see analytics.security.securityPackage
 * @generated
 */
public class securityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static securityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = securityPackage.eINSTANCE;
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
	protected securitySwitch<Adapter> modelSwitch = new securitySwitch<Adapter>() {
		@Override
		public Adapter caseJwtAuthenticationEntryPoint(JwtAuthenticationEntryPoint object) {
			return createJwtAuthenticationEntryPointAdapter();
		}

		@Override
		public Adapter caseAuthenticationEntryPoint(AuthenticationEntryPoint object) {
			return createAuthenticationEntryPointAdapter();
		}

		@Override
		public Adapter caseJwtRequestFilter(JwtRequestFilter object) {
			return createJwtRequestFilterAdapter();
		}

		@Override
		public Adapter caseJwtUserDetailsService(JwtUserDetailsService object) {
			return createJwtUserDetailsServiceAdapter();
		}

		@Override
		public Adapter caseUserDetailsService(UserDetailsService object) {
			return createUserDetailsServiceAdapter();
		}

		@Override
		public Adapter caseJwtTokenUtil(JwtTokenUtil object) {
			return createJwtTokenUtilAdapter();
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
	 * Creates a new adapter for an object of class '{@link analytics.security.JwtAuthenticationEntryPoint <em>Jwt Authentication Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.JwtAuthenticationEntryPoint
	 * @generated
	 */
	public Adapter createJwtAuthenticationEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.security.AuthenticationEntryPoint <em>Authentication Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.AuthenticationEntryPoint
	 * @generated
	 */
	public Adapter createAuthenticationEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.security.JwtRequestFilter <em>Jwt Request Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.JwtRequestFilter
	 * @generated
	 */
	public Adapter createJwtRequestFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.security.JwtUserDetailsService <em>Jwt User Details Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.JwtUserDetailsService
	 * @generated
	 */
	public Adapter createJwtUserDetailsServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.security.UserDetailsService <em>User Details Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.UserDetailsService
	 * @generated
	 */
	public Adapter createUserDetailsServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analytics.security.JwtTokenUtil <em>Jwt Token Util</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analytics.security.JwtTokenUtil
	 * @generated
	 */
	public Adapter createJwtTokenUtilAdapter() {
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

} //securityAdapterFactory
