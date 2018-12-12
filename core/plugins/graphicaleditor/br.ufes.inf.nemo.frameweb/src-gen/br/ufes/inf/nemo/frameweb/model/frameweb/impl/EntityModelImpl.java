/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EntityModelImpl extends FramewebModelImpl implements EntityModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ENTITY_MODEL;
	}

	@Override
	public DomainPackage getDomainPackage() {
		try {
			DomainPackage domainPackage = this.eContents()
				.stream()
				.filter(DomainPackage.class::isInstance)
				.map(DomainPackage.class::cast)
				.findFirst()
				.get();
			
			return domainPackage;

		} catch (NullPointerException e) {
			e.printStackTrace();
			return null;
		}
	}

} //EntityModelImpl
