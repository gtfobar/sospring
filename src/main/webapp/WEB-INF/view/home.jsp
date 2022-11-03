<%--
  Created by IntelliJ IDEA.
  User: gtfobar
  Date: 11/3/2022
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>SOSpring</title>
</head>
<body>
<h1>Welcome!</h1>
<c:choose>
    <c:when test="${empty principal}">
        <div><a href="${pageContext.request.contextPath}/auth/login">Login</a></div>
    </c:when>
    <c:otherwise>
        <div><a href="${pageContext.request.contextPath}/auth/logout">Logout</a></div>
    </c:otherwise>
</c:choose>
    <div><a href="${pageContext.request.contextPath}/test/list">Show all tests</a></div>
    <div><a href="${pageContext.request.contextPath}/test/create">Create a test</a></div>
</body>
</html>
