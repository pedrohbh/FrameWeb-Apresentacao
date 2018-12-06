package br.ufes.inf.nemo.frameweb.codegenerator;

import br.ufes.inf.nemo.frameweb.codegenerator.EntityClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EntityModelCodeGenerator {
  private List<EntityClassCodeGenerator> domainClasses;
  
  /**
   * Armazenamos apenas aquilo que nos eh interessante quanto ao modelo de entidades,
   * sendo o pacote de dominio e suas classes
   */
  public EntityModelCodeGenerator(final EntityModel entityModel, final ORMTemplate ormTemplate) {
    final DomainPackage domainPackage = this.getDomainPackage(entityModel);
    final Function1<DomainClass, EntityClassCodeGenerator> _function = (DomainClass it) -> {
      String _name = domainPackage.getName();
      return new EntityClassCodeGenerator(it, _name, ormTemplate);
    };
    this.domainClasses = IterableExtensions.<EntityClassCodeGenerator>toList(ListExtensions.<DomainClass, EntityClassCodeGenerator>map(this.getDomainClasses(domainPackage), _function));
  }
  
  /**
   * Extrai o pacote de dominio do modelo de entidades
   */
  public DomainPackage getDomainPackage(final EntityModel entityModel) {
    DomainPackage _xblockexpression = null;
    {
      final Function1<EObject, Boolean> _function = (EObject it) -> {
        return Boolean.valueOf((it instanceof DomainPackage));
      };
      final EObject domainPackage = IterableExtensions.<EObject>findFirst(entityModel.eContents(), _function);
      DomainPackage _xifexpression = null;
      if ((domainPackage != null)) {
        _xifexpression = ((DomainPackage) domainPackage);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Extrai as classes do dominio do pacote de dominio do modelo de entidades
   */
  public List<DomainClass> getDomainClasses(final DomainPackage domainPackage) {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof DomainClass));
    };
    final Function1<EObject, DomainClass> _function_1 = (EObject it) -> {
      return ((DomainClass) it);
    };
    return IterableExtensions.<DomainClass>toList(IterableExtensions.<EObject, DomainClass>map(IterableExtensions.<EObject>filter(domainPackage.eContents(), _function), _function_1));
  }
  
  /**
   * Retorna a lista de classes de entidade contidas no modelo
   */
  public List<EntityClassCodeGenerator> getEntityClasses() {
    return this.domainClasses;
  }
}
