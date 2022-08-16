/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationSPAProperties;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getRelacoes <em>Relacoes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getSpaProperties <em>Spa Properties</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getSpaMethod <em>Spa Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.NavigationAggregationAssociationImpl#getSpaAttribute <em>Spa Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationAggregationAssociationImpl extends AssociationImpl implements NavigationAggregationAssociation
{
	/**
	 * The cached value of the '{@link #getRelacoes() <em>Relacoes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacoes()
	 * @generated
	 * @ordered
	 */
	protected EList<UIComponentField> relacoes;

	/**
	 * The cached value of the '{@link #getSpaProperties() <em>Spa Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationSPAProperties> spaProperties;

	/**
	 * The cached value of the '{@link #getSpaMethod() <em>Spa Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAggregationAssociationSPAMethod> spaMethod;

	/**
	 * The cached value of the '{@link #getSpaAttribute() <em>Spa Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAggregationAssociationSPAAttribute> spaAttribute;

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
	public EList<UIComponentField> getRelacoes()
	{
		if (relacoes == null)
		{
			relacoes = new EObjectResolvingEList<UIComponentField>(UIComponentField.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES);
		}
		return relacoes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationSPAProperties> getSpaProperties()
	{
		if (spaProperties == null)
		{
			spaProperties = new EObjectResolvingEList<NavigationSPAProperties>(NavigationSPAProperties.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_PROPERTIES);
		}
		return spaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationAggregationAssociationSPAMethod> getSpaMethod()
	{
		if (spaMethod == null)
		{
			spaMethod = new EObjectContainmentEList<NavigationAggregationAssociationSPAMethod>(
					NavigationAggregationAssociationSPAMethod.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD);
		}
		return spaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationAggregationAssociationSPAAttribute> getSpaAttribute()
	{
		if (spaAttribute == null)
		{
			spaAttribute = new EObjectContainmentEList<NavigationAggregationAssociationSPAAttribute>(
					NavigationAggregationAssociationSPAAttribute.class, this,
					FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE);
		}
		return spaAttribute;
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD:
			return ((InternalEList<?>) getSpaMethod()).basicRemove(otherEnd, msgs);
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE:
			return ((InternalEList<?>) getSpaAttribute()).basicRemove(otherEnd, msgs);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			return getRelacoes();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_PROPERTIES:
			return getSpaProperties();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD:
			return getSpaMethod();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE:
			return getSpaAttribute();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			getRelacoes().clear();
			getRelacoes().addAll((Collection<? extends UIComponentField>) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_PROPERTIES:
			getSpaProperties().clear();
			getSpaProperties().addAll((Collection<? extends NavigationSPAProperties>) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD:
			getSpaMethod().clear();
			getSpaMethod().addAll((Collection<? extends NavigationAggregationAssociationSPAMethod>) newValue);
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE:
			getSpaAttribute().clear();
			getSpaAttribute().addAll((Collection<? extends NavigationAggregationAssociationSPAAttribute>) newValue);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			getRelacoes().clear();
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_PROPERTIES:
			getSpaProperties().clear();
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD:
			getSpaMethod().clear();
			return;
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE:
			getSpaAttribute().clear();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			return relacoes != null && !relacoes.isEmpty();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_PROPERTIES:
			return spaProperties != null && !spaProperties.isEmpty();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHOD:
			return spaMethod != null && !spaMethod.isEmpty();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTE:
			return spaAttribute != null && !spaAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationAggregationAssociationImpl
