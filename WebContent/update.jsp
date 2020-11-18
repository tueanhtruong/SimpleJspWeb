<%@page import="Bean.Account"%>
<%@page import="Bean.ErrorQue" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:wrapper>
	<h1 class="container">Update Page...</h1>
</t:wrapper>
<% Account a = (Account) request.getSession().getAttribute("updateU");
ErrorQue b = (ErrorQue)request.getSession().getAttribute("errque");
request.getSession().setAttribute("errque",null);
%>
<div class="container">
<%
if(b!=null){
	%>
	<div class="alert alert-danger">
	<p><%=b.getErr()%></p>
	</div>
	<%
}
%>
	<form action="UpdateUsers" method="post" >
		<div class=" form-group row">
		<label class = "col-sm-2">ID :</label>
		<input type="text" name="id" class= "form-control col-sm-10" value="<%=a.getId()%>" readonly><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">PASSWORD :</label>
		<input type="password" name="pass" class= "form-control col-sm-10" value="<%=a.getPass()%>"><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">USER NAME :</label>
		<input type="text" name="name" class= "form-control col-sm-10" value="<%=a.getName()%>"><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">INFO :</label>
		<input type="text" name="info" class= "form-control col-sm-10" value="<%=a.getInfo()%>"><br> 
		</div>
		<input type="submit" value="UPDATE" class="btn btn-primary">
	</form>
</div>
