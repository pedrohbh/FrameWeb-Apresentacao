/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Web Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getSrcPath <em>Src Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getViewPath <em>View Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getTemplatePath <em>Template Path</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration()
 * @model
 * @generated
 */
public interface FrameWebConfiguration extends FrameworkProfile {
	/**
	 * Returns the value of the '<em><b>Src Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Path</em>' attribute.
	 * @see #setSrcPath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_SrcPath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getSrcPath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getSrcPath <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Path</em>' attribute.
	 * @see #getSrcPath()
	 * @generated
	 */
	void setSrcPath(String value);

	/**
	 * Returns the value of the '<em><b>View Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Path</em>' attribute.
	 * @see #setViewPath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_ViewPath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getViewPath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getViewPath <em>View Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Path</em>' attribute.
	 * @see #getViewPath()
	 * @generated
	 */
	void setViewPath(String value);

	/**
	 * Returns the value of the '<em><b>Template Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Path</em>' attribute.
	 * @see #setTemplatePath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_TemplatePath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getTemplatePath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getTemplatePath <em>Template Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Path</em>' attribute.
	 * @see #getTemplatePath()
	 * @generated
	 */
	void setTemplatePath(String value);

} // FrameWebConfiguration
