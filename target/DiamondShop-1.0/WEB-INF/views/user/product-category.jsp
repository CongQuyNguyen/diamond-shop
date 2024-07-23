<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<%@ include file="/template/user/pagination.css"%>
<html>
<head>
    <title>Product</title>
</head>
<body>
<div class="span9">
<div class="well well-small">
    <h3> Danh sách sản phẩm: ${productsCategory.size()} </h3>
    <div class="row">
        <select class="pull-right">
            <option>A - Z</option>
            <option>Z - A</option>
            <option>Cao - Thấp (theo giá)</option>
            <option>Thấp - Cao (theo giá)</option>
            <option>Phổ biến</option>
            <option>Thời gian</option>
        </select>
    </div>
    <div class="row-fluid">

        <c:if test="${productsCategory.size() > 0}">
        <ul class="thumbnails">

            <c:forEach var="item" items="${productsCategory}" varStatus="loop">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> Xem nhanh</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/${item.colors.image}"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>${item.name}</p>
                            <p><strong> $${item.price}</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Thêm vào giỏ </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Danh sách yêu thích </a>
                                <a class="pull-left" href="#"> Thêm so sánh </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>

            <c:if test="${(loop.index + 1) % 3 == 0 || (loop.index + 1)  == productsCategory.size()}">
        </ul>
        <c:if test="${(loop.index + 1) < productsCategory.size()}">
        <ul class="thumbnails">
            </c:if>
            </c:if>
            </c:forEach>
            </c:if>
    </div>
</div>
    <div class="pagination">
        <a href="#">&laquo;</a>
        <a href="#">1</a>
        <a href="#" class="active">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">&raquo;</a>
    </div>
</div>
</body>
</html>
