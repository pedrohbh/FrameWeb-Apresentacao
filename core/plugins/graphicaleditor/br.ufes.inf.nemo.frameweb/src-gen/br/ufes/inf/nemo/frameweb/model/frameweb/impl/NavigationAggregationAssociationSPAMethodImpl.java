/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Aggregation Association SPA Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationSPAMethodImpl#getSpaMethod <em>Spa Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationSPAMethodImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationAggregationAssociationSPAMethodImpl extends MinimalEObjectImpl.Container
		implements NavigationAggregationAssociationSPAMethod
{
	/**
	 * The cached value of the '{@link #getSpaMethod() <em>Spa Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod spaMethod;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAggregationAssociationSPAMethodImpl()
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
		return FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerMethod getSpaMethod()
	{
		if (spaMethod != null && spaMethod.eIsProxy())
		{
			InternalEObject oldSpaMethod = (InternalEObject) spaMethod;
			spaMethod = (FrontControllerMethod) eResolveProxy(oldSpaMethod);
			if (spaMethod != oldSpaMethod)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD, oldSpaMethod,
							spaMethod));
			}
		}
		return spaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetSpaMethod()
	{
		return spaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaMethod(FrontControllerMethod newSpaMethod)
	{
		FrontControllerMethod oldSpaMethod = spaMethod;
		spaMethod = newSpaMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD, oldSpaMethod,
					spaMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__VALUE, oldValue, value));
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD:
			if (resolve)
				return getSpaMethod();
			return basicGetSpaMethod();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__VALUE:
			return getValue();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD:
			setSpaMethod((FrontControllerMethod) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__VALUE:
			setValue((String) newValue);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD:
			setSpaMethod((FrontControllerMethod) null);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__SPA_METHOD:
			return spaMethod != null;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_METHOD__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //NavigationAggregationAssociationSPAMethodImpl
