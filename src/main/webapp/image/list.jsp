<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Image List</title>
</head>
<body>
<h1>Image List</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>src</th>
    </tr>
    <c:forEach items="${images}" var="image">
        <tr>
            <td>${image.id}</td>
            <td>${image.name}</td>
            <td><img src="${image.src}" alt="${image.name}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>