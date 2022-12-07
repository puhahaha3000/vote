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
    <title>Insert title here</title>
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
</head>
<body>
<header>골프연습장 회원관리 프로그램 ver 1.0</header>
<nav>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_list.jsp">후보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VOTE_SUBMIT.jsp">투표하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VOTE_LIST.jsp">투표검수조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="MEMBER_RANK_LIST.jsp">후보자등수</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VoteMain.jsp">홈으로</a>
</nav>
<section>
    <h3 align="center">투표하기</h3>
    <table width="40%" border="solid black 1px">
        <tbody>
        <tr>
            <th>
                주민번호
            </th>
            <td>
                <input type="text" size="15">
                예 : 9604102123456
            </td>
        </tr>
        <tr>
            <th>
                성명
            </th>
            <td>
                <input type="text" size="15">
            </td>
        </tr>
        <tr>
            <th>투표번호</th>
            <td>
                <form action="">
                    <select name="num" size="1">
                        <option value="num0"></option>
                        <option value="num1">투표번호</option>
                    </select>
                </form>
            </td>
        </tr>
        <tr>
            <th>투표시간</th>
            <td>
                <input type="text" size="15">
            </td>
        </tr>
        </tbody>
    </table>
</section>
</body>
</html>
