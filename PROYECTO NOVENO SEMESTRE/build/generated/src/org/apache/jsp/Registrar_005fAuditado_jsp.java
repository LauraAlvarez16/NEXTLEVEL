package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class Registrar_005fAuditado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Auditados</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"Css/Ingresar_Auditado_Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"contact-box\">\n");
      out.write("\n");
      out.write("                <div class=\"titulo\">\n");
      out.write("                    <h2><b>REGISTRAR AUDITADOS</b></h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <form action=\"Registrar_Auditado.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"informacion\">\n");
      out.write("\n");
      out.write("                        <div class=\"left\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <img src=\"Imagen/Ingresar_Auditados.png\" alt=\"\" class=\"img\"/>\n");
      out.write("\n");
      out.write("                            <div class=\"form-check form-switch\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" id=\"flexSwitchCheckDefault\" required>\n");
      out.write("                                <label class=\"form-check-label\" for=\"flexSwitchCheckDefault\">Los datos personales del usuario seran tratados de acuerdo a las <a href=\"\">políticas</a> 1581 de 2012 y 1377 de 2013* </label> \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("                            ");


                                if (request.getParameter("enviar") != null) {
                                    String nom_usu = request.getParameter("txt_Nombre");
                                    String ape_usu = request.getParameter("txt_Apellido");
                                    String cif_niif = request.getParameter("txt_Cif");
                                    String correo_usu = request.getParameter("txt_Correo");
                                    String tel_usu = request.getParameter("txt_Telefono");
                                    String area = request.getParameter("jcb_Area");
                                    String cargo_usu = request.getParameter("txt_Cargo");

                                    boolean exite = false;
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql = "SELECT * FROM usuario  where cif_niif = '" + cif_niif + "'";
                                    rs = st.executeQuery(sql);
                                    if (rs.next()) {
                                        if (rs.getRow() > 0) {
                                            exite = true;
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"alert alert-danger\" role=\"alert\"><b>El usuario ya existe en el sistema</b></div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                        }
                                    } else {

                                        try {

                                            Class.forName("com.mysql.jdbc.Driver");
                                            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                            st = con.createStatement();
                                            st.executeUpdate("INSERT INTO usuario(nombre_usuario,apellido_usuario,cif_niif,correo_usuario,telefono_usuario,id_area,cargo_usuario) VALUES('" + nom_usu + "','" + ape_usu + "','" + cif_niif + "','" + correo_usu + "','" + tel_usu + "','" + area + "','" + cargo_usu + "');");
                                            request.getRequestDispatcher("Crud_Auditados.jsp").forward(request, response);
                                        } catch (Exception e) {
                                            out.print(e);
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
      out.write("                                <label for=\"cif_niif\">Cif_Niif:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cif_niif\" name=\"txt_Cif\" placeholder=\"Cif_Niif\" pattern=\"[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]\" title=\"Por favor ingresar el formato requerido\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"telefono\">Telefono:</label>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" id=\"telefono\" name=\"txt_Telefono\" placeholder=\"Telefono\" pattern=\"[0-9]{7,10}\" title=\"Por favor ingresar solo Números\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"cargo\">Cargo:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cargo\" name=\"txt_Cargo\" placeholder=\"Cargo\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
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
      out.write("                                <label for=\"exampleInputEmail1\">Correo:</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"txt_Correo\" aria-describedby=\"emailHelp\" placeholder=\"email@example.com\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
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
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"boton\">\n");
      out.write("                        <button type=\"submit\" name=\"enviar\" class=\"btn btn-primary\">Guardar <i class=\"bi bi-person-plus\"></i></button>\n");
      out.write("                    </div>\n");
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
