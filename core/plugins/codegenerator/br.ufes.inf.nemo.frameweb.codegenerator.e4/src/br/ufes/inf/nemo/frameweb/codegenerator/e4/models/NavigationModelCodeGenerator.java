package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectProperties;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses.ReferencedPartials;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationSource;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.Partial;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent;
import br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class NavigationModelCodeGenerator implements ModelCodeGenerator
{

	private List<ControllerPackage> controllerPackages;
	private List<ViewPackage> viewPackages;
	private FrontControllerTemplate frontControllerTemplate;
	private ProjectProperties projectConfiguration;

	public NavigationModelCodeGenerator(NavigationModel navigationModel,
			FrontControllerTemplate frontControllerTemplate, ProjectProperties projectConfiguration)
	{

		controllerPackages = navigationModel.getOwnedElements().stream().filter(ControllerPackage.class::isInstance)
				.map(ControllerPackage.class::cast).collect(Collectors.toList());

		viewPackages = navigationModel.getOwnedElements().stream().filter(ViewPackage.class::isInstance)
				.map(ViewPackage.class::cast).collect(Collectors.toList());

		this.frontControllerTemplate = frontControllerTemplate;
		this.projectConfiguration = projectConfiguration;
	}

	@Override
	public void generate()
	{
		String templatePath = frontControllerTemplate.getClassTemplate();

		if (templatePath == null)
			return;
		if (templatePath.isEmpty())
			return;

		String template = projectConfiguration.getTemplate(templatePath);

		String restTemplatePath = frontControllerTemplate.getRestClassTemplate();
		String restTemplate = projectConfiguration.getTemplate(restTemplatePath);

		IFolder src = projectConfiguration.getSourceFolder();

		Boolean isSPAFramework = frontControllerTemplate.isIsSPAFramework();

		// Ajustes necessário para a adição de Frameworks SPA. Caso não seja um
		// framework SPA, executa da mesma forma que era antes da implementação
		if (isSPAFramework == null || isSPAFramework == false)
		{
			controllerPackages.forEach(controllerPackage -> {
				String packagePath = IFolderUtils.packageNameToPath(controllerPackage.getName());

				IFolderUtils.makeDirectory(src, packagePath);

				IFolder package_ = src.getFolder(packagePath);

				controllerPackage.getOwnedTypes().stream().filter(FrontControllerClass.class::isInstance)
						.map(FrontControllerClass.class::cast).forEach(frontControllerClass -> {
							String code = ClassCodeGenerator.render(frontControllerClass, template);

							String fileName = frontControllerClass.getName() + projectConfiguration.getClassExtension();
							IFile file = package_.getFile(fileName);

							IFileUtils.createFile(file, code);
						});

				controllerPackage.getOwnedTypes().stream().filter(RestControllerClass.class::isInstance)
						.map(RestControllerClass.class::cast).forEach(restControllerClass -> {
							String code = ClassCodeGenerator.render(restControllerClass, restTemplate);

							String fileName = restControllerClass.getName() + projectConfiguration.getClassExtension();
							IFile file = package_.getFile(fileName);

							IFileUtils.createFile(file, code);
						});
			});
		}

//		TODO As paginas web ainda nao foram trabalhadas, acredito que essa parte de geracao
//		da view necessite de adaptacoes. Temporariamente permanecera assim...
		String viewTemplatePath = frontControllerTemplate.getPageTemplate();
		String authViewTemplatePath = frontControllerTemplate.getAuthPageTemplate();
		String partialViewTemplatePath = frontControllerTemplate.getPartialTemplate();

		String partialExtension = frontControllerTemplate.getPartialExtension();

		if (viewTemplatePath == null)
			return;
		if (viewTemplatePath.isEmpty())
			return;

		String viewTemplate = projectConfiguration.getTemplate(viewTemplatePath);
		String authViewTemplate = projectConfiguration.getTemplate(authViewTemplatePath);

		IFolder view = projectConfiguration.getViewFolder();

		viewPackages.forEach(viewPackage -> {
			String packagePath = IFolderUtils.packageNameToPath(viewPackage.getName());

			IFolderUtils.makeDirectory(view, packagePath);

			IFolder package_ = view.getFolder(packagePath);

			List<UIComponent> uiComponents = viewPackage.getOwnedTypes().stream().filter(UIComponent.class::isInstance)
					.map(UIComponent.class::cast).collect(Collectors.toList());

			viewPackage.getOwnedTypes().stream().filter(Page.class::isInstance).map(Page.class::cast).forEach(page -> {
//						FIXME nao foi possivel obter o formulario atraves da associacao de page e, para
//						solucionar isso (provisoriamente), uma uniao foi feita entre as associacoes de
//						formulario e pagina. O correto a se fazer e obter os dados do formulario atraves
//						da navegacao pela associacao page -> form.
				List<UIComponent> pageUIComponents = new ArrayList<UIComponent>();

				for (Association navigationAssociation : page.getAssociations())
				{
					for (UIComponent uiComponent : uiComponents)
					{
						List<Association> uiComponentAssociations = uiComponent.getAssociations();

						if (uiComponentAssociations.contains(navigationAssociation))
						{
							pageUIComponents.add(uiComponent);
						}
					}
				}

				String code = ClassCodeGenerator.render(page, pageUIComponents, viewTemplate);

				String fileName = page.getName() + projectConfiguration.getPageExtension();
				IFile file = package_.getFile(fileName);

				IFileUtils.createFile(file, code);
			});

			// TODO Fazendo a implementação do partial
			if (partialViewTemplatePath != null && !partialViewTemplatePath.isBlank() && partialExtension != null
					&& !partialExtension.isBlank())
			{
				String partialTemplate = projectConfiguration.getTemplate(partialViewTemplatePath);

				viewPackage.getOwnedTypes().stream().filter(Partial.class::isInstance).map(Partial.class::cast)
						.forEach(partial -> {
							List<String> invocatedMethodsNames = new LinkedList<>();
							List<UIComponent> partialUIComponents = new ArrayList<>();
							Map<String, Object> partialProperties = new HashMap<>();
							partialProperties.put("hasMethod", false);
							partialProperties.put("hasMethodForm", false);
							String nomePartial = partial.getName();

							for (Association navigationAssociation : partial.getAssociations())
							{
								for (UIComponent uiComponent : uiComponents)
								{
									List<Association> uiComponentAssociations = uiComponent.getAssociations();

									if (uiComponentAssociations.contains(navigationAssociation))
									{
										partialUIComponents.add(uiComponent);
									}
								}
							}

							List<ReferencedPartials> partialsReferenciadas = new LinkedList<>();

							EList<Association> associacoes = partial.getAssociations();
							for (Association associacao : associacoes)
							{
								if (associacao instanceof NavigationAggregationAssociation)
								{
									NavigationAggregationAssociation navigationAggregationAssociation = (NavigationAggregationAssociation) associacao;
									for (int i = 0; i < navigationAggregationAssociation.getMembers().size(); i++)
									{
										Property property = navigationAggregationAssociation.getMemberEnds().get(i);
										if (property instanceof NavigationAggregationSource
												&& property.getType().equals(partial))
										{
											Property partialEscolhidaReferenciada = navigationAggregationAssociation
													.getMemberEnds().get((1 - i));
											String nomeParcialReferenciada = partialEscolhidaReferenciada.getType()
													.getName();
											Partial p = (Partial) partialEscolhidaReferenciada.getType();
											Integer upperBoundPartial = partialEscolhidaReferenciada.getUpper();

											boolean temForms = false;
											for (int j = 0; j < p.getSourceDirectedRelationships().size(); j++)
											{
												if (p.getSourceDirectedRelationships().get(j) instanceof UIComponent)
												{
													temForms = true;
													nomeParcialReferenciada = ((Dependency) p
															.getSourceDirectedRelationships().get(j)
															.getSourceDirectedRelationships()).getSuppliers().get(0)
															.getName();
													break;
												}
											}

											if (!temForms)
											{
												for (DirectedRelationship dr : p.getSourceDirectedRelationships())
												{
													if (dr instanceof FrontControllerDependency)
													{
														for (NamedElement sup : ((Dependency) dr).getSuppliers())
														{
															nomeParcialReferenciada = sup.getName();
														}
													}
												}
											}
											partialsReferenciadas.add(
													new ReferencedPartials(nomeParcialReferenciada, upperBoundPartial));
											break;
										}
									}
								}
							}

							if (partialUIComponents.size() == 0)
							{
								EList<DirectedRelationship> relacoes = partial.getSourceDirectedRelationships();
								for (DirectedRelationship dr : relacoes)
								{
									if (dr instanceof FrontControllerDependency)
									{
										processaListaDeNomesDeMetodosInvocadosEmPartials(invocatedMethodsNames,
												partialProperties, dr, "hasMethod");
										for (NamedElement sup : ((Dependency) dr).getSuppliers())
										{
											nomePartial = sup.getName();
											partialProperties.put("FrontControllerClass", sup);
										}
									}
								}
							} else
							{
								for (DirectedRelationship t : partialUIComponents.get(0)
										.getSourceDirectedRelationships())
								{
									if (t instanceof FrontControllerDependency)
									{
										processaListaDeNomesDeMetodosInvocadosEmPartials(invocatedMethodsNames,
												partialProperties, t, "hasMethodForm");
										for (NamedElement sup : ((Dependency) t).getSuppliers())
										{
											nomePartial = sup.getName();
											partialProperties.put("FrontControllerClass", sup);
										}
									}
								}
							}
							if (partialProperties.get("FrontControllerClass") != null)
							{
								List<FrontControllerMethod> methodsController = ((FrontControllerClass) partialProperties
										.get("FrontControllerClass")).getOperations().stream()
										.filter(FrontControllerMethod.class::isInstance)
										.map(FrontControllerMethod.class::cast).collect(Collectors.toList());
								partialProperties.put("methodsController", methodsController);
							}

							// Partial Properties
							partialProperties.put("partialName", nomePartial);
							String[] splitNome = separaPorMaiuscula(nomePartial);
							String partialNameDash = "";
							String partialCamelCase = nomePartial.substring(0, 1).toUpperCase()
									+ nomePartial.substring(1);
							for (int i = 0; i < splitNome.length; i++)
							{
								if (i == splitNome.length - 1)
								{
									partialNameDash += splitNome[i];
								} else
								{
									partialNameDash += splitNome[i] + "-";
								}
							}
							partialProperties.put("partialNameDash", partialNameDash);
							partialProperties.put("partialCamelCase", partialCamelCase);

							// Parte referente ao SPAProperties

							// Fim da parte SPAProperties

							String code = ClassCodeGenerator.render(partial, partialUIComponents, partialProperties,
									partialsReferenciadas, partialTemplate);

							String filename = nomePartial + partialExtension;
							IFile file = package_.getFile(filename);

							IFileUtils.createFile(file, code);

						});
			}
			// TODO Fim do Partial

			viewPackage.getOwnedTypes().stream().filter(AuthPage.class::isInstance).map(AuthPage.class::cast)
					.forEach(page -> {
						// FIXME nao foi possivel obter o formulario atraves da associacao de page e,
						// para
						// solucionar isso (provisoriamente), uma uniao foi feita entre as associacoes
						// de
						// formulario e pagina. O correto a se fazer e obter os dados do formulario
						// atraves
						// da navegacao pela associacao page -> form.
						List<UIComponent> pageUIComponents = new ArrayList<UIComponent>();

						for (Association navigationAssociation : page.getAssociations())
						{
							for (UIComponent uiComponent : uiComponents)
							{
								List<Association> uiComponentAssociations = uiComponent.getAssociations();

								if (uiComponentAssociations.contains(navigationAssociation))
								{
									pageUIComponents.add(uiComponent);
								}
							}
						}

						String code = ClassCodeGenerator.render(page, pageUIComponents, authViewTemplate);

						String fileName = page.getName() + projectConfiguration.getPageExtension();
						IFile file = package_.getFile(fileName);

						IFileUtils.createFile(file, code);
					});
		});
	}

	private void processaListaDeNomesDeMetodosInvocadosEmPartials(List<String> invocatedMethodsNames,
			Map<String, Object> partialProperties, DirectedRelationship dr, String nomePropriedade)
	{
		FrontControllerMethod method = ((FrontControllerDependency) dr).getMethod();
		if (method != null && method.getName() != null && !method.getName().isBlank())
		{
			partialProperties.put(nomePropriedade, true);
			invocatedMethodsNames.add(method.getName());
			partialProperties.put("invocatedMethodsNames", invocatedMethodsNames);
		}
	}

	public static String[] separaPorMaiuscula(String nome)
	{
		nome = nome.replaceAll("\\s", "");
		List<String> lista = new ArrayList<>();
		String corrente = "";
		for (int i = 0; i < nome.length(); i++)
		{
			if (Character.isUpperCase(nome.charAt(i)) && corrente.isBlank())
			{
				corrente += Character.toLowerCase(nome.charAt(i));
				continue;
			} else if (Character.isUpperCase(nome.charAt(i)))
			{
				lista.add(corrente);
				corrente = "";
				corrente += Character.toLowerCase(nome.charAt(i));
			} else
			{
				corrente += nome.charAt(i);
			}
		}
		lista.add(corrente);
		return lista.toArray(new String[lista.size()]);
	}
}
