/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.Behavior;
import uml2.OpaqueExpression;
import uml2.Parameter;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.OpaqueExpressionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link uml2.impl.OpaqueExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml2.impl.OpaqueExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml2.impl.OpaqueExpressionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueExpressionImpl extends ValueSpecificationImpl implements OpaqueExpression {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> body;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.OPAQUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody() {
		if (body == null) {
			body = new EDataTypeEList<String>(String.class, this, Uml2Package.OPAQUE_EXPRESSION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, Uml2Package.OPAQUE_EXPRESSION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getResult() {
		Parameter result = basicGetResult();
		return result != null && result.eIsProxy() ? (Parameter)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetResult() {
		// TODO: implement this method to return the 'Result' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean oneReturnResultParameter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.OPAQUE_EXPRESSION__ONE_RETURN_RESULT_PARAMETER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "oneReturnResultParameter", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean onlyReturnResultParameters(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.OPAQUE_EXPRESSION__ONLY_RETURN_RESULT_PARAMETERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "onlyReturnResultParameters", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean languageBodySize(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.OPAQUE_EXPRESSION__LANGUAGE_BODY_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "languageBodySize", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isIntegral() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNonNegative() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isPositive() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter result() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer value() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case Uml2Package.OPAQUE_EXPRESSION__BODY:
				return getBody();
			case Uml2Package.OPAQUE_EXPRESSION__LANGUAGE:
				return getLanguage();
			case Uml2Package.OPAQUE_EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case Uml2Package.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case Uml2Package.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case Uml2Package.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				return;
			case Uml2Package.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				return behavior != null;
			case Uml2Package.OPAQUE_EXPRESSION__BODY:
				return body != null && !body.isEmpty();
			case Uml2Package.OPAQUE_EXPRESSION__LANGUAGE:
				return language != null && !language.isEmpty();
			case Uml2Package.OPAQUE_EXPRESSION__RESULT:
				return basicGetResult() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.OPAQUE_EXPRESSION___ONE_RETURN_RESULT_PARAMETER__DIAGNOSTICCHAIN_MAP:
				return oneReturnResultParameter((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.OPAQUE_EXPRESSION___ONLY_RETURN_RESULT_PARAMETERS__DIAGNOSTICCHAIN_MAP:
				return onlyReturnResultParameters((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.OPAQUE_EXPRESSION___LANGUAGE_BODY_SIZE__DIAGNOSTICCHAIN_MAP:
				return languageBodySize((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.OPAQUE_EXPRESSION___IS_INTEGRAL:
				return isIntegral();
			case Uml2Package.OPAQUE_EXPRESSION___IS_NON_NEGATIVE:
				return isNonNegative();
			case Uml2Package.OPAQUE_EXPRESSION___IS_POSITIVE:
				return isPositive();
			case Uml2Package.OPAQUE_EXPRESSION___RESULT:
				return result();
			case Uml2Package.OPAQUE_EXPRESSION___VALUE:
				return value();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //OpaqueExpressionImpl