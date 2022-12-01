<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="edu.global.vote.dao.VoteDao" %>
<%@ page import="edu.global.vote.dto.VoteDto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.global.vote.dao.PartyDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    VoteDao voteDao = new VoteDao();
    ArrayList<?> voteDtoArrayList = voteDao.getDtoList();

    PartyDao partyDao = new PartyDao();
    ArrayList<?> partyDtoArrayList = partyDao.getDtoList();

    session.setAttribute("voteList", voteDtoArrayList);
    session.setAttribute("partyList", partyDtoArrayList);
%>
<h1>Vote List</h1>
<c:forEach var="vote" items="${voteList}">
    ${vote}<br>
</c:forEach>

<h1>Party List</h1>
<c:forEach var="party" items="${partyList}">
    ${party}<br>
</c:forEach>

</body>
</html>
