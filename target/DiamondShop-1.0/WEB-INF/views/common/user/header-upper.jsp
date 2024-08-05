<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="com.congquy.diamondshop.utils.SecurityUtils" %>
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
                <a class="active" href="index.html"> <span class="icon-home"></span>  Trang chủ   </a>
                <a href="contact.html"><span class="icon-envelope"></span>  Về chúng tôi   </a>
                <security:authorize access="isAuthenticated()">
                    <a href="#"><span class="icon-user"></span>  <%=SecurityUtils.getPrincipal().getFullName()%>   </a>
                    <a href="<c:url value="/dang-xuat"/> "><span class="icon-edit"></span>  Đăng xuất   </a>
                    <a href="<c:url value="/trang-chu/gio-hang"/> "><span class="icon-shopping-cart"></span> ${cart.size()}  Sản phẩm - <span class="badge badge-warning"> $${totalPrice}</span></a>
                </security:authorize>

                <security:authorize access="isAnonymous()">
                    <a href="<c:url value="/dang-nhap"/> "><span class="icon-edit"></span>  Đăng nhập</a>
                </security:authorize>
            </div>
        </div>
    </div>
</div>
