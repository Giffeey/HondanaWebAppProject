<%-- 
    Document   : login
    Created on : 11-Nov-2018, 21:26:05
    Author     : IAMIN
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>--%>
<html>
    <head>
        <title>HONDANA | LOGIN</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">  
        <link href="css/csslogin.css" rel="stylesheet" type="text/css"/>
        <jsp:include page="Head.jsp"></jsp:include>
    </head>
    <body>
        <div class="container">
            <h1 class="form-heading">login Form</h1>
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>SIGN IN</h2>
                    </div><br>
                    <form action="Login" method="post">

                        <div class="form-group">
                            <input type="text" name="username" class="form-control" id="inputEmail" placeholder="Username" required>

                        </div>

                        <div class="form-group">

                            <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password" required>

                        </div>
                        <button type="submit" class="btn btn-primary">SIGN IN</button>
                    </form> 
                    <p style="color: red">${msg}</p>
                </div>
                
            </div>
        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
