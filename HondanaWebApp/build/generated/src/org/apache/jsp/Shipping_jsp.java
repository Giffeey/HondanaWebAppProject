package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shipping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Hondana Bookstore | Checkout</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"css/form-validation.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("        <body class=\"bg-light\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"py-5 text-center\">\r\n");
      out.write("                    <img class=\"d-block mx-auto mb-4\" src=\"https://getbootstrap.com/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\r\n");
      out.write("                    <h2>Checkout</h2>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <form class=\"needs-validation\" novalidate action=\"Shipping\" method=\"post\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4 order-md-2 mb-4\">\r\n");
      out.write("                            <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                                <span class=\"text-muted\">Your cart</span>\r\n");
      out.write("                                <span class=\"badge badge-secondary badge-pill\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                        <ul class=\"list-group mb-4\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between bg-light\">\r\n");
      out.write("                                <div class=\"text-success\">\r\n");
      out.write("                                    <h6 class=\"my-0\">ค่าขนส่ง</h6>\r\n");
      out.write("                                    <small>ฟรี</small>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <span class=\"text-success\">\r\n");
      out.write("                                    0฿\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between\">\r\n");
      out.write("                                <span>รวม</span>\r\n");
      out.write("                                <strong><input type=\"hidden\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("฿</strong>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-8 order-md-1\">\r\n");
      out.write("                        <h4 class=\"mb-3\">Billing address</h4>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                                <label for=\"firstName\">First name</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Valid first name is required.\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                                <label for=\"lastName\">Last name</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Valid last name is required.\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"address\">Address</label>\r\n");
      out.write("                            <input type=\"text\" name=\"shipAddress\" class=\"form-control\" id=\"address\" placeholder=\"55/55 ถ.หญ้ารก ต.น้ำใส อ.เห็นปลา จ.งามดี 55555\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                            <div class=\"invalid-feedback\">\r\n");
      out.write("                                Please enter your shipping address.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-5 mb-3\">\r\n");
      out.write("                                <label for=\"country\">Method</label>\r\n");
      out.write("                                <select name=\"shipMethod\"class=\"custom-select d-block w-100\" id=\"method\" required>\r\n");
      out.write("                                    <option value=\"Register\">Register</option>\r\n");
      out.write("                                    <option value=\"EMS\">EMS</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Please select a method.\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <hr class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("                        <h4 class=\"mb-3\">Payment</h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                                <label for=\"cc-name\">Name on card</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cc-name\" placeholder=\"\" required>\r\n");
      out.write("                                <small class=\"text-muted\">Full name as displayed on card</small>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Name on card is required\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                                <label for=\"cc-number\">Credit card number</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cc-number\" placeholder=\"\" required>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Credit card number is required\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-3 mb-3\">\r\n");
      out.write("                                <label for=\"cc-expiration\">Expiration</label>\r\n");
      out.write("                                <input type=\"date\" class=\"form-control\" id=\"cc-expiration\" required>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Expiration date required\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                                <label for=\"cc-expiration\">CVV</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cc-cvv\" placeholder=\"\" required>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Security code required\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Continue to checkout</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"py-5 text-center\"></div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"../../../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\r\n");
      out.write("        <script src=\"../../../../assets/js/vendor/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"../../../../dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../../../../assets/js/vendor/holder.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("            (function () {\r\n");
      out.write("                'use strict';\r\n");
      out.write("\r\n");
      out.write("                window.addEventListener('load', function () {\r\n");
      out.write("                    // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("                    var forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("\r\n");
      out.write("                    // Loop over them and prevent submission\r\n");
      out.write("                    var validation = Array.prototype.filter.call(forms, function (form) {\r\n");
      out.write("                        form.addEventListener('submit', function (event) {\r\n");
      out.write("                            if (form.checkValidity() === false) {\r\n");
      out.write("                                event.preventDefault();\r\n");
      out.write("                                event.stopPropagation();\r\n");
      out.write("                            }\r\n");
      out.write("                            form.classList.add('was-validated');\r\n");
      out.write("                        }, false);\r\n");
      out.write("                    });\r\n");
      out.write("                }, false);\r\n");
      out.write("            })();\r\n");
      out.write("        </script>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${LineItem}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("line");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("                                <li class=\"list-group-item d-flex justify-content-between lh-condensed\">\r\n");
          out.write("                                    <div>\r\n");
          out.write("                                        <h6 class=\"my-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                        <small class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" เล่ม</small>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <span class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("฿</span>\r\n");
          out.write("                                </li>\r\n");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
