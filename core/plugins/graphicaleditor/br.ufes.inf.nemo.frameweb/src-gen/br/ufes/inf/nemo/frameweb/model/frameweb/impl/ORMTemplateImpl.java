/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORM Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getEnumerationClassTemplate <em>Enumeration Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAuthUserClassTemplate <em>Auth User Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAuthRoleClassTemplate <em>Auth Role Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAuthPermissionClassTemplate <em>Auth Permission Class Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ORMTemplateImpl extends FrameworkProfileImpl implements ORMTemplate
{
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
	 * The default value of the '{@link #getEnumerationClassTemplate() <em>Enumeration Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUMERATION_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumerationClassTemplate() <em>Enumeration Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String enumerationClassTemplate = ENUMERATION_CLASS_TEMPLATE_EDEFAULT;

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
	 * The default value of the '{@link #getAuthUserClassTemplate() <em>Auth User Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUserClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_USER_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthUserClassTemplate() <em>Auth User Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUserClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String authUserClassTemplate = AUTH_USER_CLASS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthRoleClassTemplate() <em>Auth Role Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthRoleClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_ROLE_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthRoleClassTemplate() <em>Auth Role Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthRoleClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String authRoleClassTemplate = AUTH_ROLE_CLASS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthPermissionClassTemplate() <em>Auth Permission Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthPermissionClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_PERMISSION_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthPermissionClassTemplate() <em>Auth Permission Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthPermissionClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String authPermissionClassTemplate = AUTH_PERMISSION_CLASS_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMTemplateImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FramewebPackage.Literals.ORM_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassTemplate()
	{
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassTemplate(String newClassTemplate)
	{
		String oldClassTemplate = classTemplate;
		classTemplate = newClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE,
					oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumerationClassTemplate()
	{
		return enumerationClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerationClassTemplate(String newEnumerationClassTemplate)
	{
		String oldEnumerationClassTemplate = enumerationClassTemplate;
		enumerationClassTemplate = newEnumerationClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE, oldEnumerationClassTemplate,
					enumerationClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassExtension()
	{
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassExtension(String newClassExtension)
	{
		String oldClassExtension = classExtension;
		classExtension = newClassExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION,
					oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthUserClassTemplate()
	{
		return authUserClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthUserClassTemplate(String newAuthUserClassTemplate)
	{
		String oldAuthUserClassTemplate = authUserClassTemplate;
		authUserClassTemplate = newAuthUserClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE, oldAuthUserClassTemplate,
					authUserClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthRoleClassTemplate()
	{
		return authRoleClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthRoleClassTemplate(String newAuthRoleClassTemplate)
	{
		String oldAuthRoleClassTemplate = authRoleClassTemplate;
		authRoleClassTemplate = newAuthRoleClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE, oldAuthRoleClassTemplate,
					authRoleClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthPermissionClassTemplate()
	{
		return authPermissionClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthPermissionClassTemplate(String newAuthPermissionClassTemplate)
	{
		String oldAuthPermissionClassTemplate = authPermissionClassTemplate;
		authPermissionClassTemplate = newAuthPermissionClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE, oldAuthPermissionClassTemplate,
					authPermissionClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			return getEnumerationClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE:
			return getAuthUserClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE:
			return getAuthRoleClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE:
			return getAuthPermissionClassTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			setEnumerationClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE:
			setAuthUserClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE:
			setAuthRoleClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE:
			setAuthPermissionClassTemplate((String) newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			setEnumerationClassTemplate(ENUMERATION_CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE:
			setAuthUserClassTemplate(AUTH_USER_CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE:
			setAuthRoleClassTemplate(AUTH_ROLE_CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE:
			setAuthPermissionClassTemplate(AUTH_PERMISSION_CLASS_TEMPLATE_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			return ENUMERATION_CLASS_TEMPLATE_EDEFAULT == null ? enumerationClassTemplate != null
					: !ENUMERATION_CLASS_TEMPLATE_EDEFAULT.equals(enumerationClassTemplate);
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE:
			return AUTH_USER_CLASS_TEMPLATE_EDEFAULT == null ? authUserClassTemplate != null
					: !AUTH_USER_CLASS_TEMPLATE_EDEFAULT.equals(authUserClassTemplate);
		case FramewebPackage.ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE:
			return AUTH_ROLE_CLASS_TEMPLATE_EDEFAULT == null ? authRoleClassTemplate != null
					: !AUTH_ROLE_CLASS_TEMPLATE_EDEFAULT.equals(authRoleClassTemplate);
		case FramewebPackage.ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE:
			return AUTH_PERMISSION_CLASS_TEMPLATE_EDEFAULT == null ? authPermissionClassTemplate != null
					: !AUTH_PERMISSION_CLASS_TEMPLATE_EDEFAULT.equals(authPermissionClassTemplate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (classTemplate: ");
		result.append(classTemplate);
		result.append(", enumerationClassTemplate: ");
		result.append(enumerationClassTemplate);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", authUserClassTemplate: ");
		result.append(authUserClassTemplate);
		result.append(", authRoleClassTemplate: ");
		result.append(authRoleClassTemplate);
		result.append(", authPermissionClassTemplate: ");
		result.append(authPermissionClassTemplate);
		result.append(')');
		return result.toString();
	}

} //ORMTemplateImpl
