<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <title>후보조회</title>
    <link href="./css/style.css" rel="stylesheet"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</head>
<body>
<header>지역구의원투표 프로그램 ver 2020-05</header>
<%@include file="common/nav.jsp"%>
<section>
    <h3>후보조회</h3>
    <table width="50%" border="solid black 1px">
        <thead>
        <th>후보번호</th>
        <th>성명</th>
        <th>소속정당</th>
        <th>학력</th>
        <th>주민번호</th>
        <th>지역구</th>
        <th>대표전화</th>
        </thead>
        <tbody>
        <c:forEach var="dto" items="${list}">
            <tr>
                <td>${dto.no}</td>
                <td>${dto.name}</td>
                <td>${dto.party}</td>
                <td>${dto.school}</td>
                <td>${dto.jumin}</td>
                <td>${dto.city}</td>
                <td>${dto.tel}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file="common/footer.jsp"%>
</body>
</html>
