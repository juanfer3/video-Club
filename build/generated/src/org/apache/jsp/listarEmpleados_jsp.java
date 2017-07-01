package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BaseDeDatos.Empleados;
import java.util.ArrayList;
import BaseDeDatos.DBEmpleados;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory.Result;

public final class listarEmpleados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/header.jsp");
    _jspx_dependants.add("/jsp/tablaEmpleados.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/diseno.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"img\">\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">\n");
      out.write("        <script></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 HttpSession sesion=  request.getSession();

    if(sesion.getAttribute("rol")==null){

      out.write("\n");
      out.write("<header class=\"cabecera\">\n");
      out.write("    <a href=\"#\"> <span class=\"icon-menu\" id=\"boton\"></span> </a>\n");
      out.write("        </header>\n");
      out.write("<div class=\"container titulo\">\n");
      out.write("        <h1>Inside Prestamos de peliculas</h1>\n");
      out.write("        </div>\n");
      out.write("<div class=\"entrar\">\n");
      out.write("    <a href=\"#\" id=\"login\"><span class=\"icon-hombre\"></span> </a>\n");
      out.write("</div>\n");
      out.write("<hr class=\"raya\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"menu\" id=\"menu\">\n");
      out.write("    <h5>bienvenido nulo</h5>\n");
      out.write("        <hr>\n");
      out.write("    <ul class=\"lista\">\n");
      out.write("        \n");
      out.write("        <li class=\"menu-item\"><a href=\"RegistrarEmpleado.jsp\">\n");
      out.write("            Empleados</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"RegistrarPelicula.jsp\">\n");
      out.write("            Peliculas</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Insertar</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</header>\n");
      out.write("    \n");
}else if(sesion.getAttribute("rol").equals("adm")){
      out.write("\n");
      out.write("<header class=\"cabecera\">\n");
      out.write("    <a href=\"#\"> <span class=\"icon-menu\" id=\"boton\"></span> </a>\n");
      out.write("        </header>\n");
      out.write("<div class=\"container titulo\">\n");
      out.write("        <h1>Inside Prestamos de peliculas</h1>\n");
      out.write("        </div>\n");
      out.write("<div class=\"entrar\">\n");
      out.write("    <a href=\"#\" id=\"login\"><span class=\"icon-sign-in\"></span> </a>\n");
      out.write("</div>\n");
      out.write("<hr class=\"raya\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"menu\" id=\"menu\">\n");
      out.write("    <h5>bienvenido adm</h5>\n");
      out.write("        <hr>\n");
      out.write("    <ul class=\"lista\">\n");
      out.write("        \n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Buscar</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Mi Perfil</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Insertar</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</header>\n");
}else if(sesion.getAttribute("rol").equals("Vendedora")){
      out.write("\n");
      out.write("<header class=\"cabecera\">\n");
      out.write("    <a href=\"#\"> <span class=\"icon-menu\" id=\"boton\"></span> </a>\n");
      out.write("        </header>\n");
      out.write("<div class=\"container titulo\">\n");
      out.write("        <h1>Inside Prestamos de peliculas</h1>\n");
      out.write("        </div>\n");
      out.write("<div class=\"entrar\">\n");
      out.write("    <a href=\"#\" id=\"login\"><span class=\"icon-sign-in\"></span> </a>\n");
      out.write("</div>\n");
      out.write("<hr class=\"raya\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"menu\" id=\"menu\">\n");
      out.write("    <h5>bienvenida Vendedora</h5>\n");
      out.write("        <hr>\n");
      out.write("    <ul class=\"lista\">\n");
      out.write("        \n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Buscar</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Mi Perfil</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu-item\"><a href=\"#\">\n");
      out.write("            Insertar</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</header>\n");
}
      out.write("\n");
      out.write("         <div class=\"container tabla\">\n");
      out.write("         \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--div class=\"tabla\">\n");
      out.write("    <form action=\"EliminarEmpleado\">\n");
      out.write("        <table class=\"\" border=\"1\">\n");
      out.write("            <thead><th>ID</th><th>USUARIO</th><th>CONTRASENA</th><th>ROL</th><th>NOMBRE</th><th>CEDULA</th><th>EDITAR</th><th>ELIMINAR</th><th>VER DETALLE</th></thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td></label></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("\n");
      out.write("                    <td><a href=\"#\"<button class=\"icon-pencil\" type=\"submit\" value=\"editar\" name=\"botones\"></button></a></td>\n");
      out.write("                    <td><a href=\"#\"><span class=\"icon-heart\"></span></a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("            </tbody>\n");
      out.write("            <tfoot><tr><td colspan=\"9\" style=\"text-align: center\">Inside Prestamo De Peliculas</td></tr></tfoot>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("            \n");
      out.write("</div-->\n");
      out.write("<div class=\"listaEmpleados\">\n");
      out.write("    <h1>RWD List to Table</h1>\n");
      out.write("        <table class=\"rwd-table col-md-12 col-md-offset-6\"  border=\"1\" >\n");
      out.write("        <tr>\n");
      out.write("            <th>Movie Title</th>\n");
      out.write("            <th>Genre</th>\n");
      out.write("            <th>Year</th>\n");
      out.write("            <th>Gross</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td data-th=\"Movie Title\">Star Wars</td>\n");
      out.write("            <td data-th=\"Genre\">Adventure, Sci-fi</td>\n");
      out.write("            <td data-th=\"Year\">1977</td>\n");
      out.write("            <td data-th=\"Gross\">$460,935,665</td>\n");
      out.write("        </tr>\n");
      out.write("        <tbody>\n");
      out.write("            ");
DBEmpleados emp = new DBEmpleados();
                    ArrayList<Empleados> Listar = new ArrayList();
                    Listar.clear();
                    Listar=emp.ListarEmpleados();
                
      out.write("\n");
      out.write("                ");
for (Empleados rs : Listar) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td data-th=\"Movie Title\">");
      out.print(rs.getId());
      out.write("</td>\n");
      out.write("            <td data-th=\"Genre\">");
      out.print(rs.getNombre());
      out.write("</td>\n");
      out.write("            <td data-th=\"Year\">");
      out.print(rs.getCedula());
      out.write("</td>\n");
      out.write("            <td data-th=\"Gross\">");
      out.print(rs.getUsuarioId().getUsuario());
      out.write("</td>\n");
      out.write("            <td data-th=\"Year\">");
      out.print(rs.getUsuarioId().getRol());
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("         ");
}
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td data-th=\"Movie Title\">American Graffiti</td>\n");
      out.write("            <td data-th=\"Genre\">Comedy, Drama</td>\n");
      out.write("            <td data-th=\"Year\">1973</td>\n");
      out.write("            <td data-th=\"Gross\">$115,000,000</td>\n");
      out.write("        </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <p>&larr; Drag window (in editor or full page view) to see the effect. &rarr;</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"textofooter\">\n");
      out.write("        <a href=\"#\" id=\"inside\"><h1>Inside</h1></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"posicionIconos\">\n");
      out.write("        <a href=\"#\"><span class=\"icon-facebook iconosFooter\"></span> </a>\n");
      out.write("        <a href=\"#\"><span class=\"icon-google-plus iconosFooter\"></span> </a>\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/ft.js\"></script>\n");
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
