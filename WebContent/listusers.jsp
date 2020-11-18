<%@page import="java.util.ArrayList"%>
<%@page import="Bean.dataQ"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/XXX.css" />

<t:wrapper>
	<h1 class="container">Welcome</h1>
</t:wrapper>
<%
	dataQ a = (dataQ) request.getAttribute("dataUsers");
//System.out.println(request.getAttribute("dataUsers"));
%>
<table class="container table table-striped table-bordered table-hover">
	<tr>
		<%
			String[] nn = a.data.get(0).split("  ");
		for (int i = 0; i < nn.length; i++) {
		%>
		<th><%=nn[i].toUpperCase()%></th>
		<%
			}
		%>
		<th>UPDATE</th>
		<th>DELETE</th>
	</tr>
	<%
		for (int i = 1; i < a.data.size(); i++) {
		nn = a.data.get(i).split("  ");
	%>
	<tr>
		<%
			for (int j = 0; j < nn.length; j++) {
		%>
		<td><%=nn[j]%></td>
		<%
			}
		%>
		<td><a class="btn btn-success" href="UpdateUsers?id=<%=nn[0]%>"> <svg width="2em"
					height="2em" viewBox="0 0 16 16" class="bi bi-pencil-square"
					fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path
						d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z" />
  <path fill-rule="evenodd"
						d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z" />
</svg>
		</a></td>
		<td><a class="btn btn-danger" href="DelUsers?id=<%=nn[0]%>"> <svg width="2em"
					height="2em" viewBox="0 0 16 16" class="bi bi-person-x-fill"
					fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
						d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm6.146-2.854a.5.5 0 0 1 .708 0L14 6.293l1.146-1.147a.5.5 0 0 1 .708.708L14.707 7l1.147 1.146a.5.5 0 0 1-.708.708L14 7.707l-1.146 1.147a.5.5 0 0 1-.708-.708L13.293 7l-1.147-1.146a.5.5 0 0 1 0-.708z" />
</svg>
		</a></td>
	</tr>
	<%
		}
	%>
</table>

