<%-- 
    Document   : History
    Created on : Nov 13, 2018, 3:34:05 PM
    Author     : GIFS
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HONDANA | HISTORY</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Athiti" rel="stylesheet">
        <link href="css/historycss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>

            <br>
            <div class="container"><h1 style="font-family:'Athiti', sans-serif; margin-top: 5%">ประวัติการสั่งซื้อ</h1></div>
            <div class="container">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">OrderNo</th>
                            <th scope="col">Date</th>
                            <th scope="col">numbook</th>
                            <th scope="col">Price</th>
                            <th scope="col">Status</th>
                            <th scope="col">Detail</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${orderHistory}" var="order" >
                        <tr>
                            <th scope="row">${order.orderno}</th>
                            <td><fmt:formatDate value="${order.orderdate}" pattern="dd/MM/yyyy"/></td>
                            <td>${order.totalbook}</td>
                            <td>${order.paymentno.amount}</td>
                            <td>${order.status}</td>
                            <td><form action="HistoryDetail" method="post">
                                    <input type="hidden" name="orderNo" value="${order.orderno}">
                                    <button class="button button1" type="submit" >Order Detail</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
            
            <!--Footer-->
            
            <div class="footer">

            <div class="footer-right m-l-auto">

                <div class="facebook">
                    <a href="#">
                        <img src="img/facebook.png">
                    </a>
                </div>
                <div class="twitter">
                    <a href="#">
                        <img src="img/twitter.png">
                    </a>
                </div>
                <div class="instagram">
                    <a href="#">
                        <img src="img/instagram.png">
                    </a>
                </div>


            </div>

            <div class="footer-left">

                <p class="footer-links">
                    Address: 04/021 <br>
                    Tel: 025-970-493 <br>
                    E-mail: jompol.jintaphat@hotmak.com
                </p>

                <p class="coppyright">Copyright &copy; HONDANA 2018</p>
            </div>
        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
