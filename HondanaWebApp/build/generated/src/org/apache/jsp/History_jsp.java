package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class History_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            table {\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                background-color: #f2f2f2;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            th, td {\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("            }\r\n");
      out.write("            /*table{background-color: #f2f2f2;}*/\r\n");
      out.write("        </style>\r\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("            <br>\r\n");
      out.write("            <h1 style=\"font-family: 'Quark-Bold'\">ประวัติการสั่งซื้อ</h1>\r\n");
      out.write("        \r\n");
      out.write("        <table class=\"table table-bordered\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">OrderNo</th>\r\n");
      out.write("                    <th scope=\"col\">Date</th>\r\n");
      out.write("                    <th scope=\"col\">numbook</th>\r\n");
      out.write("                    <th scope=\"col\">Price</th>\r\n");
      out.write("                    <th scope=\"col\">Status</th>\r\n");
      out.write("                    <th scope=\"col\">Detail</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"></th>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <th scope=\"row\"></th>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                   <th scope=\"row\"></th>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("</html>\r\n");
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
