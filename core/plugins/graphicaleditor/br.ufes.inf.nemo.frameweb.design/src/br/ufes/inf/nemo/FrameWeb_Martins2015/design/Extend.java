package br.ufes.inf.nemo.FrameWeb_Martins2015.design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.Partial;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;

@SuppressWarnings("all")
public class Extend
{

	public Extend()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public void getSemanticElements(EObject obj)
	{
//		TreeIterator<EObject> eAllContents = obj.eAllContents();
//
//	    String[] nivel1 = new String[] { "packagedElement", "resultDependencyConstraint" };
//        String[] nivel2 = new String[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" };
//        String[] nivel3 = new String[] { "type" };
//
//	    while(eAllContents.hasNext()) { // percorre os objetos do modelo
//			EObject ele = eAllContents.next();
//
//		    if(ele instanceof DRepresentationElement) { //Navigation, Entity, Persistence ou Application
//		    	EObject model = ((DRepresentationElement)ele).getTarget();
//		        EStructuralFeature packagedElement = model.eClass().getEStructuralFeature("packagedElement");
//
//		        EcoreEList sub0 = (EcoreEList) model.eGet(packagedElement); // lista de pacotes do modelo
////		        Componente comp0 = new Componente(model); // sub0
//		        
////		        System.out.println((NamedElementImpl)model.getName());
//
//		        for(String niv : nivel1) {
//			        for(int i=0; i<sub0.size(); i++) {
//				    	EObject objSub1 = (EObject) sub0.get(i);
//
//				        EStructuralFeature eleSub1 = objSub1.eClass().getEStructuralFeature(niv);
//				        try {
//
//					        EcoreEList sub1 = (EcoreEList) objSub1.eGet(eleSub1); // lista de classes e associações
////					        Componente comp1 = new Componente(objSub1); // sub1
////					        comp0.addComponente(comp1);
//					        for(String niv2 : nivel2) {
//						        for(int j=0; j<sub1.size(); j++) {
//						            EObject objSub2 = (EObject) sub1.get(j);
//						            EStructuralFeature eleSub2 = objSub2.eClass().getEStructuralFeature(niv2);
//						            try {
//
//						            	EcoreEList sub2 = (EcoreEList) objSub2.eGet(eleSub2);
////								        Componente comp2 = new Componente(objSub2); // sub2
////								        comp1.addComponente(comp2);
//						            	for(String niv3 : nivel3) {
//							            	for(int k=0; k<sub2.size(); k++) {
//							            		EObject objSub3 = (EObject) sub2.get(k);
//									            EStructuralFeature eleSub3 = objSub3.eClass().getEStructuralFeature(niv3);
//									            try {
//
//									            	EcoreEList sub3 = (EcoreEList) objSub3.eGet(eleSub3);
////											        Componente comp3 = new Componente(objSub3); // sub3
////											        comp2.addComponente(comp3);
//									            } catch (Exception e) {
////										        	System.out.println("nivel3: "+niv3);
//										        }
//							            	}
//							            }
//						            }catch(Exception e) {
////						            	System.out.println("nivel2: "+niv2);
//						            }
//						        }
//					        }
//				        }catch(Exception e) {
////				        	System.out.println("nivel1: "+niv);
//				        }
//			        }
//		        }
////		        componente.addComponente(comp0);
//		    }
//		    if(ele instanceof DNodeContainerSpec) {
////		    	System.out.println(ele + "\t" + ele.eClass() + "\t" + ele.getClass());
//		    }
//	    }
	}

