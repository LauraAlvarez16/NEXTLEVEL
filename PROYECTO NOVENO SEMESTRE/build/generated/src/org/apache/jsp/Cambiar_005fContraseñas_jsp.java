package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Cambiar_005fContraseñas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"Css/Cambiar_Contra_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form  action=\"Cambiar_Contraseñas.jsp\"  method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"contenedor-textos\">\n");
      out.write("\n");
      out.write("                <h1>CAMBIO DE CONTRASEÑA</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"grupo\">\n");
      out.write("                    <input type=\"password\" name=\"txt_Contra1\" id=\"claveActual\" class=\"password1\" required><span class=\"barra\"></span>\n");
      out.write("                    <label for=\"\">Contraseña</label>\n");
      out.write("                    <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nivelSeguridad\">\n");
      out.write("                    <span id=\"nivelseguridad\">bajo</span>\n");
      out.write("                    <div class=\"nivelesColores\">\n");
      out.write("                        <div class=\"spanNivelesColores\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"NivelesColores\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"grupo\">\n");
      out.write("                    <input type=\"password\" class=\"password2\" name=\"txt_Contra2\" required/><span class=\"barra\"></span>\n");
      out.write("                    <label for=\"\">Repita su contraseña</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"grupo\">\n");
      out.write("                <button type=\"submit\" name=\"accion\">Guardar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
