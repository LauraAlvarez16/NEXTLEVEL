package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

if (session.getAttribute("Nivel 4") != null){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Principal</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Principal_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"Imagen/Logo1.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"hero\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <a href=\"Login.jsp\" ><b>Cierre de Sesion</b><img src=\"Imagen/Perfil.png\" alt=\"\"/></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"banner\">\n");
      out.write("                <h1><b>BIENVENIDO</b></h1>\n");
      out.write("                <p>\"Mejora las practicas con funciones especialmente diseñadas para <br>\n");
      out.write("                    verificar y validar el cumplimiento de las labores\"\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"cuadro\">\n");
      out.write("                    <div class=\"funciones\">\n");
      out.write("                        <a href=\"Quienes_Somos.jsp\"><img src=\"Imagen/Quienes_somos.png\" alt=\"\"/>\n");
      out.write("                            <div class=\"titulo\">\n");
      out.write("                                <h4><b>Quienes Somos</b></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"descripcion\">\n");
      out.write("                                <p>Encontraras la Mision, Vision, <br>\n");
      out.write("                                    y Politicas de la Organización.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("                        \n");
      out.write("                <div class=\"cuadro\">\n");
      out.write("                    <div class=\"funciones\">\n");
      out.write("                        <a href=\"Crud_Auditor.jsp\"><img src=\"Imagen/Auditor.png\" alt=\"\"/>\n");
      out.write("                            <div class=\"titulo\">\n");
      out.write("                                <h4><b>Auditores</b></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"descripcion\">\n");
      out.write("                                <p>CRUD con respecto a los auditores<br>\n");
      out.write("                                    y asignación de permisos.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"cuadro\">\n");
      out.write("                    <div class=\"funciones\">\n");
      out.write("                        <img src=\"Imagen/Auditados.png\" alt=\"\"/>\n");
      out.write("                        <div class=\"titulo\">\n");
      out.write("                            <h4><b>Información</b></h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"descripcion\">\n");
      out.write("                            <p>Informacion con respecto <br>\n");
      out.write("                                a las evidencias.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"links\">\n");
      out.write("                            <a href=\"Crud_Auditados.jsp\"><b>Auditados <i class=\"bi bi-people\"></i></b></a></li>\n");
      out.write("                        <a href=\"Tabla_Documentos.jsp\"><b>Documentos <i class=\"bi bi-file-earmark-medical\"></i></b></a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"cuadro\">\n");
      out.write("                    <div class=\"funciones\">\n");
      out.write("                        <a href=\"Plantillas.jsp\"><img src=\"Imagen/Inspección.png\" alt=\"\"/>\n");
      out.write("                            <div class=\"titulo\">\n");
      out.write("                                <h4><b>Inspección</b></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"descripcion\">\n");
      out.write("                                <p>Aqui encuentras plantillas<br>\n");
      out.write("                                    para realizar las auditorias. \n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"main-content\" id=\"Footer\">\n");
      out.write("                <div class=\"left box\">\n");
      out.write("                    <h2>NEXT LEVEL</h2>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <p>Software de Gestión de Auditoria</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"rigt box\">\n");
      out.write("                    <h2>Contactanos</h2>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"place\">\n");
      out.write("                            \n");
      out.write("                            <span class=\"text\"><i class=\"bi bi-geo-alt-fill\"></i> Fusagasugá, Colombia</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"phone\">\n");
      out.write("                            \n");
      out.write("                            <span class=\"text\"><i class=\"bi bi-telephone-fill\"></i> +57 320-879-1391</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"email\">\n");
      out.write("                            \n");
      out.write("                            <span class=\"text\"><i class=\"bi bi-envelope-open-fill\"></i> NextLevel@gmail.com</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}else{
response.sendRedirect("Login.jsp");
}

      out.write('\n');
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
