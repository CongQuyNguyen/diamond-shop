<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Product</title>
    <style>
        .pagination {
            display: flex;
            justify-content: center;
            background-color: #fff;
        }

        .pagination a {
            color: black;
            float: left;
            padding: 8px 16px;
            text-decoration: none;
            transition: background-color .3s;
            border: 1px solid #ddd;
        }

        .pagination a.active {
            background-color: #4CAF50;
            color: white;
            border: 1px solid #4CAF50;
        }

        .pagination a:hover:not(.active) {background-color: #ddd;}
    </style>
</head>
<body>
<div class="span9">
<div class="well well-small">
    <h3> Danh sách sản phẩm: ${productsPagination.size()} </h3>
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

        <c:if test="${productsPagination.size() > 0}">
        <ul class="thumbnails">

            <c:forEach var="item" items="${productsPagination}" varStatus="loop">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="<c:url value="/san-pham/chi-tiet-san-pham-${item.id}"/>" class="overlay"></a>
                        <a class="zoomTool" href="<c:url value="/san-pham/chi-tiet-san-pham-${item.id}"/>" title="Xem chi tiết"><span class="icon-search"></span> Xem nhanh</a>
                        <a href="<c:url value="/san-pham/chi-tiet-san-pham-${item.id}"/>"><img src="<c:url value="/template/assets/img/${item.colors.get(0).image}"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>${item.name}</p>
                            <p><strong> $${item.price}</strong></p>
                            <h4><a class="shopBtn" href="<c:url value="/them-gio-hang/${item.id}"/>"> Thêm vào giỏ </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Yêu thích</a>
                                <a class="pull-left" href="#">So sánh</a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>

            <c:if test="${(loop.index + 1) % 3 == 0 || (loop.index + 1)  == productsPagination.size()}">
        </ul>
        <c:if test="${(loop.index + 1) < productsPagination.size()}">
        <ul class="thumbnails">
            </c:if>
            </c:if>
            </c:forEach>
            </c:if>
    </div>
</div>
    <div class="pagination">
        <%--<a href="">&laquo;</a>--%>
        <c:forEach var="item" begin="1" end="${paginateDTO.totalPage}" varStatus="loop">
            <c:if test="${(loop.index) == paginateDTO.currentPage}">
                <a href="<c:url value="/san-pham/danh-sach-grid/${idPaginate}/${loop.index}"/>" class="active">${loop.index}</a>
            </c:if>
            <c:if test="${(loop.index) != paginateDTO.currentPage}">
                <a href="<c:url value="/san-pham/danh-sach-grid/${idPaginate}/${loop.index}"/>">${loop.index}</a>
            </c:if>
        </c:forEach>
        <%--<a href="">&raquo;</a>--%>
    </div>
</div>

</body>
</html>
