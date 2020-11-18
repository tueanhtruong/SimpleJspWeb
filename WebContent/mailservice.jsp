<%@page import="Bean.Account"%>
<%@page import="Bean.ErrorQue"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:wrapper>
    <h1 class = "container">Mail Service for account </h1>
</t:wrapper>
<div class = "container">
<%
ErrorQue aa = (ErrorQue)request.getSession().getAttribute("errque");
request.getSession().setAttribute("errque",null);
String b = (String)request.getSession().getAttribute("success");
request.getSession().setAttribute("success",null);
 %>
 <%
if(aa!=null){
	%>
	<div class="alert alert-danger">
	<p><%=aa.getErr()%></p>
	</div>
	<%
}
%>
 <%
if(b!=null){
	%>
	<div class="alert alert-success">
	<p><%=b%></p>
	</div>
	<%
}
%>
	<% Account a = (Account)request.getSession().getAttribute("account");
	System.out.println(a);
	if(a != null)
	{
	%>
	<table class = "table table-striped table-bordered table-hover">
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
	<form action="MailService" method="post">
	<tr>
	<th>Pass YourEmail:</th>
	<td colspan="3">
	<input type="password" name="pass" class="form-control" placeholder="Password for your info gmail" >
	</td>
	</tr>
	<tr>
	<th>To:</th>
	<td colspan="3">
	<input type="text" name="toAddress" class="form-control" placeholder="tueleesin@gmail.com" >
	</td>
	</tr>
	<tr>
	<th>Subject:</th>
	<td colspan="3">
	<input type="text" name="subject" class="form-control" placeholder="Java Email" >
	</td>
	</tr>
	<tr>
	<td colspan="4">
	<textarea rows="4" name="content" class="form-control" ></textarea>
	</td>
	</tr>
	<tr>
	<td colspan="4" class="text-right">
	<input type = "submit" class = "btn btn-primary" value="SEND">
		</td>
	</tr>
	</form>
	</table>
	

	<%} %>
</div>