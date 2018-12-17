package br.ufes.inf.nemo.frameweb.codegenerator;

import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class MainProjectRepresentation {
  private List<EObject> packages;
  
  /**
   * Mantem uma lista contendo (genericamente) apenas os elementos visuais do modelo frameweb:
   * Navigation Model, Entity Model, Persistence Model, Application Model e Templates.
   * 
   * @param selections
   */
  public MainProjectRepresentation(final Collection<? extends EObject> selections) {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof DSemanticDiagram));
    };
    final Function1<EObject, Boolean> _function_1 = (EObject it) -> {
      return Boolean.valueOf((it instanceof DNodeContainer));
    };
    final Function1<EObject, DRepresentationElement> _function_2 = (EObject it) -> {
      return ((DRepresentationElement) it);
    };
    final Function1<DRepresentationElement, EObject> _function_3 = (DRepresentationElement it) -> {
      return it.getTarget();
    };
    this.packages = IteratorExtensions.<EObject>toList(IteratorExtensions.<DRepresentationElement, EObject>map(IteratorExtensions.<EObject, DRepresentationElement>map(IteratorExtensions.<EObject>filter(IterableExtensions.findFirst(selections, _function).eAllContents(), _function_1), _function_2), _function_3));
  }
  
  /**
   * Retorna apenas FrameworkProfiles (templates)
   */
  public List<FrameworkProfile> getFrameworkProfiles() {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof FrameworkProfile));
    };
    final Function1<EObject, FrameworkProfile> _function_1 = (EObject it) -> {
      return ((FrameworkProfile) it);
    };
    return IterableExtensions.<FrameworkProfile>toList(IterableExtensions.<EObject, FrameworkProfile>map(IterableExtensions.<EObject>filter(this.packages, _function), _function_1));
  }
  
  /**
   * Retorna apenas FramewebModels (entity, application, persistence e navigation)
   */
  public List<FramewebModel> getFramewebModels() {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof FramewebModel));
    };
    final Function1<EObject, FramewebModel> _function_1 = (EObject it) -> {
      return ((FramewebModel) it);
    };
    return IterableExtensions.<FramewebModel>toList(IterableExtensions.<EObject, FramewebModel>map(IterableExtensions.<EObject>filter(this.packages, _function), _function_1));
  }
  
  /**
   * Retorna o template do controlador frontal do modelo frameweb
   */
  public FrontControllerTemplate getFrontControllerTemplate() {
    FrontControllerTemplate _xblockexpression = null;
    {
      final Function1<FrameworkProfile, Boolean> _function = (FrameworkProfile it) -> {
        return Boolean.valueOf((it instanceof FrontControllerTemplate));
      };
      final FrameworkProfile frontController = IterableExtensions.<FrameworkProfile>findFirst(this.getFrameworkProfiles(), _function);
      FrontControllerTemplate _xifexpression = null;
      if ((frontController != null)) {
        _xifexpression = ((FrontControllerTemplate) frontController);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Retorna o template do framework de orm do modelo frameweb
   */
  public ORMTemplate getORMTemplate() {
    ORMTemplate _xblockexpression = null;
    {
      final Function1<FrameworkProfile, Boolean> _function = (FrameworkProfile it) -> {
        return Boolean.valueOf((it instanceof ORMTemplate));
      };
      final FrameworkProfile orm = IterableExtensions.<FrameworkProfile>findFirst(this.getFrameworkProfiles(), _function);
      ORMTemplate _xifexpression = null;
      if ((orm != null)) {
        _xifexpression = ((ORMTemplate) orm);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Retorna o modelo de entidades do modelo frameweb a qual possui um pacote de dominio,
   * isso serve para que a definicao da linguagem de programacao nao seja inclusa.
   * 
   * Obs: pq raios a definicao da linguagem eh um modelo de entidades?
   */
  public EntityModel getEntityModel() {
    EntityModel _xblockexpression = null;
    {
      final Function1<FramewebModel, Boolean> _function = (FramewebModel it) -> {
        return Boolean.valueOf((it instanceof EntityModel));
      };
      final Function1<FramewebModel, Boolean> _function_1 = (FramewebModel it) -> {
        final Function1<EObject, Boolean> _function_2 = (EObject it_1) -> {
          return Boolean.valueOf((it_1 instanceof DomainPackage));
        };
        return Boolean.valueOf(IterableExtensions.<EObject>exists(it.eContents(), _function_2));
      };
      final FramewebModel entityModel = IterableExtensions.<FramewebModel>findFirst(IterableExtensions.<FramewebModel>filter(this.getFramewebModels(), _function), _function_1);
      EntityModel _xifexpression = null;
      if ((entityModel != null)) {
        _xifexpression = ((EntityModel) entityModel);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean hasEntityModel() {
    EntityModel _entityModel = this.getEntityModel();
    return (_entityModel != null);
  }
  
  /**
   * Retorna o modelo de navegacao do modelo frameweb
   */
  public NavigationModel getNavigationModel() {
    NavigationModel _xblockexpression = null;
    {
      final Function1<FramewebModel, Boolean> _function = (FramewebModel it) -> {
        return Boolean.valueOf((it instanceof NavigationModel));
      };
      final Function1<FramewebModel, Boolean> _function_1 = (FramewebModel it) -> {
        final Function1<EObject, Boolean> _function_2 = (EObject it_1) -> {
          return Boolean.valueOf((it_1 instanceof ControllerPackage));
        };
        return Boolean.valueOf(IterableExtensions.<EObject>exists(it.eContents(), _function_2));
      };
      final FramewebModel navigationModel = IterableExtensions.<FramewebModel>findFirst(IterableExtensions.<FramewebModel>filter(this.getFramewebModels(), _function), _function_1);
      NavigationModel _xifexpression = null;
      if ((navigationModel != null)) {
        _xifexpression = ((NavigationModel) navigationModel);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
