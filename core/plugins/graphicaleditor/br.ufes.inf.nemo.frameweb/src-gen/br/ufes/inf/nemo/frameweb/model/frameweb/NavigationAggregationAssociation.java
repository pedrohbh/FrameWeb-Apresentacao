/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

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
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation()
 * @model
 * @generated
 */
public interface NavigationAggregationAssociation extends Association {

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_LowerBound()
	 * @model default="1"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociation_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);
} // NavigationAggregationAssociation
