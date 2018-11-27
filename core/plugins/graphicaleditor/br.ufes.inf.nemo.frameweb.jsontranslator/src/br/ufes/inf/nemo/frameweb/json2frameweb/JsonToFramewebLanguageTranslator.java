package br.ufes.inf.nemo.frameweb.json2frameweb;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JsonToFramewebLanguageTranslator {
  private JsonObject json;
  
  public JsonToFramewebLanguageTranslator(final String languageDefinition) {
    this.json = new JsonParser().parse(languageDefinition).getAsJsonObject();
  }
  
  public JsonToFramewebLanguageTranslator(final JsonObject json) {
    this.json = json;
  }
  
  public CharSequence translate() {
    CharSequence _xblockexpression = null;
    {
      final JsonElement language = this.json.get("language");
      final JsonObject types = this.json.get("types").getAsJsonObject();
      final JsonArray primitives = types.get("primitives").getAsJsonArray();
      final JsonArray classes = types.get("classes").getAsJsonArray();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      _builder.newLine();
      _builder.append("<frameweb:FramewebProject xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:frameweb=\"http://nemo.inf.ufes.br/projects/frameweb/FW-2015\" xmlns:uml=\"http://www.eclipse.org/uml2/5.0.0/UML\">");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<compose xsi:type=\"frameweb:EntityModel\" name=");
      _builder.append(language, "  ");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      {
        boolean _hasElements = false;
        for(final JsonElement primitive : primitives) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate("\n", "    ");
          }
          _builder.append("<packagedElement xsi:type=\"uml:PrimitiveType\" name=");
          _builder.append(primitive, "    ");
          _builder.append("/>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      {
        boolean _hasElements_1 = false;
        for(final JsonElement _class : classes) {
          if (!_hasElements_1) {
            _hasElements_1 = true;
          } else {
            _builder.appendImmediate("\n", "    ");
          }
          _builder.append("<packagedElement xsi:type=\"uml:Class\" name=");
          _builder.append(_class, "    ");
          _builder.append("/>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("</compose>");
      _builder.newLine();
      _builder.append("</frameweb:FramewebProject>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
