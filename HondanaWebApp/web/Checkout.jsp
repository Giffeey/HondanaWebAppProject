<%-- 
    Document   : Shipping
    Created on : Nov 12, 2018, 2:14:55 PM
    Author     : GIFS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hondana Bookstore | Checkout</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="css/form-validation.css" rel="stylesheet">
    </head>
    <jsp:include page="Head.jsp"></jsp:include>
        <body class="bg-light">

            <div class="container">
                <div class="py-5 text-center">
                    <img class="d-block mx-auto mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
                    <h2>Checkout</h2>

                </div>
<<<<<<< HEAD:HondanaWebApp/web/Shipping.jsp
                <form class="needs-validation" novalidate action="Shipping" method="post">
=======
                <form class="needs-validation" novalidate action="Checkout" method="post"> 
>>>>>>> 6868a33d04a875fc764646c341d45b1e938077d9:HondanaWebApp/web/Checkout.jsp
                    <div class="row">
                        <div class="col-md-4 order-md-2 mb-4">
                            <h4 class="d-flex justify-content-between align-items-center mb-3">
                                <span class="text-muted">Your cart</span>
                                <span class="badge badge-secondary badge-pill">${cart.totalQuantity}</span>
                        </h4>
                        <ul class="list-group mb-4">
                            <c:forEach items="${LineItem}" var="line"> 
                                <li class="list-group-item d-flex justify-content-between lh-condensed">
                                    <div>
                                        <h6 class="my-0">${line.book.bookname}</h6>
                                        <small class="text-muted">${line.quantity} เล่ม</small>
                                    </div>
                                    <span class="text-muted">${line.totalPrice}฿</span>
                                </li>
                            </c:forEach>
                            <li class="list-group-item d-flex justify-content-between bg-light">
                                <div class="text-success">
                                    <h6 class="my-0">ค่าขนส่ง</h6>
                                    <small>ฟรี</small>

                                </div>
                                <span class="text-success">
                                    0฿
                                </span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between">
                                <span>รวม</span>
                                <strong><input type="hidden" name="amount" value="${cart.totalPrice}">${cart.totalPrice}฿</strong>
                            </li>
                        </ul>

                    </div>
                    <div class="col-md-8 order-md-1">
                        <h4 class="mb-3">Billing address</h4>

                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="firstName">First name</label>
                                <input type="text" class="form-control" id="firstName" placeholder="" value="${customer.firstname}" required>
                                <div class="invalid-feedback">
                                    Valid first name is required.
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="lastName">Last name</label>
                                <input type="text" class="form-control" id="lastName" placeholder="" value="${customer.lastname}" required>
                                <div class="invalid-feedback">
                                    Valid last name is required.
                                </div>
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="address">Address</label>
                            <input type="text" name="shipAddress" class="form-control" id="address" placeholder="55/55 ถ.หญ้ารก ต.น้ำใส อ.เห็นปลา จ.งามดี 55555" value="${customer.address}" required>
                            <div class="invalid-feedback">
                                Please enter your shipping address.
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-5 mb-3">
                                <label for="country">Method</label>
                                <select name="shipMethod"class="custom-select d-block w-100" id="method" required>
                                    <option value="Register">Register</option>
                                    <option value="EMS">EMS</option>
                                </select>
                                <div class="invalid-feedback">
                                    Please select a method.
                                </div>
                            </div>
                        </div>

                        <hr class="mb-4">

                        <h4 class="mb-3">Payment</h4>


                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="cc-name">Name on card</label>
                                <input type="text" class="form-control" id="cc-name" placeholder="" required>
                                <small class="text-muted">Full name as displayed on card</small>
                                <div class="invalid-feedback">
                                    Name on card is required
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="cc-number">Credit card number</label>
                                <input type="text" class="form-control" id="cc-number" placeholder="" required>
                                <div class="invalid-feedback">
                                    Credit card number is required
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3 mb-3">
                                <label for="cc-expiration">Expiration</label>
                                <input type="date" class="form-control" id="cc-expiration" required>
                                <div class="invalid-feedback">
                                    Expiration date required
                                </div>
                            </div>
                            <div class="col-md-4 mb-4">
                                <label for="cc-expiration">CVV</label>
                                <input type="text" class="form-control" id="cc-cvv" placeholder="" required>
                                <div class="invalid-feedback">
                                    Security code required
                                </div>
                            </div>
                        </div>
                        <hr class="mb-4">

                        <button class="btn btn-primary btn-lg btn-block" type="submit">Continue to checkout</button>
                    </div>

                </div>
            </form>
            <div class="py-5 text-center"></div>

        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="../../../../assets/js/vendor/popper.min.js"></script>
        <script src="../../../../dist/js/bootstrap.min.js"></script>
        <script src="../../../../assets/js/vendor/holder.min.js"></script>
        <script>
            // Example starter JavaScript for disabling form submissions if there are invalid fields
            (function () {
                'use strict';

                window.addEventListener('load', function () {
                    // Fetch all the forms we want to apply custom Bootstrap validation styles to
                    var forms = document.getElementsByClassName('needs-validation');

                    // Loop over them and prevent submission
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
        </script>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
