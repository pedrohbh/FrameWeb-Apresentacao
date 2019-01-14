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
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAttributeTemplate <em>Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getGetterAndSetterTemplate <em>Getter And Setter Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getMethodTemplate <em>Method Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAbstractMethodTemplate <em>Abstract Method Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getEmbeddedAttributeTemplate <em>Embedded Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getIdAttributeTemplate <em>Id Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getVersionAttributeTemplate <em>Version Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getDecimalAttributeTemplate <em>Decimal Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getDateTimeAttributeTemplate <em>Date Time Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getLobAttributeTemplate <em>Lob Attribute Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ORMTemplateImpl extends FrameworkProfileImpl implements ORMTemplate {
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
	 * The default value of the '{@link #getAttributeTemplate() <em>Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeTemplate() <em>Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String attributeTemplate = ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetterAndSetterTemplate() <em>Getter And Setter Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterAndSetterTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_AND_SETTER_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterAndSetterTemplate() <em>Getter And Setter Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterAndSetterTemplate()
	 * @generated
	 * @ordered
	 */
	protected String getterAndSetterTemplate = GETTER_AND_SETTER_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodTemplate() <em>Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodTemplate() <em>Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected String methodTemplate = METHOD_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractMethodTemplate() <em>Abstract Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_METHOD_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractMethodTemplate() <em>Abstract Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected String abstractMethodTemplate = ABSTRACT_METHOD_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmbeddedAttributeTemplate() <em>Embedded Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String EMBEDDED_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmbeddedAttributeTemplate() <em>Embedded Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String embeddedAttributeTemplate = EMBEDDED_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdAttributeTemplate() <em>Id Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdAttributeTemplate() <em>Id Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String idAttributeTemplate = ID_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionAttributeTemplate() <em>Version Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionAttributeTemplate() <em>Version Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String versionAttributeTemplate = VERSION_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalAttributeTemplate() <em>Decimal Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalAttributeTemplate() <em>Decimal Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String decimalAttributeTemplate = DECIMAL_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTimeAttributeTemplate() <em>Date Time Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_TIME_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeAttributeTemplate() <em>Date Time Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String dateTimeAttributeTemplate = DATE_TIME_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLobAttributeTemplate() <em>Lob Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String LOB_ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLobAttributeTemplate() <em>Lob Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String lobAttributeTemplate = LOB_ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ORM_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassTemplate() {
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassTemplate(String newClassTemplate) {
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
	public String getClassExtension() {
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassExtension(String newClassExtension) {
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
	public String getAttributeTemplate() {
		return attributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeTemplate(String newAttributeTemplate) {
		String oldAttributeTemplate = attributeTemplate;
		attributeTemplate = newAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE,
					oldAttributeTemplate, attributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterAndSetterTemplate() {
		return getterAndSetterTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterAndSetterTemplate(String newGetterAndSetterTemplate) {
		String oldGetterAndSetterTemplate = getterAndSetterTemplate;
		getterAndSetterTemplate = newGetterAndSetterTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__GETTER_AND_SETTER_TEMPLATE, oldGetterAndSetterTemplate,
					getterAndSetterTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodTemplate() {
		return methodTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodTemplate(String newMethodTemplate) {
		String oldMethodTemplate = methodTemplate;
		methodTemplate = newMethodTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE,
					oldMethodTemplate, methodTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractMethodTemplate() {
		return abstractMethodTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractMethodTemplate(String newAbstractMethodTemplate) {
		String oldAbstractMethodTemplate = abstractMethodTemplate;
		abstractMethodTemplate = newAbstractMethodTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE, oldAbstractMethodTemplate,
					abstractMethodTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmbeddedAttributeTemplate() {
		return embeddedAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedAttributeTemplate(String newEmbeddedAttributeTemplate) {
		String oldEmbeddedAttributeTemplate = embeddedAttributeTemplate;
		embeddedAttributeTemplate = newEmbeddedAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__EMBEDDED_ATTRIBUTE_TEMPLATE, oldEmbeddedAttributeTemplate,
					embeddedAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdAttributeTemplate() {
		return idAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAttributeTemplate(String newIdAttributeTemplate) {
		String oldIdAttributeTemplate = idAttributeTemplate;
		idAttributeTemplate = newIdAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__ID_ATTRIBUTE_TEMPLATE,
					oldIdAttributeTemplate, idAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionAttributeTemplate() {
		return versionAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionAttributeTemplate(String newVersionAttributeTemplate) {
		String oldVersionAttributeTemplate = versionAttributeTemplate;
		versionAttributeTemplate = newVersionAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__VERSION_ATTRIBUTE_TEMPLATE, oldVersionAttributeTemplate,
					versionAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecimalAttributeTemplate() {
		return decimalAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalAttributeTemplate(String newDecimalAttributeTemplate) {
		String oldDecimalAttributeTemplate = decimalAttributeTemplate;
		decimalAttributeTemplate = newDecimalAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__DECIMAL_ATTRIBUTE_TEMPLATE, oldDecimalAttributeTemplate,
					decimalAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateTimeAttributeTemplate() {
		return dateTimeAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeAttributeTemplate(String newDateTimeAttributeTemplate) {
		String oldDateTimeAttributeTemplate = dateTimeAttributeTemplate;
		dateTimeAttributeTemplate = newDateTimeAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__DATE_TIME_ATTRIBUTE_TEMPLATE, oldDateTimeAttributeTemplate,
					dateTimeAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLobAttributeTemplate() {
		return lobAttributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLobAttributeTemplate(String newLobAttributeTemplate) {
		String oldLobAttributeTemplate = lobAttributeTemplate;
		lobAttributeTemplate = newLobAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__LOB_ATTRIBUTE_TEMPLATE,
					oldLobAttributeTemplate, lobAttributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnumerationClassTemplate() {
		return enumerationClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationClassTemplate(String newEnumerationClassTemplate) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			return getEnumerationClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			return getAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__GETTER_AND_SETTER_TEMPLATE:
			return getGetterAndSetterTemplate();
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			return getMethodTemplate();
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			return getAbstractMethodTemplate();
		case FramewebPackage.ORM_TEMPLATE__EMBEDDED_ATTRIBUTE_TEMPLATE:
			return getEmbeddedAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__ID_ATTRIBUTE_TEMPLATE:
			return getIdAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__VERSION_ATTRIBUTE_TEMPLATE:
			return getVersionAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__DECIMAL_ATTRIBUTE_TEMPLATE:
			return getDecimalAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__DATE_TIME_ATTRIBUTE_TEMPLATE:
			return getDateTimeAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__LOB_ATTRIBUTE_TEMPLATE:
			return getLobAttributeTemplate();
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			setEnumerationClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			setAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__GETTER_AND_SETTER_TEMPLATE:
			setGetterAndSetterTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			setMethodTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			setAbstractMethodTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__EMBEDDED_ATTRIBUTE_TEMPLATE:
			setEmbeddedAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ID_ATTRIBUTE_TEMPLATE:
			setIdAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__VERSION_ATTRIBUTE_TEMPLATE:
			setVersionAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__DECIMAL_ATTRIBUTE_TEMPLATE:
			setDecimalAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__DATE_TIME_ATTRIBUTE_TEMPLATE:
			setDateTimeAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__LOB_ATTRIBUTE_TEMPLATE:
			setLobAttributeTemplate((String) newValue);
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			setEnumerationClassTemplate(ENUMERATION_CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			setAttributeTemplate(ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__GETTER_AND_SETTER_TEMPLATE:
			setGetterAndSetterTemplate(GETTER_AND_SETTER_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			setMethodTemplate(METHOD_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			setAbstractMethodTemplate(ABSTRACT_METHOD_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__EMBEDDED_ATTRIBUTE_TEMPLATE:
			setEmbeddedAttributeTemplate(EMBEDDED_ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ID_ATTRIBUTE_TEMPLATE:
			setIdAttributeTemplate(ID_ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__VERSION_ATTRIBUTE_TEMPLATE:
			setVersionAttributeTemplate(VERSION_ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__DECIMAL_ATTRIBUTE_TEMPLATE:
			setDecimalAttributeTemplate(DECIMAL_ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__DATE_TIME_ATTRIBUTE_TEMPLATE:
			setDateTimeAttributeTemplate(DATE_TIME_ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__LOB_ATTRIBUTE_TEMPLATE:
			setLobAttributeTemplate(LOB_ATTRIBUTE_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE:
			return ENUMERATION_CLASS_TEMPLATE_EDEFAULT == null ? enumerationClassTemplate != null
					: !ENUMERATION_CLASS_TEMPLATE_EDEFAULT.equals(enumerationClassTemplate);
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			return ATTRIBUTE_TEMPLATE_EDEFAULT == null ? attributeTemplate != null
					: !ATTRIBUTE_TEMPLATE_EDEFAULT.equals(attributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__GETTER_AND_SETTER_TEMPLATE:
			return GETTER_AND_SETTER_TEMPLATE_EDEFAULT == null ? getterAndSetterTemplate != null
					: !GETTER_AND_SETTER_TEMPLATE_EDEFAULT.equals(getterAndSetterTemplate);
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			return METHOD_TEMPLATE_EDEFAULT == null ? methodTemplate != null
					: !METHOD_TEMPLATE_EDEFAULT.equals(methodTemplate);
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			return ABSTRACT_METHOD_TEMPLATE_EDEFAULT == null ? abstractMethodTemplate != null
					: !ABSTRACT_METHOD_TEMPLATE_EDEFAULT.equals(abstractMethodTemplate);
		case FramewebPackage.ORM_TEMPLATE__EMBEDDED_ATTRIBUTE_TEMPLATE:
			return EMBEDDED_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? embeddedAttributeTemplate != null
					: !EMBEDDED_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(embeddedAttributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__ID_ATTRIBUTE_TEMPLATE:
			return ID_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? idAttributeTemplate != null
					: !ID_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(idAttributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__VERSION_ATTRIBUTE_TEMPLATE:
			return VERSION_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? versionAttributeTemplate != null
					: !VERSION_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(versionAttributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__DECIMAL_ATTRIBUTE_TEMPLATE:
			return DECIMAL_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? decimalAttributeTemplate != null
					: !DECIMAL_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(decimalAttributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__DATE_TIME_ATTRIBUTE_TEMPLATE:
			return DATE_TIME_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? dateTimeAttributeTemplate != null
					: !DATE_TIME_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(dateTimeAttributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__LOB_ATTRIBUTE_TEMPLATE:
			return LOB_ATTRIBUTE_TEMPLATE_EDEFAULT == null ? lobAttributeTemplate != null
					: !LOB_ATTRIBUTE_TEMPLATE_EDEFAULT.equals(lobAttributeTemplate);
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
		result.append(", enumerationClassTemplate: ");
		result.append(enumerationClassTemplate);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", attributeTemplate: ");
		result.append(attributeTemplate);
		result.append(", getterAndSetterTemplate: ");
		result.append(getterAndSetterTemplate);
		result.append(", methodTemplate: ");
		result.append(methodTemplate);
		result.append(", abstractMethodTemplate: ");
		result.append(abstractMethodTemplate);
		result.append(", embeddedAttributeTemplate: ");
		result.append(embeddedAttributeTemplate);
		result.append(", idAttributeTemplate: ");
		result.append(idAttributeTemplate);
		result.append(", versionAttributeTemplate: ");
		result.append(versionAttributeTemplate);
		result.append(", decimalAttributeTemplate: ");
		result.append(decimalAttributeTemplate);
		result.append(", dateTimeAttributeTemplate: ");
		result.append(dateTimeAttributeTemplate);
		result.append(", lobAttributeTemplate: ");
		result.append(lobAttributeTemplate);
		result.append(')');
		return result.toString();
	}

} //ORMTemplateImpl
