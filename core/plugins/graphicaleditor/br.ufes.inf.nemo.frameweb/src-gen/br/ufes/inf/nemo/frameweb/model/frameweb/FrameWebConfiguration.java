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
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getFrameworkDefinitionPath <em>Framework Definition Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getPageExtension <em>Page Extension</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration()
 * @model
 * @generated
 */
public interface FrameWebConfiguration extends FrameworkProfile
{
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
	 * Returns the value of the '<em><b>Framework Definition Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Definition Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Definition Path</em>' attribute.
	 * @see #setFrameworkDefinitionPath(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_FrameworkDefinitionPath()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getFrameworkDefinitionPath();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getFrameworkDefinitionPath <em>Framework Definition Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Definition Path</em>' attribute.
	 * @see #getFrameworkDefinitionPath()
	 * @generated
	 */
	void setFrameworkDefinitionPath(String value);

	/**
	 * Returns the value of the '<em><b>Class Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Extension</em>' attribute.
	 * @see #setClassExtension(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_ClassExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getClassExtension <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Extension</em>' attribute.
	 * @see #getClassExtension()
	 * @generated
	 */
	void setClassExtension(String value);

	/**
	 * Returns the value of the '<em><b>Page Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Extension</em>' attribute.
	 * @see #setPageExtension(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getFrameWebConfiguration_PageExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getPageExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration#getPageExtension <em>Page Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Extension</em>' attribute.
	 * @see #getPageExtension()
	 * @generated
	 */
	void setPageExtension(String value);

} // FrameWebConfiguration
