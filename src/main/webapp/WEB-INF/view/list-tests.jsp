<%--
  Created by IntelliJ IDEA.
  User: gtfobar
  Date: 11/2/2022
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>SOSpring</title>
</head>
<body>
<h1>Available tests</h1>
<table>
    <thead>
    <tr>
        <th>TestID</th>
        <th>Title</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allTests}" var="test">
        <tr>
            <td>${test.testId}</td>
            <td>${test.title}</td>
            <td>${test.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
