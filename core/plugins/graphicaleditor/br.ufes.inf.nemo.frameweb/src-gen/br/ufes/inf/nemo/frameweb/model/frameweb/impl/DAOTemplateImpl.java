/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DAOTemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DAOTemplateImpl#getInterfaceTemplate <em>Interface Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAOTemplateImpl extends FrameworkProfileImpl implements DAOTemplate {
	/**
	 * The default value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String classTemplate = CLASS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceTemplate() <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceTemplate() <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected String interfaceTemplate = INTERFACE_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassTemplate() {
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setClassTemplate(String newClassTemplate) {
		String oldClassTemplate = classTemplate;
		classTemplate = newClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_TEMPLATE__CLASS_TEMPLATE,
					oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceTemplate() {
		return interfaceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setInterfaceTemplate(String newInterfaceTemplate) {
		String oldInterfaceTemplate = interfaceTemplate;
		interfaceTemplate = newInterfaceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_TEMPLATE__INTERFACE_TEMPLATE,
					oldInterfaceTemplate, interfaceTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.DAO_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.DAO_TEMPLATE__INTERFACE_TEMPLATE:
			return getInterfaceTemplate();
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
		case FramewebPackage.DAO_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.DAO_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate((String) newValue);
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
		case FramewebPackage.DAO_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DAO_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate(INTERFACE_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.DAO_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.DAO_TEMPLATE__INTERFACE_TEMPLATE:
			return INTERFACE_TEMPLATE_EDEFAULT == null ? interfaceTemplate != null
					: !INTERFACE_TEMPLATE_EDEFAULT.equals(interfaceTemplate);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (classTemplate: ");
		result.append(classTemplate);
		result.append(", interfaceTemplate: ");
		result.append(interfaceTemplate);
		result.append(')');
		return result.toString();
	}

} //DAOTemplateImpl
