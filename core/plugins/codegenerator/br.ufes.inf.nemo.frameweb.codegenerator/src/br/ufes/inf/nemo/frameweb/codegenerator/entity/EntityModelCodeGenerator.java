package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import br.ufes.inf.nemo.frameweb.codegenerator.entity.EntityClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class EntityModelCodeGenerator implements Iterator<String> {
  private Iterator<EntityClassCodeGenerator> iterator;
  
  private List<EntityClassCodeGenerator> domainClasses;
  
  /**
   * Armazenamos apenas aquilo que nos eh interessante quanto ao modelo de entidades,
   * sendo o pacote de dominio e suas classes
   * 
   * @param entityModel
   * @param ormTemplate
   */
  public EntityModelCodeGenerator(final EntityModel entityModel, final ORMTemplate ormTemplate) {
    final DomainPackage domainPackage = entityModel.getDomainPackage();
    final Function1<DomainClass, EntityClassCodeGenerator> _function = (DomainClass it) -> {
      String _name = domainPackage.getName();
      return new EntityClassCodeGenerator(it, _name, ormTemplate);
    };
    this.domainClasses = IterableExtensions.<EntityClassCodeGenerator>toList(ListExtensions.<DomainClass, EntityClassCodeGenerator>map(domainPackage.getDomainClasses(), _function));
    this.iterator = this.domainClasses.iterator();
  }
  
  @Override
  public boolean hasNext() {
    return this.iterator.hasNext();
  }
  
  @Override
  public String next() {
    return this.iterator.next().generate();
  }
}
