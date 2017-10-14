/**
 */
package frameweb;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.DomainMethod#getMethodType <em>Method Type</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getDomainMethod()
 * @model
 * @generated
 */
public interface DomainMethod extends Operation {

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Type</em>' reference.
	 * @see #setMethodType(Type)
	 * @see frameweb.FramewebPackage#getDomainMethod_MethodType()
	 * @model ordered="false"
	 * @generated
	 */
	Type getMethodType();

	/**
	 * Sets the value of the '{@link frameweb.DomainMethod#getMethodType <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' reference.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(Type value);
} // DomainMethod
