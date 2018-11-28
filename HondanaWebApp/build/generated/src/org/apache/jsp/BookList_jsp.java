package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BookList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .btn.btn-primary{\r\n");
      out.write("                background: #FC9C72 none repeat scroll 0 0;\r\n");
      out.write("                border-color: #FC9C72;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                width: 100%;\r\n");
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
      out.write("\r\n");
      out.write("            .m-text14 {\r\n");
      out.write("                font-family: Montserrat-Black;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                color: #333333;\r\n");
      out.write("                line-height: 1.5;\r\n");
      out.write("            }\r\n");
      out.write("            .s-text13{\r\n");
      out.write("                font-family: Montserrat-Black;\r\n");
      out.write("                color: #333333;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .p-b-7 {\r\n");
      out.write("                padding-bottom: 7px;\r\n");
      out.write("            }\r\n");
      out.write("            .p-b-54 {\r\n");
      out.write("                padding-bottom: 54px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            ul, li {\r\n");
      out.write("                margin: 0px;\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            dl, ol, ul {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                margin-bottom: 1rem;\r\n");
      out.write("            }\r\n");
      out.write("            .p-t-4 {\r\n");
      out.write("                padding-top: 4px;\r\n");
      out.write("            }\r\n");
      out.write("            ul, menu, dir {\r\n");
      out.write("                display: block;\r\n");
      out.write("                list-style-type: disc;\r\n");
      out.write("                margin-block-start: 1em;\r\n");
      out.write("                margin-block-end: 1em;\r\n");
      out.write("                margin-inline-start: 0px;\r\n");
      out.write("                margin-inline-end: 0px;\r\n");
      out.write("                padding-inline-start: 40px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .card-deck{\r\n");
      out.write("                margin-top: 50px;\r\n");
      out.write("                margin-bottom: 150px;\r\n");
      out.write("                margin-right: 40px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .card{\r\n");
      out.write("                margin-top: 50px;\r\n");
      out.write("                margin-bottom: 50px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .card-img-top{\r\n");
      out.write("                padding-top: 15px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .col3{\r\n");
      out.write("                float: left;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <section class=\"bgwhite p-t-55 p-b-65\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                            <div class=\"leftbar p-r-20 p-r-0-sm\">\r\n");
      out.write("                                <!--  -->\r\n");
      out.write("                                <h4 class=\"m-text14 p-b-7\">\r\n");
      out.write("                                    Categories\r\n");
      out.write("                                </h4>\r\n");
      out.write("\r\n");
      out.write("                                <ul class=\"p-b-54\">\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <a href=\"AllBook\" class=\"s-text13 active1\">\r\n");
      out.write("                                            All\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"category\" value=\"novel\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                                นิยาย\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"category\" value=\"trannovel\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                                นิยายแปล\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"category\" value=\"manage\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                                บริหาร\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"category\" value=\"garden\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                                บ้านและสวน\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li class=\"p-t-4\">\r\n");
      out.write("                                        <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"category\" value=\"psychology\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                                จิตวิทยา\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <div class=\"card-deck\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <div class=\"col-3\">\r\n");
          out.write("                    <div class=\"card\" >\r\n");
          out.write("                        <center><div class=\"card-img-top\">\r\n");
          out.write("                        <form action=\"ShowBookDetail\" method=\"post\">\r\n");
          out.write("                            <input type=\"hidden\" name=\"isbn\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <input type=\"image\" value=\"submit\" name=\"imgbook\" src=\"img/book/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 200px; height: 290px;\">\r\n");
          out.write("\r\n");
          out.write("                        </form>\r\n");
          out.write("                            </div></center>\r\n");
          out.write("                        <div class=\"card-body\">\r\n");
          out.write("                            <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                            <p class=\"card-text\">ผู้แต่ง: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                            <p class=\"card-text\">สำนักพิมพ์: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
          out.write("                                <button class=\"btn btn-primary\"type=\"submit\" >Add to Cart</button>\r\n");
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
