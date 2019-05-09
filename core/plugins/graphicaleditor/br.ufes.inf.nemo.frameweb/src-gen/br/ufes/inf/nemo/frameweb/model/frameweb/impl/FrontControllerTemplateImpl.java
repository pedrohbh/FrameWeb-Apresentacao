/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getPageTemplate <em>Page Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getFormTemplate <em>Form Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class FrontControllerTemplateImpl extends FrameworkProfileImpl implements FrontControllerTemplate {
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
	 * The default value of the '{@link #getPageTemplate() <em>Page Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageTemplate() <em>Page Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTemplate()
	 * @generated
	 * @ordered
	 */
	protected String pageTemplate = PAGE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormTemplate() <em>Form Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormTemplate() <em>Form Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTemplate()
	 * @generated
	 * @ordered
	 */
	protected String formTemplate = FORM_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE, oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageTemplate() {
		return pageTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageTemplate(String newPageTemplate) {
		String oldPageTemplate = pageTemplate;
		pageTemplate = newPageTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE, oldPageTemplate, pageTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormTemplate() {
		return formTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormTemplate(String newFormTemplate) {
		String oldFormTemplate = formTemplate;
		formTemplate = newFormTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE, oldFormTemplate, formTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			return getPageTemplate();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			return getFormTemplate();
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
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			setPageTemplate((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			setFormTemplate((String) newValue);
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
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			setPageTemplate(PAGE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			setFormTemplate(FORM_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			return PAGE_TEMPLATE_EDEFAULT == null ? pageTemplate != null : !PAGE_TEMPLATE_EDEFAULT.equals(pageTemplate);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			return FORM_TEMPLATE_EDEFAULT == null ? formTemplate != null : !FORM_TEMPLATE_EDEFAULT.equals(formTemplate);
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
		result.append(", pageTemplate: ");
		result.append(pageTemplate);
		result.append(", formTemplate: ");
		result.append(formTemplate);
		result.append(')');
		return result.toString();
	}

} //FrontControllerTemplateImpl
