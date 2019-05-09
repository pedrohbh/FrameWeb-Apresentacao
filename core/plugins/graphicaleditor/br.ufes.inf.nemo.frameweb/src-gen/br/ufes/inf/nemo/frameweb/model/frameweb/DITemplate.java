/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DI Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceTemplate <em>Interface Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassTemplate <em>Class Template</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate()
 * @model
 * @generated
 */
public interface DITemplate extends FrameworkProfile {
	/**
	 * Returns the value of the '<em><b>Interface Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Template</em>' attribute.
	 * @see #setInterfaceTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_InterfaceTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getInterfaceTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceTemplate <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Template</em>' attribute.
	 * @see #getInterfaceTemplate()
	 * @generated
	 */
	void setInterfaceTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Class Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Template</em>' attribute.
	 * @see #setClassTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_ClassTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassTemplate <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Template</em>' attribute.
	 * @see #getClassTemplate()
	 * @generated
	 */
	void setClassTemplate(String value);

} // DITemplate
