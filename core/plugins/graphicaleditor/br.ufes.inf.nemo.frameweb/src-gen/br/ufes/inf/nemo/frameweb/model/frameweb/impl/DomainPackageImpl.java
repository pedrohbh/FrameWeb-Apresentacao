/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class DomainPackageImpl extends PackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_PACKAGE;
	}

	@Override
	public List<DomainClass> getDomainClasses() {
		List<DomainClass> domainClasses = this.eContents().stream().filter(DomainClass.class::isInstance)
				.map(DomainClass.class::cast).collect(Collectors.toList());

		return domainClasses;
	}

} //DomainPackageImpl
