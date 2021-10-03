/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DI Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getInterfaceTemplate <em>Interface Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getAuthInterfaceTemplate <em>Auth Interface Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getAuthClassTemplate <em>Auth Class Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DITemplateImpl extends FrameworkProfileImpl implements DITemplate {
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
	 * The default value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected String classExtension = CLASS_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthInterfaceTemplate() <em>Auth Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_INTERFACE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthInterfaceTemplate() <em>Auth Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected String authInterfaceTemplate = AUTH_INTERFACE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthClassTemplate() <em>Auth Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthClassTemplate() <em>Auth Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String authClassTemplate = AUTH_CLASS_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DITemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DI_TEMPLATE;
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
	@Override
	public void setInterfaceTemplate(String newInterfaceTemplate) {
		String oldInterfaceTemplate = interfaceTemplate;
		interfaceTemplate = newInterfaceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE,
					oldInterfaceTemplate, interfaceTemplate));
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
	@Override
	public void setClassTemplate(String newClassTemplate) {
		String oldClassTemplate = classTemplate;
		classTemplate = newClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE,
					oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassExtension() {
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassExtension(String newClassExtension) {
		String oldClassExtension = classExtension;
		classExtension = newClassExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION,
					oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthInterfaceTemplate() {
		return authInterfaceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthInterfaceTemplate(String newAuthInterfaceTemplate) {
		String oldAuthInterfaceTemplate = authInterfaceTemplate;
		authInterfaceTemplate = newAuthInterfaceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE,
					oldAuthInterfaceTemplate, authInterfaceTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthClassTemplate() {
		return authClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthClassTemplate(String newAuthClassTemplate) {
		String oldAuthClassTemplate = authClassTemplate;
		authClassTemplate = newAuthClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__AUTH_CLASS_TEMPLATE,
					oldAuthClassTemplate, authClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			return getInterfaceTemplate();
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE:
			return getAuthInterfaceTemplate();
		case FramewebPackage.DI_TEMPLATE__AUTH_CLASS_TEMPLATE:
			return getAuthClassTemplate();
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
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE:
			setAuthInterfaceTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__AUTH_CLASS_TEMPLATE:
			setAuthClassTemplate((String) newValue);
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
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate(INTERFACE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE:
			setAuthInterfaceTemplate(AUTH_INTERFACE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__AUTH_CLASS_TEMPLATE:
			setAuthClassTemplate(AUTH_CLASS_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			return INTERFACE_TEMPLATE_EDEFAULT == null ? interfaceTemplate != null
					: !INTERFACE_TEMPLATE_EDEFAULT.equals(interfaceTemplate);
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE:
			return AUTH_INTERFACE_TEMPLATE_EDEFAULT == null ? authInterfaceTemplate != null
					: !AUTH_INTERFACE_TEMPLATE_EDEFAULT.equals(authInterfaceTemplate);
		case FramewebPackage.DI_TEMPLATE__AUTH_CLASS_TEMPLATE:
			return AUTH_CLASS_TEMPLATE_EDEFAULT == null ? authClassTemplate != null
					: !AUTH_CLASS_TEMPLATE_EDEFAULT.equals(authClassTemplate);
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
		result.append(" (interfaceTemplate: ");
		result.append(interfaceTemplate);
		result.append(", classTemplate: ");
		result.append(classTemplate);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", authInterfaceTemplate: ");
		result.append(authInterfaceTemplate);
		result.append(", authClassTemplate: ");
		result.append(authClassTemplate);
		result.append(')');
		return result.toString();
	}

} //DITemplateImpl
