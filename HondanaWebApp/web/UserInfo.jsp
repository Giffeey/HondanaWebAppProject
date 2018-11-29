<%-- 
    Document   : UserInfo
    Created on : Nov 13, 2018, 2:39:57 PM
    Author     : GIFS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HONDANA | USERINFO</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <style>
            /*@import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);
            @import url(https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.3/css/mdb.min.css);*/

            .hm-gradient {
                background-image: linear-gradient(to top, #f3e7e9 0%, #e3eeff 99%, #e3eeff 100%);
            }
            .darken-grey-text {
                color: #2E2E2E;
            }
            .danger-text {
                color: #ff3547; }
            .default-text {
                color: #2BBBAD; 
            }
            .info-text {
                color: #33b5e5; 
            }
            .form-white .md-form label {
                color: #fff; 
            }
            .form-white input[type=text]:focus:not([readonly]) {
                border-bottom: 1px solid #fff;
                -webkit-box-shadow: 0 1px 0 0 #fff;
                box-shadow: 0 1px 0 0 #fff; 
            }
            .form-white input[type=text]:focus:not([readonly]) + label {
                color: #fff; 
            }
            .form-white input[type=password]:focus:not([readonly]) {
                border-bottom: 1px solid #fff;
                -webkit-box-shadow: 0 1px 0 0 #fff;
                box-shadow: 0 1px 0 0 #fff; 
            }
            .sign-in{
                text-align: center;
            }
            .block{
                /*                color: #4D4845;*/
                color:rgba(255, 99, 71, 0.8);
            }

            .button{
                font-size: 16px;
                margin: 4px 2px;
                padding: 12px 20px;
                border-radius: 12px;

            }
            .button1 {
                background-color: white; 
                color: #4D4845; 
                border: 1px solid #4D4845;
            }

            .button1:hover {
                background-color: #FC9C72;
                color: #4D4845;
                border: 1px solid #FC9C72;
            }
        </style> 
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>
            <div class="slide-contaner" style="background-image: url(img/book.png);">


                <div class="container " style="width: 40rem" name="block" >
                    <div class="row">
                        <!-- Grid column -->
                        <div class="col-12 p-5" name="sign-in" >
                            <div class="card">
                                <div class="card-body">
                                    <!--<h3 class="text-center default-text py-3" style="color:#4D4845"><i class="fa fa-lock"></i> SIGN IN</h3>-->
                                    <div align="center">
                                        <img src="img/user.png" style="margin:auto; width:100px; height:100px;" >
                                    </div><br>
                                    <!--Body-->
                                    <div class="center"><center>
                                        ${customer.username}</center><br>

                                </div>
                                <div class="md-form">
                                    First Name : <br>
                                    ${customer.firstname}<br>

                                </div>
                                <div class="md-form">
                                    Last Name : <br>
                                    ${customer.lastname}<br>

                                    <div class="md-form">
                                        Phone : <br>
                                        ${customer.phone}<br>

                                    </div>
                                    <div class="md-form">
                                        E-mail :<br>
                                        ${customer.email}<br>

                                    </div>

                                    <div class="form-group">
                                        Address :<br>
                                        ${customer.address}<br>

                                    </div>

                                    <form action="History" method="post"> 
                                        <div class="text-center" name="si">

                                             <button type="submit" class="button button1">ประวัติการซื้อ</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>     

    </body> <jsp:include page="Footer.jsp"></jsp:include>
</html>
