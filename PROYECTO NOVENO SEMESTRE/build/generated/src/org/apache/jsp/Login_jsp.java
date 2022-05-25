package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Modelo.Encriptar;
import com.mysql.jdbc.Driver;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Login_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" integrity=\"sha256-h20CPZ0QyXlBuAw7A+KluUYx/3pK+c7lYEpqLTlxjYQ=\" crossorigin=\"anonymous\" />\n");
      out.write("        <script>src = \"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\"</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.addEventListener(\"load\", function () {\n");
      out.write("\n");
      out.write("                // icono para mostrar contraseña\n");
      out.write("                showPassword = document.querySelector('.show-password');\n");
      out.write("                showPassword.addEventListener('click', () => {\n");
      out.write("\n");
      out.write("                    // elementos input de tipo clave\n");
      out.write("                    password1 = document.querySelector('.password1');\n");
      out.write("                    password2 = document.querySelector('.password2');\n");
      out.write("\n");
      out.write("                    if (password1.type === \"text\") {\n");
      out.write("                        password1.type = \"password\"\n");
      out.write("                        password2.type = \"password\"\n");
      out.write("                        showPassword.classList.remove('fa-eye-slash');\n");
      out.write("                    } else {\n");
      out.write("                        password1.type = \"text\"\n");
      out.write("                        password2.type = \"text\"\n");
      out.write("                        showPassword.classList.toggle(\"fa-eye-slash\");\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                })\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <main class=\"contenedor\" >\n");
      out.write("\n");
      out.write("            <div class=\"contenedor-imagen\">\n");
      out.write("                <img src=\"Imagen/Logo NL 1 1.svg\" alt=\"\" class=\"img\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"Auditor_Roles?accion=verificar\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <div class=\"contenedor-textos\">\n");
      out.write("\n");
      out.write("                    <h1>INICIO DE SESIÓN</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"grupo\">\n");
      out.write("                        <input type=\"text\" name=\"txt_User\" id=\"txt_User\" required><span class=\"barra\"></span>\n");
      out.write("                        <label for=\"\">Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grupo\">\n");
      out.write("                        <input type=\"password\" name=\"txt_Pass\" id=\"txt_Pass\" class=\"password1\" required><span class=\"barra\"></span>\n");
      out.write("                        <label for=\"\">Contraseña</label>\n");
      out.write("                        <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                      \n");
      out.write("\n");
      out.write("                    ");

                        Connection con = null;
                        Statement st = null;
                        ResultSet rs = null;
                        Encriptar enc = new Encriptar();
                        if (request.getParameter("verificar") != null) {
                            String user = request.getParameter("txt_User");
                            String pass = request.getParameter("txt_Pass");
                            HttpSession sesion = request.getSession();

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                                st = con.createStatement();
                                rs = st.executeQuery("Select * from auditor where nick='" + user + "' and contraseña='" + enc.getMD5(pass) + "' ;");
                                while (rs.next()) {
                                    sesion.setAttribute("logueado", "1");
                                    sesion.setAttribute("user", rs.getString("nick"));
                                    sesion.setAttribute("id", rs.getString("id_auditor"));
                                }
                    
      out.write("\n");
      out.write("                   \n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"alert alert-danger\" role=\"alert\"> Usuario y/o contraseña incorrectos</div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");

                            } catch (Exception e) {
                            
                                out.print(e);

                            }
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" name=\"verificar\" value=\"Verificar\" >Ingresar</button>\n");
      out.write("                   \n");
      out.write("                    <nav>\n");
      out.write("                        <a href=\"Recuperar.jsp\">Has olvidado tu contraseña...</a>\n");
      out.write("                    </nav>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
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
