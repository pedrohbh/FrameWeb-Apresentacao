package plugin;

import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

public class Integrador implements IExternalJavaAction {
	static Componente componente = new Componente();
	
	public Integrador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for(EObject obj : selections) {
			TreeIterator<EObject> eAllContents = obj.eAllContents();

		    String[] nivel1 = new String[] { "packagedElement", "resultDependencyConstraint" };
	        String[] nivel2 = new String[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" };
	        String[] nivel3 = new String[] { "type" };

//	        System.out.println(eAllContents);
		    while(eAllContents.hasNext()) { // percorre os objetos do modelo
				EObject ele = eAllContents.next();
//				System.out.println(ele);

			    if(ele instanceof DRepresentationElement) { //Navigation, Entity, Persistence ou Application
			    	
			    	EObject model = ((DRepresentationElement)ele).getTarget();
			    	EStructuralFeature packagedElement = model.eClass().getEStructuralFeature("packagedElement");
			        
			        EcoreEList sub0 = (EcoreEList) model.eGet(packagedElement); // lista de pacotes do modelo
			        Componente comp0 = new Componente(model); // sub0

			        for(String niv : nivel1) {
//			        	System.out.println();
				        for(int i=0; i<sub0.size(); i++) {
					    	EObject objSub1 = (EObject) sub0.get(i);
//					    	System.out.println(objSub1);
					        EStructuralFeature eleSub1 = objSub1.eClass().getEStructuralFeature(niv);
					        try {
						        EcoreEList sub1 = (EcoreEList) objSub1.eGet(eleSub1); // lista de classes e associações
				            	
//				            	if(objSub1 instanceof NamedElementImpl)
//				        			System.out.println("nivel 1 " + objSub1);
						        
						        Componente comp1 = new Componente(objSub1); // sub1
						        comp0.addComponente(comp1);
						        for(String niv2 : nivel2) {
							        for(int j=0; j<sub1.size(); j++) {
							            EObject objSub2 = (EObject) sub1.get(j);
//							            System.out.println("\t"+objSub2);
							            EStructuralFeature eleSub2 = objSub2.eClass().getEStructuralFeature(niv2);
							            try {
							            	EcoreEList sub2 = (EcoreEList) objSub2.eGet(eleSub2);
							            	
//							            	if(objSub2 instanceof NamedElementImpl)
//							        			System.out.println("nivel 2 " + objSub2);
//							            	System.out.println(sub2 + "\n");
									        
									        Componente comp2 = new Componente(objSub2); // sub2
									        comp1.addComponente(comp2);
							            	for(String niv3 : nivel3) {
								            	for(int k=0; k<sub2.size(); k++) {
								            		EObject objSub3 = (EObject) sub2.get(k);
//								            		System.out.println("\t\t"+objSub3);
										            EStructuralFeature eleSub3 = objSub3.eClass().getEStructuralFeature(niv3);
										            try {
										            	EcoreEList sub3 = (EcoreEList) objSub3.eGet(eleSub3);
										            	
//										            	if(objSub3 instanceof NamedElementImpl)
//										        			System.out.println("nivel 3 " + objSub3);
												        
										        		Componente comp3 = new Componente(objSub3); // sub3
												        comp2.addComponente(comp3);
										            } catch (Exception e) {
//											        	System.out.println("\t\t"+niv3);
											        }
								            	}
								            }
							            }catch(Exception e) {
//							            	System.out.println("\t"+niv2);
							            }
							        }
						        }
					        }catch(Exception e) {
//					        	System.out.println(""+niv);
					        }
				        }
			        }
			        componente.addComponente(comp0);
			    }
		    }
		}
//		System.out.println(componente.getComponentes());
//		gerarArquivos();
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return (selections.size() == 1 && selections.iterator().next() instanceof DSemanticDiagramSpec);
	}
	
	private static void gerarArquivos() {
		Map<String, String> tags_controller = new HashMap<String, String>();
		
		for(Componente comp : componente.componentes) {
//			System.out.println(comp.getXsiType());
			for(Componente controller : comp.componentes) {

//				System.out.println("  " + comp.getXsiType());
				if(controller.getXsiType().equals("ControllerPackage")) {
					tags_controller.put("FW_CLASS_NAME", controller.getName());
					
					
				}
			}
		}
	}
}