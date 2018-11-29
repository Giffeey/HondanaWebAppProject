package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowItemInCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("            <link href=\"css/cartcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <section class=\"cart bgwhite p-t-70 p-b-100\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <!-- Cart item -->\r\n");
      out.write("                    <div class=\"container-table-cart pos-relative\">\r\n");
      out.write("                        <div class=\"wrap-table-shopping-cart bgwhite\">\r\n");
      out.write("                            <table class=\"table-shopping-cart\">\r\n");
      out.write("                                <tr class=\"table-head\">\r\n");
      out.write("                                    <th class=\"column-1\"></th>\r\n");
      out.write("                                    <th class=\"column-2\" >Product</th>\r\n");
      out.write("                                    <th class=\"column-3\">Price</th>\r\n");
      out.write("                                    <th class=\"column-4 p-l-70\">Quantity</th>\r\n");
      out.write("                                    <th class=\"column-5\">Total</th>\r\n");
      out.write("                                    <th class=\"column-6\">Remove Book</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Total -->\r\n");
      out.write("                <div class=\"bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm\">\r\n");
      out.write("                    <h5 class=\"m-text20 p-b-24\">\r\n");
      out.write("                        Cart Totals\r\n");
      out.write("                    </h5>\r\n");
      out.write("\r\n");
      out.write("                    <!--  -->\r\n");
      out.write("                    <div class=\"flex-w flex-sb-m p-b-12\">\r\n");
      out.write("                        <span class=\"s-text18 w-size19 w-full-sm\">\r\n");
      out.write("                            Subtotal:\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <span class=\"m-text21 w-size20 w-full-sm\">\r\n");
      out.write("                            ฿");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"flex-w flex-sb-m p-b-12\">\r\n");
      out.write("                        <span class=\"s-text18 w-size19 w-full-sm\">\r\n");
      out.write("                            Total Book:\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"m-text21 w-size20 w-full-sm\">\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div><br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"size15 trans-0-4\">\r\n");
      out.write("                        <!-- Button -->\r\n");
      out.write("                        <form action=\"CheckoutPage\" method=\"post\">\r\n");
      out.write("                            <button type=\"submit\" class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                Proceed to Checkout\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section> \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("   \r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.lineItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("line");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr class=\"table-row\">\r\n");
          out.write("                                    <td class=\"column-1 col-2\">\r\n");
          out.write("                                        <div class=\"cart-img-product b-rad-4 o-f-hidden\">\r\n");
          out.write("                                            <img src=\"img/book/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 150px; height: 200px;\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td class=\"column-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"column-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"column-4\">\r\n");
          out.write("                                        <div class=\"flex-w bo5 of-hidden w-size17\">\r\n");
          out.write("                                            <form action=\"ShowCart\" method=\"post\"><input type=\"hidden\" name=\"decrease\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <button type=\"submit\" class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\r\n");
          out.write("                                                    <i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                                </button></form>\r\n");
          out.write("\r\n");
          out.write("                                            <input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("                                            <form action=\"ShowCart\" method=\"post\"><input type=\"hidden\" name=\"increase\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <button type=\"submit\" class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\r\n");
          out.write("                                                    <i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                                </button></form>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    \r\n");
          out.write("                                    <td class=\"column-5\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"column-6\"><form action=\"ShowCart\" method=\"post\"><button type=\"submit\" class=\"btn-light\"><input type=\"hidden\" name=\"remove\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Remove Book</button></form></td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
