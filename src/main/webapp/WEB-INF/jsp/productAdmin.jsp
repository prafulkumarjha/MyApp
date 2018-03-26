<%--
  Created by IntelliJ IDEA.
  User: praful
  Date: 23/03/18
  Time: 1:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All Products</h1>

            <p class="lead">This is the Administrator page</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/productInventory" />">Product Inventory</a>
        </h3>

        <p> Here you can view check and modify your inventory. </p>

        <%@include file="/WEB-INF/jsp/template/footer.jsp" %>
