<%@page import="Bean.ErrorQue"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:wrapper>
	<h1 class="container">Insert Page</h1>
</t:wrapper>
<%
ErrorQue a = (ErrorQue)request.getSession().getAttribute("errque");
request.getSession().setAttribute("errque",null);
 %>
<div class="container">
<%
if(a!=null){
	System.out.println(a);
	%>
	<div class="alert alert-danger">
	<p><%=a.getErr()%></p>
	</div>
	<%
}
%>
	<form action="CALInsertUsers" method="post" >
		<div class=" form-group row">
		<label class = "col-sm-2">ID :</label>
		<input type="text" name="id" class= "form-control col-sm-10" placeholder="ID"><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">PASSWORD :</label>
		<input type="password" name="pass" class= "form-control col-sm-10" placeholder="PASSWORD"><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">USER NAME :</label>
		<input type="text" name="name" class= "form-control col-sm-10" placeholder="USER NAME"><br> 
		</div>
		
		<div class=" form-group row">
		<label class = "col-sm-2">INFO :</label>
		<input type="text" name="info" class= "form-control col-sm-10" placeholder="INFORMATION"><br> 
		</div>
		<input type="submit" value="INSERT" class="btn btn-primary">
	</form>
</div>