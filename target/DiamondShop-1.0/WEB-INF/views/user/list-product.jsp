<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Danh sách sản phẩm</title>
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
                        <h3>$${item.price}</h3>
                        <label class="checkbox">
                            <input type="checkbox"> Thêm so sánh
                        </label><br>
                        <div class="btn-group">
                            <a href="<c:url value="/them-gio-hang/${item.id}"/>" class="defaultBtn">
                                <span class="icon-shopping-cart"></span> Thêm vào giỏ
                            </a>
                            <a href="<c:url value="san-pham/chi-tiet-san-pham-${item.id}"/>" class="shopBtn">
                                Chi tiết
                            </a>
                        </div>
                    </form>
                </div>
            </div>
            <hr class="soften">
        </c:forEach>

        <div class="pagination-container" style="text-align: center; margin: 20px 0;">
            <ul class="pagination" style="display: inline-block; padding-left: 0; list-style: none;">
                <%-- Tạo nút trước nếu đang không active vào trang đầu tiên --%>
                <c:if test="${currentPage > 1}">
                    <li style="display: inline; margin-right: 5px;">
                        <a href="?page=${currentPage}" style="text-decoration: none; padding: 8px 12px; border: 1px solid #ddd; border-radius: 4px; background-color: #f8f9fa;">« Trước</a>
                    </li>
                </c:if>

                <%-- Duyệt qua các trang --%>
                <c:forEach begin="1" end="${totalPage}" var="i">
                    <li style="display: inline; margin-right: 5px;">
                        <a href="?page=${i}" style="${i == currentPage ? 'background-color: #007bff; color: white;' : 'background-color: #f8f9fa; color: black;'} text-decoration: none; padding: 8px 12px; border: 1px solid #ddd; border-radius: 4px;">${i}</a>
                    </li>
                </c:forEach>


                <%-- Tạo nút sau nếu đang không active vào trang cuối cùng--%>
                <c:if test="${currentPage < totalPage}">
                    <li style="display: inline; margin-right: 5px;">
                        <a href="?page=${currentPage}" style="text-decoration: none; padding: 8px 12px; border: 1px solid #ddd; border-radius: 4px; background-color: #f8f9fa;">Sau »</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
