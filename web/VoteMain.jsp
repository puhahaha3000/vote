<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-07
  Time: 오후 5:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
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
            width: 100%; height: 90px;
            background: black; text-align: center;
            font-size: 25px; color: white;
            padding-top: 50px;
        }
        nav{
            width: 100%; height: 30px; background: gray;
            color: white;font-size: 12px;padding-top: 10px;
        }
        section{
            width: 100%; height: 350px;
            background: lightgray;text-align: center;
            font-size: 20px; padding-top: 20px;
        }
        footer{
            width: 100%; height: 30px; background: black;
            text-align: center;color: white;font-size: 12px;
            padding-top: 10px;
        }
        p{
            text-align: left;
            font-size: 20px;
            padding-left: 20px;
        }
    </style>
</head>
<body>
<header>지역구의원투표 프로그램 ver 2020-05</header>
<nav>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href= "member_list.jsp">후보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href= "vote_submit_view.jsp">투표하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="vote_list.jsp">투표검수조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="member_rank_list.jsp">후보자등수</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="VoteMain.jsp">홈으로</a>
</nav>
<section>
    <h3>과정평가형 자격 CBQ</h3>
    <p>무언가의 내용이 들어있음</p>
    <p>
        내용<br>
        내용<br>
        내용<br>
        내용<br>
    </p>
</section>
<footer>HRDKOREA Copyright@2015 Allrights reserved.Human Resources Development Service od Korea</footer>
</body>
</html>
