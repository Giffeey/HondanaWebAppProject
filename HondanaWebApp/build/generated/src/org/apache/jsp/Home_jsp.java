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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("            <style>\r\n");
      out.write("                .slide-contaner {\r\n");
      out.write("                    height: 570px;\r\n");
      out.write("                    background-size: cover;\r\n");
      out.write("                    background-repeat: no-repeat;\r\n");
      out.write("                    background-position: center center;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                .p-b-50 {\r\n");
      out.write("                    padding-bottom: 50px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .col, .col-1, .col-10, .col-11, .col-12, .col-2, .col-3, .col-4, .col-5, .col-6, .col-7, .col-8, .col-9, .col-auto, .col-lg, .col-lg-1, .col-lg-10, .col-lg-11, .col-lg-12, .col-lg-2, .col-lg-3, .col-lg-4, .col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-auto, .col-md, .col-md-1, .col-md-10, .col-md-11, .col-md-12, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-auto, .col-sm, .col-sm-1, .col-sm-10, .col-sm-11, .col-sm-12, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6, .col-sm-7, .col-sm-8, .col-sm-9, .col-sm-auto, .col-xl, .col-xl-1, .col-xl-10, .col-xl-11, .col-xl-12, .col-xl-2, .col-xl-3, .col-xl-4, .col-xl-5, .col-xl-6, .col-xl-7, .col-xl-8, .col-xl-9, .col-xl-auto {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                    min-height: 1px;\r\n");
      out.write("                    padding-right: 15px;\r\n");
      out.write("                    padding-left: 15px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            </style>\r\n");
      out.write("            <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                swal(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", \"successful!\", \"success\");\r\n");
      out.write("            </script>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"slide-contaner\" style=\"background-image: url(img/book.png);\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"product-row\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
          out.write("                <div class=\"col-sm-12 col-md-6 col-lg-4 p-b-50\">\r\n");
          out.write("                    <!-- Block2 -->\r\n");
          out.write("\r\n");
          out.write("                    <div class=\"block2\">\r\n");
          out.write("                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
          out.write("                            <img src=\"img/book/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 200px; height: 270px;\">\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"block2-overlay trans-0-4\">\r\n");
          out.write("                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
          out.write("                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"block2-txt p-t-20\">\r\n");
          out.write("                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                            </a>\r\n");
          out.write("                            <br>\r\n");
          out.write("                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" บาท\r\n");
          out.write("                            </span>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
          out.write("                            <!-- Button -->\r\n");
          out.write("                            <form action=\"AddItemToCart\" method=\"post\">\r\n");
          out.write("                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"isbn\" />\r\n");
          out.write("                                <button type=\"submit\" class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
          out.write("                                    เพิ่มลงตะกร้า\r\n");
          out.write("                                </button>\r\n");
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
