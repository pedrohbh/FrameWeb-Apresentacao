package plugin;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class Integrador implements IExternalJavaAction {

	public Integrador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Componente componente = new Componente();

		for(EObject obj : selections) {
			TreeIterator<EObject> eAllContents = obj.eAllContents();

		    String[] nivel1 = new String[] { "packagedElement", "resultDependencyConstraint" };
	        String[] nivel2 = new String[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" };
	        String[] nivel3 = new String[] { "type" };

		    while(eAllContents.hasNext()) { // percorre os objetos do modelo
				EObject ele = eAllContents.next();

			    if(ele instanceof DRepresentationElement) { //Navigation, Entity, Persistence ou Application
			    	EObject model = ((DRepresentationElement)ele).getTarget();
			        EStructuralFeature packagedElement = model.eClass().getEStructuralFeature("packagedElement");

			        EcoreEList sub0 = (EcoreEList) model.eGet(packagedElement); // lista de pacotes do modelo
			        Componente comp0 = new Componente(model); // sub0
			        
			        for(String niv : nivel1) {
				        for(int i=0; i<sub0.size(); i++) {
					    	EObject objSub1 = (EObject) sub0.get(i);

					        EStructuralFeature eleSub1 = objSub1.eClass().getEStructuralFeature(niv);
					        try {

						        EcoreEList sub1 = (EcoreEList) objSub1.eGet(eleSub1); // lista de classes e associações
						        Componente comp1 = new Componente(objSub1); // sub1
						        comp0.addComponente(comp1);
						        for(String niv2 : nivel2) {
							        for(int j=0; j<sub1.size(); j++) {
							            EObject objSub2 = (EObject) sub1.get(j);
							            EStructuralFeature eleSub2 = objSub2.eClass().getEStructuralFeature(niv2);
							            try {

							            	EcoreEList sub2 = (EcoreEList) objSub2.eGet(eleSub2);
									        Componente comp2 = new Componente(objSub2); // sub2
									        comp1.addComponente(comp2);
							            	for(String niv3 : nivel3) {
								            	for(int k=0; k<sub2.size(); k++) {
								            		EObject objSub3 = (EObject) sub2.get(k);
										            EStructuralFeature eleSub3 = objSub3.eClass().getEStructuralFeature(niv3);
										            try {

										            	EcoreEList sub3 = (EcoreEList) objSub3.eGet(eleSub3);
												        Componente comp3 = new Componente(objSub3); // sub3
												        comp2.addComponente(comp3);
										            } catch (Exception e) {
//											        	System.out.println("nivel3: "+niv3);
											        }
								            	}
								            }
							            }catch(Exception e) {
//							            	System.out.println("nivel2: "+niv2);
							            }
							        }
						        }
					        }catch(Exception e) {
//					        	System.out.println("nivel1: "+niv);
					        }
				        }
			        }
			        componente.addComponente(comp0);
			    }
		    }
		}
//		System.out.println(componente.getComponentes());
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return (selections.size() == 1 && selections.iterator().next() instanceof DSemanticDiagramSpec);
	}
}