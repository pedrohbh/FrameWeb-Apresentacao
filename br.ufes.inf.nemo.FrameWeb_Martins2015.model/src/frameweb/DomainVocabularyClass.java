/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Vocabulary Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.DomainVocabularyClass#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getDomainVocabularyClass()
 * @model
 * @generated
 */
public interface DomainVocabularyClass extends org.eclipse.uml2.uml.Class {

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"prefix"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see frameweb.FramewebPackage#getDomainVocabularyClass_Prefix()
	 * @model default="prefix"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link frameweb.DomainVocabularyClass#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);
} // DomainVocabularyClass
