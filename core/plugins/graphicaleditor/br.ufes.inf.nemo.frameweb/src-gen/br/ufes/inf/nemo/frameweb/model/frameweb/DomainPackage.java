/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainPackage()
 * @model
 * @generated
 */
public interface DomainPackage extends org.eclipse.uml2.uml.Package {

	/**
	 * Extrai as classes do dominio do pacote de dominio do modelo de entidades
	 * @return List<DomainClass>
	 */
	public List<DomainClass> getDomainClasses();
} // DomainPackage
