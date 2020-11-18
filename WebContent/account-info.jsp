<%@page import="Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:wrapper>
    <h1 class = "container">Information account ...</h1>
</t:wrapper>
<div class = "container">
	<% Account a = (Account)request.getSession().getAttribute("account");
	System.out.println(a);
	if(a != null)
	{
	%>
	<table class = "container table table-striped table-bordered table-hover">
	<tr>
	<th>ID</th>
	<th>PASS</th>
	<th>USERNAME</th>
	<th>INFO</th>
	</tr>
	<tr>
	<td><%=a.getId() %></td>
	<td><%=a.getPass() %></td>
	<td><%=a.getName() %></td>
	<td><%=a.getInfo() %></td>
	</tr>
	</table>
	<a href = "ListUsers"><button class = "btn btn-success">List User</button></a>
	<%} %>
</div>