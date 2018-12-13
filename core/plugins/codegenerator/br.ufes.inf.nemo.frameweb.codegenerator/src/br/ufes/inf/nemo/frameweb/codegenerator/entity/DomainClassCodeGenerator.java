package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class DomainClassCodeGenerator {
  private DomainPackage domainPackage;
  
  private DomainClass domainClass;
  
  private ORMTemplate ormTemplate;
  
  /**
   * @param domainClass
   * @param domainPackage
   * @param ormTemplate
   */
  public DomainClassCodeGenerator(final DomainClass domainClass, final DomainPackage domainPackage, final ORMTemplate ormTemplate) {
    this.domainPackage = domainPackage;
    this.domainClass = domainClass;
    this.ormTemplate = ormTemplate;
  }
  
  /**
   * Decodifica os atributos dos templates do modelo frameweb a partir uma URI
   * 
   * @param str
   */
  public String decode(final String str) {
    try {
      return URLDecoder.decode(str, "UTF-8");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateClass() {
    String _xblockexpression = null;
    {
      String classTemplate = this.decode(this.ormTemplate.getClassTemplate());
      classTemplate = classTemplate.replace("FW_PACKAGE", this.domainPackage.getName());
      String _xifexpression = null;
      boolean _isAbstract = this.domainClass.isAbstract();
      if (_isAbstract) {
        _xifexpression = classTemplate.replace("FW_CLASS_VISIBILITY", "public abstract");
      } else {
        _xifexpression = classTemplate.replace("FW_CLASS_VISIBILITY", "public");
      }
      classTemplate = _xifexpression;
      classTemplate = classTemplate.replace("FW_CLASS_NAME", this.domainClass.getName());
      String _xtrycatchfinallyexpression = null;
      try {
        String _name = this.domainClass.getDomainGeneralization().getName();
        String _plus = ("extends " + _name);
        _xtrycatchfinallyexpression = classTemplate.replace("FW_EXTENDS", _plus);
      } catch (final Throwable _t) {
        if (_t instanceof NullPointerException) {
          _xtrycatchfinallyexpression = classTemplate.replace("FW_EXTENDS", "");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = classTemplate = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Gera os atributos com seus getters e setters
   */
  public String generateAttributes() {
    String _xblockexpression = null;
    {
      final String attributeTemplate = this.decode(this.ormTemplate.getAttributeTemplate());
      final List<DomainAttribute> attributes = this.domainClass.getDomainAttributes();
      final StringBuilder code = new StringBuilder();
      for (final DomainAttribute attribute : attributes) {
        {
          String attributeCode = attributeTemplate;
          attributeCode = attributeCode.replace("FW_ATTRIBUTE_TYPE", attribute.getType().getName());
          attributeCode = attributeCode.replace("FW_ATTRIBUTE_FIRST_UPPER", StringUtils.capitalize(attribute.getName()));
          attributeCode = attributeCode.replace("FW_ATTRIBUTE", attribute.getName());
          attributeCode = attributeCode.replace("FW_VISIBILITY", attribute.getVisibility().toString());
          code.append(attributeCode);
          int _size = attributes.size();
          int _minus = (_size - 1);
          DomainAttribute _get = attributes.get(_minus);
          boolean _tripleNotEquals = (attribute != _get);
          if (_tripleNotEquals) {
            code.append("\n\n");
          }
        }
      }
      _xblockexpression = code.toString().replaceFirst("\t", "");
    }
    return _xblockexpression;
  }
  
  /**
   * TODO um sonho nao tao distante
   * Separar o template de atributos de seus getters e setters
   */
  public Object generateGettersAndSetters() {
    return null;
  }
  
  /**
   * Gera os metodos de classe
   */
  public String generateMethods() {
    String _xblockexpression = null;
    {
      final String methodTemplate = this.decode(this.ormTemplate.getMethodTemplate());
      final String abstractMethodTemplate = this.ormTemplate.getAbstractMethodTemplate();
      final List<DomainMethod> methods = this.domainClass.getDomainMethods();
      final StringBuilder code = new StringBuilder();
      for (final DomainMethod method : methods) {
        {
          String methodCode = "";
          boolean _isAbstract = method.isAbstract();
          if (_isAbstract) {
            methodCode = abstractMethodTemplate;
            methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public abstract");
          } else {
            methodCode = methodTemplate;
            methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public");
          }
          try {
            methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", method.getMethodType().getName());
          } catch (final Throwable _t) {
            if (_t instanceof NullPointerException) {
              methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", "void");
              methodCode = methodCode.replace("null", "");
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          methodCode = methodCode.replace("FW_METHOD_NAME", method.getName());
          code.append(methodCode);
          int _size = methods.size();
          int _minus = (_size - 1);
          DomainMethod _get = methods.get(_minus);
          boolean _tripleNotEquals = (method != _get);
          if (_tripleNotEquals) {
            code.append("\n\n");
          }
        }
      }
      _xblockexpression = code.toString().replaceFirst("\t", "");
    }
    return _xblockexpression;
  }
  
  /**
   * The magic
   */
  public void generate(final IFolder packageFolder) {
    String template = this.generateClass();
    template = template.replace("FW_CLASS_ATTRIBUTES", this.generateAttributes());
    template = template.replace("FW_CLASS_METHOD", this.generateMethods());
    String _name = this.domainClass.getName();
    String _classExtension = this.ormTemplate.getClassExtension();
    final String fileName = (_name + _classExtension);
    final IFile classFile = packageFolder.getFile(fileName);
    try {
      final InputStream inputStream = IOUtils.toInputStream(template, "UTF-8");
      classFile.create(inputStream, true, null);
    } catch (final Throwable _t) {
      if (_t instanceof CoreException || _t instanceof IOException) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
