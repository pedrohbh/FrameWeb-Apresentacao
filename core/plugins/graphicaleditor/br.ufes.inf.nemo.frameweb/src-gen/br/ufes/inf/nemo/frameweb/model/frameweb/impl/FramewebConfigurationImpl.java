/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebConfiguration;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebConfigurationImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebConfigurationImpl#getTemplatesPath <em>Templates Path</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FramewebConfigurationImpl#getViewsPath <em>Views Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramewebConfigurationImpl extends MinimalEObjectImpl.Container implements FramewebConfiguration {
	/**
	 * The default value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected String sourcePath = SOURCE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplatesPath() <em>Templates Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatesPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATES_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplatesPath() <em>Templates Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatesPath()
	 * @generated
	 * @ordered
	 */
	protected String templatesPath = TEMPLATES_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewsPath() <em>Views Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewsPath()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewsPath() <em>Views Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewsPath()
	 * @generated
	 * @ordered
	 */
	protected String viewsPath = VIEWS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramewebConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAMEWEB_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourcePath() {
		return sourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePath(String newSourcePath) {
		String oldSourcePath = sourcePath;
		sourcePath = newSourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAMEWEB_CONFIGURATION__SOURCE_PATH,
					oldSourcePath, sourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplatesPath() {
		return templatesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatesPath(String newTemplatesPath) {
		String oldTemplatesPath = templatesPath;
		templatesPath = newTemplatesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRAMEWEB_CONFIGURATION__TEMPLATES_PATH, oldTemplatesPath, templatesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewsPath() {
		return viewsPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewsPath(String newViewsPath) {
		String oldViewsPath = viewsPath;
		viewsPath = newViewsPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAMEWEB_CONFIGURATION__VIEWS_PATH,
					oldViewsPath, viewsPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.FRAMEWEB_CONFIGURATION__SOURCE_PATH:
			return getSourcePath();
		case FramewebPackage.FRAMEWEB_CONFIGURATION__TEMPLATES_PATH:
			return getTemplatesPath();
		case FramewebPackage.FRAMEWEB_CONFIGURATION__VIEWS_PATH:
			return getViewsPath();
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
		case FramewebPackage.FRAMEWEB_CONFIGURATION__SOURCE_PATH:
			setSourcePath((String) newValue);
			return;
		case FramewebPackage.FRAMEWEB_CONFIGURATION__TEMPLATES_PATH:
			setTemplatesPath((String) newValue);
			return;
		case FramewebPackage.FRAMEWEB_CONFIGURATION__VIEWS_PATH:
			setViewsPath((String) newValue);
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
		case FramewebPackage.FRAMEWEB_CONFIGURATION__SOURCE_PATH:
			setSourcePath(SOURCE_PATH_EDEFAULT);
			return;
		case FramewebPackage.FRAMEWEB_CONFIGURATION__TEMPLATES_PATH:
			setTemplatesPath(TEMPLATES_PATH_EDEFAULT);
			return;
		case FramewebPackage.FRAMEWEB_CONFIGURATION__VIEWS_PATH:
			setViewsPath(VIEWS_PATH_EDEFAULT);
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
		case FramewebPackage.FRAMEWEB_CONFIGURATION__SOURCE_PATH:
			return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
		case FramewebPackage.FRAMEWEB_CONFIGURATION__TEMPLATES_PATH:
			return TEMPLATES_PATH_EDEFAULT == null ? templatesPath != null
					: !TEMPLATES_PATH_EDEFAULT.equals(templatesPath);
		case FramewebPackage.FRAMEWEB_CONFIGURATION__VIEWS_PATH:
			return VIEWS_PATH_EDEFAULT == null ? viewsPath != null : !VIEWS_PATH_EDEFAULT.equals(viewsPath);
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
		result.append(" (sourcePath: ");
		result.append(sourcePath);
		result.append(", templatesPath: ");
		result.append(templatesPath);
		result.append(", viewsPath: ");
		result.append(viewsPath);
		result.append(')');
		return result.toString();
	}

} //FramewebConfigurationImpl
