package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HistoryDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                .header-blue {\r\n");
      out.write("                    font-size: 25px;\r\n");
      out.write("                    color: #003a70;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .row {\r\n");
      out.write("                    margin-right: -10px;\r\n");
      out.write("                    margin-left: -10px;\r\n");
      out.write("                }\r\n");
      out.write("                /*                .row .col-md-6 .col-sm-12{\r\n");
      out.write("                                    margin-left:50%;\r\n");
      out.write("                                    margin-top: 25%;\r\n");
      out.write("                                }*/\r\n");
      out.write("            </style>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("                        <div class=\"header-blue\">รายละเอียดการสั่งซื้อเลขที่ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.orders.orderno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    <div>ส่งสินค้าถึง :\r\n");
      out.write("                        <span>คุณ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.customer.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.customer.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 col-sm-6 col-xs-6 text-align-right\"> \r\n");
      out.write("                    <div>วันที่สั่งซื้อ : <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.order.orderdate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"row col-md-6 col-sm-12 boxleft\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12 col-xs-12\">\r\n");
      out.write("                                <div class=\"header-blue\">สถานะ : \r\n");
      out.write("                                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 col-xs-12\">\r\n");
      out.write("                                <div class=\"\">Tracking No. : \r\n");
      out.write("                                    <span>RL021289693TH</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 col-xs-12\">\r\n");
      out.write("                                <div class=\"\">วันที่จัดส่ง : \r\n");
      out.write("                                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.orderdate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row col-md-6 col-sm-12\" style=\"margin-left: 50%\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <div class=\"row cart-table-header\">\r\n");
      out.write("                                <div class=\"col-md-10 col-sm-8\">รายการสินค้า</div>\r\n");
      out.write("                                <div class=\"col-md-2 col-sm-4\">\r\n");
      out.write("                                    <div class=\"col-md-3 col-sm-3 text-center cart-table-header-price\">จำนวน</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row flex item-row \">\r\n");
      out.write("                                <div class=\"col-md-10 col-sm-8\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 col-sm-4  item-row-detail\">\r\n");
      out.write("                                    <div class=\"table-cell-middle widthfull text-center\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"font-title item-qty\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.line.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row cart-table-header\">\r\n");
      out.write("                            <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-7 col-xs-12\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-5 col-xs-12 text-right\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row col-md-3 col-sm-0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"col-md-4 space-line-price\" style=\"margin-left: 65%\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-6\">ค่าจัดส่ง ฟรี</div>\r\n");
      out.write("                    <div class=\"col-md-6 text-align-right\">0฿</div>\r\n");
      out.write("                </div> \r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"row no-margin-top\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-6 header-blue no-margin-top\">ราคารวม</div>\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-6 text-align-right header-blue no-margin-top\">\r\n");
      out.write("                        <strong><input type=\"hidden\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.cart.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.cart.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("฿</strong>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("order");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <div class=\"cart-item\">\r\n");
          out.write("                                            <div class=\"cart-item-cover\">\r\n");
          out.write("                                                <input type=\"image\" value=\"submit\" name=\"imgbook\" src=\"img/book/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyDetail.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 100px; height: 190px;\">\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"cart-item-detail\">\r\n");
          out.write("                                                <div class=\"cart-item-detail-title wordwrap font-title\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"cart-item-detail-author wordwrap font-size-17 font-light\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    ");
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
