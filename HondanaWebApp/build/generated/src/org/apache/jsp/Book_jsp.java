package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            .btn.btn-primary{\r\n");
      out.write("                background: #FC9C72 none repeat scroll 0 0;\r\n");
      out.write("                border-color: #FC9C72;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                width: 80px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                line-height: 50px;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                border-radius: 25px;\r\n");
      out.write("            }\r\n");
      out.write("            .btn-primary {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                background-color: #FE9061;\r\n");
      out.write("                border-color: #FE9061;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <!-- Product Detail -->\r\n");
      out.write("            <div class=\"container bgwhite p-t-35 p-b-80\">\r\n");
      out.write("                <div class=\"flex-w flex-sb\">\r\n");
      out.write("                    <div class=\"w-size13 p-t-30 respon5\">\r\n");
      out.write("                        <div class=\"wrap-slick3 flex-sb flex-w\">\r\n");
      out.write("                            <div class=\"wrap-slick3-dots\"></div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"slick3\">                          \r\n");
      out.write("                                <div class=\"item-slick3\" data-thumb=\"images/thumb-item-02.jpg\">\r\n");
      out.write("                                    <div class=\"wrap-pic-w\">\r\n");
      out.write("                                        <img src=\"img/book/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg\" alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 300px; height: 390px;\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\t\t\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"w-size14 p-t-30 respon5\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                        <p class=\"card-text\">ผู้แต่ง: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        <p class=\"card-text\">สำนักพิมพ์: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        <p class=\"card-text\">ราคา: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ฿</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"p-t-33 p-b-60\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"flex-r-m flex-w p-t-10\">\r\n");
      out.write("                            <div class=\"w-size16 flex-m flex-w\">\r\n");
      out.write("                                <div class=\"flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10\">\r\n");
      out.write("                                    <div class=\"flex-w bo5 of-hidden w-size17\">\r\n");
      out.write("                                        <form action=\"ShowCart\" method=\"post\"><input type=\"hidden\" name=\"decrease\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\r\n");
      out.write("                                                <i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                            </button></form>\r\n");
      out.write("\r\n");
      out.write("                                        <input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                        <form action=\"ShowCart\" method=\"post\"><input type=\"hidden\" name=\"increase\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\r\n");
      out.write("                                                <i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                            </button></form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <div class=\"btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10\">\r\n");
      out.write("                                    <!-- Button -->\r\n");
      out.write("                                    <form action=\"AddItemToCart\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"isbn\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookItem.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        <button class=\"btn btn-primary\"type=\"submit\" >Add to Cart</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--  -->\r\n");
      out.write("                    <!--                    <div class=\"wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content\">\r\n");
      out.write("                                            <h5 class=\"js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4\">\r\n");
      out.write("                                                Description\r\n");
      out.write("                                            </h5>\r\n");
      out.write("                                            <div class=\"dropdown-content dis-none p-t-15 p-b-23\">\r\n");
      out.write("                                                <p class=\"s-text8\">\r\n");
      out.write("                                                    detail\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
