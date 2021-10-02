<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${products}" var="pr">
        <tr>
            <td>${pr.id}</td>
            <td>${pr.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
