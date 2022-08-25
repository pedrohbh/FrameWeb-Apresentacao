/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Aggregation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getSpaMethods <em>Spa Methods</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getSpaAttributes <em>Spa Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationAggregationAssociationImpl extends AssociationImpl implements NavigationAggregationAssociation
{
	/**
	 * The cached value of the '{@link #getSpaMethods() <em>Spa Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAggregationAssociationSPAMethod> spaMethods;

	/**
	 * The cached value of the '{@link #getSpaAttributes() <em>Spa Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAggregationAssociationSPAAttribute> spaAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAggregationAssociationImpl()
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
		return FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationAggregationAssociationSPAMethod> getSpaMethods()
	{
		if (spaMethods == null)
		{
			spaMethods = new EObjectContainmentEList<NavigationAggregationAssociationSPAMethod>(
					NavigationAggregationAssociationSPAMethod.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS);
		}
		return spaMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationAggregationAssociationSPAAttribute> getSpaAttributes()
	{
		if (spaAttributes == null)
		{
			spaAttributes = new EObjectContainmentEList<NavigationAggregationAssociationSPAAttribute>(
					NavigationAggregationAssociationSPAAttribute.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES);
		}
		return spaAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
			return ((InternalEList<?>) getSpaMethods()).basicRemove(otherEnd, msgs);
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			return ((InternalEList<?>) getSpaAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
			return getSpaMethods();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			return getSpaAttributes();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
			getSpaMethods().clear();
			getSpaMethods().addAll((Collection<? extends NavigationAggregationAssociationSPAMethod>) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			getSpaAttributes().clear();
			getSpaAttributes().addAll((Collection<? extends NavigationAggregationAssociationSPAAttribute>) newValue);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
			getSpaMethods().clear();
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			getSpaAttributes().clear();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
			return spaMethods != null && !spaMethods.isEmpty();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			return spaAttributes != null && !spaAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationAggregationAssociationImpl
