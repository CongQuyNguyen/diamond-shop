<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Header</title>
</head>
<body>

<header id="header">
    <div class="row">
        <div class="span6 alignL">
            <h1>
                <a class="logo" href="index.html"><span>Twitter Bootstrap ecommerce template</span>
                    <img src="<c:url value="/template/assets/img/logo-bootstrap-shoping-cart.png"/> " alt="bootstrap sexy shop">
                </a>
            </h1>
        </div>

        <div class="span6 alignR">
            <p><br> <strong> Support (24/7) :  0976 870 127 </strong><br><br></p>
            <c:if test="${totalQuantity == null}">
                <span class="btn btn-mini">[ Số lượng: 0 ] <span class="icon-shopping-cart"></span></span>
            </c:if>
            <c:if test="${totalQuantity != null}">
                <span class="btn btn-mini">[ Số lượng: ${totalQuantity} ] <span class="icon-shopping-cart"></span></span>
            </c:if>
            <span class="btn btn-warning btn-mini">$</span>
        </div>
    </div>
</header>
</body>
</html>