	public String printParameters(EObject m)
	{

		String result = null;

		EStructuralFeature ownedElement = m.eClass().getEStructuralFeature("ownedElement");
		EStructuralFeature name = m.eClass().getEStructuralFeature("name");
		EStructuralFeature methodType = null;
		EStructuralFeature ownedParameter = null;
		String methodType_value = null;
		Object parametros;

		String name_value = m.eGet(name).toString();

		result = name_value + " (";

		if (m.eClass().getEStructuralFeature("ownedParameter") != null)
		{
			ownedParameter = m.eClass().getEStructuralFeature("ownedParameter");
			EcoreEList parameter_list = (EcoreEList) m.eGet(ownedParameter);

			int i;
			for (i = 0; i < parameter_list.size(); i++)
			{
				EObject p = (EObject) parameter_list.get(i);
				// On Parameter
				String Type = "void";
				EStructuralFeature parameter_name_feature = p.eClass().getEAllAttributes().get(0);
				String parameter_name_value = p.eGet(parameter_name_feature).toString();
				if (p.eClass().getEStructuralFeature("type") != null)
				{
					EStructuralFeature parameter_type_feature = p.eClass().getEStructuralFeature("type");
					if (p.eGet(parameter_type_feature) != null)
					{
						EObject parameter_type_object = (EObject) p.eGet(parameter_type_feature);
						EStructuralFeature parameter_type_name_feature = parameter_type_object.eClass()
								.getEAllAttributes().get(0);
						Type = parameter_type_object.eGet(parameter_type_name_feature).toString();
					}
				}
				result = result + parameter_name_value + " : " + Type;
				if (i != parameter_list.size() - 1)
					result = result + ", ";
			}
		}

		result = result + ")";

		methodType = m.eClass().getEStructuralFeature("methodType");
		EObject p = (EObject) m.eGet(methodType);

		if (p != null)
		{
			result = result + " : ";
			methodType_value = (String) p.eGet(p.eClass().getEStructuralFeature("name"));
			result = result + methodType_value;
		} else
		{
			result = result + " : " + "void";
		}

		return result;
	}

	public String printCardinalidade(EObject o)
	{

		EStructuralFeature upper = o.eClass().getEStructuralFeature("upper");
		Integer upper_value = (Integer) o.eGet(upper);

		EStructuralFeature lower = o.eClass().getEStructuralFeature("lower");
		Integer lower_value = (Integer) o.eGet(lower);

		if (upper_value == lower_value)
		{
			return lower_value.toString();
		}

		if (upper_value == -1)
		{
			return lower_value + "..*";
		}
		return lower_value + ".." + upper_value;
	}

	public EObject[] getMembers(EObject o)
	{

		EStructuralFeature memberendfeature = o.eClass().getEStructuralFeature("memberEnd");
		EStructuralFeature ownedrulefeature = o.eClass().getEStructuralFeature("ownedRule");

		List<EObject> members = (List<EObject>) o.eGet(memberendfeature);
		List<EObject> rules = (List<EObject>) o.eGet(ownedrulefeature);

		EObject[] result = { o, members.get(0), members.get(1), rules.get(0), rules.get(1), rules.get(2) };

		return result;
	}

	public String printVocabularyConstraint(EObject o)
	{

		String result = "";

		try
		{
			EStructuralFeature subPropertyOf = o.eClass().getEStructuralFeature("subPropertyOf");
			String subPropertyOf_value = o.eGet(subPropertyOf).toString();

			if (!subPropertyOf_value.isEmpty())
			{
				result = "{rdf:subPropertyOf=" + subPropertyOf_value + "}";
			}
		} catch (Exception e)
		{
			result = "";
		}

		return result;
	}

	public String printConstraint(EObject o)
	{

		ArrayList<String> result = new ArrayList<>();

		// COLLECTION
		EStructuralFeature collection = o.eClass().getEStructuralFeature("collection");
		String collection_value = o.eGet(collection).toString();

		if (!collection_value.equals("set"))
		{
			result.add("collection=" + collection_value);
		}
		// CASCADE
		EStructuralFeature cascade = o.eClass().getEStructuralFeature("cascade");
		String cascade_value = o.eGet(cascade).toString();

		if (!cascade_value.equals("remove"))
		{
			result.add("cascade=" + cascade_value);
		}
		// ORDER
		EStructuralFeature order = o.eClass().getEStructuralFeature("order");
		String order_value = o.eGet(order).toString();

		if (!order_value.equals("natural"))
		{
			result.add("order=" + order_value);
		}
		// FETCH
		EStructuralFeature fetch = o.eClass().getEStructuralFeature("fetch");
		String fetch_value = o.eGet(fetch).toString();

		if (!fetch_value.equals("lazy"))
		{
			result.add("fetch=" + fetch_value);
		}

		if (!result.isEmpty())
		{
			String retorno = " {";

			for (int i = 0; i < result.size(); i++)
			{
				retorno = retorno + result.get(i);

				if (i == (result.size() - 1))
				{
					retorno = retorno + "}";
				} else
				{
					retorno = retorno + ",\n";
				}
			}

			return retorno;
		} else
		{
			return "";
		}
	}

