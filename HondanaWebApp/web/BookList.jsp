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
        <meta http-equiv="Content-Type" content="text/html">
        <meta charset="UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <style>
            .btn.btn-primary{
                background: #FC9C72 none repeat scroll 0 0;
                border-color: #FC9C72;
                color: #ffffff;
                font-size: 14px;
                width: 100%;
                height: 50px;
                line-height: 50px;
                padding: 0;
                border-radius: 25px;
            }
            .btn-primary {
                color: #fff;
                background-color: #FE9061;
                border-color: #FE9061;
            }

            .m-text14 {
                font-family: Montserrat-Black;
                font-size: 18px;
                color: #333333;
                line-height: 1.5;
            }
            .s-text13{
                font-family: Montserrat-Black;
                color: #333333;
                background-color: #ffffff; 

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

            .card-deck{
                margin-top: 50px;
                margin-bottom: 150px;
                margin-right: 40px;
            }

            .card{
                margin-top: 50px;
                margin-bottom: 50px;
                display: inline-block;
            }

            .card-img-top{
                padding-top: 15px;
            }

            .col3{
                float: left;
            }
            li .p-t-4 {
                background: #cce5ff;
                margin: 5px;
            }
            .button3 {
                background-color: white; 
                color: black; 
                border: 2px solid #e7e7e7;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }
            .button4{
                padding: 12px 16px;
                background-color: #f9f9f9;
                min-width: 160px;

            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content .button4 {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                font-size: 16px;
                border: none;
            }

            .dropdown-content .button4:hover {background-color: #f1f1f1}

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .button5{
                
                background-color: #f9f9f9;
                min-width: 25px;

            }
            .dropdown2 {
                position: relative;
                display: inline-block;
            }

            .dropdown2-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 250px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown2-content .button5 {
                color: black;
                padding: 16px;
                text-decoration: none;
                display: block;
                font-size: 16px;
                border: none;
            }

            .dropdown2-content .button5:hover {background-color: #f1f1f1}

            .dropdown2:hover .dropdown2-content {
                display: block;
            }
        </style>

    </head>
    <jsp:include page="Head.jsp"></jsp:include>
        <body>




            <div class="container" style="margin-top: 2%">
                <div class="row">

                    <div class="col-sm-4">
                        <div class="dropdown">
                            <button class="button button3">
                                CATEGORIES
                            </button>
                            <div class="dropdown-content">
                                <form action="CategoryOfBook" method="post">
                                    <input type="hidden" name="category" value="novel">
                                    <button type="submit" class="button button4">
                                        นิยาย
                                    </button>
                                </form>
                                <form action="CategoryOfBook" method="post">
                                    <input type="hidden" name="category" value="trannovel">
                                    <button type="submit" class="button button4">
                                        นิยายแปล
                                    </button>
                                </form>
                                <form action="CategoryOfBook" method="post">
                                    <input type="hidden" name="category" value="manage">
                                    <button type="submit" class="button button4">
                                        บริหาร
                                    </button>
                                </form>
                                <form action="CategoryOfBook" method="post">
                                    <input type="hidden" name="category" value="garden">
                                    <button type="submit" class="button button4">
                                        บ้านและสวน
                                    </button>
                                </form>
                                <form action="CategoryOfBook" method="post">
                                    <input type="hidden" name="category" value="psychology">
                                    <button type="submit" class="button button4">
                                        จิตวิทยา
                                    </button>
                                </form>

                            </div>
                        </div>


                    </div>


                    <div class="col-sm-8">

                        <div class="dropdown2">
                            <button class="button button3">
                                GENRE
                            </button>
                            <div class="dropdown2-content">
                                <form action="GenreOfBook" method="post">
                                    <input type="hidden" name="genre" value="แฟนตาซี">
                                    <button type="submit" class="button button5">
                                        แฟนตาซี
                                    </button>
                                </form>
                            </div>
                        </div>
                        <!--                        <h4 class="m-text14 p-b-7">
                                                    GENRE
                                                </h4>-->

                        <!--                    <ul class="p-b-54">
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="แฟนตาซี">
                                                        <button type="submit" class="s-text13">
                                                            แฟนตาซี
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายแปลแฟนตาซี">
                                                        <button type="submit" class="s-text13">
                                                            นิยายแปลแฟนตาซี
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="บ้านและสวน">
                                                        <button type="submit" class="s-text13">
                                                            บ้านและสวน
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="วรรณกรรมเยาวชน">
                                                        <button type="submit" class="s-text13">
                                                            วรรณกรรมเยาวชน
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="รักโรแมนติก">
                                                        <button type="submit" class="s-text13">
                                                            รักโรแมนติก
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายโรแมนติก">
                                                        <button type="submit" class="s-text13">
                                                            นิยายโรแมนติก
                                                        </button>
                                                    </form>
                                                </li>
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายแปลโรแมนติก">
                                                        <button type="submit" class="s-text13">
                                                            นิยายแปลโรแมนติก
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายแปลจีน">
                                                        <button type="submit" class="s-text13">
                                                            นิยายแปลจีน
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="จิตวิทยา">
                                                        <button type="submit" class="s-text13">
                                                            จิตวิทยา
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="สืบสวนสอบสวน">
                                                        <button type="submit" class="s-text13">
                                                            สืบสวนสอบสวน
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายแปลสืบสวนสอบสวน">
                                                        <button type="submit" class="s-text13">
                                                            นิยายแปลสืบสวนสอบสวน
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="นิยายวาย">
                                                        <button type="submit" class="s-text13">
                                                            นิยายวาย
                                                        </button>
                                                    </form>
                                                </li>
                        
                                                <li class="p-t-4">
                                                    <form action="GenreOfBook" method="post">
                                                        <input type="hidden" name="genre" value="วรรณกรรมไทย">
                                                        <button type="submit" class="s-text13">
                                                            วรรณกรรมไทย
                                                        </button>
                                                    </form>
                                                </li>
                                            </ul>-->
                    </div>

                </div>
        </div>
                <div class="card-deck">
                <c:forEach items="${books}" var="book">
                    <div class="col-3">
                        <div class="card" >
                            <center><div class="card-img-top">
                                    <form action="ShowBookDetail" method="post">
                                        <input type="hidden" name="isbn" value="${book.isbn}">
                                        <input type="image" value="submit" name="imgbook" src="img/book/${book.isbn}.jpg" alt="${book.isbn}" style="width: 200px; height: 290px;">

                                    </form>
                                </div></center>
                            <div class="card-body">
                                <h5 class="card-title">${book.bookname}</h5>
                                <p class="card-text">ผู้แต่ง: ${book.author}</p>
                                <p class="card-text">สำนักพิมพ์: ${book.publisher}</p>
                                <p class="card-text">ราคา: ${book.price} บาท</p>
                            </div>
                            <div class="card-footer">
                                <form action="AddItemToCart" method="post">
                                    <input type="hidden" name="isbn" value="${book.isbn}">
                                    <button class="btn btn-primary"type="submit" >Add to Cart</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>



    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
