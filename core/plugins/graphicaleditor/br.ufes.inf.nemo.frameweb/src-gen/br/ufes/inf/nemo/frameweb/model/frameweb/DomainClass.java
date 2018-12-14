/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import java.util.List;

import org.eclipse.uml2.uml.GeneralizationSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainClass()
 * @model
 * @generated
 */
public interface DomainClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainClass_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Extrai os metodos de uma classe de dominio
	 * 
	 * @return List<DomainMethod>
	 */
	public List<DomainMethod> getDomainMethods();

	/**
	 * Extrai a superclasse de uma classe de dominio
	 * 
	 * @param domainClass
	 */
	public GeneralizationSet getDomainGeneralization();

} // DomainClass
