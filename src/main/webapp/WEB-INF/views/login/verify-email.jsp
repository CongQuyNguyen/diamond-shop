<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="span12">
    <ul class="breadcrumb">
        <li><a href="index.html">Home</a> <span class="divider">/</span></li>
        <li class="active">Login</li>
    </ul>
    <h3> Login</h3>
    <hr class="soft"/>

    <c:if test="${param.incorrectAccount != null}">
        <div class="alert alert-error">
            Tên đăng nhập hoặc mật khẩu không hợp lệ
        </div>
    </c:if>
    <c:if test="${param.accessDenied != null}">
        <div class="alert alert-danger">
            Bạn không có quyền truy cập
        </div>
    </c:if>
    <div class="row">
        <div class="span5">
            <div class="well">
                <h5>Xác thực Email</h5>
                <form action="/dang-ky/xac-thuc-email" method="post">
                    <div class="control-group">
                        <label class="control-label">E-mail</label>
                        <div class="controls">
                            <input class="span4" name="email" type="text" value="${email}" readonly>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label">Mã xác nhận</label>
                        <div class="controls">
                            <input class="span4" name="code" type="text" placeholder="Your code in email">
                        </div>
                    </div>
                    <div class="controls">
                        <button type="submit" class="btn btn-success">Kích hoạt</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="span2"> &nbsp;</div>
        <div class="span5">
            <div class="well">
                <h5>Bạn đã có tài khoản ?</h5>
                <form action="/j_spring_security_check" method="post" id="formLogin">
                    <div class="control-group">
                        <label class="control-label">Tên đăng nhập</label>
                        <div class="controls">
                            <input class="span4"  type="text" placeholder="Username" id="username" name="j_username">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label">Mật khẩu</label>
                        <div class="controls">
                            <input type="password" class="span4" placeholder="Password" id="password" name="j_password">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <button type="submit" class="defaultBtn">Đăng nhập</button>
                            <a href="#">Quên mật khẩu?</a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
</body>
</html>
