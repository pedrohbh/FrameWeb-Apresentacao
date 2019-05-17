/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.OperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Controller Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.RestControllerMethodImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.RestControllerMethodImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.RestControllerMethodImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.RestControllerMethodImpl#getRequestMapping <em>Request Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class RestControllerMethodImpl extends OperationImpl implements RestControllerMethod {
	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected String requestType = REQUEST_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected Type methodType;

	/**
	 * The default value of the '{@link #getRequestMapping() <em>Request Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_MAPPING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRequestMapping() <em>Request Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMapping()
	 * @generated
	 * @ordered
	 */
	protected String requestMapping = REQUEST_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestControllerMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.REST_CONTROLLER_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestType(String newRequestType) {
		String oldRequestType = requestType;
		requestType = newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_TYPE,
					oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.REST_CONTROLLER_METHOD__IS_DEFAULT,
					oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getMethodType() {
		if (methodType != null && methodType.eIsProxy()) {
			InternalEObject oldMethodType = (InternalEObject) methodType;
			methodType = (Type) eResolveProxy(oldMethodType);
			if (methodType != oldMethodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE, oldMethodType, methodType));
			}
		}
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetMethodType() {
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodType(Type newMethodType) {
		Type oldMethodType = methodType;
		methodType = newMethodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE,
					oldMethodType, methodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestMapping() {
		return requestMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestMapping(String newRequestMapping) {
		String oldRequestMapping = requestMapping;
		requestMapping = newRequestMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_MAPPING, oldRequestMapping, requestMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_TYPE:
			return getRequestType();
		case FramewebPackage.REST_CONTROLLER_METHOD__IS_DEFAULT:
			return isIsDefault();
		case FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE:
			if (resolve)
				return getMethodType();
			return basicGetMethodType();
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_MAPPING:
			return getRequestMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_TYPE:
			setRequestType((String) newValue);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__IS_DEFAULT:
			setIsDefault((Boolean) newValue);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE:
			setMethodType((Type) newValue);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_MAPPING:
			setRequestMapping((String) newValue);
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
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_TYPE:
			setRequestType(REQUEST_TYPE_EDEFAULT);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__IS_DEFAULT:
			setIsDefault(IS_DEFAULT_EDEFAULT);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE:
			setMethodType((Type) null);
			return;
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_MAPPING:
			setRequestMapping(REQUEST_MAPPING_EDEFAULT);
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
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_TYPE:
			return REQUEST_TYPE_EDEFAULT == null ? requestType != null : !REQUEST_TYPE_EDEFAULT.equals(requestType);
		case FramewebPackage.REST_CONTROLLER_METHOD__IS_DEFAULT:
			return isDefault != IS_DEFAULT_EDEFAULT;
		case FramewebPackage.REST_CONTROLLER_METHOD__METHOD_TYPE:
			return methodType != null;
		case FramewebPackage.REST_CONTROLLER_METHOD__REQUEST_MAPPING:
			return REQUEST_MAPPING_EDEFAULT == null ? requestMapping != null
					: !REQUEST_MAPPING_EDEFAULT.equals(requestMapping);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (requestType: ");
		result.append(requestType);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", requestMapping: ");
		result.append(requestMapping);
		result.append(')');
		return result.toString();
	}

} //RestControllerMethodImpl
