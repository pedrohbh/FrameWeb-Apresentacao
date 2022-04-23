/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.Annotation;
import br.ufes.inf.nemo.frameweb.model.frameweb.AnonymousIndividual;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.Attribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMapping;
import br.ufes.inf.nemo.frameweb.model.frameweb.AttributeMappingProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthFailureUrl;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthForm;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPage;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPassword;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermName;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthProcessingMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRoleName;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthServiceMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthSuccessUrl;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUserName;
import br.ufes.inf.nemo.frameweb.model.frameweb.Axiom;
import br.ufes.inf.nemo.frameweb.model.frameweb.Cascade;
import br.ufes.inf.nemo.frameweb.model.frameweb.ChainingConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.ClassMapping;
import br.ufes.inf.nemo.frameweb.model.frameweb.ClassMappingPropery;
import br.ufes.inf.nemo.frameweb.model.frameweb.Collection;
import br.ufes.inf.nemo.frameweb.model.frameweb.ConstantNameList;
import br.ufes.inf.nemo.frameweb.model.frameweb.Controller;
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOGeneralizationSet;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAORealization;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DataProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.DateTimeAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DateTimePrecision;
import br.ufes.inf.nemo.frameweb.model.frameweb.DecimalAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAuthAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralizationSet;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainVocabularyProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.EmbeddedAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.Fetch;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebProject;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkCategoryList;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkKindList;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Generation;
import br.ufes.inf.nemo.frameweb.model.frameweb.HttpMethodType;
import br.ufes.inf.nemo.frameweb.model.frameweb.HttpStatus;
import br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter;
import br.ufes.inf.nemo.frameweb.model.frameweb.IdAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.Individual;
import br.ufes.inf.nemo.frameweb.model.frameweb.InheritanceMapping;
import br.ufes.inf.nemo.frameweb.model.frameweb.LOBAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.MappingLib;
import br.ufes.inf.nemo.frameweb.model.frameweb.MethodConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.NamedIndividual;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationPart;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationWhole;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionPart;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionWhole;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationGeneralizationSet;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ObjectProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.Order;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.PageConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.PageDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.Partial;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultSet;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultType;
import br.ufes.inf.nemo.frameweb.model.frameweb.SemanticPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceControllerAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceGeneralizationSet;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceRealization;
import br.ufes.inf.nemo.frameweb.model.frameweb.Tag;
import br.ufes.inf.nemo.frameweb.model.frameweb.TagLib;
import br.ufes.inf.nemo.frameweb.model.frameweb.TagProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;
import br.ufes.inf.nemo.frameweb.model.frameweb.VersionAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyConstraints;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyLiteral;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyProperty;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FramewebPackageImpl extends EPackageImpl implements FramewebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framewebProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framewebModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authSuccessUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authFailureUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authProcessingMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authServiceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authServiceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceControllerAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authPermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoServiceAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authServiceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistencePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationCompositionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationCompositionWholeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainGeneralizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingProperyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationGeneralizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoGeneralizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGeneralizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainVocabularyAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainVocabularyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAuthAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authUserNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authPasswordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authRoleNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authPermNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameWebConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restControllerTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restControllerMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restControllerClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAggregationAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAggregationPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAggregationWholeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkKindListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTimePrecisionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cascadeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constantNameListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceMappingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rationalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FramewebPackageImpl() {
		super(eNS_URI, FramewebFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FramewebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FramewebPackage init() {
		if (isInited)
			return (FramewebPackage) EPackage.Registry.INSTANCE.getEPackage(FramewebPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFramewebPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FramewebPackageImpl theFramewebPackage = registeredFramewebPackage instanceof FramewebPackageImpl
				? (FramewebPackageImpl) registeredFramewebPackage
				: new FramewebPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFramewebPackage.createPackageContents();

		// Initialize created meta-data
		theFramewebPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFramewebPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FramewebPackage.eNS_URI, theFramewebPackage);
		return theFramewebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFramewebProject() {
		return framewebProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramewebProject_Compose() {
		return (EReference) framewebProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramewebProject_Configures() {
		return (EReference) framewebProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFramewebModel() {
		return framewebModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameworkProfile() {
		return frameworkProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkProfile_Category() {
		return (EAttribute) frameworkProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkProfile_Kind() {
		return (EAttribute) frameworkProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkProfile_Version() {
		return (EAttribute) frameworkProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityModel() {
		return entityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationModel() {
		return navigationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationModel() {
		return applicationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceModel() {
		return persistenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainAssociation() {
		return domainAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainAssociation_Collection() {
		return (EAttribute) domainAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainAssociation_Cascade() {
		return (EAttribute) domainAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainAssociation_Fetch() {
		return (EAttribute) domainAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainAssociation_Order() {
		return (EAttribute) domainAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainAssociation__GetSourceMember() {
		return domainAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainAssociation__GetTargetMember() {
		return domainAssociationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainAssociation__GetSourceToTargetCardinality() {
		return domainAssociationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainAssociation__GetTargetToSourceCardinality() {
		return domainAssociationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Size() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsNull() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsPersistent() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_OwlEquivalentProperty() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionAttribute() {
		return versionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdAttribute() {
		return idAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdAttribute_Generation() {
		return (EAttribute) idAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLOBAttribute() {
		return lobAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmbeddedAttribute() {
		return embeddedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalAttribute() {
		return decimalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalAttribute_DecimalPrecision() {
		return (EAttribute) decimalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalAttribute_DecimalScale() {
		return (EAttribute) decimalAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimeAttribute() {
		return dateTimeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeAttribute_DateTimePrecision() {
		return (EAttribute) dateTimeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_PageTagLib() {
		return (EReference) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthPage() {
		return authPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOInterface() {
		return daoInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOInterface_Infix() {
		return (EAttribute) daoInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOInterface_Sufix() {
		return (EAttribute) daoInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOClass() {
		return daoClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOClass_Sufix() {
		return (EAttribute) daoClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOClass_Infix() {
		return (EAttribute) daoClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOClass_Prefix() {
		return (EAttribute) daoClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAORealization() {
		return daoRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrontControllerClass() {
		return frontControllerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIOParameter() {
		return ioParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIOParameter_Display() {
		return (EReference) ioParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultDependency() {
		return resultDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultDependency_ResultMethod() {
		return (EReference) resultDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultDependency_ResultDependencyConstraint() {
		return (EReference) resultDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultDependency_HttpStatus() {
		return (EAttribute) resultDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthSuccessUrl() {
		return authSuccessUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthFailureUrl() {
		return authFailureUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationAssociation() {
		return navigationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrontControllerMethod() {
		return frontControllerMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerMethod_IsDefault() {
		return (EAttribute) frontControllerMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrontControllerMethod_MethodType() {
		return (EReference) frontControllerMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerMethod_RequestMethod() {
		return (EAttribute) frontControllerMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthProcessingMethod() {
		return authProcessingMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceClass() {
		return serviceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthServiceClass() {
		return authServiceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthServiceClass_PermissionName() {
		return (EAttribute) authServiceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthServiceInterface() {
		return authServiceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceGeneralization() {
		return serviceGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceControllerAssociation() {
		return serviceControllerAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getServiceControllerAssociation__GetSourceMember() {
		return serviceControllerAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getServiceControllerAssociation__GetTargetMember() {
		return serviceControllerAssociationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainClass() {
		return domainClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainClass_Table() {
		return (EAttribute) domainClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthUser() {
		return authUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthUser_AuthUserName() {
		return (EReference) authUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthUser_AuthPassword() {
		return (EReference) authUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthRole() {
		return authRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthRole_AuthRoleName() {
		return (EReference) authRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthPermission() {
		return authPermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthPermission_AuthPermName() {
		return (EReference) authPermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrontControllerDependency() {
		return frontControllerDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrontControllerDependency_Method() {
		return (EReference) frontControllerDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrontControllerDependency_MethodDependendencyConstraint() {
		return (EReference) frontControllerDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageDependency() {
		return pageDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageDependency_PageDependencyConstraint() {
		return (EReference) pageDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOServiceAssociation() {
		return daoServiceAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDAOServiceAssociation__GetSourceMember() {
		return daoServiceAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDAOServiceAssociation__GetTargetMember() {
		return daoServiceAssociationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationAttribute() {
		return navigationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationClass() {
		return navigationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainMethod() {
		return domainMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainMethod_MethodType() {
		return (EReference) domainMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOAttribute() {
		return daoAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMethod() {
		return serviceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceMethod_MethodType() {
		return (EReference) serviceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthServiceMethod() {
		return authServiceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthServiceMethod_PermissionName() {
		return (EAttribute) authServiceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceAttribute() {
		return serviceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceAssociation() {
		return serviceAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationDependency() {
		return navigationDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOMethod() {
		return daoMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAOMethod_MethodType() {
		return (EReference) daoMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOMethod_Query() {
		return (EAttribute) daoMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainPackage() {
		return domainPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPackage() {
		return viewPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControllerPackage() {
		return controllerPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistencePackage() {
		return persistencePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationPackage() {
		return applicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUIComponent() {
		return uiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthForm() {
		return authFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationPackage() {
		return navigationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainGeneralization() {
		return domainGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUIComponentField() {
		return uiComponentFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIComponentField_Inject() {
		return (EReference) uiComponentFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagLib() {
		return tagLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagLib_Prefix() {
		return (EAttribute) tagLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_CodeGenerationTemplate() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationCompositionPart() {
		return navigationCompositionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationCompositionWhole() {
		return navigationCompositionWholeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationProperty() {
		return navigationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultSet() {
		return resultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationConstraint() {
		return navigationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageConstraint() {
		return pageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultConstraint() {
		return resultConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultConstraint_Execute() {
		return (EAttribute) resultConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultConstraint_Ajax() {
		return (EAttribute) resultConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultConstraint_Result() {
		return (EAttribute) resultConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultConstraint_Render() {
		return (EAttribute) resultConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodConstraint() {
		return methodConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChainingConstraint() {
		return chainingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationGeneralization() {
		return navigationGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainConstraints() {
		return domainConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainConstraints_Collection() {
		return (EAttribute) domainConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainConstraints_Fetch() {
		return (EAttribute) domainConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainConstraints_Order() {
		return (EAttribute) domainConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainConstraints_Cascade() {
		return (EAttribute) domainConstraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOGeneralization() {
		return daoGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingLib() {
		return mappingLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassMapping() {
		return classMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainGeneralizationSet() {
		return domainGeneralizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainGeneralizationSet_Mapping() {
		return (EAttribute) domainGeneralizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagProperty() {
		return tagPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultProperty() {
		return resultPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassMappingPropery() {
		return classMappingProperyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeMappingProperty() {
		return attributeMappingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRealization() {
		return serviceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationGeneralizationSet() {
		return navigationGeneralizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOGeneralizationSet() {
		return daoGeneralizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceGeneralizationSet() {
		return serviceGeneralizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemanticPackage() {
		return semanticPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIRI() {
		return iriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIRI_Iri() {
		return (EAttribute) iriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIRI_IriVersion() {
		return (EAttribute) iriEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyModel() {
		return vocabularyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabulary() {
		return vocabularyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVocabulary_DirectlyImportsDocuments() {
		return (EReference) vocabularyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVocabulary_VocabularyIRI() {
		return (EReference) vocabularyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVocabulary_Axioms() {
		return (EReference) vocabularyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVocabulary_Annotations() {
		return (EReference) vocabularyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVocabulary_VocabularyDocument() {
		return (EAttribute) vocabularyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxiom() {
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyConstraints() {
		return vocabularyConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVocabularyConstraints_SubPropertyOf() {
		return (EAttribute) vocabularyConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyAssociation() {
		return vocabularyAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVocabularyAssociation_Prefix() {
		return (EAttribute) vocabularyAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyProperty() {
		return vocabularyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyEntity() {
		return vocabularyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVocabularyEntity_EntityIRI() {
		return (EReference) vocabularyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyDataType() {
		return vocabularyDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedIndividual() {
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyClass() {
		return vocabularyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVocabularyClass_Prefix() {
		return (EAttribute) vocabularyClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousIndividual() {
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVocabularyLiteral() {
		return vocabularyLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainVocabularyAssociation() {
		return domainVocabularyAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainVocabularyProperty() {
		return domainVocabularyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainAttribute() {
		return domainAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainAuthAttribute() {
		return domainAuthAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthUserName() {
		return authUserNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthPassword() {
		return authPasswordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthRoleName() {
		return authRoleNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthPermName() {
		return authPermNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainProperty() {
		return domainPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrontControllerTemplate() {
		return frontControllerTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_ClassTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_PageTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_AuthPageTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_FormTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_ClassExtension() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_PageExtension() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_RestClassTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_PartialTemplate() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrontControllerTemplate_PartialExtension() {
		return (EAttribute) frontControllerTemplateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDITemplate() {
		return diTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDITemplate_InterfaceTemplate() {
		return (EAttribute) diTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDITemplate_ClassTemplate() {
		return (EAttribute) diTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDITemplate_ClassExtension() {
		return (EAttribute) diTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDITemplate_AuthInterfaceTemplate() {
		return (EAttribute) diTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDITemplate_AuthClassTemplate() {
		return (EAttribute) diTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getORMTemplate() {
		return ormTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_ClassTemplate() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_EnumerationClassTemplate() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_ClassExtension() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_AuthUserClassTemplate() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_AuthRoleClassTemplate() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORMTemplate_AuthPermissionClassTemplate() {
		return (EAttribute) ormTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAOTemplate() {
		return daoTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOTemplate_ClassTemplate() {
		return (EAttribute) daoTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOTemplate_InterfaceTemplate() {
		return (EAttribute) daoTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOTemplate_ClassExtension() {
		return (EAttribute) daoTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAOTemplate_InterfaceExtension() {
		return (EAttribute) daoTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameWebConfiguration() {
		return frameWebConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameWebConfiguration_SrcPath() {
		return (EAttribute) frameWebConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameWebConfiguration_ViewPath() {
		return (EAttribute) frameWebConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameWebConfiguration_FrameworkDefinitionPath() {
		return (EAttribute) frameWebConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameWebConfiguration_ClassExtension() {
		return (EAttribute) frameWebConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameWebConfiguration_PageExtension() {
		return (EAttribute) frameWebConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestControllerTemplate() {
		return restControllerTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerTemplate_ClassTemplate() {
		return (EAttribute) restControllerTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerTemplate_ClassExtension() {
		return (EAttribute) restControllerTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestControllerMethod() {
		return restControllerMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerMethod_RequestType() {
		return (EAttribute) restControllerMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerMethod_IsDefault() {
		return (EAttribute) restControllerMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestControllerMethod_MethodType() {
		return (EReference) restControllerMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerMethod_RequestMapping() {
		return (EAttribute) restControllerMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestControllerMethod_DesiredResponseStatus() {
		return (EAttribute) restControllerMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestControllerClass() {
		return restControllerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartial() {
		return partialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationAggregationAssociation() {
		return navigationAggregationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigationAggregationAssociation_LowerBound() {
		return (EAttribute) navigationAggregationAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigationAggregationAssociation_UpperBound() {
		return (EAttribute) navigationAggregationAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationAggregationPart() {
		return navigationAggregationPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationAggregationWhole() {
		return navigationAggregationWholeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrameworkCategoryList() {
		return frameworkCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrameworkKindList() {
		return frameworkKindListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateTimePrecision() {
		return dateTimePrecisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeneration() {
		return generationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCollection() {
		return collectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCascade() {
		return cascadeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFetch() {
		return fetchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConstantNameList() {
		return constantNameListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInheritanceMapping() {
		return inheritanceMappingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHttpStatus() {
		return httpStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHttpMethodType() {
		return httpMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRational() {
		return rationalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecimal() {
		return decimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramewebFactory getFramewebFactory() {
		return (FramewebFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		framewebProjectEClass = createEClass(FRAMEWEB_PROJECT);
		createEReference(framewebProjectEClass, FRAMEWEB_PROJECT__COMPOSE);
		createEReference(framewebProjectEClass, FRAMEWEB_PROJECT__CONFIGURES);

		framewebModelEClass = createEClass(FRAMEWEB_MODEL);

		frameworkProfileEClass = createEClass(FRAMEWORK_PROFILE);
		createEAttribute(frameworkProfileEClass, FRAMEWORK_PROFILE__CATEGORY);
		createEAttribute(frameworkProfileEClass, FRAMEWORK_PROFILE__KIND);
		createEAttribute(frameworkProfileEClass, FRAMEWORK_PROFILE__VERSION);

		entityModelEClass = createEClass(ENTITY_MODEL);

		navigationModelEClass = createEClass(NAVIGATION_MODEL);

		applicationModelEClass = createEClass(APPLICATION_MODEL);

		persistenceModelEClass = createEClass(PERSISTENCE_MODEL);

		domainAssociationEClass = createEClass(DOMAIN_ASSOCIATION);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__COLLECTION);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__CASCADE);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__FETCH);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__ORDER);
		createEOperation(domainAssociationEClass, DOMAIN_ASSOCIATION___GET_SOURCE_MEMBER);
		createEOperation(domainAssociationEClass, DOMAIN_ASSOCIATION___GET_TARGET_MEMBER);
		createEOperation(domainAssociationEClass, DOMAIN_ASSOCIATION___GET_SOURCE_TO_TARGET_CARDINALITY);
		createEOperation(domainAssociationEClass, DOMAIN_ASSOCIATION___GET_TARGET_TO_SOURCE_CARDINALITY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__SIZE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_NULL);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_PERSISTENT);
		createEAttribute(attributeEClass, ATTRIBUTE__OWL_EQUIVALENT_PROPERTY);

		versionAttributeEClass = createEClass(VERSION_ATTRIBUTE);

		idAttributeEClass = createEClass(ID_ATTRIBUTE);
		createEAttribute(idAttributeEClass, ID_ATTRIBUTE__GENERATION);

		lobAttributeEClass = createEClass(LOB_ATTRIBUTE);

		embeddedAttributeEClass = createEClass(EMBEDDED_ATTRIBUTE);

		decimalAttributeEClass = createEClass(DECIMAL_ATTRIBUTE);
		createEAttribute(decimalAttributeEClass, DECIMAL_ATTRIBUTE__DECIMAL_PRECISION);
		createEAttribute(decimalAttributeEClass, DECIMAL_ATTRIBUTE__DECIMAL_SCALE);

		dateTimeAttributeEClass = createEClass(DATE_TIME_ATTRIBUTE);
		createEAttribute(dateTimeAttributeEClass, DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PAGE_TAG_LIB);

		authPageEClass = createEClass(AUTH_PAGE);

		daoInterfaceEClass = createEClass(DAO_INTERFACE);
		createEAttribute(daoInterfaceEClass, DAO_INTERFACE__INFIX);
		createEAttribute(daoInterfaceEClass, DAO_INTERFACE__SUFIX);

		daoClassEClass = createEClass(DAO_CLASS);
		createEAttribute(daoClassEClass, DAO_CLASS__SUFIX);
		createEAttribute(daoClassEClass, DAO_CLASS__INFIX);
		createEAttribute(daoClassEClass, DAO_CLASS__PREFIX);

		daoRealizationEClass = createEClass(DAO_REALIZATION);

		frontControllerClassEClass = createEClass(FRONT_CONTROLLER_CLASS);

		ioParameterEClass = createEClass(IO_PARAMETER);
		createEReference(ioParameterEClass, IO_PARAMETER__DISPLAY);

		resultDependencyEClass = createEClass(RESULT_DEPENDENCY);
		createEReference(resultDependencyEClass, RESULT_DEPENDENCY__RESULT_METHOD);
		createEReference(resultDependencyEClass, RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT);
		createEAttribute(resultDependencyEClass, RESULT_DEPENDENCY__HTTP_STATUS);

		authSuccessUrlEClass = createEClass(AUTH_SUCCESS_URL);

		authFailureUrlEClass = createEClass(AUTH_FAILURE_URL);

		navigationAssociationEClass = createEClass(NAVIGATION_ASSOCIATION);

		frontControllerMethodEClass = createEClass(FRONT_CONTROLLER_METHOD);
		createEAttribute(frontControllerMethodEClass, FRONT_CONTROLLER_METHOD__IS_DEFAULT);
		createEReference(frontControllerMethodEClass, FRONT_CONTROLLER_METHOD__METHOD_TYPE);
		createEAttribute(frontControllerMethodEClass, FRONT_CONTROLLER_METHOD__REQUEST_METHOD);

		authProcessingMethodEClass = createEClass(AUTH_PROCESSING_METHOD);

		serviceClassEClass = createEClass(SERVICE_CLASS);

		authServiceClassEClass = createEClass(AUTH_SERVICE_CLASS);
		createEAttribute(authServiceClassEClass, AUTH_SERVICE_CLASS__PERMISSION_NAME);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);

		authServiceInterfaceEClass = createEClass(AUTH_SERVICE_INTERFACE);

		serviceGeneralizationEClass = createEClass(SERVICE_GENERALIZATION);

		serviceControllerAssociationEClass = createEClass(SERVICE_CONTROLLER_ASSOCIATION);
		createEOperation(serviceControllerAssociationEClass, SERVICE_CONTROLLER_ASSOCIATION___GET_SOURCE_MEMBER);
		createEOperation(serviceControllerAssociationEClass, SERVICE_CONTROLLER_ASSOCIATION___GET_TARGET_MEMBER);

		domainClassEClass = createEClass(DOMAIN_CLASS);
		createEAttribute(domainClassEClass, DOMAIN_CLASS__TABLE);

		authUserEClass = createEClass(AUTH_USER);
		createEReference(authUserEClass, AUTH_USER__AUTH_USER_NAME);
		createEReference(authUserEClass, AUTH_USER__AUTH_PASSWORD);

		authRoleEClass = createEClass(AUTH_ROLE);
		createEReference(authRoleEClass, AUTH_ROLE__AUTH_ROLE_NAME);

		authPermissionEClass = createEClass(AUTH_PERMISSION);
		createEReference(authPermissionEClass, AUTH_PERMISSION__AUTH_PERM_NAME);

		frontControllerDependencyEClass = createEClass(FRONT_CONTROLLER_DEPENDENCY);
		createEReference(frontControllerDependencyEClass, FRONT_CONTROLLER_DEPENDENCY__METHOD);
		createEReference(frontControllerDependencyEClass, FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT);

		pageDependencyEClass = createEClass(PAGE_DEPENDENCY);
		createEReference(pageDependencyEClass, PAGE_DEPENDENCY__PAGE_DEPENDENCY_CONSTRAINT);

		daoServiceAssociationEClass = createEClass(DAO_SERVICE_ASSOCIATION);
		createEOperation(daoServiceAssociationEClass, DAO_SERVICE_ASSOCIATION___GET_SOURCE_MEMBER);
		createEOperation(daoServiceAssociationEClass, DAO_SERVICE_ASSOCIATION___GET_TARGET_MEMBER);

		navigationAttributeEClass = createEClass(NAVIGATION_ATTRIBUTE);

		navigationClassEClass = createEClass(NAVIGATION_CLASS);

		domainMethodEClass = createEClass(DOMAIN_METHOD);
		createEReference(domainMethodEClass, DOMAIN_METHOD__METHOD_TYPE);

		daoAttributeEClass = createEClass(DAO_ATTRIBUTE);

		serviceMethodEClass = createEClass(SERVICE_METHOD);
		createEReference(serviceMethodEClass, SERVICE_METHOD__METHOD_TYPE);

		authServiceMethodEClass = createEClass(AUTH_SERVICE_METHOD);
		createEAttribute(authServiceMethodEClass, AUTH_SERVICE_METHOD__PERMISSION_NAME);

		serviceAttributeEClass = createEClass(SERVICE_ATTRIBUTE);

		serviceAssociationEClass = createEClass(SERVICE_ASSOCIATION);

		navigationDependencyEClass = createEClass(NAVIGATION_DEPENDENCY);

		daoMethodEClass = createEClass(DAO_METHOD);
		createEReference(daoMethodEClass, DAO_METHOD__METHOD_TYPE);
		createEAttribute(daoMethodEClass, DAO_METHOD__QUERY);

		domainPackageEClass = createEClass(DOMAIN_PACKAGE);

		viewPackageEClass = createEClass(VIEW_PACKAGE);

		controllerPackageEClass = createEClass(CONTROLLER_PACKAGE);

		persistencePackageEClass = createEClass(PERSISTENCE_PACKAGE);

		applicationPackageEClass = createEClass(APPLICATION_PACKAGE);

		uiComponentEClass = createEClass(UI_COMPONENT);

		authFormEClass = createEClass(AUTH_FORM);

		resultTypeEClass = createEClass(RESULT_TYPE);

		navigationPackageEClass = createEClass(NAVIGATION_PACKAGE);

		domainGeneralizationEClass = createEClass(DOMAIN_GENERALIZATION);

		uiComponentFieldEClass = createEClass(UI_COMPONENT_FIELD);
		createEReference(uiComponentFieldEClass, UI_COMPONENT_FIELD__INJECT);

		tagLibEClass = createEClass(TAG_LIB);
		createEAttribute(tagLibEClass, TAG_LIB__PREFIX);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__CODE_GENERATION_TEMPLATE);

		navigationCompositionPartEClass = createEClass(NAVIGATION_COMPOSITION_PART);

		navigationCompositionWholeEClass = createEClass(NAVIGATION_COMPOSITION_WHOLE);

		navigationPropertyEClass = createEClass(NAVIGATION_PROPERTY);

		resultSetEClass = createEClass(RESULT_SET);

		navigationConstraintEClass = createEClass(NAVIGATION_CONSTRAINT);

		pageConstraintEClass = createEClass(PAGE_CONSTRAINT);

		resultConstraintEClass = createEClass(RESULT_CONSTRAINT);
		createEAttribute(resultConstraintEClass, RESULT_CONSTRAINT__EXECUTE);
		createEAttribute(resultConstraintEClass, RESULT_CONSTRAINT__AJAX);
		createEAttribute(resultConstraintEClass, RESULT_CONSTRAINT__RESULT);
		createEAttribute(resultConstraintEClass, RESULT_CONSTRAINT__RENDER);

		methodConstraintEClass = createEClass(METHOD_CONSTRAINT);

		chainingConstraintEClass = createEClass(CHAINING_CONSTRAINT);

		navigationGeneralizationEClass = createEClass(NAVIGATION_GENERALIZATION);

		domainConstraintsEClass = createEClass(DOMAIN_CONSTRAINTS);
		createEAttribute(domainConstraintsEClass, DOMAIN_CONSTRAINTS__COLLECTION);
		createEAttribute(domainConstraintsEClass, DOMAIN_CONSTRAINTS__FETCH);
		createEAttribute(domainConstraintsEClass, DOMAIN_CONSTRAINTS__ORDER);
		createEAttribute(domainConstraintsEClass, DOMAIN_CONSTRAINTS__CASCADE);

		daoGeneralizationEClass = createEClass(DAO_GENERALIZATION);

		mappingLibEClass = createEClass(MAPPING_LIB);

		classMappingEClass = createEClass(CLASS_MAPPING);

		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);

		domainGeneralizationSetEClass = createEClass(DOMAIN_GENERALIZATION_SET);
		createEAttribute(domainGeneralizationSetEClass, DOMAIN_GENERALIZATION_SET__MAPPING);

		controllerEClass = createEClass(CONTROLLER);

		tagPropertyEClass = createEClass(TAG_PROPERTY);

		resultPropertyEClass = createEClass(RESULT_PROPERTY);

		classMappingProperyEClass = createEClass(CLASS_MAPPING_PROPERY);

		attributeMappingPropertyEClass = createEClass(ATTRIBUTE_MAPPING_PROPERTY);

		serviceRealizationEClass = createEClass(SERVICE_REALIZATION);

		navigationGeneralizationSetEClass = createEClass(NAVIGATION_GENERALIZATION_SET);

		daoGeneralizationSetEClass = createEClass(DAO_GENERALIZATION_SET);

		serviceGeneralizationSetEClass = createEClass(SERVICE_GENERALIZATION_SET);

		semanticPackageEClass = createEClass(SEMANTIC_PACKAGE);

		iriEClass = createEClass(IRI);
		createEAttribute(iriEClass, IRI__IRI);
		createEAttribute(iriEClass, IRI__IRI_VERSION);

		vocabularyModelEClass = createEClass(VOCABULARY_MODEL);

		vocabularyEClass = createEClass(VOCABULARY);
		createEReference(vocabularyEClass, VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS);
		createEReference(vocabularyEClass, VOCABULARY__VOCABULARY_IRI);
		createEReference(vocabularyEClass, VOCABULARY__AXIOMS);
		createEReference(vocabularyEClass, VOCABULARY__ANNOTATIONS);
		createEAttribute(vocabularyEClass, VOCABULARY__VOCABULARY_DOCUMENT);

		axiomEClass = createEClass(AXIOM);

		annotationEClass = createEClass(ANNOTATION);

		vocabularyConstraintsEClass = createEClass(VOCABULARY_CONSTRAINTS);
		createEAttribute(vocabularyConstraintsEClass, VOCABULARY_CONSTRAINTS__SUB_PROPERTY_OF);

		vocabularyAssociationEClass = createEClass(VOCABULARY_ASSOCIATION);
		createEAttribute(vocabularyAssociationEClass, VOCABULARY_ASSOCIATION__PREFIX);

		vocabularyPropertyEClass = createEClass(VOCABULARY_PROPERTY);

		vocabularyEntityEClass = createEClass(VOCABULARY_ENTITY);
		createEReference(vocabularyEntityEClass, VOCABULARY_ENTITY__ENTITY_IRI);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);

		dataPropertyEClass = createEClass(DATA_PROPERTY);

		vocabularyDataTypeEClass = createEClass(VOCABULARY_DATA_TYPE);

		namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

		vocabularyClassEClass = createEClass(VOCABULARY_CLASS);
		createEAttribute(vocabularyClassEClass, VOCABULARY_CLASS__PREFIX);

		anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);

		individualEClass = createEClass(INDIVIDUAL);

		vocabularyLiteralEClass = createEClass(VOCABULARY_LITERAL);

		domainVocabularyAssociationEClass = createEClass(DOMAIN_VOCABULARY_ASSOCIATION);

		domainVocabularyPropertyEClass = createEClass(DOMAIN_VOCABULARY_PROPERTY);

		domainAttributeEClass = createEClass(DOMAIN_ATTRIBUTE);

		domainAuthAttributeEClass = createEClass(DOMAIN_AUTH_ATTRIBUTE);

		authUserNameEClass = createEClass(AUTH_USER_NAME);

		authPasswordEClass = createEClass(AUTH_PASSWORD);

		authRoleNameEClass = createEClass(AUTH_ROLE_NAME);

		authPermNameEClass = createEClass(AUTH_PERM_NAME);

		domainPropertyEClass = createEClass(DOMAIN_PROPERTY);

		frontControllerTemplateEClass = createEClass(FRONT_CONTROLLER_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__AUTH_PAGE_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__PARTIAL_TEMPLATE);
		createEAttribute(frontControllerTemplateEClass, FRONT_CONTROLLER_TEMPLATE__PARTIAL_EXTENSION);

		diTemplateEClass = createEClass(DI_TEMPLATE);
		createEAttribute(diTemplateEClass, DI_TEMPLATE__INTERFACE_TEMPLATE);
		createEAttribute(diTemplateEClass, DI_TEMPLATE__CLASS_TEMPLATE);
		createEAttribute(diTemplateEClass, DI_TEMPLATE__CLASS_EXTENSION);
		createEAttribute(diTemplateEClass, DI_TEMPLATE__AUTH_INTERFACE_TEMPLATE);
		createEAttribute(diTemplateEClass, DI_TEMPLATE__AUTH_CLASS_TEMPLATE);

		ormTemplateEClass = createEClass(ORM_TEMPLATE);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__CLASS_TEMPLATE);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__ENUMERATION_CLASS_TEMPLATE);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__CLASS_EXTENSION);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__AUTH_USER_CLASS_TEMPLATE);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__AUTH_ROLE_CLASS_TEMPLATE);
		createEAttribute(ormTemplateEClass, ORM_TEMPLATE__AUTH_PERMISSION_CLASS_TEMPLATE);

		daoTemplateEClass = createEClass(DAO_TEMPLATE);
		createEAttribute(daoTemplateEClass, DAO_TEMPLATE__CLASS_TEMPLATE);
		createEAttribute(daoTemplateEClass, DAO_TEMPLATE__INTERFACE_TEMPLATE);
		createEAttribute(daoTemplateEClass, DAO_TEMPLATE__CLASS_EXTENSION);
		createEAttribute(daoTemplateEClass, DAO_TEMPLATE__INTERFACE_EXTENSION);

		frameWebConfigurationEClass = createEClass(FRAME_WEB_CONFIGURATION);
		createEAttribute(frameWebConfigurationEClass, FRAME_WEB_CONFIGURATION__SRC_PATH);
		createEAttribute(frameWebConfigurationEClass, FRAME_WEB_CONFIGURATION__VIEW_PATH);
		createEAttribute(frameWebConfigurationEClass, FRAME_WEB_CONFIGURATION__FRAMEWORK_DEFINITION_PATH);
		createEAttribute(frameWebConfigurationEClass, FRAME_WEB_CONFIGURATION__CLASS_EXTENSION);
		createEAttribute(frameWebConfigurationEClass, FRAME_WEB_CONFIGURATION__PAGE_EXTENSION);

		restControllerTemplateEClass = createEClass(REST_CONTROLLER_TEMPLATE);
		createEAttribute(restControllerTemplateEClass, REST_CONTROLLER_TEMPLATE__CLASS_TEMPLATE);
		createEAttribute(restControllerTemplateEClass, REST_CONTROLLER_TEMPLATE__CLASS_EXTENSION);

		restControllerMethodEClass = createEClass(REST_CONTROLLER_METHOD);
		createEAttribute(restControllerMethodEClass, REST_CONTROLLER_METHOD__REQUEST_TYPE);
		createEAttribute(restControllerMethodEClass, REST_CONTROLLER_METHOD__IS_DEFAULT);
		createEReference(restControllerMethodEClass, REST_CONTROLLER_METHOD__METHOD_TYPE);
		createEAttribute(restControllerMethodEClass, REST_CONTROLLER_METHOD__REQUEST_MAPPING);
		createEAttribute(restControllerMethodEClass, REST_CONTROLLER_METHOD__DESIRED_RESPONSE_STATUS);

		restControllerClassEClass = createEClass(REST_CONTROLLER_CLASS);

		partialEClass = createEClass(PARTIAL);

		navigationAggregationAssociationEClass = createEClass(NAVIGATION_AGGREGATION_ASSOCIATION);
		createEAttribute(navigationAggregationAssociationEClass, NAVIGATION_AGGREGATION_ASSOCIATION__LOWER_BOUND);
		createEAttribute(navigationAggregationAssociationEClass, NAVIGATION_AGGREGATION_ASSOCIATION__UPPER_BOUND);

		navigationAggregationPartEClass = createEClass(NAVIGATION_AGGREGATION_PART);

		navigationAggregationWholeEClass = createEClass(NAVIGATION_AGGREGATION_WHOLE);

		// Create enums
		frameworkCategoryListEEnum = createEEnum(FRAMEWORK_CATEGORY_LIST);
		frameworkKindListEEnum = createEEnum(FRAMEWORK_KIND_LIST);
		dateTimePrecisionEEnum = createEEnum(DATE_TIME_PRECISION);
		generationEEnum = createEEnum(GENERATION);
		collectionEEnum = createEEnum(COLLECTION);
		orderEEnum = createEEnum(ORDER);
		cascadeEEnum = createEEnum(CASCADE);
		fetchEEnum = createEEnum(FETCH);
		constantNameListEEnum = createEEnum(CONSTANT_NAME_LIST);
		inheritanceMappingEEnum = createEEnum(INHERITANCE_MAPPING);
		httpStatusEEnum = createEEnum(HTTP_STATUS);
		httpMethodTypeEEnum = createEEnum(HTTP_METHOD_TYPE);

		// Create data types
		rationalEDataType = createEDataType(RATIONAL);
		decimalEDataType = createEDataType(DECIMAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		framewebModelEClass.getESuperTypes().add(theUMLPackage.getModel());
		frameworkProfileEClass.getESuperTypes().add(theUMLPackage.getProfile());
		entityModelEClass.getESuperTypes().add(this.getFramewebModel());
		navigationModelEClass.getESuperTypes().add(this.getFramewebModel());
		applicationModelEClass.getESuperTypes().add(this.getFramewebModel());
		persistenceModelEClass.getESuperTypes().add(this.getFramewebModel());
		domainAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		attributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		versionAttributeEClass.getESuperTypes().add(this.getAttribute());
		idAttributeEClass.getESuperTypes().add(this.getAttribute());
		lobAttributeEClass.getESuperTypes().add(this.getAttribute());
		embeddedAttributeEClass.getESuperTypes().add(this.getAttribute());
		decimalAttributeEClass.getESuperTypes().add(this.getAttribute());
		dateTimeAttributeEClass.getESuperTypes().add(this.getAttribute());
		pageEClass.getESuperTypes().add(this.getNavigationClass());
		authPageEClass.getESuperTypes().add(this.getPage());
		daoInterfaceEClass.getESuperTypes().add(theUMLPackage.getInterface());
		daoClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		daoRealizationEClass.getESuperTypes().add(theUMLPackage.getInterfaceRealization());
		frontControllerClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		ioParameterEClass.getESuperTypes().add(this.getNavigationAttribute());
		resultDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		authSuccessUrlEClass.getESuperTypes().add(this.getResultDependency());
		authFailureUrlEClass.getESuperTypes().add(this.getResultDependency());
		navigationAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		frontControllerMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		authProcessingMethodEClass.getESuperTypes().add(this.getFrontControllerMethod());
		serviceClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		authServiceClassEClass.getESuperTypes().add(this.getServiceClass());
		serviceInterfaceEClass.getESuperTypes().add(theUMLPackage.getInterface());
		authServiceInterfaceEClass.getESuperTypes().add(this.getServiceInterface());
		serviceGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		serviceControllerAssociationEClass.getESuperTypes().add(this.getServiceAssociation());
		domainClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		authUserEClass.getESuperTypes().add(this.getDomainClass());
		authRoleEClass.getESuperTypes().add(this.getDomainClass());
		authPermissionEClass.getESuperTypes().add(this.getDomainClass());
		frontControllerDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		pageDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		daoServiceAssociationEClass.getESuperTypes().add(this.getServiceAssociation());
		navigationAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		navigationClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		domainMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		daoAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		serviceMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		authServiceMethodEClass.getESuperTypes().add(this.getServiceMethod());
		serviceAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		serviceAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		navigationDependencyEClass.getESuperTypes().add(theUMLPackage.getDependency());
		daoMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		domainPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		viewPackageEClass.getESuperTypes().add(this.getNavigationPackage());
		controllerPackageEClass.getESuperTypes().add(this.getNavigationPackage());
		persistencePackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		applicationPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		uiComponentEClass.getESuperTypes().add(this.getNavigationClass());
		authFormEClass.getESuperTypes().add(this.getUIComponent());
		resultTypeEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		navigationPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		domainGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		uiComponentFieldEClass.getESuperTypes().add(this.getNavigationAttribute());
		tagLibEClass.getESuperTypes().add(theUMLPackage.getPackage());
		tagEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		navigationCompositionPartEClass.getESuperTypes().add(this.getNavigationProperty());
		navigationCompositionWholeEClass.getESuperTypes().add(this.getNavigationProperty());
		navigationPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		resultSetEClass.getESuperTypes().add(theUMLPackage.getPackage());
		navigationConstraintEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		pageConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		resultConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		methodConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		chainingConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		navigationGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		domainConstraintsEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		daoGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		mappingLibEClass.getESuperTypes().add(theUMLPackage.getPackage());
		classMappingEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		attributeMappingEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		domainGeneralizationSetEClass.getESuperTypes().add(theUMLPackage.getGeneralizationSet());
		controllerEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		tagPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		resultPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		classMappingProperyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		attributeMappingPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		serviceRealizationEClass.getESuperTypes().add(theUMLPackage.getInterfaceRealization());
		navigationGeneralizationSetEClass.getESuperTypes().add(theUMLPackage.getGeneralizationSet());
		daoGeneralizationSetEClass.getESuperTypes().add(theUMLPackage.getGeneralizationSet());
		serviceGeneralizationSetEClass.getESuperTypes().add(theUMLPackage.getGeneralizationSet());
		semanticPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		iriEClass.getESuperTypes().add(theUMLPackage.getProperty());
		vocabularyModelEClass.getESuperTypes().add(this.getFramewebModel());
		vocabularyEClass.getESuperTypes().add(theUMLPackage.getPackage());
		axiomEClass.getESuperTypes().add(theUMLPackage.getClass_());
		annotationEClass.getESuperTypes().add(theUMLPackage.getClass_());
		vocabularyConstraintsEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		vocabularyAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		vocabularyPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		vocabularyEntityEClass.getESuperTypes().add(theUMLPackage.getClassifier());
		objectPropertyEClass.getESuperTypes().add(this.getVocabularyEntity());
		objectPropertyEClass.getESuperTypes().add(this.getVocabularyAssociation());
		dataPropertyEClass.getESuperTypes().add(this.getVocabularyEntity());
		dataPropertyEClass.getESuperTypes().add(this.getVocabularyAssociation());
		vocabularyDataTypeEClass.getESuperTypes().add(this.getVocabularyEntity());
		vocabularyDataTypeEClass.getESuperTypes().add(theUMLPackage.getDataType());
		namedIndividualEClass.getESuperTypes().add(this.getVocabularyEntity());
		namedIndividualEClass.getESuperTypes().add(this.getIndividual());
		vocabularyClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
		individualEClass.getESuperTypes().add(theUMLPackage.getProperty());
		vocabularyLiteralEClass.getESuperTypes().add(theUMLPackage.getLiteralString());
		domainVocabularyAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		domainVocabularyPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		domainAttributeEClass.getESuperTypes().add(this.getAttribute());
		domainAuthAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		authUserNameEClass.getESuperTypes().add(this.getDomainAuthAttribute());
		authPasswordEClass.getESuperTypes().add(this.getDomainAuthAttribute());
		authRoleNameEClass.getESuperTypes().add(this.getDomainAuthAttribute());
		authRoleNameEClass.getESuperTypes().add(this.getIdAttribute());
		authPermNameEClass.getESuperTypes().add(this.getDomainAuthAttribute());
		authPermNameEClass.getESuperTypes().add(this.getIdAttribute());
		domainPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		frontControllerTemplateEClass.getESuperTypes().add(this.getFrameworkProfile());
		diTemplateEClass.getESuperTypes().add(this.getFrameworkProfile());
		ormTemplateEClass.getESuperTypes().add(this.getFrameworkProfile());
		daoTemplateEClass.getESuperTypes().add(this.getFrameworkProfile());
		frameWebConfigurationEClass.getESuperTypes().add(this.getFrameworkProfile());
		restControllerTemplateEClass.getESuperTypes().add(this.getFrameworkProfile());
		restControllerMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		restControllerClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		partialEClass.getESuperTypes().add(this.getPage());
		navigationAggregationAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		navigationAggregationPartEClass.getESuperTypes().add(this.getNavigationProperty());
		navigationAggregationWholeEClass.getESuperTypes().add(this.getNavigationProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(framewebProjectEClass, FramewebProject.class, "FramewebProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFramewebProject_Compose(), this.getFramewebModel(), null, "compose", null, 0, -1,
				FramewebProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFramewebProject_Configures(), this.getFrameworkProfile(), null, "configures", null, 0, -1,
				FramewebProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(framewebModelEClass, FramewebModel.class, "FramewebModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameworkProfileEClass, FrameworkProfile.class, "FrameworkProfile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrameworkProfile_Category(), this.getFrameworkCategoryList(), "category", null, 0, 1,
				FrameworkProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameworkProfile_Kind(), this.getFrameworkKindList(), "kind", null, 0, 1,
				FrameworkProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameworkProfile_Version(), theTypesPackage.getString(), "version", null, 0, 1,
				FrameworkProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(entityModelEClass, EntityModel.class, "EntityModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationModelEClass, NavigationModel.class, "NavigationModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistenceModelEClass, PersistenceModel.class, "PersistenceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainAssociationEClass, DomainAssociation.class, "DomainAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainAssociation_Collection(), this.getCollection(), "collection", null, 0, 1,
				DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Cascade(), this.getCascade(), "cascade", null, 0, 1,
				DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Fetch(), this.getFetch(), "fetch", null, 0, 1, DomainAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Order(), this.getOrder(), "order", null, 0, 1, DomainAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDomainAssociation__GetSourceMember(), theUMLPackage.getProperty(), "getSourceMember", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getDomainAssociation__GetTargetMember(), theUMLPackage.getProperty(), "getTargetMember", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getDomainAssociation__GetSourceToTargetCardinality(), theTypesPackage.getString(),
				"getSourceToTargetCardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDomainAssociation__GetTargetToSourceCardinality(), theTypesPackage.getString(),
				"getTargetToSourceCardinality", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Size(), ecorePackage.getELong(), "size", null, 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsNull(), ecorePackage.getEBoolean(), "isNull", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsPersistent(), ecorePackage.getEBoolean(), "isPersistent", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_OwlEquivalentProperty(), theEcorePackage.getEString(), "owlEquivalentProperty",
				null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionAttributeEClass, VersionAttribute.class, "VersionAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(idAttributeEClass, IdAttribute.class, "IdAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdAttribute_Generation(), this.getGeneration(), "generation", null, 0, 1, IdAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobAttributeEClass, LOBAttribute.class, "LOBAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(embeddedAttributeEClass, EmbeddedAttribute.class, "EmbeddedAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalAttributeEClass, DecimalAttribute.class, "DecimalAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalAttribute_DecimalPrecision(), ecorePackage.getELong(), "decimalPrecision", null, 0, 1,
				DecimalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalAttribute_DecimalScale(), ecorePackage.getELong(), "decimalScale", null, 0, 1,
				DecimalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeAttributeEClass, DateTimeAttribute.class, "DateTimeAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeAttribute_DateTimePrecision(), this.getDateTimePrecision(), "dateTimePrecision", null,
				0, 1, DateTimeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_PageTagLib(), this.getTagLib(), null, "pageTagLib", null, 0, -1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authPageEClass, AuthPage.class, "AuthPage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoInterfaceEClass, DAOInterface.class, "DAOInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAOInterface_Infix(), theTypesPackage.getString(), "infix", null, 1, 1, DAOInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOInterface_Sufix(), theTypesPackage.getString(), "sufix", "DAO", 1, 1, DAOInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(daoClassEClass, DAOClass.class, "DAOClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAOClass_Sufix(), theTypesPackage.getString(), "sufix", "", 1, 1, DAOClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOClass_Infix(), theTypesPackage.getString(), "infix", "DAO", 1, 1, DAOClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDAOClass_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, DAOClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(daoRealizationEClass, DAORealization.class, "DAORealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontControllerClassEClass, FrontControllerClass.class, "FrontControllerClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioParameterEClass, IOParameter.class, "IOParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOParameter_Display(), this.getUIComponentField(), this.getUIComponentField_Inject(),
				"display", null, 0, -1, IOParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resultDependencyEClass, ResultDependency.class, "ResultDependency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultDependency_ResultMethod(), this.getFrontControllerMethod(), null, "resultMethod", null,
				0, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultDependency_ResultDependencyConstraint(), this.getResultConstraint(), null,
				"resultDependencyConstraint", null, 1, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResultDependency_HttpStatus(), theTypesPackage.getString(), "httpStatus", null, 0, 1,
				ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(authSuccessUrlEClass, AuthSuccessUrl.class, "AuthSuccessUrl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authFailureUrlEClass, AuthFailureUrl.class, "AuthFailureUrl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationAssociationEClass, NavigationAssociation.class, "NavigationAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontControllerMethodEClass, FrontControllerMethod.class, "FrontControllerMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrontControllerMethod_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 0, 1,
				FrontControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrontControllerMethod_MethodType(), theUMLPackage.getType(), null, "methodType", null, 0, 1,
				FrontControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFrontControllerMethod_RequestMethod(), theTypesPackage.getString(), "requestMethod", null, 0,
				1, FrontControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authProcessingMethodEClass, AuthProcessingMethod.class, "AuthProcessingMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceClassEClass, ServiceClass.class, "ServiceClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authServiceClassEClass, AuthServiceClass.class, "AuthServiceClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthServiceClass_PermissionName(), theTypesPackage.getString(), "permissionName", null, 1, 1,
				AuthServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authServiceInterfaceEClass, AuthServiceInterface.class, "AuthServiceInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceGeneralizationEClass, ServiceGeneralization.class, "ServiceGeneralization", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceControllerAssociationEClass, ServiceControllerAssociation.class,
				"ServiceControllerAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceControllerAssociation__GetSourceMember(), theUMLPackage.getProperty(),
				"getSourceMember", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceControllerAssociation__GetTargetMember(), theUMLPackage.getProperty(),
				"getTargetMember", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(domainClassEClass, DomainClass.class, "DomainClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainClass_Table(), ecorePackage.getEString(), "table", null, 0, 1, DomainClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authUserEClass, AuthUser.class, "AuthUser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthUser_AuthUserName(), this.getAuthUserName(), null, "authUserName", null, 1, 1,
				AuthUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthUser_AuthPassword(), this.getAuthPassword(), null, "authPassword", null, 1, 1,
				AuthUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authRoleEClass, AuthRole.class, "AuthRole", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthRole_AuthRoleName(), this.getAuthRoleName(), null, "authRoleName", null, 1, 1,
				AuthRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authPermissionEClass, AuthPermission.class, "AuthPermission", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthPermission_AuthPermName(), this.getAuthPermName(), null, "authPermName", null, 1, 1,
				AuthPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frontControllerDependencyEClass, FrontControllerDependency.class, "FrontControllerDependency",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrontControllerDependency_Method(), this.getFrontControllerMethod(), null, "method", null, 0,
				1, FrontControllerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrontControllerDependency_MethodDependendencyConstraint(), this.getMethodConstraint(), null,
				"methodDependendencyConstraint", null, 1, 1, FrontControllerDependency.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(pageDependencyEClass, PageDependency.class, "PageDependency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageDependency_PageDependencyConstraint(), this.getPageConstraint(), null,
				"pageDependencyConstraint", null, 1, 1, PageDependency.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daoServiceAssociationEClass, DAOServiceAssociation.class, "DAOServiceAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDAOServiceAssociation__GetSourceMember(), theUMLPackage.getProperty(), "getSourceMember", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDAOServiceAssociation__GetTargetMember(), theUMLPackage.getProperty(), "getTargetMember", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigationAttributeEClass, NavigationAttribute.class, "NavigationAttribute", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationClassEClass, NavigationClass.class, "NavigationClass", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainMethodEClass, DomainMethod.class, "DomainMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainMethod_MethodType(), theUMLPackage.getType(), null, "methodType", null, 0, 1,
				DomainMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daoAttributeEClass, DAOAttribute.class, "DAOAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceMethod_MethodType(), theUMLPackage.getType(), null, "methodType", null, 0, 1,
				ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authServiceMethodEClass, AuthServiceMethod.class, "AuthServiceMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthServiceMethod_PermissionName(), theTypesPackage.getString(), "permissionName", null, 1, 1,
				AuthServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceAttributeEClass, ServiceAttribute.class, "ServiceAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceAssociationEClass, ServiceAssociation.class, "ServiceAssociation", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationDependencyEClass, NavigationDependency.class, "NavigationDependency", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoMethodEClass, DAOMethod.class, "DAOMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAOMethod_MethodType(), theUMLPackage.getType(), null, "methodType", null, 0, 1,
				DAOMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDAOMethod_Query(), theTypesPackage.getString(), "query", null, 0, 1, DAOMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainPackageEClass, DomainPackage.class, "DomainPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewPackageEClass, ViewPackage.class, "ViewPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerPackageEClass, ControllerPackage.class, "ControllerPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistencePackageEClass, PersistencePackage.class, "PersistencePackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationPackageEClass, ApplicationPackage.class, "ApplicationPackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authFormEClass, AuthForm.class, "AuthForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationPackageEClass, NavigationPackage.class, "NavigationPackage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainGeneralizationEClass, DomainGeneralization.class, "DomainGeneralization", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiComponentFieldEClass, UIComponentField.class, "UIComponentField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIComponentField_Inject(), this.getIOParameter(), this.getIOParameter_Display(), "inject",
				null, 0, 1, UIComponentField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagLibEClass, TagLib.class, "TagLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagLib_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, TagLib.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_CodeGenerationTemplate(), theTypesPackage.getString(), "codeGenerationTemplate", null, 0,
				1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(navigationCompositionPartEClass, NavigationCompositionPart.class, "NavigationCompositionPart",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationCompositionWholeEClass, NavigationCompositionWhole.class, "NavigationCompositionWhole",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationPropertyEClass, NavigationProperty.class, "NavigationProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultSetEClass, ResultSet.class, "ResultSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationConstraintEClass, NavigationConstraint.class, "NavigationConstraint", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageConstraintEClass, PageConstraint.class, "PageConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultConstraintEClass, ResultConstraint.class, "ResultConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultConstraint_Execute(), theEcorePackage.getEString(), "execute", "@this", 0, 1,
				ResultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConstraint_Ajax(), ecorePackage.getEBoolean(), "ajax", "false", 0, 1,
				ResultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConstraint_Result(), theTypesPackage.getString(), "result", null, 0, 1,
				ResultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConstraint_Render(), theEcorePackage.getEString(), "render", "@none", 0, 1,
				ResultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(methodConstraintEClass, MethodConstraint.class, "MethodConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(chainingConstraintEClass, ChainingConstraint.class, "ChainingConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationGeneralizationEClass, NavigationGeneralization.class, "NavigationGeneralization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainConstraintsEClass, DomainConstraints.class, "DomainConstraints", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainConstraints_Collection(), this.getCollection(), "collection", null, 0, 1,
				DomainConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainConstraints_Fetch(), this.getFetch(), "fetch", null, 0, 1, DomainConstraints.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainConstraints_Order(), this.getOrder(), "order", null, 0, 1, DomainConstraints.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainConstraints_Cascade(), this.getCascade(), "cascade", null, 0, 1,
				DomainConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(daoGeneralizationEClass, DAOGeneralization.class, "DAOGeneralization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingLibEClass, MappingLib.class, "MappingLib", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingEClass, ClassMapping.class, "ClassMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainGeneralizationSetEClass, DomainGeneralizationSet.class, "DomainGeneralizationSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainGeneralizationSet_Mapping(), this.getInheritanceMapping(), "mapping", null, 0, 1,
				DomainGeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagPropertyEClass, TagProperty.class, "TagProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultPropertyEClass, ResultProperty.class, "ResultProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingProperyEClass, ClassMappingPropery.class, "ClassMappingPropery", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingPropertyEClass, AttributeMappingProperty.class, "AttributeMappingProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRealizationEClass, ServiceRealization.class, "ServiceRealization", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationGeneralizationSetEClass, NavigationGeneralizationSet.class, "NavigationGeneralizationSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoGeneralizationSetEClass, DAOGeneralizationSet.class, "DAOGeneralizationSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceGeneralizationSetEClass, ServiceGeneralizationSet.class, "ServiceGeneralizationSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticPackageEClass, SemanticPackage.class, "SemanticPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(iriEClass, br.ufes.inf.nemo.frameweb.model.frameweb.IRI.class, "IRI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRI_Iri(), theEcorePackage.getEString(), "iri", null, 1, 1,
				br.ufes.inf.nemo.frameweb.model.frameweb.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRI_IriVersion(), theEcorePackage.getEString(), "iriVersion", null, 0, 1,
				br.ufes.inf.nemo.frameweb.model.frameweb.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vocabularyModelEClass, VocabularyModel.class, "VocabularyModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyEClass, Vocabulary.class, "Vocabulary", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocabulary_DirectlyImportsDocuments(), this.getIRI(), null, "directlyImportsDocuments", null,
				0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVocabulary_VocabularyIRI(), this.getIRI(), null, "vocabularyIRI", null, 1, 1,
				Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVocabulary_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, Vocabulary.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVocabulary_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1,
				Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVocabulary_VocabularyDocument(), theEcorePackage.getEString(), "vocabularyDocument", null, 0,
				1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(axiomEClass, Axiom.class, "Axiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyConstraintsEClass, VocabularyConstraints.class, "VocabularyConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVocabularyConstraints_SubPropertyOf(), theTypesPackage.getString(), "subPropertyOf", null, 0,
				1, VocabularyConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vocabularyAssociationEClass, VocabularyAssociation.class, "VocabularyAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVocabularyAssociation_Prefix(), theTypesPackage.getString(), "prefix", null, 0, 1,
				VocabularyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vocabularyPropertyEClass, VocabularyProperty.class, "VocabularyProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyEntityEClass, VocabularyEntity.class, "VocabularyEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocabularyEntity_EntityIRI(), this.getIRI(), null, "entityIRI", null, 1, 1,
				VocabularyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyDataTypeEClass, VocabularyDataType.class, "VocabularyDataType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyClassEClass, VocabularyClass.class, "VocabularyClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVocabularyClass_Prefix(), theTypesPackage.getString(), "prefix", null, 0, 1,
				VocabularyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyLiteralEClass, VocabularyLiteral.class, "VocabularyLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainVocabularyAssociationEClass, DomainVocabularyAssociation.class, "DomainVocabularyAssociation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainVocabularyPropertyEClass, DomainVocabularyProperty.class, "DomainVocabularyProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainAttributeEClass, DomainAttribute.class, "DomainAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainAuthAttributeEClass, DomainAuthAttribute.class, "DomainAuthAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authUserNameEClass, AuthUserName.class, "AuthUserName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authPasswordEClass, AuthPassword.class, "AuthPassword", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authRoleNameEClass, AuthRoleName.class, "AuthRoleName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authPermNameEClass, AuthPermName.class, "AuthPermName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPropertyEClass, DomainProperty.class, "DomainProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontControllerTemplateEClass, FrontControllerTemplate.class, "FrontControllerTemplate",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrontControllerTemplate_ClassTemplate(), theTypesPackage.getString(), "classTemplate", null,
				0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_PageTemplate(), theTypesPackage.getString(), "pageTemplate", null, 0,
				1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_AuthPageTemplate(), theTypesPackage.getString(), "authPageTemplate",
				null, 0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_FormTemplate(), theTypesPackage.getString(), "formTemplate", null, 0,
				1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_ClassExtension(), theTypesPackage.getString(), "classExtension", null,
				0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_PageExtension(), theTypesPackage.getString(), "pageExtension", null,
				0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_RestClassTemplate(), theTypesPackage.getString(), "restClassTemplate",
				null, 0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_PartialTemplate(), theTypesPackage.getString(), "partialTemplate",
				null, 0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontControllerTemplate_PartialExtension(), theTypesPackage.getString(), "partialExtension",
				null, 0, 1, FrontControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diTemplateEClass, DITemplate.class, "DITemplate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDITemplate_InterfaceTemplate(), theTypesPackage.getString(), "interfaceTemplate", null, 0, 1,
				DITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDITemplate_ClassTemplate(), theTypesPackage.getString(), "classTemplate", null, 0, 1,
				DITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDITemplate_ClassExtension(), theTypesPackage.getString(), "classExtension", null, 0, 1,
				DITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDITemplate_AuthInterfaceTemplate(), theTypesPackage.getString(), "authInterfaceTemplate",
				null, 0, 1, DITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDITemplate_AuthClassTemplate(), theTypesPackage.getString(), "authClassTemplate", null, 0, 1,
				DITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ormTemplateEClass, ORMTemplate.class, "ORMTemplate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getORMTemplate_ClassTemplate(), theTypesPackage.getString(), "classTemplate", null, 0, 1,
				ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMTemplate_EnumerationClassTemplate(), theTypesPackage.getString(),
				"enumerationClassTemplate", null, 0, 1, ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMTemplate_ClassExtension(), theTypesPackage.getString(), "classExtension", null, 0, 1,
				ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMTemplate_AuthUserClassTemplate(), theTypesPackage.getString(), "authUserClassTemplate",
				null, 0, 1, ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMTemplate_AuthRoleClassTemplate(), theTypesPackage.getString(), "authRoleClassTemplate",
				null, 0, 1, ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMTemplate_AuthPermissionClassTemplate(), theTypesPackage.getString(),
				"authPermissionClassTemplate", null, 0, 1, ORMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoTemplateEClass, DAOTemplate.class, "DAOTemplate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAOTemplate_ClassTemplate(), theTypesPackage.getString(), "classTemplate", null, 0, 1,
				DAOTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOTemplate_InterfaceTemplate(), theTypesPackage.getString(), "interfaceTemplate", null, 0, 1,
				DAOTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOTemplate_ClassExtension(), theTypesPackage.getString(), "classExtension", null, 0, 1,
				DAOTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOTemplate_InterfaceExtension(), theTypesPackage.getString(), "interfaceExtension", null, 0,
				1, DAOTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(frameWebConfigurationEClass, FrameWebConfiguration.class, "FrameWebConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrameWebConfiguration_SrcPath(), theTypesPackage.getString(), "srcPath", null, 0, 1,
				FrameWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameWebConfiguration_ViewPath(), theTypesPackage.getString(), "viewPath", null, 0, 1,
				FrameWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameWebConfiguration_FrameworkDefinitionPath(), theTypesPackage.getString(),
				"frameworkDefinitionPath", null, 0, 1, FrameWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameWebConfiguration_ClassExtension(), theTypesPackage.getString(), "classExtension", null,
				0, 1, FrameWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameWebConfiguration_PageExtension(), theTypesPackage.getString(), "pageExtension", null, 0,
				1, FrameWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restControllerTemplateEClass, RestControllerTemplate.class, "RestControllerTemplate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestControllerTemplate_ClassTemplate(), theTypesPackage.getString(), "classTemplate", null, 0,
				1, RestControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestControllerTemplate_ClassExtension(), theTypesPackage.getString(), "classExtension", null,
				0, 1, RestControllerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restControllerMethodEClass, RestControllerMethod.class, "RestControllerMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestControllerMethod_RequestType(), this.getHttpMethodType(), "requestType", null, 0, 1,
				RestControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestControllerMethod_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 0, 1,
				RestControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestControllerMethod_MethodType(), theUMLPackage.getType(), null, "methodType", null, 0, 1,
				RestControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestControllerMethod_RequestMapping(), theTypesPackage.getString(), "requestMapping", null, 0,
				1, RestControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestControllerMethod_DesiredResponseStatus(), this.getHttpStatus(), "desiredResponseStatus",
				null, 0, 1, RestControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restControllerClassEClass, RestControllerClass.class, "RestControllerClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialEClass, Partial.class, "Partial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationAggregationAssociationEClass, NavigationAggregationAssociation.class,
				"NavigationAggregationAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationAggregationAssociation_LowerBound(), theEcorePackage.getEInt(), "lowerBound", "1",
				0, 1, NavigationAggregationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationAggregationAssociation_UpperBound(), theEcorePackage.getEInt(), "upperBound", "1",
				0, 1, NavigationAggregationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationAggregationPartEClass, NavigationAggregationPart.class, "NavigationAggregationPart",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationAggregationWholeEClass, NavigationAggregationWhole.class, "NavigationAggregationWhole",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(frameworkCategoryListEEnum, FrameworkCategoryList.class, "FrameworkCategoryList");
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.FRONT_CONTROLLER);
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.DEPENDENCY_INJECTION);
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.OBJETO_RELACIONAL);

		initEEnum(frameworkKindListEEnum, FrameworkKindList.class, "FrameworkKindList");
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.STANDARD_SPECIFICATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.FRAMEWORK_SPECIFICATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.FRAMEWORK_IMPLEMENTATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.CUSTOM);

		initEEnum(dateTimePrecisionEEnum, DateTimePrecision.class, "DateTimePrecision");
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.TIMESTAMP);
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.TIME);
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.DATE);

		initEEnum(generationEEnum, Generation.class, "Generation");
		addEEnumLiteral(generationEEnum, Generation.AUTO);
		addEEnumLiteral(generationEEnum, Generation.IDENTITY);
		addEEnumLiteral(generationEEnum, Generation.SEQUENCE);
		addEEnumLiteral(generationEEnum, Generation.NONE);
		addEEnumLiteral(generationEEnum, Generation.TABLE);

		initEEnum(collectionEEnum, Collection.class, "Collection");
		addEEnumLiteral(collectionEEnum, Collection.SET);
		addEEnumLiteral(collectionEEnum, Collection.BAG);
		addEEnumLiteral(collectionEEnum, Collection.LIST);
		addEEnumLiteral(collectionEEnum, Collection.MAP);

		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.NATURAL);
		addEEnumLiteral(orderEEnum, Order.COLUMN_NAME_ASC);
		addEEnumLiteral(orderEEnum, Order.COLUMN_NAME_DESC);

		initEEnum(cascadeEEnum, Cascade.class, "Cascade");
		addEEnumLiteral(cascadeEEnum, Cascade.REMOVE);
		addEEnumLiteral(cascadeEEnum, Cascade.MERGE);
		addEEnumLiteral(cascadeEEnum, Cascade.REFRESH);
		addEEnumLiteral(cascadeEEnum, Cascade.PERSIST);
		addEEnumLiteral(cascadeEEnum, Cascade.NONE);
		addEEnumLiteral(cascadeEEnum, Cascade.ALL);

		initEEnum(fetchEEnum, Fetch.class, "Fetch");
		addEEnumLiteral(fetchEEnum, Fetch.LAZY);
		addEEnumLiteral(fetchEEnum, Fetch.EAGER);

		initEEnum(constantNameListEEnum, ConstantNameList.class, "ConstantNameList");
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.DAO);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.INTERFACE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.BASE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.CLASS);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.IMPL);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.CONTROLLER);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.DOMAIN);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.PERSISTENCE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.APPLICATION);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.VIEW);

		initEEnum(inheritanceMappingEEnum, InheritanceMapping.class, "InheritanceMapping");
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.SINGLETABLE);
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.UNION);
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.JOIN);

		initEEnum(httpStatusEEnum, HttpStatus.class, "HttpStatus");
		addEEnumLiteral(httpStatusEEnum, HttpStatus.SUCCESS);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.CREATED);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.NO_CONTENT);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.PARTIAL_CONTENT);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.BAD_REQUEST);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.NOT_FOUND);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.METHOD_NOT_ALLOWED);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.CONFLICT);

		initEEnum(httpMethodTypeEEnum, HttpMethodType.class, "HttpMethodType");
		addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.GET);
		addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.PUT);
		addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.POST);
		addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.DELETE);

		// Initialize data types
		initEDataType(rationalEDataType, double.class, "Rational", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalEDataType, double.class, "Decimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(iriEClass, source, new String[] { "name", "IRI" });
	}

} //FramewebPackageImpl
