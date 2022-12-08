<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-07
  Time: 오후 4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>투표하기</title>
    <style type="text/css">
        table {
            font-size: 15px;
            margin-left: 30%;
            border-collapse: collapse;

        }

        th {
            padding-left: 10px;
            padding-right: 10px;
        }

        td {
            padding: 5px;
        }

        a:link {
            color: white;
            text-decoration: none;
        }

        a:visited {
            color: white;
            text-decoration: none;
        }

        html.body {
            margin: 0;
            padding: 0;
        }

        header {
            width: 100%;
            height: 90px;
            background: black;
            text-align: center;
            font-size: 25px;
            color: white;
            padding-top: 50px;
        }

        nav {
            width: 100%;
            height: 30px;
            background: gray;
            color: white;
            font-size: 12px;
            padding-top: 10px;
        }

        section {
            width: 100%;
            height: 350px;
            background: lightgray;
            font-size: 20px;
            padding-top: 20px;
        }

        footer {
            width: 100%;
            height: 30px;
            background: black;
            text-align: center;
            color: white;
            font-size: 12px;
            padding-top: 10px;
        }
    </style>
    <script>
        function voteChecked() {
            alert("투표하기 정보가 정상적으로 등록되었습니다!")
        }

    </script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</head>
<body>
<header>지역구의원투표 프로그램 ver 2020-05</header>
<nav>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_list.do">후보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="vote_submit_view.do">투표하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="vote_list.do">투표검수조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_rank_list.do">후보자등수</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VoteMain.jsp">홈으로</a>
</nav>
<section>
    <h3 align="center">투표하기</h3>
    <form action="vote_submit.do" method="post" name="vote_submit" onsubmit="voteChecked()">
        <table width="40%" border="solid black 1px">
            <tbody>
            <tr>
                <th>
                    주민번호
                </th>
                <td>
                    <input name="V_JUMIN" type="number" size="15" required>
                    예 : 9604102123456
                </td>
            </tr>
            <tr>
                <th>
                    성명
                </th>
                <td>
                    <input name="V_NAME" type="text" size="15" required>
                </td>
            </tr>
            <tr>
                <th>투표번호</th>
                <td>
                    <select name="M_NO" size="1" required>
                        <c:forEach var="dto" items="${list}">
                            <option value="${dto.no}">${dto.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>투표시간</th>
                <td>
                    <input name="V_TIME" type="number" size="15" required>
                </td>
            </tr>
            <tr>
                <th>투표장소</th>
                <td>
                    <input type="text" name="V_AREA" required>
                </td>
            </tr>
            <tr>
                <th>유권자 확인</th>
                <td>
                    <label><input type="radio" value="Y" name="V_CONFIRM" required> 확인</label>
                    &nbsp;&nbsp;
                    <label><input type="radio" value="N" name="V_CONFIRM"> 미확인</label>
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="투표하기">
                    &nbsp;&nbsp;
                    <input type="reset" value="다시하기">
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</section>
</body>
</html>
