<%-- 
    Document   : HistoryDetail
    Created on : Nov 13, 2018, 3:34:16 PM
    Author     : GIFS
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HONDANA | HISTORY</title>
        <jsp:include page="Head.jsp"></jsp:include>
            <style>
                .header-blue {
                    font-size: 25px;
                    color: #003a70;
                }

                .row {
                    margin-right: -10px;
                    margin-left: -10px;
                }
                .row .col-md-6 .col-sm-12{
                    margin-left:50%;
                    margin-top: 25%;
                }
            </style>
        </head>
        <body>
            <br>
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <div class="header-blue">รายละเอียดการสั่งซื้อเลขที่ ${paymentDetail.paymentno}</div>
                    <div>ส่งสินค้าถึง :
                        <span>${shippingDetail.shipaddress}</span>                    
                    </div>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-6 text-align-right"> 
                    <div>วันที่สั่งซื้อ : <span><fmt:formatDate value="${paymentDetail.orderno.orderdate}" pattern="dd/MM/yyyy"/></span></div>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-md-12">
                    <div class="row col-md-6 col-sm-12 boxleft">
                        <div class="row">
                            <div class="col-md-12 col-xs-12">
                                <div class="header-blue">สถานะ : 
                                    <span>${shippingDetail.shipstatus}</span>

                                </div>
                            </div>
                            <div class="col-md-12 col-xs-12">
                                <div class="">Tracking No. : 
                                    <span>${shippingDetail.trackingno}</span>
                                </div>
                            </div>
                            <div class="col-md-12 col-xs-12">
                                <div class="">วันที่จัดส่ง : 
                                    <span><fmt:formatDate value="${shippingDetail.shipdate}" pattern="dd/MM/yyyy"/></span>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row col-md-6 col-sm-12" style="margin-left: 50%">
                        <div class="col-md-12">
                            <div class="row cart-table-header">
                                <div class="col-md-10 col-sm-8">รายการสินค้า</div>
                                <div class="col-md-2 col-sm-4">
                                    <div class="col-md-3 col-sm-3 text-center cart-table-header-price">จำนวน</div>
                                </div>
                            </div>
                            <hr>

                            <c:forEach items="${historyDetail}" var="his">
                                <div class="row flex item-row ">
                                    <div class="col-md-10 col-sm-8">

                                        <div class="cart-item">
                                            <div class="cart-item-cover">
                                                <img src="img/book/${his.book.isbn}.jpg" alt="${his.book.isbn}" style="width: 100px; height: 150px;" >
                                            </div>
                                            <div class="cart-item-detail">
                                                <div class="cart-item-detail-title wordwrap font-title">
                                                    ${his.book.bookname}
                                                </div>
                                                
                                                <div class="cart-item-detail-author wordwrap font-size-17 font-light">
                                                    ${his.book.author}
                                                </div>
                                                <br>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="col-md-2 col-sm-4  item-row-detail">
                                        <div class="table-cell-middle widthfull text-center">
                                            <div>
                                                <span class="font-title item-qty"> ${his.quantity}</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                        <div class="row cart-table-header">
                            <div class="clearfix"></div>

                            <div class="col-md-7 col-xs-12">
                            </div>
                            <div class="col-md-5 col-xs-12 text-right">

                            </div>
                            <div class="clearfix"></div>

                        </div>                        
                    </div>
                    <div class="row col-md-3 col-sm-0">
                    </div>
                </div>
            </div>
            <hr>
            <div class="col-md-4 space-line-price" style="margin-left: 65%">
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-6">Shipping Fee</div>
                    <div class="col-md-6 text-align-right">0฿</div>
                </div> 
                <hr>
                <div class="row no-margin-top">
                    <div class="col-md-6 col-sm-6 col-xs-6 header-blue no-margin-top">Total</div>
                    <div class="col-md-6 col-sm-6 col-xs-6 text-align-right header-blue no-margin-top">
                        <strong><input type="hidden" name="amount" value="${paymentDetail.amount}">${paymentDetail.amount}฿</strong>
                    </div>
                </div>

            </div>
            <br>
            <br>
        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
