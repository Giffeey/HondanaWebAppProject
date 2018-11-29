<%-- 
    Document   : ShowItemInCart
    Created on : Nov 11, 2018, 6:54:58 PM
    Author     : GIFS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HONDANA | CART</title>
        <jsp:include page="Head.jsp"></jsp:include>
            <link href="css/cartcss.css" rel="stylesheet" type="text/css"/>
            <link href="https://fonts.googleapis.com/css?family=Athiti" rel="stylesheet">

        </head>
        <body>
            <section class="cart bgwhite p-t-70 p-b-100">
                <div class="container">
                    <!-- Cart item -->
                    <div class="container-table-cart pos-relative">
                        <div class="wrap-table-shopping-cart bgwhite">
                            <table class="table-shopping-cart">
                                <tr class="table-head">
                                    <th class="column-1"></th>
                                    <th class="column-2" >Product</th>
                                    <th class="column-3">Price</th>
                                    <th class="column-4 p-l-70">Quantity</th>
                                    <th class="column-5">Total</th>
                                    <th class="column-6"></th>
                                </tr>
                            <c:forEach items="${cart.lineItems}" var="line" varStatus="vs">
                                <tr class="table-row">
                                    <td class="column-1 col-2">
                                        <div class="cart-img-product b-rad-4 o-f-hidden">
                                            <img src="img/book/${line.book.isbn}.jpg" alt="${line.book.isbn}" style="width: 150px; height: 220px;">
                                        </div>
                                    </td>
                                    <td class="column-2" style="font-family:'Athiti', sans-serif;">${line.book.bookname}</td>
                                    <td class="column-3" style="font-family:'Athiti', sans-serif;">${line.book.price}</td>
                                    <td class="column-4" style="font-family:'Athiti', sans-serif;">
                                        <div class="flex-w bo5 of-hidden w-size17">
                                            <form action="ShowCart" method="post"><input type="hidden" name="decrease" value="${line.book.isbn}">
                                                <button type="submit" class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
                                                    <img src="img/substract.png" alt="minus" style="width: 20px; height: 20px">
                                                    <i class="fs-12 fa fa-minus" aria-hidden="true"></i>
                                                </button></form>

                                            <input class="size8 m-text18 t-center num-product" type="number" name="num-product1" value="${line.quantity}" readonly>

                                            <form action="ShowCart" method="post"><input type="hidden" name="increase" value="${line.book.isbn}">
                                                <button type="submit" class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
                                                    <img src="img/add.png" alt="plus" style="width: 20px; height: 20px">
                                                    <i class="fs-12 fa fa-plus" aria-hidden="true"></i>
                                                </button></form>
                                        </div>
                                    </td>

                                    <td class="column-5" style="font-family:'Athiti', sans-serif;">${line.totalPrice}</td>
                                    <td class="column-6" style="font-family:'Athiti', sans-serif;"><form action="ShowCart" method="post"><input type="hidden" name="remove" value="${line.book.isbn}"><input type="image" src="img/cancel.png" style="width: 50px; height: 50px;" value="submit"></form></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>

                <!-- Total -->
                <div class="bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm">
                    <h5 class="m-text20 p-b-24">
                        Cart Totals
                    </h5>

                    <!--  -->
                    <div class="flex-w flex-sb-m p-b-12" >
                        <span class="s-text18 w-size19 w-full-sm" style="font-family:'Athiti', sans-serif;">
                            Subtotal:
                        </span>

                        <span class="m-text21 w-size20 w-full-sm" style="font-family:'Athiti', sans-serif;">
                            ${cart.totalPrice}฿
                        </span>
                    </div>
                    <div class="flex-w flex-sb-m p-b-12">
                        <span class="s-text18 w-size19 w-full-sm" style="font-family:'Athiti', sans-serif;">
                            Total Book:
                        </span>
                        <span class="m-text21 w-size20 w-full-sm">
                            ${cart.totalQuantity}
                        </span>
                    </div><br>

                    <div class="size15 trans-0-4">
                        <!-- Button -->
                        <form action="CheckoutPage" method="post">
                            <button type="submit" class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
                                Proceed to Checkout
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </section> 
        <div><br></div>
          
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
