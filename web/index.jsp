<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
<c:forEach var="dto" items="${list}">
    <tr>
        <td>${dto.no}</td>

    </tr>
</c:forEach>
</table>
</body>
</html>
