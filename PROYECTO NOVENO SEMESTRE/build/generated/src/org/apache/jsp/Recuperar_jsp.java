package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Auditor;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Recuperar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Recuperacion</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Recuperar_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/8e68de781a.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"Imagen/Logo1.png\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function ventanaSecundaria(URL) {\n");
      out.write("                ventana = window.open(URL, \"ventana1\", \"width=550,height=300,left=400px,scrollbars=NO\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form  action=\"Recuperar.jsp\"  method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"contenedor-textos\">\n");
      out.write("\n");
      out.write("                <h1>RECUPERACION DE CONTRASEÑA</h1>\n");
      out.write("\n");
      out.write("                <div class=\"grupo\">\n");
      out.write("                    <input type=\"text\" name=\"txt_User\" id=\"name\" required><span class=\"barra\"></span>\n");
      out.write("                    <label for=\"\">Usuario</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"grupo\">\n");
      out.write("\n");
      out.write("                    <input type=\"email\" id=\"exampleInputEmail1\" name=\"txt_Correo\" aria-describedby=\"emailHelp\" required><span class=\"barra\"></span>\n");
      out.write("                    <label for=\"exampleInputEmail1\">Correo</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    String nick;
                    if (request.getParameter("accion") != null) {

                        nick = request.getParameter("txt_User");
                        String boton = request.getParameter("accion");
                        
                        boolean exite = false;
                        Connection con = null;
                        Statement st = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                        st = con.createStatement();
                        System.out.println("Conexion establecida");
                        String sql = "SELECT * FROM auditor where nick = '" + nick + "'";
                        rs = st.executeQuery(sql);
                        if (rs.next()) {
                            if (rs.getRow() > 0) {

                                exite = true;

                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                    Usuario encontrado en el sistema, diríjase a su correo e ingrese el codigo en este <a href=\"javascript:ventanaSecundaria('http://localhost:8080/ProyectoIntegrador9Linea/Codigo_Correo.jsp')\" class=\"alert-link\">link</a>.\n");
      out.write("                </div>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Verificacion", out, false);
      out.write(" \n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("                ");
                    }
                } else {
                
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"alert alert-danger\" role=\"alert\">El usuario no se encuentra registrado en el sistema</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                        }
                    }


                
      out.write("\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"\" >Enviar</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
