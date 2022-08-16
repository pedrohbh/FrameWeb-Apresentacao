/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.internal.impl.OperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerMethodImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerMethodImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerMethodImpl#getRequestMethod <em>Request Method</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class FrontControllerMethodImpl extends OperationImpl implements FrontControllerMethod
{
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
	 * The default value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected String requestMethod = REQUEST_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerMethodImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FramewebPackage.Literals.FRONT_CONTROLLER_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefault()
	{
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(boolean newIsDefault)
	{
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT,
					oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getMethodType()
	{
		if (methodType != null && methodType.eIsProxy())
		{
			InternalEObject oldMethodType = (InternalEObject) methodType;
			methodType = (Type) eResolveProxy(oldMethodType);
			if (methodType != oldMethodType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE, oldMethodType, methodType));
			}
		}
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetMethodType()
	{
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodType(Type newMethodType)
	{
		Type oldMethodType = methodType;
		methodType = newMethodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE,
					oldMethodType, methodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestMethod()
	{
		return requestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestMethod(String newRequestMethod)
	{
		String oldRequestMethod = requestMethod;
		requestMethod = newRequestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_METHOD__REQUEST_METHOD, oldRequestMethod, requestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
			return isIsDefault();
		case FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE:
			if (resolve)
				return getMethodType();
			return basicGetMethodType();
		case FramewebPackage.FRONT_CONTROLLER_METHOD__REQUEST_METHOD:
			return getRequestMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
			setIsDefault((Boolean) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE:
			setMethodType((Type) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__REQUEST_METHOD:
			setRequestMethod((String) newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
			setIsDefault(IS_DEFAULT_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE:
			setMethodType((Type) null);
			return;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__REQUEST_METHOD:
			setRequestMethod(REQUEST_METHOD_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
			return isDefault != IS_DEFAULT_EDEFAULT;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__METHOD_TYPE:
			return methodType != null;
		case FramewebPackage.FRONT_CONTROLLER_METHOD__REQUEST_METHOD:
			return REQUEST_METHOD_EDEFAULT == null ? requestMethod != null
					: !REQUEST_METHOD_EDEFAULT.equals(requestMethod);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDefault: ");
		result.append(isDefault);
		result.append(", requestMethod: ");
		result.append(requestMethod);
		result.append(')');
		return result.toString();
	}

} //FrontControllerMethodImpl
