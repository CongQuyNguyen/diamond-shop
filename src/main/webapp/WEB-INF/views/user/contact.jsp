<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/10/2024
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<%@ page import="com.congquy.diamondshop.utils.SecurityUtils" %>
<html>
<head>
    <title>Thông tin liên hệ</title>
</head>
<body>
<hr class="soften">
<div class="well well-small">
  <h1>Địa chỉ</h1>
  <hr class="soften"/>
  <div class="row-fluid">
    <div class="span8 relative">
      <iframe style="width:100%; height:350px" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="<c:url value='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.4822670896295!2d106.76911247496506!3d10.850840258488987!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752777da1a0db9%3A0xf0fc3c319f0c7b5c!2sHo%20Chi%20Minh%20City%20University%20of%20Technology%20and%20Education!5e0!3m2!1sen!2s!4v1691666819535!5m2!1sen!2s'/>"></iframe>
      <div class="absoluteBlk">
        <div class="well wellsmall">
          <h4>Chi tiết liên hệ</h4>
          <h5>
            Số 1 Võ Văn Ngân.<br/>
            Phường Linh Chiểu, Quận Thủ Đức, Tp. Hồ Chí Minh<br/><br/>

            nguyencongquy296@gmail.com<br/>
            ﻿Tel 0976870127<br/>
            Fax 0813853153<br/>
          </h5>
        </div>
      </div>
    </div>

    <div class="span4">
      <h4>Liên hệ</h4>
      <form class="form-horizontal">
        <fieldset>
          <security:authorize access="isAuthenticated()">
            <div class="control-group">
              <input type="text" placeholder="Tên" class="input-xlarge" value="<%=SecurityUtils.getPrincipal().getFullName()%>"/>
            </div>
            <div class="control-group">
              <input type="text" placeholder="Email" class="input-xlarge" value="<%=SecurityUtils.getPrincipal().getEmail()%>"/>
            </div>
          </security:authorize>

          <security:authorize access="isAnonymous()">
            <div class="control-group">
              <input type="text" placeholder="Tên" class="input-xlarge" value=""/>
            </div>
            <div class="control-group">
              <input type="text" placeholder="Email" class="input-xlarge" value=""/>
            </div>
          </security:authorize>

          <div class="control-group">
            <input type="text" placeholder="Tiêu đề" class="input-xlarge"/>
          </div>
          <div class="control-group">
            <textarea rows="3" id="textarea" class="input-xlarge"></textarea>
          </div>

          <button class="shopBtn" type="submit">Gửi</button>

        </fieldset>
      </form>
    </div>
  </div>


</div>
</body>
</html>
