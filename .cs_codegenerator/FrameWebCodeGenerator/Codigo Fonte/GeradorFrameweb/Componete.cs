using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GeradorFrameweb
{
    public class Componete
    {
        public string parameterType { get; set; }
        public string methodType { get; set; }
        public string tag { get; set; }
        public List<Componete> Componentes { get; set; }
        public string type { get; set; }
        public string name { get; set; }
        public string client { get; set; }
        public string supplier { get; set; }
        public string resultMethod { get; set; }
        public string association { get; set; }
        public string xsi_type { get; set; }
        public string memberEnd { get; set; }
        public string href { get; set; }

        public string getXsiTypeFile()
        {
            switch (xsi_type)
            {
                case "frameweb:UIComponentField":
                    var tag_ui = this.Componentes.Where(x => x.tag == "type").FirstOrDefault();
                    var parametros_ui = tag_ui.href.Split('/');
                    return parametros_ui[parametros_ui.Length - 2] + "\\"+ parametros_ui[parametros_ui.Length - 1] + ".txt";

                case "frameweb:Page":
                    var tag_lib = this.Componentes.Where(x => x.tag == "pageTagLib").FirstOrDefault();
                    var parametros = tag_lib.href.Split('/');
                    return parametros[parametros.Length - 1] + ".txt";       
                default:
                    return this.xsi_type.Split(':')[1] + ".txt";
            }
        }

        public string getType()
        {
            var parametros = this.type.Split('/');
            return parametros[parametros.Length - 1];        
        }

        internal string getClient()
        {
            var parametros = this.client.Split('/');
            return parametros[parametros.Length - 1];
        }

        internal string getSupplier()
        {
            var parametros = this.supplier.Split('/');
            return parametros[parametros.Length - 1];
        }
    }
}
