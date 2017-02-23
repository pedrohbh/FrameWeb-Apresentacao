package br.ufes.inf.nemo.FrameWeb_Martins2015.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import java.util.ArrayList;

import br.ufes.inf.nemo.FrameWeb_Martins2015.*;


public class Extend {

	public Extend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String printParameters(EObject m) {
		
		String result = null;
		
		EStructuralFeature ownedElement = m.eClass().getEStructuralFeature("ownedElement");
		EStructuralFeature name = m.eClass().getEStructuralFeature("name");
		EStructuralFeature methodType = null;
		EStructuralFeature ownedParameter = null;
		String methodType_value = null;
		Object parametros;
		
		String name_value = m.eGet(name).toString();
			
		result = name_value + " (";
		
		if(m.eClass().getEStructuralFeature("ownedParameter") != null){ 
			ownedParameter = m.eClass().getEStructuralFeature("ownedParameter");
			EcoreEList parameter_list = (EcoreEList) m.eGet(ownedParameter);
			
			int i;
			for(i=0;i<parameter_list.size();i++){
				EObject p = (EObject) parameter_list.get(i);
				//On Parameter
				String Type = "void";
				EStructuralFeature parameter_name_feature = p.eClass().getEAllAttributes().get(0);
				String parameter_name_value = p.eGet(parameter_name_feature).toString();
				if(p.eClass().getEStructuralFeature("type")!=null){
					EStructuralFeature parameter_type_feature = p.eClass().getEStructuralFeature("type");
					if(p.eGet(parameter_type_feature) != null){
						EObject parameter_type_object = (EObject) p.eGet(parameter_type_feature);
						EStructuralFeature parameter_type_name_feature = parameter_type_object.eClass().getEAllAttributes().get(0);
						Type = parameter_type_object.eGet(parameter_type_name_feature).toString();
					}
				}
				result = result + parameter_name_value + " : " + Type;
				if(i!=parameter_list.size()-1) result = result + ", ";
			}
			}
		
		result = result + ")";
		
		if(m.eClass().getEStructuralFeature("methodType") != null){
			result = result + " : ";
			methodType = m.eClass().getEStructuralFeature("methodType");
			methodType_value = m.eGet(methodType).toString();
			result = result + methodType_value;
			}else{
				result = result + " : " + "void";
			}
		
		return result;
	}
	
	public String printCardinalidade(EObject o){
		
		EStructuralFeature upper = o.eClass().getEStructuralFeature("upper");
		Integer upper_value = (Integer) o.eGet(upper);
		
		EStructuralFeature lower = o.eClass().getEStructuralFeature("lower");
		Integer lower_value = (Integer) o.eGet(lower);
		
		if(upper_value==lower_value){
			return lower_value.toString();
		}
		
		if(upper_value==-1){
			return lower_value + "..*";
		}
		return lower_value + ".." + upper_value;
	}
	
public String printConstraint(EObject o){
	
	ArrayList<String> result = new ArrayList<>();
	
	//COLLECTION
	EStructuralFeature collection = o.eClass().getEStructuralFeature("collection");
	String collection_value = o.eGet(collection).toString();	
	
	if(!collection_value.equals("set")){
		result.add("collection=" + collection_value);
	}
	//CASCADE
	EStructuralFeature cascade = o.eClass().getEStructuralFeature("cascade");
	String cascade_value = o.eGet(cascade).toString();	
	
	if(!cascade_value.equals("remove")){
		result.add("cascade=" + cascade_value);
	}
	//ORDER
	EStructuralFeature order = o.eClass().getEStructuralFeature("order");
	String order_value = o.eGet(order).toString();	
	
	if(!order_value.equals("natural")){
		result.add("order=" + order_value);
	}
	//FETCH
	EStructuralFeature fetch = o.eClass().getEStructuralFeature("fetch");
	String fetch_value = o.eGet(fetch).toString();	
	
	if(!fetch_value.equals("lazy")){
		result.add("fetch=" + fetch_value);
	}
	
		if(!result.isEmpty()){			
			String retorno = " {";
			
			for(int i=0;i<result.size();i++){
				retorno = retorno + result.get(i);
				
				if(i==(result.size()-1)){
					retorno = retorno + "}";
				}else{
					retorno = retorno + ",\n";
				}
			}
			
			return retorno;
		}else{
			return "";
		}
	}
	
	
	
	public String printVisibility(EObject o){	
		EStructuralFeature visibility_feature = o.eClass().getEAllAttributes().get(2);
		String visibility_value = o.eGet(visibility_feature).toString();
		if(visibility_value=="public"){
			return " + ";
		}
		if(visibility_value=="package"){
			return " ~ ";
		}
		if(visibility_value=="private"){
			return " - ";
		}
		if(visibility_value=="protected"){
			return " # ";
		}
		return " ? ";
	}
	
	
	
}
