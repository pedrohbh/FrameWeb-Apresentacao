/**
 */
package frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.ResultDependency#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getResultDependencyConstraint <em>Result Dependency Constraint</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getResultDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResultDependencyConstraint\r\n'"
 *        annotation="Comments ResultDependencyConstraint='A ResultDependency must have a FrontControllerClass as client and a NavigationClass as supplier.'"
 *        annotation="OCL ResultDependencyConstraint='(self.client.oclIsTypeOf(FrontControllerClass)) and (self.supplier.oclIsTypeOf(NavigationClass))'"
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Result Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Method</em>' reference.
	 * @see #setResultMethod(FrontControllerMethod)
	 * @see frameweb.FramewebPackage#getResultDependency_ResultMethod()
	 * @model
	 * @generated
	 */
	FrontControllerMethod getResultMethod();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getResultMethod <em>Result Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Method</em>' reference.
	 * @see #getResultMethod()
	 * @generated
	 */
	void setResultMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Result Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Dependency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Dependency Constraint</em>' containment reference.
	 * @see #setResultDependencyConstraint(ResultConstraint)
	 * @see frameweb.FramewebPackage#getResultDependency_ResultDependencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ResultConstraint getResultDependencyConstraint();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getResultDependencyConstraint <em>Result Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Dependency Constraint</em>' containment reference.
	 * @see #getResultDependencyConstraint()
	 * @generated
	 */
	void setResultDependencyConstraint(ResultConstraint value);

} // ResultDependency
