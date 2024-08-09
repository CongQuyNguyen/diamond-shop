<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Cart product</title>
</head>
<body>
<div class="span9">
    <ul class="breadcrumb">
        <li><a href="<c:url value="/trang-chu"/>">Home</a> <span class="divider">/</span></li>
        <li class="active">Check Out</li>
    </ul>
    <div class="well well-small">
        <h3>Thông tin giỏ hàng <small class="pull-right"> ${cart.size()} sản phẩm </small></h3>
        <hr class="soften"/>

        <table class="table table-bordered table-condensed">
            <thead>
            <tr>
                <th>Sản phẩm</th>
                <th>Thông tin</th>
                <th>Chọn</th>
                <th>Mức giá</th>
                <th>Số lượng</th>
                <th>Tổng</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${cart}" varStatus="loop">
                <tr>
                    <td><img width="100" src="<c:url value="/template/assets/img/${item.value.productDetail.colors.get(0).image}"/>" alt=""></td>
                    <td>Items name here<br>Carate : 22<br>Model : n/a</td>
                    <td><span class="shopBtn"><span class="icon-ok"></span></span> </td>
                    <td>$${item.value.productDetail.price}</td>
                    <td>
                        <input class="span1" style="max-width:28px" placeholder="2" id="quantityCart${item.value.productDetail.id}" size="14" type="text" value="${item.value.quantity}">
                        <div class="input-append">
                            <button data-id="${item.key}" class="btn btn-mini btn-success btnUpdate" type="button"><span class="icon-edit"></span></button>
                            <a class="btn btn-mini btn-danger" type="button" href="<c:url value="/xoa-gio-hang/${item.value.productDetail.id}"/>"><span class="icon-remove"></span></a>
                        </div>
                    </td>
                    <td>$${item.value.totalPrice}</td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="6" class="alignR">Tổng giá trị:	</td>
                <td class="label label-primary"> $${totalPrice}</td>
            </tr>
            </tbody>
        </table><br/>

        <a href="<c:url value="/trang-chu"/>" class="shopBtn btn-large"><span class="icon-arrow-left"></span> Tiếp tục mua sắm </a>
        <%--Nếu đã đăng nhập thì đi đến thanh toán, còn kh thì phải đăng nhập--%>
        <security:authorize access="isAuthenticated()">
            <a href="<c:url value="/trang-chu/thanh-toan"/> " class="shopBtn btn-large pull-right">Thanh toán <span class="icon-arrow-right"></span></a>
        </security:authorize>

        <security:authorize access="isAnonymous()">
            <a href="<c:url value="/dang-nhap"/> " class="shopBtn btn-large pull-right">Thanh toán <span class="icon-arrow-right"></span></a>
        </security:authorize>

    </div>
</div>
<content tag="script">
    <script>
        $(".btnUpdate").on("click", function () {
            var id = $(this).data("id");
            var quantity = $("#quantityCart" + id).val();
            alert(quantity);
            window.location = "/sua-gio-hang/" + id + "/" + quantity;
        });
    </script>
</content>
</body>
</html>

<%--
    Chức năng giỏ hàng:
    - Thông tin 1: Thông tin của sản phẩm
    - Thông tin 2: Số lượng sản phẩm muốn mua
    - Thông tin 3: Total price tính toán được
    => Có danh sách các sản phẩm theo 3 thông tin trên
    Cho nen cần một đối tươn chứa 3 thông tin chính này (tạo trong DTO)

    Can thêm một class xử lý logic khi thực hiện thêm xóa hoặc sửa trong giỏ hàng
    => Thêm trong service

    Xây dựng một cấu trúc session lưu lại những sản phẩm mà ng dùng đã click chọn
    nhưng chưa thanh toán trong một khoản thời gian nhất định do chúng ta tự thiết lập


--%>
