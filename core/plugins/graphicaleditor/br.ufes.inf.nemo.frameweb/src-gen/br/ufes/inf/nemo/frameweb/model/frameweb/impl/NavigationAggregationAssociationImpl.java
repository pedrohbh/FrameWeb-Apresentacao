/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 * </ul>
 *
 * @generated
 */
public class NavigationAggregationAssociationImpl extends AssociationImpl implements NavigationAggregationAssociation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAggregationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UIComponentField> getRelacoes() {
		if (relacoes == null) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			return getRelacoes();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			getRelacoes().clear();
			getRelacoes().addAll((Collection<? extends UIComponentField>) newValue);
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			getRelacoes().clear();
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
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__RELACOES:
			return relacoes != null && !relacoes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationAggregationAssociationImpl
