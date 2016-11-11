package br.ufes.inf.nemo.FrameWeb_Martins2015.design;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;

import br.ufes.inf.nemo.FrameWeb_Martins2015.*;


public class Extend {

	public Extend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String printParameters(EObject m) {
		String result;
		
		/*
		EAttribute eAttribute = eObject.eClass().getEIDAttribute();
	    if (eAttribute == null) {
	        return eObject.eClass().getName();
	    } else {
	        return eObject.eClass().getName() + ' ' + eObject.eGet(eAttribute);
	    }*/
		//name - m.eGet(name).toString();
		
		EStructuralFeature ownedElement = m.eClass().getEAllStructuralFeatures().get(2);
		EStructuralFeature name = m.eClass().getEAllStructuralFeatures().get(5);
		EStructuralFeature methodType = m.eClass().getEAllStructuralFeatures().get(45);
		EStructuralFeature ownedParameter = m.eClass().getEAllStructuralFeatures().get(24);
		
		String name_value = m.eGet(name).toString();
		String methodType_value = m.eGet(methodType).toString();
		Object parametros = m.eGet(ownedElement);
		
		result = name_value + " (";
		
		System.out.println(m.eClass().getEAllStructuralFeatures().toString());
		
		EcoreEList parameter_list = (EcoreEList) m.eGet(ownedParameter);

		int i;
		for(i=0;i<parameter_list.size();i++){
			EObject p = (EObject) parameter_list.get(i);
			//On Parameter
			EStructuralFeature parameter_name_feature = p.eClass().getEAllAttributes().get(0);
			String parameter_name_value = p.eGet(parameter_name_feature).toString();
			EStructuralFeature parameter_type_feature = p.eClass().getEAllStructuralFeatures().get(10);
			EObject parameter_type_object = (EObject) p.eGet(parameter_type_feature);
			EStructuralFeature parameter_type_name_feature = parameter_type_object.eClass().getEAllAttributes().get(0);
			String parameter_type_name_value = parameter_type_object.eGet(parameter_type_name_feature).toString();
			
			result = result + parameter_name_value + " : " + parameter_type_name_value;
			if(i!=parameter_list.size()-1) result = result + ", ";
		}
		
		result = result + ") : " + methodType_value;
		
		return result;
	}
	
	
}
