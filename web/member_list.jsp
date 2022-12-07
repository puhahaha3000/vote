<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-07
  Time: 오후 4:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        table{
            text-align: center;
            font-size: 15px;
            margin-left: 25%;
            border-collapse: collapse;
        }
        td{
            padding: 5px;
        }
        th{
            padding: 5px;
        }
        a:link{
            color: white;
            text-decoration: none;
        }
        a:visited{
            color: white;
            text-decoration: none;
        }
        html.body{
            margin: 0; padding: 0;
        }
        header{
            width: 100%; height: 90px; background: black;
            text-align: center;font-size: 25px; color: white;
            padding-top: 50px;
        }
        nav{
            width: 100%; height: 30px; background: gray;
            color: white;font-size: 12px;
            padding-top: 10px;
        }
        section{
            width: 100%; background: lightgray;
            text-align: center;font-size: 20px;
            padding-top: 20px;
        }
        footer{
            width: 100%; height: 30px; background: black;
            text-align: center;color: white;font-size: 12px;
            padding-top: 10px;
        }
    </style>
</head>
<body>
<header>골프연습장 회원관리 프로그램 ver 1.0</header>
<nav>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_list.jsp">후보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="vote_submit_view.jsp">투표하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="vote_list.jsp">투표검수조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_rank_list.jsp">후보자등수</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VoteMain.jsp">홈으로</a>
</nav>
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
<footer>HRDKOREA Copyright@2015 Allrights reserved.Human Resources Development Service od Korea</footer>
</body>
</html>

</body>
</html>
