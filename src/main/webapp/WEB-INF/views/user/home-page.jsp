<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglib.jsp"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="span9">
    <div class="well np">
        <div id="myCarousel" class="carousel slide homCar">
            <div class="carousel-inner">
                <c:forEach var="item" items="${slides}" varStatus="index">
                    <c:if test="${index.first}">
                        <div class="item active">
                    </c:if>
                    <c:if test="${not index.first}">
                        <div class="item">
                    </c:if>
                            <img style="width:100%" src="<c:url value="/template/assets/img/${item.image}"/>" alt="bootstrap ecommerce templates">
                            <div class="carousel-caption">
                                <h4>${item.title}</h4>
                                <p><span>${item.description}</span></p>
                            </div>
                        </div>
                </c:forEach>

            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div>
    </div>
    <!--
    New Products
    -->
    <div class="well well-small">
        <h3>Sản phẩm mớii</h3>
        <hr class="soften"/>
        <div class="row-fluid">
            <div id="newProductCar" class="carousel slide">
                <div class="carousel-inner">
                    <c:if test="${productsNew.size() > 0}">
                    <div class="item active">
                        <ul class="thumbnails">
                            <c:forEach var="item" items="${productsNew}" varStatus="loop">
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/>"
                                       title="add to cart"><span class="icon-search"></span>
                                        Xem nhanh</a> <a href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/>"><img
                                        src="<c:url value="/template/assets/img/${item.colors.get(0).image}"/>" alt=""></a>
                                </div>
                            </li>
                            <c:if test="${(loop.index + 1) % 4 == 0 || (loop.index + 1)  == productsNew.size()}">
                        </ul>
                    </div>
                    <c:if test="${(loop.index + 1) < productsNew.size()}">
                    <div class="item">
                        <ul class="thumbnails">
                            </c:if>
                            </c:if>
                            </c:forEach>
                    </c:if>
                </div>
                <a class="left carousel-control" href="#newProductCar" data-slide="prev">&lsaquo;</a>
                <a class="right carousel-control" href="#newProductCar" data-slide="next">&rsaquo;</a>
            </div>
        </div>
    </div>
    <!--
    Featured Products
    -->
    <div class="well well-small">
        <h3> Sản phẩm nổi bật </h3>
        <hr class="soften"/>
        <div class="row-fluid">

            <%--Hiển thị sản phẩm nổi bậc--%>
                <c:if test="${productsHighlight.size() > 0}">
                <ul class="thumbnails">

                    <c:forEach var="item" items="${productsHighlight}" varStatus="loop">
                    <li class="span4">
                        <div class="thumbnail">
                            <a class="zoomTool" href="#" title="add to cart">
                                <span class="icon-search"></span> Xem nhanh</a>
                            <a href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/> "><img
                                src="<c:url value="/template/assets/img/${item.colors.get(0).image}"/>"
                                alt=""></a>
                            <div class="caption">
                                <h5>${item.name}</h5>
                                <h4>
                                    <a class="defaultBtn" href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/>"
                                       title="Click to view"><span class="icon-zoom-in"></span></a> <a
                                        class="shopBtn" href="#" title="add to cart"><span
                                        class="icon-plus"></span></a> <span class="pull-right">$ ${item.price}</span>
                                </h4>
                            </div>
                        </div>
                    </li>

                    <c:if test="${(loop.index + 1) % 3 == 0 || (loop.index + 1)  == productsHighlight.size()}">
                </ul>
                    <c:if test="${(loop.index + 1) < productsHighlight.size()}">
                <ul class="thumbnails">
                    </c:if>
                    </c:if>
                    </c:forEach>
                </c:if>
        </div>
    </div>

    <hr>
    <div class="well well-small">
        <a class="btn btn-mini pull-right" href="#">Xem thêm <span class="icon-plus"></span></a>
        Tất cả sản phẩm
    </div>

</div>
</body>
</html>
