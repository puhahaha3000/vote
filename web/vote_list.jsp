<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>투표검수조회</title>
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
    <h3>투표검수조회</h3>
    <table width="50%" height="50" border="solid black 1px">
        <thead>
        <th>성명</th>
        <th>생년월일</th>
        <th>나이</th>
        <th>성별</th>
        <th>후보번호</th>
        <th>투표시간</th>
        <th>유권자확인</th>
        </thead>
        <tbody>
        <c:forEach var="dto" items="${list}">
            <tr>
                <td>${dto.name}</td>
                <td>${dto.birthDate}</td>
                <td>${dto.age}</td>
                <td>${dto.gender}</td>
                <td>${dto.memberNo}</td>
                <td>${dto.time}</td>
                <td>${dto.confirm}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</section>
<%@ include file="common/footer.jsp"%>
</body>
</html>

