package plugin;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.IOParameter;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency;
import br.ufes.inf.nemo.frameweb.model.frameweb.Tag;

public class Componente {
	
	private Type parameterType;
	private String name;
	private Type methodType;
	private EList<Property> memberEnds;
	private NamedElement client;
	private FrontControllerMethod resultMethod;
	private NamedElement supplier;
	private EObject xsiType;
	private Type type;
	private Association association;
	private Tag tag = null;
	private AggregationKind aggregation;
	private List<Componente> componentes;
	
	public Componente() {
		componentes = new ArrayList<>();
	}
	
	public Componente(EObject eObj, EStructuralFeature estFeat){
		
		Object o;
		componentes = new ArrayList<>();
		xsiType = eObj;
		
		if(eObj instanceof NamedElementImpl) {
			name = ((NamedElementImpl)eObj).getName();
		}
		if(estFeat != null) {
			o = eObj.eGet(estFeat);
			if(o instanceof Tag) {
				tag = (Tag) o;
			}
		}
		if(eObj instanceof NavigationProperty) {
			association = ((NavigationProperty) eObj).getAssociation();
			type = ((NavigationProperty) eObj).getType();
			aggregation = ((NavigationProperty) eObj).getAggregation();
		}
		if(eObj instanceof Dependency) {
			supplier = ((Dependency) eObj).getSuppliers().get(0);
			client = ((Dependency)eObj).getClients().get(0);
			if(eObj instanceof ResultDependency) {
				resultMethod = ((ResultDependency) eObj).getResultMethod();
			}
		}
		if(eObj instanceof Association) {
			memberEnds = ((Association) eObj).getMemberEnds();
		}
		if(eObj instanceof FrontControllerMethod) {
			methodType = ((FrontControllerMethod) eObj).getMethodType();
		}
		if(eObj instanceof IOParameter) {
			parameterType = ((IOParameter) eObj).getType();
		}
	}

	public Componente addComponente(Componente c) {
		for(Componente comp : componentes) {
			if(comp.xsiType.equals(c.xsiType))
				return comp;
		}
		componentes.add(c);
		return c;
	}
	public Type getParameterType() {
		return parameterType;
	}
	public Type getMethodType() {
		return methodType;
	}
	Type getType() {
        return type;      
    }
	public String getName() {
		return name;
	}
	NamedElement getClient() {
        return client;
    }	
	public NamedElement getSupplier() {
        return supplier;
    }
	public EList<Property> getMemberEnds() {
		return memberEnds;
	}
	public Tag getTag() {
		return tag;
	}
	public AggregationKind getAggregation() {
		return aggregation;
	}
	public FrontControllerMethod getResultMethod() {
		return resultMethod;
	}
	public Association getAssociation() {
		return association;
	}
	public EObject getXsiType() {
		return xsiType;
	}
	public EList<Property> getMemberEnd() {
		return memberEnds;
	}
	public List<Componente> getComponentes() {
		return componentes;
	}	
}
