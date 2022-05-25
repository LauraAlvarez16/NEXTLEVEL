package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Ingresar_005fDocumentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Documentos</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Ingresar_Documentos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css\" integrity=\"sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"Image/jpg\" href=\"Imagen/Logo1.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"contact-box\">\n");
      out.write("\n");
      out.write("                <div class=\"titulo\">\n");
      out.write("                    <h2><b>REGISTRA TUS EVIDENCIAS</b></h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <form action=\"Ingresar_Documentos.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"informacion\">\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("                            ");


                                if (request.getParameter("guardar") != null) {
                                    String codigo = request.getParameter("txt_Codigo");
                                    String nom_doc = request.getParameter("txt_Nombre");
                                    String detalle = request.getParameter("txta_Detalle");
                                    String tipo = request.getParameter("jcb_Tipo");
                                    String categoria = request.getParameter("jcb_Categoria");
                                    String version = request.getParameter("txt_Version");
                                    String fecha = request.getParameter("datec_Fecha");
                                    byte[] ruta = request.getParameter("btn_Ruta").getBytes();

                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();

                                    System.out.println("Conexion establecida");

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st = con.createStatement();
                                        st.executeUpdate("INSERT INTO documentos(id_doc,nombre_doc,detalle,tipo_doc,categoria,version,fecha,ruta_doc,id_area,id_auditoria) VALUES('" + codigo + "','" + nom_doc + "','" + detalle + "','" + tipo + "','" + categoria + "','" + version + "','" + fecha + "','" + ruta + "','2','2');");

                                        request.getRequestDispatcher("Tabla_Documentos.jsp").forward(request, response);
                                        
                                    } catch (Exception e) {
                                        out.print(e);
                                    }
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div class=\"texto\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"right1\">\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"codigo\">Codigo:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"codigo\" name=\"txt_Codigo\" placeholder=\"Codigo\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputState\">Área</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql = "Select id_area, nombre_area from area";
                                    rs = st.executeQuery(sql);


                                
      out.write(" \n");
      out.write("                               \n");
      out.write("                                <select id=\"inputState\" class=\"form-control\" name=\"jcb_Area\">\n");
      out.write("                                    <option/>Seleccione un área</option>\n");
      out.write("                                \n");
      out.write("                                    ");
                                   
                                        while (rs.next()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("id_area"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("nombre_area"));
      out.write("</option>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <label for=\"fecha\" class=\"control-label col-xs-4\">Fecha:</label>                 \n");
      out.write("                                    <input type=\"date\"  pattern=\"^\\d{2}-\\d{2}-\\d{4}$\" name=\"datec_Fecha\" id=\"fecha\" class=\"form-control\" value=\"\" maxlength=\"10\" placeholder=\"dd-MM-yyy\" required/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"archivo\">Seleccionar documento:</label>\n");
      out.write("                                    <input type=\"file\" class=\"btn\" id=\"archivo\" name=\"btn_Ruta\" value=\"\" required>\n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"right2\">\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"nombre\">Nombre:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"txt_Nombre\" placeholder=\"Nombre\" required>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"tipo\">Tipo:</label>\n");
      out.write("                                    <select id=\"lista\" class=\"form-control\" name=\"jcb_Tipo\" required>\n");
      out.write("\n");
      out.write("                                        <option>PDF</option>\n");
      out.write("                                        <option>WORD</option>\n");
      out.write("                                        <option>EXCEL</option>\n");
      out.write("                                        <option>IMAGEN</option>\n");
      out.write("                                        <option>PPTX</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"version\">Versión:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"version\" name=\"txt_Version\" placeholder=\"Versión\" required>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                             ");
      out.write("\n");
      out.write("                            <div class=\"right3\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputState\">Auditoria:</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    
                                    Statement st2 = null;
                                    ResultSet rs2 = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st2 = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql2 = "Select id_auditoria, titulo from ejecucion_auditoria";
                                    rs2 = st2.executeQuery(sql2);


                                
      out.write(" \n");
      out.write("                               \n");
      out.write("                                <select id=\"inputState\" class=\"form-control\" name=\"jcb_Auditoria\">\n");
      out.write("                                    <option/>Seleccione una auditoria</option>\n");
      out.write("                                \n");
      out.write("                                    ");
                                   
                                        while (rs.next()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("id_auditoria"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("titulo"));
      out.write("</option>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"categoria\">Categoria:</label>\n");
      out.write("                                    <select id=\"lista\" class=\"form-control\" name=\"jcb_Categoria\" required>\n");
      out.write("\n");
      out.write("                                        <option>Contrato</option>\n");
      out.write("                                        <option>Cartas</option>\n");
      out.write("                                        <option>Actas</option>\n");
      out.write("                                        <option>Manuales</option>\n");
      out.write("                                        <option>Notas</option>\n");
      out.write("                                        <option>Acuerdos</option>\n");
      out.write("                                        <option>Reportes</option>\n");
      out.write("                                        <option>Registros</option>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <label for=\"detalle\">Detalle:</label>\n");
      out.write("                                    <textarea  class=\"form-control\" id=\"detalle\" rows=\"3\" cols=\"\" name=\"txta_Detalle\" placeholder=\"Escribe aqui de que trata el documento...\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"boton\">\n");
      out.write("                        <button type=\"submit\" name=\"guardar\" class=\"btn btn-primary\">Guardar <i class=\"bi bi-file-earmark-medical-fill\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>      \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
