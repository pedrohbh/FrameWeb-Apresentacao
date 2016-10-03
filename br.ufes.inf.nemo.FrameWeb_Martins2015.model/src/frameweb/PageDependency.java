/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.PageDependency#getPageDependencyConstraint <em>Page Dependency Constraint</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getPageDependency()
 * @model annotation="Ecore constraints='PageDepencencyContent'"
 *        annotation="Comments PageDepencencyContent='A PageDependencyConstraint must have a Page as client and a Page or a Template as supplier.'"
 *        annotation="OCL PageDepencencyContent='(self.client.oclIsTypeOf(Page)) and ((self.supplier.oclIsTypeOf(Page)) or (self.supplier.oclIsTypeOf(Template)))'"
 * @generated
 */
public interface PageDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Page Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Dependency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Dependency Constraint</em>' containment reference.
	 * @see #setPageDependencyConstraint(PageConstraint)
	 * @see frameweb.FramewebPackage#getPageDependency_PageDependencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PageConstraint getPageDependencyConstraint();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getPageDependencyConstraint <em>Page Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Dependency Constraint</em>' containment reference.
	 * @see #getPageDependencyConstraint()
	 * @generated
	 */
	void setPageDependencyConstraint(PageConstraint value);

} // PageDependency
