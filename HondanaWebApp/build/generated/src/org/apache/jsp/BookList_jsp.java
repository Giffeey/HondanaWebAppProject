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
      out.write("                background-color: #ffffff; \r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <section class=\"bgwhite p-t-55 p-b-65\">\r\n");
      out.write("                <div class=\"navbar-collapse js-navbar-collapse\">\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav mainmenu\" id=\"mainmenu1\" style=\"display:none\">\r\n");
      out.write("\t\t\t<li class=\"dropdown mega-dropdown\">\r\n");
      out.write("\t\t\t\t<a href=\"/promotions/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">โปรโมชั่น </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("            <li class=\"dropdown mega-dropdown\">\r\n");
      out.write("    \t\t\t<a href=\"https://www.naiin.com/books/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">หนังสือ </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("            <li class=\"dropdown mega-dropdown\">\r\n");
      out.write("    \t\t\t<a href=\"https://www.naiin.com/e-books/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">อีบุ๊ค </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("             <li class=\"dropdown mega-dropdown\">\r\n");
      out.write("    \t\t\t<a href=\"https://www.naiin.com/magazines/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">นิตยสาร </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("            <li class=\"dropdown mega-dropdown\">\r\n");
      out.write("    \t\t\t<a href=\"https://www.naiin.com/e-magazines/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">อีแม็กกาซีน </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("            <li class=\"dropdown mega-dropdown\">\r\n");
      out.write("    \t\t\t<a href=\"https://www.naiin.com/nonbook/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">ไลฟ์สไตล์แอนด์กิ๊ฟ </a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav mainmenu\" id=\"mainmenu\"><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/promotions/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">โปรโมชั่น </a></li><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/books/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">หนังสือ<span class=\"caret\"></span> </a><ul class=\"dropdown-menu mega-dropdown-menu\" style=\"display: none;\"><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">หนังสือที่เราอยากแนะนำ</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2316&amp;recPerPage=80&amp;pageNo=1\">หนังสือแนะนำประจำเดือน</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2512&amp;recPerPage=80&amp;pageNo=1\">หนังสือที่ได้รับการรีวิวมากที่สุด</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2511&amp;recPerPage=80&amp;pageNo=1\">หนังสือที่ได้รับคะแนนมากที่สุด</a></li><li><a href=\"https://www.naiin.com/category?promotionCode=180101196&amp;product_type_id=1\">หนังสือ พระราชนิพนธ์</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2304&amp;recPerPage=80&amp;pageNo=1\">หนังสือ อ่านนอกเวลา</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2311&amp;recPerPage=80&amp;pageNo=1\">หนังสือที่ได้รับรางวัล</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2305&amp;recPerPage=80&amp;pageNo=1\">นิยายที่นํามาทําละคร</a></li><li><a href=\"https://www.naiin.com/category?promotionCode=180101326&amp;product_type_id=1\">หนังสือ สู่ภาพยนตร์</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2306&amp;recPerPage=80&amp;pageNo=1\">นิทาน EF เสริมทักษะสมองให้ลูก</a></li><li><a href=\"https://www.naiin.com/category?type_book=best_seller&amp;product_type_id=1\">100 อันดับขายดี</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"https://www.naiin.com/product/view-all?product_type_id=1&amp;product_category=list-book-category\">หมวดหนังสือน่าอ่าน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=28&amp;product_type_id=1\">วรรณกรรม แปล</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=10&amp;product_type_id=1\">วรรณกรรม ไทย</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=9&amp;product_type_id=1\">วรรณกรรม เยาวชน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=6&amp;product_type_id=1\">นิยาย รักโรแมนติก</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=28&amp;categoryLv2Code=89&amp;product_type_id=1\">นิยาย สืบสวนสอบสวน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=1&amp;product_type_id=1\">เรื่องสั้น อ่านง่าย</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=95&amp;product_type_id=1\">สายวายต้องอ่าน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=13&amp;product_type_id=1\">จิตวิทยา พัฒนาตนเอง</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=15&amp;product_type_id=1\">บริหารธุกิจ</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=19&amp;product_type_id=1\">หนังสือเด็กน้อย</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=17&amp;product_type_id=1\">คู่มือ หนังสือเรียน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=10&amp;product_type_id=1\">อ่านเสริมทักษะ</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=11&amp;product_type_id=1\">ธรรมะ ศาสนา ปรัชญา</a></li><li><a href=\"https://www.naiin.com/category?categoryLv2Code=86&amp;category_1_code=28&amp;product_type_id=1\">Manga &amp; Light Novel</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"https://www.naiin.com/product/view-all-author-publisher?list_of=publisher&amp;product_type_id=1\">สำนักพิมพ์ขายดี</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000001&amp;product_type_id=1\">แพรวสำนักพิมพ์</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000003&amp;product_type_id=1\">อรุณ</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000023&amp;product_type_id=1\">บ้านและสวน</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000005&amp;product_type_id=1\">แพรวเพื่อนเด็ก</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000239&amp;product_type_id=1\">แจ่มใส</a></li><li><a href=\"https://www.naiin.com/category?publisherID=005027&amp;product_type_id=1\">everY</a></li><li><a href=\"https://www.naiin.com/category?publisherID=004438&amp;product_type_id=1\">Hongsamut</a></li><li><a href=\"https://www.naiin.com/category?publisherID=003210&amp;product_type_id=1\">พิมพ์คำนิวสตาร์</a></li><li><a href=\"https://www.naiin.com/category?publisherID=005127&amp;product_type_id=1\">นาบู</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">นักเขียนดัง ผลงานโดน</a></li><li><a href=\"https://www.naiin.com/writer/001855/\">กิ่งฉัตร</a></li><li><a href=\"https://www.naiin.com/writer/005434/\">ปิยะพร</a></li><li><a href=\"https://www.naiin.com/writer/011732/\">พงศกร</a></li><li><a href=\"https://www.naiin.com/writer/013744/\">รอมแพง</a></li><li><a href=\"https://www.naiin.com/writer/009829/\">อกาธา คริสตี้</a></li><li><a href=\"https://www.naiin.com/writer/003787/\">แดน บราวน์</a></li><li><a href=\"https://www.naiin.com/writer/001423/\">สตีเฟ่นคิงส์</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">Blog Book รวมหนังสือน่าอ่าน</a></li><li><a href=\"https://www.naiin.com/news-activities\">สามก๊ก ฉบับ วินทร์ เลียววาริณ ในแบบฉบับจอมยุทธ์</a></li><li><a href=\"https://www.naiin.com/news-activities/2270\">ดูดวงปี 2562 กับหมอช้าง ทศพร ศรีตุลา ดวงความรักแม่นๆ 12 ราศี</a></li><li><a href=\"https://www.naiin.com/news-activities/2266\">จากหนังสือนิยายแจ่มใส เอเวอร์วายสู่ ซีรีส์ใหม่ ปี 2019</a></li><li><a href=\"https://www.naiin.com/news-activities/2256\"> 6 นักเขียน เจ้าของผลงานหนังสือนวนิยายสยองขวัญ ระทึก ลึกลับ</a></li><li><a href=\"https://www.naiin.com/news-activities/2252\">\"ความสุขของกะทิ\" รอยยิ้มในวัยเยาว์ กับความเศร้าที่เราต่างต้องเจอ</a></li></ul></li></ul></li><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/e-books/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">อีบุ๊ค<span class=\"caret\"></span> </a><ul class=\"dropdown-menu mega-dropdown-menu\" style=\"display: none;\"><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">หนังสือที่เราอยากแนะนำ</a></li><li><a href=\"https://www.naiin.com/category?type_book=recommend&amp;product_type_id=3\">e-Book หนังสือแนะนำ</a></li><li><a href=\"https://www.naiin.com/category?type_book=new_arrival&amp;product_type_id=3\">e-Book หนังสือใหม่ประจำสัปดาห์</a></li><li><a href=\"https://www.naiin.com/category?promotionCode=180101322&amp;product_type_id=3\">e-Book โปรโมชั่นโดนใจ</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2308&amp;recPerPage=80&amp;pageNo=1\">e-Book รวมนิยายเป็นละคร ซีรี่ส์</a></li><li><a href=\"https://www.naiin.com/category?type_book=best_seller&amp;product_type_id=3\">e-Book อันดับขายดี</a></li><li><a href=\"https://www.naiin.com/category?bannerid=2309&amp;recPerPage=80&amp;pageNo=1\">e-Book รวมนิยายสายหวาน</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">หมวดหนังสือน่าอ่าน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;product_type_id=3\">วรรณกรรม ไทย</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=28&amp;product_type_id=3\">วรรณกรรม แปล</a></li><li><a href=\"#\">นิยาย รักโรแมนติก 18+</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=28&amp;categoryLv2Code=89&amp;product_type_id=3\">นิยาย สืบสวนสอบสวน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=28&amp;categoryLv2Code=86&amp;product_type_id=3\">Manga &amp; Light Novel</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=1&amp;product_type_id=3\">เรื่องสั้น อ่านง่าย</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=2&amp;categoryLv2Code=95&amp;product_type_id=3\">สายวายต้องอ่าน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=5&amp;product_type_id=3\">บ้านและสวน Garden&amp;Home</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=4&amp;product_type_id=3\">ท่องเที่ยว Travel</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=17&amp;product_type_id=3\">คู่มือ หนังสือเรียน</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=10&amp;product_type_id=3\">อ่านเสริมทักษะ</a></li><li><a href=\"https://www.naiin.com/category?category_1_code=11&amp;product_type_id=3\">ธรรมะ ศาสนา ปรัชญา</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">สำนักพิมพ์ขายดี</a></li><li><a href=\"https://www.naiin.com/category?publisherID=003561&amp;product_type_id=3\">แฮปปี้ บานานา</a></li><li><a href=\"https://www.naiin.com/category?publisherID=005027&amp;product_type_id=3\">everY</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000003&amp;product_type_id=3\">อรุณ</a></li><li><a href=\"https://www.naiin.com/category?publisherID=004438&amp;product_type_id=3\">Hongsamut</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000239&amp;product_type_id=3\">แจ่มใส</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000595&amp;product_type_id=3\">พิมพ์คำ</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000023&amp;product_type_id=3\">บ้านและสวน</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000518&amp;product_type_id=3\">สถาพร</a></li><li><a href=\"https://www.naiin.com/category?publisherID=005127&amp;product_type_id=1\">นาบู</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000005&amp;product_type_id=3\">แพรวเพื่อนเด็ก</a></li><li><a href=\"https://www.naiin.com/category?publisherID=004499&amp;product_type_id=3\">Bongkoch Comics</a></li><li><a href=\"https://www.naiin.com/category?publisherID=000001&amp;product_type_id=3\">แพรวสำนักพิมพ์</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">นักเขียนดัง ผลงานโดน</a></li><li><a href=\"https://www.naiin.com/writer/013744/\">รอมแพง</a></li><li><a href=\"https://www.naiin.com/writer/001855/\">กิ่งฉัตร</a></li><li><a href=\"https://www.naiin.com/writer/014993/\">Andra</a></li><li><a href=\"https://www.naiin.com/writer/005434/\">ปิยะพร</a></li><li><a href=\"https://www.naiin.com/writer/011732/\">พงศกร</a></li><li><a href=\"https://www.naiin.com/writer/009311/\">แสตมเบอร์รี่</a></li><li><a href=\"https://www.naiin.com/writer/003787/\">แดน บราวน์</a></li></ul></li></ul></li><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/magazines/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">นิตยสาร<span class=\"caret\"></span> </a><ul class=\"dropdown-menu mega-dropdown-menu\" style=\"display: none;\"><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">นิตยสารที่เราอยากแนะนำ</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=PS&amp;product_type_id=2\">สุดสัปดาห์</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=PW&amp;product_type_id=2\">แพรว</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=BS&amp;product_type_id=2\">บ้านและสวน</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=AB&amp;product_type_id=2\">Amarin Baby and Kids</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=MH&amp;product_type_id=2\">My Home</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=RM&amp;product_type_id=2\">Room</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=CH&amp;product_type_id=2\">ชีวจิต</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=HC&amp;product_type_id=2\">Heath &amp; Cuisine</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=NG&amp;product_type_id=2\">National Geographic</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=SC&amp;product_type_id=2\">Secret</a></li><li><a href=\"https://www.naiin.com/category?magazineHeadCode=WE&amp;product_type_id=2\">Praew Wedding แพรว เวดดิ้ง</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">คำฮิต ติดเทรนด์</a></li><li><a href=\"https://www.naiin.com/product/detail/239774/\">NATIONAL GEOGRAPHIC - วีรบุรุษถ้ำหลวงขุนน้ำนางนอน</a></li><li><a href=\"https://www.naiin.com/product/detail/243148\">แพรว ฉบับ 940 ปกเป๊ก ผลิตโชค/ แบมแบม GOT7</a></li><li><a href=\"https://www.naiin.com/product/detail/243134\">สุดสัปดาห์ ฉบับ 845 ปกเฌอปราง-เจมส์ ธีรดนย์/เจมส์ จิรายุ–ออกแบบ</a></li><li><a href=\"https://www.naiin.com/product/detail/239126/\">บ้านและสวน</a></li><li><a href=\"https://www.naiin.com/product/detail/239536/\">เจนี่-มิกกี้</a></li></ul></li></ul></li><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/e-magazines/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">อีแม็กกาซีน<span class=\"caret\"></span> </a><ul class=\"dropdown-menu mega-dropdown-menu\" style=\"display: none;\"><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">นิตยสารขายดี</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=16&amp;product_type_id=4\">สุดสัปดาห์</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=16&amp;product_type_id=4\">แพรว</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=12&amp;product_type_id=4\">บ้านและสวน</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=6&amp;product_type_id=4\">My Home</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=8&amp;product_type_id=4\">Secret ซีเคร็ต</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=14&amp;product_type_id=4\">ชีวจิต</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=190&amp;product_type_id=4\">Playboy</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=58&amp;product_type_id=4\">National Geographic</a></li><li><a href=\"https://www.naiin.com/category?EmagazineHeadCode=9&amp;product_type_id=4\">Amarin Baby And Kids</a></li></ul></li><li class=\"col-sm-3\"><ul><li class=\"dropdown-header\"><a href=\"#\">คำฮิต ติดเทรนด์</a></li><li><a href=\"#\">มาร์ค Got7</a></li><li><a href=\"#\">Bambam Got7</a></li><li><a href=\"#\">พ่อหมี แม่หมี</a></li><li><a href=\"#\">เชียร์ ฑิฆัมพร</a></li><li><a href=\"#\">เต้ย พงศกร</a></li><li><a href=\"#\">มาริโอ้ Mario</a></li><li><a href=\"#\">สู่ขวัญ แพรว</a></li><li><a href=\"#\">เป่าเปา</a></li></ul></li></ul></li><li class=\"dropdown mega-dropdown\"><a href=\"https://www.naiin.com/nonbook/\" class=\"dropdown-toggle d1\" data-toggle=\"dropdown\">สินค้าไลฟ์สไตล์ </a></li></ul>\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("                <div class=\"container\" >\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("                            <h4 class=\"m-text14 p-b-7\">\r\n");
      out.write("                                Categories\r\n");
      out.write("                            </h4>\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"p-b-54\">\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"category\" value=\"novel\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยาย\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"category\" value=\"trannovel\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายแปล\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"category\" value=\"manage\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            บริหาร\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"category\" value=\"garden\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            บ้านและสวน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"CategoryOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"category\" value=\"psychology\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            จิตวิทยา\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            \r\n");
      out.write("                            <h4 class=\"m-text14 p-b-7\">\r\n");
      out.write("                                Genre\r\n");
      out.write("                            </h4>\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"p-b-54\">\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"แฟนตาซี\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            แฟนตาซี\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายแปลแฟนตาซี\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายแปลแฟนตาซี\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"บ้านและสวน\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            บ้านและสวน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"วรรณกรรมเยาวชน\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            วรรณกรรมเยาวชน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"รักโรแมนติก\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            รักโรแมนติก\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายโรแมนติก\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายโรแมนติก\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายแปลโรแมนติก\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายแปลโรแมนติก\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายแปลจีน\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายแปลจีน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"จิตวิทยา\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            จิตวิทยา\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"สืบสวนสอบสวน\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            สืบสวนสอบสวน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายแปลสืบสวนสอบสวน\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายแปลสืบสวนสอบสวน\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"นิยายวาย\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            นิยายวาย\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"p-t-4\">\r\n");
      out.write("                                    <form action=\"GenreOfBook\" method=\"post\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"genre\" value=\"วรรณกรรมไทย\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"s-text13\">\r\n");
      out.write("                                            วรรณกรรมไทย\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card-deck\">\r\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
          out.write("        <div class=\"col-3\">\r\n");
          out.write("            <div class=\"card\" >\r\n");
          out.write("                <center><div class=\"card-img-top\">\r\n");
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
          out.write("                    </div></center>\r\n");
          out.write("                <div class=\"card-body\">\r\n");
          out.write("                    <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                    <p class=\"card-text\">ผู้แต่ง: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                    <p class=\"card-text\">สำนักพิมพ์: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                    <p class=\"card-text\">ราคา: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" บาท</p>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"card-footer\">\r\n");
          out.write("                    <form action=\"AddItemToCart\" method=\"post\">\r\n");
          out.write("                        <input type=\"hidden\" name=\"isbn\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                        <button class=\"btn btn-primary\"type=\"submit\" >Add to Cart</button>\r\n");
          out.write("                    </form>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("    ");
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
