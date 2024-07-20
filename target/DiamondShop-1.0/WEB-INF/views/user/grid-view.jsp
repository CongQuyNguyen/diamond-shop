<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/18/2024
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Sản phẩm</title>
</head>
<body>
<div id="sidebar" class="span3">
    <div class="well well-small">
        <ul class="nav nav-list">
            <c:forEach var="item" items="${categories}" varStatus="index">
                <li><a href="products.html"><i class="icon-circle-blank"></i>  ${item.name}</a></li>
            </c:forEach>

            <li style="border:0"> &nbsp;</li>
            <li> <a class="totalInCart" href="cart.html"><strong>Total Amount  <span class="badge badge-warning pull-right" style="line-height:18px;">$448.42</span></strong></a></li>
        </ul>
    </div>

    <div class="well well-small alert alert-warning cntr">
        <h2>50% Discount</h2>
        <p>
            only valid for online order. <br><br><a class="defaultBtn" href="#">Click here </a>
        </p>
    </div>
    <div class="well well-small" ><a href="#"><img src="<c:url value="/template/assets/img/paypal.jpg"/> " alt="payment method paypal"></a></div>

    <a class="shopBtn btn-block" href="#">Upcoming products <br><small>Click to view</small></a>
    <br>
    <br>
    <ul class="nav nav-list promowrapper">
        <li>
            <div class="thumbnail">
                <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                <img src="<c:url value="/template/assets/img/bootstrap-ring.png"/> " alt="bootstrap ecommerce templates">
                <div class="caption">
                    <h4><a class="defaultBtn" href="product_details.html">VIEW</a> <span class="pull-right">$22.00</span></h4>
                </div>
            </div>
        </li>
        <li style="border:0"> &nbsp;</li>
        <li>
            <div class="thumbnail">
                <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                <img src="<c:url value="/template/assets/img/shopping-cart-template.PNG"/>" alt="shopping cart template">
                <div class="caption">
                    <h4><a class="defaultBtn" href="product_details.html">VIEW</a> <span class="pull-right">$22.00</span></h4>
                </div>
            </div>
        </li>
        <li style="border:0"> &nbsp;</li>
        <li>
            <div class="thumbnail">
                <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                <img src="<c:url value="/template/assets/img/bootstrap-template.png"/>" alt="bootstrap template">
                <div class="caption">
                    <h4><a class="defaultBtn" href="product_details.html">VIEW</a> <span class="pull-right">$22.00</span></h4>
                </div>
            </div>
        </li>
    </ul>

</div>
<div class="span9">
    <!--
    New Products
    -->
    <div class="well well-small">
        <h3>Our Products </h3>
        <div class="row-fluid">
            <ul class="thumbnails">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/a.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/b.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/j.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="row-fluid">
            <ul class="thumbnails">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/d.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/e.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/f.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="row-fluid">
            <ul class="thumbnails">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/g.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/h.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/i.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="row-fluid">
            <ul class="thumbnails">
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/a.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/b.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
                <li class="span4">
                    <div class="thumbnail">
                        <a href="product_details.html" class="overlay"></a>
                        <a class="zoomTool" href="product_details.html" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
                        <a href="product_details.html"><img src="<c:url value="/template/assets/img/c.jpg"/>" alt=""></a>
                        <div class="caption cntr">
                            <p>Manicure & Pedicure</p>
                            <p><strong> $22.00</strong></p>
                            <h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
                            <div class="actionList">
                                <a class="pull-left" href="#">Add to Wish List </a>
                                <a class="pull-left" href="#"> Add to Compare </a>
                            </div>
                            <br class="clr">
                        </div>
                    </div>
                </li>
            </ul>
        </div>

    </div>
</div>
</body>
</html>
