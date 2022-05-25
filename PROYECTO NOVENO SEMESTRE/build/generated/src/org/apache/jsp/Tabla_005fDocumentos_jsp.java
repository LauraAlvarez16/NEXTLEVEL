package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tabla_005fDocumentos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Documentos</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Listar_Documentos_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css\" integrity=\"sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"Image/jpg\" href=\"Imagen/Logo1.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 class=\"text-center\" id=\"titulo\"><b>DOCUMENTOS</b></h2>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("            <div class=\"row mt-2\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                    <form  action=\"Tabla_Documentos.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"Buscar\">\n");
      out.write("\n");
      out.write("                            <div class=\"texto\">\n");
      out.write("                                <input type=\"text\" name=\"txt_Buscar\" class=\"form-control\" placeholder=\"Buscar\"/>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"boton_buscar\">\n");
      out.write("                                <input type=\"submit\" value=\"Buscar\" name=\"btn_Buscar\" class=\"form-control btn btn-primary\"/>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <table  class=\"table table-hover table-light\" style=\"white-space: nowrap;overflow-x:auto\">\n");
      out.write("                            <thead>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th scope=\"col\" colspan=\"8\" class=\"text-center\"></th>\n");
      out.write("\n");
      out.write("                                    <th></th>\n");
      out.write("\n");
      out.write("                                    <th scope=\"col\" class=\"text-center\">\n");
      out.write("                                        <a  href=\"Tabla_Documentos.jsp\"><i class=\"fa fa-refresh fa-2x fa-spin\" aria-hidden=\"true\"></i><a>\n");
      out.write("                                                </th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <th scope=\"col\" class=\"text-center\">\n");
      out.write("                                                    <a  href=\"Ingresar_Documentos.jsp\"<i class=\"fa fa-file-text fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                </th>\n");
      out.write("\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">ID</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">NOMBRE</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">DETALLE</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">TIPO</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">CATEGORÍA</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">VERSIÓN</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">FECHA</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">RUTA</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">ÁREA</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">AUDITORÍA</th>\n");
      out.write("                                                    <th scope=\"col\" class=\"text-center\">ACCIONES</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "S_Documentos", out, false);
      out.write(" \n");
      out.write("                                                </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                                </form>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                </body>\n");
      out.write("                                                </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
