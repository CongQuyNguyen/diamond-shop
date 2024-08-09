<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Navigation</title>
</head>
<body>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="nav-collapse">
                <ul class="nav">
                    <c:forEach var="item" items="${menus}" varStatus="index">
                        <c:if test="${index.first}">
                            <li class="active">
                        </c:if>
                        <c:if test="${not index.first}">
                            <li class="">
                        </c:if>
                        <a href="index.html">${item.name}</a></li>
                    </c:forEach>
                </ul>

                <ul class="nav pull-right" style="margin-right: 10px">
                    <li class="dropdown">
                        <form action="#" class="navbar-search pull-left">
                            <input type="text" placeholder="Search" class="search-query span2">
                        </form>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
