<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
    <title>List products</title>
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
    <div class="well well-small">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/a.jpg"/> "alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/b.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/c.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/d.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/e.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/f.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/g.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/h.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/i.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/j.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
        <hr class="soften">
        <div class="row-fluid">
            <div class="span2">
                <img src="<c:url value="/template/assets/img/f.jpg"/> " alt="">
            </div>
            <div class="span6">
                <h5>Product Name </h5>
                <p>
                    Nowadays the lingerie industry is one of the most successful business spheres.
                    We always stay in touch with the latest fashion tendencies -
                    that is why our goods are so popular..
                </p>
            </div>
            <div class="span4 alignR">
                <form class="form-horizontal qtyFrm">
                    <h3> $140.00</h3>
                    <label class="checkbox">
                        <input type="checkbox">  Adds product to compair
                    </label><br>
                    <div class="btn-group">
                        <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                        <a href="product_details.html" class="shopBtn">VIEW</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
