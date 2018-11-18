<%-- 
    Document   : Register
    Created on : Nov 13, 2018, 2:06:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
            <form action="Register" method="post">
                <div class="container " style="width: 50rem">
                    <div class="row">

                        <div class="col-12 p-5" name="sign-in" >
                            <div class="card">
                                <div class="card-body">
                                    <h3 class="text-center default-text py-3" style="color:#4D4845"><i class="fa fa-lock"></i> SIGN IN</h3>

                                    <div class="md-form">
                                        <i class="fa fa-envelope prefix grey-text"></i>

                                        <input type="text" class="form-control mb-2 mr-sm-2" id="fname" name="fName" placeholder="First Name"><br>
                                    </div>
                                    <div class="md-form">
                                        <i class="fa fa-lock prefix grey-text"></i>

                                        <input type="text" class="form-control mb-2 mr-sm-2" id="lname" name="lName" placeholder="Last Name"><br>
                                    </div>
                                    <div class="md-form">
                                        <i class="fa fa-lock prefix grey-text"></i>

                                        <input type="text" class="form-control mb-2 mr-sm-2" id="user" name="username" placeholder="User Name"><br>
                                    </div>
                                    <div class="md-form">
                                        <i class="fa fa-lock prefix grey-text"></i>

                                        <input type="password" class="form-control mb-2 mr-sm-2" id="psw" name="password" placeholder="Password"><br>
                                    </div>

                                    <div class="md-form">
                                        <i class="fa fa-lock prefix grey-text"></i>
                                        <!--                                <input type="text" id="phone" class="form-control">
                                                                        <label for="phone">Phone</label>-->
                                        <input type="tel" class="form-control mb-2 mr-sm-2" id="tel" name="phone" placeholder="Phone"><br>
                                    </div>
                                    <div class="md-form">
                                        <i class="fa fa-lock prefix grey-text"></i>

                                        <input type="email" class="form-control mb-2 mr-sm-2" id="email" name="email" placeholder="E-mail"><br>
                                    </div>
                                    <div class="form-group">

                                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="address" placeholder="Address"></textarea>
                                    </div>
                                    </form>

                                    <div class="text-center" name="signup">

                                        <button type="submit" class="button button1"> Sign up</button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
