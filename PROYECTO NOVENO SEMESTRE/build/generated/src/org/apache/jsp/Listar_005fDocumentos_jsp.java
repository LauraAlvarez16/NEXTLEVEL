package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import Modelo.Documentos;
import Modelo.Documento_DAO_CRUD;

public final class Listar_005fDocumentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LISTAR DOCUMENTOS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>DOCUMENTOS</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>NOMBRE</th>\n");
      out.write("                    <th>DETALLE</th>\n");
      out.write("                    <th>TIPO</th>\n");
      out.write("                    <th>CATEGORÍA</th>\n");
      out.write("                    <th>VERSIÓN</th>\n");
      out.write("                    <th>FECHA</th>\n");
      out.write("                    <th>RUTA</th>\n");
      out.write("                    <th>ÁREA</th>\n");
      out.write("                    <th>AUDITORÍA</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");

                Documento_DAO_CRUD dao = new Documento_DAO_CRUD();
                List<Documentos> list = dao.listar();
                Iterator<Documentos> iter = list.iterator();
                Documentos doc = null;
                while (iter.hasNext()) {
                    doc = iter.next();

            
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( doc.getId_doc());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getNom_doc());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getDetalle());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getTipo_doc());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getCategoria());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getVersion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getFecha());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getRuta_doc());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getArea());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( doc.getTitulo());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        <a>Eliminar</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
