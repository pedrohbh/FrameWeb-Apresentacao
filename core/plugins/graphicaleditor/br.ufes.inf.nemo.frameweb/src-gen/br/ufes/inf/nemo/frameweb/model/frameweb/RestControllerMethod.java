/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Controller Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getRequestMapping <em>Request Mapping</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getDesiredResponseStatus <em>Desired Response Status</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod()
 * @model
 * @generated
 */
public interface RestControllerMethod extends Operation {

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.HttpMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.HttpMethodType
	 * @see #setRequestType(HttpMethodType)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod_RequestType()
	 * @model
	 * @generated
	 */
	HttpMethodType getRequestType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.HttpMethodType
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(HttpMethodType value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' reference.
	 * @see #setMethodType(Type)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod_MethodType()
	 * @model ordered="false"
	 * @generated
	 */
	Type getMethodType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getMethodType <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' reference.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(Type value);

	/**
	 * Returns the value of the '<em><b>Request Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Mapping</em>' attribute.
	 * @see #setRequestMapping(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod_RequestMapping()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getRequestMapping();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getRequestMapping <em>Request Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Mapping</em>' attribute.
	 * @see #getRequestMapping()
	 * @generated
	 */
	void setRequestMapping(String value);

	/**
	 * Returns the value of the '<em><b>Desired Response Status</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.HttpStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Response Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Response Status</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.HttpStatus
	 * @see #setDesiredResponseStatus(HttpStatus)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getRestControllerMethod_DesiredResponseStatus()
	 * @model
	 * @generated
	 */
	HttpStatus getDesiredResponseStatus();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod#getDesiredResponseStatus <em>Desired Response Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Response Status</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.HttpStatus
	 * @see #getDesiredResponseStatus()
	 * @generated
	 */
	void setDesiredResponseStatus(HttpStatus value);
} // RestControllerMethod
