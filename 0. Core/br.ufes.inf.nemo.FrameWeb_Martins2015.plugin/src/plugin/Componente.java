package plugin;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;

public class Componente {
	
	String parameterType, methodType, tag, type, name, client, supplier, resultMethod, association, xsiType, memberEnd, href;
	List<Componente> componentes;
	
	public Componente() {
		componentes = new ArrayList<>();
	}
	
	public Componente(EObject model){
		componentes = new ArrayList<>();
		tag = model.eClass().getName(); // ?
		xsiType = model.eClass().getName();
		if(model instanceof NamedElementImpl) {
			name = ((NamedElementImpl)model).getName();
//			System.out.println(((NamedElementImpl)model).getVisibility());
		}
//		
//		if(model instanceof ModelImpl) System.out.println(((ModelImpl)model).getViewpoint());
//		if(model instanceof PackageImpl) System.out.println(((PackageImpl)model).getURI());
//		if(model instanceof BasicEObjectImpl) System.out.println(((BasicEObjectImpl)model).eProxyURI());
		
//		System.out.println(model);
	}
	
	public void addComponente(Componente c) {
		componentes.add(c);
	}
	
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	String getType() {
        String[] parametros = this.type.split("/");
        return parametros[parametros.length - 1];        
    }
	
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String getClient() {
        String[] parametros = this.client.split("/");
        return parametros[parametros.length - 1];
    }
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getSupplier() {
        String[] parametros = this.supplier.split("/");
        return parametros[parametros.length - 1];
    }
	
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getResultMethod() {
		return resultMethod;
	}
	public void setResultMethod(String resultMethod) {
		this.resultMethod = resultMethod;
	}
	public String getAssociation() {
		return association;
	}
	public void setAssociation(String association) {
		this.association = association;
	}
	public String getXsiType() {
		return xsiType;
	}
	public void setXsiType(String xsiType) {
		this.xsiType = xsiType;
	}
	public String getMemberEnd() {
		return memberEnd;
	}
	public void setMemberEnd(String memberEnd) {
		this.memberEnd = memberEnd;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<Componente> getComponentes() {
		return componentes;
	}
	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

//
//    public string getXsiTypeFile()
//    {
//        switch (xsi_type)
//        {
//            case "frameweb:UIComponentField":
//                var tag_ui = this.Componentes.Where(x => x.tag == "type").FirstOrDefault();
//                var parametros_ui = tag_ui.href.Split('/');
//                return parametros_ui[parametros_ui.Length - 2] + "\\"+ parametros_ui[parametros_ui.Length - 1] + ".txt";
//
//            case "frameweb:Page":
//                var tag_lib = this.Componentes.Where(x => x.tag == "pageTagLib").FirstOrDefault();
//                var parametros = tag_lib.href.Split('/');
//                return parametros[parametros.Length - 1] + ".txt";       
//            default:
//                return this.xsi_type.Split(':')[1] + ".txt";
//        }
//    }
	
}
