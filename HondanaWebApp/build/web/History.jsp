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
        <title>JSP Page</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
                background-color: #f2f2f2;
            }

            th, td {
                text-align: left;
                padding: 8px;
            }
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
            
            /*table{background-color: #f2f2f2;}*/
        </style>
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>

            <br>
            <h1 style="font-family: 'Quark-Bold'">ประวัติการสั่งซื้อ</h1>

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
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
