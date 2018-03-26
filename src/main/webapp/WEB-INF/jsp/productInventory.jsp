<%--
  Created by IntelliJ IDEA.
  User: praful
  Date: 23/03/18
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All Products</h1>

            <p class="lead">Checkout all the awesome products available now!</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo Thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th></th>

            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/images/${product.productCode}.png" />" alt="image" style="width:100%;height: 50px;"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} USD</td>
                    <td><a href="<spring:url value="/products/admin/productInventory/${product.productCode}" />"
                    ><span class="glyphicon glyphicon-info-sign"></span></a>
                    <a href="<spring:url value="/products/admin/productInventory/deleteProduct/${product.productCode}"  />"
                    ><span class="glyphicon glyphicon-remove-sign"></span></a>
                    <a href="<spring:url value="/products/admin/productInventory/editProduct/${product.productCode}"  />"
                    ><span class="glyphicon glyphicon-edit"></span></a></td>

                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/productInventory/addProduct"/>" class="btn btn-primary">Add Product</a>

        <%@include file="/WEB-INF/jsp/template/footer.jsp" %>

