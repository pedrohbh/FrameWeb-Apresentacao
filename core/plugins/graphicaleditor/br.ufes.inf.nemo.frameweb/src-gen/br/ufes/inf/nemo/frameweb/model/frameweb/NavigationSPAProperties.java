/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation SPA Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationSPAProperties#getSpaAttributes <em>Spa Attributes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationSPAProperties#getSpaMethods <em>Spa Methods</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationSPAProperties()
 * @model
 * @generated
 */
public interface NavigationSPAProperties extends EObject
{
	/**
	 * Returns the value of the '<em><b>Spa Attributes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Attributes</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationSPAProperties_SpaAttributes()
	 * @model
	 * @generated
	 */
	EList<UIComponentField> getSpaAttributes();

	/**
	 * Returns the value of the '<em><b>Spa Methods</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spa Methods</em>' reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationSPAProperties_SpaMethods()
	 * @model
	 * @generated
	 */
	EList<FrontControllerMethod> getSpaMethods();

} // NavigationSPAProperties
