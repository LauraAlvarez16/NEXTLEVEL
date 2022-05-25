package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Cuestionario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Prueba</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Cuestionario_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css\" integrity=\"sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"Image/jpg\" href=\"Imagen/Logo1.png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"imagen\">\n");
      out.write("                <img src=\"Imagen/Logo1.png\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <h2 class=\"text-center\" id=\"titulo\"><b>CUESTIONARIO</b></h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"Cuestionario.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"casillas\">\n");
      out.write("                ");

                    Connection con = null;
                    Statement st3 = null;
                    ResultSet rs3 = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                    st3 = con.createStatement();
                    System.out.println("Conexion establecida");
                    String sql3 = "SELECT id_pregunta, nom_pregunta FROM preguntas";
                    rs3 = st3.executeQuery(sql3);
                    while (rs3.next()) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"contenedor-textos\">\n");
      out.write("                    <div class=\"seccion\">\n");
      out.write("                        <div class=\"pregunta\">\n");
      out.write("\n");
      out.write("                            <h2><b>Pregunta ");
      out.print( rs3.getInt("id_pregunta"));
      out.write("</b></h2>\n");
      out.write("                            <label>");
      out.print( rs3.getString("nom_pregunta"));
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"respuesta\">\n");
      out.write("\n");
      out.write("                            ");

                                Statement st = null;
                                ResultSet rs = null;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                                st = con.createStatement();
                                System.out.println("Conexion establecida");
                                String sql = "Select id_respuesta, descri_respuesta from respuestas";
                                rs = st.executeQuery(sql);


                            
      out.write(" \n");
      out.write("\n");
      out.write("                            <select id=\"inputState\" class=\"form-control\" name=\"jcb_Respuestas\">\n");
      out.write("                                <option/>Seleccione una opcion</option>                \n");
      out.write("\n");
      out.write("                                ");
                        while (rs.next()) {
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(rs.getInt("id_respuesta"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("descri_respuesta"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"boton\">\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"Ingresar_Documentos.jsp\" >Ingresar</button>\n");
      out.write("            </div>\n");
      out.write("        </form>  \n");
      out.write("            \n");
      out.write("        ");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor-footer\">\n");
      out.write("                <h2 class=\"titulo-footer\">NEXT LEVEL</h2>\n");
      out.write("                <h2 class=\"subtitulo-footer\">Software de Gestión de Auditoria</h2>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
