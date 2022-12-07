<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-07
  Time: 오후 5:05
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
            width: 100%; height: 350px; background: lightgray;
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
    <a href="VOTE_SUBMIT.jsp">투표하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VOTE_LIST.jsp">투표검수조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="MEMBER_RANK_LIST.jsp">후보자등수</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VoteMain.jsp">홈으로</a>
</nav>
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
        <td>박온리</td>
        <td>1996년04월10일생</td>
        <td>만 26세</td>
        <td>여</td>
        <td>1</td>
        <td>09:30</td>
        <td>미확인</td>
        </tbody>
        <tbody>
        <td>박온리</td>
        <td>1996년04월10일생</td>
        <td>만 26세</td>
        <td>여</td>
        <td>2</td>
        <td>09:30</td>
        <td>확인</td>
        </tbody>
    </table>
</section>
<footer>HRDKOREA Copyright@2015 Allrights reserved.Human Resources Development Service od Korea</footer>
</body>
</html>
</body>
</html>
