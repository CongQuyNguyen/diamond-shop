<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/9/2024
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/views/common/taglib.jsp"%>
<%@ page import="com.congquy.diamondshop.utils.SecurityUtils" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="span9">
<div class="well">
    <form class="form-horizontal" action="/trang-chu/thanh-toan" method="post" modelAttribute="bills">
        <h3>Chi tiết hóa đơn của bạn</h3><br>

        <div class="control-group">
            <label class="control-label">Họ tên <sup>*</sup></label>
            <div class="controls">
                <input type="text" placeholder="Field name" value="<%=SecurityUtils.getPrincipal().getFullName()%>" name="fullName">
            </div>
        </div>
        <br>
        <div class="control-group">
            <label class="control-label">Email <sup>*</sup></label>
            <div class="controls">
                <input type="text" placeholder="Your email" value="<%=SecurityUtils.getPrincipal().getEmail()%>" name="email">
            </div>
        </div>
        <br>
        <div class="control-group">
            <label class="control-label">Liên hệ <sup>*</sup></label>
            <div class="controls">
                <input type="text" placeholder="Fax or number phone" name="contact">
            </div>
        </div>
        <br>
        <div class="control-group">
            <label class="control-label">Địa chỉ <sup>*</sup></label>
            <div class="controls">
            <textarea name="address">
                <%=SecurityUtils.getPrincipal().getAddress()%>
            </textarea>
            </div>
        </div>
        <br>
        <div class="control-group">
            <label class="control-label">Ghi chú <sup>*</sup></label>
            <div class="controls">
                <textarea name="note"></textarea>
            </div>
        </div>
        <br>
        <div class="control-group">
            <div class="controls">
                <input type="submit" name="submitAccount" value="Thanh toán" class="shopBtn exclusive">
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>

<%--



--%>
