/**
 */
package uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.ExceptionHandler;
import uml2.ExecutableNode;
import uml2.Uml2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ExecutableNodeImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableNodeImpl extends ActivityNodeImpl implements ExecutableNode {
	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> handler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.EXECUTABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandler> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentWithInverseEList<ExceptionHandler>(ExceptionHandler.class, this, Uml2Package.EXECUTABLE_NODE__HANDLER, Uml2Package.EXCEPTION_HANDLER__PROTECTED_NODE);
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHandler()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				return getHandler();
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
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends ExceptionHandler>)newValue);
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
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				getHandler().clear();
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
			case Uml2Package.EXECUTABLE_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutableNodeImpl