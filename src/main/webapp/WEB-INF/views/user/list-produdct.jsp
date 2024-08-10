<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/27/2024
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Chi tiết sản phẩm</title>
</head>
<body>
<div class="span9">
    <div class="well well-small">
        <c:forEach var="item" items="${listProduct}" varStatus="index">
            <div class="row-fluid">
                <div class="span2">
                    <img src="<c:url value="/template/assets/img/${item.colors.get(0).image}" />" alt="">
                </div>
                <div class="span6">
                    <h5>${item.name} </h5>
                    <p>${item.description}</p>
                </div>
                <div class="span4 alignR">
                    <form class="form-horizontal qtyFrm">
                        <h3> $${item.price}</h3>
                        <label class="checkbox">
                            <input type="checkbox">  Thêm so sánh
                        </label><br>
                        <div class="btn-group">
                            <a href="<c:url value="/them-gio-hang/${item.id}"/>" class="defaultBtn"><span class=" icon-shopping-cart"></span> Thêm vào giỏ</a>
                            <a href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/>" class="shopBtn">Chi tiết</a>
                        </div>
                    </form>
                </div>
            </div>
            <hr class="soften">
        </c:forEach>
    </div>
</div>
</body>
</html>
