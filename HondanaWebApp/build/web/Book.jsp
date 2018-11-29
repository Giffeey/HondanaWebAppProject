<%-- 
    Document   : Book
    Created on : Nov 11, 2018, 3:20:43 PM
    Author     : GIFS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HONDANA | BOOK</title>
        <jsp:include page="Head.jsp"></jsp:include>
            <style>
                .button {
                    background-color: #4CAF50; /* Green */
                    border: none;
                    color: white;
                    padding: 16px 32px;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 16px;
                    margin: 4px 2px;
                    -webkit-transition-duration: 0.4s; /* Safari */
                    transition-duration: 0.4s;
                    cursor: pointer;
                    border-radius: 25px;
                }
                .button1 {
                    background-color: #FC9C72;
                    color: white; 
                }

                .button1:hover {
                    background-color: #EF8A62;
                    color: white;
                }
            </style>
        </head>
        <body>
            <!-- Product Detail -->
            <div class="container" style="margin-top: 5%; margin-bottom: 5%">
                <div class="row">
                    <div class="col-sm-4">
                        <img src="img/book/${bookItem.isbn}.jpg" alt="${bookItem.isbn}" style="width: 300px; height: 390px;">
                    </div>

                <div class="col-sm-8" >
                    <div class="card-body">
                        <h5 class="card-title">${bookItem.bookname}</h5>
                        <p class="card-text">ผู้แต่ง: ${bookItem.author}</p>
                        <p class="card-text">สำนักพิมพ์: ${bookItem.publisher}</p>
                        <p class="card-text">ราคา: ${bookItem.price} ฿</p>
                        <hr>
                        <p class="card-text"> ${bookItem.synopsis}</p>

                    </div>

                    <div class="btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10">
                        <form action="AddItemToCart" method="post">
                            <input type="hidden" name="isbn" value="${bookItem.isbn}">
                            <button class="button button1">ADD TO CART</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
