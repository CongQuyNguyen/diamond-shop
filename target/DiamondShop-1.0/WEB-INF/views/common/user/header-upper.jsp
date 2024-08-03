<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
<!--
	Upper Header Section
-->
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="topNav">
        <div class="container">
            <div class="alignR">
                <div class="pull-left socialNw">
                    <a href="#"><span class="icon-twitter"></span></a>
                    <a href="#"><span class="icon-facebook"></span></a>
                    <a href="#"><span class="icon-youtube"></span></a>
                    <a href="#"><span class="icon-tumblr"></span></a>
                </div>
                <a class="active" href="index.html"> <span class="icon-home"></span> Home</a>
                <a href="#"><span class="icon-user"></span> My Account</a>
                <a href="<c:url value="/dang-nhap/tao-tai-khoan"/> "><span class="icon-edit"></span> Free Register</a>
                <a href="contact.html"><span class="icon-envelope"></span> Contact us</a>
                <a href="<c:url value="/trang-chu/gio-hang"/> "><span class="icon-shopping-cart"></span> ${cart.size()} Sản phẩm - <span class="badge badge-warning"> $${totalPrice}</span></a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
