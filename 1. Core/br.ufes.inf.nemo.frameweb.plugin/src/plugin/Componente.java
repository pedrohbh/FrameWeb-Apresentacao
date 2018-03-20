package plugin;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import br.ufes.inf.nemo.frameweb.model.frameweb.Tag;


public class Componente {
	
	private String parameterType, methodType, type, name, client, supplier, resultMethod, association, xsiType, memberEnd, href, template;
	List<Componente> componentes;
	
	public Componente() {
		componentes = new ArrayList<>();
	}
	
	public Componente(EObject model){
		componentes = new ArrayList<>();
		xsiType = model.eClass().getName();
		if(model instanceof NamedElementImpl) {
			name = ((NamedElementImpl)model).getName(); // tag
		}
		if(model instanceof Tag)
			template = ((Tag)model).getCodeGenerationTemplate();
//			String result = URLDecoder.decode(template, "UTF-8");
		else
			template = null;

//		System.out.println("name: " + xsiType + "\t" + name);
//		System.out.println(template);
//		System.out.println(model);

//		if(model instanceof ModelImpl) System.out.println(((ModelImpl)model).getViewpoint());
//		if(model instanceof PackageImpl) System.out.println(((PackageImpl)model).getURI());
//		if(model instanceof BasicEObjectImpl) System.out.println(((BasicEObjectImpl)model).eProxyURI());
//		System.out.println(name);
//		System.out.println(model);
	}

	public String getTemplate() {
		return template;
	}

	public void addComponente(Componente c) {
		componentes.add(c);
	}
	
	public String getParameterType() {
		return parameterType;
	}
	public String getMethodType() {
		return methodType;
	}
	String getType() {
        String[] parametros = this.type.split("/");
        return parametros[parametros.length - 1];        
    }
	public String getName() {
		return name;
	}
	String getClient() {
        String[] parametros = this.client.split("/");
        return parametros[parametros.length - 1];
    }	
	public String getSupplier() {
        String[] parametros = this.supplier.split("/");
        return parametros[parametros.length - 1];
    }
	public String getResultMethod() {
		return resultMethod;
	}
	public String getAssociation() {
		return association;
	}
	public String getXsiType() {
		return xsiType;
	}
	public String getMemberEnd() {
		return memberEnd;
	}
	public String getHref() {
		return href;
	}
	public List<Componente> getComponentes() {
		return componentes;
	}

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
