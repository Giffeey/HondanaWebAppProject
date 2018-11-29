<%-- 
    Document   : Home
    Created on : Nov 13, 2018, 4:20:39 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HONDANA | HOME</title>
        <link href="css/csshome.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Athiti" rel="stylesheet">
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>          
            <div class="slide-contaner" style="background-image: url(img/test2.jpg)">
                <a href="AllBook">
                    <button class="button button1">SHOP NOW</button>
                </a>
            </div>
            <div class="slide-contaner" style="background-image: url(img/test3.jpg)">
                <a href="AllBook">
                    <button class="button button2">SHOP NOW</button>
                </a>
            </div>
            <div class="slide-contaner" style="background-image: url(img/test.jpg)">
            </div>

            <div style="text-align:center">
                <span class="dot"></span> 
                <span class="dot"></span> 
                <span class="dot"></span> 
            </div>
            <script>
                var slideIndex = 0;
                showSlides();

                function showSlides() {
                    var i;
                    var slides = document.getElementsByClassName("slide-contaner");
                    var dots = document.getElementsByClassName("dot");
                    for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none";
                    }
                    slideIndex++;
                    if (slideIndex > slides.length) {
                        slideIndex = 1
                    }
                    for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" active", "");
                    }
                    slides[slideIndex - 1].style.display = "block";
                    dots[slideIndex - 1].className += " active";
                    setTimeout(showSlides, 5000); // Change image every 2 seconds
                }
            </script>


            <div class="card-deck">
            <c:forEach items="${showBook}" var="book">
                <div class="col-3">
                    <div class="card">

 
                        <div class="card-img-top">
                            <center><form action="ShowBookDetail" method="post">
                                    <input type="hidden" name="isbn" value="${book.isbn}">
                                    <input type="image" value="submit" name="imgbook" src="img/book/${book.isbn}.jpg" alt="${book.isbn}" style="width: 200px; height: 290px;">

                                </form></center>
                        </div>

                        <div class="card-body">
                            <h5 class="card-title">${book.bookname}</h5>
                            <p class="card-text">ผู้แต่ง: ${book.author}</p>
                            <p class="card-text">ราคา: ${book.price} บาท</p>
                        </div>
                        <div class="card-footer">
                            <form action="AddItemToCart" method="post">
                                <input type="hidden" name="isbn" value="${book.isbn}">
                                <button type="submit" class="btn btn-primary">Add to Cart</button>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <!--        </section>-->

    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
