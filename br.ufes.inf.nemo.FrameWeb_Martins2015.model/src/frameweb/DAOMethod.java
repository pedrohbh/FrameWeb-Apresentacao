/**
 */
package frameweb;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.DAOMethod#getMethodType <em>Method Type</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getDAOMethod()
 * @model
 * @generated
 */
public interface DAOMethod extends Operation {

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see #setMethodType(String)
	 * @see frameweb.FramewebPackage#getDAOMethod_MethodType()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getMethodType();

	/**
	 * Sets the value of the '{@link frameweb.DAOMethod#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(String value);
} // DAOMethod
