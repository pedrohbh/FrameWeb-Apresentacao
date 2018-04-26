package plugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl;

import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationCompositionWhole;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.impl.TagLibImpl;

public class Integrador implements IExternalJavaAction {
	static Componente componente = new Componente();
	static String lang;
	static String ext_class;
	static String ext_page;
	static String form_template;
	static String page_template;
	static String iOParameter_template;
	static String frontControllerClass_template;
	static String frontControllerMethod_template;

	public Integrador() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		componente = new Componente();
		for(EObject obj : selections) {
			TreeIterator<EObject> eAllContents = obj.eAllContents();

		    String[] nivel1 = new String[] { "packagedElement", "resultDependencyConstraint" };// { "resultDependencyConstraint", "packagedElement" }
	        String[] nivel2 = new String[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" }; // { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" }
	        String[] nivel3 = new String[] { "type", "methodType" };

		    while(eAllContents.hasNext()) {
				EObject ele = eAllContents.next();

				if(ele instanceof DNodeContainerSpec) {
					EObject model = ((DRepresentationElement)ele).getTarget();
					if(model instanceof FrameworkProfile) {
			        	ext_class = ((FrontControllerTemplate) model).getClassExtension();
			        	try {
			        		ext_class = URLDecoder.decode(((FrontControllerTemplate) model).getClassExtension(), "UTF-8");
			        		ext_page = URLDecoder.decode(((FrontControllerTemplate) model).getPageExtension(), "UTF-8");
			        		
							form_template = URLDecoder.decode(((FrontControllerTemplate) model).getFormTemplate(), "UTF-8");
							page_template = URLDecoder.decode(((FrontControllerTemplate) model).getPageTemplate(), "UTF-8");
							iOParameter_template = URLDecoder.decode(((FrontControllerTemplate) model).getAttributeTemplate(), "UTF-8");
							frontControllerClass_template = URLDecoder.decode(((FrontControllerTemplate) model).getClassTemplate(), "UTF-8");
							frontControllerMethod_template = URLDecoder.decode(((FrontControllerTemplate) model).getMethodTemplate(), "UTF-8");
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
			        }else{
				    	EStructuralFeature packagedElement = model.eClass().getEStructuralFeature("packagedElement");
				    	EcoreEList sub0 = (EcoreEList) model.eGet(packagedElement);
				        Componente comp0 = new Componente(model, packagedElement);
				        for(String niv : nivel1) {
					        for(int i=0; i<sub0.size(); i++) {
						    	EObject objSub1 = (EObject) sub0.get(i);

						    	if(objSub1 instanceof PrimitiveTypeImpl || objSub1 instanceof TagLibImpl) break; // **** tirar depois que mudar o metamodelo da linguagem ****

						    	EStructuralFeature eleSub1 = objSub1.eClass().getEStructuralFeature(niv);
						    	objSub1.eClass().getEStructuralFeatures();
						    	
						        Componente comp1 = new Componente(objSub1, eleSub1);
						        comp1 = comp0.addComponente(comp1);
						        try { // EcoreEList (sub1 e sub2) as vezes tem valor null, try/catch para desconsiderar
							        EcoreEList sub1 = (EcoreEList) objSub1.eGet(eleSub1);

							        for(String niv2 : nivel2) {
								        for(int j=0; j<sub1.size(); j++) {
								            EObject objSub2 = (EObject) sub1.get(j);
								            EStructuralFeature eleSub2 = objSub2.eClass().getEStructuralFeature(niv2);
								            
									        Componente comp2 = new Componente(objSub2, eleSub2);
									        comp2 = comp1.addComponente(comp2);
								            	EcoreEList sub2 = (EcoreEList) objSub2.eGet(eleSub2);

								            	for(String niv3 : nivel3) {
									            	for(int k=0; k<sub2.size(); k++) {
									            		EObject objSub3 = (EObject) sub2.get(k);
											            EStructuralFeature eleSub3 = objSub3.eClass().getEStructuralFeature(niv3);
											            
											            Componente comp3 = new Componente(objSub3, eleSub3);
												        comp3 = comp2.addComponente(comp3);
									            	}
									            }
								        }
							        }
						        }catch(Exception e) {}
					        }
				        }
				        comp0 = componente.addComponente(comp0);
			        }
			    }
		    }
		}
		gerarArquivos();
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return (selections.size() == 1 && selections.iterator().next() instanceof DSemanticDiagramSpec);
	}
	
