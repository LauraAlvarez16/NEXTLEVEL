package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Plantillas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Plantilla</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Plantillas_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"contact-box\">\n");
      out.write("\n");
      out.write("                <div class=\"titulo\">\n");
      out.write("                    <h2><b>PLANTILLAS</b></h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"Plantillas.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        if (request.getParameter("siguiente") != null) {
                            String valor = request.getParameter("flexRadioDefault");
                            request.getRequestDispatcher(valor).forward(request, response);
                        }

                    
      out.write(" \n");
      out.write("\n");
      out.write("                    <div class=\"informacion\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\" >\n");
      out.write("                            <input class=\"form-check-input\" value=\"Cuestionario.jsp\" type=\"radio\" name=\"flexRadioDefault\" id=\"flexRadioDefault1\" required>\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDefault1\">\n");
      out.write("                                <b>Auditoria interna ISO 27001:2013</b>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"flexRadioDisabled\" id=\"flexRadioDisabled\" disabled>\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDisabled\">\n");
      out.write("                                <b> Auditoria interna ISO 9001:2008</b>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"flexRadioDisabled\" id=\"flexRadioDisabled\" disabled>\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexRadioDisabled\">\n");
      out.write("                                <b> Evaluación de competencia operativa </b>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"contenedor-general\">\n");
      out.write("\n");
      out.write("                        <div class=\"general\">\n");
      out.write("                            <h2><b>Datos de la auditoria</b></h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                            ");
                            if (request.getParameter("siguiente") != null) {
                                    //Datos generales
                                    String titulo = request.getParameter("txt_Titulo");
                                    String auditor = request.getParameter("jcb_Auditor");
                                    String fecha = request.getParameter("datec_Fecha");
                                    String auditado = request.getParameter("jcb_Usuario");

                                    Connection con = null;
                                    Statement st = null;

                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();

                                    System.out.println("Conexion establecida");
                                    System.out.println(titulo);
                                    System.out.println(auditor);
                                    System.out.println(auditado);
                                    System.out.println(fecha);

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st = con.createStatement();

                                        st.executeUpdate("INSERT INTO ejecucion_auditoria(titulo,id_auditor,fecha_auditoria,id_usuario) VALUES('" + titulo + "','" + auditor + "','" + fecha + "','" + auditado + "');");

                                        request.getRequestDispatcher("Ingresar_Documentos.jsp").forward(request, response);

                                    } catch (Exception e) {
                                        out.print(e);
                                    }
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"preguntas\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"titulo\">Titulo:</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"auditoria\" name=\"txt_Titulo\" placeholder=\"Titulo\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputState\">Auditor</label>\n");
      out.write("                                    ");
                                Connection con = null;
                                        Statement ste = null;
                                        ResultSet rse = null;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        ste = con.createStatement();
                                        System.out.println("Conexion establecida");
                                        String sql = "Select id_auditor, nombre_auditor, apellido_auditor from auditor";
                                        rse = ste.executeQuery(sql);


                                    
      out.write(" \n");
      out.write("\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"jcb_Auditor\">\n");
      out.write("                                        <option/>Seleccione el Auditor</option>\n");
      out.write("                                        ");
                        while (rse.next()) {
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(rse.getInt("id_auditor"));
      out.write("\"> ");
      out.print(rse.getString("nombre_auditor"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"fecha\" class=\"control-label col-xs-4\">Fecha:</label>                 \n");
      out.write("                                    <input type=\"date\"  pattern=\"^\\d{2}-\\d{2}-\\d{4}$\" name=\"datec_Fecha\" id=\"fecha\" class=\"form-control\" value=\"\" maxlength=\"10\" placeholder=\"dd-MM-yyy\" required/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputState\">Auditado</label>\n");
      out.write("                                    ");

                                        Statement st1 = null;
                                        ResultSet rs1 = null;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st1 = con.createStatement();
                                        System.out.println("Conexion establecida");
                                        String sql1 = "Select id_usuario, nombre_usuario,apellido_usuario from usuario";
                                        rs1 = st1.executeQuery(sql1);


                                    
      out.write(" \n");
      out.write("\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"jcb_Usuario\">\n");
      out.write("                                        <option/>Seleccione un Usuario</option>\n");
      out.write("\n");
      out.write("                                        ");
                                        while (rs1.next()) {
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(rs1.getInt("id_usuario"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("nombre_usuario"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"boton\">\n");
      out.write("                        <button type=\"submit\" name=\"siguiente\"  class=\"btn btn-primary\"><b>Continuar <i class=\"bi bi-person-plus\"></i></b></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
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
