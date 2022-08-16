/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Aggregation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getRelacoes <em>Relacoes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getSpaProperties <em>Spa Properties</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getSpaMethod <em>Spa Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getSpaAttribute <em>Spa Attribute</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation()
 * @model
 * @generated
 */
public interface NavigationAggregationAssociation extends Association
{

	/**
	 * Returns the value of the '<em><b>Relacoes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacoes</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_Relacoes()
	 * @model
	 * @generated
	 */
	EList<UIComponentField> getRelacoes();

	/**
	 * Returns the value of the '<em><b>Spa Properties</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationSPAProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Properties</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_SpaProperties()
	 * @model
	 * @generated
	 */
	EList<NavigationSPAProperties> getSpaProperties();

	/**
	 * Returns the value of the '<em><b>Spa Method</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Method</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_SpaMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationAggregationAssociationSPAMethod> getSpaMethod();

	/**
	 * Returns the value of the '<em><b>Spa Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Attribute</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_SpaAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationAggregationAssociationSPAAttribute> getSpaAttribute();
} // NavigationAggregationAssociation
