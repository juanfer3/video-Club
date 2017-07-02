package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/header.jsp");
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
      out.write("\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/diseno.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"img\">\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/js/bootstrapValidator.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/func.js\"></script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <div class=\"container containerFormularioEmpleado\">\n");
      out.write("            <form  action=\"InsertarUsuario\"  class=\"col-md-12 col-md-offset-5\" id=\"FormularioRegistroEmpleado\" name=\"formulario\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"loginentradas  \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h1>Formulario de registro</h1>\n");
      out.write("                    <p>por favor diligencie todos los datos.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-12\">\n");
      out.write("                        <label class=\"control-label\">Usuario</label>                           \n");
      out.write("                        <input type=\"text\" name=\"usuario\" class=\"form-control\" id=\"usuario\" style=\"display: inline-block\">   \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-12 \" >\n");
      out.write("                        <label class=\" control-label\">Contraseña</label>\n");
      out.write("\n");
      out.write("                        <input type=\"password\" name=\"contrasena\" class=\"form-control\" id=\"contrasena\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-12\" >\n");
      out.write("                        <label class=\"  control-label\">rol</label>\n");
      out.write("                        <select  name=\"rol\" class=\"form-control\" id=\"rol\">\n");
      out.write("                            \n");
      out.write("                            <option value=\"Aministrador\">Administrador</option>\n");
      out.write("                            <option value=\"Recepcionista\">Recepcionista</option>\n");
      out.write("                            <option value=\"Cliente\">Recepcionista</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-12\">\n");
      out.write("                        <label class=\" control-label\">Nombre</label>\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"nombre\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group espacio col-md-12\">\n");
      out.write("                        <label class=\" control-label\">Cedula</label>\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"cedula\" class=\"form-control\" id=\"cedula\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"mensajes\"></div>\n");
      out.write("                    <div class=\"col-md-offset-7\">\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\"\n");
      out.write("                               value=\"ingresar\" id=\"aceptarUser\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
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
