<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Header</title>
</head>
<body>

<header id="header">
    <div class="row">
        <div class="span4 alignL">
            <h1>
                <a class="logo" href="index.html"><span>Twitter Bootstrap ecommerce template</span>
                    <img src="<c:url value="/template/assets/img/logo-bootstrap-shoping-cart.png"/> " alt="bootstrap sexy shop">
                </a>
            </h1>
        </div>
        <div class="span4">
            <div class="offerNoteWrapper">
                <h1 class="dotmark">
                    <i class="icon-cut"></i>
                    Twitter Bootstrap shopping cart HTML template is available @ $14
                </h1>
            </div>
        </div>
        <div class="span4 alignR">
            <p><br> <strong> Support (24/7) :  0800 1234 678 </strong><br><br></p>
            <span class="btn btn-mini">[ 2 ] <span class="icon-shopping-cart"></span></span>
            <span class="btn btn-warning btn-mini">$</span>
            <span class="btn btn-mini">&pound;</span>
            <span class="btn btn-mini">&euro;</span>
        </div>
    </div>
</header>
</body>
</html>
