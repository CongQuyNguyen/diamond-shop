<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/20/2024
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
<head>
    <title>Detail of product</title>
</head>
<body>
<div class="span9">
    <ul class="breadcrumb">
        <li><a href="index.html">Home</a> <span class="divider">/</span></li>
        <li><a href="products.html">Items</a> <span class="divider">/</span></li>
        <li class="active">Preview</li>
    </ul>
    <div class="well well-small">
        <div class="row-fluid">
            <div class="span5">
                <div id="myCarousel" class="carousel slide cntr">
                    <div class="carousel-inner">
<%--                        <div class="item active">
                            <a href="#"> <img src="<c:url value="/template/assets/img/${productDetail.colors.image}"/>" alt="" style="width:100%"></a>
                        </div>
                        <div class="item">
                            <a href="#"> <img src="<c:url value="/template/assets/img/b.jpg"/>" alt="" style="width:100%"></a>
                        </div>--%>
                        <div class="item">
                            <a href="#"> <img src="<c:url value="/template/assets/img/${productDetail.colors.get(0).image}"/>" alt="" style="width:100%"></a>
                        </div>
                    </div>
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">‹</a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">›</a>
                </div>
            </div>
            <div class="span7">
                <h3>${productDetail.name} - [${productDetail.price}]</h3>
                <hr class="soft"/>

                <form class="form-horizontal qtyFrm">
                    <div class="control-group">
                        <label class="control-label"><span>Số lượng</span></label>
                        <div class="controls">
                            <input type="number" class="span6" min="0" value="0">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label"><span>Color</span></label>
                        <div class="controls">
                            <select class="span11">
                                <option>Red</option>
                                <option>Purple</option>
                                <option>Pink</option>
                                <option>Red</option>
                            </select>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label"><span>Materials</span></label>
                        <div class="controls">
                            <select class="span11">
                                <option>Material 1</option>
                                <option>Material 2</option>
                                <option>Material 3</option>
                                <option>Material 4</option>
                            </select>
                        </div>
                    </div>
                    <h4>Số lượng còn lại: ${productDetail.quantity}</h4>
                    <p>${productDetail.description}<p>
                        <button type="submit" class="shopBtn"><span class=" icon-shopping-cart"></span> Thêm vào giỏ</button>
                </form>
            </div>
        </div>
        <hr class="softn clr"/>


        <ul id="productDetail" class="nav nav-tabs">
            <li class="active"><a href="#home" data-toggle="tab">Chi tiết sản phẩm</a></li>
            <li class=""><a href="#profile" data-toggle="tab">Sản phẩm tương tự</a></li>
        </ul>
        <div id="myTabContent" class="tab-content tabWrapper">
            ${productDetail.content}
            <div class="tab-pane fade" id="profile">

                <c:set var="countList" value="${productByCategory.size()}" />
                <c:if test="${productByCategory.size() > 7}">
                    <c:set var="countList" value="7" />
                </c:if>

                <c:forEach var="item" begin="1" end="${countList}" varStatus="loop" items="${productByCategory}">
                    <div class="row-fluid">
                        <div class="span2">
                            <img src="<c:url value="/template/assets/img/${item.colors.get(0).image}"/>" alt="">
                        </div>
                        <div class="span6">
                            <h5>${item.name}</h5>
                            <p>${item.description}</p>
                        </div>
                        <div class="span4 alignR">
                            <form class="form-horizontal qtyFrm">
                                <h3> $${item.price}</h3>
                                <div class="btn-group">
                                    <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Add to cart</a>
                                    <a href="product_details.html" class="shopBtn">VIEW</a>
                                </div>
                            </form>
                        </div>
                    </div>
                    <hr class="soft">
                </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>
