/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationSPAProperties;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation SPA Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationSPAPropertiesImpl#getSpaAttributes <em>Spa Attributes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationSPAPropertiesImpl#getSpaMethods <em>Spa Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationSPAPropertiesImpl extends MinimalEObjectImpl.Container implements NavigationSPAProperties
{
	/**
	 * The cached value of the '{@link #getSpaAttributes() <em>Spa Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UIComponentField> spaAttributes;

	/**
	 * The cached value of the '{@link #getSpaMethods() <em>Spa Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<FrontControllerMethod> spaMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationSPAPropertiesImpl()
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
		return FramewebPackage.Literals.NAVIGATION_SPA_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UIComponentField> getSpaAttributes()
	{
		if (spaAttributes == null)
		{
			spaAttributes = new EObjectResolvingEList<UIComponentField>(UIComponentField.class, this,
					FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_ATTRIBUTES);
		}
		return spaAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrontControllerMethod> getSpaMethods()
	{
		if (spaMethods == null)
		{
			spaMethods = new EObjectResolvingEList<FrontControllerMethod>(FrontControllerMethod.class, this,
					FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_METHODS);
		}
		return spaMethods;
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
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_ATTRIBUTES:
			return getSpaAttributes();
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_METHODS:
			return getSpaMethods();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_ATTRIBUTES:
			getSpaAttributes().clear();
			getSpaAttributes().addAll((Collection<? extends UIComponentField>) newValue);
			return;
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_METHODS:
			getSpaMethods().clear();
			getSpaMethods().addAll((Collection<? extends FrontControllerMethod>) newValue);
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
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_ATTRIBUTES:
			getSpaAttributes().clear();
			return;
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_METHODS:
			getSpaMethods().clear();
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
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_ATTRIBUTES:
			return spaAttributes != null && !spaAttributes.isEmpty();
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES__SPA_METHODS:
			return spaMethods != null && !spaMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationSPAPropertiesImpl
