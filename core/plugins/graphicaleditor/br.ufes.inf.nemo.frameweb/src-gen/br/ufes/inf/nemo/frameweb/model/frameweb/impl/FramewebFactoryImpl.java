/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FramewebFactoryImpl extends EFactoryImpl implements FramewebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FramewebFactory init() {
		try {
			FramewebFactory theFramewebFactory = (FramewebFactory) EPackage.Registry.INSTANCE
					.getEFactory(FramewebPackage.eNS_URI);
			if (theFramewebFactory != null) {
				return theFramewebFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FramewebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FramewebPackage.FRAMEWEB_PROJECT:
			return createFramewebProject();
		case FramewebPackage.FRAMEWEB_MODEL:
			return createFramewebModel();
		case FramewebPackage.FRAMEWORK_PROFILE:
			return createFrameworkProfile();
		case FramewebPackage.ENTITY_MODEL:
			return createEntityModel();
		case FramewebPackage.NAVIGATION_MODEL:
			return createNavigationModel();
		case FramewebPackage.APPLICATION_MODEL:
			return createApplicationModel();
		case FramewebPackage.PERSISTENCE_MODEL:
			return createPersistenceModel();
		case FramewebPackage.DOMAIN_ASSOCIATION:
			return createDomainAssociation();
		case FramewebPackage.VERSION_ATTRIBUTE:
			return createVersionAttribute();
		case FramewebPackage.ID_ATTRIBUTE:
			return createIdAttribute();
		case FramewebPackage.LOB_ATTRIBUTE:
			return createLOBAttribute();
		case FramewebPackage.EMBEDDED_ATTRIBUTE:
			return createEmbeddedAttribute();
		case FramewebPackage.DECIMAL_ATTRIBUTE:
			return createDecimalAttribute();
		case FramewebPackage.DATE_TIME_ATTRIBUTE:
			return createDateTimeAttribute();
		case FramewebPackage.PAGE:
			return createPage();
		case FramewebPackage.AUTH_PAGE:
			return createAuthPage();
		case FramewebPackage.DAO_INTERFACE:
			return createDAOInterface();
		case FramewebPackage.DAO_CLASS:
			return createDAOClass();
		case FramewebPackage.DAO_REALIZATION:
			return createDAORealization();
		case FramewebPackage.FRONT_CONTROLLER_CLASS:
			return createFrontControllerClass();
		case FramewebPackage.IO_PARAMETER:
			return createIOParameter();
		case FramewebPackage.RESULT_DEPENDENCY:
			return createResultDependency();
		case FramewebPackage.AUTH_SUCCESS_URL:
			return createAuthSuccessUrl();
		case FramewebPackage.AUTH_FAILURE_URL:
			return createAuthFailureUrl();
		case FramewebPackage.NAVIGATION_ASSOCIATION:
			return createNavigationAssociation();
		case FramewebPackage.FRONT_CONTROLLER_METHOD:
			return createFrontControllerMethod();
		case FramewebPackage.AUTH_PROCESSING_METHOD:
			return createAuthProcessingMethod();
		case FramewebPackage.SERVICE_CLASS:
			return createServiceClass();
		case FramewebPackage.AUTH_SERVICE_CLASS:
			return createAuthServiceClass();
		case FramewebPackage.SERVICE_INTERFACE:
			return createServiceInterface();
		case FramewebPackage.AUTH_SERVICE_INTERFACE:
			return createAuthServiceInterface();
		case FramewebPackage.SERVICE_GENERALIZATION:
			return createServiceGeneralization();
		case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION:
			return createServiceControllerAssociation();
		case FramewebPackage.DOMAIN_CLASS:
			return createDomainClass();
		case FramewebPackage.AUTH_USER:
			return createAuthUser();
		case FramewebPackage.AUTH_ROLE:
			return createAuthRole();
		case FramewebPackage.AUTH_PERMISSION:
			return createAuthPermission();
		case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY:
			return createFrontControllerDependency();
		case FramewebPackage.PAGE_DEPENDENCY:
			return createPageDependency();
		case FramewebPackage.DAO_SERVICE_ASSOCIATION:
			return createDAOServiceAssociation();
		case FramewebPackage.DOMAIN_METHOD:
			return createDomainMethod();
		case FramewebPackage.DAO_ATTRIBUTE:
			return createDAOAttribute();
		case FramewebPackage.SERVICE_METHOD:
			return createServiceMethod();
		case FramewebPackage.AUTH_SERVICE_METHOD:
			return createAuthServiceMethod();
		case FramewebPackage.SERVICE_ATTRIBUTE:
			return createServiceAttribute();
		case FramewebPackage.DAO_METHOD:
			return createDAOMethod();
		case FramewebPackage.DOMAIN_PACKAGE:
			return createDomainPackage();
		case FramewebPackage.VIEW_PACKAGE:
			return createViewPackage();
		case FramewebPackage.CONTROLLER_PACKAGE:
			return createControllerPackage();
		case FramewebPackage.PERSISTENCE_PACKAGE:
			return createPersistencePackage();
		case FramewebPackage.APPLICATION_PACKAGE:
			return createApplicationPackage();
		case FramewebPackage.UI_COMPONENT:
			return createUIComponent();
		case FramewebPackage.AUTH_FORM:
			return createAuthForm();
		case FramewebPackage.RESULT_TYPE:
			return createResultType();
		case FramewebPackage.DOMAIN_GENERALIZATION:
			return createDomainGeneralization();
		case FramewebPackage.UI_COMPONENT_FIELD:
			return createUIComponentField();
		case FramewebPackage.TAG_LIB:
			return createTagLib();
		case FramewebPackage.TAG:
			return createTag();
		case FramewebPackage.NAVIGATION_COMPOSITION_PART:
			return createNavigationCompositionPart();
		case FramewebPackage.NAVIGATION_COMPOSITION_WHOLE:
			return createNavigationCompositionWhole();
		case FramewebPackage.RESULT_SET:
			return createResultSet();
		case FramewebPackage.PAGE_CONSTRAINT:
			return createPageConstraint();
		case FramewebPackage.RESULT_CONSTRAINT:
			return createResultConstraint();
		case FramewebPackage.METHOD_CONSTRAINT:
			return createMethodConstraint();
		case FramewebPackage.CHAINING_CONSTRAINT:
			return createChainingConstraint();
		case FramewebPackage.NAVIGATION_GENERALIZATION:
			return createNavigationGeneralization();
		case FramewebPackage.DOMAIN_CONSTRAINTS:
			return createDomainConstraints();
		case FramewebPackage.DAO_GENERALIZATION:
			return createDAOGeneralization();
		case FramewebPackage.MAPPING_LIB:
			return createMappingLib();
		case FramewebPackage.CLASS_MAPPING:
			return createClassMapping();
		case FramewebPackage.ATTRIBUTE_MAPPING:
			return createAttributeMapping();
		case FramewebPackage.DOMAIN_GENERALIZATION_SET:
			return createDomainGeneralizationSet();
		case FramewebPackage.CONTROLLER:
			return createController();
		case FramewebPackage.TAG_PROPERTY:
			return createTagProperty();
		case FramewebPackage.RESULT_PROPERTY:
			return createResultProperty();
		case FramewebPackage.CLASS_MAPPING_PROPERY:
			return createClassMappingPropery();
		case FramewebPackage.ATTRIBUTE_MAPPING_PROPERTY:
			return createAttributeMappingProperty();
		case FramewebPackage.SERVICE_REALIZATION:
			return createServiceRealization();
		case FramewebPackage.NAVIGATION_GENERALIZATION_SET:
			return createNavigationGeneralizationSet();
		case FramewebPackage.DAO_GENERALIZATION_SET:
			return createDAOGeneralizationSet();
		case FramewebPackage.SERVICE_GENERALIZATION_SET:
			return createServiceGeneralizationSet();
		case FramewebPackage.SEMANTIC_PACKAGE:
			return createSemanticPackage();
		case FramewebPackage.IRI:
			return createIRI();
		case FramewebPackage.VOCABULARY_MODEL:
			return createVocabularyModel();
		case FramewebPackage.VOCABULARY:
			return createVocabulary();
		case FramewebPackage.AXIOM:
			return createAxiom();
		case FramewebPackage.ANNOTATION:
			return createAnnotation();
		case FramewebPackage.VOCABULARY_CONSTRAINTS:
			return createVocabularyConstraints();
		case FramewebPackage.VOCABULARY_ASSOCIATION:
			return createVocabularyAssociation();
		case FramewebPackage.VOCABULARY_PROPERTY:
			return createVocabularyProperty();
		case FramewebPackage.OBJECT_PROPERTY:
			return createObjectProperty();
		case FramewebPackage.DATA_PROPERTY:
			return createDataProperty();
		case FramewebPackage.VOCABULARY_DATA_TYPE:
			return createVocabularyDataType();
		case FramewebPackage.NAMED_INDIVIDUAL:
			return createNamedIndividual();
		case FramewebPackage.VOCABULARY_CLASS:
			return createVocabularyClass();
		case FramewebPackage.ANONYMOUS_INDIVIDUAL:
			return createAnonymousIndividual();
		case FramewebPackage.VOCABULARY_LITERAL:
			return createVocabularyLiteral();
		case FramewebPackage.DOMAIN_VOCABULARY_ASSOCIATION:
			return createDomainVocabularyAssociation();
		case FramewebPackage.DOMAIN_VOCABULARY_PROPERTY:
			return createDomainVocabularyProperty();
		case FramewebPackage.DOMAIN_ATTRIBUTE:
			return createDomainAttribute();
		case FramewebPackage.DOMAIN_AUTH_ATTRIBUTE:
			return createDomainAuthAttribute();
		case FramewebPackage.AUTH_USER_NAME:
			return createAuthUserName();
		case FramewebPackage.AUTH_PASSWORD:
			return createAuthPassword();
		case FramewebPackage.AUTH_ROLE_NAME:
			return createAuthRoleName();
		case FramewebPackage.AUTH_PERM_NAME:
			return createAuthPermName();
		case FramewebPackage.DOMAIN_PROPERTY:
			return createDomainProperty();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE:
			return createFrontControllerTemplate();
		case FramewebPackage.DI_TEMPLATE:
			return createDITemplate();
		case FramewebPackage.ORM_TEMPLATE:
			return createORMTemplate();
		case FramewebPackage.DAO_TEMPLATE:
			return createDAOTemplate();
		case FramewebPackage.FRAME_WEB_CONFIGURATION:
			return createFrameWebConfiguration();
		case FramewebPackage.REST_CONTROLLER_TEMPLATE:
			return createRestControllerTemplate();
		case FramewebPackage.REST_CONTROLLER_METHOD:
			return createRestControllerMethod();
		case FramewebPackage.REST_CONTROLLER_CLASS:
			return createRestControllerClass();
		case FramewebPackage.PARTIAL:
			return createPartial();
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION:
			return createNavigationAggregationAssociation();
		case FramewebPackage.NAVIGATION_AGGREGATION_TARGET:
			return createNavigationAggregationTarget();
		case FramewebPackage.NAVIGATION_AGGREGATION_SOURCE:
			return createNavigationAggregationSource();
		case FramewebPackage.NAVIGATION_SPA_PROPERTIES:
			return createNavigationSPAProperties();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
			return createFrameworkCategoryListFromString(eDataType, initialValue);
		case FramewebPackage.FRAMEWORK_KIND_LIST:
			return createFrameworkKindListFromString(eDataType, initialValue);
		case FramewebPackage.DATE_TIME_PRECISION:
			return createDateTimePrecisionFromString(eDataType, initialValue);
		case FramewebPackage.GENERATION:
			return createGenerationFromString(eDataType, initialValue);
		case FramewebPackage.COLLECTION:
			return createCollectionFromString(eDataType, initialValue);
		case FramewebPackage.ORDER:
			return createOrderFromString(eDataType, initialValue);
		case FramewebPackage.CASCADE:
			return createCascadeFromString(eDataType, initialValue);
		case FramewebPackage.FETCH:
			return createFetchFromString(eDataType, initialValue);
		case FramewebPackage.CONSTANT_NAME_LIST:
			return createConstantNameListFromString(eDataType, initialValue);
		case FramewebPackage.INHERITANCE_MAPPING:
			return createInheritanceMappingFromString(eDataType, initialValue);
		case FramewebPackage.HTTP_STATUS:
			return createHttpStatusFromString(eDataType, initialValue);
		case FramewebPackage.HTTP_METHOD_TYPE:
			return createHttpMethodTypeFromString(eDataType, initialValue);
		case FramewebPackage.RATIONAL:
			return createRationalFromString(eDataType, initialValue);
		case FramewebPackage.DECIMAL:
			return createDecimalFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
			return convertFrameworkCategoryListToString(eDataType, instanceValue);
		case FramewebPackage.FRAMEWORK_KIND_LIST:
			return convertFrameworkKindListToString(eDataType, instanceValue);
		case FramewebPackage.DATE_TIME_PRECISION:
			return convertDateTimePrecisionToString(eDataType, instanceValue);
		case FramewebPackage.GENERATION:
			return convertGenerationToString(eDataType, instanceValue);
		case FramewebPackage.COLLECTION:
			return convertCollectionToString(eDataType, instanceValue);
		case FramewebPackage.ORDER:
			return convertOrderToString(eDataType, instanceValue);
		case FramewebPackage.CASCADE:
			return convertCascadeToString(eDataType, instanceValue);
		case FramewebPackage.FETCH:
			return convertFetchToString(eDataType, instanceValue);
		case FramewebPackage.CONSTANT_NAME_LIST:
			return convertConstantNameListToString(eDataType, instanceValue);
		case FramewebPackage.INHERITANCE_MAPPING:
			return convertInheritanceMappingToString(eDataType, instanceValue);
		case FramewebPackage.HTTP_STATUS:
			return convertHttpStatusToString(eDataType, instanceValue);
		case FramewebPackage.HTTP_METHOD_TYPE:
			return convertHttpMethodTypeToString(eDataType, instanceValue);
		case FramewebPackage.RATIONAL:
			return convertRationalToString(eDataType, instanceValue);
		case FramewebPackage.DECIMAL:
			return convertDecimalToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramewebProject createFramewebProject() {
		FramewebProjectImpl framewebProject = new FramewebProjectImpl();
		return framewebProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramewebModel createFramewebModel() {
		FramewebModelImpl framewebModel = new FramewebModelImpl();
		return framewebModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameworkProfile createFrameworkProfile() {
		FrameworkProfileImpl frameworkProfile = new FrameworkProfileImpl();
		return frameworkProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityModel createEntityModel() {
		EntityModelImpl entityModel = new EntityModelImpl();
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationModel createNavigationModel() {
		NavigationModelImpl navigationModel = new NavigationModelImpl();
		return navigationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationModel createApplicationModel() {
		ApplicationModelImpl applicationModel = new ApplicationModelImpl();
		return applicationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceModel createPersistenceModel() {
		PersistenceModelImpl persistenceModel = new PersistenceModelImpl();
		return persistenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssociation createDomainAssociation() {
		DomainAssociationImpl domainAssociation = new DomainAssociationImpl();
		return domainAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionAttribute createVersionAttribute() {
		VersionAttributeImpl versionAttribute = new VersionAttributeImpl();
		return versionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdAttribute createIdAttribute() {
		IdAttributeImpl idAttribute = new IdAttributeImpl();
		return idAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LOBAttribute createLOBAttribute() {
		LOBAttributeImpl lobAttribute = new LOBAttributeImpl();
		return lobAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmbeddedAttribute createEmbeddedAttribute() {
		EmbeddedAttributeImpl embeddedAttribute = new EmbeddedAttributeImpl();
		return embeddedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalAttribute createDecimalAttribute() {
		DecimalAttributeImpl decimalAttribute = new DecimalAttributeImpl();
		return decimalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeAttribute createDateTimeAttribute() {
		DateTimeAttributeImpl dateTimeAttribute = new DateTimeAttributeImpl();
		return dateTimeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthPage createAuthPage() {
		AuthPageImpl authPage = new AuthPageImpl();
		return authPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOInterface createDAOInterface() {
		DAOInterfaceImpl daoInterface = new DAOInterfaceImpl();
		return daoInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOClass createDAOClass() {
		DAOClassImpl daoClass = new DAOClassImpl();
		return daoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAORealization createDAORealization() {
		DAORealizationImpl daoRealization = new DAORealizationImpl();
		return daoRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerClass createFrontControllerClass() {
		FrontControllerClassImpl frontControllerClass = new FrontControllerClassImpl();
		return frontControllerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOParameter createIOParameter() {
		IOParameterImpl ioParameter = new IOParameterImpl();
		return ioParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultDependency createResultDependency() {
		ResultDependencyImpl resultDependency = new ResultDependencyImpl();
		return resultDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthSuccessUrl createAuthSuccessUrl() {
		AuthSuccessUrlImpl authSuccessUrl = new AuthSuccessUrlImpl();
		return authSuccessUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthFailureUrl createAuthFailureUrl() {
		AuthFailureUrlImpl authFailureUrl = new AuthFailureUrlImpl();
		return authFailureUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationAssociation createNavigationAssociation() {
		NavigationAssociationImpl navigationAssociation = new NavigationAssociationImpl();
		return navigationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerMethod createFrontControllerMethod() {
		FrontControllerMethodImpl frontControllerMethod = new FrontControllerMethodImpl();
		return frontControllerMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthProcessingMethod createAuthProcessingMethod() {
		AuthProcessingMethodImpl authProcessingMethod = new AuthProcessingMethodImpl();
		return authProcessingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceClass createServiceClass() {
		ServiceClassImpl serviceClass = new ServiceClassImpl();
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthServiceClass createAuthServiceClass() {
		AuthServiceClassImpl authServiceClass = new AuthServiceClassImpl();
		return authServiceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthServiceInterface createAuthServiceInterface() {
		AuthServiceInterfaceImpl authServiceInterface = new AuthServiceInterfaceImpl();
		return authServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceGeneralization createServiceGeneralization() {
		ServiceGeneralizationImpl serviceGeneralization = new ServiceGeneralizationImpl();
		return serviceGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceControllerAssociation createServiceControllerAssociation() {
		ServiceControllerAssociationImpl serviceControllerAssociation = new ServiceControllerAssociationImpl();
		return serviceControllerAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainClass createDomainClass() {
		DomainClassImpl domainClass = new DomainClassImpl();
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthUser createAuthUser() {
		AuthUserImpl authUser = new AuthUserImpl();
		return authUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthRole createAuthRole() {
		AuthRoleImpl authRole = new AuthRoleImpl();
		return authRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthPermission createAuthPermission() {
		AuthPermissionImpl authPermission = new AuthPermissionImpl();
		return authPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerDependency createFrontControllerDependency() {
		FrontControllerDependencyImpl frontControllerDependency = new FrontControllerDependencyImpl();
		return frontControllerDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageDependency createPageDependency() {
		PageDependencyImpl pageDependency = new PageDependencyImpl();
		return pageDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOServiceAssociation createDAOServiceAssociation() {
		DAOServiceAssociationImpl daoServiceAssociation = new DAOServiceAssociationImpl();
		return daoServiceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainMethod createDomainMethod() {
		DomainMethodImpl domainMethod = new DomainMethodImpl();
		return domainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOAttribute createDAOAttribute() {
		DAOAttributeImpl daoAttribute = new DAOAttributeImpl();
		return daoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceMethod createServiceMethod() {
		ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
		return serviceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthServiceMethod createAuthServiceMethod() {
		AuthServiceMethodImpl authServiceMethod = new AuthServiceMethodImpl();
		return authServiceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceAttribute createServiceAttribute() {
		ServiceAttributeImpl serviceAttribute = new ServiceAttributeImpl();
		return serviceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOMethod createDAOMethod() {
		DAOMethodImpl daoMethod = new DAOMethodImpl();
		return daoMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainPackage createDomainPackage() {
		DomainPackageImpl domainPackage = new DomainPackageImpl();
		return domainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPackage createViewPackage() {
		ViewPackageImpl viewPackage = new ViewPackageImpl();
		return viewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControllerPackage createControllerPackage() {
		ControllerPackageImpl controllerPackage = new ControllerPackageImpl();
		return controllerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistencePackage createPersistencePackage() {
		PersistencePackageImpl persistencePackage = new PersistencePackageImpl();
		return persistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationPackage createApplicationPackage() {
		ApplicationPackageImpl applicationPackage = new ApplicationPackageImpl();
		return applicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIComponent createUIComponent() {
		UIComponentImpl uiComponent = new UIComponentImpl();
		return uiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthForm createAuthForm() {
		AuthFormImpl authForm = new AuthFormImpl();
		return authForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainGeneralization createDomainGeneralization() {
		DomainGeneralizationImpl domainGeneralization = new DomainGeneralizationImpl();
		return domainGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIComponentField createUIComponentField() {
		UIComponentFieldImpl uiComponentField = new UIComponentFieldImpl();
		return uiComponentField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagLib createTagLib() {
		TagLibImpl tagLib = new TagLibImpl();
		return tagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationCompositionPart createNavigationCompositionPart() {
		NavigationCompositionPartImpl navigationCompositionPart = new NavigationCompositionPartImpl();
		return navigationCompositionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationCompositionWhole createNavigationCompositionWhole() {
		NavigationCompositionWholeImpl navigationCompositionWhole = new NavigationCompositionWholeImpl();
		return navigationCompositionWhole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultSet createResultSet() {
		ResultSetImpl resultSet = new ResultSetImpl();
		return resultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageConstraint createPageConstraint() {
		PageConstraintImpl pageConstraint = new PageConstraintImpl();
		return pageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConstraint createResultConstraint() {
		ResultConstraintImpl resultConstraint = new ResultConstraintImpl();
		return resultConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodConstraint createMethodConstraint() {
		MethodConstraintImpl methodConstraint = new MethodConstraintImpl();
		return methodConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChainingConstraint createChainingConstraint() {
		ChainingConstraintImpl chainingConstraint = new ChainingConstraintImpl();
		return chainingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationGeneralization createNavigationGeneralization() {
		NavigationGeneralizationImpl navigationGeneralization = new NavigationGeneralizationImpl();
		return navigationGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainConstraints createDomainConstraints() {
		DomainConstraintsImpl domainConstraints = new DomainConstraintsImpl();
		return domainConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOGeneralization createDAOGeneralization() {
		DAOGeneralizationImpl daoGeneralization = new DAOGeneralizationImpl();
		return daoGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingLib createMappingLib() {
		MappingLibImpl mappingLib = new MappingLibImpl();
		return mappingLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassMapping createClassMapping() {
		ClassMappingImpl classMapping = new ClassMappingImpl();
		return classMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMapping createAttributeMapping() {
		AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
		return attributeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainGeneralizationSet createDomainGeneralizationSet() {
		DomainGeneralizationSetImpl domainGeneralizationSet = new DomainGeneralizationSetImpl();
		return domainGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagProperty createTagProperty() {
		TagPropertyImpl tagProperty = new TagPropertyImpl();
		return tagProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultProperty createResultProperty() {
		ResultPropertyImpl resultProperty = new ResultPropertyImpl();
		return resultProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassMappingPropery createClassMappingPropery() {
		ClassMappingProperyImpl classMappingPropery = new ClassMappingProperyImpl();
		return classMappingPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMappingProperty createAttributeMappingProperty() {
		AttributeMappingPropertyImpl attributeMappingProperty = new AttributeMappingPropertyImpl();
		return attributeMappingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRealization createServiceRealization() {
		ServiceRealizationImpl serviceRealization = new ServiceRealizationImpl();
		return serviceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationGeneralizationSet createNavigationGeneralizationSet() {
		NavigationGeneralizationSetImpl navigationGeneralizationSet = new NavigationGeneralizationSetImpl();
		return navigationGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOGeneralizationSet createDAOGeneralizationSet() {
		DAOGeneralizationSetImpl daoGeneralizationSet = new DAOGeneralizationSetImpl();
		return daoGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceGeneralizationSet createServiceGeneralizationSet() {
		ServiceGeneralizationSetImpl serviceGeneralizationSet = new ServiceGeneralizationSetImpl();
		return serviceGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticPackage createSemanticPackage() {
		SemanticPackageImpl semanticPackage = new SemanticPackageImpl();
		return semanticPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRI createIRI() {
		IRIImpl iri = new IRIImpl();
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyModel createVocabularyModel() {
		VocabularyModelImpl vocabularyModel = new VocabularyModelImpl();
		return vocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vocabulary createVocabulary() {
		VocabularyImpl vocabulary = new VocabularyImpl();
		return vocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Axiom createAxiom() {
		AxiomImpl axiom = new AxiomImpl();
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyConstraints createVocabularyConstraints() {
		VocabularyConstraintsImpl vocabularyConstraints = new VocabularyConstraintsImpl();
		return vocabularyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyAssociation createVocabularyAssociation() {
		VocabularyAssociationImpl vocabularyAssociation = new VocabularyAssociationImpl();
		return vocabularyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyProperty createVocabularyProperty() {
		VocabularyPropertyImpl vocabularyProperty = new VocabularyPropertyImpl();
		return vocabularyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyDataType createVocabularyDataType() {
		VocabularyDataTypeImpl vocabularyDataType = new VocabularyDataTypeImpl();
		return vocabularyDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyClass createVocabularyClass() {
		VocabularyClassImpl vocabularyClass = new VocabularyClassImpl();
		return vocabularyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VocabularyLiteral createVocabularyLiteral() {
		VocabularyLiteralImpl vocabularyLiteral = new VocabularyLiteralImpl();
		return vocabularyLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainVocabularyAssociation createDomainVocabularyAssociation() {
		DomainVocabularyAssociationImpl domainVocabularyAssociation = new DomainVocabularyAssociationImpl();
		return domainVocabularyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainVocabularyProperty createDomainVocabularyProperty() {
		DomainVocabularyPropertyImpl domainVocabularyProperty = new DomainVocabularyPropertyImpl();
		return domainVocabularyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAttribute createDomainAttribute() {
		DomainAttributeImpl domainAttribute = new DomainAttributeImpl();
		return domainAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAuthAttribute createDomainAuthAttribute() {
		DomainAuthAttributeImpl domainAuthAttribute = new DomainAuthAttributeImpl();
		return domainAuthAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthUserName createAuthUserName() {
		AuthUserNameImpl authUserName = new AuthUserNameImpl();
		return authUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthPassword createAuthPassword() {
		AuthPasswordImpl authPassword = new AuthPasswordImpl();
		return authPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthRoleName createAuthRoleName() {
		AuthRoleNameImpl authRoleName = new AuthRoleNameImpl();
		return authRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthPermName createAuthPermName() {
		AuthPermNameImpl authPermName = new AuthPermNameImpl();
		return authPermName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainProperty createDomainProperty() {
		DomainPropertyImpl domainProperty = new DomainPropertyImpl();
		return domainProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerTemplate createFrontControllerTemplate() {
		FrontControllerTemplateImpl frontControllerTemplate = new FrontControllerTemplateImpl();
		return frontControllerTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DITemplate createDITemplate() {
		DITemplateImpl diTemplate = new DITemplateImpl();
		return diTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORMTemplate createORMTemplate() {
		ORMTemplateImpl ormTemplate = new ORMTemplateImpl();
		return ormTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAOTemplate createDAOTemplate() {
		DAOTemplateImpl daoTemplate = new DAOTemplateImpl();
		return daoTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameWebConfiguration createFrameWebConfiguration() {
		FrameWebConfigurationImpl frameWebConfiguration = new FrameWebConfigurationImpl();
		return frameWebConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestControllerTemplate createRestControllerTemplate() {
		RestControllerTemplateImpl restControllerTemplate = new RestControllerTemplateImpl();
		return restControllerTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestControllerMethod createRestControllerMethod() {
		RestControllerMethodImpl restControllerMethod = new RestControllerMethodImpl();
		return restControllerMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestControllerClass createRestControllerClass() {
		RestControllerClassImpl restControllerClass = new RestControllerClassImpl();
		return restControllerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partial createPartial() {
		PartialImpl partial = new PartialImpl();
		return partial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationAggregationAssociation createNavigationAggregationAssociation() {
		NavigationAggregationAssociationImpl navigationAggregationAssociation = new NavigationAggregationAssociationImpl();
		return navigationAggregationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationAggregationTarget createNavigationAggregationTarget() {
		NavigationAggregationTargetImpl navigationAggregationTarget = new NavigationAggregationTargetImpl();
		return navigationAggregationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationAggregationSource createNavigationAggregationSource() {
		NavigationAggregationSourceImpl navigationAggregationSource = new NavigationAggregationSourceImpl();
		return navigationAggregationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationSPAProperties createNavigationSPAProperties() {
		NavigationSPAPropertiesImpl navigationSPAProperties = new NavigationSPAPropertiesImpl();
		return navigationSPAProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCategoryList createFrameworkCategoryListFromString(EDataType eDataType, String initialValue) {
		FrameworkCategoryList result = FrameworkCategoryList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkKindList createFrameworkKindListFromString(EDataType eDataType, String initialValue) {
		FrameworkKindList result = FrameworkKindList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision createDateTimePrecisionFromString(EDataType eDataType, String initialValue) {
		DateTimePrecision result = DateTimePrecision.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGenerationFromString(EDataType eDataType, String initialValue) {
		Generation result = Generation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollectionFromString(EDataType eDataType, String initialValue) {
		Collection result = Collection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascadeFromString(EDataType eDataType, String initialValue) {
		Cascade result = Cascade.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetchFromString(EDataType eDataType, String initialValue) {
		Fetch result = Fetch.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList createConstantNameListFromString(EDataType eDataType, String initialValue) {
		ConstantNameList result = ConstantNameList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstantNameListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMapping createInheritanceMappingFromString(EDataType eDataType, String initialValue) {
		InheritanceMapping result = InheritanceMapping.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceMappingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpStatus createHttpStatusFromString(EDataType eDataType, String initialValue) {
		HttpStatus result = HttpStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethodType createHttpMethodTypeFromString(EDataType eDataType, String initialValue) {
		HttpMethodType result = HttpMethodType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createRationalFromString(EDataType eDataType, String initialValue) {
		return (Double) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRationalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDecimalFromString(EDataType eDataType, String initialValue) {
		return (Double) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramewebPackage getFramewebPackage() {
		return (FramewebPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FramewebPackage getPackage() {
		return FramewebPackage.eINSTANCE;
	}

} //FramewebFactoryImpl
