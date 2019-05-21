/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getHttpStatus()
 * @model
 * @generated
 */
public enum HttpStatus implements Enumerator {
	/**
	 * The '<em><b>SUCCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(200, "SUCCESS", "SUCCESS"),
	/**
	 * The '<em><b>CREATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(201, "CREATED", "CREATED"),
	/**
	 * The '<em><b>NO CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENT(204, "NO_CONTENT", "NO_CONTENT"),
	/**
	 * The '<em><b>PARTIAL CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PARTIAL_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_CONTENT(206, "PARTIAL_CONTENT", "PARTIAL_CONTENT"),
	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BAD_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_REQUEST(400, "BAD_REQUEST", "BAD_REQUEST"),
	/**
	 * The '<em><b>NOT FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(404, "NOT_FOUND", "NOT_FOUND"),
	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_NOT_ALLOWED(405, "METHOD_NOT_ALLOWED", "METHOD_NOT_ALLOWED"),
	/**
	 * The '<em><b>CONFLICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(409, "CONFLICT", "CONFLICT");

	/**
	 * The '<em><b>SUCCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 200;

	/**
	 * The '<em><b>CREATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 201;

	/**
	 * The '<em><b>NO CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENT_VALUE = 204;

	/**
	 * The '<em><b>PARTIAL CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIAL CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_CONTENT_VALUE = 206;

	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_REQUEST_VALUE = 400;

	/**
	 * The '<em><b>NOT FOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT FOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 404;

	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD NOT ALLOWED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_NOT_ALLOWED_VALUE = 405;

	/**
	 * The '<em><b>CONFLICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFLICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 409;

	/**
	 * An array of all the '<em><b>Http Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HttpStatus[] VALUES_ARRAY = new HttpStatus[] { SUCCESS, CREATED, NO_CONTENT, PARTIAL_CONTENT,
			BAD_REQUEST, NOT_FOUND, METHOD_NOT_ALLOWED, CONFLICT, };

	/**
	 * A public read-only list of all the '<em><b>Http Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HttpStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus get(int value) {
		switch (value) {
		case SUCCESS_VALUE:
			return SUCCESS;
		case CREATED_VALUE:
			return CREATED;
		case NO_CONTENT_VALUE:
			return NO_CONTENT;
		case PARTIAL_CONTENT_VALUE:
			return PARTIAL_CONTENT;
		case BAD_REQUEST_VALUE:
			return BAD_REQUEST;
		case NOT_FOUND_VALUE:
			return NOT_FOUND;
		case METHOD_NOT_ALLOWED_VALUE:
			return METHOD_NOT_ALLOWED;
		case CONFLICT_VALUE:
			return CONFLICT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HttpStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //HttpStatus
