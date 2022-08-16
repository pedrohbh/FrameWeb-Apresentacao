/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Controller Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate#getClassExtension <em>Class Extension</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerTemplate()
 * @model
 * @generated
 */
public interface RestControllerTemplate extends FrameworkProfile
{

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
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerTemplate_ClassTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate#getClassTemplate <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Template</em>' attribute.
	 * @see #getClassTemplate()
	 * @generated
	 */
	void setClassTemplate(String value);

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
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerTemplate_ClassExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate#getClassExtension <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Extension</em>' attribute.
	 * @see #getClassExtension()
	 * @generated
	 */
	void setClassExtension(String value);
} // RestControllerTemplate
