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
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getSpaMethods <em>Spa Methods</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getSpaAttributes <em>Spa Attributes</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation()
 * @model
 * @generated
 */
public interface NavigationAggregationAssociation extends Association
{

	/**
	 * Returns the value of the '<em><b>Spa Methods</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Methods</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_SpaMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationAggregationAssociationSPAMethod> getSpaMethods();

	/**
	 * Returns the value of the '<em><b>Spa Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Attributes</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_SpaAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationAggregationAssociationSPAAttribute> getSpaAttributes();
} // NavigationAggregationAssociation
