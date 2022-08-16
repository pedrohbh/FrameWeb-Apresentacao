/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Aggregation Association SPA Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationSPAAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationSPAAttributeImpl#getSpaAttribute <em>Spa Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationAggregationAssociationSPAAttributeImpl extends MinimalEObjectImpl.Container
		implements NavigationAggregationAssociationSPAAttribute
{
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
	 * The cached value of the '{@link #getSpaAttribute() <em>Spa Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaAttribute()
	 * @generated
	 * @ordered
	 */
	protected UIComponentField spaAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAggregationAssociationSPAAttributeImpl()
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
		return FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE;
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
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIComponentField getSpaAttribute()
	{
		if (spaAttribute != null && spaAttribute.eIsProxy())
		{
			InternalEObject oldSpaAttribute = (InternalEObject) spaAttribute;
			spaAttribute = (UIComponentField) eResolveProxy(oldSpaAttribute);
			if (spaAttribute != oldSpaAttribute)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE,
							oldSpaAttribute, spaAttribute));
			}
		}
		return spaAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponentField basicGetSpaAttribute()
	{
		return spaAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaAttribute(UIComponentField newSpaAttribute)
	{
		UIComponentField oldSpaAttribute = spaAttribute;
		spaAttribute = newSpaAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE, oldSpaAttribute,
					spaAttribute));
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__VALUE:
			return getValue();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE:
			if (resolve)
				return getSpaAttribute();
			return basicGetSpaAttribute();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__VALUE:
			setValue((String) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE:
			setSpaAttribute((UIComponentField) newValue);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE:
			setSpaAttribute((UIComponentField) null);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION_SPA_ATTRIBUTE__SPA_ATTRIBUTE:
			return spaAttribute != null;
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

} //NavigationAggregationAssociationSPAAttributeImpl