	public String printVisibility(EObject o)
	{
		EStructuralFeature visibility_feature = o.eClass().getEAllAttributes().get(2);
		String visibility_value = o.eGet(visibility_feature).toString();
		if (visibility_value == "public")
		{
			return " + ";
		}
		if (visibility_value == "package")
		{
			return " ~ ";
		}
		if (visibility_value == "private")
		{
			return " - ";
		}
		if (visibility_value == "protected")
		{
			return " # ";
		}
		return " ? ";
	}

	public String printIdStereotype(EObject o)
	{
		return "<<id>> ";
	}

	public String printPrefix(EObject o)
	{

		EStructuralFeature prefix_feature = o.eClass().getEAllAttributes().get(7);
		String prefix = (o.eGet(prefix_feature).toString());

		return prefix + "::";

	}

	public String printProperties(EObject o)
	{

		ArrayList<String> retorno = new ArrayList();
		String idSter = "";
		EStructuralFeature size_feature = o.eClass().getEAllAttributes().get(16);
		EStructuralFeature null_feature = o.eClass().getEAllAttributes().get(17);
//		EStructuralFeature id_feature = o.eClass().getEAllAttributes().get(15);

		String null_feature_str = o.eGet(null_feature).toString();

		if (null_feature_str.equals("true"))
		{
			retorno.add("null");
		} else
		{
			retorno.add("not null");
		}

//		String id_feature_str = o.eGet(id_feature).toString();
//		
//		if(id_feature_str.equals("true")) {
//			idSter = " <<id>> ";
//		}

		String size = (o.eGet(size_feature).toString());
		if (!size.equals("0"))
		{
			retorno.add("size=" + size);
		}

		try
		{
			EStructuralFeature owl_feature = o.eClass().getEAllAttributes().get(19);

			String owl = (o.eGet(owl_feature).toString());
			if (!owl.isEmpty())
			{
				retorno.add("owl:equivalentProperty=" + owl);
			}

			String s = "";
			s += idSter;

			if (retorno.size() > 0)
			{
				s += " {";
				for (int i = 0; i < retorno.size(); i++)
				{
					s += retorno.get(i);
					if ((i + 1) < retorno.size())
						s += ", ";
				}
				s += "}";
			}
			return s;
		} catch (Exception e)
		{
			String s = "";

			s += idSter;

			if (retorno.size() > 0)
			{
				s += " {";
				for (int i = 0; i < retorno.size(); i++)
				{
					s += retorno.get(i);
					if ((i + 1) < retorno.size())
						s += ", ";
				}
				s += "}";
			}
			return s;
		}
	}

	public String printDateProperties(EObject o)
	{
		// return o.eClass().getEAllAttributes().toString();
		ArrayList<String> retorno = new ArrayList();

		EStructuralFeature size_feature = o.eClass().getEAllAttributes().get(16);

		EStructuralFeature null_feature = o.eClass().getEAllAttributes().get(17);
		String null_feature_str = o.eGet(null_feature).toString();
		if (null_feature_str.equals("true"))
		{
			retorno.add("null");
		} else
		{
			retorno.add("not null");
		}

		String size = (o.eGet(size_feature).toString());
		if (!size.equals("0"))
		{
			retorno.add("size=" + size);
		}

		EStructuralFeature precision_feature = o.eClass().getEAllAttributes().get(20);

		String precision = (o.eGet(precision_feature).toString());
		retorno.add("precision=" + precision);

		try
		{
			EStructuralFeature owl_feature = o.eClass().getEAllAttributes().get(19);

			String owl = (o.eGet(owl_feature).toString());
			if (!owl.isEmpty())
			{
				retorno.add("owl:equivalentProperty=" + owl);
			}

			String s = "";

			if (retorno.size() > 0)
			{
				s += " {";
				for (int i = 0; i < retorno.size(); i++)
				{
					s += retorno.get(i);
					if ((i + 1) < retorno.size())
						s += ", ";
				}
				s += "}";
			}
			return s;
		} catch (Exception e)
		{
			String s = "";

			if (retorno.size() > 0)
			{
				s += " {";
				for (int i = 0; i < retorno.size(); i++)
				{
					s += retorno.get(i);
					if ((i + 1) < retorno.size())
						s += ", ";
				}
				s += "}";
			}
			return s;
		}
	}

