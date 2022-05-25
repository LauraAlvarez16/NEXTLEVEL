package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Encriptar;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Registro_005fAuditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro Auditor</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Registro_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\"href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" integrity=\"sha256-h20CPZ0QyXlBuAw7A+KluUYx/3pK+c7lYEpqLTlxjYQ=\" crossorigin=\"anonymous\" />\n");
      out.write("        <script>src = \"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\"</script>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                var pruebas = $(\".pruebas\"),\n");
      out.write("                        nivelesColores = $(\"#nivelesColores\"),\n");
      out.write("                        inputs = $(\"input\"),\n");
      out.write("                        inputClaveActual = $(\"#claveActual\"),\n");
      out.write("                        inputRepetirClaveActual = $(\"#repetirClaveActual\"),\n");
      out.write("                        fieldset = $(\"fieldset\"),\n");
      out.write("                        nivel;\n");
      out.write("\n");
      out.write("                function devuelveNivel(esteInput, evento) {\n");
      out.write("                    var nivelBajo = 8,\n");
      out.write("                            nivelMedio = 12,\n");
      out.write("                            nivelAlto = 16,\n");
      out.write("                            numCaracteres = esteInput.val().length,\n");
      out.write("                            estaId = esteInput.attr(\"id\"),\n");
      out.write("                            espanNivelesColores = $(\".spanNivelesColores\");\n");
      out.write("                    evento.stopPropagation();\n");
      out.write("                    limpiarError();\n");
      out.write("                    if (estaId === \"claveActual\") {\n");
      out.write("                        if (numCaracteres > 0 && numCaracteres < nivelBajo) {\n");
      out.write("                            nivel = \"bajo\";\n");
      out.write("                            espanNivelesColores.removeClass().addClass(\"spanNivelesColores bajo\");\n");
      out.write("                        } else if (numCaracteres >= nivelBajo && numCaracteres < nivelMedio) {\n");
      out.write("                            nivel = \"medio\";\n");
      out.write("                            espanNivelesColores.removeClass().addClass(\"spanNivelesColores medio\");\n");
      out.write("                        } else if (numCaracteres >= nivelMedio && numCaracteres < nivelAlto) {\n");
      out.write("                            nivel = \"alto\";\n");
      out.write("                            espanNivelesColores.removeClass().addClass(\"spanNivelesColores alto\");\n");
      out.write("                        } else if (numCaracteres >= nivelAlto) {\n");
      out.write("                            nivel = \"muy alto\";\n");
      out.write("                            espanNivelesColores.removeClass().addClass(\"spanNivelesColores muyAlto\");\n");
      out.write("                        }\n");
      out.write("                        if (numCaracteres === 0) {\n");
      out.write("                            espanNivelesColores.removeClass().addClass(\"spanNivelesColores\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function comprobarClave(e) {\n");
      out.write("                    var divClaveCorrecta = $(\".clavecorrecta\"),\n");
      out.write("                            espanNivelesColores = $(\".spanNivelesColores\"),\n");
      out.write("                            nivelSeguridad = $(\"#nivelseguridad\");\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    e.stopPropagation();\n");
      out.write("                    if (inputClaveActual.val() === inputRepetirClaveActual.val()) {\n");
      out.write("                        divClaveCorrecta.removeClass(\"oculto\");\n");
      out.write("                        espanNivelesColores.removeClass().addClass(\"spanNivelesColores nulo\");\n");
      out.write("                        nivelSeguridad.html(\"\");\n");
      out.write("                        return true;\n");
      out.write("                    } else {\n");
      out.write("                        inputClaveActual.focus();\n");
      out.write("                        mostrarError();\n");
      out.write("                        inputs.val(\"\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                function mostrarError() {\n");
      out.write("                    var divError = $(\".error\"),\n");
      out.write("                            espanNivelesColores = $(\".spanNivelesColores\"),\n");
      out.write("                            nivelSeg = $(\"#nivelseguridad\");\n");
      out.write("                    divError.removeClass(\"oculto\", 600);\n");
      out.write("                    nivel = \"bajo\";\n");
      out.write("                    nivelSeg.html(nivel);\n");
      out.write("                    espanNivelesColores.removeClass().addClass(\"spanNivelesColores nulo\");\n");
      out.write("                }\n");
      out.write("                function limpiarError() {\n");
      out.write("                    var divError = $(\".error\");\n");
      out.write("                    if (!divError.hasClass(\"oculto\")) {\n");
      out.write("                        divError.addClass(\"oculto\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                $(document).on('keyup', 'input', function (e) {\n");
      out.write("                    var nivelSeg = $(\"#nivelseguridad\");\n");
      out.write("                    devuelveNivel($(this), e);\n");
      out.write("                    nivelSeg.html(nivel);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                inputs.focus(limpiarError);\n");
      out.write("            });\n");
      out.write("        </script> \n");
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
      out.write("        ");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function ventanaSecundaria(URL) {\n");
      out.write("                window.open(URL, \"ventana1\", \"width=120,height=300,scrollbars=NO\")\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"contact-box\">\n");
      out.write("\n");
      out.write("                <div class=\"titulo\">\n");
      out.write("                    <h2><b>REGISTRO AUDITOR</b></h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <form action=\"Registro_Auditor.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"informacion\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"left\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("                            <img src=\"Imagen/User Avatar_Isometric.svg\" alt=\"\" class=\"img\"/>\n");
      out.write("\n");
      out.write("                            <div class=\"form-check form-switch\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" id=\"flexSwitchCheckDefault\" required>\n");
      out.write("                                <label class=\"form-check-label\" for=\"flexSwitchCheckDefault\">He leído y acepto las <a href=\"javascript:ventanaSecundaria('https://drive.google.com/file/d/1VlpOpct6aFoP4V025gi6I5KIPw5x0g58/view?usp=sharing')\">políticas de privacidad</a>,terminos y condiciones* </label> \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"nivelSeguridad\">\n");
      out.write("                                <span id=\"nivelseguridad\">bajo</span>\n");
      out.write("                                <div class=\"nivelesColores\">\n");
      out.write("                                    <div class=\"spanNivelesColores\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"NivelesColores\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("                            ");


                                if (request.getParameter("enviar") != null) {
                                    String nom = request.getParameter("txt_Nombre");
                                    String ape = request.getParameter("txt_Apellido");
                                    String cedula = request.getParameter("txt_Cedula");
                                    String correo = request.getParameter("txt_Correo");
                                    String tel = request.getParameter("txt_Telefono");
                                    String cargo = request.getParameter("txt_Cargo");
                                    String sector = request.getParameter("txt_Sector");
                                    String nick = request.getParameter("txt_Usuario");
                                    String pass = request.getParameter("txt_Contra");
                                    String pass2 = request.getParameter("txt_Contra2");
                                    String nivel = request.getParameter("jcb_Nivel");

                                    boolean exite = false;
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql = "SELECT * FROM auditor  where nick = '" + nick + "'";
                                    rs = st.executeQuery(sql);
                                    if (rs.next()) {
                                        if (rs.getRow() > 0) {
                                            exite = true;
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"alert alert-danger\" role=\"alert\">El usuario ya existe en el sistema</div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            } else {
                                if (pass.equals(pass2)) {

                                    try {

                                        Encriptar enc = new Encriptar();
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st = con.createStatement();
                                        st.executeUpdate("INSERT INTO auditor(nombre_auditor,apellido_auditor,cedula_auditor,correo_auditor,telefono_auditor,cargo_auditor,sector_auditor,nick,contraseña,id_niveles) VALUES('" + nom + "','" + ape + "','" + cedula + "','" + correo + "','" + tel + "','" + cargo + "','" + sector + "','" + nick + "','" + enc.getMD5(pass) + "','" + nivel + "');");
                                        request.getRequestDispatcher("Crud_Auditor.jsp").forward(request, response);
                                    } catch (Exception e) {
                                        out.print(e);
                                    }

                                } else {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"alert alert-danger\" role=\"alert\"> Las contraseñas no coinciden.</div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                        }
                                    }
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <div class=\"right1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nombre\">Nombre:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"txt_Nombre\" placeholder=\"Nombre\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputEmail1\">Correo:</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"txt_Correo\" aria-describedby=\"emailHelp\" placeholder=\"email@example.com\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"sector\">Sector:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"sector\" name=\"txt_Sector\" placeholder=\"Sector\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Contraseña:</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control password1\" id=\"claveActual\" name=\"txt_Contra\" placeholder=\"Password\" pattern=\"[A-Za-z0-9._*-@#$%]{12,20}\" title=\"Para que la contraseña sea valida debe tener una longitud entre 12 y 20 caracteres, contener letras mayúsculas y minúsculas, un dígito, o los símbolos \" required/> \n");
      out.write("                                <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <div class=\"right2\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"apellido\">Apellido:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"apellido\" name=\"txt_Apellido\" placeholder=\"Apellido\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"telefono\">Telefono:</label>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" id=\"telefono\" name=\"txt_Telefono\" placeholder=\"Telefono\" pattern=\"[0-9]{7,10}\" title=\"Por favor ingresar solo Números\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputState\">Nivel</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    Connection con = null;
                                    Statement st = null;

                                    Statement st2 = null;
                                    ResultSet rse;
                                    ResultSet rss;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    st2 = con.createStatement();
                                    System.out.println("Conexion establecida");

                                    String sql = "SELECT id_niveles, nivel FROM niveles;";
                                    rse = st.executeQuery(sql);
                                    
                                
      out.write(" \n");
      out.write("\n");
      out.write("                                <select id=\"inputState\" class=\"form-control\" name=\"jcb_Nivel\">\n");
      out.write("\n");
      out.write("                                    ");
                                        
                                            while (rse.next()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option selected value=\"");
      out.print(rse.getInt("id_niveles"));
      out.write('"');
      out.write('>');
      out.print(rse.getString("nivel"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputPassword1\">Repita su contraseña:</label>\n");
      out.write("                                        <input type=\"password\" class=\"form-control password2\" name=\"txt_Contra2\" placeholder=\"Password\" required/> \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"right3\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"cedula\">Cedula:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"cedula\" name=\"txt_Cedula\" placeholder=\"Cedula\" pattern=\"[0-9]{8,12}\" title=\"Por favor ingresar solo Números\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"cargo\">Cargo:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"cargo\" name=\"txt_Cargo\" placeholder=\"Cargo\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"usuario\">Usuario:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"txt_Usuario\" placeholder=\"UserName\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"boton\">\n");
      out.write("                            <button type=\"submit\" name=\"enviar\" class=\"btn btn-primary\">Registrar <i class=\"bi bi-person-plus\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>      \n");
      out.write("        </div>\n");
      out.write("\n");
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
