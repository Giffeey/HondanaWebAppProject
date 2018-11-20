<%-- 
    Document   : Book
    Created on : Nov 11, 2018, 3:20:43 PM
    Author     : GIFS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <style>

            .m-text14 {
                font-family: Montserrat-Black;
                font-size: 18px;
                color: #333333;
                line-height: 1.5;
            }
            .p-b-7 {
                padding-bottom: 7px;
            }
            .p-b-54 {
                padding-bottom: 54px;
            }

            ul, li {
                margin: 0px;
                list-style-type: none;
            }
            dl, ol, ul {
                margin-top: 0;
                margin-bottom: 1rem;
            }
            .p-t-4 {
                padding-top: 4px;
            }
            ul, menu, dir {
                display: block;
                list-style-type: disc;
                margin-block-start: 1em;
                margin-block-end: 1em;
                margin-inline-start: 0px;
                margin-inline-end: 0px;
                padding-inline-start: 40px;
            }

        </style>

    </head>
    <jsp:include page="Head.jsp"></jsp:include>
        <body>
            <section class="bgwhite p-t-55 p-b-65">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-md-4 col-lg-3 p-b-50">
                            <div class="leftbar p-r-20 p-r-0-sm">
                                <!--  -->
                                <h4 class="m-text14 p-b-7">
                                    Categories
                                </h4>

                                <ul class="p-b-54">
                                    <li class="p-t-4">
                                        <a href="#" class="s-text13 active1">
                                            All
                                        </a>
                                    </li>

                                    <li class="p-t-4">
                                        <a href="#" class="s-text13">
                                            Women
                                        </a>
                                    </li>

                                    <li class="p-t-4">
                                        <a href="#" class="s-text13">
                                            Men
                                        </a>
                                    </li>

                                    <li class="p-t-4">
                                        <a href="#" class="s-text13">
                                            Kids
                                        </a>
                                    </li>

                                    <li class="p-t-4">
                                        <a href="#" class="s-text13">
                                            Accesories
                                        </a>
                                    </li>
                                </ul>

                            </div>
                        </div>

                        <!--                        <div class="col-sm-6 col-md-8 col-lg-9 p-b-50">
                        
                                                     Product 
                                                    <div class="row">
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                                                                    <img src="images/item-02.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Herschel supply co 25l
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $75.00
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-03.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Denim jacket blue
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $92.50
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-05.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Coach slim easton black
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $165.90
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
                                                                    <img src="images/item-07.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Frayed denim shorts
                                                                    </a>
                        
                                                                    <span class="block2-oldprice m-text7 p-r-5">
                                                                        $29.50
                                                                    </span>
                        
                                                                    <span class="block2-newprice m-text8 p-r-5">
                                                                        $15.90
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                                                                    <img src="images/item-01.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Herschel supply co 25l
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $75.00
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-14.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Denim jacket blue
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $92.50
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                                                                    <img src="images/item-06.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Herschel supply co 25l
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $75.00
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-08.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Denim jacket blue
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $92.50
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-10.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Coach slim easton black
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $165.90
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
                                                                    <img src="images/item-11.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Frayed denim shorts
                                                                    </a>
                        
                                                                    <span class="block2-oldprice m-text7 p-r-5">
                                                                        $29.50
                                                                    </span>
                        
                                                                    <span class="block2-newprice m-text8 p-r-5">
                                                                        $15.90
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                                                                    <img src="images/item-12.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Herschel supply co 25l
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $75.00
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                        <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                                                             Block2 
                                                            <div class="block2">
                                                                <div class="block2-img wrap-pic-w of-hidden pos-relative">
                                                                    <img src="images/item-15.jpg" alt="IMG-PRODUCT">
                        
                                                                    <div class="block2-overlay trans-0-4">
                                                                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                                                            <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                                                            <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                                                        </a>
                        
                                                                        <div class="block2-btn-addcart w-size1 trans-0-4">
                                                                             Button 
                                                                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                                                                Add to Cart
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                        
                                                                <div class="block2-txt p-t-20">
                                                                    <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                                                        Denim jacket blue
                                                                    </a>
                        
                                                                    <span class="block2-price m-text6 p-r-5">
                                                                        $92.50
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                        
                                                     Pagination 
                                                    <div class="pagination flex-m flex-w p-t-26">
                                                        <a href="#" class="item-pagination flex-c-m trans-0-4 active-pagination">1</a>
                                                        <a href="#" class="item-pagination flex-c-m trans-0-4">2</a>
                                                    </div>
                                                </div>-->
                    </div>
                </div>
            </section>
            <div class="card-deck">
            <c:forEach items="${books}" var="book">
                <div class="col-3 container">
                    <div class="card" >
                        <img class="card-img-top" src="img/book/${book.isbn}.jpg" alt="${book.isbn}" style="width: 200px; height: 270px;">
                        <div class="card-body">
                            <h5 class="card-title">${book.bookname}</h5>
                            <p class="card-text">ผู้แต่ง: ${book.author}</p>
                            <p class="card-text">สำนักพิมพ์: ${book.publisher}</p>
                            <p class="card-text">ราคา: ${book.price} บาท</p>
                        </div>
                        <div class="card-footer">
                            <form action="AddItemToCart" method="post">
                                <input type="hidden" name="isbn" value="${book.isbn}">
                                <a type="submit" class="btn btn-primary">Add to Cart</a>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
