/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.VocabularyAssociation#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getVocabularyAssociation()
 * @model
 * @generated
 */
public interface VocabularyAssociation extends Association {

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see frameweb.FramewebPackage#getVocabularyAssociation_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link frameweb.VocabularyAssociation#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);
} // VocabularyAssociation
