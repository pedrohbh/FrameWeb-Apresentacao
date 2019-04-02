/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getTemplatesPath <em>Templates Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getViewsPath <em>Views Path</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebConfiguration()
 * @model
 * @generated
 */
public interface FramewebConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Path</em>' attribute.
	 * @see #setSourcePath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebConfiguration_SourcePath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getSourcePath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getSourcePath <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Path</em>' attribute.
	 * @see #getSourcePath()
	 * @generated
	 */
	void setSourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Templates Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates Path</em>' attribute.
	 * @see #setTemplatesPath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebConfiguration_TemplatesPath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getTemplatesPath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getTemplatesPath <em>Templates Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Templates Path</em>' attribute.
	 * @see #getTemplatesPath()
	 * @generated
	 */
	void setTemplatesPath(String value);

	/**
	 * Returns the value of the '<em><b>Views Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views Path</em>' attribute.
	 * @see #setViewsPath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFramewebConfiguration_ViewsPath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getViewsPath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration#getViewsPath <em>Views Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views Path</em>' attribute.
	 * @see #getViewsPath()
	 * @generated
	 */
	void setViewsPath(String value);

} // FramewebConfiguration
