<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="edu.global.vote.dao.VoteDao" %>
<%@ page import="edu.global.vote.dto.VoteDto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.global.vote.dao.PartyDao" %>
<%@ page import="edu.global.vote.dto.PartyDto" %>
<%@ page import="edu.global.vote.dao.MemberDao" %>
<%@ page import="edu.global.vote.dto.MemberDto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    VoteDao voteDao = new VoteDao();
    ArrayList<VoteDto> voteDtoArrayList = voteDao.getList();
    PartyDao partyDao = new PartyDao();
    ArrayList<PartyDto> partyDtoArrayList = partyDao.getList();
    MemberDao memberDao = new MemberDao();
    ArrayList<MemberDto> memberDtoArrayList = memberDao.getList();

    session.setAttribute("voteList", voteDtoArrayList);
    session.setAttribute("partyList", partyDtoArrayList);
    session.setAttribute("memberList", memberDtoArrayList);
%>
<h1>Vote List</h1>
<c:forEach var="vote" items="${voteList}">
    ${vote}<br>
</c:forEach>

<h1>Party List</h1>
<c:forEach var="party" items="${partyList}">
    ${party}<br>
</c:forEach>

<h1>Member List</h1>
<c:forEach var="member" items="${memberList}">
    ${member}<br>
</c:forEach>
</body>
</html>
