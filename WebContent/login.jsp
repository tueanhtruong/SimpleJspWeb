<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:wrapper>
    <h1 class = "container">LOGIN</h1>
</t:wrapper>
<div class="container">
	<form action="CheckLoginServerlet" method="post" >
		<div class=" form-group row">
		<input type="text" name="id" class= "form-control" placeholder="ID"><br> 
		</div>
		<div class=" form-group row">
		<input type="password" name="pass" class= "form-control" placeholder="PASSWORD"><br> 
		</div>
		<input type="submit" value="LOGIN" class="btn btn-primary">
	</form>
</div>
