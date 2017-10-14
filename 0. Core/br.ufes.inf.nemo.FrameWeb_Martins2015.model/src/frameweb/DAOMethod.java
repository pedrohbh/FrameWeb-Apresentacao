/**
 */
package frameweb;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

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
	 * Returns the value of the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Type</em>' reference.
	 * @see #setMethodType(Type)
	 * @see frameweb.FramewebPackage#getDAOMethod_MethodType()
	 * @model ordered="false"
	 * @generated
	 */
	Type getMethodType();

	/**
	 * Sets the value of the '{@link frameweb.DAOMethod#getMethodType <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' reference.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(Type value);
} // DAOMethod
