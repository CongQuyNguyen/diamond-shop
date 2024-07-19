<%@include file="/common/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
<html>
<head>
  <meta charset="utf-8">
  <title>Twitter Bootstrap shopping cart</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <!-- Bootstrap styles -->
  <link href="<c:url value="/template/assets/css/bootstrap.css"/> " rel="stylesheet"/>
  <!-- Customize styles -->
  <link href="<c:url value="/template/style.css"/>" rel="stylesheet"/>
  <!-- font awesome styles -->
  <link href="<c:url value="/template/assets/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
  <!--[if IE 7]>
  <link href="<c:url value="/template/assets/font-awesome/css/font-awesome-ie7.min.css"/>" rel="stylesheet">
  <![endif]-->

  <!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->

  <!-- Favicons -->
  <link rel="shortcut icon" href="<c:url value="/template/assets/ico/favicon.ico"/>">
</head>
<body>

<%@include file="/common/user/header-upper.jsp"%>

<!--
Lower Header Section
-->
<div class="container">
  <div id="gototop"> </div>

  <%@include file="/common/user/header-lower.jsp"%>

  <!--
  Navigation Bar Section
  -->

  <%@include file="/common/user/nav-top.jsp"%>

  <!--
  Body Section
  -->
    <div class="row">

      <%@include file="/common/user/nav-left.jsp"%>

      <dec:body>

      </dec:body>

    </div>

  <!--
  Clients
  -->
  <%@include file="/common/user/footer.jsp"%>
  <!--
  Footer
  -->

</div><!-- /container -->

<%@include file="/common/user/sponsor.jsp"%>

<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value="/template/assets/js/jquery.js"/>"></script>
<script src="<c:url value="/template/assets/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/template/assets/js/jquery.easing-1.3.min.js"/>"></script>
<script src="<c:url value="/template/assets/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
<script src="<c:url value="/template/assets/js/shop.js"/>"></script>
</body>
</html>--%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Twitter Bootstrap shopping cart</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->
    <link href="<c:url value="/template/assets/css/bootstrap.css"/> " rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="<c:url value="/template/style.css"/>" rel="stylesheet"/>
    <!-- font awesome styles -->
    <link href="<c:url value="/template/assets/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <!--[if IE 7]>
  <link href="<c:url value="/template/assets/font-awesome/css/font-awesome-ie7.min.css"/>" rel="stylesheet">
  <![endif]-->

    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Favicons -->
    <link rel="shortcut icon" href="<c:url value="/template/assets/ico/favicon.ico"/>">
</head>
<body>
<!--
	Upper Header Section
-->

<%@include file="/common/user/header-upper.jsp"%>

<!--
Lower Header Section
-->
<div class="container">
    <div id="gototop"> </div>

    <%@include file="/common/user/header-lower.jsp"%>

    <!--
    Navigation Bar Section
    -->

    <%@include file="/common/user/nav-top.jsp"%>

    <!--
    Body Section
    -->
    <div class="row">

        <dec:body>

        </dec:body>

    </div>
    <!--
    Footer
    -->

    <%@include file="/common/user/footer.jsp"%>

</div><!-- /container -->

<%@include file="/common/user/sponsor.jsp"%>

<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value="/template/assets/js/jquery.js"/>"></script>
<script src="<c:url value="/template/assets/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/template/assets/js/jquery.easing-1.3.min.js"/>"></script>
<script src="<c:url value="/template/assets/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
<script src="<c:url value="/template/assets/js/shop.js"/>"></script>
</body>
</html>