	// aql:self.printVisibility() + self.name + ' : ' + self.type.name +
	// '(size=' + self.size + ')'

	public boolean print_isAbstract(EObject o)
	{
		EStructuralFeature abstract_feature = o.eClass().getEAllAttributes().get(6); // OLHAR
																						// NO
																						// MODISCO
																						// O
																						// NUMERO
																						// -
																						// 1

		return (boolean) o.eGet(abstract_feature);
	}

	public boolean isTypeOf(EObject o, String name)
	{
		String className = o.eClass().getName();

		return className.equals(name);
	}

	public String print_resultdependency(EObject o)
	{
		String response = "";

		EStructuralFeature result_feature = o.eClass().getEAllAttributes().get(5); // OLHAR
																					// NO
																					// MODISCO
																					// O
																					// NUMERO
																					// -
																					// 1
		String result = (String) o.eGet(result_feature);

		EStructuralFeature ajax_feature = o.eClass().getEAllAttributes().get(4); // OLHAR
																					// NO
																					// MODISCO
																					// O
																					// NUMERO
																					// -
																					// 1
		boolean ajax = (boolean) o.eGet(ajax_feature);

		EStructuralFeature render_feature = o.eClass().getEAllAttributes().get(6); // OLHAR
																					// NO
																					// MODISCO
																					// O
																					// NUMERO
																					// -
																					// 1
		String render = (String) o.eGet(render_feature);

		EStructuralFeature execute_feature = o.eClass().getEAllAttributes().get(3); // OLHAR
																					// NO
																					// MODISCO
																					// O
																					// NUMERO
																					// -
																					// 1
		String execute = (String) o.eGet(execute_feature);

		if (!result.isEmpty())
			response = response + ", result=" + result;
		if (ajax)
			response = response + ", ajax=" + ajax;
		if (!render.equals("@none"))
			response = response + ", render=" + render;
		if (!execute.equals("@this"))
			response = response + ", execute=" + execute;

		if (!response.isEmpty())
		{
			return response + "}";
		} else
		{
			return "}";
		}
	}

	public String processLabelResultDependency(ResultDependency resultDependency)
	{
		EList<Element> origens = resultDependency.getSources();
		if (origens.size() >= 1 && origens.get(0) instanceof Partial)
		{
			if (resultDependency.getResultMethod() == null)
			{
				return "";
			}
		}

		return "{method=" + resultDependency.getResultMethod().getName()
				+ print_resultdependency(resultDependency.getResultDependencyConstraint());

		// SCRIPT ORIGINAL PARA O LABEL DO RESULT DEPENDENCY
		// "aql:'{method=' + self.resultMethod.name +
		// self.resultDependencyConstraint.print_resultdependency()";
	}

	public String processLabelFrontControllerDependency(FrontControllerDependency frontControllerDependency)
	{
		EList<Element> origens = frontControllerDependency.getSources();
		if (origens.size() >= 1 && origens.get(0) instanceof Partial)
		{
			if (frontControllerDependency.getMethod() == null)
			{
				return "";
			}
		}
		return "{method=" + frontControllerDependency.getMethod().getName() + "}";
		// SCRIPT ORIGINAL PARA O LABEL DO FRONT CONTROLLER DEPENDECY
		// aql:'{method='+self.method.name+'}'
	}

	public String processLabelNavigationAssociation(NavigationAssociation navigationAssociation)
	{
		Property property = navigationAssociation.getMemberEnds().get(1);
		Integer numero = property.getUpper();

		if (numero > 1)
		{
			return numero.toString();
		} else
			return "";
		// SCRIPT ORIGINAL PARA O LABEL DO NAVIGATION ASSOCIATION
		// aql:self.memberEnd->at(2).upper
	}

	/*
	 * public List<NavigationAggregationAssociationSPAAttribute>
	 * retornaAtrributoExemplo( NavigationAggregationAssociation
	 * navigationAggregationAssociation, UIComponentField elemento) {
	 * List<NavigationAggregationAssociationSPAAttribute> lista =
	 * navigationAggregationAssociation.getSpaAttribute(); if (elemento == null) {
	 * return lista;
	 * 
	 * } for (NavigationAggregationAssociationSPAAttribute spa : lista) { if
	 * (spa.getSpaAttribute().equals(elemento)) return lista; }
	 * 
	 * // Criação Instância FramewebFactory factory = FramewebFactory.eINSTANCE;
	 * 
	 * NavigationAggregationAssociationSPAAttribute spaAttribute = factory
	 * .createNavigationAggregationAssociationSPAAttribute();
	 * spaAttribute.setSpaAttribute(elemento); lista.add(spaAttribute);
	 * 
	 * return lista; }
	 */

