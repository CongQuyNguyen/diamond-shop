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
        <h3>Sản phẩm mới </h3>
        <hr class="soften"/>
        <div class="row-fluid">
            <div id="newProductCar" class="carousel slide">
                <div class="carousel-inner">
                    <div class="item active">
                        <ul class="thumbnails">
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a href="#" class="tag"></a>
                                    <a href="product_details.html"><img src="<c:url value="/template/assets/img/bootstrap-ring.png"/>" alt="bootstrap-ring"></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a href="#" class="tag"></a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/i.jpg"/>" alt=""></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a href="#" class="tag"></a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/g.jpg"/>" alt=""></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/s.png"/>" alt=""></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="item">
                        <ul class="thumbnails">
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/i.jpg"/>" alt=""></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/f.jpg"/>" alt=""></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/h.jpg"/>" alt=""></a>
                                </div>
                            </li>
                            <li class="span3">
                                <div class="thumbnail">
                                    <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                                    <a  href="product_details.html"><img src="<c:url value="/template/assets/img/j.jpg"/>" alt=""></a>
                                </div>
                            </li>
                        </ul>
                    </div>
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
        <h3><a class="btn btn-mini pull-right" href="<c:url value="four-columns-view.jsp"/> " title="View more">Xem thêm <span class="icon-plus"></span></a> Sản phẩm nổi bật  </h3>
        <hr class="soften"/>
        <div class="row-fluid">

            <%--Hiển thị sản phẩm nổi bậc--%>
                <c:if test="${products.size() > 0}">
                <ul class="thumbnails">

                    <c:forEach var="item" items="${products}" varStatus="loop">
                    <li class="span4">
                        <div class="thumbnail">
                            <a class="zoomTool" href="#" title="add to cart">
                                <span class="icon-search"></span> Xem nhanh</a>
                            <a href="san-pham/chi-tiet-san-pham/${item.id}"><img
                                src="<c:url value="/template/assets/img/${item.colors.image}"/>"
                                alt=""></a>
                            <div class="caption">
                                <h5>${item.name}</h5>
                                <h4>
                                    <a class="defaultBtn" href="product_details.html"
                                       title="Click to view"><span class="icon-zoom-in"></span></a> <a
                                        class="shopBtn" href="#" title="add to cart"><span
                                        class="icon-plus"></span></a> <span class="pull-right">${item.price}</span>
                                </h4>
                            </div>
                        </div>
                    </li>

                    <c:if test="${(loop.index + 1) % 3 == 0 || (loop.index + 1)  == products.size()}">
                </ul>
                    <c:if test="${(loop.index + 1) < products.size()}">
                <ul class="thumbnails">
                    </c:if>
                    </c:if>
                    </c:forEach>
                </c:if>
        </div>
    </div>

    <hr>
    <div class="well well-small">
        <a class="btn btn-mini pull-right" href="#">View more <span class="icon-plus"></span></a>
        Best selling Products
    </div>

</div>
</body>
</html>
