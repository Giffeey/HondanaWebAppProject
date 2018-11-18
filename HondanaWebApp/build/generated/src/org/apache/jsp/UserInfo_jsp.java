package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            /*@import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);\r\n");
      out.write("            @import url(https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.3/css/mdb.min.css);*/\r\n");
      out.write("\r\n");
      out.write("            .hm-gradient {\r\n");
      out.write("                background-image: linear-gradient(to top, #f3e7e9 0%, #e3eeff 99%, #e3eeff 100%);\r\n");
      out.write("            }\r\n");
      out.write("            .darken-grey-text {\r\n");
      out.write("                color: #2E2E2E;\r\n");
      out.write("            }\r\n");
      out.write("            .danger-text {\r\n");
      out.write("                color: #ff3547; }\r\n");
      out.write("            .default-text {\r\n");
      out.write("                color: #2BBBAD; \r\n");
      out.write("            }\r\n");
      out.write("            .info-text {\r\n");
      out.write("                color: #33b5e5; \r\n");
      out.write("            }\r\n");
      out.write("            .form-white .md-form label {\r\n");
      out.write("                color: #fff; \r\n");
      out.write("            }\r\n");
      out.write("            .form-white input[type=text]:focus:not([readonly]) {\r\n");
      out.write("                border-bottom: 1px solid #fff;\r\n");
      out.write("                -webkit-box-shadow: 0 1px 0 0 #fff;\r\n");
      out.write("                box-shadow: 0 1px 0 0 #fff; \r\n");
      out.write("            }\r\n");
      out.write("            .form-white input[type=text]:focus:not([readonly]) + label {\r\n");
      out.write("                color: #fff; \r\n");
      out.write("            }\r\n");
      out.write("            .form-white input[type=password]:focus:not([readonly]) {\r\n");
      out.write("                border-bottom: 1px solid #fff;\r\n");
      out.write("                -webkit-box-shadow: 0 1px 0 0 #fff;\r\n");
      out.write("                box-shadow: 0 1px 0 0 #fff; \r\n");
      out.write("            }\r\n");
      out.write("            .sign-in{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .block{\r\n");
      out.write("                /*                color: #4D4845;*/\r\n");
      out.write("                color:rgba(255, 99, 71, 0.8);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .button{\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                margin: 4px 2px;\r\n");
      out.write("                padding: 12px 20px;\r\n");
      out.write("                border-radius: 12px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .button1 {\r\n");
      out.write("                background-color: white; \r\n");
      out.write("                color: #4D4845; \r\n");
      out.write("                border: 1px solid #4D4845;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .button1:hover {\r\n");
      out.write("                background-color: #FC9C72;\r\n");
      out.write("                color: #4D4845;\r\n");
      out.write("                border: 1px solid #FC9C72;\r\n");
      out.write("            }\r\n");
      out.write("        </style> \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"slide-contaner\" style=\"background-image: url(img/book.png);\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container \" style=\"width: 40rem\" name=\"block\" >\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                        <div class=\"col-12 p-5\" name=\"sign-in\" >\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <!--<h3 class=\"text-center default-text py-3\" style=\"color:#4D4845\"><i class=\"fa fa-lock\"></i> SIGN IN</h3>-->\r\n");
      out.write("                                    <div align=\"center\">\r\n");
      out.write("                                        <img src=\"img/user.png\" style=\"margin:auto; width:100px; height:100px;\" >\r\n");
      out.write("                                    </div><br>\r\n");
      out.write("                                    <!--Body-->\r\n");
      out.write("                                    <div class=\"md-form\">\r\n");
      out.write("                                        UserName : <br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"md-form\">\r\n");
      out.write("                                    First Name : <br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"md-form\">\r\n");
      out.write("                                    Last Name : <br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cutomer.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!--                                <div class=\"md-form\">\r\n");
      out.write("                                                                    \r\n");
      out.write("                                                                    <i class=\"fa fa-lock prefix grey-text\"></i>\r\n");
      out.write("                                \r\n");
      out.write("                                                                    <input type=\"password\" class=\"form-control mb-2 mr-sm-2\" id=\"psw\" name=\"password\" placeholder=\"Password\"><br>\r\n");
      out.write("                                                                </div>-->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"md-form\">\r\n");
      out.write("                                    Phone : <br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"md-form\">\r\n");
      out.write("                                    E-mail :<br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    Address :<br>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"text-center\" name=\"si>\r\n");
      out.write("                                     <form action=\"Register\" method=\"post\">\r\n");
      out.write("                                     <button class=\"button button1\">ประวัติการซื้อ</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("      ");
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
