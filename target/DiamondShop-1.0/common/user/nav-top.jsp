<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
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
                    <li class="active"><a href="index.html">Home	</a></li>
                    <li class=""><a href="list-view.html">List View</a></li>
                    <li class=""><a href="grid-view.html">Grid View</a></li>
                    <li class=""><a href="four-col.html">Four Column</a></li>
                    <li class=""><a href="general.html">General Content</a></li>
                    <li class=""><a href="https://www.youtube.com/watch?v=IQOOY8CsMwQ">About us</a></li>
                </ul>
                <form action="#" class="navbar-search pull-left">
                    <input type="text" placeholder="Search" class="search-query span2">
                </form>
                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#"><span class="icon-lock"></span> Login <b class="caret"></b></a>
                        <div class="dropdown-menu">
                            <form class="form-horizontal loginFrm">
                                <div class="control-group">
                                    <input type="text" class="span2" id="inputEmail" placeholder="Email">
                                </div>
                                <div class="control-group">
                                    <input type="password" class="span2" id="inputPassword" placeholder="Password">
                                </div>
                                <div class="control-group">
                                    <label class="checkbox">
                                        <input type="checkbox"> Remember me
                                    </label>
                                    <button type="submit" class="shopBtn btn-block">Sign in</button>
                                </div>
                            </form>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
