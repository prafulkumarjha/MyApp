<%--
  Created by IntelliJ IDEA.
  User: praful
  Date: 25/03/18
  Time: 12:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>

            <p class="lead">Fill the below information to add a product:</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/products/admin/productInventory/addProduct" method="post"
                   modelAttribute="user" enctype="multipart/form-data">

        <div class="form-group">
            <label for="firstName">First Name</label><form:errors path="firstName" cssStyle="color: red;"></form:errors>
            <form:input path="firstName" id="firstName" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="lastName">Last Name</label><form:errors path="lastName" cssStyle="color: red;"></form:errors>
            <form:input path="lastName" id="lastName" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label><form:errors path="email" cssStyle="color: red;"></form:errors>
            <form:input path="email" id="email" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label><form:errors path="password" cssStyle="color: red;"></form:errors>
            <form:input path="password"  type="password" id="password" class="form-Control"/>
        </div>


        <input type="submit" value="Register" class="btn btn-default btn-primary">

        <a href="<c:url value="/" />" class="btn btn-default">Cancel</a>
        </form:form>



        <%@include file="/WEB-INF/jsp/template/footer.jsp" %>