	public List<UIComponentField> returnListOfSPAPropsAttributesCandidates(
			NavigationAggregationAssociation navigationAggregationAssociation)
	{
		List<UIComponentField> listaNova = new LinkedList<>();

		// Parte atributos partial
		Partial partial = (Partial) navigationAggregationAssociation.getMemberEnds().get(1).getType();
		for (Property property : partial.getOwnedAttributes())
		{
			if (property.getName() != null && !property.getName().isBlank() && property instanceof UIComponentField)
			{
				listaNova.add((UIComponentField) property);
			}
		}

		// Parte Forms
		List<Association> listaAssoc = partial.getAssociations().stream()
				.filter(t -> t instanceof NavigationAssociation).collect(Collectors.toList());
		for (Association assoc : listaAssoc)
		{
			for (Property property : assoc.getMemberEnds())
			{
				if (property.getType() instanceof UIComponent)
				{
					UIComponent component = (UIComponent) property.getType();
					component.getAttributes().stream().filter(t -> t instanceof UIComponentField)
							.forEach(t -> listaNova.add((UIComponentField) t));
				}
			}
		}

		return listaNova;
	}

	public String processLabelNavigationAggregationAssociationMedium(
			NavigationAggregationAssociation navigationAggregationAssociation)
	{
		if (navigationAggregationAssociation.getSpaAttributes().size() > 0)
		{
			StringBuffer stringBuffer = new StringBuffer();
			String stringFinal = "{pros_attributes = [";
			navigationAggregationAssociation.getSpaAttributes().stream()
					.forEach(t -> stringBuffer.append(t.getAttribute().getName() + ", "));
			String processada = stringFinal.toString();
			processada = processada.substring(0, processada.lastIndexOf(", "));
			stringFinal += processada + "]}";
			return stringFinal;
		}

		return "";
	}

	// Método Original
	/*
	 * public String processLabelNavigationAggregationAssociationMedium(
	 * NavigationAggregationAssociation navigationAggregationAssociation) { if
	 * (navigationAggregationAssociation.getRelacoes().size() > 0) { StringBuffer
	 * stringBuffer = new StringBuffer(); String stringFinal =
	 * "{pros_attributes = [";
	 * 
	 * navigationAggregationAssociation.getRelacoes().stream() .forEach(t ->
	 * stringBuffer.append(t.getName() + ", ")); String processada =
	 * stringBuffer.toString(); processada = processada.substring(0,
	 * processada.lastIndexOf(", ")); stringFinal += processada + "]}"; return
	 * stringFinal; }
	 * 
	 * return ""; }
	 */

	public String processLabelNavigationAggregationAssociationLower(
			NavigationAggregationAssociation navigationAggregationAssociation)
	{
		int lower = navigationAggregationAssociation.getMemberEnds().get(0).getUpper();
		if (isEmptyLowerUpperBoundNavigationAggregationAssociation(navigationAggregationAssociation))
		{
			return "";
		} else if (lower < 0)
		{
			return "*";
		}

		return String.valueOf(lower);
	}

	public String processLabelNavigationAggregationAssociationUpper(
			NavigationAggregationAssociation navigationAggregationAssociation)
	{
		int upper = navigationAggregationAssociation.getMemberEnds().get(1).getUpper();
		if (isEmptyLowerUpperBoundNavigationAggregationAssociation(navigationAggregationAssociation))
		{
			return "";
		} else if (upper < 0)
		{
			return "*";
		}

		return String.valueOf(upper);
	}

	private Boolean isEmptyLowerUpperBoundNavigationAggregationAssociation(
			NavigationAggregationAssociation navigationAggregationAssociation)
	{
		int lower = navigationAggregationAssociation.getMemberEnds().get(0).getUpper();
		int upper = navigationAggregationAssociation.getMemberEnds().get(1).getUpper();
		if (lower == 1 && upper == 1)
		{
			return true;
		}
		return false;
	}

}
