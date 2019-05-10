/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORM Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getEnumerationClassTemplate <em>Enumeration Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getClassExtension <em>Class Extension</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getORMTemplate()
 * @model
 * @generated
 */
public interface ORMTemplate extends FrameworkProfile {
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
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getORMTemplate_ClassTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getClassTemplate <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Template</em>' attribute.
	 * @see #getClassTemplate()
	 * @generated
	 */
	void setClassTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration Class Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Class Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Class Template</em>' attribute.
	 * @see #setEnumerationClassTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getORMTemplate_EnumerationClassTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getEnumerationClassTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getEnumerationClassTemplate <em>Enumeration Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Class Template</em>' attribute.
	 * @see #getEnumerationClassTemplate()
	 * @generated
	 */
	void setEnumerationClassTemplate(String value);

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
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getORMTemplate_ClassExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate#getClassExtension <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Extension</em>' attribute.
	 * @see #getClassExtension()
	 * @generated
	 */
	void setClassExtension(String value);

} // ORMTemplate