	private static void gerarArquivos() {
		String dir_output_web = "WebContent" + File.separator;
		String dir_output_class = "src" + File.separator + "com" + File.separator + "frameweb" + File.separator + "java" + File.separator;
		
		JFileChooser f = new JFileChooser();
		f.setDialogTitle("Selecione um diretório para o projeto");
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
        
        String dir_output = f.getSelectedFile().getPath() + File.separator + "build" + File.separator;

        File diretorio_class = new File(dir_output + dir_output_class);
        diretorio_class.mkdirs();
        File diretorio_web = new File(dir_output + dir_output_web);
        diretorio_web.mkdirs();
		
		Componente navigation = componente.getComponentes().stream().filter(x -> x.getXsiType() instanceof NavigationModel).findFirst().orElse(null);
		
		if(navigation != null) {
			// CONTROLLER
			List<Componente> controllers1 = navigation.getComponentes().stream().filter(x -> x.getXsiType() instanceof ControllerPackage).collect(Collectors.toList());
			List<Componente> controllers2 = new ArrayList<Componente>();
			for(Componente c : controllers1) {
				controllers2.addAll(c.getComponentes());
			}
			
			Map<String, String> tags_controller = new HashMap<String, String>();
			for(Componente controller : controllers2) {
				tags_controller.put("FW_CLASS_NAME", controller.getName().charAt(0) + controller.getName().substring(1));
				
				Componente frontControllerDependency = navigation.getComponentes().stream().filter(x -> x.getXsiType() instanceof FrontControllerDependency && x.getSupplier().getName().equals(controller.getName())).findFirst().orElse(null);
				tags_controller.put("FW_BEAN_NAME", frontControllerDependency != null ? frontControllerDependency.getClient().getName() : "");
				
				List<Componente> controller_parameters = controller.getComponentes().stream().filter(x -> x.getXsiType() instanceof IOParameter).collect(Collectors.toList());
				StringBuilder parameters = new StringBuilder();
				for(Componente parameter : controller_parameters) {
					String text_parameter = iOParameter_template;
					text_parameter = text_parameter.replaceAll("FW_PARAMETER_TYPE", parameter.getParameterType().getName());
					String parameter_name = parameter.getName();
					parameter_name = parameter_name.replace(" ", "");
					text_parameter = text_parameter.replaceAll("FW_PARAMETER_FIRST_UPPER", Character.toUpperCase(parameter_name.charAt(0)) + parameter_name.substring(1));
					text_parameter = text_parameter.replaceAll("FW_PARAMETER", parameter_name);
					
					parameters.append(text_parameter);
				}
				
				tags_controller.put("FW_FRONT_CONTROLLER_PARAMETERS", parameters.toString());
				
				List<Componente> controller_methods = controller.getComponentes().stream().filter(x -> x.getXsiType() instanceof FrontControllerMethod).collect(Collectors.toList());
				StringBuilder methods = new StringBuilder();
				for(Componente method : controller_methods) {
					String text_method = frontControllerMethod_template;
					text_method = text_method.replaceAll("FW_METHOD_RETURN_TYPE", method.getMethodType() != null ? method.getMethodType().getName() : "void");
					text_method = text_method.replaceAll("FW_METHOD_NAME", method.getName());
					
					methods.append(text_method);
				}
				
				tags_controller.put("FW_FRONT_CONTROLLER_METHOD", methods.toString());
				
				String text = frontControllerClass_template;
				
				for (Map.Entry<String,String> item : tags_controller.entrySet()) {
					text = text.replaceAll(item.getKey(), item.getValue());
				}
				try {
					FileWriter fw = new FileWriter(dir_output + dir_output_class + controller.getName() + ext_class);
		            BufferedWriter bw = new BufferedWriter(fw);
		            bw.write(text);
		            bw.newLine();
		            bw.close();
		            fw.close();
				} catch (IOException e) {
					System.out.println("Erro na criação dos arquivos.");
					return;
				}
			}
			
			//VIEW
			List<Componente> views1 = navigation.getComponentes().stream().filter(x -> x.getXsiType() instanceof ViewPackage).collect(Collectors.toList());
			List<Componente> views2 = new ArrayList<Componente>();
			for(Componente c : views1) {
				views2.addAll(c.getComponentes());
			}
			
			List<Componente> views_pages = views2.stream().filter(x -> x.getXsiType() instanceof Page).collect(Collectors.toList());
			for(Componente page : views_pages) {
				StringBuilder body = new StringBuilder();
				
				List<Componente> componentes_dentro_pagina = page.getComponentes().stream().filter(x -> x.getXsiType() instanceof NavigationCompositionWhole).collect(Collectors.toList());
				for(Componente componente_pagina : componentes_dentro_pagina) {
					Componente comp = views2.stream().filter(x -> x.getName().equals(componente_pagina.getType().getName())).findFirst().orElse(null);
					if(comp != null) {
						String body_form = form_template;
						
						StringBuilder body_form_comp = new StringBuilder();
						for(Componente item : comp.getComponentes()) {
							try {
								String field_template = URLDecoder.decode(item.getTag().getCodeGenerationTemplate(), "UTF-8");
								field_template = field_template.replaceFirst("FW_ID", item.getName().replace('.', '_'));
								field_template = field_template.replaceFirst("FW_VALUE", comp.getName() + '.' + item.getName());
								body_form_comp.append("\n");
								body_form_comp.append(field_template);
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
							}
						}
						body_form = body_form.replaceFirst("FW_BODY", body_form_comp.toString());
						body_form = body_form.replaceFirst("FW_ID", comp.getName());
						body.append(body_form);
					}
				}
				String text = page_template.replaceFirst("FW_BODY", body.toString());
				
				try {
					FileWriter fw = new FileWriter(dir_output + dir_output_web + page.getName());
		            BufferedWriter bw = new BufferedWriter(fw);
		            bw.write(text);
		            bw.close();
		            fw.close();
				} catch (IOException e) {
					System.out.println("Erro na criação dos arquivos.");
					return;
				}
			}
		}
		
		Componente entity = componente.getComponentes().stream().filter(x -> x.getXsiType() instanceof EntityModel).findFirst().orElse(null);
		if(entity != null) {
			
		}
		
		Componente persistence = componente.getComponentes().stream().filter(x -> x.getXsiType() instanceof PersistenceModel).findFirst().orElse(null);
		if(entity != null) {
			
		}
		
		Componente application = componente.getComponentes().stream().filter(x -> x.getXsiType() instanceof ApplicationModel).findFirst().orElse(null);
		if(entity != null) {
			
		}
	}
}


