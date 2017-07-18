/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.VocabularyClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabularyClassImpl extends ClassImpl implements VocabularyClass {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VOCABULARY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY_CLASS__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.VOCABULARY_CLASS__PREFIX:
				return getPrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.VOCABULARY_CLASS__PREFIX:
				setPrefix((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FramewebPackage.VOCABULARY_CLASS__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FramewebPackage.VOCABULARY_CLASS__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

	@Override
	public Operation createOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier createNestedClassifier(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getNestedClassifier(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getNestedClassifier(String name, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.eclipse.uml2.uml.Class getSuperClass(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.eclipse.uml2.uml.Class getSuperClass(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception createOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception getOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception getOwnedReception(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Extension getExtension(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Extension getExtension(String name, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port createOwnedPort(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type, boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getPart(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getPart(String name, Type type, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectableElement getRole(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectableElement getRole(String name, Type type, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector createOwnedConnector(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector getOwnedConnector(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector getOwnedConnector(String name, boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior getOwnedBehavior(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior getOwnedBehavior(String name, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization createInterfaceRealization(String name, Interface contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization getInterfaceRealization(String name, Interface contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization getInterfaceRealization(String name, Interface contract, boolean ignoreCase,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}


} //VocabularyClassImpl
