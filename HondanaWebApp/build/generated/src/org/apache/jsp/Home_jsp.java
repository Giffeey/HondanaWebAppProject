package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>HONDANA | HOME</title>\r\n");
      out.write("        <link href=\"css/csshome.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti\" rel=\"stylesheet\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>          \r\n");
      out.write("            <div class=\"slide-contaner\" style=\"background-image: url(img/test2.jpg)\">\r\n");
      out.write("                <a href=\"AllBook\">\r\n");
      out.write("                    <button class=\"button button1\">SHOP NOW</button>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"slide-contaner\" style=\"background-image: url(img/test3.jpg)\">\r\n");
      out.write("                <a href=\"AllBook\">\r\n");
      out.write("                    <button class=\"button button2\">SHOP NOW</button>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"slide-contaner\" style=\"background-image: url(img/test.jpg)\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"text-align:center\">\r\n");
      out.write("                <span class=\"dot\"></span> \r\n");
      out.write("                <span class=\"dot\"></span> \r\n");
      out.write("                <span class=\"dot\"></span> \r\n");
      out.write("            </div>\r\n");
      out.write("            <script>\r\n");
      out.write("                var slideIndex = 0;\r\n");
      out.write("                showSlides();\r\n");
      out.write("\r\n");
      out.write("                function showSlides() {\r\n");
      out.write("                    var i;\r\n");
      out.write("                    var slides = document.getElementsByClassName(\"slide-contaner\");\r\n");
      out.write("                    var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("                    for (i = 0; i < slides.length; i++) {\r\n");
      out.write("                        slides[i].style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                    slideIndex++;\r\n");
      out.write("                    if (slideIndex > slides.length) {\r\n");
      out.write("                        slideIndex = 1\r\n");
      out.write("                    }\r\n");
      out.write("                    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("                        dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("                    }\r\n");
      out.write("                    slides[slideIndex - 1].style.display = \"block\";\r\n");
      out.write("                    dots[slideIndex - 1].className += \" active\";\r\n");
      out.write("                    setTimeout(showSlides, 5000); // Change image every 2 seconds\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-deck\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--        </section>-->\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showBook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <div class=\"col-3\">\r\n");
          out.write("                    <div class=\"card\">\r\n");
          out.write("\r\n");
          out.write(" \r\n");
          out.write("                        <div class=\"card-img-top\">\r\n");
          out.write("                            <center><form action=\"ShowBookDetail\" method=\"post\">\r\n");
          out.write("                                    <input type=\"hidden\" name=\"isbn\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <input type=\"image\" value=\"submit\" name=\"imgbook\" src=\"img/book/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 200px; height: 290px;\">\r\n");
          out.write("\r\n");
          out.write("                                </form></center>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"card-body\">\r\n");
          out.write("                            <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                            <p class=\"card-text\">ผู้แต่ง: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                            <p class=\"card-text\">ราคา: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" บาท</p>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"card-footer\">\r\n");
          out.write("                            <form action=\"AddItemToCart\" method=\"post\">\r\n");
          out.write("                                <input type=\"hidden\" name=\"isbn\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Add to Cart</button>\r\n");
          out.write("                            </form>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
