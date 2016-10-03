using System;
using System.Collections;
using System.Collections.Generic;
using System.Configuration;
using System.Diagnostics;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;

namespace GeradorFrameweb
{
    class Program
    {
        static void Main(string[] args)
        {
            string arquivo;
            if(args != null && args.Count() > 0)
            {
                arquivo = args[0];
            }
            else
            {
                arquivo = "local.frameweb";
            }
            XmlDocument xmlDocument;

            xmlDocument = new XmlDocument();
            xmlDocument.Load(new StreamReader(arquivo));

            string[] nivel_1 = new string[] { "resultDependencyConstraint", "packagedElement" };
            string[] nivel_2 = new string[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation" };
            string[] nivel_3 = new string[] { "type" };

            XmlElement ele = (XmlElement)xmlDocument.DocumentElement.SelectNodes("compose")[0];
            Componete componente = CriarComponente(ele);

            foreach (XmlElement sub0 in ele.SelectNodes("packagedElement"))
            {
                var comp0 = CriarComponente(sub0);

                foreach (var niv in nivel_1)
                {
                    foreach (XmlElement sub1 in sub0.SelectNodes(niv))
                    {
                        var comp1 = CriarComponente(sub1);
                        comp0.Componentes.Add(comp1);

                        foreach (var niv2 in nivel_2)
                        {
                            foreach (XmlElement sub2 in sub1.SelectNodes(niv2))
                            {
                                var comp2 = CriarComponente(sub2);
                                comp1.Componentes.Add(comp2);

                                foreach (var niv3 in nivel_3)
                                {
                                    foreach (XmlElement sub3 in sub2.SelectNodes(niv3))
                                    {
                                        var comp3 = CriarComponente(sub3);
                                        comp2.Componentes.Add(comp3);
                                    }
                                }
                            }
                        }
                    }
                }

                componente.Componentes.Add(comp0);
            }

            GerarArquivos(componente);
        }

        private static void GerarArquivos(Componete componente)
        {
            var dir_template = ConfigurationManager.AppSettings["dir_template"];
            var projeto = dir_template + "projeto\\" + ConfigurationManager.AppSettings["projeto"];
            var lang = ConfigurationManager.AppSettings["lang"];
            var dir_output_web = ConfigurationManager.AppSettings["dir_output_web"];
            var dir_output_class = ConfigurationManager.AppSettings["dir_output_class"];
            var ext_class = ConfigurationManager.AppSettings["ext_class"];
            var dir_output = "build\\";

            try
            {
                if (Directory.Exists(dir_output))
                    Directory.Delete(dir_output, true);
            }
            catch (Exception)
            {
                Log("Falha ao tentar remover o diretório destino, verifique se nenhum arquivo está em uso.");
                return;
            }

            Log("Removento build dir");
            Thread.Sleep(2000);
            Directory.CreateDirectory(dir_output);

            //Now Create all of the directories
            foreach (string dirPath in Directory.GetDirectories(projeto, "*",
                SearchOption.AllDirectories))
                Directory.CreateDirectory(dirPath.Replace(projeto, dir_output));

            //Copy all the files & Replaces any files with the same name
            foreach (string newPath in Directory.GetFiles(projeto, "*.*",
                SearchOption.AllDirectories))
                File.Copy(newPath, newPath.Replace(projeto, dir_output), true);

            /// CONTROLLER
            var controllers = componente.Componentes.Where(x => x.xsi_type == "frameweb:ControllerPackage").ToList().SelectMany(x => x.Componentes).ToList();
            var tags_controller = new Dictionary<string, string>();

            foreach (var controller in controllers)
            {
                tags_controller.Add("FW_CLASS_NAME", controller.name);     
                
                var frontControllerDependency = componente.Componentes.Where(x => x.xsi_type == "frameweb:FrontControllerDependency" && x.getSupplier() == controller.name).FirstOrDefault();
                tags_controller.Add("FW_BEAN_NAME", frontControllerDependency != null ? frontControllerDependency.getClient() : string.Empty);
                
                //tags_controller.Add("FW_BEAN_CLASS_NAME", "NNN");

                var controller_parameters = controller.Componentes.Where(x => x.xsi_type == "frameweb:IOParameter").ToList();

                string parameters = string.Empty;
                foreach (var parameter in controller_parameters)
                {
                    var text_parameter = File.ReadAllText(dir_template + lang + "\\" + parameter.getXsiTypeFile());
                    text_parameter = text_parameter.Replace("FW_PARAMETER_TYPE", parameter.parameterType);
                    text_parameter = text_parameter.Replace("FW_PARAMETER_FIRST_UPPER", FirstCharToUpper(parameter.name));
                    text_parameter = text_parameter.Replace("FW_PARAMETER", parameter.name);
                    
                    parameters += text_parameter;
                }

                tags_controller.Add("FW_FRONT_CONTROLLER_PARAMETERS", parameters); 

                var controller_methods = controller.Componentes.Where(x => x.xsi_type == "frameweb:FrontControllerMethod").ToList();

                string methods = string.Empty;
                foreach (var method in controller_methods)
                {
                    var text_method = File.ReadAllText(dir_template + lang + "\\" + method.getXsiTypeFile());
                    text_method = text_method.Replace("FW_METHOD_RETURN_TYPE", method.methodType);
                    text_method = text_method.Replace("FW_METHOD_NAME", method.name);

                    methods += text_method;
                }

                tags_controller.Add("FW_FRONT_CONTROLLER_METHOD", methods);

                var text = File.ReadAllText(dir_template + lang + "\\" + controller.getXsiTypeFile());
                foreach (var item in tags_controller)
                {
                    text = text.Replace(item.Key, item.Value);
                }

                File.WriteAllText(Path.Combine(dir_output, dir_output_class, controller.name + ext_class), text);
            }
            /// VIEW

            var views = componente.Componentes.Where(x => x.xsi_type == "frameweb:ViewPackage").ToList().SelectMany(x => x.Componentes).ToList();

            var views_pages = views.Where(x => x.xsi_type == "frameweb:Page").ToList();
            foreach (var page in views_pages)
            {
                string body = string.Empty;

                var componentes_dentro_pagina = page.Componentes.Where(x => x.xsi_type == "frameweb:NavigationCompositionWhole").ToList();
                foreach (Componete componente_pagina in componentes_dentro_pagina)
                {
                    var comp = views.Where(x => x.name == componente_pagina.getType()).FirstOrDefault();
                    if (comp != null)
                    {
                        string body_form = string.Empty;
                        if (comp.xsi_type == "frameweb:UIComponent")// Form
                        {
                            body_form = File.ReadAllText(dir_template + "framework\\" + comp.getXsiTypeFile());
                        }
                        string body_form_comp = string.Empty;
                        foreach (var item in comp.Componentes)
                        {
                            var field_template = File.ReadAllText(dir_template + "framework\\" + item.getXsiTypeFile());
                            field_template = field_template.Replace("FW_ID", item.name.Replace('.', '_'));
                            field_template = field_template.Replace("FW_VALUE", comp.name +"." + item.name);

                            body_form_comp += field_template;
                        }

                        body_form = body_form.Replace("FW_BODY", body_form_comp);
                        body_form = body_form.Replace("FW_ID", comp.name); 
                        body += body_form;
                    }
                }

                var text = File.ReadAllText(dir_template + "framework\\" + page.getXsiTypeFile());
                text = text.Replace("FW_BODY", body);

                File.WriteAllText(Path.Combine(dir_output, dir_output_web, page.name), text);
            }
            Process.Start("explorer.exe", dir_output);
        }

        static string FirstCharToUpper(string input)
        {
            if (string.IsNullOrEmpty(input))
                return string.Empty;
            return input.First().ToString().ToUpper() + input.Substring(1);
        }

        static void Log(string log)
        {
            Console.WriteLine(DateTime.Now + " - " + log);
        }
        static Componete CriarComponente(XmlElement elemento)
        {
            var comp = new Componete();
            comp.tag = elemento.Name;
            comp.Componentes = new List<Componete>();
            ValorAtributo(elemento.Attributes, ref comp);
            return comp;
        }
        static void ValorAtributo(XmlAttributeCollection itens, ref Componete filho)
        {
            foreach (XmlAttribute item in itens)
            {
                switch (item.Name)
                {
                    case "xsi:type":
                        filho.xsi_type = item.Value;
                        break;
                    case "name":
                        filho.name = item.Value;
                        break;
                    case "type":
                        filho.type = item.Value;
                        break;
                    case "association":
                        filho.association = item.Value;
                        break;
                    case "memberEnd":
                        filho.memberEnd = item.Value;
                        break;
                    case "href":
                        filho.href = item.Value;
                        break;
                    case "client":
                        filho.client = item.Value;
                        break;
                    case "supplier":
                        filho.supplier = item.Value;
                        break;
                    case "resultMethod":
                        filho.resultMethod = item.Value;
                        break;
                    case "methodType":
                        filho.methodType = item.Value;
                        break;
                    case "parameterType":
                        filho.parameterType = item.Value;
                        break; 
                }
            }

        }
    }
}
