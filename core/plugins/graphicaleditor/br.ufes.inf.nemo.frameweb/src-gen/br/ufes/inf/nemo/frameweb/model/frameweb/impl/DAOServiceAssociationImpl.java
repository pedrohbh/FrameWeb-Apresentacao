/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Service Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class DAOServiceAssociationImpl extends AssociationImpl implements DAOServiceAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOServiceAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Property getSourceMember() {
		Property sourceMember = getMemberEnds().stream().filter(member -> member.getName().equals("Source")).findFirst()
				.get();

		return sourceMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Property getTargetMember() {
		Property targetMember = getMemberEnds().stream().filter(member -> member.getName().equals("Target")).findFirst()
				.get();

		return targetMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FramewebPackage.DAO_SERVICE_ASSOCIATION___GET_SOURCE_MEMBER:
			return getSourceMember();
		case FramewebPackage.DAO_SERVICE_ASSOCIATION___GET_TARGET_MEMBER:
			return getTargetMember();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DAOServiceAssociationImpl
