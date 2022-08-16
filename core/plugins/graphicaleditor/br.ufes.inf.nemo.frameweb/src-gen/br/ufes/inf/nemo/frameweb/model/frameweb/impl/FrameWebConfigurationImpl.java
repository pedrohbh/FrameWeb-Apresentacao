/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Web Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrameWebConfigurationImpl#getSrcPath <em>Src Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrameWebConfigurationImpl#getViewPath <em>View Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrameWebConfigurationImpl#getFrameworkDefinitionPath <em>Framework Definition Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrameWebConfigurationImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrameWebConfigurationImpl#getPageExtension <em>Page Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameWebConfigurationImpl extends FrameworkProfileImpl implements FrameWebConfiguration
{
	/**
	 * The default value of the '{@link #getSrcPath() <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcPath() <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPath()
	 * @generated
	 * @ordered
	 */
	protected String srcPath = SRC_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewPath() <em>View Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPath()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewPath() <em>View Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPath()
	 * @generated
	 * @ordered
	 */
	protected String viewPath = VIEW_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameworkDefinitionPath() <em>Framework Definition Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkDefinitionPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_DEFINITION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameworkDefinitionPath() <em>Framework Definition Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkDefinitionPath()
	 * @generated
	 * @ordered
	 */
	protected String frameworkDefinitionPath = FRAMEWORK_DEFINITION_PATH_EDEFAULT;

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
	 * The default value of the '{@link #getPageExtension() <em>Page Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageExtension() <em>Page Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageExtension()
	 * @generated
	 * @ordered
	 */
	protected String pageExtension = PAGE_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameWebConfigurationImpl()
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
		return FramewebPackage.Literals.FRAME_WEB_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrcPath()
	{
		return srcPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setSrcPath(String newSrcPath)
	{
		String oldSrcPath = srcPath;
		srcPath = newSrcPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAME_WEB_CONFIGURATION__SRC_PATH,
					oldSrcPath, srcPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewPath()
	{
		return viewPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setViewPath(String newViewPath)
	{
		String oldViewPath = viewPath;
		viewPath = newViewPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAME_WEB_CONFIGURATION__VIEW_PATH,
					oldViewPath, viewPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrameworkDefinitionPath()
	{
		return frameworkDefinitionPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setFrameworkDefinitionPath(String newFrameworkDefinitionPath)
	{
		String oldFrameworkDefinitionPath = frameworkDefinitionPath;
		frameworkDefinitionPath = newFrameworkDefinitionPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH, oldFrameworkDefinitionPath,
					frameworkDefinitionPath));
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
	@SuppressWarnings("restriction")
	@Override
	public void setClassExtension(String newClassExtension)
	{
		String oldClassExtension = classExtension;
		classExtension = newClassExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRAME_WEB_CONFIGURATION__CLASS_EXTENSION, oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageExtension()
	{
		return pageExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public void setPageExtension(String newPageExtension)
	{
		String oldPageExtension = pageExtension;
		pageExtension = newPageExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRAME_WEB_CONFIGURATION__PAGE_EXTENSION, oldPageExtension, pageExtension));
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
		case FramewebPackage.FRAME_WEB_CONFIGURATION__SRC_PATH:
			return getSrcPath();
		case FramewebPackage.FRAME_WEB_CONFIGURATION__VIEW_PATH:
			return getViewPath();
		case FramewebPackage.FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH:
			return getFrameworkDefinitionPath();
		case FramewebPackage.FRAME_WEB_CONFIGURATION__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.FRAME_WEB_CONFIGURATION__PAGE_EXTENSION:
			return getPageExtension();
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
		case FramewebPackage.FRAME_WEB_CONFIGURATION__SRC_PATH:
			setSrcPath((String) newValue);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__VIEW_PATH:
			setViewPath((String) newValue);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH:
			setFrameworkDefinitionPath((String) newValue);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__PAGE_EXTENSION:
			setPageExtension((String) newValue);
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
		case FramewebPackage.FRAME_WEB_CONFIGURATION__SRC_PATH:
			setSrcPath(SRC_PATH_EDEFAULT);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__VIEW_PATH:
			setViewPath(VIEW_PATH_EDEFAULT);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH:
			setFrameworkDefinitionPath(FRAMEWORK_DEFINITION_PATH_EDEFAULT);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.FRAME_WEB_CONFIGURATION__PAGE_EXTENSION:
			setPageExtension(PAGE_EXTENSION_EDEFAULT);
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
		case FramewebPackage.FRAME_WEB_CONFIGURATION__SRC_PATH:
			return SRC_PATH_EDEFAULT == null ? srcPath != null : !SRC_PATH_EDEFAULT.equals(srcPath);
		case FramewebPackage.FRAME_WEB_CONFIGURATION__VIEW_PATH:
			return VIEW_PATH_EDEFAULT == null ? viewPath != null : !VIEW_PATH_EDEFAULT.equals(viewPath);
		case FramewebPackage.FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH:
			return FRAMEWORK_DEFINITION_PATH_EDEFAULT == null ? frameworkDefinitionPath != null
					: !FRAMEWORK_DEFINITION_PATH_EDEFAULT.equals(frameworkDefinitionPath);
		case FramewebPackage.FRAME_WEB_CONFIGURATION__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.FRAME_WEB_CONFIGURATION__PAGE_EXTENSION:
			return PAGE_EXTENSION_EDEFAULT == null ? pageExtension != null
					: !PAGE_EXTENSION_EDEFAULT.equals(pageExtension);
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
		result.append(" (srcPath: ");
		result.append(srcPath);
		result.append(", viewPath: ");
		result.append(viewPath);
		result.append(", frameworkDefinitionPath: ");
		result.append(frameworkDefinitionPath);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", pageExtension: ");
		result.append(pageExtension);
		result.append(')');
		return result.toString();
	}

} //FrameWebConfigurationImpl
